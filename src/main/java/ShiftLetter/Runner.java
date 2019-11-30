package ShiftLetter;
import org.apache.commons.lang3.StringUtils;

public class Runner {
    public static String result;
    public static boolean status;
    public static void main(String args[]) {

        if (args.length==0) {
            System.out.println("Parameter Fault!");
            status=false;
            return;
        } else if (args.length==1) {
            String[] tmp=new String[2];
            tmp[0]=args[0];
            tmp[1]="low";
            args=tmp;
        }

        ShiftProgram sp=new ShiftProgram(args[0]);
        if (args[1].equals("up")) {
            sp.run(true);
        }else if (args[1].equals("low")) {
            sp.run(false);
        } else {
            System.out.println("Fault parameter2!");
            status=false;
            return;
        }
        result=sp.toString();
        FileWrite fw=new FileWrite("result"+args[0],result);
        status=true;

    }

}
