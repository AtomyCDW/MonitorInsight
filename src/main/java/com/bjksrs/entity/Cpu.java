package com.bjksrs.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Atomy
 * @date 2017/12/28
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cpu {
    /**
     * @cpuInterrupt 每秒被中断的进程次数
     * @cpuContentSwitch 每秒进行的时间切换次数
     * @cpuUser 用户进程消耗cpu运算时间的百分比
     * @cpuSystem 系统进程消耗cpu运算时间的百分比
     * @cpuIdle 空闲cpu的百分比
     * @cpuWait 等待I/O所消耗的cpu百分比
     * @cpuSteal 被虚拟机盗用的cpu百分比
     * @device 服务器
     */
    private String cpu_us;
    private String cpu_sy;
    private String cpu_id;
    private String cpu_wa;
    private String cpu_st;
    private String checktime;
    private String device;
}
