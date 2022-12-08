public class MyMix {
    public static void main(String[] args) {

        //Make a Song array of size 5


        //fill the Song array with some objects
        //make 4 Song objects (one of them will be used to pass to a method, only 3 will go in initial array)
        //the other two make on the same line as storing


        //call method to print out array


        //call method that updates a Song at a passed index number
        //use the 4 Song object created above to replace another song


        //call method to print out array

        //call method to find out how many songs can win awards
        //store this return into a new Song[]
        //we don't need to set the size here because our size will be whatever the size of the return is


        //call method to give speech for award song
        //use the award Song[] as an argument
        //store this return in a String


        //print out the speech given


    }//end of main


    //create method to print out array (printArr)
    //return void
    //take a Song[] as a parameter
    //use enhanced for loop
    //print out each Song object (overrode toString so just need the object)


    //create method to update a Song in the [] (updateSong)
    //return void
    //take a Song[] as a parameter
    //take an index as a parameter
    //test to make sure index is within the array
    //if not tell the user and do nothing
    //if index is valid update index with new Song object
    //call method to print out array
    //(this will show that changing an array in a method affects arrays outside the method,
    //true for any reference type value)


    //create a method to return the Songs that can win awards (awardSongs)
    //return a Song[]
    //take a Song[] as a parameter
    //create awardSong[] (make same length as parameter array because every Song could win)
    //use normal for loop to go over the array
    //each Song element call canWinAward
    //if true add it to the awardSong[] (will need a second index counter for this array)


    //create a method that will give a speech for a Song that has won an award
    //return a String (this will be the speech given)
    //take a Song[] as a parameter
    //use a normal for loop to go over the array
    //each Song element get the artist
    //test the artist name for that Song
    //check to see if the artist is Kanye
    //if it is not Kanye have Kanye interrupt the speech with his own ramblings

}//end of class
