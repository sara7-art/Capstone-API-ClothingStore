package org.yearup.controllers;

import org.yearup.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import org.yearup.models.Order;
import org.yearup.models.User;
import org.yearup.service.UserService;

import java.security.Principal;

@RestController
@RequestMapping("/orders")
@CrossOrigin
@PreAuthorize("isAuthenticated()")
public class OrdersController
{
    private final OrderService orderService;
    private final UserService userService;

    @Autowired
    public OrdersController(OrderService orderService,
                            UserService userService)
    {
        this.orderService = orderService;
        this.userService = userService;
    }

    @PostMapping
    public ResponseEntity<Order> checkout(Principal principal)
    {
        String username = principal.getName();

        User user = userService.getByUserName(username);

        Order order = orderService.checkout(user.getId());

        return new ResponseEntity<>(order, HttpStatus.CREATED);
    }
}
