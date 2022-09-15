package com.smac.pcs.statistics.client;

import org.springframework.stereotype.Component;

import com.smac.pcs.statistics.domain.Currency;
import com.smac.pcs.statistics.domain.ExchangeRatesContainer;

import java.util.Collections;

@Component
public class ExchangeRatesClientFallback implements ExchangeRatesClient {

    @Override
    public ExchangeRatesContainer getRates(Currency base) {
        ExchangeRatesContainer container = new ExchangeRatesContainer();
        container.setBase(Currency.getBase());
        container.setRates(Collections.emptyMap());
        return container;
    }
}
