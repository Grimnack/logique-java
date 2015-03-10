package logicline.modeleSemantique ;
import java.util.*;
public class Non extends Formule{
   	protected Formule non ;
   	
   	public Non ( Formule f ) {
   		super() ;
   		this.non = f ;
   	}


   	@Override
	public boolean valeur() throws VariableLibreException {
		return false;
	}
	
	
	@Override
	public String toString(){
		return "" ;
	}
	
	@Override
	public Set<String> variablesLibres(){
		return null ;
	}

	@Override
	public Formule substitue(Substitution s){
		return null ;
	}	
}
