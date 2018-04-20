package cn.itcast.cxf.service;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import cn.itcast.cxf.domain.Car;
import cn.itcast.cxf.domain.User;

/**
 * @author YangTao
 * @WebService使用在类上面,标记类是WebService服务提供对象
 * @WebMethod使用方法上面,标记方法是WebService服务提供方法
 */
@WebService
public interface IUserService {
	@WebMethod
	public String sayHello(String name);

	@WebMethod
	public List<Car> findCarsByUser(User user);
}
