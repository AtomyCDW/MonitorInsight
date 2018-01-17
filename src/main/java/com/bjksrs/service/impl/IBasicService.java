package com.bjksrs.service.impl;

import com.bjksrs.dao.BasicMapper;
import com.bjksrs.entity.Basic;
import com.bjksrs.service.BasicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Atomy
 * @date 2017/12/28
 */
@Service
public class IBasicService implements BasicService {
    @Autowired
    BasicMapper basicMapper;

    @Override
    public List<Basic> getBasic() {
        return basicMapper.getBasic();
    }

    @Override
    public List<Basic> getBasicByDevice(String device) {
        return basicMapper.getBasicByDevice(device);
    }

}
