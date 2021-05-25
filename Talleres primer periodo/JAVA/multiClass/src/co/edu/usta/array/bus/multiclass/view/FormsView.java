package co.edu.usta.array.bus.multiclass.view;

import co.edu.usta.array.bus.multiclass.logic.Vehicle;

import javax.swing.*;

public class FormsView {
    private static Vehicle myVehicle;
    //create a program that manage the bus places with difference x for unavailable, D available, O busy
    //the bus have 4 columns but the number of rows be specified by the driver
    public static void main(String[] args) {
        myVehicle = new Vehicle();
        String value, showInfo;
        float showInfoFloat;
        /*
        //read the value
        value=JOptionPane.showInputDialog("Please input the kind of service of your vehicle");
        //set the value in the serviceType variable
        myVehicle.setServiceType(value);
        //get the serviceType value stored in the variable
        showInfo=myVehicle.getServiceType();
        JOptionPane.showMessageDialog(null,"Your kind service for this vehicle is: "+showInfo);

        value=JOptionPane.showInputDialog("Please input the color of your vehicle");
        myVehicle.setColor(value);
        showInfo=myVehicle.getColor();
        JOptionPane.showMessageDialog(null,"Your color for this vehicle is: "+showInfo);

        value=JOptionPane.showInputDialog("Please input the brand of your vehicle");
        myVehicle.setbrand(value);
        showInfo=myVehicle.getBrand();
        JOptionPane.showMessageDialog(null,"Your brand for this vehicle is: "+showInfo);

        value=JOptionPane.showInputDialog("Please input the width in meters of your vehicle");
        myVehicle.setWidth(Integer.parseInt(value));
        showInfoFloat=myVehicle.getWidth();
        JOptionPane.showMessageDialog(null,"Your width in meters for this vehicle is: "+showInfoFloat+" meters.");

        value=JOptionPane.showInputDialog("Please input the height in meters of your vehicle");
        myVehicle.setHeight(Integer.parseInt(value));
        showInfoFloat=myVehicle.getHeight();
        JOptionPane.showMessageDialog(null,"Your height in meters for this vehicle is: "+showInfoFloat+" meters.");

        value=JOptionPane.showInputDialog("Please input the number of doors of your vehicle");
        myVehicle.setDoorsNumber(Integer.parseInt(value));
        showInfoFloat=myVehicle.getDoorsNumber();
        JOptionPane.showMessageDialog(null,"The number of doors for this vehicle is: "+(showInfoFloat));

        value=JOptionPane.showInputDialog("Please input the number of wheels  of your vehicle");
        myVehicle.setwhellsNumber(Integer.parseInt(value));
        showInfoFloat=myVehicle.getWheelsNumber();
        JOptionPane.showMessageDialog(null,"The number of wheels for this vehicle is: "+(showInfoFloat));

        value=JOptionPane.showInputDialog("Please input the plates  in meters of your vehicle");
        myVehicle.setplates(value);
        showInfo=myVehicle.getPlates();
        JOptionPane.showMessageDialog(null,"The number of wheels for this vehicle is: "+showInfo);
*/

        value=JOptionPane.showInputDialog("Please input the number of rows of the bus");
        myVehicle.create_Places_Array(value);
        myVehicle.Int_places_array();
        showInfo= myVehicle.array_to_show();

        JOptionPane.showMessageDialog(null, showInfo);


    }
}
