package in.barick.jblog.restcontrollers;

import in.barick.jblog.dao.BlogDAO;
import in.barick.jblog.entity.Blog;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api/blogs")
public class BlogController {

    private BlogDAO blogDAO;

    public BlogController(BlogDAO blogDAO) {
        this.blogDAO = blogDAO;
    }

    @PostMapping("")
    public Blog saveBlog(@RequestBody Blog blog) {
//        return blog;
        // Id should be null while saving a new blog
        blog.setId(null);
        return blogDAO.save(blog);
    }

    @PutMapping("")
    public Blog updateBlog(@RequestBody Blog blog) {
        return blogDAO.update(blog);
    }

    @GetMapping("")
    public List<Blog> getBlogs() {
        return blogDAO.getBlogs();
    }

    @GetMapping("/{id}")
    public Blog getBlog(@PathVariable int id) {
        return blogDAO.getBlog(id);
    }

    @DeleteMapping("/{id}")
    public String deleteBlog(@PathVariable int id) {
        blogDAO.deleteBlog(id);
        return "Deleted blog with id: " + id;
    }
}
