package com.cundong.utils;

/**
 * ��˵����   APK Patch������
 * 
 * @author  Cundong
 * @date    2013-9-6
 * @version 1.0
 */
public class PatchUtils {

	/**
	 * native����
	 * ʹ��·��ΪoldApkPath��apk��·��ΪpatchPath�Ĳ��������ϳ��µ�apk�����洢��newApkPath
	 * @param oldApkPath
	 * @param newApkPath
	 * @param patchPath
	 * @return
	 */
	public static native int patch(String oldApkPath, String newApkPath,
			String patchPath);
}