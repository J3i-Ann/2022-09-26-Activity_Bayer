
public class Motorcycle<VariableType>{
    private String motorcycleName;
    private String motorcycleBrand;
    private VariableType motorcycleColor;
    

    public void setMotorcycleColor(VariableType motorcycleColor){
        this.motorcycleColor=motorcycleColor;
    }
    public VariableType getMotorcycleColor(){
        return motorcycleColor;
    }

    public void setMotorcycleBrand(String motorcycleType){
        this.motorcycleBrand=motorcycleType;
    }
    public String getMotorcycleBrand(){
        return motorcycleBrand;
    }

    public void setMotorcycleName(String motorcycleName){
        this.motorcycleName=motorcycleName;
    }
    public String getMotorcycleName(){
        return motorcycleName;
    }
}