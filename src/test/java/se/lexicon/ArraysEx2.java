package se.lexicon;

public class ArraysEx2 {



    public static void main(String[] args) {
        char[] characters = {'l','e','t','m','s','r','c'};

        ArraysEx2 exercise = new ArraysEx2();
        int index = exercise.indexOf(characters, 't');
        System.out.println("Index position of 't' is '+ index");

    }

    public int indexOf(char[] array, char character) {
        for (int i = 0; i < array.length; i++) {

            if (array[i] == character) {
                return i;
            }
        }

        return -1;
    }


}

