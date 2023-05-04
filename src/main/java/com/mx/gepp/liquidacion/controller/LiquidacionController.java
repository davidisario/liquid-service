package com.mx.gepp.liquidacion.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mx.gepp.liquidacion.bo.LiquidacionBO;
import com.mx.gepp.liquidacion.service.LiquidacionService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequestMapping(value="/liquidaciones")
@RestController
public class LiquidacionController {
    
    @Autowired
    private LiquidacionService liquidacionService;
    
    @GetMapping(value = "/info/{idLiquidacion}")
	public ResponseEntity<String> get( @PathVariable Integer idLiquidacion) {
        log.info("Get liquidacion  -->>>> {}", idLiquidacion);
        HttpHeaders headers = new HttpHeaders();
        headers.add("GEPP_STATUS", "OK");
        
        liquidacionService.get(idLiquidacion);
        return new ResponseEntity<>("Gepp API Rest Get Liquidacion " + idLiquidacion , headers, HttpStatus.OK);
    }

    @PutMapping(value = "/new")
	public ResponseEntity<LiquidacionBO> add( @RequestBody LiquidacionBO liquidacion) {
        log.info("Put liquidacion  -->>>> {}", liquidacion.getAmount());
        liquidacion.setId(1L);
        HttpHeaders headers = new HttpHeaders();
        headers.add("GEPP_STATUS", "OK");
        liquidacionService.add(liquidacion); 
        return new ResponseEntity<LiquidacionBO>( liquidacion , headers, HttpStatus.OK);
    }
}
