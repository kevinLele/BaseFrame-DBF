package com.hq.dbf.BaseDomain.exception;

public class ProviderException extends Exception {

    private static final long serialVersionUID = -5211255595553426876L;

    public ProviderException(Exception e) {
        super(e);
    }

    public ProviderException(String msg, Exception e) {
        super(msg, e);
    }

    public ProviderException(String msg) {
        super(msg);
    }
}
