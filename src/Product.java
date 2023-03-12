public class Product {

    public Product(int id,String name,String description,double price,int stockAmount,String kod){

    }


    // Attribute | Field
    private int _id;
    private String _name;
    private String _description;
    private double _price;
    private int _StockAmount;

    private String _kod;

    // getter
    public int getId(){
        return _id;
    }
    // setter
    public void setId(int id){
        _id = id;
    }

    public String get_name() {
        return _name;
    }

    public void set_name(String name) {
        _name = name;
    }

    public String get_description() {
        return _description;
    }

    public void set_description(String description) {
        _description = description;
    }

    public double get_price() {
        return _price;
    }

    public void set_price(double price) {
        _price = price;
    }

    public int get_StockAmount() {
        return _StockAmount;
    }

    public void set_StockAmount(int StockAmount) {
        _StockAmount = StockAmount;
    }

    public String get_kod(){
        return _name.substring(0,1) + _id;
    }
}
