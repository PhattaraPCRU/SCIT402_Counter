
package phattara.counter;

/**
 *
 * @author koonp@641102064111
 * Create on 10:25:33 AM Sep 14, 2022
 * This file is part of "phattara.counter" Package.
 */
public class Counter {
    private int number;
    public int getNumber() {
        return number;
    }
    public void countUp(){
        if(number<10){
            number++;
        }
    }
    public void countDown(){
        if(number>0){
            number--;
        }
    }

}

