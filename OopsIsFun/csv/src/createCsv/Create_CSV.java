package createCsv;

import java.io.File;
import java.io.PrintWriter;

public class Create_CSV {
	public static void main(String[] args) {
		
		try {
			PrintWriter pw = new PrintWriter(new File("C:\\csv\\multiplication.csv"));
            StringBuilder sb = new StringBuilder();
            
            int n=2;
                
                for(int i=1; i<=10; i++) {
                	sb.append(n);
                	sb.append(",");
                    sb.append("*");
                    sb.append(",");
                    sb.append(i);
                    sb.append(",");
                    sb.append("equal");
                    sb.append(",");
                    sb.append(n*i);
                    sb.append("\r\n");
                }
           
            pw.write(sb.toString());
            pw.close();
            
		} catch (Exception e) {
			
		}
	}

}
