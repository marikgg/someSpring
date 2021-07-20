package com.example.demo.app.service.impl;

import com.example.demo.app.product.impl.ChocolateIceCream;
import com.example.demo.app.product.IceCream;
import com.example.demo.app.service.ReceiptService;
import org.springframework.stereotype.Service;


@Service("demo.chocolateReceiptService")
public class ChocolateReceiptService implements ReceiptService {
    @Override
    public IceCream cookByReceipt() {
        return new ChocolateIceCream();
    }

    @Override
    public String getName() {
        return "Chocolate";
    }
}
