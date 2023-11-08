package org.example.behavioral_patterns.state_design_pattern;

public class Controller {
    private Accounting accounting;
    private Management management;
    private Sales sales;

    private static Connection connection;
    public Controller(){}

    public Controller(Accounting accounting, Management management, Sales sales) {
        this.accounting = accounting;
        this.management = management;
        this.sales = sales;
    }
    public void open(){
        connection.open();
    }
    public void close(){
        connection.close();
    }
    public void log(){
        connection.log();
    }
    public void update(){
        connection.update();
    }
    public void setAccountingConnection(Accounting accounting){
        connection=accounting;
    }
    public void setSalesConnection(Sales sales){
        connection=sales;
    }
    public void setManagementConnection(Management management){
        connection=management;
    }
}
