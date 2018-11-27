package com.taverok.rcmderweb.domain.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Book {
    private String id;
    private String ISBN;
    private String name;
    private String description;
}
