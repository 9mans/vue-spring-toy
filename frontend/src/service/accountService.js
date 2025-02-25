import httpRequester from "@/libs/httpRequester.js";

export const join = (args) => {
    return httpRequester.post("/v1/api/account/join", args).catch(e => e.response);
};

export const login = (args) => {
    return httpRequester.post("/v1/api/account/login", args).catch(e => e.response);
};

export const check = () => {
    return httpRequester.get("/v1/api/account/check").catch(e => e.response);
};

export const logout = () => {
    return httpRequester.post("/v1/api/account/logout").catch(e => e.response);
};

