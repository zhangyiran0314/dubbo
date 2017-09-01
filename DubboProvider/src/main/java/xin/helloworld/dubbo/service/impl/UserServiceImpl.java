package xin.helloworld.dubbo.service.impl;

import org.springframework.stereotype.Service;

import xin.helloworld.dubbo.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService{

	public String sayHello() {
		System.out.println("sayHello method £º hello world!!! " );
		return "helloworld";
	}
}
