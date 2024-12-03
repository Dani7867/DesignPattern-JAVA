package structural.adapter;

public class Test{
	public static void main(String[] args) {
		Xpay xpay = new XpayImpl();
        xpay.setCreditCardNo("4789565874102365");
        xpay.setCustomerName("Max Warner");
        xpay.setCardExpYear("25");
        xpay.setCardCVVNo((short)235);
        xpay.setAmount(2565.23);
        PayD payD = new PayDAdapter(xpay);
        testPayD(payD);
        
	}
	 private static void testPayD(PayD payD){
	        System.out.println(payD.getCardOwnerName());
	        System.out.println(payD.getCustCardNo());
	        System.out.println(payD.getCVVNo());
	        System.out.println(payD.getTotalAmount());
	        }
}
