package com.example.demo.controller;

import com.example.demo.util.ResultUtil;
import com.example.demo.vo.ResponseVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@Slf4j
@RequestMapping("/test")
@Api(value = "测试接口", tags = {"测试接口"})
public class TestController {


    @GetMapping("/health")
    @ApiOperation("健康检查")
    public ResponseVo health() {
        return ResultUtil.success();
    }

}
