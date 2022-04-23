package com.heima.estatemanagement.service;

import com.github.pagehelper.Page;
import com.heima.estatemanagement.domain.Community;

import java.util.List;
import java.util.Map;

public interface CommunityService {
//封装完，补全方法
    public List<Community> findAll();

    public Page<Community> search(Map searchMap);//将page中的数据封装到community中

    public Boolean add(Community community);

    public Community findById(Integer id);

    public Boolean update(Community community);

    public Boolean updateStatus(String status, Integer id);

    public Boolean del(List<Integer> ids);
}
