package com.dumas.scta.service.call.dubbo.feign.provider.rest.service;

import com.dumas.scta.service.call.dubbo.quick.start.api.api.UserService;
import com.dumas.scta.service.call.dubbo.quick.start.api.dto.UserAddDTO;
import com.dumas.scta.service.call.dubbo.quick.start.api.dto.UserDTO;
import org.apache.dubbo.config.annotation.Service;

import javax.ws.rs.*;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

/**
 * @author dumas
 * @desc TODO:
 * @date 2022/05/03 10:58 PM
 */
@Service(protocol = {"dubbo", "rest"}, version = "1.0.0")
@Path("/user")
public class UserServiceImpl implements UserService {

    @GET
    @Path("/get")
    @Produces(APPLICATION_JSON_VALUE)
    @Override
    public UserDTO get(@QueryParam("id") Integer id) {
        return new UserDTO().setId(id)
                .setName("没有昵称：" + id)
                .setGender(id % 2 + 1);
    }

    @POST
    @Path("/add")
    @Consumes(APPLICATION_JSON_VALUE)
    @Override
    public Integer add(UserAddDTO addDTO) {
        return (int) (System.currentTimeMillis() / 1000);
    }
}
