package cn.edu.nhic.tmall.service.impl;

import cn.edu.nhic.tmall.dao.PropertyMapper;
import cn.edu.nhic.tmall.entity.Property;
import cn.edu.nhic.tmall.service.PropertyService;
import cn.edu.nhic.tmall.util.PageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PropertyServiceImpl implements PropertyService{
    @Autowired
    private PropertyMapper propertyMapper;

    public void setPropertyMapper(PropertyMapper propertyMapper) {
        this.propertyMapper = propertyMapper;
    }

    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    @Override
    public boolean add(Property property) {
        return propertyMapper.insertOne(property)>0;
    }

    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    @Override
    public boolean addList(List<Property> propertyList) {
        return propertyMapper.insertList(propertyList) > 0;
    }

    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    @Override
    public boolean update(Property property) {
        return propertyMapper.updateOne(property)>0;
    }

    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    @Override
    public boolean deleteList(Integer[] property_id_list) {
        return propertyMapper.deleteList(property_id_list)>0;
    }

    @Override
    public List<Property> getList(Property property, PageUtil pageUtil) {
        return propertyMapper.select(property,pageUtil);
    }

    @Override
    public Property get(Integer property_id) {
        return propertyMapper.selectOne(property_id);
    }

    @Override
    public Integer getTotal(Property property) {
        return propertyMapper.selectTotal(property);
    }
}
