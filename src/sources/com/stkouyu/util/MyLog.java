package com.stkouyu.util;

import android.content.Context;
import defpackage.e;
import fa.EQx.nuRcCS;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import l0.Eeqr.HOBXIlHxIkMBEA;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public class MyLog {
    private static String MYLOGFILEName;
    public static String MYLOG_PATH_SDCARD_DIR;
    private static Boolean MYLOG_SWITCH;
    private static char MYLOG_TYPE;
    private static Boolean MYLOG_WRITE_TO_FILE;
    private static SimpleDateFormat myLogSdf;
    public Context context;

    public static void d(String str, Object obj) {
        log(str, obj.toString(), 'd');
    }

    public static void e(String str, Object obj) {
        log(str, obj.toString(), 'e');
    }

    private static File getFilesDir(Context context) {
        File externalFilesDir = context.getExternalFilesDir(null);
        return (externalFilesDir == null || !externalFilesDir.exists()) ? context.getFilesDir() : externalFilesDir;
    }

    private static String getStackMsg(Throwable th2) {
        StringBuffer stringBuffer = new StringBuffer();
        for (StackTraceElement stackTraceElement : th2.getStackTrace()) {
            stringBuffer.append(stackTraceElement.toString() + "\n");
        }
        return stringBuffer.toString();
    }

    public static void i(String str, Object obj) {
        log(str, obj.toString(), 'i');
    }

    public static void init(Context context, boolean z11) {
        MYLOG_PATH_SDCARD_DIR = getFilesDir(context).getPath();
        File file = new File(MYLOG_PATH_SDCARD_DIR + "/" + MYLOGFILEName);
        if (file.isFile() && file.exists() && file.length() > 1048576) {
            file.delete();
        }
        MYLOG_WRITE_TO_FILE = Boolean.valueOf(z11);
    }

    private static void log(String str, String str2, char c11) {
        if (MYLOG_WRITE_TO_FILE.booleanValue() && MYLOG_SWITCH.booleanValue()) {
            writeLogtoFile(String.valueOf(c11), str, str2);
        }
    }

    public static void v(String str, Object obj) {
        log(str, obj.toString(), 'v');
    }

    public static void w(String str, Object obj) {
        log(str, obj.toString(), 'w');
    }

    static {
        Boolean bool = Boolean.TRUE;
        MYLOG_SWITCH = bool;
        MYLOG_WRITE_TO_FILE = bool;
        MYLOG_TYPE = 'v';
        MYLOG_PATH_SDCARD_DIR = null;
        MYLOGFILEName = nuRcCS.tzsL;
        myLogSdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    }

    public static void d(String str, String str2) {
        log(str, str2, 'd');
    }

    public static void e(String str, String str2) {
        log(str, str2, 'e');
    }

    public static void i(String str, String str2) {
        log(str, str2, 'i');
    }

    public static void v(String str, String str2) {
        log(str, str2, 'v');
    }

    public static void w(String str, String str2) {
        log(str, str2, 'w');
    }

    private static void writeLogtoFile(String str, String str2, String str3) {
        String string;
        if (MYLOG_PATH_SDCARD_DIR == null) {
            return;
        }
        try {
            string = myLogSdf.format(new Date()) + "    " + str + "    " + str2 + "    " + str3;
        } catch (Exception unused) {
            StringBuilder sbS = e.s(HOBXIlHxIkMBEA.qGzTjuefG, str, "    ", str2, "    ");
            sbS.append(str3);
            string = sbS.toString();
        }
        File file = new File(MYLOG_PATH_SDCARD_DIR);
        if (!file.exists()) {
            file.mkdirs();
        }
        File file2 = new File(file.toString(), MYLOGFILEName);
        if (!file2.exists()) {
            try {
                file2.createNewFile();
            } catch (Exception unused2) {
            }
        }
        try {
            FileWriter fileWriter = new FileWriter(file2, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(string);
            bufferedWriter.newLine();
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e8) {
            e8.printStackTrace();
        }
    }

    public static void e(String str, String str2, Throwable th2) {
        if (th2 != null) {
            StringBuilder sbR = e.r(str2, ":");
            sbR.append(getStackMsg(th2));
            log(str, sbR.toString(), 'e');
            return;
        }
        log(str, str2, 'e');
    }
}
