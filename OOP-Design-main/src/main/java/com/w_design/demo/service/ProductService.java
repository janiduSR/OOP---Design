package com.w_design.demo.service;

import com.w_design.demo.dto.DigitalProduct;
import com.w_design.demo.dto.PhysicalProduct;
import com.w_design.demo.dto.Product;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {

    List<Product> productList = new ArrayList<>();
    Integer lastId = 1;

    public ProductService() {
        productList.add(new DigitalProduct(lastId++, "E-book", 200.50, "/downloads/books", 4.2));
        productList.add(new PhysicalProduct(lastId++, "Book", 200.50, 2.1, "3D"));
    }


    public List<Product> getProductList() {
        return productList;
    }

    public Product addProduct(Product product) {
        product.setId(lastId++);
        productList.add(product);
        return product;
    }
}
