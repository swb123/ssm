package com.swb.ssm.service.web;




import com.swb.ssm.service.dto.Results;
import com.swb.ssm.service.entity.User;
import com.swb.ssm.service.service.UserService;
import com.swb.ssm.service.util.LogUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import static com.swb.ssm.service.enums.ErrorCode.*;


@Controller
@RequestMapping("/user") // url:/模块/资源/{id}/细分 /seckill/list
public class UserController {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private UserService userService;


    @RequestMapping(value = "/{userId}", method = RequestMethod.GET)
    @ResponseBody
    private Object getById(@PathVariable("userId") Long userId) {
        LogUtils.COMMON.info("查询 userId = {}", userId);
        User user = userService.getById(userId);
        if (user != null) {
            return Results.ok(user);
        } else {
            return Results.fail(USER_SELECT_PARAMS);
        }

    }

    @RequestMapping(value = "/{userId}", method = RequestMethod.DELETE)
    @ResponseBody
    private Object deleteById(@PathVariable("userId") Long userId) {
        LogUtils.COMMON.info("删除 userId = {}", userId);
        int  result = userService.deleteById(userId);
        if (result == 1) {
            return Results.ok(result);
        } else {
            return Results.fail(USER_DELETE_ERROR);
        }

    }

    @RequestMapping(value = "/",method = RequestMethod.POST,  consumes="application/json")
    @ResponseBody
    private Object insert(@RequestBody User user) {
        LogUtils.COMMON.info("插入 user = {}", user);
        int  result = userService.insert(user);
        if (result == 1) {
            return Results.ok(result);
        } else {
            return Results.fail(USER_INSERT_ERROR);
        }

    }

    @RequestMapping(value = "/",method = RequestMethod.PUT,  consumes="application/json")
    @ResponseBody
    private Object update(@RequestBody User user) {
        LogUtils.COMMON.info(" 更新 user = {}", user);
        int  result = userService.update(user);
        if (result == 1) {
            return Results.ok(result);
        } else {
            return Results.fail(USER_UPDATE_ERROR);
        }

    }






}
