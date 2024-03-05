package week8;



public class Kindle {

    private int totalPages;
    private int currentPage;

    public Kindle(int numberOfPage){
        totalPages = numberOfPage;

        currentPage = 1;

    } // end constructor
    //to string is a getter
    public  String toString(){
        return "Page " + currentPage + " of " + totalPages;

    }// end of toString method

    public void turnPages(){
        turnPages(1);
    }
    public void turnPages(int numberOfPages){
        if (currentPage + numberOfPages > totalPages){
            System.out.println("You were on                : " + toString());
            System.out.println("Turning "+ numberOfPages +  " pages would take you past the last page.");
            currentPage = totalPages;
            System.out.println("You are now on             :" + toString());
        } else {
            currentPage = currentPage + numberOfPages;
        }


    }


} //end of the Kindle class

