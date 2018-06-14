
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
        System.out.println("0: Use Databasecontroller");
        System.out.println("=========BPMN CLIENT========");
    }

    public void entityControllerMenu(String entityname){
        System.out.println("=========" +entityname.toUpperCase() + " CONTROLLER========");
        System.out.println("What do you want to do?");
        System.out.println("1: Create " + entityname);
        System.out.println("2: Get " + entityname);
        System.out.println("3: Delete " + entityname);
        System.out.println("4: Update " + entityname);
        System.out.println("5: Return to mainmenu");
        System.out.println("=========" +entityname.toUpperCase() + " CONTROLLER========");
    }

    public void databaseControllerMenu(){
        System.out.println("=========DATABASE CONTROLLER========");
        System.out.println("Choose database you want to switch to: ");
        System.out.println("1: MySQL");
        System.out.println("2: Postresql");
        System.out.println("3: MongoDB");
        System.out.println("4: Neo4J");
        System.out.println("5: Infinispan");
        System.out.println("6: Cassandra");
        System.out.println("7: Redis");
        System.out.println("8: Return to mainmenu");
        System.out.println("=========DATABASE CONTROLLER========");
    }
}