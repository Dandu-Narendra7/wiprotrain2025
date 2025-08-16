class Util{
     static getDate(){
        let today=new Date;
        let dd=String(today.getDate()).padStart(2,0);
        let mm=String(today.getMonth()+1).padStart(2,0);
        let yyyy=today.getFullYear();
        return dd+'/'+mm+'/'+yyyy;
    }
    static getPiValue(){
        return Math.PI;
    }
    static convertC2F(celsius){
        return(celsius *9/5)+32;
    }
    static getFibonacci(n){
        let fib=1;
        if(n<=0){
            return 1;
        }
        else if(n==1){
            return 1;
        }
        else{
            for (i=2;i<n;i++){
                fib[i] = fib[i - 1] + fib[i - 2];
            }
        }
        return fib;
    }
}
console.log(Util.getDate());          
console.log(Util.getPialue());       
console.log(Util.convertC2F(30));    
console.log(Util.getFibonacci(5));

