package com.example.tacocloud.tacos.data;

import com.example.tacocloud.tacos.TacoOrder;

public interface OrderRepository {
    TacoOrder save(TacoOrder order);
}
