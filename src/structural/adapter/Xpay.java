package structural.adapter;
//target
public interface Xpay{
	
	public String getCreditCardNo();
	public String getCustomerName();
	public String getCardExpYear();
	public Short getCardCVVNo();
	public Double getAmount();
	
	public void setCreditCardNo(String creditCardNo);
	public void setCustomerName(String customerName);
	public void setCardExpYear(String cardExpYear);
	public void setCardCVVNo(Short cardCVVNo);
	public void setAmount(Double amount);
}
