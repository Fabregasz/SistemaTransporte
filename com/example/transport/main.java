public class Main {
    public static void main(String[] args) {
      
        TransportFactory electricFactory = new ElectricTransportFactory();
        Transport electricTransport = electricFactory.createTransport();
        
      
        electricTransport.move();
        electricTransport.stop();

   
        TransportFactory humanPoweredFactory = new HumanPoweredTransportFactory();
        Transport humanPoweredTransport = humanPoweredFactory.createTransport();
        
     
        humanPoweredTransport.move();
        humanPoweredTransport.stop();
    }
}
