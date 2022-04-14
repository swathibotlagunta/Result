package com.swathi.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.swathi.data.model.Result;

@Repository
public interface ResultRepository extends JpaRepository<Result, Integer> {

}
