package com.food.ordering.system.order.service.domain.valueobject;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.RequiredArgsConstructor;

import java.util.UUID;

@Data
@RequiredArgsConstructor
public class StreetAddress {
    @EqualsAndHashCode.Exclude
    private final UUID id;
    private final String street;
    private final String postalCode;
    private final String city;
}
