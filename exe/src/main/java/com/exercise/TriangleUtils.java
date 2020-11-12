package com.exercise;

import java.util.Arrays;
import java.util.List;

public class TriangleUtils {

    public static char calculateLastLineOfColouredTriangle(String firstRow) {

        Integer lengthOfTriangle = firstRow.length();
        String[][] triangleArray = new String[lengthOfTriangle][lengthOfTriangle];
        triangleArray[0] = firstRow.split("");

        for (int row = 1; row < lengthOfTriangle; row++) {

            for (int currentColumn = 0; currentColumn < triangleArray.length - 1; currentColumn++) {

                Integer previousRow = row - 1;
                String previousColor = triangleArray[previousRow][currentColumn];
                String currnetColor = triangleArray[previousRow][currentColumn + 1];

                if (currnetColor == null) {
                    continue; 
                }
                String colorToAsign = getAssignedColor(previousColor, currnetColor);
                
                triangleArray[row][currentColumn] = colorToAsign;
            }

        }

        return triangleArray[lengthOfTriangle - 1][0].charAt(0);
    }


    private static String getAssignedColor(String firstColor, String secondColor) {
        if (firstColor.equals(secondColor)) {
            return secondColor;
        } 
        String RCOLOR = "R";
        String GCOLOR = "G";
        String BCOLOR = "B";

        List<String> colorsFound = Arrays.asList(firstColor, secondColor);
        if (!colorsFound.contains(RCOLOR)) {
            return RCOLOR;
        }

        if (!colorsFound.contains(GCOLOR)) {
            return GCOLOR;
        }

        if (!colorsFound.contains(BCOLOR)) {
            return BCOLOR;
        }
        
        return "";
    }
}
