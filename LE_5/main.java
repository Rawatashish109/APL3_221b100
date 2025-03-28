class main{
    public static void main(String args[]){
        Beverage b = new whisky();
        b.templateMethod(5);
        b = new rum();
        b.templateMethod(30);
        b = new beer();
        b.templateMethod(40);
    }

}