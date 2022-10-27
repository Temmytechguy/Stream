package com.temmytechie.InterviewQuestions;

public class RemovingNonAlphaNumericCharacter {

    public static void main(String[] args) {

        // Test Case 1:
        String s1  = "Interview!@Kickstart23";
        // calling the function
        s1 = rmvNonalphanum(s1);
        System.out.println(s1);

        // Test Case 2:
        String s2 = "Interview_{@Kick}start";
        // calling the function
        s2 = rmvNonalphanum(s2);
        System.out.println(s2);

        // Test Case 3:
        String s3  = "InterviewKickstart23";
        // calling the function
        s3 = rmvNonalphanum(s3);
        System.out.println(s3);

        // Test Case 3 method 2:

        String s4 = "Interview_{@Kick}start";
        // calling the function
        s4 = rmvNonalphnum(s4);
        System.out.println(s4);

        // Method3 replaceALL Test Case 6:

        String s5  = "Interview!@Kickstart23";

        // calling the function

        String s5Result = rmvNonalphnumMethod3(s5);

        System.out.println(s5Result);




    }

    //method 1
    public static String rmvNonalphanum(String s)
    {
        String temp="";

        for(int i = 0; i < s.length(); i++)
        {
            //current character
            char c = s.charAt(i);

            //get the ascii value of current character
            int ascii = Integer.valueOf(c);

            // check if the ascii value in our ranges of alphanumeric and if yes then print the character
            if((ascii>=65 && ascii<=90) || (ascii>=97 && ascii<=122) || (ascii>=48 && ascii<=57))

            {

                temp+=c;

            }

        }
        return temp;
    }

    //Method 2: Using String.replace()
    // Function to remove the non-alphanumeric characters and print the resultant string

    public static String rmvNonalphnum(String s)
    {
        for(int i=0;i<s.length();i++)
        {
            // current character
            char c = s.charAt(i);

            // get the ascii value of current character
            int ascii = Integer.valueOf(c);

            // check if the current character is non-alphanumeric if yes then replace it's all occurrences with empty char ('\0')

            if(!((ascii>=65 && ascii<=90) || (ascii>=97 && ascii<=122) || (ascii>=48 && ascii<=57)))
            {
                s = s.replace(c,'\0');
            }

        }

        // returning the resultant string
        return s;

    }

    //Method 3
    //Function to remove the non-alphanumeric characters and print the resultant string

    public static String rmvNonalphnumMethod3(String s)

    {

        // replacing all substring patterns of non-alphanumeric characters with empty string

        s = s.replaceAll("[^a-zA-Z0-9]", "");

        return s;



    }



}
