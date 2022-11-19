package Assignmnet2.contentCoupling;

import java.awt.*;

public class ContentCoupling {
    public class Rectangle{
        public int length;
       public int breadth;

    }
    public void main(String[] args)
    {
        Rectangle rectangle=new Rectangle();
        rectangle.length=20;
        rectangle.breadth=10;
    }
}

//Any other class can directly access/change the content of another class. Here,
// the main class , content(attribute) of Rectangle class is being changed.