package com.zlt.pojo;


import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author astupidcoder
 * @since 2023-04-02
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TblPassengerAddress {

    private static final long serialVersionUID = 1L;

    private Integer id;

    /**
     * 乘客id
     */
    private Integer passengerInfoId;

    /**
     * 地址纬度
     */
    private Double latitude;

    /**
     * 地址经度
     */
    private Double longitude;

    /**
     * 详细地址
     */
    private String addressName;

    /**
     * 0:家，1：公司
     */
    private Integer type;

    /**
     * 地址描述
     */
    private String addressDesc;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 创建时间
     */
    private LocalDateTime updateTime;


}
