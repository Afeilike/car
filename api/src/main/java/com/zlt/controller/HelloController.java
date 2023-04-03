package com.zlt.controller;

import com.zlt.service.HelloService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

@Api(tags = "Hello 测试的接口")
@RestController
public class HelloController {
    @Autowired(required = false)
    HelloService helloService;

    @ApiOperation(value = "hello - 这是一个hello的测试路由")
    @GetMapping("hello")
    public Object hello() {

        return helloService.hello();
//        return GraceJSONResult.errorCustom(ResponseStatusEnum.SYSTEM_ERROR_GLOBAL);
//        return GraceJSONResult.ok("Hello SpringBoot~");
    }

}
