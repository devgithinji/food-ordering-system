package com.food.ordering.system.domain.valueobject;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Data
public abstract class BaseId<T> {
    private final T value;
}
