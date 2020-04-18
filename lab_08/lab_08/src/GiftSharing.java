abstract class Gift {
    public abstract void buy();
    public abstract void give(String name);
}
class Postcard extends Gift {
    private String wish;
    public void setWish(String wish) {
        this.wish = wish;
    }
    public String getWish() {
        return this.wish;
    }
    @Override
    public void buy() {
        System.out.println("Открытка была куплена.");
    }
    @Override
    public void give(String name) {
        System.out.println(this.wish + ", " + name + "!");
    }
}
class Painting extends Gift {
    private String title;
    private String author;
    @Override
    public void buy() {
        System.out.println("Картина была куплена.");
    }
    @Override
    public void give(String name) {
        System.out.println("Картина была подарена " + name);
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getTitle() {
        System.out.println("Название картины: " + this.title);
        return this.title;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public String getAuthor() {
        System.out.println("Художник: " + this.author);
        return this.author;
    }

}
public class GiftSharing {
    public static void main(String[] args) {
        Postcard card = new Postcard();
        card.buy();
        card.setWish("С Новым Годом");
        card.getWish();
        card.give("Анастасия");
        Painting art = new Painting();
        art.buy();
        art.give("Анастасие.");
        art.setAuthor("Леонардо да Винчи");
        art.setTitle("Мона Лиза");
        art.getTitle();
        art.getAuthor();

    }
}
