package cn.edu.nhic.tmall.service.impl;

import cn.edu.nhic.tmall.dao.ProductOrderItemMapper;
import cn.edu.nhic.tmall.entity.OrderGroup;
import cn.edu.nhic.tmall.entity.ProductOrderItem;
import cn.edu.nhic.tmall.service.ProductOrderItemService;
import cn.edu.nhic.tmall.util.PageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

@Service
public class ProductOrderItemServiceImpl implements ProductOrderItemService{

    @Autowired
    private ProductOrderItemMapper productOrderItemMapper;

    public void setProductOrderItemMapper(ProductOrderItemMapper productOrderItemMapper) {
        this.productOrderItemMapper = productOrderItemMapper;
    }

    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    @Override
    public boolean add(ProductOrderItem productOrderItem) {
        return productOrderItemMapper.insertOne(productOrderItem)>0;
    }

    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    @Override
    public boolean update(ProductOrderItem productOrderItem) {
        return productOrderItemMapper.updateOne(productOrderItem)>0;
    }

    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    @Override
    public boolean deleteList(Integer[] productOrderItem_id_list) {
        return productOrderItemMapper.deleteList(productOrderItem_id_list)>0;
    }

    @Override
    public List<ProductOrderItem> getList(PageUtil pageUtil) {
        return productOrderItemMapper.select(pageUtil);
    }

    @Override
    public List<ProductOrderItem> getListByOrderId(Integer order_id, PageUtil pageUtil) {
        return productOrderItemMapper.selectByOrderId(order_id,pageUtil);
    }

    @Override
    public List<ProductOrderItem> getListByUserId(Integer user_id, PageUtil pageUtil) {
        return productOrderItemMapper.selectByUserId(user_id,pageUtil);
    }

    @Override
    public List<ProductOrderItem> getListByProductId(Integer product_id, PageUtil pageUtil) {
        return productOrderItemMapper.selectByProductId(product_id,pageUtil);
    }

    @Override
    public ProductOrderItem get(Integer productOrderItem_id) {
        return productOrderItemMapper.selectOne(productOrderItem_id);
    }

    @Override
    public Integer getTotal() {
        return productOrderItemMapper.selectTotal();
    }

    @Override
    public Integer getTotalByOrderId(Integer order_id) {
        return productOrderItemMapper.selectTotalByOrderId(order_id);
    }

    @Override
    public Integer getTotalByUserId(Integer user_id) {
        return productOrderItemMapper.selectTotalByUserId(user_id);
    }

    @Override
    public List<OrderGroup> getTotalByProductId(Integer product_id, Date beginDate, Date endDate) {
        return productOrderItemMapper.getTotalByProductId(product_id,beginDate,endDate);
    }

    @Override
    public Integer getSaleCountByProductId(Integer product_id) {
        return productOrderItemMapper.selectSaleCount(product_id);
    }
}
