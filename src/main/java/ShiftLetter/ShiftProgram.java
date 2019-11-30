package ShiftLetter;
import org.apache.commons.lang3.StringUtils;

public class ShiftProgram {
    private String filename;
    private String result;

    public ShiftProgram(String filename) {
        this.filename=filename;
    }

    public String run(boolean status) {
        FileGet fg=new FileGet(filename);
        if (status) {
            toUpperCase(fg.toString());
        } else {
            toLowerCase(fg.toString());
        }
        return result;
    }

    public String toString() {
        return result;
    }

    public void toLowerCase(String source) {
        result=StringUtils.lowerCase(source);
        result=result.concat("Fault");
    }

    public void toUpperCase(String source) {
        result=StringUtils.upperCase(source);
    }
}
