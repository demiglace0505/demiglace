
public class Statistics {
    private int count = 0;
    private int sum = 0;
    
    public void addNumber(int number) {
        this.count = count + 1;
        this.sum = this.sum + number;
    }
    
    public int getCount() {
        return this.count;
    }
    
    public int sum() {
        if (this.count == 0){
            return 0;
        }
        return this.sum;
    }
    
    public double average(){
        if (this.count == 0){
            return 0;
        }
        return 1.0*this.sum/this.count;
    }
}
