import httpRequester from "@/libs/httpRequester.js";

export const getItems = () => {
    return httpRequester.get("/v1/api/cart/items").catch(e => e.response);
};

export const addItem = (itemId) => {
    return httpRequester.post("/v1/api/carts", {itemId}).catch(e => e.response);
};

export const removeItem = (itemId) => {
    return httpRequester.delete(`/v1/api/cart/items/${itemId}`).catch(e => e.response);
};


