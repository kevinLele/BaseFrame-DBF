package com.hq.dbf.BaseServer.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.hq.dbf.BaseServer.sys.Constants;
import com.hq.dbf.BaseServer.service.IDictionaryService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service("dictionaryService")
@Slf4j
public class DictionaryServiceImpl implements IDictionaryService {


    @Cacheable(value = Constants.Caches.DICTIONARY_CACHE,
            key = "'dic_' + #parentCode + '_' + #code")
    @Override
    public JSONObject getDictionaryByCode(String parentCode, String code) {
        // 该方法只是用于声明从缓存获取数据字典信息, 所以直接返回null即可
        // 调用该方法所返回的结果为空说明没有在缓存服务器找到相应的信息
        StringBuffer msg = new StringBuffer();
        msg.append("未找到Parent Code为[").append(parentCode).append("]");
        msg.append("Dict Code为[").append(code).append("]").append("的数据字典信息");
        log.warn(msg.toString());

        return null;
    }
}
