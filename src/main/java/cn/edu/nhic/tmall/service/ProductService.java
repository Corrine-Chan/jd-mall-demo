package cn.edu.nhic.tmall.service;

import cn.edu.nhic.tmall.entity.Product;
import cn.edu.nhic.tmall.util.OrderUtil;
import cn.edu.nhic.tmall.util.PageUtil;

import java.util.List;

public interface ProductService {
    boolean add(Product product);
    boolean update(Product product);

    List<Product> getList(Product product, Byte[] product_isEnabled_array, OrderUtil orderUtil, PageUtil pageUtil);

    List<Product> getTitle(Product product, PageUtil pageUtil);
    Product get(Integer product_Id);
    Integer getTotal(Product product,Byte[] product_isEnabled_array);

    List<Product> getMoreList(Product product, Byte[] bytes, OrderUtil orderUtil, PageUtil pageUtil, String[] product_name_split);

    Integer getMoreListTotal(Product product, Byte[] bytes, String[] product_name_split);
}
