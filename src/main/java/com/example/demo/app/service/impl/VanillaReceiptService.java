package com.example.demo.app.service.impl;

import com.example.demo.app.product.IceCream;
import com.example.demo.app.product.impl.VanillaIceCream;
import com.example.demo.app.service.ReceiptService;
import org.springframework.stereotype.Service;


@Service("demo.vanillaReceiptService")
public class VanillaReceiptService implements ReceiptService {
    @Override
    public IceCream cookByReceipt() {
        return new VanillaIceCream();
    }

    @Override
    public String getName() {
        return "Vanilla";
    }
}
