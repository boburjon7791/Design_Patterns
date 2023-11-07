package org.example.structural_patterns.proxy_design_pattern;

public class ProxyInternetAccess implements OfficeInternetAccess{
    private String employeeName;
    private RealInternetAccess realAccess;
    private int role;

    public ProxyInternetAccess(String employeeName, int role) {
        this.employeeName = employeeName;
        this.role=role;
    }

    @Override
    public void grantInternetAccess() {
        if (getRole()>4){
            realAccess=new RealInternetAccess(employeeName);
            realAccess.grantInternetAccess();
        }else {
            System.out.println("No internet access for "+employeeName+". Your job level is below 5");
        }
    }
    public int getRole(){
        /*
        * Here we need to check employee's role number from real database
        * */
        return this.role;
    }
}
