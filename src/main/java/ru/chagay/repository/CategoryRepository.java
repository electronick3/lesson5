package ru.chagay.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.chagay.models.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {

}