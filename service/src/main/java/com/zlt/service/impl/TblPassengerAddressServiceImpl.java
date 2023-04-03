package com.zlt.service.impl;

import com.zlt.mapper.TblPassengerAddressDao;
import com.zlt.pojo.TblPassengerAddress;
import com.zlt.service.TblPassengerAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TblPassengerAddressServiceImpl implements TblPassengerAddressService {
    @Autowired(required = false)
    TblPassengerAddressDao tblPassengerAddressDao;

    @Override
    public List<TblPassengerAddress> getAddresses(int pid) {
        return tblPassengerAddressDao.findByPid(pid);
    }
}





