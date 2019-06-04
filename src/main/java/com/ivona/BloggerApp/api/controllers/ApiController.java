package com.ivona.BloggerApp.api.controllers;

import com.ivona.BloggerApp.bll.services.BllService;

public abstract class ApiController {
    private BllService service;

    public ApiController(BllService service){
        this.service = service;
    }
}