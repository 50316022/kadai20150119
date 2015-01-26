package lib;

public class MMS_lib {
	
private double lambda,mu,rho,alpha;
private int s;

public MMS_lib(double lambda, double mu, int s) {
	super();
	this.lambda = lambda;
	this.mu = mu;
	this.alpha = this.lambda/this.mu;
	this.s = s;
	this.rho =this.alpha/this.s ;
}
public int getFactrial(int s){
	
	int f = 1;
	for(int i=s;i>=0;i--){
		if(i==0){
			f*=1;
		}else{
			f*=i;
		}
		
	}
    return f;
}
public int getConbination(int s,int r){
	int f =1;
	for(int i=s;i>=0;i--){
		if(i==0){
			f*=1;
		}else{
			f*=i;
		}
		
	}
	int g = 1;
	for(int i=r;i>=0;i--){
		if(i==0){
			g*=1;
		}else{
			g*=i;
		}
		
	}
	int h=1;
	for(int i=s-r;i>=0;i--){
		if(i==0){
			h*=1;
		}else{
			h*=i;
		}
		
	}
	g = f/(g*h);
	return g;
}

public double getP0(){

        

        double p0 = 0, p01 = 0, p02 = 0;


        for(int k = 0; k < this.s; k++){

            p01 += Math.pow(this.alpha, k)/getFactrial(k);

        }

        p02 = Math.pow(this.alpha, this.s)/getFactrial(this.s)/(1-this.rho);

        p0 = 1/(p01+p02);

        return p0;

    }


	
	
	
public double getLq(){

	double lq;
	lq = Math.pow(this.s,this.s)*Math.pow(this.rho,this.s+1)*getP0()/getFactrial(this.s)/Math.pow(1-this.rho,2);
	return lq;
	
}
public double getL(){
	double l;
	l = getLq()+this.alpha;
	return l;
	
}

public double getWq(){
    double wq;
    wq = getLq()/this.lambda; 
    return wq;
}
public double getRho(){
	return this.rho;
	
}
public double getW(){
	double w;
	w = getWq() + (1/this.mu);
	return w;
}

}
