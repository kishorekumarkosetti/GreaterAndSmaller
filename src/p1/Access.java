package p1;
public class Access {
public static IgreaterAndsmaller getRef(int choice) {
	return switch(choice) {
	case 1: yield new IgreaterAndsmaller()
				{
					public int compareTo(int x,int y)

				{
					if(x>y) return x;
					else return y;
				}
			};
	case 2 : yield new IgreaterAndsmaller()
				{
					public int compareTo(int x,int y)
				{
					if(x<y) return x;
					else return y;
				}
			};
			default : yield null;
			};
		}//OuterClass method
}//OuterClass

