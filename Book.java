public class Book {
   private String name;
   private String genre;
   private String color;
   private int pagesRead;
   private int pageCount;
   private boolean bestSeller;
 
 
 public Book(String name, String genre, String color, int pagesRead, int pageCount, boolean bestSeller) {
   this.name = name;
   this.genre = genre;
   this.color = color;
   this.pagesRead = pagesRead;
   this.pageCount = pageCount;
   this.bestSeller = bestSeller;
 }
 
 public String getName() {
   return name;
 }
 
 public void setName(String name) {
   this.name = name;
 }
 
 public String getGenre() {
   return genre;
 }
 
 public void setGenre(String genre) {
   this.genre = genre;
 }
 
  public String getColor() {
   return color;
 }
 
 public void setColor(String color) {
   this.color = color;
 }
 
 public int getPagesRead() {
   return pagesRead;
 }
 
 public void setPagesRead(int pagesRead) {
   this.pagesRead = pagesRead;

   
 }
 
 public int getPagesRemaining() {
   int pageCount = getPageCount();
   int pagesRead = getPagesRead();
   int pagesRemaining;
   pagesRemaining = pageCount - pagesRead;
   return pagesRemaining;
 }
 
 public int getPageCount() {
   if (pageCount == 0) {
      System.out.println("Page cannot be 0. Minimum of one page is required.");
      pageCount = pageCount + 1;
   }
   return pageCount;
 }
 
 public void setPageCount(int pageCount) {
   this.pageCount = pageCount;
 
 }
 
  public boolean getBestSeller() {
   return bestSeller;
 }
 
 public void setBestSeller(boolean bestSeller) {
   this.bestSeller = bestSeller;
 }
 
 
}
