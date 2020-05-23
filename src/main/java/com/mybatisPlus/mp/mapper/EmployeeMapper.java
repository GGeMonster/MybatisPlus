package com.mybatisPlus.mp.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.mybatisPlus.mp.bean.Employee;

public interface EmployeeMapper   extends BaseMapper<Employee>{

	int  deleteAll();
	
}
