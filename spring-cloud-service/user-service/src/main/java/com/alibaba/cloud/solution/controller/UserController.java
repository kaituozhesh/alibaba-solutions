package com.alibaba.cloud.solution.controller;

import com.alibaba.cloud.solution.domain.CommonResult;
import com.alibaba.cloud.solution.domain.User;
import com.alibaba.cloud.solution.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @ClassName : UserController
 * @Description :
 * @Author : kaituozhesh
 * @Date: 2020-06-27 17:00
 * @Version: 1.0.0
 */
@Slf4j
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/create")
    public CommonResult create(@RequestBody User user) {
        return new CommonResult("操作成功", 200);
    }

    @GetMapping("/{id}")
    public CommonResult<User> getUser(@PathVariable Long id) {
        User user = new User();
        user.setId(id);
        user.setPassword("123123");
        user.setUsername("aaaa");
        log.info("根据id获取用户信息，用户名称为：{}", user.getUsername());
        return new CommonResult<>(user);
    }

    @GetMapping("/getUserByIds")
    public CommonResult<List<User>> getUserByIds(@RequestParam List<Long> ids) {
        List<User> userList = userService.getUserByIds(ids);
        log.info("根据ids获取用户信息，用户列表为：{}", userList);
        return new CommonResult<>(userList);
    }

    @GetMapping("/getByUsername")
    public CommonResult<User> getByUsername(@RequestParam String username) {
        User user = userService.getByUsername(username);
        return new CommonResult<>(user);
    }

}
