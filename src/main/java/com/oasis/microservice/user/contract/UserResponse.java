package com.oasis.microservice.user.contract;

import com.oasis.microservice.user.domain.Address;
import lombok.Data;

import java.util.List;

@Data
public class UserResponse {
    private String id;
    private String firstName;
    private String lastName;
    private String email;
    private Address billingAddress;
    private List<AddressResponse> shipppingAddresses;
    private List<CreditCardResponse> creditCards;
    private List<OrderResponse> orders;
}