/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pa;


public class Enrollment {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Ejercicio pendiente de realizar");

        Student estudiante1 = new Student("Monica Geller", "A00234");
        Student estudiante2 = new Student("Joe Tribiani", "C22044");
        Student estudiante3 = new Student("Chandler Bing", "A12003");
        Student estudiante4 = new Student("Rachel Green", "B66003");
        LabClass clase1 = new LabClass(3);

        estudiante1.addCredits(24);
        estudiante2.addCredits(56);
        estudiante3.addCredits(6);
        estudiante4.addCredits(12);

        System.out.println("Estudiante 1:");
        System.out.println("nombre: " + estudiante1.getName());
        System.out.println("ID: " + estudiante1.getStudentID());
        System.out.println("login: " + estudiante1.getLoginName());
        System.out.println("créditos: " + estudiante1.getCredits());
        System.out.println("");

        System.out.println("Estudiante 2:");
        System.out.println("nombre: " + estudiante2.getName());
        System.out.println("ID: " + estudiante2.getStudentID());
        System.out.println("login: " + estudiante2.getLoginName());
        System.out.println("créditos: " + estudiante2.getCredits());
        System.out.println("");
        
        System.out.println("Estudiante 3:");
        System.out.println("nombre: " + estudiante3.getName());
        System.out.println("ID: " + estudiante3.getStudentID());
        System.out.println("login: " + estudiante3.getLoginName());
        System.out.println("créditos: " + estudiante3.getCredits());
        System.out.println("");
        
        System.out.println("Estudiante 4:");
        System.out.println("nombre: " + estudiante4.getName());
        System.out.println("ID: " + estudiante4.getStudentID());
        System.out.println("login: " + estudiante4.getLoginName());
        System.out.println("créditos: " + estudiante4.getCredits());
        System.out.println("");
        
        clase1.enrollStudent(estudiante1);
        clase1.enrollStudent(estudiante2);
        clase1.enrollStudent(estudiante3);

        clase1.setInstructor("Luis Sucar");
        clase1.setTime("Martes, 17h");
        clase1.setRoom("Aulario 2");

        System.out.println("Intento de añadir a: Rachel Green");

        clase1.enrollStudent(estudiante4);
        System.out.println("");
        
        clase1.printList();
      
    }
    
}
