package com.productservice.productservice.inheritancerelations.tableperclass;

import com.productservice.productservice.inheritancerelations.tableperclass.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    @Override
    <S extends User> S save(S entity);
}
