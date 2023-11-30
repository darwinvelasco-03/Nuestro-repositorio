public class UserP {

    
    
    public static void main(String[] args) {
        User user1 = new User();
        
        
        user1.setEdad(20);
        System.out.println("You´re age is: "+user1.getEdad());
        
        user1.setNombre("Darwin");
        System.out.println("You´re name is: "+user1.getNombre());
        
        user1.setPassword("contraseña123456");
        System.out.println("You´re password is: "+user1.getPassword());
        
        user1.setEmail("curso@correo.com");
        System.out.println("You´re email is: "+user1.getEmail());
        
        user1.setLastName("Velasco");
        System.out.println("You´re last name is: "+user1.getLastName());
        
        user1.setPhoneNumber("3146855380");
        System.out.println("You´re phone number is: "+user1.getPhoneNumber());
        
        user1.setUserName("Davelasco");
        System.out.println("You´re username is: "+user1.getUserName());
}

}      