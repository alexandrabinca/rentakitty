package com.rentakitty.meow.controller;

import com.rentakitty.meow.dto.Cat;
import com.rentakitty.meow.service.SearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.List;

@RestController
@RequestMapping("/search")
public class SearchController {

    @Autowired
    SearchService searchService;

    /**
     * GET /search : get a page of the cats available between the fromDate and toDate.
     *
     * @param fromDate the start of the time period
     * @param toDate the end of the time period
     * @param pageable the pagination information
     * @return the ResponseEntity with status 200 (OK) and the list of Cat in body
     */
    @GetMapping(params = {"fromDate", "toDate"})
    public ResponseEntity<List<Cat>> getByDates(
            @RequestParam(value = "fromDate") LocalDate fromDate,
            @RequestParam(value = "toDate") LocalDate toDate,
            Pageable pageable) {

        Page<Cat> page = searchService.findByDates(fromDate, toDate, pageable);
        return new ResponseEntity<>(page.getContent(), HttpStatus.OK);
    }
}
