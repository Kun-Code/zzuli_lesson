/*package com.zzuli.lesson.util;

import java.io.File;
import it.sauronsoftware.jave.Encoder;
import it.sauronsoftware.jave.MultimediaInfo;
public class VideoUtil {

	private String ReadVideoTime(File source) {
		Encoder encoder = new Encoder();
		String length = "";
		try {
		MultimediaInfo m = encoder.getInfo(source);
		long ls = m.getDuration()/1000;
		int hour = (int) (ls/3600);
		int minute = (int) (ls%3600)/60;
		int second = (int) (ls-hour*3600-minute*60);
		length = hour+"'"+minute+"''"+second+"'''";
		} catch (Exception e) {
		e.printStackTrace();
		}
		return length;
		}
}
*/