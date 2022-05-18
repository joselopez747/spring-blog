package com.codeup.titanspringblog.repositories;

import com.codeup.titanspringblog.models.Coffee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CoffeeRepository extends JpaRepository<Coffee, Long> {
}