package com.lingodeer.data.env;

import android.os.Environment;
import defpackage.e;
import ep.a;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public class ExternalStorage {
    public static final String EXTERNAL_SD_CARD = "externalSdCard";
    public static final String SD_CARD = "sdCard";
    public static final String TAG = "ExternalStorage: ";

    public static Map<String, File> getAllStorageLocations() {
        ArrayList arrayList;
        int size;
        int i11;
        HashMap map = new HashMap(10);
        ArrayList arrayList2 = new ArrayList(10);
        ArrayList arrayList3 = new ArrayList(10);
        arrayList2.add("/mnt/sdcard");
        arrayList3.add("/mnt/sdcard");
        try {
            try {
                File file = new File("/proc/mounts");
                if (file.exists()) {
                    Scanner scanner = new Scanner(file);
                    while (scanner.hasNext()) {
                        String strNextLine = scanner.nextLine();
                        if (strNextLine.startsWith("/dev/block/vold/")) {
                            String str = strNextLine.split(" ")[1];
                            if (!str.equals("/mnt/sdcard")) {
                                arrayList2.add(str);
                            }
                        }
                    }
                    scanner.close();
                }
                while (true) {
                    String str2 = SD_CARD;
                    if (i11 >= size) {
                        break;
                    }
                    Object obj = arrayList2.get(i11);
                    i11++;
                    File file2 = new File((String) obj);
                    if (file2.exists() && file2.isDirectory() && file2.canWrite()) {
                        File[] fileArrListFiles = file2.listFiles();
                        String string = "[";
                        if (fileArrListFiles != null) {
                            for (File file3 : fileArrListFiles) {
                                StringBuilder sbN = a.n(string);
                                sbN.append(file3.getName().hashCode());
                                sbN.append(":");
                                sbN.append(file3.length());
                                sbN.append(", ");
                                string = sbN.toString();
                            }
                        }
                        String strM = e.m(string, "]");
                        if (!arrayList.contains(strM)) {
                            String str3 = "sdCard_" + map.size();
                            if (map.size() != 0) {
                                str2 = map.size() == 1 ? EXTERNAL_SD_CARD : str3;
                            }
                            arrayList.add(strM);
                            map.put(str2, file2);
                        }
                    }
                }
            } catch (Exception unused) {
            }
            File file4 = new File("/system/etc/vold.fstab");
            if (file4.exists()) {
                Scanner scanner2 = new Scanner(file4);
                while (scanner2.hasNext()) {
                    String strNextLine2 = scanner2.nextLine();
                    if (strNextLine2.startsWith("dev_mount")) {
                        String strSubstring = strNextLine2.split(" ")[2];
                        if (strSubstring.contains(":")) {
                            strSubstring = strSubstring.substring(0, strSubstring.indexOf(":"));
                        }
                        if (!strSubstring.equals("/mnt/sdcard")) {
                            arrayList3.add(strSubstring);
                        }
                    }
                }
                scanner2.close();
                int i12 = 0;
                while (i12 < arrayList2.size()) {
                    if (!arrayList3.contains((String) arrayList2.get(i12))) {
                        arrayList2.remove(i12);
                        i12--;
                    }
                    i12++;
                }
                arrayList3.clear();
            }
        } catch (Exception unused2) {
        }
        arrayList = new ArrayList(10);
        size = arrayList2.size();
        i11 = 0;
        arrayList2.clear();
        if (map.isEmpty()) {
            map.put(SD_CARD, Environment.getExternalStorageDirectory());
        }
        map.toString();
        return map;
    }

    public static String getSdCardPath() {
        return Environment.getExternalStorageDirectory().getPath() + "/";
    }

    public static boolean isAvailable() {
        String externalStorageState = Environment.getExternalStorageState();
        return "mounted".equals(externalStorageState) || "mounted_ro".equals(externalStorageState);
    }

    public static boolean isWritable() {
        return "mounted".equals(Environment.getExternalStorageState());
    }
}
