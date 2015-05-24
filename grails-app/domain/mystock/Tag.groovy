package mystock

class Tag {

    static constraints = {
        name size: 1..20, nullable: false
    }
    
    String name;
}
