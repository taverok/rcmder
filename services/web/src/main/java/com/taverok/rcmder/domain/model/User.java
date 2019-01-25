package com.taverok.rcmder.domain.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class User {
    public String id;
    public String name;
}
