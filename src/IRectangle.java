public interface IRectangle {
    String test = "test";
     void printName();
     default void printTest(){
         System.out.println("test");
     }


}
