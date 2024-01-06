package com.hust.itep.aims.entity.media;

import org.junit.jupiter.api.Test;

import static com.google.code.beanmatchers.BeanMatchers.hasValidBeanConstructor;
import static com.google.code.beanmatchers.BeanMatchers.hasValidGettersAndSetters;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class DvdTest {
    @Test
    public void shouldHaveANoArgsConstructor() {
        assertThat(Dvd.class, hasValidBeanConstructor());
    }
    @Test
    public void gettersAndSettersShouldWorkForEachProperty() {
        assertThat(Dvd.class, hasValidGettersAndSetters());
    }
}