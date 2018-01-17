package com.bjksrs.controller;

import com.bjksrs.entity.Cpu;
import com.bjksrs.entity.MemoryPercent;
import com.bjksrs.service.CpuService;
import com.bjksrs.service.MemoryService;
import com.bjksrs.util.LayUiUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Atomy
 * @date 2017/12/28
 *                             _ooOoo_
 *                            o8888888o
 *                            88" . "88
 *                            (| -_- |)
 *                            O\  =  /O
 *                         ____/`---'\____
 *                       .'  \\|     |//  `.
 *                      /  \\|||  :  |||//  \
 *                     /  _||||| -:- |||||-  \
 *                     |   | \\\  -  /// |   |
 *                     | \_|  ''\---/''  |   |
 *                     \  .-\__  `-`  ___/-. /
 *                   ___`. .'  /--.--\  `. . __
 *                ."" '<  `.___\_<|>_/___.'  >'"".
 *               | | :  `- \`.;`\ _ /`;.`/ - ` : | |
 *               \  \ `-.   \_ __\ /__ _/   .-` /  /
 *          ======`-.____`-.___\_____/___.-`____.-'======
 *                             `=---='
 *          ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
 *                     佛祖保佑        永无BUG
 *            佛曰:
 *                   写字楼里写字间，写字间里程序员；
 *                   程序人员写程序，又拿程序换酒钱。
 *                   酒醒只在网上坐，酒醉还来网下眠；
 *                   酒醉酒醒日复日，网上网下年复年。
 *                   但愿老死电脑间，不愿鞠躬老板前；
 *                   奔驰宝马贵者趣，公交自行程序员。
 *                   别人笑我忒疯癫，我笑自己命太贱；
 *                   不见满街漂亮妹，哪个归得程序员？
 */
@RestController
@RequestMapping(value = "/monitor/")
public class MemoryController {

    @Autowired
    MemoryService memoryService;

    @RequestMapping(value = "getMemoryPercent.do")
    public List<MemoryPercent> getMemoryPercent(){
        List<MemoryPercent> list = memoryService.getMemoryPercent();
        return list;
    }
    @RequestMapping(value = "getMemoryPercentDynamic.do")
    public List<MemoryPercent> getMemoryPercentDynamic(String device){
        List<MemoryPercent> list = memoryService.getMemoryPercentDynamic(device);
        return list;
    }

    @RequestMapping(value = "getMemoryPercentByDevice.do")
    public List<MemoryPercent> getMemoryPercentByDevice(String device){
        List<MemoryPercent> list = memoryService.getMemoryPercentByDevice(device);
        return list;
    }

}
