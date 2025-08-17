package com.hexa.curriculum.controller;

import lombok.Getter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class CurriculumController {

    @GetMapping("")
    public String getCurriculum() {
        return "Curriculum4 ";
    }
}
