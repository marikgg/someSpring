package com.example.demo.app.service.impl;

import com.example.demo.app.product.IceCream;
import com.example.demo.app.service.IceCreamMaker;
import com.example.demo.app.service.ReceiptService;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Service("demo.iceCreamMaker")
public class IceCreamMakerImpl implements IceCreamMaker {

    private final Map<String, ReceiptService> receiptServices;

    public IceCreamMakerImpl(final List<ReceiptService> receiptServices) {
        this.receiptServices = new HashMap<>();
        for (final ReceiptService receiptService : receiptServices) {
            this.receiptServices.put(receiptService.getName(), receiptService);
        }
    }

    @Override
    public IceCream make(final String name) {
        return receiptServices.get(name).cookByReceipt();
    }
}
