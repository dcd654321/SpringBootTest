package com.spring.demo.service;

import com.spring.demo.domain.Hero;

public interface HeroService {
    public Hero[] getHeroes();
    public Hero getHeroById(Integer id);
}
