package com.mx.gepp.liquidacion.bo;

import java.io.Serializable;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LiquidacionBO implements Serializable {
    
    private static final long serialVersionUID = 1L;
    private Long id;
    private Integer idCedis;
	private Integer idExecutor;
	private Date    date;
    private Float   amount;

}
