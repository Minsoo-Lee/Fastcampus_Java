package ch02;

public class VIPCustomer extends Customer {
    double salesRatio;
    String agentId;

    public double getSalesRatio() {
        return salesRatio;
    }

    public void setSalesRatio(double salesRatio) {
        this.salesRatio = salesRatio;
    }

    public String getAgentId() {
        return agentId;
    }

    public void setAgentId(String agentId) {
        this.agentId = agentId;
    }

    public VIPCustomer() {
        bonusRatio = 0.05;
        salesRatio = 0.1;
        customerGrade = "VIP";
    }

}
