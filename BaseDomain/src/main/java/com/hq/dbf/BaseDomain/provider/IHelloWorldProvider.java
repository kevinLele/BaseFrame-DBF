package com.hq.dbf.BaseDomain.provider;

import com.hq.dbf.BaseDomain.entity.HelloWorld;
import com.hq.dbf.BaseDomain.provider.base.IBaseProvider;

import java.security.ProviderException;

public interface IHelloWorldProvider extends IBaseProvider<HelloWorld> {

    String hi(String name) throws ProviderException;
}
