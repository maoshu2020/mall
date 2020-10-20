package com.example.mall.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.example.mall.model.entity.Category;
import com.example.mall.dao.CategoryDao;
import com.example.mall.service.CategoryService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
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
public class CategoryServiceImpl extends ServiceImpl<CategoryDao, Category> implements CategoryService {
    @Resource
    private CategoryDao categoryDao;

    @Override
    public boolean add(Category category) {
        return categoryDao.insert(category)>0;
    }

    @Override
    public boolean update(Category category) {
        return categoryDao.update(category,new UpdateWrapper<Category>().eq("id",category.getId()))>0;
    }

    @Override
    public List<Category> getList(String category_name) {
        return categoryDao.selectList(new QueryWrapper<Category>().eq("categoryName",category_name));
    }

    @Override
    public Category get(Integer category_id) {
        return categoryDao.selectOne(new QueryWrapper<Category>().eq("id",category_id));
    }

    @Override
    public Integer getTotal(String category_name) {
        return categoryDao.selectCount(new QueryWrapper<Category>().like("categoryName",category_name));
    }
}
