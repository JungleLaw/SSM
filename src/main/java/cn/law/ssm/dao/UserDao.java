package cn.law.ssm.dao;

import cn.law.ssm.bean.User;
import cn.law.ssm.toolbox.TokenGenerator;
import org.springframework.stereotype.Service;

@Service
public class UserDao extends BaseDao {

    public long insertUser(User user) {
        return getSqlSession().insert(UserDao.class.getName() + ".insertUser", user);
    }

    public long statistics() {
        return getSqlSession().selectOne(UserDao.class.getName() + ".statistics");
    }

    public User findUserById(Long id) {
        return getSqlSession().selectOne(UserDao.class.getName() + ".findUserById", id);
    }

    public User signup(User user) {
        user.setToken(TokenGenerator.retreive());
        getSqlSession().insert(UserDao.class.getName() + ".signup", user);
        return user;
    }
}
