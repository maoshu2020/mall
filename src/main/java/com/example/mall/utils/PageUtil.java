package com.example.mall.utils;

import lombok.Data;

@Data
public final class PageUtil {
    //当前页
    private Integer index;
    //每页个数
    private Integer count;
    //总数
    private Integer total;
    //行数起始值
    private Integer pageStart;

    public PageUtil(Integer index, Integer count) {
        this.index = index;
        this.count = count;
    }

    public Boolean isHasPrev(){
        return index >= 1;
    }

    public Boolean isHasNext(){
        return index + 1 < getTotalPage();
    }

    public Integer getTotalPage(){
        return (int) Math.ceil((double) total / count);
    }

    public PageUtil(){

    }

    public Integer getPageStart() {
        if (index != null) {
            return index * count;
        } else {
            return pageStart;
        }
    }
}
