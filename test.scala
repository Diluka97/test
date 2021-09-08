object test {

  def main(args: Array[String]): Unit ={
   
   //String
    val alphabet = "ABCD EFGHIJKLMNOPQRSTUVWXYZ0123456789"
   
   
    //Encrypt charactor
    val E = (c:Char, key:Int, s:String) =>s((s.indexOf(c.toUpper)+key)%s.size)
    println(E('8', 3, alphabet))
    
    //Decrypt Charactor
    val D = (c:Char, key:Int, s:String) => s((s.indexOf(c.toUpper)-key)%s.size)
    println(D('z', 3, alphabet))


    //Caesar Cipher
    val cipher = (algo:(Char, Int, String)=>Char, s:String, key:Int,  a:String)=>s.map(algo(_, key, a))

    //Encrypt String
    val ET = cipher(E, "hello8", 5, alphabet)
   
   
    //Decrypt String
    val DT = cipher(D, ET , 5, alphabet)

  
    println(ET)
    println(DT)
    

 
  }
}