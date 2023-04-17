package com.example.photo_of_the_day.service;

import com.example.photo_of_the_day.entity.Evaluate;
import com.example.photo_of_the_day.repository.PhotoDayRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PhotoDayServiceImpl implements IPhotoDayService {

    @Autowired
    private PhotoDayRepository photoDayRepository;

    @Override
    public void addEvaluate(Evaluate evaluate) {
        photoDayRepository.save(evaluate);
    }

    @Override
    public List<Evaluate> getAll() {
        return (List<Evaluate>) photoDayRepository.findAll();
    }

    @Override
    public Page<Evaluate> findAllWithPaging(Pageable pageable) {
        return photoDayRepository.findAll(pageable);
    }

    @Override
    public Evaluate findById(int id) {
        return photoDayRepository.findById(id).orElse(null);
    }

    @Override
    public void update(Evaluate evaluate) {
        photoDayRepository.save(evaluate);
    }
}
