package com.zlt.controller;

import com.zlt.pojo.TblPassengerAddress;
import com.zlt.result.GraceJSONResult;
import com.zlt.service.TblPassengerAddressService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Api
@RestController
@CrossOrigin
@RequestMapping("passengerAddress")
public class TblPassengerAddressController {

    @Autowired(required = false)
    TblPassengerAddressService tblPassengerAddressService;

    @ApiOperation("查询乘客的历史地址信息")
    @RequestMapping(value="getAddresses",method = RequestMethod.GET)
    public GraceJSONResult getAddresses(int pid){
        List<TblPassengerAddress> list = tblPassengerAddressService.getAddresses(pid);
        //统一数据接口的封装
        return GraceJSONResult.ok(list);
    }
}
