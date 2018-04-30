package file;

import java.io.File;
import java.math.BigDecimal;

public class FileUtil {

	public final static long ONE_KB = 1024;
	public final static long ONE_MB = 1024 * ONE_KB;
	public final static long ONE_GB = 1024 * ONE_MB;
	
	
	
	private static long total = 0;
	public static void remove(File file) {
		while(file.exists()) {
				romove(file);
			}
	}
	
	public static void romove(File file) {
		if(file.isFile()) {
			file.delete();
		} else if(file.listFiles().length==0) {
			file.delete();
		} else{
			File[] files = file.listFiles();
			for(File fil : files) {
				romove(fil);
			}
		}
	}
	
	public static void delete(File file) {
		if(!file.isFile()) {
			File[] files = file.listFiles();
			for(File fil : files) {
				delete(fil);
			}
		} 
		file.delete();
	}
	
	
	public static long add(File file) {
		if(!file.isFile()) {
			File[] files = file.listFiles();
			for(File fil : files) {
				add(fil);
			}
		} 
		total += file.length();
		return total;
	}
	
	public static String getReadSpace(long space) {
		if(space/ONE_GB > 0) {
			return space/ONE_GB +  "GB";
		} else if(space/ONE_MB > 0) {
			return space/ONE_MB + "MB";
		} else if(space/ONE_KB > 0) {
			return space/ONE_KB + "KB";
		} else {
			return space + "B";
		}
	}
	
	public static String getReadSpace(double space) {
		
		if(space/ONE_GB > 0) {
			BigDecimal s = new BigDecimal(space/ONE_GB);
			double j = s.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
			return j +  "GB";
		} else if(space/ONE_MB > 0) {
			BigDecimal s = new BigDecimal(space/ONE_MB);
			double j = s.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
			return j +  "MB";
		} else if(space/ONE_KB > 0) {
			BigDecimal s = new BigDecimal(space/ONE_KB);
			double j = s.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
			return j +  "KB";
		} else {
			return space + "B";
		}
	}
}
