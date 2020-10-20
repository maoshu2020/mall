package com.example.mall.model.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
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
@TableName("product")
@ApiModel(value="Product对象", description="")
public class Product extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "产品id")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "产品名")
    @TableField("product_name")
    private String productName;

    @ApiModelProperty(value = "产品标题")
    @TableField("product_title")
    private String productTitle;

    @ApiModelProperty(value = "产品价格")
    @TableField("product_price")
    private BigDecimal productPrice;

    @ApiModelProperty(value = "产品销售价格")
    @TableField("product_sale_price")
    private BigDecimal productSalePrice;

    @ApiModelProperty(value = "类别id")
    @TableField("product_category_id")
    private Integer productCategoryId;

    @ApiModelProperty(value = "是否上架")
    @TableField("product_isEnabled")
    private Boolean productIsenabled;

    @ApiModelProperty(value = "产品销售计数")
    @TableField("product_sale_count")
    private Integer productSaleCount;

    @ApiModelProperty(value = "产品审查计数")
    @TableField("product_review_count")
    private Integer productReviewCount;

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
