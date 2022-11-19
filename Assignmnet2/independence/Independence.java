package Assignmnet2.independence;

public class Independence {
    public class person {
        String name;
        int age;
        String address;

        public void setAge(int age) {
            this.age = age;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public String getAddress() {
            return address;
        }

        public String getName() {
            return name;
        }
    }

    public void hello()
    {
        System.out.println("Hello person");
    }

    public class Mobile{
        public String model;
        public int price;
        public int no_of_sim;

        public void setModel(String model) {
            this.model = model;
        }

        public void setPrice(int price) {
            this.price = price;
        }

        public void setNo_of_sim(int no_of_sim) {
            this.no_of_sim = no_of_sim;
        }

        public int getNo_of_sim() {
            return no_of_sim;
        }

        public int getPrice() {
            return price;
        }

        public String getModel() {
            return model;
        }

        public boolean CanPlayGames(){
            // checks if games can be played on mobile //
            return false;
        }
    }

    // The person and mobile class are not dependent on each other. As they are not related
    // there exist independence coupling between them.
}
