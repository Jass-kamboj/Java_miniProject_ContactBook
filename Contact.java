class Contact {
    String name;
    String number;
    
    Contact(String name, String number){
        this.name = name;
        this.number = number;
    }

    void display(){
        System.out.println(name + " : " + number);
    }
}
