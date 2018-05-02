package FIVE_2;

public class ComputerEasyFactory {
    public static Computer createComputer(String brands){
        Computer mComputer= null;
        switch (brands){
            case "lenovo":mComputer=new LenovoComputer();
            break;
            case "hasee":mComputer=new HaseeComputer();
                break;
            case "msi":mComputer=new MsiComputer();
                break;
            case "Hp":mComputer=new HpComputer();
                break;
            case "asus":mComputer=new AsusComputer();
                break;
            case "acer":mComputer=new AcerComputer();
                break;
        }
        return mComputer;
    }
}
