package cn.edu.nhic.tmall.service.impl;

import cn.edu.nhic.tmall.dao.CategoryMapper;
import cn.edu.nhic.tmall.entity.Category;
import cn.edu.nhic.tmall.service.CategoryService;
import cn.edu.nhic.tmall.util.PageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryMapper categoryMapper;
    public void setCategoryMapper(CategoryMapper categoryMapper) {
        this.categoryMapper = categoryMapper;
    }

    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    @Override
    public boolean add(Category category) {
        return categoryMapper.insertOne(category)>0;
    }

    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    @Override
    public boolean update(Category category) {
        return categoryMapper.updateOne(category)>0;
    }

    @Override
    public List<Category> getList(String category_name, PageUtil pageUtil) {
        List<Category> li=  categoryMapper.select(category_name,pageUtil);
        return li;
    }

    @Override
    public Category get(Integer category_id) {
        return categoryMapper.selectOne(category_id);
    }

    @Override
    public Integer getTotal(String category_name) {
        return categoryMapper.selectTotal(category_name);
    }
}
