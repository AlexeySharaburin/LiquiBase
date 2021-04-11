package ru.netology.liquidata.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.netology.liquidata.service.DataBaseJDBCService;

@RestController
@RequestMapping("/")
public class DataBaseJDBCController {

    private final DataBaseJDBCService dataBaseJDBCService;

    public DataBaseJDBCController(DataBaseJDBCService dataBaseJDBCService) {
        this.dataBaseJDBCService = dataBaseJDBCService;
    }

    @GetMapping("/products/fetch-product")
    public String getProductName(String name) {
        String product_name = dataBaseJDBCService.getProductName(name);
        System.out.println("Клиент " + name + " купил продукт " + product_name);
        return product_name;
    }
}
