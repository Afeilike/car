package com.zlt.mapper;

import com.zlt.pojo.TblPassengerAddress;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface TblPassengerAddressDao {

    @Select("select * from tbl_passenger_address where passenger_info_id = #{pid}")
    List<TblPassengerAddress> findByPid(int pid);
}
