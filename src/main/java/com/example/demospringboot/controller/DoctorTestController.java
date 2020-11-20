package com.example.demospringboot.controller;

import com.example.demospringboot.entity.DemoDoctor;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * 医生类（模拟）
 * @author SUNF
 */
@RequestMapping("/api/v1")
@Controller
@Api(value = "DoctorTestController-医生信息接口模拟")
public class DoctorTestController {

    /**
     * 添加医生
     *
     * 在使用对象封装参数进行传参时，需要在该对象添加注解，将其注册到swagger中
     * @link com.zhongying.api.model.base.DemoDoctor
     *
     * 注意： 在后台采用对象接收参数时，Swagger自带的工具采用的是JSON传参，
     *     测试时需要在参数上加入@RequestBody,正常运行采用form或URL提交时候请删除。
     *
     * @param doctor 医生类对象
     * @return
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping(value="/doctor",  method= RequestMethod.POST )
    @ApiOperation(value="添加医生信息", notes="")
    public String addDoctor(@RequestBody DemoDoctor doctor) throws Exception{
        if(null == doctor || doctor.getId() == null){
            throw new RuntimeException("添加医生失败DT3388未知原因请联系管理员");
        }
        try {
            System.out.println("成功----------->"+doctor.getName());
        } catch (Exception e) {
            throw new RuntimeException("添加医生失败DT3388未知原因请联系管理员");
        }

        return doctor.getId().toString();
    }

    /**
     * 删除医生
     * @param doctorId 医生ID
     * @return
     */
    @ResponseBody
    @RequestMapping(value="/doctor/{doctorId}",  method= RequestMethod.DELETE )
    @ApiOperation(value="删除医生信息", notes="")
    @ApiImplicitParam(paramType="query", name = "doctorId", value = "医生ID", required = true, dataType = "Integer")
    public String deleteDoctor(@RequestParam Integer doctorId){
        if(doctorId > 2){
            return "删除失败";
        }
        return "删除成功";
    }

    /**
     * 修改医生信息
     * @param doctorId 医生ID
     * @param doctor 医生信息
     * @return
     * @throws RuntimeException
     */
    @ResponseBody
    @RequestMapping(value="/doctor/{doctorId}",  method= RequestMethod.POST )
    @ApiOperation(value="修改医生信息", notes="")
    @ApiImplicitParam(paramType="query", name = "doctorId", value = "医生ID", required = true, dataType = "Integer")
    public String updateDoctor(@RequestParam Integer doctorId, @RequestBody DemoDoctor doctor) throws RuntimeException{
        if(null == doctorId || null == doctor){
            throw new RuntimeException("修改医生信息失败DT3391id不能为空请修改");
        }
        if(doctorId > 5 ){
            throw new RuntimeException("医生不存在DT3392错误的ID请更换ID");
        }
        System.out.println(doctorId);
        System.out.println(doctor);
        return "修改成功";
    }

    /**
     * 获取医生详细信息
     * @param doctorId 医生ID
     * @return
     * @throws RuntimeException
     */
    @ResponseBody
    @RequestMapping(value="/doctor/{doctorId}",  method= RequestMethod.GET )
    @ApiOperation(value="获取医生详细信息", notes="仅返回姓名..")
    @ApiImplicitParam(paramType="query", name = "doctorId", value = "医生ID", required = true, dataType = "Integer")
    public DemoDoctor getDoctorDetail(@RequestParam Integer doctorId) throws RuntimeException{
        System.out.println(doctorId);
        if(null == doctorId){
            throw new RuntimeException("查看医生信息失败DT3390未知原因请联系管理员");
        }
        if(doctorId > 3){
            throw new RuntimeException("医生不存在DT3392错误的ID请更换ID");
        }
        DemoDoctor doctor = new DemoDoctor();
        doctor.setId(1);
        doctor.setName("测试员");
        return doctor;
    }

    /**
     * 获取医生列表
     * @param pageIndex 当前页数
     * @param pageSize 每页记录数
     * @param request
     * @return
     * @throws RuntimeException
     */
//    @ResponseBody
//    @RequestMapping(value="/doctor",  method= RequestMethod.GET )
//    @ApiOperation(value="获取医生列表", notes="目前一次全部取，不分页")
//    @ApiImplicitParams({
//            @ApiImplicitParam(paramType="header", name = "token", value = "token", required = true, dataType = "String"),
//            @ApiImplicitParam(paramType="query", name = "pageIndex", value = "当前页数", required = false, dataType = "String"),
//            @ApiImplicitParam(paramType="query", name = "pageSize", value = "每页记录数", required = true, dataType = "String"),
//    })
//    public PageInfo<DemoDoctor> getDoctorList(@RequestParam(value = "pageIndex", required = false, defaultValue = "1") Integer pageIndex,
//                                              @RequestParam(value = "pageSize", required = false) Integer pageSize,
//                                              HttpServletRequest request) throws RuntimeException{
//
//        String token = request.getHeader("token");
//        if(null == token){
//            throw new RuntimeException("没有权限SS8888没有权限请查看操作文档");
//        }
//        if(null == pageSize){
//            throw new RuntimeException("每页记录数不粗安在DT3399不存在pageSize请查看操作文档");
//        }
//
//        DemoDoctor doctor1 = new DemoDoctor();
//        doctor1.setId(1);
//        doctor1.setName("测试员1");
//        DemoDoctor doctor2 = new DemoDoctor();
//        doctor2.setId(2);
//        doctor2.setName("测试员2");
//
//        List<DemoDoctor> doctorList = new ArrayList<DemoDoctor>();
//        doctorList.add(doctor1);
//        doctorList.add(doctor2);
//        return new PageInfo<DemoDoctor>(doctorList);
//    }


}