package com.stkouyu.util;

import android.content.Context;
import com.adjust.sdk.Constants;
import com.stkouyu.util.httputil.EncodingUtils;
import com.tbruyelle.rxpermissions3.BuildConfig;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import mf.sOm.txBUGYhC;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public class AiUtil {
    private static int BUFFER_SIZE = 8192;
    private static String tag = "AiUtil";

    private static String bytes2hex(byte[] bArr) {
        StringBuffer stringBuffer = new StringBuffer(bArr.length * 2);
        for (byte b3 : bArr) {
            int i11 = b3 & 255;
            if (i11 < 16) {
                stringBuffer.append('0');
            }
            stringBuffer.append(Integer.toHexString(i11));
        }
        return stringBuffer.toString();
    }

    private static void copyFile(Context context, String str, File file) throws IOException {
        InputStream fileInputStream;
        BufferedInputStream bufferedInputStream;
        byte[] bArr;
        FileOutputStream fileOutputStream;
        try {
            fileInputStream = context.getAssets().open(str);
            while (true) {
                int i11 = bufferedInputStream.read(bArr, 0, BUFFER_SIZE);
                if (i11 <= 0) {
                    fileOutputStream.flush();
                    fileOutputStream.close();
                    bufferedInputStream.close();
                    fileInputStream.close();
                    return;
                }
                fileOutputStream.write(bArr, 0, i11);
            }
        } catch (Exception e8) {
            MyLog.e(tag, "===>ST Exception");
            e8.printStackTrace();
            fileInputStream = null;
        }
        File file2 = new File(getFilesDir(context).getPath() + "/resupdate/native.res");
        if (file2.exists()) {
            fileInputStream = new FileInputStream(file2);
        }
        bufferedInputStream = new BufferedInputStream(fileInputStream, BUFFER_SIZE);
        File file3 = new File(file, str);
        File parentFile = file3.getParentFile();
        if (parentFile != null && !parentFile.exists()) {
            parentFile.mkdirs();
        }
        bArr = new byte[BUFFER_SIZE];
        fileOutputStream = new FileOutputStream(file3);
    }

    public static void copyNativeResToSD(Context context, String str) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(str);
        InputStream inputStreamOpen = context.getAssets().open("native.res");
        byte[] bArr = new byte[1024];
        while (true) {
            int i11 = inputStreamOpen.read(bArr);
            if (i11 <= 0) {
                fileOutputStream.flush();
                inputStreamOpen.close();
                fileOutputStream.close();
                return;
            }
            fileOutputStream.write(bArr, 0, i11);
        }
    }

    public static File externalFilesDir(Context context) {
        File externalFilesDir = null;
        try {
            externalFilesDir = context.getExternalFilesDir(BuildConfig.VERSION_NAME);
            if (externalFilesDir != null && externalFilesDir.exists()) {
                return externalFilesDir;
            }
            return context.getFilesDir();
        } catch (Exception e8) {
            e8.printStackTrace();
            return externalFilesDir;
        } catch (Throwable th2) {
            th2.printStackTrace();
            return externalFilesDir;
        }
    }

    public static File getFilesDir(Context context) {
        File externalFilesDir = context.getExternalFilesDir(null);
        return (externalFilesDir == null || !externalFilesDir.exists()) ? context.getFilesDir() : externalFilesDir;
    }

    public static long getHanziCount(String str) {
        return str.trim().split("-").length;
    }

    public static long getWordCount(String str) {
        return str.trim().split("\\W+").length;
    }

    public static String md5(Context context, InputStream inputStream) {
        byte[] bArr = new byte[BUFFER_SIZE];
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            while (true) {
                int i11 = inputStream.read(bArr, 0, BUFFER_SIZE);
                if (i11 <= 0) {
                    inputStream.close();
                    return bytes2hex(messageDigest.digest());
                }
                messageDigest.update(bArr, 0, i11);
            }
        } catch (Exception e8) {
            e8.printStackTrace();
            return null;
        }
    }

    public static String readFile(File file) {
        String string = null;
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            byte[] bArr = new byte[fileInputStream.available()];
            fileInputStream.read(bArr);
            string = EncodingUtils.getString(bArr, Constants.ENCODING);
            fileInputStream.close();
            return string;
        } catch (FileNotFoundException e8) {
            e8.printStackTrace();
            return string;
        } catch (IOException e10) {
            e10.printStackTrace();
            return string;
        }
    }

    public static String readFileFromAssets(Context context, String str) {
        String string = null;
        try {
            InputStream inputStreamOpen = context.getAssets().open(str);
            byte[] bArr = new byte[inputStreamOpen.available()];
            inputStreamOpen.read(bArr);
            string = EncodingUtils.getString(bArr, Constants.ENCODING);
            inputStreamOpen.close();
            return string;
        } catch (IOException e8) {
            e8.printStackTrace();
            return string;
        }
    }

    private static void removeDirectory(File file) {
        if (file.isDirectory()) {
            File[] fileArrListFiles = file.listFiles();
            for (int i11 = 0; i11 < fileArrListFiles.length; i11++) {
                if (fileArrListFiles[i11].isDirectory()) {
                    removeDirectory(fileArrListFiles[i11]);
                }
                File file2 = new File(fileArrListFiles[i11].getAbsolutePath() + System.currentTimeMillis());
                fileArrListFiles[i11].renameTo(file2);
                file2.delete();
            }
            File file3 = new File(file.getAbsolutePath() + System.currentTimeMillis());
            file.renameTo(file3);
            file3.delete();
        }
    }

    public static String sha1(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
            messageDigest.update(str.getBytes(), 0, str.length());
            return bytes2hex(messageDigest.digest());
        } catch (Exception e8) {
            e8.printStackTrace();
            return null;
        }
    }

    private static void unzip(Context context, String str, File file) throws IOException {
        InputStream inputStreamOpen = context.getAssets().open(str);
        ZipInputStream zipInputStream = new ZipInputStream(new BufferedInputStream(inputStreamOpen, BUFFER_SIZE));
        while (true) {
            ZipEntry nextEntry = zipInputStream.getNextEntry();
            if (nextEntry == null) {
                zipInputStream.close();
                inputStreamOpen.close();
                return;
            }
            if (nextEntry.isDirectory()) {
                new File(file, nextEntry.getName()).mkdirs();
            } else {
                File file2 = new File(file, nextEntry.getName());
                File parentFile = file2.getParentFile();
                if (parentFile != null && !parentFile.exists()) {
                    parentFile.mkdirs();
                }
                byte[] bArr = new byte[BUFFER_SIZE];
                FileOutputStream fileOutputStream = new FileOutputStream(file2);
                while (true) {
                    int i11 = zipInputStream.read(bArr, 0, BUFFER_SIZE);
                    if (i11 <= 0) {
                        break;
                    } else {
                        fileOutputStream.write(bArr, 0, i11);
                    }
                }
                fileOutputStream.flush();
                fileOutputStream.close();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x009b A[Catch: Exception -> 0x0063, TryCatch #2 {Exception -> 0x0063, blocks: (B:9:0x001e, B:11:0x0040, B:14:0x0065, B:16:0x0080, B:18:0x008b, B:21:0x009b, B:23:0x00a1, B:24:0x00a5, B:8:0x0019, B:5:0x000e), top: B:28:0x0005, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:23:0x00a1 A[Catch: Exception -> 0x0063, TryCatch #2 {Exception -> 0x0063, blocks: (B:9:0x001e, B:11:0x0040, B:14:0x0065, B:16:0x0080, B:18:0x008b, B:21:0x009b, B:23:0x00a1, B:24:0x00a5, B:8:0x0019, B:5:0x000e), top: B:28:0x0005, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:24:0x00a5 A[Catch: Exception -> 0x0063, TRY_LEAVE, TryCatch #2 {Exception -> 0x0063, blocks: (B:9:0x001e, B:11:0x0040, B:14:0x0065, B:16:0x0080, B:18:0x008b, B:21:0x009b, B:23:0x00a1, B:24:0x00a5, B:8:0x0019, B:5:0x000e), top: B:28:0x0005, inners: #1 }] */
    public static File unzipFile(Context context, String str) {
        InputStream inputStreamOpen;
        try {
            try {
                try {
                    inputStreamOpen = context.getAssets().open(str);
                } catch (Exception unused) {
                    inputStreamOpen = context.getAssets().open("native.res");
                    str = "native.res";
                }
            } catch (Exception e8) {
                e8.printStackTrace();
                str = "native.res";
                inputStreamOpen = null;
            }
            if (new File(getFilesDir(context).getPath() + "/resupdate/native.res").exists()) {
                inputStreamOpen = new FileInputStream(new File(getFilesDir(context).getPath() + "/resupdate/native.res"));
                str = "native.res";
            }
            File file = new File(externalFilesDir(context), str.replaceAll("\\.[^.]*$", BuildConfig.VERSION_NAME));
            String strMd5 = md5(context, inputStreamOpen);
            if (file.isDirectory()) {
                File file2 = new File(file, "native.res");
                if (!file2.exists() || !md5(context, new FileInputStream(file2)).equals(strMd5)) {
                    if ("native.res".equals(str)) {
                        copyFile(context, str, file);
                    } else {
                        unzip(context, str, file);
                    }
                }
            } else if ("native.res".equals(str)) {
                copyFile(context, str, file);
            } else {
                unzip(context, str, file);
            }
            return file;
        } catch (Exception e10) {
            e10.printStackTrace();
            MyLog.e(tag, "Failed to extract resource", e10);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x009b A[Catch: Exception -> 0x0063, TryCatch #2 {Exception -> 0x0063, blocks: (B:9:0x001e, B:11:0x0040, B:14:0x0065, B:16:0x0080, B:18:0x008b, B:21:0x009b, B:23:0x00a1, B:24:0x00a5, B:8:0x0019, B:5:0x000e), top: B:28:0x0005, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:23:0x00a1 A[Catch: Exception -> 0x0063, TryCatch #2 {Exception -> 0x0063, blocks: (B:9:0x001e, B:11:0x0040, B:14:0x0065, B:16:0x0080, B:18:0x008b, B:21:0x009b, B:23:0x00a1, B:24:0x00a5, B:8:0x0019, B:5:0x000e), top: B:28:0x0005, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:24:0x00a5 A[Catch: Exception -> 0x0063, TRY_LEAVE, TryCatch #2 {Exception -> 0x0063, blocks: (B:9:0x001e, B:11:0x0040, B:14:0x0065, B:16:0x0080, B:18:0x008b, B:21:0x009b, B:23:0x00a1, B:24:0x00a5, B:8:0x0019, B:5:0x000e), top: B:28:0x0005, inners: #1 }] */
    public static File unzipFileCN(Context context, String str) {
        InputStream inputStreamOpen;
        try {
            try {
                try {
                    inputStreamOpen = context.getAssets().open(str);
                } catch (Exception unused) {
                    inputStreamOpen = context.getAssets().open("native_cn.res");
                    str = "native_cn.res";
                }
            } catch (Exception e8) {
                e8.printStackTrace();
                str = "native_cn.res";
                inputStreamOpen = null;
            }
            if (new File(getFilesDir(context).getPath() + "/resupdate/native_cn.res").exists()) {
                inputStreamOpen = new FileInputStream(new File(getFilesDir(context).getPath() + "/resupdate/native_cn.res"));
                str = "native_cn.res";
            }
            File file = new File(externalFilesDir(context), str.replaceAll("\\.[^.]*$", BuildConfig.VERSION_NAME));
            String strMd5 = md5(context, inputStreamOpen);
            if (file.isDirectory()) {
                File file2 = new File(file, "native_cn.res");
                if (!file2.exists() || !md5(context, new FileInputStream(file2)).equals(strMd5)) {
                    if ("native_cn.res".equals(str)) {
                        copyFile(context, str, file);
                    } else {
                        unzip(context, str, file);
                    }
                }
            } else if ("native_cn.res".equals(str)) {
                copyFile(context, str, file);
            } else {
                unzip(context, str, file);
            }
            return file;
        } catch (Exception e10) {
            e10.printStackTrace();
            MyLog.e(tag, "Failed to extract resource", e10);
            return null;
        }
    }

    public static void writeToFile(String str, String str2) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(str);
            fileOutputStream.write(str2.getBytes());
            fileOutputStream.close();
        } catch (FileNotFoundException e8) {
            e8.printStackTrace();
        } catch (IOException e10) {
            e10.printStackTrace();
        }
    }

    public static File copyDb2SD(Context context, String str) {
        InputStream fileInputStream;
        File file;
        try {
            try {
                fileInputStream = context.getAssets().open(str);
            } catch (Exception e8) {
                MyLog.e(tag, "Failed to extract db", e8);
                fileInputStream = null;
            }
            if (new File(getFilesDir(context).getPath() + "/resupdate/" + str).exists()) {
                fileInputStream = new FileInputStream(new File(getFilesDir(context).getPath() + "/resupdate/" + str));
            }
            file = new File(externalFilesDir(context), str.replaceAll(txBUGYhC.NrJR, BuildConfig.VERSION_NAME));
            try {
                String strMd5 = md5(context, fileInputStream);
                if (file.isDirectory()) {
                    File file2 = new File(file, str);
                    if (file2.exists() && md5(context, new FileInputStream(file2)).equals(strMd5)) {
                        return file;
                    }
                }
                copyFile(context, str, file);
            } catch (Exception e10) {
                e = e10;
                try {
                    MyLog.e(tag, "Failed to extract db", e);
                } catch (Exception e11) {
                    MyLog.e(tag, "Failed to extract db", e11);
                    return null;
                }
            }
        } catch (Exception e12) {
            e = e12;
            file = null;
            MyLog.e(tag, "Failed to extract db", e);
            return file;
        }
        return file;
    }

    public static void writeToFile(File file, String str) {
        try {
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write(str);
            fileWriter.close();
        } catch (IOException e8) {
            e8.printStackTrace();
        }
    }

    public static void writeToFile(File file, InputStream inputStream) {
        byte[] bArr = new byte[BUFFER_SIZE];
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            while (true) {
                int i11 = inputStream.read(bArr, 0, BUFFER_SIZE);
                if (i11 > 0) {
                    fileOutputStream.write(bArr, 0, i11);
                } else {
                    fileOutputStream.close();
                    return;
                }
            }
        } catch (FileNotFoundException e8) {
            e8.printStackTrace();
        } catch (IOException e10) {
            e10.printStackTrace();
        }
    }
}
