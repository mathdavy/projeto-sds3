package com.devsuperior.dsvendas.dto;

import com.devsuperior.dsvendas.entities.Sale;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SaleDTO {
    private Long id;
    private Integer visited;
    private Integer deals;
    private Double amount;
    private LocalDate date;
    private SellerDTO seller;

    public SaleDTO(Sale entity){
        id = entity.getId();
        visited = entity.getVisited();
        deals = entity.getDeals();
        amount = entity.getAmount();
        date = entity.getDate();
        seller = new SellerDTO(entity.getSeller());
    }
}
