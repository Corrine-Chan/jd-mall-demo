package cn.edu.nhic.tmall.service.impl;

import cn.edu.nhic.tmall.dao.AddressMapper;
import cn.edu.nhic.tmall.entity.Address;
import cn.edu.nhic.tmall.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class AddressServiceImpl implements AddressService{
    @Autowired
    private AddressMapper addressMapper;
    public void setAddressMapper(AddressMapper addressMapper) {
        this.addressMapper = addressMapper;
    }

    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    @Override
    public boolean add(Address address) {
        return addressMapper.insertOne(address)>0;
    }

    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    @Override
    public boolean update(Address address) {
        return addressMapper.updateOne(address)>0;
    }

    @Override
    public List<Address> getList(String address_name, String address_regionId) {
        return addressMapper.select(address_name,address_regionId);
    }

    @Override
    public Address get(String address_areaId) {
        return addressMapper.selectOne(address_areaId);
    }

    @Override
    public List<Address> getRoot() {
        return addressMapper.selectRoot();
    }
}
