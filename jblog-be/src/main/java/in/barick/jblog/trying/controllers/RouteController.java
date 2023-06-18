package in.barick.jblog.trying.controllers;

import in.barick.jblog.trying.components.Hero;
import in.barick.jblog.trying.components.Superman;
import in.barick.jblog.trying.dao.StudentDAO;
import in.barick.jblog.trying.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class RouteController {

    @Autowired
    Superman sp;
    StudentDAO studentDAO;

    @Autowired
    public RouteController(StudentDAO studentDAO) {
        this.studentDAO = studentDAO;
    }


    @GetMapping(path = "/hello")
    public String helloWorld() {
        return "<h1><center>Welcome to JBLOG</center></h1>";
    }

    @GetMapping(path = "hero")
    public String heroName() {
        return "The name of the hero is " + sp.getName();
    }

    @GetMapping("/hello/{fname}/{lname}")
    public String helloName(@PathVariable String fname, @PathVariable String lname) {
        // create student object
        Student student = new Student(fname, lname, "jambaba@gmail.com");

        // save with the
        this.studentDAO.save(student);

        return "Hello, " + fname + ", your id is = " + student.getId() + "!";
    }

    @GetMapping(path="heroes")
    public List<Hero> heroes() {
        ArrayList<Hero> hs = new ArrayList<Hero>();
        hs.add(new Hero("Superman", "Clark Kent"));
        hs.add(new Hero("Batman", "Bruce Wayne"));
        hs.add(new Hero("Flash", "Barry Allen"));

        return hs;
    }



}
