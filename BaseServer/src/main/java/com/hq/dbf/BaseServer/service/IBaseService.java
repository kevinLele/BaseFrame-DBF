package com.hq.dbf.BaseServer.service;

import com.hq.dbf.BaseDomain.entity.base.Page;
import com.hq.dbf.BaseDomain.entity.base.SerializableEntity;
import com.hq.dbf.BaseDomain.exception.ServiceException;

import java.util.List;
import java.util.Map;

public interface IBaseService<Entity extends SerializableEntity> {

    String save(Entity entity) throws ServiceException;

    boolean update(Entity entity) throws ServiceException;

    boolean batchUpdate(Entity entity, List<String> idList) throws ServiceException;

    boolean deleteById(String id) throws ServiceException;

    boolean deleteByWhere(Map<String, Object> map) throws ServiceException;

    boolean logicDeleteById(String id) throws ServiceException;

    boolean batchDelete(List<String> idList) throws ServiceException;

    boolean logicBatchDelete(List<String> idList) throws ServiceException;

    Entity findById(String id) throws ServiceException;

    Entity findByName(String name) throws ServiceException;

    List<Entity> findAll() throws ServiceException;

    List<Entity> findByMap(Map<String, Object> map, String mapperFunc) throws ServiceException;

    List<Entity> findByMap(Map<String, Object> map) throws ServiceException;

    Page findByPage(Page<Entity> page, String countMapperFunc, String pageMapperFunc) throws ServiceException;

    Page findByPage(Page<Entity> page) throws ServiceException;
}
