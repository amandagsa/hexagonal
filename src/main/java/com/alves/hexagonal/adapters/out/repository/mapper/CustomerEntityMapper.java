package com.alves.hexagonal.adapters.out.repository.mapper;

import com.alves.hexagonal.adapters.out.repository.entity.CustomerEntity;
import com.alves.hexagonal.application.core.domain.Customer;
import org.mapstruct.Mapper;

@Mapper(componentModel = "string")
public interface CustomerEntityMapper {

    CustomerEntity toCustomerEntity(Customer customer);
}
