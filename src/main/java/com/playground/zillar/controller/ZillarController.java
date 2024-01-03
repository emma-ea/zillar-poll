package com.playground.zillar.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.playground.zillar.model.GenerateLinkRequest;
import com.playground.zillar.model.ZillarResponse;
import com.playground.zillar.service.ZillarService;

@RestController
@RequestMapping("/v1/")
public class ZillarController {

    private ZillarService service;

    public ZillarController(ZillarService service) {
        this.service = service;
    }

    @PostMapping("poll/generate-link")
    public ResponseEntity<ZillarResponse<String>> generateLink(@RequestBody GenerateLinkRequest req) {
        ZillarResponse<String> res = new ZillarResponse<>();
        res.setCode("00");
        res.setMsg("Generated link");
        res.setData(service.generateLink(req.getStartAt(), req.getExpiresIn()));
        return new ResponseEntity<ZillarResponse<String>>(res, HttpStatus.OK);
    }

    @GetMapping("poll/link")
    public ResponseEntity useLink(@RequestParam String link) {
        service.visitedLink(link);
        return new ResponseEntity(HttpStatus.OK);
    }

}
