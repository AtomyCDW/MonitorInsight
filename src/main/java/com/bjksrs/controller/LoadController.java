package com.bjksrs.controller;

import com.bjksrs.entity.Io;
import com.bjksrs.entity.Load;
import com.bjksrs.service.IoService;
import com.bjksrs.service.LoadService;
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
public class LoadController {
    @Autowired
    LoadService loadService;

    @RequestMapping(value = "getLoad.do")
    public List<Load> getLoad(){
        List<Load> list = loadService.getLoad();

        return list;
    }


    @RequestMapping(value = "getLoadDynamic.do")
    public List<Load> getLoadDynamic(String device){
        List<Load> list = loadService.getLoadDynamic(device);
        return list;
    }

    @RequestMapping(value = "getLoadByDevice.do")
    public List<Load> getLoadByDevice(String device){
        List<Load> list = loadService.getLoadByDevice(device);
        return list;
    }
}
