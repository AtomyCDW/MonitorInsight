package com.bjksrs.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Atomy
 * @date 2018/1/8
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MemoryPercent {
    private double per;
    private String checktime;


}
