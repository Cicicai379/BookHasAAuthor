public class Book {
    private String name;
    private String author;
    private double price;
    private int qty;
    private Author au;

    public Book(String n, Author au, double g, int q){
        this.name="\'";
        this.name+=n;
        this.name+="\'";
        this.price=g;
        this.qty=q;
        this.au=au;
    }


    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public Author getAuthor() {
        return au;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }
    public void setQty(int qty){
        this.qty = qty;
    }

    public String toString() {
//        System.out.println(this.name+" by "+au.getName()+" ("+au.getGender()+") at "+au.getEmail());
        return this.name+" by "+au.getName()+" ("+au.getGender()+") at "+au.getEmail();
    }
}
