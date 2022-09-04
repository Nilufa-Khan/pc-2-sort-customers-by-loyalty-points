package com.jap.customers;


import java.util.Comparator;
import java.util.List;

// Implement the Comparator interface
public class LoyaltyPointComparator implements Comparator<Customer> {



    @Override
    public int compare(Customer o1, Customer o2) {
        if(o1.getLoyaltyPoints() == o2.getLoyaltyPoints()){
            return  0;
        }else if(o1.getLoyaltyPoints() < o2.getLoyaltyPoints()){
            return  -1;
        }
        return 1;
    }
}
