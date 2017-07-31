package com.hq.dbf.BaseWeb.restful.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.hq.dbf.BaseDomain.entity.HelloWorld;
import com.hq.dbf.BaseDomain.provider.IHelloWorldProvider;
import com.hq.dbf.BaseDomain.provider.base.IBaseProvider;
import com.hq.dbf.BaseWeb.restful.IHelloWorldRestService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;

import javax.ws.rs.Path;

/**
 * Created by Administrator on 7/28/2017.
 */
@Path("helloworld")
@Controller
@Slf4j
public class HelloWorldRestServiceImpl extends BaseRestServiceImpl<HelloWorld> implements IHelloWorldRestService {

    @Override
    public IBaseProvider<HelloWorld> getProvider() {
        return helloWorldProvider;
    }

    @Reference
    private IHelloWorldProvider helloWorldProvider;

    @Override
    public String helloWorld() {
        System.out.println("helloWorldProvider:" + helloWorldProvider);
        JSONObject json = new JSONObject();
        json.put("message", helloWorldProvider.hi("ZhangSan"));

        return JSON.toJSONString(json);
    }
}
