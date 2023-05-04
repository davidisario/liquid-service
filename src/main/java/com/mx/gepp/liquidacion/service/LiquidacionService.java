package com.mx.gepp.liquidacion.service;

import org.springframework.stereotype.Service;

import com.mx.gepp.liquidacion.bo.LiquidacionBO;

@Service
public class LiquidacionService {
    
    public String get( Integer idLiquidacion ){
        return "ok";
    }

    public LiquidacionBO add( LiquidacionBO liquidacion){
        return liquidacion;
    }
}
