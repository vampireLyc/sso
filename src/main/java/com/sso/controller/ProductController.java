package com.sso.controller;

import com.sso.dao.ProductMapper;
import com.sso.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Lyc on 2017/10/31.
 */
@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductMapper productMapper;

    @GetMapping("/{id}")
    public Product getProductInfo(@PathVariable("id") Long id){
        return productMapper.select(id);
    }

    @PutMapping("/{id}")
    public Product updateProductInfo(@PathVariable("id") Long id,
                                     @RequestBody Product product){
        if(product!=null) {
            productMapper.update(product);
        }

        return product;
    }
}
