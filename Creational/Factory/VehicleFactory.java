public class VehicleFactory{

    public static Vehicle getVehicle(VehicleType vehicle_name){
       
       switch (vehicle_name) {
           case CAR -> {
               return  (Vehicle) new Car();
            }
               
            case BIKE -> {
                return (Vehicle) new Bike();
            }

            case TRUCK -> {
                return  (Vehicle) new Truck();
            }
           default -> {
            return null;
            }
       }    
           
    }
}    