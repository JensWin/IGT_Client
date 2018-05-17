package com.company;

import com.company.Controller.CompanyController;
import com.company.Controller.CustomerController;
import com.company.Interface.IController;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
	    ConsoleMenu menu = new ConsoleMenu();
        Scanner scanner = new Scanner(System.in);
	    Boolean doWork = true;

	    while(doWork){
            menu.startUpMenu();
            String chosenAction = scanner.nextLine();
            switch(chosenAction){
                case "1":{

                }
                case "2":{
                    CustomerController customer = new CustomerController();
                    menu.customerMenu();
                    String chosenCustomerAction = scanner.nextLine();
                    doWork = main.useController(customer, menu, scanner, chosenCustomerAction);
                    break;
                }
                case "3":{
                    //doWork = main.useCompanyController(menu, scanner);
                    break;
                }
                case "4":{
                    //doWork = main.useDistrictController(menu, scanner);
                    break;
                }
                case "5":{
                    //doWork = main.useHistoryController(menu, scanner);
                    break;
                }
                case "6":{
                    //doWork = main.useItemController(menu, scanner);
                    break;
                }
                case "7":{
                    //doWork = main.useOrderController(menu, scanner);
                    break;
                }
                case "8":{
                    //doWork = main.useOrderlineController(menu, scanner);
                    break;
                }
                case "9":{
                    //doWork = main.useWarehouseController(menu, scanner);
                    break;
                }
                case "close":{
                    System.exit(0);
                    break;
                }
            }
        }

    }

    /***
     *
     * @param controller
     * @param menu
     * @param scanner
     * @param action
     */
    private boolean useController(IController controller, ConsoleMenu menu, Scanner scanner, String action){
        boolean cont = true;
        switch(action){
            //CREATE
            case "1":{
                String name = controller.getName().substring(controller.getName().lastIndexOf(".") + 1);
                switch(name){
                    case "CustomerController":
                        this.useCustomerController((CustomerController)controller, scanner);
                        break;
                }
                break;
            }
            //GET
            case "2":{
                System.out.println("Enter the id of the customer to get: ");
                String id = scanner.nextLine();
                controller.get(id);
                System.out.println("GOT IT");

                break;
            }
            //DELETE
            case "3":{

            }
        }
        menu.continueMenu();
        String continueWork = scanner.nextLine();
        if(continueWork.equals("2"))cont = false;
        return cont;
    }



    private void useCustomerController(CustomerController controller, Scanner scanner){
        System.out.println("Enter the name of the customer: ");
        String name = scanner.nextLine();
        controller.create(name);
        System.out.println("CREATED");
    }



    /*private boolean useCustomerController(ConsoleMenu menu, Scanner scanner){
        menu.customerMenu();
        CustomerController customer = new CustomerController();
        String chosenCustomerAction = scanner.nextLine();
        Boolean cont = true;
        switch(chosenCustomerAction){
            case "1":{
                System.out.println("Enter the name of the customer: ");
                String name = scanner.nextLine();
                customer.create(name);
                menu.continueMenu();
                String continueWork = scanner.nextLine();
                if(continueWork.equals("2"))cont = false;
                break;
            }
            case "2":{
                System.out.println("Enter the id of the customer to get: ");
                String id = scanner.nextLine();
                customer.get(id);
                menu.continueMenu();
                String continueWork = scanner.nextLine();
                if(continueWork.equals("2"))cont = false;
                break;
            }
            case "3":{
                System.out.println("Enter the id of the customer to delete: ");
                String id = scanner.nextLine();
                customer.delete(id);
                menu.continueMenu();
                String continueWork = scanner.nextLine();
                if(continueWork.equals("2"))cont = false;
                break;
            }
            case "4":{

            }
            case "close":{
                System.exit(0);
                break;
            }
        }
        return cont;
    }*/

    /*private boolean useCompanyController(ConsoleMenu menu, Scanner scanner){
        menu.customerMenu();
        CompanyController company = new CompanyController();
        String chosenCompanyAction = scanner.nextLine();
        Boolean cont = true;
        switch(chosenCompanyAction){
            case "1":{
                System.out.println("Enter the name of the company: ");
                String name = scanner.nextLine();
                company.create(name);
                menu.continueMenu();
                String continueWork = scanner.nextLine();
                if(continueWork.equals("2"))cont = false;
                break;
            }
            case "2":{
                System.out.println("Enter the id of the company to get: ");
                String id = scanner.nextLine();
                company.get(id);
                menu.continueMenu();
                String continueWork = scanner.nextLine();
                if(continueWork.equals("2"))cont = false;
                break;
            }
            case "3":{
                System.out.println("Enter the id of the company to delete: ");
                String id = scanner.nextLine();
                company.delete(id);
                menu.continueMenu();
                String continueWork = scanner.nextLine();
                if(continueWork.equals("2"))cont = false;
                break;
            }
            case "4":{

            }
            case "close":{
                System.exit(0);
                break;
            }
        }
        return cont;
    }*/
}
