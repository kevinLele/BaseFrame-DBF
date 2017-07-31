package com.hq.dbf.BaseWeb.sys;


import com.hq.dbf.BaseWeb.utils.restful.WebTargetProvider;

import javax.ws.rs.client.WebTarget;

/**
 * Created by Administrator on 7/10/2017.
 */
public class SysUtils {

    public static WebTarget getCAWebTarget() {
        WebTarget client = WebTargetProvider.getWebResource(Constants.CA.IP,
                Constants.CA.PORT, Constants.CA.SERVER);

        return client;
    }
}
