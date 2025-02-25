import httpRequester from "@/libs/httpRequester.js";
export const addOrder = (args) => {
    return httpRequester.post("/v1/api/orders", args).catch(e => e.response);
};

export const getOrders = (args) => {
    return httpRequester.get("/v1/api/orders", args).catch(e => e.response);
};

export const getOrder = (id) => {
    return httpRequester.get(`/v1/api/orders/${id}`).catch(e => e.response);
};