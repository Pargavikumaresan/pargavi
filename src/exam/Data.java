package exam;

public class Data {
	private int x = 0;
    private String y = "Y";
    public Data(int k){
        this.x = k; 
    }
    public Data(String k){
        this.y = k; 
    }    
    public void showMe(){
        System.out.println(x+y);
    }

}
