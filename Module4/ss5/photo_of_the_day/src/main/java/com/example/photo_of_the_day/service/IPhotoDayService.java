package com.example.photo_of_the_day.service;

import com.example.photo_of_the_day.entity.Evaluate;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;


public interface IPhotoDayService {
    void addEvaluate(Evaluate evaluate);

    List<Evaluate> getAll();

    Page<Evaluate> findAllWithPaging(Pageable pageable);

    Evaluate findById(int id);

    void update(Evaluate evaluate);
}
