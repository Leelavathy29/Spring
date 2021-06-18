package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import model.Trade;

@RestController
@RequestMapping("/hello")
public class TradeController {

	@Autowired
    Trade trade = null;
	
	@RequestMapping(value="/getTradeData", method = RequestMethod.POST)
	public Trade getTrade(@RequestBody Trade tradeDetails) {
		System.out.println("Trade Details :: " + tradeDetails);
		trade = tradeDetails;
		return trade;
	}
	
}
