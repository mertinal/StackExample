/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stackexample;

import java.util.ArrayList;
import java.util.Stack;

/**
 *
 * @author Mert İnal
 */
public class Main {

    
    public static void main(String[] args) {
        
         ArrayList<Stack> stacks = new ArrayList<Stack>();
         int i = 0;
         for(i=0;i<3;i++){
              stacks.add(new Stack<Integer>());
         }
         stacks.get(0).add(2);
         stacks.get(1).add(34);
         stacks.get(2).add(15);
         System.out.println(stacks.get(2).elementAt(0));
    }
    
}
