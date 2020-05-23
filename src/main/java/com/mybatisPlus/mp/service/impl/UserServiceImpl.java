package com.mybatisPlus.mp.service.impl;

import com.mybatisPlus.mp.bean.User;
import com.mybatisPlus.mp.mapper.UserMapper;
import com.mybatisPlus.mp.service.UserService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author BJQ
 * @since 2020-05-22
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
