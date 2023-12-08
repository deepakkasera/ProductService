package com.productservice.productservice.controllers;

import com.productservice.productservice.exceptions.ProductNotFoundException;
import com.productservice.productservice.thirdPartyClients.fakestoreclient.FakeStoreClient;
import jakarta.inject.Inject;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class ProductControllerTest {
    @Inject
    private ProductController productController;

    @Inject
    private FakeStoreClient fakeStoreClient;

//    ProductControllerTest(FakeStoreClient fakeStoreClient) {
//        this.fakeStoreClient = fakeStoreClient;
//    }

    @Test
    @DisplayName("Testing 1 + 1 is 2")
    void testOnePlusOneIsTwoOrNot() {
        //assert(11, 1 + 1, "1 + 1 should be 2");
        //assertEquals(11, 1+1, "1+1 should be 2");
        //assertTrue(2 == 2);
        //Checks the expected value (2) vs the output of the expression.
        //If assert is TRUE, test case succeeds, else fails.
    }

    @Test
    void testGetProductByIdNegativeTC() throws ProductNotFoundException {
        assertThrows(ProductNotFoundException.class, () -> productController.getProductById(10000L));
        //assertNull(fakeStoreClient.getProductById(1L));
    }
}
