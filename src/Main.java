import FIVE_1.DBTeacher;
import FIVE_1.DotNetTeacher;
import FIVE_1.GetTeacher;
import FIVE_1.JavaTeacher;
import FIVE_2.ComputerEasyFactory;

public class Main {
    public static  void main(String[] args){
        GetTeacher g= new GetTeacher();
        g.judge(new DotNetTeacher("张明","天津中心","Visual Studio 2005","知识点理解","总结提问"));
        g.judge(new JavaTeacher("李明","北京中心","Eclipse","知识点理解","总结提问"));
        g.judge(new DBTeacher("李岚","天津中心","sql server","知识点理解","总结提问"));


        ComputerEasyFactory.createComputer("hasee").start();
    }
}
