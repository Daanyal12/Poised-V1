//create the project class that builds all the attributes related to the project object
public class Project {
//  state all the attributes you want to be related to project and define their data types
    String projectName;
    String projectNumber;
    String buildType;
    String address;
    int ERF;
    int totalAmount;
    int totalPaid;
    String deadline;

//  declare all the attributes using this method
    public Project(String projectName, String projectNumber, String buildType, String address, int ERF, int totalAmount, int totalPaid, String deadline ){
//      we declare the attributes by using the 'this' function
        this.projectName = projectName;
        this.projectNumber = projectNumber;
        this.buildType = buildType;
        this.address = address;
        this.ERF = ERF;
        this.totalAmount = totalAmount;
        this.totalPaid = totalPaid;
        this.deadline = deadline;
    }

//  a toString is then created so that we know how our objects data is going to be displayed
//  this consists of the String with the information and the variable we want to display
    public String toString(){
        String output = "project Name: " + projectName;
        output += "\nproject Number: " + projectNumber;
        output += "\nbuilding type: " + buildType;
        output += "\nAddress: " + address;
        output += "\nERF no.: " + ERF;
        output += "\nTotal Amount: " + totalAmount;
        output += "\nTotal Paid: " + totalPaid;
        output += "\ndeadline: " + deadline;
        return output;
    }

//    these methods will be used later on
    public void setDeadline(String deadline){
        this.deadline = deadline;
    }
    public String getDeadline(String deadline){
        return deadline;
    }
    public void setTotalPaid(int totalPaid){
        this.totalPaid = totalPaid;
    }
    public int getTotalPaid(int totalPaid){
        return totalPaid;
    }
}
