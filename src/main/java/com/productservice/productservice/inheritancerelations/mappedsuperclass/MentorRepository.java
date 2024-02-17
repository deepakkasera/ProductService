package com.productservice.productservice.inheritancerelations.mappedsuperclass;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("ms_mentorrepository")
public interface MentorRepository extends JpaRepository<Mentor, Long> {
    @Override
    Mentor save(Mentor mentor);
}
