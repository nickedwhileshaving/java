package bookstore;

import java.util.Date; 

public class App {
    
    public static void main(String[] args){
        BookStore aTempBookStore = createTestBookStore();
        showTestBookStore(aTempBookStore);
    }
    
    private static void showTestBookStore(BookStore pBookStore){
        System.out.println(pBookStore.getName());
        System.out.println(pBookStore.getId());
        System.out.println("Address:");
        System.out.println(pBookStore.getAddress().getStreetName());
        System.out.println(pBookStore.getAddress().getHouseNumber());
        System.out.println(pBookStore.getAddress().getApartmentNumber());
        System.out.println(pBookStore.getAddress().getZipCode());
        System.out.println("Book:");
        System.out.println(pBookStore.getBook().getName());
        System.out.println(pBookStore.getBook().getIsbn());
        System.out.println("Author:");
        System.out.println(pBookStore.getBook().getAuthor().getFirstName());
        System.out.println(pBookStore.getBook().getAuthor().getLastName());
        System.out.println(pBookStore.getBook().getAuthor().getDateOfBirth());
    }
    private static BookStore createTestBookStore() {
        BookStore aBookStore = new BookStore();
        aBookStore.setName("The Best BookStore");
        aBookStore.setId(1);
        aBookStore.setAddress(createTestAddress());
        aBookStore.setBook(createTestBook());
        return aBookStore;
    }
    private static Book createTestBook() {
        Book aHarryPotterBook = new Book();
        aHarryPotterBook.setName("The Sorcerer's Stone");
        aHarryPotterBook.setIsbn("the ISBN");
        aHarryPotterBook.setAuthor(createTestAuthor());
        return aHarryPotterBook;
    }
    
    private static Author createTestAuthor() {
        Author anAuthor = new Author();
        anAuthor.setDateOfBirth(new Date());
        anAuthor.setFirstName("the First Name");
        anAuthor.setLastName("the Last Name");
        return anAuthor;
    }
    private static Address createTestAddress() {
        Address anAddress = new Address();
        anAddress.setApartmentNumber("this Apt Number");
        anAddress.setHouseNumber("a House Number");
        anAddress.setStreetName("a Street Name");
        anAddress.setZipCode("a Zip Code");
        return anAddress;
    }
}
