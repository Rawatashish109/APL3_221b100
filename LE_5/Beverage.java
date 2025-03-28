/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
abstract class Beverage{
    private void pour(int qty){
        System.out.println("add"+qty+"ml of beverage");
    }
    protected abstract void addCondiment();
    protected void stir(){};
    private void serve(){
        System.out.println("serve through waiter");
    }
    public void templateMethod(int qty){
        pour(qty);
        addCondiment();
        stir();
        serve();
    } 
}
