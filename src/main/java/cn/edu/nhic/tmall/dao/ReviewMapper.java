package cn.edu.nhic.tmall.dao;

import cn.edu.nhic.tmall.entity.Review;
import cn.edu.nhic.tmall.util.PageUtil;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ReviewMapper {
    Integer insertOne(@Param("review") Review review);
    Integer updateOne(@Param("review") Review review);
    Integer deleteList(@Param("review_id_list") Integer[] review_id_list);

    List<Review> select(@Param("review") Review review, @Param("pageUtil") PageUtil pageUtil);
    List<Review> selectByUserId(@Param("user_id") Integer user_id, @Param("pageUtil") PageUtil pageUtil);
    List<Review> selectByProductId(@Param("product_id") Integer product_id, @Param("pageUtil") PageUtil pageUtil);
    Review selectOne(@Param("review_id") Integer review_id);
    Integer selectTotal(@Param("review") Review review);
    Integer selectTotalByUserId(@Param("user_id") Integer user_id);
    Integer selectTotalByProductId(@Param("product_id") Integer product_id);

    Integer selectTotalByOrderItemId(@Param("productOrderItem_id") Integer productOrderItem_id);
}
