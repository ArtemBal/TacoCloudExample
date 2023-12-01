package com.example.tacocloud.tacos.data;

import com.example.tacocloud.tacos.TacoOrder;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.Date;
import java.util.List;

public interface OrderRepository extends CrudRepository<TacoOrder, Long> {

    // Method that return all orders delivered to a certain deliveryZip
    // Name of method IS MATTERS!!!
    List<TacoOrder> findByDeliveryZip(String deliveryZip);

    //Method that return all orders delivered to a certain deliveryZip within a certain date range
    // Name of method IS MATTERS!!!
    List<TacoOrder> readOrdersByDeliveryZipAndPlacedAtBetween(String deliveryZip, Date startDate, Date endDate);

    // Name of method IS MATTERS!!!
    List<TacoOrder> findByDeliveryToAndDeliveryCityAllIgnoresCase(String deliveryTo, String deliveryCity);

    // Name of method IS MATTERS!!!
    List<TacoOrder> findByDeliveryCityOrderByDeliveryTo(String city);

    // Or if you want to use your method name use @Query annotation
    @Query("Order o where o.deliveryCity=’Seattle’")
    List<TacoOrder> readOrdersDeliveredInSeattle();
}
