package com.bjksrs.controller;

import com.bjksrs.entity.Cpu;
import com.bjksrs.entity.Io;
import com.bjksrs.service.CpuService;
import com.bjksrs.service.IoService;
import com.bjksrs.util.LayUiUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Atomy
 * @date 2017/12/28
 */
@RestController
@RequestMapping(value = "/monitor/")
public class IoController {
    @Autowired
    IoService ioService;

    @RequestMapping(value = "getTps.do")
    public List<Io> getIo(){
        List<Io> list = ioService.getIo();

        return list;
    }
    @RequestMapping(value = "getTpsByDevice.do")
    public List<Io> getTpsByDevice(String device){
        List<Io> list = ioService.getTpsByDevice(device);
        return list;
    }


    @RequestMapping(value = "getTpsDynamic.do")
    public List<Io> getTpsDynamic(String device){
        List<Io> list = ioService.getTpsDynamic(device);
        return list;
    }
}
