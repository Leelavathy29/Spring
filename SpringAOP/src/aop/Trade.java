package aop;

public class Trade {

	String tradeType = null;
	
	int numberOfShares = 0;

	public String getTradeType() {
		return tradeType;
	}

	public void setTradeType(String tradeType) {
		this.tradeType = tradeType;
	}

	public int getNumberOfShares() {
		return numberOfShares;
	}

	public void setNumberOfShares(int numberOfShares) {
		this.numberOfShares = numberOfShares;
	}

	
	public void purchase() {
		System.out.println("Inside Purchase Block");
	}
	
	@Override
	public String toString() {
		return "Trade [tradeType=" + tradeType + ", numberOfShares=" + numberOfShares + "]";
	}
	
	
	
}
