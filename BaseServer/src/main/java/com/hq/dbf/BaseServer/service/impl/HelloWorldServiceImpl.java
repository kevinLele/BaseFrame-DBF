package com.hq.dbf.BaseServer.service.impl;

import com.hq.dbf.BaseDomain.entity.HelloWorld;
import com.hq.dbf.BaseServer.mapper.BaseMapper;
import com.hq.dbf.BaseServer.mapper.HelloWorldMapper;
import com.hq.dbf.BaseServer.service.IHelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class HelloWorldServiceImpl extends BaseServiceImpl<HelloWorld> implements IHelloWorldService {

    @Autowired
    @Qualifier("helloWorldMapper")
    private HelloWorldMapper helloWorldMapper;

    /**
     * 获取获取DAO
     *
     * @return
     */
    @Override
    public BaseMapper<HelloWorld> getBaseMapper() {
        return helloWorldMapper;
    }
}
