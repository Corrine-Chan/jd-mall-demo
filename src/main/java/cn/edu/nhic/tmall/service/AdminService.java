package cn.edu.nhic.tmall.service;

import cn.edu.nhic.tmall.entity.Admin;
import cn.edu.nhic.tmall.util.PageUtil;

import java.util.List;

public interface AdminService {
    boolean add(Admin admin);
    boolean update(Admin admin);

    List<Admin> getList(String admin_name, PageUtil pageUtil);
    Admin get(String admin_name, Integer admin_id);
    Integer login(String admin_name, String admin_password);
    Integer getTotal(String admin_name);
}
