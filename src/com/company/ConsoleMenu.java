package com.company;

public class ConsoleMenu {
    public void startUpMenu(){
        System.out.println("=========BPMN CLIENT========");
        System.out.println("What do you want to do? 'Close' for quitting");
        System.out.println("1: Start Example BPMN-Process");
        System.out.println("2: Use Customercontroller");
        System.out.println("3: Use Companycontroller");
        System.out.println("4: Use Districtcontroller");
        System.out.println("5: Use Historycontroller");
        System.out.println("6: Use Itemcontroller");
        System.out.println("7: Use Ordercontroller");
        System.out.println("8: Use Orderlinecontroller");
        System.out.println("9: Use Warehousecontroller");
        System.out.println("=========BPMN CLIENT========");
    }

    public void customerMenu(){
        System.out.println("=========CUSTOMER CONTROLLER========");
        System.out.println("What do you want to do? 'Close' for quitting");
        System.out.println("1: Create Customer");
        System.out.println("2: Get Customer");
        System.out.println("3: Delete Customer");
        System.out.println("4: Update Customer");
        System.out.println("=========CUSTOMER CONTROLLER========");
    }

    public void continueMenu(){
        System.out.println("=========CONTINUE?========");
        System.out.println("1: YES");
        System.out.println("2: NO");
        System.out.println("=========CONTINUE?========");
    }
}
