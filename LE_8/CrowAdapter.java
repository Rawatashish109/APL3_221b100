public class CrowAdapter implements Swan{
    private Crow Crow;
    public CrowAdapter(Crow Crow){
        this.Crow=Crow;
    }
    public void Eat(){
        Crow.Eat();
    }
    public void Sing(){
        Crow.Cry();
    }
    public void Swim(){
        Crow.Fly();
    }
}