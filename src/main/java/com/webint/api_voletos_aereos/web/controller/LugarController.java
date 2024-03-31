package com.webint.api_voletos_aereos.web.controller;

import com.webint.api_voletos_aereos.persistence.entity.LugarEntity;
import com.webint.api_voletos_aereos.service.LugarService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/lugar")
public class LugarController extends GenericController<LugarService, LugarEntity, Integer>{
    public LugarController(LugarService service) {
        super(service);
    }
}
