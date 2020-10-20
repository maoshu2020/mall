package com.example.mall.model.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDate;
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
@TableName("user")
@ApiModel(value="User对象", description="")
public class User extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "id")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "用户名")
    @TableField("user_name")
    private String userName;

    @ApiModelProperty(value = "昵称")
    @TableField("user_nickname")
    private String userNickname;

    @ApiModelProperty(value = "密码")
    @TableField("user_password")
    private String userPassword;

    @ApiModelProperty(value = "实名")
    @TableField("user_realname")
    private String userRealname;

    @ApiModelProperty(value = "性别")
    @TableField("user_gender")
    private Boolean userGender;

    @ApiModelProperty(value = "生日")
    @TableField("user_birthday")
    private LocalDate userBirthday;

    @ApiModelProperty(value = "地址")
    @TableField("user_address")
    private String userAddress;

    @ApiModelProperty(value = "家乡")
    @TableField("user_homeplace")
    private String userHomeplace;

    @ApiModelProperty(value = "个人资料图片")
    @TableField("user_profile_picture_src")
    private String userProfilePictureSrc;

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
