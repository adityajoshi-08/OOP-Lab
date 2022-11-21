public class Book {
    int book_id;
    String book_title;
    int price;
    int no_of_pages;
    boolean status;
    static int[] books = new int[100];
    static int no;
    public Book() {
        books[no] = this.book_id;
        no++;
    }

    public Book(int book_id, String book_title, int price, int no_of_pages) {
        this.book_id = book_id;
        this.book_title = book_title;
        this.price = price;
        this.no_of_pages = no_of_pages;
        books[no] = this.book_id;
        no++;
    }

    static int bookSearch(int id){
        for (int i = 0; i < no; i++) {
            if (books[i] == id){
                return 1;
            }
        }
        return 0;
    }

    void issueBook(){
        if (status == true){
            status = false;
        }
        else {
            System.out.println("Unavailable");
        }
    }

    void depositBook(){
        this.status = true;
    }

    public static void main(String[] args) {
        Book b1 = new Book(1111, "Hello World", 500, 50);
        Book b2 = new Book(1112, "Hello World", 500, 50);
        Book b3 = new Book(1113, "Hello World", 500, 50);
        Book b4 = new Book(1114, "Hello World", 500, 50);
        Book b5 = new Book(1115, "Hello World", 500, 50);

    }
}
