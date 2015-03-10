package logicline.modeleSemantique ;
import java.util.*;
public class Constante extends Formule{
	protected boolean constante ;
	
	public Constante (boolean b) {
		this.constante = b ;
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
