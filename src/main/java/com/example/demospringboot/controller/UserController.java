package com.example.demospringboot.controller;

import com.example.demospringboot.entity.TbUser;
import com.example.demospringboot.service.UserService;
import io.swagger.annotations.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.ApiIgnore;

import javax.annotation.Resource;
import javax.validation.Valid;

@ApiResponses({
        @ApiResponse(code = 400,message = "你错了"),
        @ApiResponse(code = 401,message = "你大错特错")
})
@Api(tags = "userInfo")
@Controller
@Slf4j
@RequestMapping("/testBoot")
public class UserController {
    @Resource(name = "userService")
    private UserService userService;
//    @ApiOperation("我是用户登录方法")
//    @RequestMapping(value = "/getUser/{id}",method = RequestMethod.GET)
//    @ResponseBody
//    public TbUser getTbUser(@PathVariable Long id){
//        log.info("查询user的id1234");
//        return userService.selectByPrimaryKey(id);
//    }

    @ApiOperation("我是用户查询方法")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "userType",value = "用户类型",paramType = "query",dataType = "Integer",required = true,defaultValue ="2"),
            @ApiImplicitParam(name = "id",value = "用户id",paramType = "path",dataType = "Long",required = true)
    })
    @ApiResponses({
        @ApiResponse(code = 400,message = "你错了"),
        @ApiResponse(code = 401,message = "你大错特错")
    })
    @RequestMapping(value = "/getUser/{id}",method = RequestMethod.GET)
    @ResponseBody
    public String getUser(@ApiIgnore@PathVariable Long id, @RequestParam(value = "userType") Integer userType){
        String result = null;
        switch(userType){
            case 1:result = "Jordan";
                break;
            case 2:result = "james";
                break;
            default:result = "not find";
                break;
        }
        return result;
    }

    @ApiOperation("我是用户插入")
    @PostMapping(value = "/addUser")
    @ResponseBody
    public String addUser(@Valid @RequestBody TbUser tbUser ,BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            System.out.println("110");
            return bindingResult.getAllErrors().get(0).getDefaultMessage();
        }
        return tbUser.toString();
    }
}
