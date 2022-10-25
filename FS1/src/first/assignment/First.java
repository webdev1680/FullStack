package first.assignment;

public class First {

	public static void main(String[] args) {
		int n=9;
		for(int i=0;i<n;i++) {
			for(int j=0;j<8*n;j++) {
				if(j==0||(j==(2*n)%(2*n-2)||j==(2*n)%(2*n-2)+n-1||(j-i==(2*n)%(2*n-2) && i<n-1))||(j==(n+3)|| (j>(n+3)&& j<(2*n+3) && (i==0 || i==n/2 || i==n-1))) || (j==2*n+4 || j== 3*n+4 || (i==n-1 && j>2*n+4 && j<3*n+4)) || (j==3*n+6||(i==0 && j>3*n+6 && j<4*n+6) || i<=n/2 && j==4*n+6 || i==n/2 && j>3*n+6 && j<4*n+6 ||(i>n/2 && j==4*n+3+i-n/2)||(j==4*n+8&&i!=0&&i!=n-1 || j==5*n+8&&i!=0&&i!=n-1 || j>4*n+8&&j<5*n+8&&(i==0||i==n-1) ))||(j==5*n+10||j==6*n+9||(j-i==5*n+10&&i<n-1)))
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println("");
		}

	}

}
