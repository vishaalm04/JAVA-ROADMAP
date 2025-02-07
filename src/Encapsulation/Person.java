package Encapsulation;



    public class Person {
        // Private variables (encapsulation)
        private String name;
        private int age;
        private String str;

        // Constructor
        public Person(String name, int age, String ssn) {
            this.name = name;
            this.age = age;
            this.str = ssn;
        }

        // Getter for 'name'
        public String getName() {
            return name;
        }

        // Setter for 'name'
        public void setName(String name) {
            this.name = name;
        }

        // Getter for 'age'
        public int getAge() {
            return age;
        }

        // Setter for 'age'
        public void setAge(int age) {
            if (age > 0) {
                this.age = age;
            } else {
                System.out.println("Invalid age. Age must be positive.");
            }
        }

        // No getter/setter for 'str' to keep it hidden (Not accessible)


}
