package Iterator;
class BookListAggregate implements Aggregate {
	private Book[] list = new Book[20];
	private int numberOfStock;

	@Override
	public Iterator createIterator() {
		return new BookListIterator(this);
	}

	public void add(Book book) {
		list[numberOfStock] = book;
		numberOfStock += 1;
	}

	public Object getAt(int number) {
		return list[number];
	}

	public int getNumberOfStock() {
		return numberOfStock;
	}

}
