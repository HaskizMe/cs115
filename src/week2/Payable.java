package week2;

public interface Payable {
	enum PayType {
		CASH,
		CARD,
		PHONE
	}
	PayType getPayType();
	void setPayType(PayType pT);
}
