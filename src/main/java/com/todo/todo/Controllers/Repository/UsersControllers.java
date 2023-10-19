package com.todo.todo.Controllers.Repository;

import com.todo.todo.Model.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(value = "/users")
public class UsersControllers {
    @Autowired
    private UsersRepository repository;
    @GetMapping
    public List<Users> findAll () {
        List<Users> result = repository.findAll();
        return result;
    }
    @GetMapping("/{id}")
    public Users getUser (@PathVariable Long id) {
        Users result = repository.findById(id).get();
        return result;
    }
    @PostMapping
    public Users saveUser (@RequestBody Users user) {
        Users result = repository.save(user);
        return result;
    }


}
