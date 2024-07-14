package in.barick.jblog.dao;

import in.barick.jblog.entity.Blog;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BlogDAOImpl implements BlogDAO {

    private final EntityManager entityManager;

    @Autowired
    public BlogDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    @Transactional
    public Blog save(Blog blog) {
//        entityManager.persist(blog);
        return entityManager.merge(blog);
    }

    @Override
    public List<Blog> getBlogs() {
        TypedQuery<Blog> query = entityManager.createQuery("FROM Blog", Blog.class);
        return query.getResultList();
    }
}
