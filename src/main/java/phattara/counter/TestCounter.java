
package phattara.counter;

/**
 *
 * @author koonp@641102064111
 * Create on 10:27:08 AM Sep 14, 2022
 * This file is part of "phattara.counter" Package.
 */
public class TestCounter {
    public static void main(String[] args){
        Counter c = new Counter();
        c.countUp();
        System.out.println(c.getNumber());
        for(int i = 0;i<20;i++){
            c.countUp();
        }
        System.out.println(c.getNumber());
    }

}

