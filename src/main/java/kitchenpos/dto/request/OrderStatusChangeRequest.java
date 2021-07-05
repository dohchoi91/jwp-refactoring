package kitchenpos.dto.request;

import kitchenpos.domain.order.OrderStatus;

public class OrderStatusChangeRequest {
    private OrderStatus orderStatus;

    public OrderStatusChangeRequest() {
    }

    public OrderStatusChangeRequest(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }
}