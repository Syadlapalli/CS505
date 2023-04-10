public class ProductDB {

	
	public static GenericQueue<Product> getProducts(String productCode) {

		if (productCode.equalsIgnoreCase("b")) {

			Ball b1 = new Ball();
			b1.setCode("B200");
			b1.setDescription("Black Widow 2.0");
			b1.setPrice(144.95);
			b1.setColor("Black and Red");

			Ball b2 = new Ball();
			b2.setCode("B201");
			b2.setDescription("Pink color ball");
			b2.setPrice(89.99);
			b2.setColor("Pink");

			Ball b3 = new Ball();
			b3.setCode("B203");
			b3.setDescription("Blue color ball");
			b3.setPrice(49.99);
			b3.setColor("Blue");

			Ball b4 = new Ball();
			b4.setCode("B204");
			b4.setDescription("Green color ball");
			b4.setPrice(59.99);
			b4.setColor("Green");

			Ball b5 = new Ball();
			b5.setCode("B205");
			b5.setDescription("Black color ball");
			b5.setPrice(69.99);
			b5.setColor("Black");

			GenericQueue<Product> balls = new GenericQueue<Product>();

			balls.enqueue(b1);
			balls.enqueue(b2);
			balls.enqueue(b3);
			balls.enqueue(b4);
			balls.enqueue(b5);

			return balls;
		}

		else if (productCode.equalsIgnoreCase("s")) {
			Shoe s1 = new Shoe();
			s1.setCode("S501");
			s1.setDescription("Youth Skull Green/Black");
			s1.setPrice(39.99);
			s1.setSize(3.0);

			Shoe s2 = new Shoe();
			s2.setCode("S502");
			s2.setDescription("Men's Tribal White");
			s2.setPrice(26.99);
			s2.setSize(8.0);

			Shoe s3 = new Shoe();
			s3.setCode("S503");
			s3.setDescription("Women's Path Lite Seamless Mesh");
			s3.setPrice(54.99);
			s3.setSize(6.0);

			Shoe s4 = new Shoe();
			s4.setCode("S504");
			s4.setDescription("Women's Rise Black/Hot Pink");
			s4.setPrice(39.99);
			s4.setSize(7.0);

			Shoe s5 = new Shoe();
			s5.setCode("S505");
			s5.setDescription("Men's Ram Black");
			s5.setPrice(39.99);
			s5.setSize(10.5);

			GenericQueue<Product> shoes = new GenericQueue<Product>();

			shoes.enqueue(s5);
			shoes.enqueue(s1);
			shoes.enqueue(s2);
			shoes.enqueue(s3);
			shoes.enqueue(s4);

			return shoes;
		}

		else if (productCode.equalsIgnoreCase("a")) {
			Bag b1 = new Bag();
			b1.setCode("A300");
			b1.setDescription("Royal Blue");
			b1.setPrice(34.99);
			b1.setType("Triple");

			Bag b2 = new Bag();
			b2.setCode("A301");
			b2.setDescription("Prime Black");
			b2.setPrice(44.99);
			b2.setType("Double");

			Bag b3 = new Bag();
			b3.setCode("A302");
			b3.setDescription("Prime Roller Blaco Deluxe");
			b3.setPrice(54.99);
			b3.setType("Single");

			GenericQueue<Product> bags = new GenericQueue<Product>();

			bags.enqueue(b1);
			bags.enqueue(b2);
			bags.enqueue(b3);

			return bags;
		}

		else {
			return new GenericQueue<Product>();
		}
	}
}
