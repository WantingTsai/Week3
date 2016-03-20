import java.io.*;
import java.util.*;
public class TokenHashmap {
    public static void main(String[] args) {
        String[] strarray = new String[100];
        String str;
        int[] count = new int[100];
        int sign, c=0, i, j, op;
        for(i = 0;i < 100;i++)
            count[i] = 0;
        HashMap hashMap = new HashMap();
        while(true)
        {
            System.out.print("1.)輸入英文句子, 2)查詢英文字, -1.)End: ");
            Scanner s = new Scanner(System.in);
            op = s.nextInt();
            if(op == -1)
                break;
            else if(op == 1)
            {
                System.out.print("請輸入一串英文句子：");
                str = s.nextLine();
                str = s.nextLine();
                System.out.println(str);
                String[] afterSplit = str.split("[,;\\.!\\s?]+");
                for (i = 0; i < afterSplit.length; i++)
                    afterSplit[i] = afterSplit[i].toLowerCase();
                if(c == 0)
                {
                    strarray[c] = afterSplit[0];
                    count[c]++;
                    c++;
                    i = 1;
                }
                else
                    i = 0;
                for(i = i; i < afterSplit.length; i++)
                {
                    sign = 0;
                    for(j = 0;j < c;j++)
                    {
                        if(strarray[j].compareTo(afterSplit[i]) == 0)
                        {
                            count[j]++;
                            sign = 1;
                        }
                        else
                            continue;
                    }
                    if(sign == 0)
                    {
                        strarray[c] = afterSplit[i];
                        count[c]++;
                        c++;
                    }
                }
                for(i = 0;i < c;i++)
                    hashMap.put(strarray[i], count[i]);
            }
            else if(op == 2)
            {
                System.out.print("請輸入英文字：");
                str = s.next();
                System.out.println("hashMap.get('"+ str +"')=" + hashMap.get(str));
            }
        }
    }
}
