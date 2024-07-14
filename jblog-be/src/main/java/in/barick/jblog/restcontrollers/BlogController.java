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
        return blogDAO.save(blog);
    }

    @GetMapping("")
    public List<Blog> getBlogs() {
        return blogDAO.getBlogs();
    }
}
