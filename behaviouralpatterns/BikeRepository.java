/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package behaviouralpatterns;

import java.util.Iterator;

/**
 *
 * @author dave
 */
public class BikeRepository implements Iterable<String>
    {
    private String[] bikes;
    private int index;
    
    public BikeRepository()
        {
        bikes = new String[10];
        index = 0;
        }
    
    public void addBike(String bike)
        {
        if(index == bikes.length)
            {
            String[] largerBikes = new String[bikes.length + 5];
            System.arraycopy(bikes, 0, largerBikes, 0, bikes.length);
            bikes = largerBikes;
            largerBikes = null;
            }
        bikes[index] = bike;
        index++;
        }

    @Override
    public Iterator<String> iterator()
        {
        Iterator<String> it = new Iterator<String>()
            {
            private int currentIndex = 0;
            
            @Override
            public boolean hasNext()
                {
                return currentIndex < bikes.length && bikes[currentIndex] != null;
                }

            @Override
            public String next()
                {
                return bikes[currentIndex++];
                }

            @Override
            public void remove()
                {
                throw new UnsupportedOperationException("Not implemented");
                }
            };
        
        return it;
        }
    
    
    }
