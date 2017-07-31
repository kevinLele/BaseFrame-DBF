package com.hq.dbf.BaseServer.provider.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.hq.dbf.BaseDomain.entity.HelloWorld;
import com.hq.dbf.BaseDomain.provider.IHelloWorldProvider;
import com.hq.dbf.BaseServer.service.IBaseService;
import com.hq.dbf.BaseServer.service.IHelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;

import java.security.ProviderException;

@Service
public class HelloWorldProviderImpl extends BaseProviderImpl<HelloWorld> implements IHelloWorldProvider {

    @Autowired
    private IHelloWorldService helloWorldService;

    /**
     * 抽象方法需要实现,得到基础服务接口
     *
     * @return
     */
    @Override
    public IBaseService<HelloWorld> getBaseService() {
        return helloWorldService;
    }

    @Override
    public String hi(String name) throws ProviderException {
        return "Hi " + name + ", Hello World!";
    }
}
