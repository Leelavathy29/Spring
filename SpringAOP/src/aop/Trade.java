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
		//tradeType.charAt(100);//If exception handled using try and catch ..After throwing Advice won't work
		System.out.println("Purchase Block " + tradeType + " with " + numberOfShares);
	}
	
	
	public void purchase(int quantity) {
		System.out.println("Purchase Block " + tradeType + " with " + quantity);
	}
	
	public void purchase(long tradeType, int quantity) {
		System.out.println("Purchase Block " + tradeType + " with " + quantity);
	}
	
	/*
	 * public double interestCalculation(int p, int n, float r) { return (p*n*r) /
	 * 100; }
	 */
	
	@Override
	public String toString() {
		return "Trade [tradeType=" + tradeType + ", numberOfShares=" + numberOfShares + "]";
	}
	
	
	
}
