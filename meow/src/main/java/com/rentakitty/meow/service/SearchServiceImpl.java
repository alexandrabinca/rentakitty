package com.rentakitty.meow.service;

import com.rentakitty.meow.dto.Cat;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.time.LocalDate;

public class SearchServiceImpl implements SearchService {
    @Override
    public Page<Cat> findByDates(LocalDate fromDate, LocalDate toDate, Pageable pageable) {
        return null;
    }
}
