package com.spring.demo.controller;

import com.spring.demo.domain.Hero;
import com.spring.demo.service.HeroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/HeroController",consumes = MediaType.APPLICATION_JSON_UTF8_VALUE,produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
public class HeroController {
    @Autowired
    private HeroService heroService;

    @RequestMapping(value="/getHeroes", method=RequestMethod.GET)
    public Hero[] getHeroes(){
        return heroService.getHeroes();
    }

    @RequestMapping(value = "/getHeroById/{id}", method = RequestMethod.GET)
    public Hero getHeroById(@PathVariable("id") Integer id){
        return heroService.getHeroById(id);
    }
}
