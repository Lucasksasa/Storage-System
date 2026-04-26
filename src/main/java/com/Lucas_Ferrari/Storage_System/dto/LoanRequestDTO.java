package com.Lucas_Ferrari.Storage_System.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LoanRequestDTO {

    private Long userId;
    private Long productId;
    private Integer quantity;
}
