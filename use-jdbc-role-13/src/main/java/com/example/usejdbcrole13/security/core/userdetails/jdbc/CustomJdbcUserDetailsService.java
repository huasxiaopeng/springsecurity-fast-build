package com.example.usejdbcrole13.security.core.userdetails.jdbc;


import com.example.usejdbcrole13.dao.RoleDao;
import com.example.usejdbcrole13.dao.UserDao;
import com.example.usejdbcrole13.po.SysUser;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.util.CollectionUtils;

import java.util.List;

public class CustomJdbcUserDetailsService implements UserDetailsService {

    private UserDao userDao;

    private RoleDao roleDao;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        SysUser sysUser = this.userDao.getByUsername(username);

        User.UserBuilder builder = User.builder()
                .username(sysUser.getUsername())
                .password(sysUser.getPassword());

        List<String> roles = this.roleDao.listRoleCodeByUserId(sysUser.getId());

        if (!CollectionUtils.isEmpty(roles)) {
            builder.roles(roles.toArray(new String[] {}));
        }

        return builder.build();
    }

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public RoleDao getRoleDao() {
        return roleDao;
    }

    public void setRoleDao(RoleDao roleDao) {
        this.roleDao = roleDao;
    }
}
