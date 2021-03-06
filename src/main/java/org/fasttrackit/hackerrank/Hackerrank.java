package org.fasttrackit.hackerrank;

import java.io.*;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Hackerrank {


    class Result {

        /*
         * Complete the 'pickingNumbers' function below.
         *
         * The function is expected to return an INTEGER.
         * The function accepts INTEGER_ARRAY a as parameter.
         */

        public static int pickingNumbers(List<Integer> a) {
            // Write your code here
            Collections.sort(a);
            int longest=1;
            int startIndex=0;
            int num1 = a.get(0);
            int num2 = -1;
            for (int i=0; i<a.size(); i++){
                int n = a.get(i);
                if (num2==-1){
                    if (Math.abs(num1 - n)== 1){
                        num2=n;
                    }else if (num1 != n){
                        longest = Math.max(longest, i - startIndex);
                        startIndex = i;
                        num1 = n;
                    }
                }else {
                    if (n != num1 && n != num2){
                        longest = Math.max(longest, i - startIndex);
                        startIndex = i;
                        num1 = n;
                        num2 = -1;
                    }
                }
            }longest = Math.max(longest, a.size() - startIndex);
            return longest;
        }

    }

    public class Solution {
        public static void main(String[] args) throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

            int n = Integer.parseInt(bufferedReader.readLine().trim());

            List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                    .map(Integer::parseInt)
                    .collect(toList());

            int result = Result.pickingNumbers(a);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();

            bufferedReader.close();
            bufferedWriter.close();
        }
    }

}
