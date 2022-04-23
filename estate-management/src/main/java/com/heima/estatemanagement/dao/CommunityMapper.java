package com.heima.estatemanagement.dao;

import com.heima.estatemanagement.domain.Community;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;
@Repository//目的就是让service导入时不报红
public interface CommunityMapper extends Mapper<Community> {
}
