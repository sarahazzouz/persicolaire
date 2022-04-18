public class Payment {
    private String numF ; 
    private boolean statuPay ; 
    Payment(String numF , boolean statuPay) {  
        this.numF =  numF ; 
        this.statuPay = statuPay ; 
    }
    public boolean getStatuPay() {
        return statuPay;
    }
    public String getNumF() {
        return numF;
    }
    public void setNumF(String numF) {
        this.numF = numF;
    }
    public void setStatuPay(boolean statuPay) {
        this.statuPay = statuPay;
    }
}
