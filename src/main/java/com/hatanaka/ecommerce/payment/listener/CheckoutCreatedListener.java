package com.hatanaka.ecommerce.payment.listener;

import com.hatanaka.ecommerce.payment.streaming.CheckoutProcessor;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.stereotype.Component;

@Component
public class CheckoutCreatedListener {

    @StreamListener(CheckoutProcessor.INPUT)
    public void handler(){

    }
}
