public class SingletonClass {
    // A singleton class is a class that only allows 1 obj to be created.
    // To make a class singleton, make its constructor private
    private SingletonClass() {
        //constructor is private, so it cannot be accessed in other class so objects can't be created.
    }
    private static SingletonClass instance;
    // ref to 'SingletonClass' class.
    public static SingletonClass getInstance(){
        //check if it already has an instance.
        if(instance==null){
            // if not, create an instance
            instance = new SingletonClass();
        }
        return instance;
    }
}

class Singleton{
    public static void main(String[] arg){
        SingletonClass obj = SingletonClass.getInstance();
        SingletonClass obj1 = SingletonClass.getInstance();
        SingletonClass obj2 = SingletonClass.getInstance();

        //here obj, obj1,obj2 all ref will point to just one object.
    }
}
