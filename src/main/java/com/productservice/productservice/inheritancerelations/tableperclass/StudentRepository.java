package com.productservice.productservice.inheritancerelations.tableperclass;

import com.productservice.productservice.inheritancerelations.tableperclass.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
    @Override
    <S extends Student> S save(S entity);
}
