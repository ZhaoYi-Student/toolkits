package spi.test;

import org.junit.Test;

import java.util.Map;

public class PeopleTest{

    @Test
    public void spiTest(){
        Map<String, People> stringPeopleMap = People.mapList();
        System.out.println(stringPeopleMap);
        stringPeopleMap.get("man").print();
        stringPeopleMap.get("woman").print();
    }

}