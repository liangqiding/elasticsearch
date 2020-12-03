package com.example.demo.domain;

import java.math.BigDecimal;

import com.baomidou.mybatisplus.extension.activerecord.Model;

import java.util.Date;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;


/**
 * <p>
 *
 * </p>
 *
 * @author lqd
 * @since 2020-11-11
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class Device extends Model<Device> {

    private static final long serialVersionUID = 1L;

    /**
     * 设备id，采用字符串形式
     */

    private String deviceId;

    /**
     * 设备所在分组，一个设备只能属于一个分组（分组逻辑是物理位置，空间）
     * 默认0  代表未分组
     */

    private Long deviceGroupId;

    /**
     * 该设备连接的上层设备id，最顶层设备父亲id为cloud 。默认为’’
     */
    private String parentDeviceId;


    private String deviceName;

    /**
     * 该产品对应的产品编号SD103，便于查看
     */
    private String productName;

    /**
     * 1 开启 0 停用
     */
    private Boolean enable;

    /**
     * 注册时间
     */
    private Date registerDatetime;

    /**
     * 激活时间
     */
    private Date activateDatetime;

    /**
     * 软体版本
     */
    private String swVersion;

    /**
     * 硬体版本
     */
    private String hwVersion;

    private Long provinceCode;

    private Long cityCode;

    private Long countyCode;

    private Long townCode;

    private Long villageCode;

    private Long projectId;

    private Long buildingId;

    private Long floorId;

    /**
     * 户主单元号，一单元 二单元
     */
    private String unitCode;

    /**
     * 所对应楼层图纸，设备所在位置xpos像素
     */
    private Integer xpos;

    /**
     * y位置，像素
     */
    private Integer ypos;

    /**
     * 具体位置的文字描述
     */
    private String place;

    /**
     * 该设备的定位位置，设备无定位功能，使用配置文件中指定的位置。经度
     */
    private BigDecimal longitude;

    /**
     * 纬度
     */
    private BigDecimal latitude;

    /**
     * 默认 0 ， 1 表示逻辑删除
     */
    private Boolean isDelete;

    /**
     * 导入该设备的管理员用户
     */
    private Long createUserId;

    @TableField(fill = FieldFill.INSERT)
    private Date gmtCreate;

    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Date gmtModified;


    @Override
    protected Serializable pkVal() {
        return this.deviceId;
    }

}
