class Book {
	private String title;
	private float price;
	int PublishYear;

	public Book(int publishYear) {
		this.PublishYear = PublishYear;
	}

	public int getPublishYear() {
		return PublishYear;
	}

	public void setPublishYear(int publishYear) {
		PublishYear = publishYear;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public Book(String title) {
		this.title=title;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	//@override
	public String toString() {
		return "{Title="+this.title+", year="+this.PublishYear+", Price="+this.price+"}";
	}
	
	

}
