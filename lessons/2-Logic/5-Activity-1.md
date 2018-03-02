What's the output?

    boolean a = true;
    boolean b = false;
    System.out.println(!!a && a || !b && !b);
    
<details> 
  <summary>Click for solution</summary>
  
    class Main {
       public static void main(String[] args) {
           boolean a = true;
           boolean b = false;
           System.out.println(!!a && a || !b && !b);
           //        first !!a == true
           //        System.out.println(true && true || !b && !b) ;
           //        true && true == true
           //        System.out.println(true || !b && !b) ;
           //        !b == true
           //        System.out.println(true || true && true) ;
           //        true && true == true
           //        System.out.println(true || true) ;
           //        true || true == true
           //        System.out.println(true) ;
       }
    }
    
</details>