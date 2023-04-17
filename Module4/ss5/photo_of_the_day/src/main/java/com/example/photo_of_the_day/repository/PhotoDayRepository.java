package com.example.photo_of_the_day.repository;

import com.example.photo_of_the_day.entity.Evaluate;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PhotoDayRepository extends PagingAndSortingRepository<Evaluate,Integer> {
}
