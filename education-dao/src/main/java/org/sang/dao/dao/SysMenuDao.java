    package org.sang.dao.dao;

import org.apache.ibatis.annotations.Mapper;
import org.sang.beans.entity.Menu;

import java.util.List;

/**
 *资源接口
 */
@Mapper
public interface SysMenuDao {

    List<Menu> listSysmenuBySysRole();
}
