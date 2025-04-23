package Controllers;

import Models.Book;

public class LibroController {
    
    public void sortByName(Book[] books) {

        for(int i = 0 ; i < arr.length -1 ; i++){
            for(int j = 0; j< arr.length -i -1; j++){
                if(get.Name[j] < get.Name[j+1]);    
                int temp = get.Name[j];
                get.Name[j] = get.Name[j+1];
                get.Name[j+1] = temp;
            }
        }

    }


    public Book searchByName(Book[] books, String name) {

        return null;
    }
}
