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
public class Load {
    private String oneMinAgoLoad;
    private String fiveMinAgoLoad;
    private String fifthMinAgoLoad;
    private String device;
    private String checktime;
}
