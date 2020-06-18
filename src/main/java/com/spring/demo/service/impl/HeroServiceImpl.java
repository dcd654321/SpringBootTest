package com.spring.demo.service.impl;

import com.spring.demo.domain.Hero;
import com.spring.demo.repository.HeroDao;
import com.spring.demo.service.HeroService;
import org.omg.CORBA.INTERNAL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HeroServiceImpl implements HeroService {
    @Autowired
    private HeroDao heroDao;

    @Override
    public Hero[] getHeroes() {
        return heroDao.getHeros();
    }

    @Override
    public Hero getHeroById(Integer id) {
        return heroDao.getHeroById(id);
    }
}
