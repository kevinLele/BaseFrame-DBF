package com.hq.dbf.BaseServer.service;

import com.alibaba.fastjson.JSONObject;

public interface IDictionaryService {

    JSONObject getDictionaryByCode(String parentCode, String code);
}
