package com.bjksrs.controller;

import com.bjksrs.entity.Basic;
import com.bjksrs.service.BasicService;
import com.bjksrs.util.LayUiUtils;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * @author Atomy
 * @date 2017/12/28
 */
@RestController
@RequestMapping(value = "/monitor/")
public class BasicController {

    @Autowired
    BasicService basicService;

    @RequestMapping(value = "getBasic.do")
    public LayUiUtils<Basic> getBasic(){
        LayUiUtils<Basic> lay  = new LayUiUtils<>();
        List<Basic> list = basicService.getBasic();
        System.out.println(list);
        lay.setData(list);
        lay.setCode(0);
        lay.setMsg(",");
        lay.setCount(100);
        return lay;
    }
    @RequestMapping(value = "getBasicByDevice.do")
    public LayUiUtils<Basic> getBasicByDevice(String device){
        LayUiUtils<Basic> lay  = new LayUiUtils<>();
        List<Basic> list = basicService.getBasicByDevice(device);
        lay.setData(list);
        lay.setCode(0);
        lay.setMsg(",");
        lay.setCount(100);
        return lay;
    }

}

