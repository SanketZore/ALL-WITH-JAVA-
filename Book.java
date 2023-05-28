public class Book {
  public static void main(String[] args) {
    view kitab = new view();
    kitab.Display();
    Magazine_Book magazine_Book = new Magazine_Book();
    magazine_Book.Display();

  }
}

class Reference_Book extends view {
  String name = "Geetanjali";
  String Author = "Rabindra Nath Tagore";

  public void Display() {
    System.out.println("Book Name: " + this.name);
    System.out.println("Author Name: " + this.Author);
  }

}

class Magazine_Book extends view extends Reference_Book {
  String name = "Alice in Wonderland";
  String Author = "Lewis Carrol";

  public void Display() {
    System.out.println("Book Name: " + this.name);
    System.out.println("Author Name: " + this.Author);
  }

}

class view {
  String name = "TIME";
  String Author = "Joe Klein";

  public void Display() {
    System.out.println("Book Name: " + this.name);
    System.out.println("Author Name: " + this.Author);
  }
}

