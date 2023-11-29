package com.hemanth.kotlinpipelineone

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.util.ArrayList

@RestController
@RequestMapping("/product")
class ProductController {


    fun products(): List<Product>{
        var products: ArrayList<Product> = ArrayList()
        products.add(Product(1,"Mobile",10))
        products.add(Product(2,"Laptop",10))
        products.add(Product(3,"Bike",2))
        products.add(Product(4,"car",1))
        return products
    }

    @GetMapping("/all")
    fun getAllProducts(): List<Product>{
        return products()
    }

    @GetMapping("/greet")
    fun greeting():String{
        return "Greeting from kotlin restfull server"
    }



}