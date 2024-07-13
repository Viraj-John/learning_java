package org.learning;

public class StringReverse {
    public static void main(String[] args) {

        String forRev = "Test this String";
        char[] refArray = forRev.toCharArray();

        int left = 0;
        int right = refArray.length -1;
        char temp;

        while(left<right)
        {
            temp = refArray[left];
            refArray[left] = refArray[right];
            refArray[right] = temp;

            left++;
            right--;
        }

        System.out.println(new String(refArray));

    }
}
