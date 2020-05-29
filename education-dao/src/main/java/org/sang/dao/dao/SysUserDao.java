package org.sang.dao.dao;

import org.apache.ibatis.annotations.Mapper;
import org.sang.beans.entity.SysRole;
import org.sang.beans.entity.SysUser;

import java.util.List;

/**
 * 用户接口
 */
@Mapper
public interface SysUserDao {

    SysUser getSysUserByUsername(String username);

    List<SysRole> listGetSysRoleById(Long id);
}
