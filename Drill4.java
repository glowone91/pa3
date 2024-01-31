class Drill4{ 
    String phaseOfWater(int temperature) { 
        if (temperature >= 100){
            return "vapor"; 
        }
        else if (temperature <= 100 && temperature > 0){
        return "liquid";
    }
    else if (temperature <=0){
        return "solid"; 
    }
    return "";
    }

    int maxProduct(int x, int y, int z){ 
        if ((x * y) > (x * z) && (x * y) > (y * z)){
            return x * y;
        }
        else if ((x * z) > (x * y) && (x * z) > (y * z)){
            return x * z;
        }
        else {
            return y * z;
        }
    }

    double pipeVolume(double inner, double outer, double height){
        double outerVolume = Math.PI * (outer * outer) * height;
        double innerVolume = Math.PI * (inner * inner) * height;
        double pipeVolume = outerVolume - innerVolume;
        return pipeVolume; 
    }
    String phaseOfWater1 = this.phaseOfWater(101); //expected vapor
    String phaseOfWater2 = this.phaseOfWater(-101); //expected solid
    String phaseOfWater3 = this.phaseOfWater(50); //expected liquid 
    int maxProducts1 = this.maxProduct(1, 2, 3); //expected 6
    int maxProducts2 = this.maxProduct(-5, -5, 1);   //expected 25 
    int maxProducts3 = this.maxProduct(1, 0, 1); //expected 1
    double pipeVolume1 = this.pipeVolume(1, 1, 1); //expected 0.0
    double pipeVolume2 = this.pipeVolume(0, 5, 3); //235.61944901923448
    double pipeVolume3 = this.pipeVolume(15, 15, 15); //0.0
}



    
