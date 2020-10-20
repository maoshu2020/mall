package com.example.mall.service;

import com.example.mall.model.entity.Category;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author 拼夕夕
 * @since 2020-10-18
 */
public interface CategoryService extends IService<Category> {
    boolean add(Category category);
    boolean update(Category category);

    List<Category> getList(String category_name);
    Category get(Integer category_id);
    Integer getTotal(String category_name);
}
