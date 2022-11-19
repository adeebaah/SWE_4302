package Assignmnet2.controlCoupling;

public class ControlCoupling {
    public boolean flag;

   public class AttackClass{
       public void AttackStrategy()
       {
           if(flag=true)
           {
               System.out.println("Attack Opponent");
           }
           else
               System.out.println("Don't attack opponent");

       }

   }
}

// The property of AttackStrategy of AttackClass solely depends on controlCoupling class.
// Here we are controlling the flow of one method using a flag value from another class.