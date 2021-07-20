package com.example.demo.app.service.impl;

import com.example.demo.app.product.IceCream;
import com.example.demo.app.product.impl.StrawberryIceCream;
import com.example.demo.app.service.ReceiptService;
import org.springframework.stereotype.Service;


@Service("demo.strawberryReceiptService")
public class StrawberryReceiptService implements ReceiptService {
    @Override
    public IceCream cookByReceipt() {
        return new StrawberryIceCream();
    }

    @Override
    public String getName() {
        return "Strawberry";
    }
}
