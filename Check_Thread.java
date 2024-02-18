class Odd extends Thread { 
    public void run(){ 
       for(int i = 1;i <= 20; i++) { 
        if(i %2 != 0) { 
            System.out.println(i + " is a ODD number"); 
        }
      }
   }
}
class Even extends Thread { 
    public void run() { 
    for(int j = 1;j <= 20; j++) {
        if(j % 2 == 0) { 
            System.out.println(j + " is an EVEN number"); 
        }
     }
   }
}
class Check_Thread { 
    public static void main(String args[]) { 
        Odd  x = new Odd();
        Even y = new Even();
        x.start();
        y.start();
    }
}
