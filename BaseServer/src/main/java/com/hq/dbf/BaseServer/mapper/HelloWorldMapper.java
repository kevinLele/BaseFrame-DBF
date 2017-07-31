package com.hq.dbf.BaseServer.mapper;

import com.hq.dbf.BaseDomain.entity.HelloWorld;
import org.springframework.stereotype.Repository;

@Repository("helloWorldMapper")
public interface HelloWorldMapper extends BaseMapper<HelloWorld> {

}
