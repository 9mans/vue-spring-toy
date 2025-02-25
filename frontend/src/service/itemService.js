import httpRequester from "@/libs/httpRequester.js";
export const getItems = () => {
    return httpRequester.get("/v1/api/items").catch(e => e.response);
};