package com.nail.shop.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BaseModel {
    private String id;
    private Long insertUser;
    private Long updateUser;
    private LocalDate insertDate;
    private LocalDate updateDate;
}
