package com.hust.itep.aims.entity.cart;

import org.junit.jupiter.api.Test;

import static com.google.code.beanmatchers.BeanMatchers.hasValidBeanConstructor;
import static com.google.code.beanmatchers.BeanMatchers.hasValidGettersAndSetters;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

public class CartTest {
    @Test
    public void shouldHaveANoArgsConstructor() {
        assertThat(Cart.class, hasValidBeanConstructor());
    }

}