package com.hust.itep.aims.entity.order;

import com.hust.itep.aims.entity.media.Book;
import org.junit.jupiter.api.Test;

import static com.google.code.beanmatchers.BeanMatchers.hasValidBeanConstructor;
import static com.google.code.beanmatchers.BeanMatchers.hasValidGettersAndSetters;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class OrderMediaTest {
    @Test
    public void shouldHaveANoArgsConstructor() {
        assertThat(OrderMedia.class, hasValidBeanConstructor());
    }
    @Test
    public void gettersAndSettersShouldWorkForEachProperty() {
        assertThat(OrderMedia.class, hasValidGettersAndSetters());
    }
}