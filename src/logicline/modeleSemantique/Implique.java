package logicline.modeleSemantique ;
import java.util.*;


public class Implique extends Formule{
   	protected Formule gauche ;
   	protected Formule droite ;
   	
   	public Implique ( Formule g , Formule d ) {
   		this.gauche = g ;
   		this.droite = d ;
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
