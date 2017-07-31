package com.hq.dbf.BaseWeb.restful;

import com.hq.dbf.BaseWeb.sys.Constants;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

/**
 * Created by Administrator on 7/28/2017.
 */
public interface IHelloWorldRestService extends IBaseRestService {

    @GET
    @Path("helloWorld")
    @Produces(Constants.MediaType.APPLICATION_JSON)
    String helloWorld();
}
