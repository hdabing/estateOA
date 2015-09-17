package estate.dao.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by kangbiao on 15-9-17.
 * 基础的Dao实现类,获取回话工厂和提供基础的CURD操作
 */
public class SessionDaoImpl
{
    @Autowired
    private SessionFactory sessionFactory;

    protected Session getSession()
    {
        return sessionFactory.getCurrentSession();
    }

}
