package ru.chagay.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.chagay.models.Company;

@Repository
public interface CompanyRepository extends JpaRepository<Company, Long> {

}