package Assignmnet2.stampCoupling;

public class StampCoupling {
    public class Mobile{
        String model;
        int price;

        public void setModel(String model) {
            this.model = model;
        }
        public String getModel() {
            return model;
        }
    }
    public class Product{
        Mobile var;
        public void Print(Mobile mobile){
            System.out.println("Mobile model is: " + mobile.model);
        }
    }

}

// Here, the signature of Class Product's function Print() has Class Mobile as its argument or return type.
// This sort of coupling is called Stamp Coupling

