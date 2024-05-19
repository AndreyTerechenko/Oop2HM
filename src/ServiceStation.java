public class ServiceStation {
    public void check(EngineeringWorks... transports) {
        for (EngineeringWorks transport : transports) {
            transport.service();
        }
    }
}
