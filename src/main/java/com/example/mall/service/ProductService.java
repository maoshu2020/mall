package com.example.mall.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.mall.model.entity.Product;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.mall.utils.OrderUtil;
import com.example.mall.utils.PageUtil;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author 拼夕夕
 * @since 2020-10-18
 */
public interface ProductService extends IService<Product> {
    boolean add(Product product);
    boolean update(Product product);

    Page<Product> getList(Product product, Byte[] product_isEnabled_array, OrderUtil orderUtil, PageUtil pageUtil);

    List<Product> getTitle(Product product, PageUtil pageUtil);
    Product get(Integer product_Id);
    Integer getTotal(Product product,Byte[] product_isEnabled_array);

    List<Product> getMoreList(Product product, Byte[] bytes, OrderUtil orderUtil, PageUtil pageUtil, String[] product_name_split);

    Integer getMoreListTotal(Product product, Byte[] bytes, String[] product_name_split);
}
