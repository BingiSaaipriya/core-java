package om.objectsdemo;


public class Object {
     
@Override
public String toString() {
	return  getClass().getName() + '@' + Integer.toHexString(hashCode());
	 

}
}

	


