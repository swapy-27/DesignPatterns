package ratelimiter;

import java.util.PriorityQueue;
import java.util.Queue;

public class SlidingWindow {

    Queue<Long> slidingwindow;
    private int maxTime;

    private int cap;


    SlidingWindow(int time , int capacity){
        this.slidingwindow= new PriorityQueue<>();
        this.maxTime = time;
        this.cap=capacity;
    }

    public boolean grantAccess(){
        long currentTime = System.currentTimeMillis();
        updateQueue(currentTime);

        if(slidingwindow.size()<cap){
            slidingwindow.add(currentTime);
            return true;
        }
        return false;

    }
    
    private void updateQueue(long currentTime){
        long diff = currentTime-slidingwindow.peek();
        while(diff>=maxTime && !slidingwindow.isEmpty()){
            slidingwindow.poll();
            diff = currentTime-slidingwindow.peek();
        }

    }
}
