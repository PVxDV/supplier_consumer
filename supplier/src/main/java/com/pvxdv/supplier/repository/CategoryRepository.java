package com.pvxdv.supplier.repository;

import com.pvxdv.supplier.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
    Category updateCategoryById(Long id, Category category);
    Optional<Category> findCategoryByName(String name);
}