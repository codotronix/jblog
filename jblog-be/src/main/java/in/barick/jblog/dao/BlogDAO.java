package in.barick.jblog.dao;

import in.barick.jblog.entity.Blog;

import java.util.List;

public interface BlogDAO {
    public Blog getBlog(int id);
    public Blog save(Blog blog);
    public Blog update(Blog blog);
    public List<Blog> getBlogs();
    public void deleteBlog(int id);
}
