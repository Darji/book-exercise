 

/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 * G00261150 Akash Darji 
 * Feb 4, 2019
 */
class Book
{
    // The fields.
    private String author;
    private int pages;
    private String title;
    private String refNumber;
    private int borrowed;
    boolean courseText;

    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle, int pageNumber, boolean course)
    {
        author = bookAuthor;
        title = bookTitle;
        pages = pageNumber;
        refNumber = "";
        courseText = course;
    }//end of book
    
    public int getpages()
    {
        return pages;
    }// end of get pages
    
    public String getAuthor()
    {
        return author;
    }// end of get author
    
    public String getTitle()
    {
        return title;
    }// end of get title
    
    public String getRefNumber(){
        return refNumber;
    }// end of get ref num #
    
    public int getBorrowed()
    {
        return borrowed;
    } // end of get browed
    
    public boolean isCourseText()
    {
        return courseText;
    }// end of corurse text

    public void setRefNumber(String ref){
        if(ref.length()>3){
            refNumber = ref;
        }
        else
        {
            System.out.println("Please make your ref number large than 3 chars.");
        }
    }// end of ref number #
    
    public void printAuthor()
    {
        System.out.println(author);
    }// end of print author
    
    public void printTitle()
    {
        System.out.println(title);
    }// end of print title
    
    public void borrow()
    {
        borrowed = borrowed + 1;
    }// end of borrow
    
    public void printDetails() {
        System.out.println("Author: " + author + "\t Title: " + title + "\tNo of pages: " + pages + "\tNo of times borrowed: "+ borrowed + "\t Is this a course text? "+ courseText);
        if (refNumber.length() > 0)
        {
            System.out.print("Ref num: " + refNumber);
        }
        else
        {
            System.out.println("zzz");
        }
    }// end of print details 

    public static void main(String [] args)
    {
    Book book = new Book("Akash", "7 Wonders of the Modern World",50,true);
    book.setRefNumber("G00261150");
    for(int i=0;i<10;i++)
    {
        book.borrow();
    }//end of for
    book.printDetails();
    }// end of main 
}// end of class 
