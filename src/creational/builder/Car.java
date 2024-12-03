package creational.builder;

public class Car {
	
    private String bodyStyle;
    private String power;
    private String engine;
    private String breaks;
    private String carType;
    
    public Car (String carType){
            this.carType = carType;}
    
    public String getBodyStyle() {
        return bodyStyle;}
    
    public void setBodyStyle(String bodyStyle) {
        this.bodyStyle = bodyStyle;}
    
    public String getPower() {
        return power;}
    
    public void setPower(String power) {
        this.power = power;}
    
    public String getEngine() {
        return engine;}
    
    public void setEngine(String engine) {
        this.engine = engine;}
    
    public String getBreaks() {
        return breaks;}
    
    public void setBreaks(String breaks) {
        this.breaks = breaks;}

    @Override
    public String toString(){
  
    StringBuilder sb = new StringBuilder();
    sb.append("--------------"+carType+"--------------------- \n");
    sb.append(" Body: ");
    sb.append(bodyStyle);
    sb.append("\n Power: ");
    sb.append(power);
    sb.append("\n Engine: ");
    sb.append(engine);
    sb.append("\n Breaks: ");
    sb.append(breaks);
    return sb.toString();
    }
}
