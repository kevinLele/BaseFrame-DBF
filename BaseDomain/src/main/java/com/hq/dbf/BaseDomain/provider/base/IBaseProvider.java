package com.hq.dbf.BaseDomain.provider.base;


import com.hq.dbf.BaseDomain.entity.base.Page;
import com.hq.dbf.BaseDomain.entity.base.SerializableEntity;
import com.hq.dbf.BaseDomain.exception.ProviderException;

import java.util.List;
import java.util.Map;

/**
 * provider抽象接口,所有provider的接口都需要继承
 *
 * @param <Entity>
 */
public interface IBaseProvider<Entity extends SerializableEntity> {

    String save(Entity entity) throws ProviderException;

    boolean update(Entity entity) throws ProviderException;

    boolean batchUpdate(Entity entity, List<String> idList) throws ProviderException;

    boolean deleteById(String id) throws ProviderException;

    boolean deleteByWhere(Map<String, Object> map) throws ProviderException;

    boolean logicDeleteById(String id) throws ProviderException;

    boolean batchDelete(List<String> idList) throws ProviderException;

    boolean logicBatchDelete(List<String> idList) throws ProviderException;

    Entity findById(String id) throws ProviderException;

    Entity findByName(String name) throws ProviderException;

    List<Entity> findAll() throws ProviderException;

    List<Entity> findByMap(Map<String, Object> map, String mapperFunc) throws ProviderException;

    List<Entity> findByMap(Map<String, Object> map) throws ProviderException;

    Page findByPage(Page<Entity> page, String countMapperFunc, String pageMapperFunc) throws ProviderException;

    Page findByPage(Page<Entity> page) throws ProviderException;
}
