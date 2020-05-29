package org.sang.system.service;

import org.sang.beans.entity.User;

import java.util.List;

public interface SysUserService {
    User queryById(Long id);
    List<User> queryAllByLimit(int offset, int limit);
    User insert(User user);
    User update(User user);
    boolean deleteById(Long id);
}
