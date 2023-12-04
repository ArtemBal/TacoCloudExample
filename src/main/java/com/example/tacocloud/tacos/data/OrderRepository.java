package com.example.tacocloud.tacos.data;

import com.example.tacocloud.tacos.TacoOrder;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface OrderRepository extends CrudRepository<TacoOrder, UUID> {
}
