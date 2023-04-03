package com.zlt.service;

import com.zlt.pojo.TblPassengerAddress;

import java.util.List;

public interface TblPassengerAddressService {
    List<TblPassengerAddress> getAddresses(int pid);
}
