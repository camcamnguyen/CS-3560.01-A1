package simulationdriver;
import java.util.Random;
import java.util.ArrayList;

//the interface will be the outline of the student class
//will allow for the addition of other methods if needed
//and will make sure the class has them
interface studentInterface{
    public void setName(int n);
    public void setID();
    public void settrueFalse();
    public void setOneAnswer();
    public void setMultipleChoices();
    
    public String getName();
    public String getID();
    public boolean getTrueFalse();
    public String getOneAnswer();
    public ArrayList getMultipleChoices();
}

//each student has a name, ID, and their own answers to each question
public class Student implements studentInterface{
    private String name;
    private String ID;
    private String answer;
    private boolean tF;
    private ArrayList answerList = new ArrayList(); //for questions with multiple selections
    
    public void setName(int n){
        String nom;
        if(n == 1)
            nom = "Kevin";
        else if(n == 2)
            nom = "Brer Rabbit";
        else if(n == 3)
            nom = "Lilo";
        else if(n == 4)
            nom = "Remy";
        else if(n == 5)
            nom = "Goofy";
        else if(n == 6)
            nom = "Daisy Duck";
        else if(n == 7)
            nom = "Carl";
        else if(n == 8)
            nom = "Ellie";
        else if(n == 9)
            nom = "Minnie";
        else
            nom = "Mickey";
        name = nom;
    }
    
    public String getName(){
        return name;
    }
    
    public void setID(){
        Random rand = new Random();
        int num = rand.nextInt(9000) + 1000;
        String realID = Integer.toString(num);
        ID = realID;
    }
    
    public String getID(){
        return ID;
    }
    
    public void setOneAnswer(){
        //will randomly choose an answer for the multiple choice question
        //only ONE answer is correct
        Random rand = new Random();
        String myAnswer;
        
        /*
        //generate a random number between 1 and 5 to match to a char
        //1 = A
        //2 = B
        //3 = C
        //4 = D
        //5 = E
        */
        int num = rand.nextInt(5) + 1;
        if(num == 1){
            myAnswer = "A";
        }
        else if(num == 2){
            myAnswer = "B";
        }
        else if(num == 3){
            myAnswer = "C";
        }
        else if(num == 4){
            myAnswer = "D";
        }
        else{
            myAnswer = "E";
        }
        answer = myAnswer;
    }
    
    public String getOneAnswer(){
        return answer;
    }
    
    public void settrueFalse(){
        Random rand = new Random();
        boolean answer = rand.nextBoolean();
        tF = answer;
    }
    
    public boolean getTrueFalse(){
        return tF;
    }
    
    public void setMultipleChoices(){
        //allows the student to choose MULTIPLE selections
        //check for duplicate answers
        answerList.clear();
        Random rand = new Random();
        int numOfSelections = rand.nextInt(5) + 1; //this will be the total amount of answers the student selects
        int choice;
        for(int i = 0; i < numOfSelections; i++){
            choice = rand.nextInt(5) + 1; //choice is the selected answer
            /*
            //In order to check that the student does not choose the same answer,
            //there is a nested if,else conditional after each choice check
            */
            if(choice == 1){
                if(answerList.contains("A"))
                    i++;
                else
                    answerList.add("A");
            }//end if
            
            else if(choice == 2){
                if(answerList.contains("B"))
                    i++;
                else
                    answerList.add("B");
            }//end else if for answer B
                
            else if(choice == 3){
                if(answerList.contains("C"))
                    i++;
                else
                    answerList.add("C");
            }//end else if for answer C
                
            else if(choice == 4){
                if(answerList.contains("D"))
                    i++;
                else
                    answerList.add("D");
            }
            
            else{
                if(answerList.contains("E"))
                    i++;
                else
                    answerList.add("E");
            }
        }//end for loop
    }
    
    public ArrayList getMultipleChoices(){
        return answerList;
    }
    
}