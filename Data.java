package records;

import javax.swing.JOptionPane;
/***
 * Clase donde se almacenan los datos de los registros.
 * @editBy Daniel Manzano
 */
class Data {
    private String name;
    private String address;
    private String phoneNumber;
    //parameterized constructor
    public Data(String name, String address, String phoneNumber) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    //method for displaying person record on GUI 
    public void print() {
        JOptionPane.showMessageDialog(null, "Nombre: " + name + "\nDireccion: " 
                + address + "\nNumero Telefonico: " + phoneNumber, "Informacion", JOptionPane.PLAIN_MESSAGE);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
        
}
