package com.mybatisPlus.mp;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.rules.DbType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import com.mybatisPlus.mp.bean.User;
import com.mybatisPlus.mp.mapper.EmployeeMapper;
import com.mybatisPlus.mp.mapper.UserMapper;

/**
 * @author 作者 : BJQ
 * @version 创建时间：2020年5月22日 下午9:35:22 说明
 */
public class GeneratorMptest {
	
	
	private ApplicationContext ioc = new ClassPathXmlApplicationContext("applicationContext.xml");
	
	
	private UserMapper  userMapper= ioc.getBean("userMapper",UserMapper.class);

	@Test
	public void testGenerator() {
		// 全局配置
		GlobalConfig config = new GlobalConfig();
		config.setActiveRecord(true) // 是否支持AR模式
				.setAuthor("BJQ") // 作者
				.setOutputDir("D:\\F\\eclipse64Workspaces\\MybatisPlus\\src\\main\\java") // 生成路径
				.setFileOverride(true)// 文件覆盖
				.setServiceName("%sService") // 设置生成的service接口名 首字母是否为I
				.setIdType(IdType.AUTO); // 主键策略

		// 数据源配置
		DataSourceConfig dsConfig = new DataSourceConfig();
		dsConfig.setDbType(DbType.MYSQL).setUrl("jdbc:mysql://localhost:3306/mp").setDriverName("com.mysql.jdbc.Driver")
				.setUsername("root").setPassword("123456");

		// 策略配置
		StrategyConfig stConfig = new StrategyConfig();
		stConfig.setCapitalMode(true) // 全局大写命名
				.setDbColumnUnderline(true) // 表名 字段名 是否使用下滑 线命名
				.setNaming(NamingStrategy.underline_to_camel) // 数据 库表映射到实体的命名策略
				.setInclude("tbl_user") // 生成的表
				.setTablePrefix("tbl_"); // 表前缀

		// 包名策略
		PackageConfig pkConfig = new PackageConfig();
		pkConfig.setParent("com.mybatisPlus.mp").setController("controller").setEntity("bean").setService("service");

		AutoGenerator ag = new AutoGenerator().setGlobalConfig(config).setDataSource(dsConfig).setStrategy(stConfig)
				.setPackageInfo(pkConfig);

		ag.execute();

	}
	
	
	@Test
	public void   genmpinsert() {
		
		Integer integer = userMapper.insert(new User(null,"小白"));
		System.out.println(integer);
		
		
//		User user = new  User();
//		 user.setName("小白白");
//		 
//		 boolean b = user.insert();
//		 
//		 System.out.println("b="+b);
		
	}
	

}
