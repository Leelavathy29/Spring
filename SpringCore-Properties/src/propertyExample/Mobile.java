package propertyExample;

import java.math.BigDecimal;
import java.util.Date;

public class Mobile {

	String modelName = null;
	
	int price = 0;
	
	Date date = null;
	
	BigDecimal decimalValue = null;

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	
	public BigDecimal getDecimalValue() {
		return decimalValue;
	}

	public void setDecimalValue(BigDecimal decimalValue) {
		this.decimalValue = decimalValue;
	}

	@Override
	public String toString() {
		return "Mobile [modelName=" + modelName + ", price=" + price + ", date=" + date + ", decimalValue=" + decimalValue +"]";
	}

}
