package com.wwzh.controller;

import com.wwzh.service.UserService;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class IndexController extends BaseController {
    private static final Logger logger = LoggerFactory.getLogger(IndexController.class);

    @Autowired
    private UserService userService;

    @GetMapping("/index")
    @ApiOperation(value = "主文件的index", notes = "")
    public Object index(HttpServletRequest request) {
        logger.info("the request param is {}", request.getParameterMap());

        userService.sayHello(request.getParameter("name"));

        return "hello index";
    }
}
