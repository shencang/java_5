package FIVE_1;

public class DotNetTeacher extends AccpTeacher{

    public DotNetTeacher( String name,String place,String workTool, String study,String summaryQuestion) {
        this.name = name;
        this.workTool = workTool;
        this.study = study;
        this.summaryQuestion = summaryQuestion;
        this.place= place;
    }

    @Override
    public void introduction() {
        super.introduction();
    }

    @Override
    public void lesson() {
        super.lesson();
    }
}
