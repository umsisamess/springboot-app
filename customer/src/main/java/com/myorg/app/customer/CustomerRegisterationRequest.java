package com.myorg.app.customer;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public record CustomerRegisterationRequest {
    private Integer id;
    String firstName;
    String lastName;
    String email;
}
