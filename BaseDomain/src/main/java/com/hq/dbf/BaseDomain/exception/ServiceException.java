package com.hq.dbf.BaseDomain.exception;

public class ServiceException extends Exception {

    private static final long serialVersionUID = 9117528120336416013L;

    public ServiceException(Exception e) {
        super(e);
    }

    public ServiceException(String msg, Exception e) {
        super(msg, e);
    }

    public ServiceException(String msg) {
        super(msg);
    }
}
