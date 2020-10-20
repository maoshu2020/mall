package com.example.mall.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.mall.model.entity.Product;
import com.example.mall.dao.ProductDao;
import com.example.mall.service.ProductService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.mall.utils.OrderUtil;
import com.example.mall.utils.PageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 拼夕夕
 * @since 2020-10-18
 */
@Service
public class ProductServiceImpl extends ServiceImpl<ProductDao, Product> implements ProductService {
    @Resource
    private ProductDao productDao;

    @Override
    public boolean add(Product product) {
        return productDao.insert(product)>0;
    }

    @Override
    public boolean update(Product product) {
        return productDao.update(product,new UpdateWrapper<Product>())>0;
    }

    @Override
    public Page<Product> getList(Product product, Byte[] product_isEnabled_array, OrderUtil orderUtil, PageUtil pageUtil) {
        Page<Product> page = new Page<>(pageUtil.getPageStart(),pageUtil.getCount());
        return productDao.selectPage(page,new QueryWrapper<Product>().like("productName",product.getProductName())
                .eq("productCategoryId",product.getProductCategoryId()));
    }

    @Override
    public List<Product> getTitle(Product product, PageUtil pageUtil) {
        return null;
    }

    @Override
    public Product get(Integer product_Id) {
        return null;
    }

    @Override
    public Integer getTotal(Product product, Byte[] product_isEnabled_array) {
        return null;
    }

    @Override
    public List<Product> getMoreList(Product product, Byte[] bytes, OrderUtil orderUtil, PageUtil pageUtil, String[] product_name_split) {
        return null;
    }

    @Override
    public Integer getMoreListTotal(Product product, Byte[] bytes, String[] product_name_split) {
        return null;
    }
}
