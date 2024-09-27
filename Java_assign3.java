class Apparel{

    static int counter = 100;
    double price;
    String item_type;
    String item_id;

    Apparel(String item_type,double price){

        counter++;
        this.price = price;
        this.item_type = item_type;
        this.item_id = item_type.charAt(0) + String.valueOf(counter);
    }

    public void calculate_price(){

        this.price = price + price * 0.05;
        System.out.println(price);

    }

    String get_item_id(){
        return item_id;

    }

    void set_price(double price){
        this.price = price;
    }

    double getprice(){
        return price;

    }

}

class Cotton extends Apparel{

    int discount;
    Cotton(String item_type,int price,int discount){

        super("Cotton",price);
        this.discount = discount;

    }

    public void calculate_price(){

        this.price = price - (price * discount)/100;
        super.calculate_price();
        this.price = price + price * 0.05;

    }
}

class Silk extends Apparel{
    
    int points = 0;
    int discount;
    Silk(String item_type,int price,int discount){

        super("Silk",price);
    }

    void earn_points(){

        if(price>10000){

            points +=10;
            System.out.println("Your earned points are : " + points);
        }

        else{

            points +=3;
            System.out.println("Your earned points are: " + points);

        }
    }

    public void calculate_price(){

        this.price = price + (price*0.1);
        super.calculate_price();
        this.price = price + (price*0.05);
    }
}

class Java_assign3{

    public static void main(String[] args){

        Apparel a1 = new Cotton("Cotton",300,50);
        Silk s1 = new Silk("Silk",60000,400);
        
        System.out.println(a1.item_id);
        a1.calculate_price();
        
        System.out.println(s1.item_id);
        s1.earn_points();

    }
}