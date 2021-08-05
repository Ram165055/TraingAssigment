import java.util.*;
public class Main
{
	public static void main(String[] args) {
// 		System.out.println("Hello World");
ArrayList<String> name=new ArrayList<String>();
for(int i=0;i<args.length;i++){
    name.add(args[i]);
}
Collections.sort(name);
Iterator itr=name.iterator();
while(itr.hasNext()){
    System.out.println(itr.next());
}
	}
}
