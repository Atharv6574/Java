public class DataTypesDemo {
    public static void main(String[] args) {
        
        // Primitive data types
        int age = 25;                
        double salary = 55000.50;
        char grade = 'A';             
        boolean isEmployed = true;   
        float height = 5.9f;         
        byte level = 10;             
        short distance = 150;        
        long population = 7800000000L;
        
        // Non-primitive data types 
        String name = "John Doe";    
        int[] numbers = {1, 2, 3, 4}; 
        System.out.println("Primitive Data Types:");
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
        System.out.println("Grade: " + grade);
        System.out.println("Employed: " + isEmployed);
        System.out.println("Height: " + height);
        System.out.println("Level: " + level);
        System.out.println("Distance: " + distance);
        System.out.println("Population: " + population);
        System.out.println("\nNon-Primitive Data Types:");
        System.out.println("Name: " + name);
        System.out.print("Numbers: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}
