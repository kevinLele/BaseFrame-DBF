package com.hq.dbf.BaseWeb.sys;

import com.hq.dbf.BaseWeb.utils.ConfigHelper;

/**
 * Created by Administrator on 7/27/2017.
 */
public interface Constants {

    String SESSION_KEY_USER = "SESSION_USER";

    interface CA {

        String IP = ConfigHelper.getValue("ca.ip");

        String PORT = ConfigHelper.getValue("ca.port");

        String SERVER = ConfigHelper.getValue("ca.server");
    }

    interface MediaType {

        String APPLICATION_JSON = javax.ws.rs.core.MediaType.APPLICATION_JSON
                + ";charset=utf-8";

    }

    /**
     * Restful 对外的静态变量
     */
    interface JsonView {

        /**
         * 成功
         */
        String STATUS_SUCCESS = "success";

        /**
         * 失败
         */
        String STATUS_FAIL = "fail";

        /**
         * 未认证（即未登陆系统）
         */
        String UNAUTHENTICATED = "unauthenticated";

        /**
         * 未授权(即登陆成功但没有相关操作权限)
         */
        String UNAUTHORIZED = "unauthorized";

    }
}
