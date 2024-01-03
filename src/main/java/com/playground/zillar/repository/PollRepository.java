package com.playground.zillar.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.playground.zillar.entity.Poll;

@Repository
public interface PollRepository extends CrudRepository<Poll, Long> {
    
}
