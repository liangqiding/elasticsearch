package com.example.demo.domain;

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
 * @since 2020-11-12
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class DeviceMessageRecord extends Model<DeviceMessageRecord> {

    private static final long serialVersionUID = 1L;

    private Long msgId;

    private String deviceId;

    private String functionTag;

    private Float numberValue;

    private String jsonValue;

    private String strValue;

    private Long provinceCode;

    private Long cityCode;

    private Long countyCode;

    private Long townCode;

    private Long villageCode;

    private Long projectId;

    private Long buildingId;

    private Long floorId;

    /**
     * 标记记录是否处理
     * 0未处理
     * 1已处理
     */
    private Integer processed;

    /**
     * 处理该记录的人员id
     */
    private Long updUserId;

    /**
     * 记录的相关说明
     */
    private String remark;

    /**
     * 对于记录做的标签
     */
    private String remarkTag;

    @TableField(fill = FieldFill.INSERT)
    private Date gmtCreate;

    /**
     * 表单更新的时间（用户处理记录的时间及使用该时间点）
     */
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Date gmtModified;

    private Long deviceGroupId;


    @Override
    protected Serializable pkVal() {
        return this.msgId;
    }

}
