package com.hust.itep.aims.entity.shipping;

import com.hust.itep.aims.entity.media.Book;
import org.junit.jupiter.api.Test;

import static com.google.code.beanmatchers.BeanMatchers.hasValidBeanConstructor;
import static com.google.code.beanmatchers.BeanMatchers.hasValidGettersAndSetters;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class DeliveryInfoTest {
    @Test
    public void shouldHaveANoArgsConstructor() {
        assertThat(DeliveryInfo.class, hasValidBeanConstructor());
    }
    @Test
    public void gettersAndSettersShouldWorkForEachProperty() {
        assertThat(DeliveryInfo.class, hasValidGettersAndSetters());
    }
}