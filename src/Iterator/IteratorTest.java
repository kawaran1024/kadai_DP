package Iterator;
public class IteratorTest {
	public static void main(String[] args) {
		BookListAggregate bookListAggregate = new BookListAggregate();
		Iterator iterator = bookListAggregate.createIterator();
		bookListAggregate.add(new Book("スイミー", 1000));
		bookListAggregate.add(new Book("桃色のキリン", 2500));
		bookListAggregate.add(new Book("押入れの冒険", 1500));
		bookListAggregate.add(new Book("おおきなおおきなおいも", 5000));

		iterator.first();
		while(! iterator.isDone()) {
			Book book = (Book)iterator.getItem();
			System.out.println(book.getName());
			iterator.next();
		}
	}

}
