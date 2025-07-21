public class ScorpioCar {
    public static void main(String[] args) {

        String Engine_Type = "mHAWK 4 Cylinder";
        String Displacement = "2184 cc";
        String Max_Power = "130bhp@3750rpm";
        String Max_Torque = "300Nm@1600-2800rpm";
        byte Num_of_Cylinders = 4;
        byte Valves_per_Cylinder = 4;
        String Fuel_Supply_System = "CRDi";
        boolean Turbo_Charger = true;
        String Transmission_Type = "Manual";
        String Gearbox = "6-Speed";
        String Drive_Type = "RWD";

        System.out.println("Engine & Transmission");
        System.out.println("Engine Type : " +Engine_Type);
        System.out.println("Displacement : " +Displacement);
        System.out.println("Max Power : " +Max_Power);
        System.out.println("Max Torque : " +Max_Torque);
        System.out.println("Num of Cylinders : " +Num_of_Cylinders);
        System.out.println("Valves per Cylinder : " +Valves_per_Cylinder);
        System.out.println("Fuel Supply System : " +Fuel_Supply_System);
        System.out.println("Turbo Charger : " +Turbo_Charger);
        System.out.println("Transmission Type : " +Transmission_Type);
        System.out.println("Gearbox : " +Gearbox);
        System.out.println("Drive Type : " +Drive_Type);
    }
}