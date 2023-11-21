package com.codingame.backendbp.bpclientservice.dto;

public record ClientResponse(
    long id,
    String name,
    String gender,
    int age,
    String address,
    String phone,
    boolean status
) {
    
}
