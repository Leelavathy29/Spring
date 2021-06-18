package model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Trade {
	
	@Value("${tradeType}")
	String tradeType = null;
	
	@Value("${numberOfShares}")
	String numberOfShares = null;
	
	@Value("${accNum}")
	int accNum = 0;

	@Value("${title.name}")
	String name = null;

	public String getTradeType() {
		return tradeType;
	}

	public void setTradeType(String tradeType) {
		this.tradeType = tradeType;
	}

	public String getNumberOfShares() {
		return numberOfShares;
	}

	public void setNumberOfShares(String numberOfShares) {
		this.numberOfShares = numberOfShares;
	}

	public int getAccNum() {
		return accNum;
	}

	public void setAccNum(int accNum) {
		this.accNum = accNum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Trade [tradeType=" + tradeType + ", numberOfShares=" + numberOfShares + ", accNum=" + accNum + ", name="
				+ name + "]";
	}

	
}
