package com.company;

import com.company.Controller.*;
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
                    CustomerController controller = new CustomerController();

                    String name = controller.getName().substring(controller.getName().lastIndexOf(".") + 1);
                    String entityName = name.substring(0, name.length()-10);

                    menu.entityControllerMenu(entityName);
                    String chosenCustomerAction = scanner.nextLine();
                    main.useController(controller, menu, scanner, chosenCustomerAction, name, entityName);
                    break;
                }
                case "3":{
                    CompanyController controller = new CompanyController();

                    String name = controller.getName().substring(controller.getName().lastIndexOf(".") + 1);
                    String entityName = name.substring(0, name.length()-10);

                    menu.entityControllerMenu(entityName);
                    String chosenCompanyAction = scanner.nextLine();
                    main.useController(controller, menu, scanner, chosenCompanyAction, name, entityName);
                    //doWork = main.useCompanyController(menu, scanner);
                    break;
                }
                case "4":{
                    DistrictController controller = new DistrictController();

                    String name = controller.getName().substring(controller.getName().lastIndexOf(".") + 1);
                    String entityName = name.substring(0, name.length()-10);

                    menu.entityControllerMenu(entityName);
                    String chosenDistrictAction = scanner.nextLine();
                    main.useController(controller, menu, scanner, chosenDistrictAction, name, entityName);
                    //doWork = main.useDistrictController(menu, scanner);
                    break;
                }
                case "5":{
                    HistoryController controller = new HistoryController();

                    String name = controller.getName().substring(controller.getName().lastIndexOf(".") + 1);
                    String entityName = name.substring(0, name.length()-10);

                    menu.entityControllerMenu(entityName);
                    String chosenHistoryAction = scanner.nextLine();
                    main.useController(controller, menu, scanner, chosenHistoryAction, name, entityName);
                    //doWork = main.useHistoryController(menu, scanner);
                    break;
                }
                case "6":{
                    ItemController controller = new ItemController();

                    String name = controller.getName().substring(controller.getName().lastIndexOf(".") + 1);
                    String entityName = name.substring(0, name.length()-10);

                    menu.entityControllerMenu(entityName);
                    String chosenItemAction = scanner.nextLine();
                    main.useController(controller, menu, scanner, chosenItemAction, name, entityName);
                    //doWork = main.useItemController(menu, scanner);
                    break;
                }
                case "7":{
                    OrderController controller = new OrderController();

                    String name = controller.getName().substring(controller.getName().lastIndexOf(".") + 1);
                    String entityName = name.substring(0, name.length()-10);

                    menu.entityControllerMenu(entityName);
                    String chosenOrderAction = scanner.nextLine();
                    main.useController(controller, menu, scanner, chosenOrderAction, name, entityName);
                    //doWork = main.useOrderController(menu, scanner);
                    break;
                }
                case "8":{
                    OrderlineController controller = new OrderlineController();

                    String name = controller.getName().substring(controller.getName().lastIndexOf(".") + 1);
                    String entityName = name.substring(0, name.length()-10);

                    menu.entityControllerMenu(entityName);
                    String chosenOrderlineAction = scanner.nextLine();
                    main.useController(controller, menu, scanner, chosenOrderlineAction, name, entityName);
                    //doWork = main.useOrderlineController(menu, scanner);
                    break;
                }
                case "9":{
                    WarehouseController controller = new WarehouseController();

                    String name = controller.getName().substring(controller.getName().lastIndexOf(".") + 1);
                    String entityName = name.substring(0, name.length()-10);

                    menu.entityControllerMenu(entityName);
                    String chosenWarehouseAction = scanner.nextLine();
                    main.useController(controller, menu, scanner, chosenWarehouseAction, name, entityName);
                    //doWork = main.useWarehouseController(menu, scanner);
                    break;
                }
                case "0":{
                    DatabaseController controller = new DatabaseController();
                    menu.databaseControllerMenu();
                    String chosenDatabaseAction = scanner.nextLine();
                    main.useDatabaseController(controller, chosenDatabaseAction);

                }
                case "Close":{
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
    private void useController(IController controller, ConsoleMenu menu, Scanner scanner, String action, String name, String entityName){

        switch(action){
            //CREATE
            case "1":{
                switch(name){
                    case "CustomerController":
                        this.useCustomerController((CustomerController)controller, scanner);
                        break;
                    case "CompanyController":
                        this.useCompanyController((CompanyController)controller, scanner);
                        break;
                    case "DistrictController":
                        this.useDistrictController((DistrictController)controller, scanner);
                        break;
                    case "HistoryController":
                        this.useHistoryController((HistoryController)controller, scanner);
                        break;
                    case "ItemController":
                        this.useItemController((ItemController)controller, scanner);
                        break;
                    case "OrderController":
                        this.useOrderController((OrderController)controller, scanner);
                        break;
                    case "WarehouseController":
                        this.useWarehouseController((WarehouseController)controller, scanner);
                        break;
                    case "OrderlineController":
                        this.useOrderlineController((OrderlineController)controller, scanner);
                        break;
                }
                break;
            }
            //GET
            case "2":{
                System.out.println("Enter the id of the " +entityName+ " to get: ");
                String id = scanner.nextLine();
                controller.get(id);
                System.out.println("GOT IT");

                break;
            }
            //DELETE
            case "3":{
                System.out.println("Enter the id of the " +entityName+ " to delete: ");
                String id = scanner.nextLine();
                controller.delete(id);
                System.out.println("DELETED");
                break;
            }
            case "4":{
                break;
            }
            case "5":{
                break;
            }
        }
    }

    private void useCustomerController(CustomerController controller, Scanner scanner){
        System.out.println("Enter the name of the customer: ");
        String name = scanner.nextLine();
        controller.create(name);
        System.out.println("CREATED");
    }

    private void useCompanyController(CompanyController controller, Scanner scanner){
        System.out.println("Enter the name of the company: ");
        String name = scanner.nextLine();
        controller.create(name);
        System.out.println("CREATED");
    }

    private void useDistrictController(DistrictController controller, Scanner scanner){
        System.out.println("Enter the name of the district: ");
        String name = scanner.nextLine();
        controller.create(name);
        System.out.println("CREATED");
    }

    private void useHistoryController(HistoryController controller, Scanner scanner){
        System.out.println("Enter the name of the history: ");
        String name = scanner.nextLine();
        controller.create(name);
        System.out.println("CREATED");
    }

    private void useOrderController(OrderController controller, Scanner scanner){
        System.out.println("Enter the name of the order: ");
        String name = scanner.nextLine();
        controller.create(name);
        System.out.println("CREATED");
    }

    private void useItemController(ItemController controller, Scanner scanner){
        System.out.println("Enter the name of the item: ");
        String name = scanner.nextLine();
        controller.create(name);
        System.out.println("CREATED");
    }

    private void useOrderlineController(OrderlineController controller, Scanner scanner){
        System.out.println("Enter the name of the orderline: ");
        String name = scanner.nextLine();
        controller.create(name);
        System.out.println("CREATED");
    }

    private void useWarehouseController(WarehouseController controller, Scanner scanner) {
        System.out.println("Enter the name of the warehouse: ");
        String name = scanner.nextLine();
        controller.create(name);
        System.out.println("CREATED");
    }

    private void useDatabaseController(DatabaseController controller, String chosenAction){
        switch(chosenAction){
            case "1":
                controller.switchDatabaseTo("mysql");
                break;
            case "2":
                controller.switchDatabaseTo("postgres");
                break;
            case "3":
                controller.switchDatabaseTo("mongodb");
                break;
            case "4":
                controller.switchDatabaseTo("neo4j");
                break;
            case "5":
                controller.switchDatabaseTo("infinispan");
                break;
            case "6":
                controller.switchDatabaseTo("cassandra");
                break;
            case "7":
                controller.switchDatabaseTo("redis");
                break;
            case "8":
                break;
        }
    }
}
