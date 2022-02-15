/**
 * 
 * @author aphakdy
 */
public class PT {
    public String firstName;
    private String lastName;
    private String bio;
    private int numExercises;

    //returns the first name, bio, last name, number of exercises
    public String getFirstName() {
        return firstName;
    }
   
    public void setFirstName(String firstName) {
        this.firstName = firstName;
        }

    public String getLastName() {
        return lastName;
    }

    public void setlasttName(String lastName) {
        this.lastName = lastName;
        }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
        }

    public int numExercises() {
        return numExercises;
    }

    public void numExercises(int numExercises) {
        this.numExercises = numExercises;
        }
    
    /**
     * Adds an exercise
     * @param title Title of exercise
     * @param description Description of exercise
     * @param muscle name of muscle being worked out
     */
     public void addExercise(String title, String description, String muscle) {
        if (this.count >= this.numExercises.length - 1) {
            this.numExercises = growArray(exercise);
    }
}
    /**
    * 
    * the iterator is created as well as the method to grow the array
    */
    public ExerciseIterator createIterator() {
        return new ExerciseIterator(this.exercise);
    }

    private Exercise[] growArray(Exercise[] exercise) {
        int newSize = (exercise.length) * 2;
        Exercise[] newExercise = new Exercise[newSize];

        for (int i = 0; i < exercise.length; i++) {
            addedExercise[i] = exercise[i];
        }

        return addedExercise;
    }

}