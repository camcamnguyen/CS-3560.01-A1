package simulationdriver;

//question interface will be the outline for the question class
//ensures that if another question is added, that the class will have it
interface questionInterface{
    public void printMaskQ();
    public void printSocialDistancQ();
    public void printSymptomsQ();
    public void printReduceTheSpreadQ();
    public void outputQuestionWas();
}


public class Questions extends SimulationDriver{
    
    
    public void printMaskQ(){
        System.out.println("True or false: Select only ONE opttion.");
        System.out.println("You should wear a mask. T/F?" + "\n");
    }
    
    public void printSocialDistanceQ(){
        System.out.println("Multiple choice: select only ONE option.");
        System.out.println("How far should you social distance?");
        System.out.println("A. 12ft");
        System.out.println("B. 6ft"); //correct answer
        System.out.println("C. 10ft");
        System.out.println("D. 8ft");
        System.out.println("E. 4ft" + "\n");
    }
    
    public void printSymptomsQ(){
        //There are multiple choices but only ONE correct answer
        System.out.println("Multiple choice: select ALL that apply.");
        System.out.println("What are some symptoms of someone with covid?");
        System.out.println("A. Coughing"); //correct answer
        System.out.println("B. Nose bleed");
        System.out.println("C. Itchiness");
        System.out.println("D. Ear infection");
        System.out.println("E. Brusing" + "\n");
    }
    
    public void printReduceTheSpreadQ(){
        //There are multiple choices and MULTIPLE RIGHT ANSWERS
        System.out.println("Multiple choice: select ALL that apply.");
        System.out.print("What should you do to help stop the spread of ");
        System.out.println("corona virus?");
        System.out.println("A. Wash hands for at least 20 seconds");
        System.out.println("B. Go to social events with at most 50 people");
        System.out.println("C. Use hand sanitizer with at least 60% alcohol");
        System.out.println("D. If you feel sick, self quarantine");
        System.out.println("E. Share your mask" + "\n");
    }
    
    //print out the heading for the ending result
    public void outputQuestionWas(){
        System.out.println("------Statistics------");
        System.out.println("The question was: ");
    }
}
