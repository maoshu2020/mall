package com.example.mall.model.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import com.example.mall.model.entity.BaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author 拼夕夕
 * @since 2020-10-18
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName("address")
@ApiModel(value="Address对象", description="")
public class Address extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @TableId("id")
    private String id;

    @ApiModelProperty(value = "地址名称")
    @TableField("address_name")
    private String addressName;

    @ApiModelProperty(value = "地址区域id")
    @TableField("address_regionId")
    private String addressRegionid;

    @ApiModelProperty(value = "创建时间")
    @TableField("createTime")
    private LocalDateTime createTime;

    @ApiModelProperty(value = "修改时间")
    @TableField("updateTime")
    private LocalDateTime updateTime;

    @ApiModelProperty(value = "逻辑删除")
    @TableField("deleted")
    private Integer deleted;


}
