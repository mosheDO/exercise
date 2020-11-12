package com.tipalti;

public class GraphUtil {
    
    static boolean[][] graphOfPersons;
    static int lengthOfGraph;
    static Person[] listOfPeople;


    public static void initGraph(Person[] people) {
        listOfPeople = people;
        lengthOfGraph = listOfPeople.length;

        graphOfPersons = new boolean[lengthOfGraph][lengthOfGraph];

        for (int row = 0; row < lengthOfGraph; row++) {
            Person personOfExistingRow = listOfPeople[row];
            for (int column = 0; column < people.length; column++) {
               if (isPeopleConnected(personOfExistingRow, listOfPeople[column])) {
                    graphOfPersons[row][column] = true;
               }
            }
        }
    }

    private static boolean isPeopleConnected(Person personA, Person personB) {
        if (personA.fullName.equals(personB.fullName) || personA.address.equals(personB.address)) {
            return true;
        }
        return false;
    }

    public static int findMinRelationLevel(Person personA, Person personB) {
        
        return -1;
    }

  

}