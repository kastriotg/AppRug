package com.shije.bookshop.Woocommerce.Services;

public interface TimestampService {
    public String getTimestampInSeconds();

    /**
     * Returns a nonce (unique value for each request)
     *
     * @return nonce
     */
    public String getNonce();
}
