package estate.dao.impl;

import estate.dao.PictureDao;
import estate.entity.database.PictureEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * Created by kangbiao on 15-9-13.
 *
 */
@Repository(value = "pictureDao")
public class PictureDaoImpl implements PictureDao
{
    @Autowired
    private SessionFactory sessionFactory;

    private Session getSession()
    {
        return sessionFactory.getCurrentSession();
    }

    public String savePictureReturnID(PictureEntity pictureEntity)
    {
        Session session=getSession();
        session.save(pictureEntity);
        return String.valueOf(pictureEntity.getPictureId());
    }
}
