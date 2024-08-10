package com.cursojava.course.repositories;

import com.cursojava.course.entities.Category;
import com.cursojava.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CategoryRepository extends JpaRepository<Category, Long> {
}
