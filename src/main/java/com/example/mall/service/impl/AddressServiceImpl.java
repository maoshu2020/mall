package com.example.mall.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.example.mall.model.entity.Address;
import com.example.mall.dao.AddressDao;
import com.example.mall.service.AddressService;
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
public class AddressServiceImpl extends ServiceImpl<AddressDao, Address> implements AddressService {
    @Resource
    private AddressDao addressDao;
    Address address = new Address();

    @Override
    public boolean add(Address address) {
        return addressDao.insert(address)>0;
    }

    @Override
    public boolean update(Address address) {
        return addressDao.update(address,new UpdateWrapper<Address>().eq("id",address.getId()))>0;
    }

    @Override
    public List<Address> getList(String address_name, String address_regionId) {
        return addressDao.selectList(new QueryWrapper<Address>().like("addressName",address_name)
                .like("addressRegionid",address_regionId));
    }

    @Override
    public Address get(String address_areaId) {
        return addressDao.selectOne(new QueryWrapper<Address>().eq("id",address_areaId));
    }

    @Override
    public List<Address> getRoot() {
        return addressDao.selectList(new QueryWrapper<Address>().eq("id",address.getAddressRegionid()));
    }
}
