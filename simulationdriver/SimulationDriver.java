package simulationdriver;
import java.util.Random;

public class SimulationDriver {

    public static void main(String[] args) {
        Random rand = new Random();
        int size = rand.nextInt(10) + 1;
        String[] idArr = new String[size]; //hold the students ID number
        Student newStudent = new Student();
        System.out.println( size + " students will be participating.");
        
        //get the students ID number and name
        for(int i = 0; i < size; i++){
            newStudent.setName(i);
            newStudent.setID();
            idArr[i] = newStudent.getID();
            System.out.println(newStudent.getID() + ": " + newStudent.getName());
        }
        System.out.println();
        
        //initiate objects
        Questions q = new Questions();
        VotingService iVote = new VotingService();
        //Student newStudent = new Student();
        
        
        System.out.println("------Question 1------");
        q.printMaskQ();
        for(int i = 0; i < size; i++){
            newStudent.setName(i);
            newStudent.settrueFalse();
            iVote.changeAnswer(newStudent.getName(), 1);
        
            System.out.print(newStudent.getName() + " chose: ");
            System.out.println(newStudent.getTrueFalse());
            iVote.trueFalse(newStudent.getTrueFalse());
            System.out.println();
        }
        q.outputQuestionWas();
        q.printMaskQ();
        iVote.maskStats();
        
        System.out.println("------Question 2------");
        q.printSocialDistanceQ();
        for(int i = 0; i < size; i++){
            newStudent.setName(i);
            newStudent.setOneAnswer();
            iVote.changeAnswer(newStudent.getName(), 2);
            
            System.out.print(newStudent.getName() + " chose: ");
            System.out.println(newStudent.getOneAnswer());
            iVote.mcSocialDistance(newStudent.getOneAnswer());
            System.out.println();
        }
        q.outputQuestionWas();
        q.printSocialDistanceQ();
        iVote.mcSocialDistanceStats();
        
        System.out.println("------Question 3------");
        q.printSymptomsQ();
        for(int i = 0; i < size; i++){
            newStudent.setName(i);
            newStudent.setMultipleChoices();
            iVote.changeAnswer(newStudent.getName(), 3);
            
            System.out.print(newStudent.getName() + " chose: ");
            System.out.println(newStudent.getMultipleChoices());
            iVote.mcSymptoms(newStudent.getMultipleChoices());
            System.out.println();
        }
        q.outputQuestionWas();
        q.printSymptomsQ();
        iVote.mcSymptomsStats();
        
        System.out.println("------Question 4------");
        q.printReduceTheSpreadQ();
        for(int i = 0; i < size; i++){
            newStudent.setName(i);
            newStudent.setMultipleChoices();
            iVote.changeAnswer(newStudent.getName(), 4);
            
            System.out.print(newStudent.getName() + " chose: ");
            System.out.println(newStudent.getMultipleChoices());
            iVote.mcReduceTheSpread(newStudent.getMultipleChoices());
            System.out.println();
        }
        q.outputQuestionWas();
        q.printReduceTheSpreadQ();
        iVote.reduceTheSpreadStats();
        
    }//end main
    
}
