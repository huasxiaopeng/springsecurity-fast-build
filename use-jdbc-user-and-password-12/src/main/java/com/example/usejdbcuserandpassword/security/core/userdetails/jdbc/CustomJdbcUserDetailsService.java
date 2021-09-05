package com.example.usejdbcuserandpassword.security.core.userdetails.jdbc;



import com.example.usejdbcuserandpassword.dao.UserDao;
import com.example.usejdbcuserandpassword.po.SysUser;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class CustomJdbcUserDetailsService implements UserDetailsService {

    private UserDao userDao;

    /**
     *   从数据库查询用户名和密码
     * @param username
     * @return
     * @throws UsernameNotFoundException
     */
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        SysUser sysUser = this.userDao.getByUsername(username);

        UserDetails user = User.builder()
                .username(sysUser.getUsername())
                .password(sysUser.getPassword())
                .roles("User")
                .build();

        return user;
    }

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
}
