package com.vinfast.service;

import com.vinfast.dto.CarDTO;
import com.vinfast.dto.OrderChartDTO;
import com.vinfast.dto.OrderDTO;
import com.vinfast.entity.Car;
import com.vinfast.entity.Order;
import com.vinfast.form.CreateCarForm;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IOrderService {
    List<OrderDTO> getAllOrder();
    List<OrderDTO> searchByIdCustomerOrName(String id);
    boolean deleteOrderById(Long id);

    OrderDTO getOrderById(Long id);

    Page<Order> getOrderByPage(Pageable pageable);

    void createNewOrder(OrderDTO order);

    boolean updateOrder(OrderDTO orderDTO);
    Long getRevenue();
    List<OrderChartDTO> getOrderbyStatus();
    public void updateOrderStatus(Long id, String newStatus);
    List<OrderDTO> searchOrdersByCustomerName(String name);

}
