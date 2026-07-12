// Method 01
class CheckInteger
{
    public static void main(String[] args) {
        int valid = 0;
        int invalid = 0;


        for(int i=0; i<args.length; i++){
            boolean isNum = true;


            for(int j=0; j<args[i].length(); j++){
                char ch = args[i].charAt(j);
                if(!Character.isDigit(ch)){
                    isNum = false;
                    break;
                }
            }
            if(isNum){
                valid ++;           }
            else{
                invalid++;
            }
        }
       
        System.out.println("valid integers: " +valid);
        System.out.println("Invalid integers: " +invalid);
    }


// Method 02
class CheckInteger
{
   public static void main(String[] args) {
       int valid = 0;
       int invalid = 0;
     
      for(int i=0; i<args.length; i++){
         try{
            Integer.parseInt(args[i]);
            valid++;
         }
         catch(Exception ex){
            invalid++;
         }
      }
     
     
       System.out.println("valid integers: " +valid);
       System.out.println("Invalid integers: " +invalid);
   }
}
