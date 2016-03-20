import java.io.*;
import java.util.*;
public class StringToken {
    public static void main(String[] args) {
        int count = 0, i, j, sum;
        String str;
        ArrayList<String> myList = new ArrayList<String>();
        System.out.print("請輸入一串英文句子：");
        Scanner s = new Scanner(System.in);
        str = s.nextLine();
        System.out.println(str);
        String[] afterSplit = str.split("[,;\\.!\\s?]+");
        System.out.println("切割:");
        for (i = 0; i < afterSplit.length; i++)
        {
            System.out.print(afterSplit[i] + "\t");
            afterSplit[i] = afterSplit[i].toLowerCase();
        }
        for(i = 0; i < afterSplit.length; i++)
        {
            if(afterSplit[i].matches("[a-z]+") == true)
            {
                myList.add(afterSplit[i]);
                count++;
            }
            else if(afterSplit[i].matches("[0-9]+") == true)
            {
                str = "";
                sum = 0;
                for(j = 0;j < afterSplit[i].length();j++)
                {
                    str += afterSplit[i].charAt(j);
                    sum += afterSplit[i].charAt(j) - '0';
                }
                str += "=>" + sum;
                myList.add(str);
                count++;
            }
        }
        System.out.println("\n字串陣列:");
        for(i = 0;i < count;i++)
            System.out.println(myList.get(i));
    }
    
}
