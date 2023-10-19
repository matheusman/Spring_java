package com.todo.todo.Controllers.Repository;

import com.todo.todo.Model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<Users, Long> {
}
