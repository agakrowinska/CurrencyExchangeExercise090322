package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyConverterController {
    @GetMapping ("/currency-converter/from/{from}/to/{to}/quantity/{quantity}")

    public CurrencyConverter converter ()
}
