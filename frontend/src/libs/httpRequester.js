import axios from "axios";

const instance = axios.create();

instance.interceptors.response.use((res) => {
    return res;
}, async (err) => {
    switch (err.response.status) {
        case 400:
            window.alert("잘못된 요청")
            break;

        case 401:
            window.alert("권한 없음")
            window.location.replace("/");
            break;

        case 500:
            window.alert("오류 발생 관리자에게 문의하세요")
            break;
    }

    return Promise.reject(err);
});

export default {
    get(url, params) {
        return instance.get(url, {params});
    },

    post(url, params) {
        return instance.post(url, params);
    },

    put(url, params) {
        return instance.put(url, params);
    },

    delete(url) {
        return instance.delete(url);
    }
};