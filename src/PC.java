public class PC {

    String CPU;
    String GPU;
    int RamCapacity;
    int StorageCapacity;
    String StorageType;
    String OS;

    public PC(String CPU , String GPU , int RamCapacity , int StorageCapacity , String StorageType , String OS){
        this.CPU = CPU;
        this.GPU = GPU;
        this.RamCapacity = RamCapacity;
        this.StorageCapacity = StorageCapacity;
        this.StorageType = StorageType;
        this.OS = OS;
    }
    public PC(String CPU , String GPU , int StorageCapacity , String StorageType , String OS){
        this.CPU = CPU;
        this.GPU = GPU;
        this.StorageCapacity = StorageCapacity;
        this.StorageType = StorageType;
        this.OS = OS;
    }
    public PC(String CPU , String GPU , int RamCapacity , int StorageCapacity , String StorageType){
        this.CPU = CPU;
        this.GPU = GPU;
        this.RamCapacity = RamCapacity;
        this.StorageCapacity = StorageCapacity;
        this.StorageType = StorageType;
    }
    public PC(String CPU , int RamCapacity , int StorageCapacity , String StorageType , String OS){
        this.CPU = CPU;
        this.RamCapacity = RamCapacity;
        this.StorageCapacity = StorageCapacity;
        this.StorageType = StorageType;
        this.OS = OS;
    }

    public void PrintPC(){
        System.out.println("CPU: " + CPU);
        System.out.println("GPU: " + GPU);
        System.out.println("Ram Capacity: " + RamCapacity);
        System.out.println("Storage Capacity: " + StorageCapacity);
        System.out.println("Storage Type: " + StorageType);
        System.out.println("OS: " + OS);
    }

}
