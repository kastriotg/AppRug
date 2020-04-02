package com.shije.bookshop.Woocommerce.Constants;

public class OAuthSignatureException extends OAuthException {
    private static final long serialVersionUID = 1L;
    private static final String MSG = "Error while signing string: %s";


    public OAuthSignatureException(String stringToSign, Exception e)
    {
        super(String.format(MSG, stringToSign), e);
    }
}
