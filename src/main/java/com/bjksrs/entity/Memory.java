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
public class Memory {
    /**
     * @memTotal 物理内存总容量
     * @memUsed 已使用容量
     * @memFree 空闲容量
     * @swapTotal 交换分区总容量
     * @swapUsed 交换分区已使用能量
     * @swapFree 可以空间容量
     * @sharedMemory 多个进程共享的内存总额
     * @buffAndCache 缓存容量
     * @available 可以空间
     * @device 服务器
     *
     */
    private String memTotal;
    private String memUsed;
    private String memFree;
    private String swapTotal;
    private String swapUsed;
    private String swapFree;
    private String sharedMemory;
    private String buffAndCache;
    private String available;
    private String checktime;
    private String device;
}
