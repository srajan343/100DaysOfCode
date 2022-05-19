
public class string_builder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder("srajan");
		System.out.println(sb);
		
		System.out.println(sb.charAt(0));
		
		// set char at index 0
		sb.setCharAt(0, 't');
		System.out.println(sb);
		
		// insert 
		sb.insert(0, 's');
		System.out.println(sb);
		
		// tsrajan --> tsrajian ;
		sb.insert(5,'i' );
		System.out.println(sb);
		
		//delete
		sb.delete(5, sb.length());
		System.out.println(sb);
		
		// append - end mai element insert krna ;
		sb.append("an");
		System.out.println(sb);
		
		sb.delete(1, 2);
		System.out.println(sb);
		
		
		
	}

}
