package com.hust.itep.aims.entity.cart;

import com.google.code.beanmatchers.BeanMatchers;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.Instant;

import static com.google.code.beanmatchers.BeanMatchers.*;
import static org.hamcrest.CoreMatchers.allOf;
import static org.hamcrest.MatcherAssert.assertThat;
public class CartMediaTest {

    @Test
    public void shouldHaveANoArgsConstructor() {
        assertThat(CartMedia.class, hasValidBeanConstructor());
    }

    @Test
    public void gettersAndSettersShouldWorkForEachProperty() {
        assertThat(CartMedia.class, hasValidGettersAndSetters());
    }


}