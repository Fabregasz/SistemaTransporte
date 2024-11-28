public class HumanPoweredTransportFactory extends TransportFactory {

   
    public Transport createTransport() {
       
        return new Bicycle(); 
    }
}
