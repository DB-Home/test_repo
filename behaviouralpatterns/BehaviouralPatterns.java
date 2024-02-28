/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package behaviouralpatterns;

import java.util.ArrayList;
import java.util.List;

import java.util.Iterator;
/**
 *
 * @author dave
 */
public class BehaviouralPatterns
    {
    /*
    Visitor demo using the visitor
    public static void main(String[] args)
        {
        PartsOrder order = new PartsOrder();
        order.addPart(new Wheel());
        order.addPart(new Fender());
        order.addPart(new Oil());
        
        order.accept(new AtvPartsShippingVisitor());
        order.accept(new AtvPartsDisplayVisitor());
        }
    */
    /*
    Visitor demo... without the visitor
    */
    public static void main(String[] args)
        {
        PartsOrder order = new PartsOrder();
        order.addPart(new Wheel());
        order.addPart(new Fender());
        order.addPart(new Oil());
        
        double shippingCost = order.calculateShipping();
        
        System.out.println("cost: " + shippingCost);
        }
    */
    /*
    Template demo.
    public static void main(String[] args)
        {
        System.out.println("Web Order:");
        
        OrderTemplate webOrder = new WebOrder();
        webOrder.processOrder();
        
        System.out.println("\nStore Order");
        OrderTemplate storeOrder = new StoreOrder();
        storeOrder.processOrder();
        }
    */
    /*
    Strategy demo.
    public static void main(String[] args)
        {
        CreditCard amexCard = new CreditCard(new AmexStrategy());
        
        amexCard.setNumber("379185883464283");
        amexCard.setDate("04/2020");
        amexCard.setCvv("123");
        System.out.println("Is Amex valid: " + amexCard.isValid());
        
        CreditCard amexCard2 = new CreditCard(new AmexStrategy());
        
        amexCard2.setNumber("379185883464122");
        amexCard2.setDate("04/2017");
        amexCard2.setCvv("234");
        System.out.println("Is Amex valid: " + amexCard2.isValid());
        
        CreditCard visaCard = new CreditCard(new VisaStrategy());
        visaCard.setNumber("4539589763663402");
        visaCard.setDate("05/2018");
        visaCard.setCvv("324");
        System.out.println("Is Amex valid: " + visaCard.isValid());
        }
    */
    /*
    State demo
    public static void main(String[] args)
        {
        Fan fan = new Fan();
        
        System.out.println(fan);
        fan.pullchain();
        
        System.out.println(fan);
        fan.pullchain();
        
        System.out.println(fan);
        fan.pullchain();
        
        System.out.println(fan);
        fan.pullchain();
        
        System.out.println(fan);
        fan.pullchain();
        }
    */
    /*
    Observer
    public static void main(String[] args)
        {
        Subject subject = new MessageStream();
        
        PhoneClient phoneClient = new PhoneClient(subject);
        TabletClient tabletClient = new TabletClient(subject);
        
        phoneClient.addMessage("Here is a new message");
        tabletClient.addMessage("Another new message");
        }
    */
    /*
    Memento demo
    public static void main(String[] args)
        {
        Caretaker caretaker = new Caretaker();
        
        Employee emp = new Employee();
        emp.setName("John Wick");
        emp.setAddress("111 Main Street");
        emp.setPhone("888-555-1212");
        
        System.out.println("Employee before save:           " + emp);
        caretaker.save(emp);
        
        emp.setPhone("444-555-6666");
        caretaker.save(emp);
        System.out.println("Employee after changed phone number: " + emp);
        
        emp.setPhone("333-999-6666"); //don't save this change
        
        caretaker.revert(emp);
        System.out.println("Reverts to last save point: " + emp);
        
        caretaker.revert(emp);
        System.out.println("Reverts to original: " + emp);
        }
    */
    /*
    Mediator.
    public static void main(String[] args)
        {
        Mediator mediator = new Mediator();
        
        Light bedroomLight = new Light("Bedroom");
        Light kitchenLight = new Light("Kitchen");
        
        mediator.registerLight(bedroomLight);
        mediator.registerLight(kitchenLight);
        
        Command turnOnAllLightsCommand = new TurnOnAllLightsCommand(mediator);
        turnOnAllLightsCommand.execute();
        
        Command turnOffAllLightsCommand = new TurnOffAllLightsCommand(mediator);
        turnOffAllLightsCommand.execute();
        }
    */
    /*
    Iterator demo - implementing this pattern allows us to use either an explicit iterator or the newer style for loop
    public static void main(String[] args)
        {
        BikeRepository repo = new BikeRepository();
        
        repo.addBike("Cervelo");
        repo.addBike("Scott");
        repo.addBike("Fuji");
        
        
        Iterator<String> bikeIterator = repo.iterator();
        while(bikeIterator.hasNext())
            System.out.println(bikeIterator.next());
        
        //for(String bike: repo)
        //    System.out.println(bike);
        }
    */
    /*
    Interpreter
    static Expression buildInterpreterTree()
        {
        Expression terminal1 = new TerminalExpression("Lions");
        Expression terminal2 = new TerminalExpression("Tigers");
        Expression terminal3 = new TerminalExpression("Bears");
        
        Expression alt1 = new AndExpression(terminal2, terminal3);
        Expression alt2 = new OrExpression(terminal1, alt1);
        return new AndExpression(terminal3, alt2);
        }
    
    public static void main(String[] args)
        {
        //String context = "Lions";
        //String context = "Tigers";
        //String context = "Bears";
        String context = "Lions Tigers";
        //String context = "Lions Bears";
        
        Expression define = buildInterpreterTree();
        System.out.println(context + " is " + define.interpret(context));
        }
    */
    
    /*
    Command pattern demo
    public static void main(String[] args)
        {
        //for use with 1 & 2
        //Light light = new Light();
        //Switch lightswitch = new Switch();
        
        //1.
        //Command onCommand = new OnCommand(light);
        //lightswitch.storeAndExecute(onCommand);
        
        
        //2. Stores some state
        //Command toggleCommand = new ToggleCommand(light);
        //lightswitch.storeAndExecute(toggleCommand);
        //lightswitch.storeAndExecute(toggleCommand);
        //lightswitch.storeAndExecute(toggleCommand);
        
        //3.
        //Light bedroomLight = new Light();
        //Light kitchenLight = new Light();
        //Switch lightswitch = new Switch();
        
        //Command toggleCommand = new ToggleCommand(bedroomLight);
        //lightswitch.storeAndExecute(toggleCommand);
                
        //List<Light> lights = new ArrayList<>();
        //lights.add(kitchenLight);
        //lights.add(bedroomLight);
        //Command allLightsCommand = new AllLightsCommand(lights);
        
        //lightswitch.storeAndExecute(allLightsCommand);
        }
    */
    /*
    Chain of Responsibility demo
    public static void main(String[] args)
        {
        Director bryan = new Director();
        VP crystal = new VP();
        CEO jeff = new CEO();
        
        bryan.setSuccessor(crystal);
        crystal.setSuccessor(jeff);
        
        Request request = new Request(RequestType.CONFERENCE, 500);
        bryan.handleRequest(request);
        
        request = new Request(RequestType.PURCHASE, 1000);
        bryan.handleRequest(request);
        
        request = new Request(RequestType.PURCHASE, 2000);
        bryan.handleRequest(request);
        }
    */
    }
