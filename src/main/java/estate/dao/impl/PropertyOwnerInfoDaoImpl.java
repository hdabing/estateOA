package estate.dao.impl;

import estate.dao.PropertyOwnerInfoDao;
import estate.entity.database.PropertyOwnerInfoEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by kangbiao on 15-9-26.
 *
 */
@Repository("propertyOwnerInfoDao")
public class PropertyOwnerInfoDaoImpl implements PropertyOwnerInfoDao
{
    @Autowired
    private SessionFactory sessionFactory;

    private Session getSession()
    {
        return sessionFactory.getCurrentSession();
    }


    @Override
    public PropertyOwnerInfoEntity getByPropertyID(Integer id)
    {
        Session session=getSession();
        String hql="from PropertyOwnerInfoEntity t where t.propertyId=:id";
        List list=session.createQuery(hql).setInteger("id",id).list();
        if (list.size()>0)
            return (PropertyOwnerInfoEntity)list.get(0);
        else
            return null;
    }
}