/**
 * @author Christophe Debruyne <c.debruyne@uliege.be> Université de Liège
 */

package rali.util;

public abstract class Either {

	private Object o;

	public Either(Object o) {
		this.o = o;
	}
	
	public Object get() {
		return o;
	}
}