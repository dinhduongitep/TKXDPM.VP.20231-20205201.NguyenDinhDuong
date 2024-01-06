package com.hust.itep.aims.entity.media;

import com.hust.itep.aims.entity.invoice.Invoice;
import org.junit.jupiter.api.Test;

import static com.google.code.beanmatchers.BeanMatchers.hasValidBeanConstructor;
import static com.google.code.beanmatchers.BeanMatchers.hasValidGettersAndSetters;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class BookTest {
    @Test
    public void shouldHaveANoArgsConstructor() {
        assertThat(Book.class, hasValidBeanConstructor());
    }
    @Test
    public void gettersAndSettersShouldWorkForEachProperty() {
        assertThat(Book.class, hasValidGettersAndSetters());
    }
}