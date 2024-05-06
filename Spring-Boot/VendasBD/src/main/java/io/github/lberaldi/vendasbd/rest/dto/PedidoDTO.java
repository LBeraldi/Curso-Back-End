package io.github.lberaldi.vendasbd.rest.dto;

//{
//        "cliente": 1,
//        "total": 100,
//        "itens": [
//        {
//        "produto": 1,
//        "quantidade": 10
//        }
//        ]
//        }

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class PedidoDTO {

    private Integer cliente;
    private BigDecimal total;
    private List<ItemPedidoDTO> itens;
}
