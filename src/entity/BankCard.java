package entity;

public class BankCard {
    private Long cardId;
    private String cardNum;
    private String cardHolder;
    private double balance;
    private boolean active = true;

    public BankCard() {
    }

    public BankCard(Long cardId, String cardNum, String cardHolder, double balance, boolean active) {
        this.cardId = cardId;
        this.cardNum = cardNum;
        this.cardHolder = cardHolder;
        this.balance = balance;
        this.active = active;
    }

    public Long getCardId() {
        return cardId;
    }

    public void setCardId(Long cardId) {
        this.cardId = cardId;
    }

    public String getCardNum() {
        return cardNum;
    }

    public void setCardNum(String cardNum) {
        this.cardNum = cardNum;
    }

    public String getCardHolder() {
        return cardHolder;
    }

    public void setCardHolder(String cardHolder) {
        this.cardHolder = cardHolder;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    @Override
    public String toString() {
        return "BankCard{" +
                "cardId=" + cardId +
                ", cardNum='" + cardNum + '\'' +
                ", cardHolder='" + cardHolder + '\'' +
                ", balance=" + balance +
                ", active=" + active +
                '}';
    }
}
