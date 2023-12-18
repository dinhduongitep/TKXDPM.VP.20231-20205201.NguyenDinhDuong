package com.hust.itep.aims.entity.payment;

import com.hust.itep.aims.entity.shipping.DeliveryInfo;
import org.junit.jupiter.api.Test;

import static com.google.code.beanmatchers.BeanMatchers.hasValidBeanConstructor;
import static com.google.code.beanmatchers.BeanMatchers.hasValidGettersAndSetters;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class PaymentTransactionTest {
    @Test
    public void shouldHaveANoArgsConstructor() {
        assertThat(PaymentTransaction.class, hasValidBeanConstructor());
    }
    @Test
    public void gettersAndSettersShouldWorkForEachProperty() {
        assertThat(PaymentTransaction.class, hasValidGettersAndSetters());
    }
}