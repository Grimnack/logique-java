package logicline.modeleSemantique ;
import java.util.*;
public class Variable extends Formule{
   	protected String variable ;
   
  	public Variable (String v) {
  		super() ;
  		this.variable = v ;
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
