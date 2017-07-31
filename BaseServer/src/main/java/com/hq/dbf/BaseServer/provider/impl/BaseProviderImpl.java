package com.hq.dbf.BaseServer.provider.impl;

import com.hq.dbf.BaseDomain.entity.base.Page;
import com.hq.dbf.BaseDomain.entity.base.SerializableEntity;
import com.hq.dbf.BaseDomain.exception.ProviderException;
import com.hq.dbf.BaseDomain.exception.ServiceException;
import com.hq.dbf.BaseDomain.provider.base.IBaseProvider;
import com.hq.dbf.BaseServer.service.IBaseService;
import lombok.extern.slf4j.Slf4j;

import java.util.List;
import java.util.Map;

@Slf4j
public abstract class BaseProviderImpl<Entity extends SerializableEntity> implements IBaseProvider<Entity> {

    /**
     * 抽象方法需要实现,得到基础服务接口
     *
     * @return
     */
    public abstract IBaseService<Entity> getBaseService();

    @Override
    public String save(Entity entity) throws ProviderException {
        String id;

        try {
            id = this.getBaseService().save(entity);
        } catch (ServiceException e) {
            log.error("BaseProviderImpl save ", e);
            throw new ProviderException(e.getMessage(), e);
        }

        return id;
    }

    @Override
    public boolean update(Entity entity) throws ProviderException {
        boolean flag;

        try {
            flag = this.getBaseService().update(entity);
        } catch (ServiceException e) {
            log.error("BaseProviderImpl update ", e);
            throw new ProviderException(e.getMessage(), e);
        }

        return flag;
    }

    @Override
    public boolean batchUpdate(Entity entity, List<String> idList) throws ProviderException {
        boolean flag;

        try {
            flag = this.getBaseService().batchUpdate(entity, idList);
        } catch (ServiceException e) {
            log.error("BaseProviderImpl batchUpdate ", e);
            throw new ProviderException(e.getMessage(), e);
        }

        return flag;
    }

    @Override
    public boolean deleteById(String id) throws ProviderException {
        boolean flag;

        try {
            flag = this.getBaseService().deleteById(id);
        } catch (ServiceException e) {
            log.error("BaseProviderImpl deleteById ", e);
            throw new ProviderException(e.getMessage(), e);
        }

        return flag;
    }

    @Override
    public boolean deleteByWhere(Map<String, Object> map) throws ProviderException {
        boolean flag;

        try {
            flag = this.getBaseService().deleteByWhere(map);
        } catch (ServiceException e) {
            log.error("BaseProviderImpl deleteByWhere ", e);
            throw new ProviderException(e.getMessage(), e);
        }

        return flag;
    }

    @Override
    public boolean logicDeleteById(String id) throws ProviderException {
        boolean flag;

        try {
            flag = this.getBaseService().logicDeleteById(id);
        } catch (ServiceException e) {
            log.error("BaseProviderImpl logicDeleteById ", e);
            throw new ProviderException(e.getMessage(), e);
        }

        return flag;
    }

    @Override
    public boolean batchDelete(List<String> idList) throws ProviderException {
        boolean flag;

        try {
            flag = this.getBaseService().batchDelete(idList);
        } catch (ServiceException e) {
            log.error("BaseProviderImpl batchDelete ", e);
            throw new ProviderException(e.getMessage(), e);
        }

        return flag;
    }

    @Override
    public boolean logicBatchDelete(List<String> idList) throws ProviderException {
        boolean flag;

        try {
            flag = this.getBaseService().logicBatchDelete(idList);
        } catch (ServiceException e) {
            log.error("BaseProviderImpl logicBatchDelete ", e);
            throw new ProviderException(e.getMessage(), e);
        }

        return flag;
    }

    @Override
    public Entity findById(String id) throws ProviderException {
        Entity entity;

        try {
            entity = this.getBaseService().findById(id);
        } catch (ServiceException e) {
            log.error("BaseProviderImpl findById ", e);
            throw new ProviderException(e.getMessage(), e);
        }

        return entity;
    }

    @Override
    public Entity findByName(String name) throws ProviderException {
        Entity entity;

        try {
            entity = this.getBaseService().findByName(name);
        } catch (ServiceException e) {
            log.error("BaseProviderImpl findByName ", e);
            throw new ProviderException(e.getMessage(), e);
        }

        return entity;
    }

    @Override
    public List<Entity> findAll() throws ProviderException {
        List<Entity> list;

        try {
            list = this.getBaseService().findAll();
        } catch (ServiceException e) {
            log.error("BaseProviderImpl findAll ", e);
            throw new ProviderException(e.getMessage(), e);
        }

        return list;
    }

    @Override
    public List<Entity> findByMap(Map<String, Object> map, String mapperFunc) throws ProviderException {
        List<Entity> list;

        try {
            list = this.getBaseService().findByMap(map, mapperFunc);
        } catch (ServiceException e) {
            log.error("DubboBaseInterfaceImpl findByMap", e);
            throw new ProviderException(e.getMessage(), e);
        }

        return list;
    }

    @Override
    public List<Entity> findByMap(Map<String, Object> map) throws ProviderException {
        List<Entity> list;

        try {
            list = this.getBaseService().findByMap(map);
        } catch (ServiceException e) {
            log.error("DubboBaseInterfaceImpl findByMap", e);
            throw new ProviderException(e.getMessage(), e);
        }

        return list;
    }

    @Override
    public Page findByPage(Page<Entity> page, String countMapperFunc, String pageMapperFunc) throws ProviderException {
        Page pageLoad;

        try {
            pageLoad = this.getBaseService().findByPage(page, countMapperFunc, pageMapperFunc);
        } catch (ServiceException e) {
            log.error("BaseProviderImpl findByPage ", e);
            throw new ProviderException(e.getMessage(), e);
        }

        return pageLoad;
    }

    @Override
    public Page findByPage(Page<Entity> page) throws ProviderException {
        Page pageLoad;

        try {
            pageLoad = this.getBaseService().findByPage(page);
        } catch (ServiceException e) {
            log.error("BaseProviderImpl findByPage ", e);
            throw new ProviderException(e.getMessage(), e);
        }

        return pageLoad;
    }
}
