package com.lambdaschool.javaorders.repos;

import org.springframework.data.repository.CrudRepository;

public interface OrdersRepository extends CrudRepository<Order, long>
{
}