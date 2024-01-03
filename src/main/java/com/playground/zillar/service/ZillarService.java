package com.playground.zillar.service;

import java.time.LocalDateTime;

import org.springframework.stereotype.Service;

import com.playground.zillar.entity.Poll;
import com.playground.zillar.repository.PollRepository;
import com.playground.zillar.util.RandomStringGenerator;

@Service
public class ZillarService {

    private final PollRepository repository;

    public ZillarService(PollRepository repository) {
        this.repository = repository;
    }

    public void visitedLink(String link) {
        // TODO
    }

    public String generateLink(LocalDateTime startAt, int expiresIn) {
        String str = RandomStringGenerator.generateString(5,  "");
        Poll p = new Poll();
        p.setStartAt(startAt);
        p.setExpiresIn(startAt.plusDays(expiresIn));
        p.setGeneratedStr(str);
        repository.save(p);
        return str;
    }
    
}
