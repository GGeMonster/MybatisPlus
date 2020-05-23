package com.mybatisPlus.mp.metaObjectHandler;

import org.apache.ibatis.reflection.MetaObject;

import com.baomidou.mybatisplus.mapper.MetaObjectHandler;

/** 
* @author 作者 : BJQ
* @version 创建时间：2020年5月22日 下午11:39:51 
*
* 说明
*/
public class MyMetaObjectHandler extends MetaObjectHandler {
	
	/**
	 * 插入操作 自动填充
	 */
	@Override
	public void insertFill(MetaObject metaObject) {
		//获取到需要被填充的字段的值
		Object fieldValue = getFieldValByName("name", metaObject);
		if(fieldValue == null) {
			System.out.println("*******插入操作 满足填充条件*********");
			setFieldValByName("name", "BJQ", metaObject);
		}
		
	}
	/**
	 * 修改操作 自动填充
	 */
	@Override
	public void updateFill(MetaObject metaObject) {
		Object fieldValue = getFieldValByName("name", metaObject);
		if(fieldValue == null) {
			System.out.println("*******修改操作 满足填充条件*********");
			setFieldValByName("name", "BJQ", metaObject);
		}
	}

}