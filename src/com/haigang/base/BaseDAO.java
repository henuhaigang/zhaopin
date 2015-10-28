package com.haigang.base;

import java.util.List;


public interface BaseDAO<T> {

	/**
	 * 保存实体
	 * 
	 * @param entity
	 */
	void save(T entity);

	/**
	 * 删除实体
	 * 
	 * @param id
	 */
	void delete(Long id);

	/**
	 * 更新实体
	 * 
	 * @param entity
	 */
	void update(T entity);

	/**
	 * 查询实体，如果id为null，则返回null，并不会抛异常。
	 * 
	 * @param id
	 * @return
	 */
	T getById(Long id);

	

	/**
	 * 查询所有
	 * 
	 * @return
	 */
	List<T> findAll();

	
}
