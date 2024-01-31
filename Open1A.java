//statement A -- true 

class one{
    String wow;
}

class two{
    String wow;
}

class open1A{ 
    class one{
        String wow;
    }
    
    class two{
        String wow;
}
one test = new one(); 
    open1A(){ 
        test.wow = "Wow"; 
    }
}