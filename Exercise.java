/**
 * 
 * @author AlexPhakdy 
 */
public class Exercise {
    private String title;
    private String description;
    private String muscle;

  /**
     * Adds an exercise
     * @param title Title of exercise
     * @param description Description of exercise
     * @param muscle name of muscle being worked out
     */
    public Exercise(String title, String description, String muscle) {
        this.muscle = muscle;
        this.title = title;
        this.description = description;
    }

    protected void title() {
        System.out.println("This is the exercise you will be performing, " + this.title +" ");
        }

    protected void description() {
        System.out.println("Exercise Description: " + this.description +" ");
        }

    protected void addTargetMuscle() {
        System.out.println("Adding " + this.muscle + " target muscle.");
    }

    protected void removeTargetMuscle() {
        System.out.println("Removing " + this.muscle +" target muscle.");
    }
   /**
    *  Prints out the exercise using the to string
    */ 
    public void print() {
        System.out.println(this.toString());
    }

}