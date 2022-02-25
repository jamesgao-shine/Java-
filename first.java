import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class RandomStudent{
    public static void main(String[] args) {
        //创建对象
        Random r=new Random();
        //获取随机数

        ArrayList<Integer> list=new ArrayList<>();

        for (int i=0;i<20;i++){
            int number=r.nextInt(150)+1;
            list.add(number);
        }

        printfunc(list);
        System.out.println("--------------");
        Collections.sort(list);
        System.out.println("max="+list.get(list.size()-1));
        System.out.println("min="+list.get(0));
        System.out.println("--------------");
        avg(list);
        System.out.println("--------------");

    }
    public static void avg(ArrayList<Integer> list){
        int sum=0;
        for (Integer i:list){
            sum+=i;
        }
        System.out.println("avg="+sum/list.size());
    }

    public static void printfunc(ArrayList<Integer> list){
        for (int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
            if ((i+1)%3==0){
                System.out.println();
            }
        }
        System.out.println();
    }
}
