package com.byelkawolf.objecttojson.services;


import org.springframework.stereotype.Service;

@Service
public class RestDemoService {

    /**
     * Fibonacci sequence. Written before writing the montecarlo simulation because I was just playing around with
     * Spring boot.
     * @param nthNum
     * @return
     */
    public int fibonacci(int nthNum) {
        int fibLength = Math.max(nthNum+1,2);
        //+1 to length because I want sequence to ignore leading 0
        int[] fibSeq = new int[fibLength];
        fibSeq[0] = 0;
        fibSeq[1] = 1;
        for(int n=2; n<fibLength;n++){
            fibSeq[n] = fibSeq[n-1] + fibSeq[n-2];
        }
        return fibSeq[nthNum];
    }

}
