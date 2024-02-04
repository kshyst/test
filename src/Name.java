class Name{

    String fullName;
    public Name(String name , String familyName){
        fullName = name + familyName;
    }

    public void PrintFullName(){
        System.out.println(fullName);
    }
}