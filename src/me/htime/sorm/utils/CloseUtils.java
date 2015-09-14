package me.htime.sorm.utils;

import java.io.Closeable;
import java.io.IOException;

public class CloseUtils {

	// 可传入多个要关闭的资源
	public void closeAll(Closeable... closeable){
		if(closeable!=null){
			try{
				for(Closeable c : closeable){
					if(c!=null){
						c.close();
					}
				}
			}catch(IOException e){
				e.printStackTrace();
			}
		}
	}

}
