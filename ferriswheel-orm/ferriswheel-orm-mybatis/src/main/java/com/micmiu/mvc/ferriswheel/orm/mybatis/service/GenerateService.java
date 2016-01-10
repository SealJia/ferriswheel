package com.micmiu.mvc.ferriswheel.orm.mybatis.service;

import java.io.Serializable;

/**
 * Created
 * User: <a href="http://micmiu.com">micmiu</a>
 * Date: 12/15/2015
 * Time: 16:40
 */
public interface GenerateService<T, ID extends Serializable> {

	int deleteByPrimaryKey(ID id);

	int insert(T record);

	int insertSelective(T record);

	T selectByPrimaryKey(ID id);

	int updateByPrimaryKeySelective(T record);

	int updateByPrimaryKeyWithBLOBs(T record);

	int updateByPrimaryKey(T record);
}