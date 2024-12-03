package structural.adapter;
// adapter
public class PayDAdapter implements PayD{

    private String custCardNo;
    private String cardOwnerName;
    private Integer cVVNo;
    private Double totalAmount;
    
    private final Xpay xpay;
    

    public PayDAdapter(Xpay xpay){
            this.xpay = xpay;
            setProp();
    }
    
    @Override
    public String getCustCardNo() {
            return custCardNo;
}
    @Override
    public String getCardOwnerName() {
            return cardOwnerName;
}
  
    @Override
    public Integer getCVVNo() {
            return cVVNo;
}
    @Override
    public Double getTotalAmount() {
            return totalAmount;
}
    @Override
    public void setCustCardNo(String custCardNo) {
            this.custCardNo = custCardNo;
}
    @Override
    public void setCardOwnerName(String cardOwnerName) {
    		this.cardOwnerName = cardOwnerName;
}
    @Override
    public void setCVVNo(Integer cVVNo) {
            this.cVVNo = cVVNo;
    }
    @Override
    public void setTotalAmount(Double totalAmount) {
            this.totalAmount = totalAmount;
    }

    private void setProp(){
    	setCardOwnerName(this.xpay.getCustomerName()); 
    	setCustCardNo(this.xpay.getCreditCardNo());
    	setCVVNo(this.xpay.getCardCVVNo().intValue());
    	setTotalAmount(this.xpay.getAmount());
    }

}
