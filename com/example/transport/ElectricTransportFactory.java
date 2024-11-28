public class ElectricTransportFactory extends TransportFactory {

   
    public Transport createTransport() {
        
        return new ElectricScooter(); 
    }
}
