package com.productservice.productservice.controllers;

import com.productservice.productservice.dtos.GenericProductDto;
import com.productservice.productservice.exceptions.ProductNotFoundException;
import com.productservice.productservice.models.Product;
import com.productservice.productservice.services.ProductService;
import com.productservice.productservice.thirdPartyClients.fakestoreclient.FakeStoreClient;
import jakarta.inject.Inject;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@SpringBootTest
public class ProductControllerTest {
    @Inject
    private ProductController productController;

    @Inject
    private FakeStoreClient fakeStoreClient;

    @MockBean
    private ProductService productService;

    @Captor
    private ArgumentCaptor<Long> argumentCaptor;

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

//    @Test
//    void testGetProductByIdNegativeTC() throws ProductNotFoundException {
//        assertThrows(ProductNotFoundException.class, () -> productController.getProductById(10000L));
//        //assertNull(fakeStoreClient.getProductById(1L));
//    }


//    @Test
//    void testGetProductByIdMocking() throws ProductNotFoundException {
//        GenericProductDto genericProductDto = new GenericProductDto();
//        when(productService.getProductById(any(Long.class))).thenReturn(genericProductDto);
//
//        GenericProductDto genericProductDto1 = productController.getProductById(875897L);
//
//        //assertNull(productController.getProductById(100L));
//        assertEquals(genericProductDto, genericProductDto1);
//    }

//    @Test
//    void testGetProductByIdMockingException() throws ProductNotFoundException {
//        when(productService.getProductById(1L))
//                .thenThrow(ProductNotFoundException.class);
//
//        assertThrows(ProductNotFoundException.class,
//                () -> productController.getProductById(1L));
//    }

//    @Test
//    void testGetProductByIdForCustomLogic() throws ProductNotFoundException {
//        GenericProductDto genericProductDto = new GenericProductDto();
//
//        when(productService.getProductById(10L))
//                .thenReturn(genericProductDto);
//
//
//        GenericProductDto genericProductDto1 =  productController.getProductById(10L);
//        assertEquals(genericProductDto, genericProductDto1);
//    }

//    @Test
//    @DisplayName("testProductControllerCallsProductServiceWithSameProductIdAsInput")
//    void testIfSameInput() throws ProductNotFoundException {
//        //This is the test case to check if productController is passing the same productId to the
//        //productService as the input.
//        Long id = 100L;
//
//        when(productService.getProductById(id)).thenReturn(new GenericProductDto());
//
//        GenericProductDto genericProductDto =  productController.getProductById(id);
//
//        verify(productService).getProductById(argumentCaptor.capture());
//
//        assertEquals(id, argumentCaptor.getValue());
//    }
}
