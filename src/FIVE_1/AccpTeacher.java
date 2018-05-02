package FIVE_1;

abstract class AccpTeacher {
    String name;
    String workTool;
    String study;
    String summaryQuestion;
    String place;


    public void introduction(){
        System.out.println("大家好！我是"+place+"的"+name);
    }
    public void lesson(){
        System.out.println("启动"+workTool);
        System.out.println(study+'\n'+ summaryQuestion);
    }

}
