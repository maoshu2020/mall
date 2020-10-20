package com.example.mall.utils;

import lombok.Data;

@Data
public final class OrderUtil {
    //排序字段
    private String orderBy;
    //倒序排序
    private boolean isDesc;
}
