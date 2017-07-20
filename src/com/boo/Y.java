package com.boo;
//import static com.foo.*;
import static com.foo.X.*;
//import static X;
//import com.foo.X.LOGICID;
import com.foo.*;

public class Y {

    public static void main(String[] args){
       X x = new X();
       x.apply(LOGICID);
    }

}
