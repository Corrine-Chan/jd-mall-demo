package cn.edu.nhic.tmall.dao;

import cn.edu.nhic.tmall.entity.Address;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface AddressMapper {
    Integer insertOne(@Param("address") Address address);
    Integer updateOne(@Param("address") Address address);

    List<Address> select(@Param("address_name") String address_name, @Param("address_regionId") String address_regionId);
    Address selectOne(@Param("address_areaId") String address_areaId);
    List<Address> selectRoot();
}