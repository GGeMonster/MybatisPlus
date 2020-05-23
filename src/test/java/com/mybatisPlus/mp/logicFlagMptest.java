package com.mybatisPlus.mp;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mybatisPlus.mp.bean.User;
import com.mybatisPlus.mp.mapper.EmployeeMapper;
import com.mybatisPlus.mp.mapper.UserMapper;

/**
 * @author 作者 : BJQ
 * @version 创建时间：2020年5月22日 下午11:58:54
 *
 *          说明
 */
public class logicFlagMptest {

	ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");

	EmployeeMapper employeeMapper = ctx.getBean("employeeMapper", EmployeeMapper.class);

	UserMapper userMapper = ctx.getBean("userMapper", UserMapper.class);

	/**
	 * 测试公共字段填充
	 */
	@Test
	public void testMetaObjectHandler() {
		User user = new User();
		// user.setName("Tom");

		user.setId(1);
		user.setLogicFlag(1);

		userMapper.updateById(user);
	}

	/**
	 * 测试逻辑删除
	 */
	@Test
	public void testLogicDelete() {

		// Integer result = userMapper.deleteById(1);
		// System.out.println("result:" +result );

		User user = userMapper.selectById(1);
		System.out.println(user);
	}

	/**
	 * 测试自定义全局操作
	 */
	@Test
	public void testMySqlInjector() {
		Integer result = employeeMapper.deleteAll();
		System.out.println("result: " + result);
	}

}
