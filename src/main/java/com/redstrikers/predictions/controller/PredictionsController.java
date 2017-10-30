package com.redstrikers.predictions.controller;

import com.redstrikers.predictions.processor.PredictionsProcessor;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/redStrikers/api")
public class PredictionsController {
    @Autowired
    PredictionsProcessor processor;

    @ApiOperation(value = "Returns the list of matches for the week.")
    @RequestMapping("/matchesForTheWeek")
    public ResponseEntity getMatchesForTheWeek() {
        String matchesForTheWeek = processor.getMatchesForTheWeek();


        return new ResponseEntity(matchesForTheWeek, HttpStatus.OK);
    }


}
