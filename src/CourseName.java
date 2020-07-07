
/**
 *for string use matches, or =, for integers use ==
 *
 * @author abg5406
 */
public class CourseName {

    private String major;
    private String number;
    private String complement;

    public CourseName(String major, String number, String complement) {
        //this.major = major;
        setMajor(major);
        //this.number = number;
        setNumber(number);
        //this.complement = complement;
        setComplement(complement);
    }

    public CourseName() {
        this.major = "IST";
        this.number = "000";
        this.complement = "?";
    }

    @Override
    public String toString() {
        return "CourseName{" + "major=" + major + ", number=" + number + ", complement=" + complement + '}';
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        String m = major.toUpperCase().trim();

        if (major.matches("CMPSC")) //change to just major
        {
            major = m;
            //System.out.println(); 
        } else if (major.matches("COMM")) {
            major = m;
            //System.out.println();
        } else if (major.matches("CYBER")) {
            major = m;
            //System.out.println();
        } else if (major.matches("DS")) {
            major = m;
            //System.out.println("");
        } else if (major.matches("ECON")) {
            major = m;
            //System.out.println();
        } else if (major.matches("ENG")) {
            major = m;
            //System.out.println();
        } else if (major.matches("IST")) {
            major = m;
            //System.out.println();
        } else if (major.matches("MATH")) {
            major = m;
            //System.out.println();
        } else if (major.matches("SRA")) {
            major = m;
            //System.out.println();
        } else if (major.matches("STAT")) {
            major = m;
            //System.out.println();
        } else {
            major = "IST";
        }

        this.major = m;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        String n = number;
        this.number = n;
        //length function
        
        if (number.length() == 0) 
        {
            this.number = "000";
        } 
        else if (number.length() == 1)
        {
            this.number = ("00" + number);
        }
        else if (number.length() == 2) 
        {
            this.number = ("0" + number);
        } 
        else
        {
            this.number = number;
        }
            this.number = n;
    }

    public String getComplement() {
        return complement;
    }

    public void setComplement(String complement) 
    {
        //complement = complement.substring(0,1).trim().toUpperCase();

         //if(complement.contains.("A","B","C","D","E","H","M","N","S","T","W","Z"));
    }
}
