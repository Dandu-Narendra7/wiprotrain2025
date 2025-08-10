package com.wipro.mockitodemo;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;

class OrderServiceTest {
	
@Test
	  public void testPlaceOrderReturnsSuccessful() {
        // Mock the OrderService
        OrderService mockOrderService = mock(OrderService.class);
        when(mockOrderService.placeOrder("ORD-01")).thenReturn("successful");
        String result = mockOrderService.placeOrder("ORD-01");
        assertEquals("successful", result);
        verify(mockOrderService).placeOrder("ORD-01");


	}
	

}
