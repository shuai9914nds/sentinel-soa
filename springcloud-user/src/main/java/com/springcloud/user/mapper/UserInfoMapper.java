package com.springcloud.user.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.springcloud.user.entity.UserInfo;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * Mapper 接口
 * </p>
 *
 * @author shuai
 * @since 2020-11-24
 */
@Mapper
public interface UserInfoMapper extends BaseMapper<UserInfo> {

}
