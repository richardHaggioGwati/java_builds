package com.payroll;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * To support interacting with orders in the database
 * */
interface OrderRepository extends JpaRepository<Order, Long> {
}
