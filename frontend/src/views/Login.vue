<script setup>

import {reactive} from "vue";
import {useRouter} from "vue-router";
import {login} from "@/service/accountService.js";
import {useAccountStore} from "@/stores/account.js";

const state = reactive({

  form: {
    loginId: "",
    loginPw: "",
  }
});

const accountStore = useAccountStore();
const router = useRouter();

const submit = async () => {
  const res = await login(state.form);

  switch (res.status) {
    case 200:
      accountStore.setAccessToken(res.data);
      await router.push("/");
      break;

    case 404:
      window.alert("등록되지 않은 회원입니다.");
      break;
  }
};
</script>

<template>
  <div class="login">
    <div class="container">
      <form class="py-5 d-flex flex-column gap-3" @submit.prevent="submit">
        <h1 class="h5 mb-3">로그인</h1>
        <div class="form-floating">
          <input type="email" class="form-control" id="loginId" placeholder="이메일" v-model="state.form.loginId">
          <label for="loginId">이메일</label>
        </div>
        <div class="form-floating">
          <input type="password" class="form-control" id="loginPw" placeholder="패스워드" v-model="state.form.loginPw">
          <label for="loginPw">비밀번호</label>
        </div>
        <button type="submit" class="w-100 h6 btn py-3 btn-primary">로그인</button>
      </form>
    </div>
  </div>
</template>

<style lang="scss" scoped>
.login > .container {
  max-width: 576px;
}
</style>