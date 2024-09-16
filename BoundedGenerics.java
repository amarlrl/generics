package generics;



public class BoundedGenerics<T extends Number> {
 

 private T value;
 
 public BoundedGenerics(T value) {
     this.value = value;
 }
 
 public T getValue() {
     return value;
 }
 


 
 public static void main(String[] args) {
    //possible
     BoundedGenerics<Integer> intObj = new BoundedGenerics<>(100);
     System.out.println("Integer Value:" + intObj.getValue());
    
     
      //possible
     BoundedGenerics<Double> doubleObj = new BoundedGenerics<>(9.25);
     System.out.println("Double Value:" + doubleObj.getValue());

     
      //possible
     BoundedGenerics<Float> floatObj = new BoundedGenerics<>(456.78f);
     System.out.println("Float Value:" + floatObj.getValue());
     
     // not possible as string doesnt extend number
     // BoundedGenerics<String> strObj = new BoundedGenerics<>("Hello"); 
 }
}
