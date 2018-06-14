import Controller.*;
import Interface.IController;

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
                    startBPMN();
                    break;
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
                    break;

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

                    case "DistrictController":
                        this.useDistrictController((DistrictController)controller, scanner);
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
        System.out.println("Enter the district of the customer: ");
        String district = scanner.nextLine();
        System.out.println("Enter the pw of the customer: ");
        String pw = scanner.nextLine();
        controller.create(name, district, pw);
        System.out.println("CREATED");
    }


    private void useDistrictController(DistrictController controller, Scanner scanner){
        System.out.println("Enter the name of the district: ");
        String name = scanner.nextLine();
        System.out.println("Enter the name of the warehouse: ");
        String warehouse = scanner.nextLine();
        controller.create(name, warehouse);
        System.out.println("CREATED");
    }



    private void useOrderController(OrderController controller, Scanner scanner){
        System.out.println("Enter the name of the order: ");
        String name = scanner.nextLine();
        System.out.println("Enter the customer of the order: ");
        String customer = scanner.nextLine();
        controller.create(name, customer);
        System.out.println("CREATED");
    }

    private void useItemController(ItemController controller, Scanner scanner){
        System.out.println("Enter the name of the item: ");
        String name = scanner.nextLine();
        System.out.println("Enter the warehouse of the item: ");
        String warehouse = scanner.nextLine();
        System.out.println("Enter the stock of the item: ");
        String stock = scanner.nextLine();
        controller.create(name, warehouse, stock);
        System.out.println("CREATED");
    }

    private void useOrderlineController(OrderlineController controller, Scanner scanner){
        System.out.println("Enter the item of the orderline: ");
        String item = scanner.nextLine();
        System.out.println("Enter the order of the orderline: ");
        String order = scanner.nextLine();
        controller.create(item, order);
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

    public static String getID(String input){
        int start = input.indexOf("\"id\":\"");
        input = input.substring(start+6);
        String output = "";
        for(int i=0; i<input.length();i++){
            if(input.charAt(i)=='\"'){
                break;
            }else{
                output = output + input.charAt(i);
            }
        }
        return output;
    }

    public static void startBPMN(){
        WarehouseController warehouseController = new WarehouseController();
        DistrictController districtController = new DistrictController();
        CustomerController customerController = new CustomerController();
        OrderController orderController = new OrderController();
        NewOrderController newOrderController = new NewOrderController();
        ItemController itemController = new ItemController();
        OrderlineController orderlineController = new OrderlineController();

        String warehouseID = getID(warehouseController.create("warehouse"));
        String district1ID = getID(districtController.create("dis1",warehouseID));
        String district2ID = getID(districtController.create("dis2",warehouseID));
        String customer1ID = getID(customerController.create("Hans", district1ID,"1234"));
        String customer2ID = getID(customerController.create("Olaf", district2ID,"1234"));
        String order1Cust1ID = getID(orderController.create("Order1Cust1", customer1ID));
        String order2Cust1ID = getID(orderController.create("Order2Cust1", customer1ID));
        String order1Cust2ID = getID(orderController.create("Order1Cust2", customer2ID));
        String order2Cust2ID = getID(orderController.create("Order2Cust2", customer2ID));
        newOrderController.create(order1Cust1ID);
        newOrderController.create(order2Cust1ID);
        newOrderController.create(order1Cust2ID);
        newOrderController.create(order2Cust2ID);
        String item1ID = getID(itemController.create("Tastatut",warehouseID,"5"));
        String item2ID = getID(itemController.create("Mausis",warehouseID,"45000"));
        String item3ID = getID(itemController.create("Cola_von_Coca",warehouseID,"420"));
        String item4ID = getID(itemController.create("Chips",warehouseID,"3"));
        String item5ID = getID(itemController.create("Pupsspray",warehouseID,"40000"));
        String item6ID = getID(itemController.create("Klopapier",warehouseID,"7457"));
        String item7ID = getID(itemController.create("Zwiebeln",warehouseID,"5"));
        String item8ID = getID(itemController.create("Zugga",warehouseID,"23"));
        orderlineController.create(item1ID,order1Cust1ID);
        orderlineController.create(item2ID,order1Cust1ID);
        orderlineController.create(item3ID,order1Cust2ID);
        orderlineController.create(item4ID,order1Cust2ID);
        orderlineController.create(item5ID,order2Cust1ID);
        orderlineController.create(item6ID,order2Cust1ID);
        orderlineController.create(item7ID,order2Cust2ID);
        orderlineController.create(item8ID,order2Cust2ID);


    }
}