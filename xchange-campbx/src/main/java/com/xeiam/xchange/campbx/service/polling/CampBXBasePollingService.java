package com.xeiam.xchange.campbx.service.polling;

import java.util.Arrays;
import java.util.List;

import com.xeiam.xchange.ExchangeSpecification;
import com.xeiam.xchange.currency.CurrencyPair;
import com.xeiam.xchange.service.BaseExchangeService;
import com.xeiam.xchange.service.polling.BasePollingService;

/**
 * @author timmolter
 */
public class CampBXBasePollingService extends BaseExchangeService implements BasePollingService {

  public static final List<CurrencyPair> CURRENCY_PAIRS = Arrays.asList(

  CurrencyPair.BTC_USD

  );

  /**
   * Constructor
   * 
   * @param exchangeSpecification
   */
  public CampBXBasePollingService(ExchangeSpecification exchangeSpecification) {

    super(exchangeSpecification);
  }

  @Override
  public List<CurrencyPair> getExchangeSymbols() {

    return CURRENCY_PAIRS;
  }
}
