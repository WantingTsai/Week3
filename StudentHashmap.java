import java.io.*;
import java.util.*;
public class StudentHashmap {
    public static void main(String[] args) {
        String[] student = new String[100];
        String str;
        int[] score = new int[100];
        int op, count=0;
        while(true)
        {
            System.out.print("1.)輸入學生資料, -1)End: ");
            Scanner s = new Scanner(System.in);
            op = s.nextInt();
            if(op == -1)
                break;
            else if(op == 1)
            {
                System.out.print("請輸入學生姓名: ");
                student[count] = s.next();
                System.out.print("請輸入學生成績: ");
                score[count] = s.nextInt();
                count++;
            }
        }
        HashMap hashMap = new HashMap();
        for(int i = 0;i < count;i++)
            hashMap.put(student[i], score[i]);
        while(true)
        {
            System.out.print("1.)查詢學生資料, -1)End: ");
            Scanner s = new Scanner(System.in);
            op = s.nextInt();
            if(op == -1)
                break;
            else if(op == 1)
            {
                System.out.print("請輸入學生姓名: ");
                str = s.next();
                System.out.println("hashMap.get('"+ str +"')="+hashMap.get(str));
            }
        }
    }
}
