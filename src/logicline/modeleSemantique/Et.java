package logicline.modeleSemantique ;
import java.util.*;
public class Et extends Formule{
   	protected Formule gauche ;
   	protected Formule droite ;
   
   	public Et ( Formule gauche , Formule droite) {
   		this.gauche = gauche ;
   		this.droite = droite ;
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
