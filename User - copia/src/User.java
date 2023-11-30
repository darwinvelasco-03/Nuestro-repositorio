    public class User { 
    
    private String nombre;
    private String lastName;    
    private String email;
    private String password;
    private String phoneNumber;
    private int edad;
    private String userName;

    //Getters
    
    public String getNombre() {
        return nombre;
    }
    public int getEdad() {
        return edad;
    }
    public String getLastName() {
        return lastName;
    }
    public String getEmail() {
        return email;
    }
    public String getPassword() {
        return password;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public String getUserName() {
        return userName;
    }
    
    
        //Setters   

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
   
    public void setPassword(String password) {
        this.password = password;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    
}
