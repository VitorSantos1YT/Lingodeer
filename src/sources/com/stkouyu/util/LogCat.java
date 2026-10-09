package com.stkouyu.util;

import android.content.Context;
import android.os.Handler;
import com.adjust.sdk.Constants;
import com.alibaba.sdk.android.oss.common.utils.HttpHeaders;
import com.stkouyu.setting.EngineSetting;
import com.tbruyelle.rxpermissions3.BuildConfig;
import com.youth.banner.config.BannerConfig;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import java.util.UUID;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public class LogCat {
    private static final String TAG = "17kouyu";
    private static HttpURLConnection conn;
    private static Handler handler;
    private static Thread logPushThread;
    private static Thread logThread;
    private static Context mContext;
    private static Runnable runnable;
    private static Map logSizeMap = new HashMap();
    private static Map seekAddressMap = new HashMap();
    private static String appKey = BuildConfig.VERSION_NAME;
    private static String userId = BuildConfig.VERSION_NAME;
    private static boolean enableUploadLog = false;
    private static boolean enableSaveLogCatToFile = false;
    private static Thread getCfgThread = null;
    private static Timer timer = null;

    public static void destorytLogCat() {
        try {
            Timer timer2 = timer;
            if (timer2 != null) {
                timer2.cancel();
                timer = null;
            }
        } catch (Exception e8) {
            MyLog.e(TAG, "===>ST Exception", e8);
            e8.printStackTrace();
        }
        try {
            Thread thread = logThread;
            if (thread != null && thread.isAlive()) {
                logSizeMap.clear();
                logThread.interrupt();
            }
        } catch (Exception e10) {
            MyLog.e(TAG, "===>ST Exception", e10);
            e10.printStackTrace();
        }
        try {
            HttpURLConnection httpURLConnection = conn;
            if (httpURLConnection != null) {
                httpURLConnection.disconnect();
            }
        } catch (Exception e11) {
            MyLog.e(TAG, "===>ST Exception", e11);
            e11.printStackTrace();
        }
        try {
            Thread thread2 = logPushThread;
            if (thread2 == null || !thread2.isAlive()) {
                return;
            }
            logPushThread.interrupt();
        } catch (Exception e12) {
            MyLog.e(TAG, "===>ST Exception", e12);
            e12.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void disableLogcat() {
        Thread thread = logThread;
        if (thread == null || !thread.isAlive()) {
            return;
        }
        logThread.interrupt();
        logThread = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void enableLogCat() {
        try {
            Thread thread = logThread;
            if (thread == null || !thread.isAlive()) {
                final String str = getFilesDir(mContext).getPath() + "/logcat.txt";
                try {
                    File file = new File(str);
                    if (file.isFile() && file.exists() && file.length() > 1048576) {
                        file.delete();
                    }
                } catch (Exception e8) {
                    MyLog.e(TAG, "===>ST Exception", e8);
                    e8.printStackTrace();
                }
                if (enableSaveLogCatToFile) {
                    final InputStream inputStream = Runtime.getRuntime().exec(new String[]{"logcat", "-s", "adb logcat *:D"}).getInputStream();
                    Thread thread2 = new Thread() { // from class: com.stkouyu.util.LogCat.1
                        /* JADX WARN: Code duplicated, block: B:33:0x004d A[EXC_TOP_SPLITTER, SYNTHETIC] */
                        @Override // java.lang.Thread, java.lang.Runnable
                        public void run() throws Throwable {
                            Throwable th2;
                            FileOutputStream fileOutputStream;
                            Exception e10;
                            MyLog.d(LogCat.TAG, "initlogcat");
                            FileOutputStream fileOutputStream2 = null;
                            try {
                                try {
                                    try {
                                        fileOutputStream = new FileOutputStream(str);
                                        try {
                                            byte[] bArr = new byte[1024];
                                            while (true) {
                                                int i11 = inputStream.read(bArr);
                                                if (-1 == i11) {
                                                    fileOutputStream.close();
                                                    return;
                                                } else {
                                                    fileOutputStream.write(bArr, 0, i11);
                                                    fileOutputStream.flush();
                                                }
                                            }
                                        } catch (Exception e11) {
                                            e10 = e11;
                                            MyLog.e(LogCat.TAG, "===>ST Exception", e10);
                                            e10.printStackTrace();
                                            if (fileOutputStream != null) {
                                                fileOutputStream.close();
                                            }
                                        }
                                    } catch (Throwable th3) {
                                        th2 = th3;
                                        if (0 != 0) {
                                            try {
                                                fileOutputStream2.close();
                                            } catch (IOException e12) {
                                                MyLog.e(LogCat.TAG, "===>ST Exception", e12);
                                                e12.printStackTrace();
                                            }
                                        }
                                        throw th2;
                                    }
                                } catch (Exception e13) {
                                    fileOutputStream = null;
                                    e10 = e13;
                                } catch (Throwable th4) {
                                    th2 = th4;
                                    if (0 != 0) {
                                        fileOutputStream2.close();
                                    }
                                    throw th2;
                                }
                            } catch (IOException e14) {
                                MyLog.e(LogCat.TAG, "===>ST Exception", e14);
                                e14.printStackTrace();
                            }
                        }
                    };
                    logThread = thread2;
                    thread2.start();
                }
            }
        } catch (Exception e10) {
            MyLog.e(TAG, "===>ST Exception", e10);
            e10.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String get(String str) {
        StringBuffer stringBuffer = new StringBuffer();
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            httpURLConnection.setRequestMethod("GET");
            httpURLConnection.setConnectTimeout(BannerConfig.LOOP_TIME);
            httpURLConnection.setReadTimeout(BannerConfig.LOOP_TIME);
            try {
                httpURLConnection.connect();
                if (httpURLConnection.getResponseCode() == 200) {
                    InputStreamReader inputStreamReader = new InputStreamReader(httpURLConnection.getInputStream());
                    char[] cArr = new char[4096];
                    while (true) {
                        int i11 = inputStreamReader.read(cArr);
                        if (i11 == -1) {
                            break;
                        }
                        stringBuffer.append(new String(cArr, 0, i11));
                    }
                }
            } catch (Exception e8) {
                e8.printStackTrace();
                return null;
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        return stringBuffer.toString();
    }

    private static void getCfg() {
        String str = appKey;
        if (str == null || str.trim().equals(BuildConfig.VERSION_NAME)) {
            return;
        }
        try {
            timer = new Timer();
            timer.schedule(new TimerTask() { // from class: com.stkouyu.util.LogCat.2
                @Override // java.util.TimerTask, java.lang.Runnable
                public void run() {
                    if (LogCat.timer != null) {
                        String str2 = LogCat.get("https://log-cfg.stkouyu.com/android_" + LogCat.appKey);
                        if (str2 == null || str2.trim().equals(BuildConfig.VERSION_NAME)) {
                            boolean unused = LogCat.enableUploadLog = EngineSetting.getInstance(LogCat.mContext).getEnableUploadLog();
                            boolean unused2 = LogCat.enableSaveLogCatToFile = EngineSetting.getInstance(LogCat.mContext).getEnableSaveLogCatToFile();
                            return;
                        }
                        try {
                            JSONObject jSONObject = new JSONObject(str2);
                            if (jSONObject.has("log")) {
                                JSONObject jSONObject2 = jSONObject.getJSONObject("log");
                                if (jSONObject2.has("upload") && jSONObject2.getInt("upload") == 1) {
                                    boolean unused3 = LogCat.enableUploadLog = true;
                                } else {
                                    boolean unused4 = LogCat.enableUploadLog = false;
                                }
                                if (jSONObject2.has("save_file") && jSONObject2.getInt("save_file") == 1) {
                                    boolean unused5 = LogCat.enableSaveLogCatToFile = true;
                                    LogCat.enableLogCat();
                                } else {
                                    boolean unused6 = LogCat.enableSaveLogCatToFile = false;
                                    LogCat.disableLogcat();
                                }
                            }
                        } catch (Exception e8) {
                            e8.printStackTrace();
                            boolean unused7 = LogCat.enableUploadLog = EngineSetting.getInstance(LogCat.mContext).getEnableUploadLog();
                            boolean unused8 = LogCat.enableSaveLogCatToFile = EngineSetting.getInstance(LogCat.mContext).getEnableSaveLogCatToFile();
                        }
                    }
                }
            }, 3000L, 1800000L);
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static File getFilesDir(Context context) {
        File externalFilesDir = context.getExternalFilesDir(null);
        return (externalFilesDir == null || !externalFilesDir.exists()) ? context.getFilesDir() : externalFilesDir;
    }

    public static void initLogCat(Context context, String str) {
        initLogCat(context, str, null);
    }

    /* JADX WARN: Code duplicated, block: B:55:0x01e2  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v4, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r2v5, types: [boolean] */
    private static String post(String str, Map<String, String> map, Map<String, File> map2, long j11) throws Throwable {
        ?? HasNext;
        DataOutputStream dataOutputStream;
        int i11;
        String string = UUID.randomUUID().toString();
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        conn = httpURLConnection;
        httpURLConnection.setConnectTimeout(BannerConfig.LOOP_TIME);
        conn.setReadTimeout(2000);
        conn.setDoInput(true);
        conn.setDoOutput(true);
        conn.setUseCaches(false);
        conn.setRequestMethod("POST");
        conn.setRequestProperty("Charsert", Constants.ENCODING);
        conn.setRequestProperty(HttpHeaders.CONTENT_TYPE, "multipart/form-data;boundary=" + string);
        conn.setRequestProperty("userId", userId);
        StringBuilder sb2 = new StringBuilder();
        Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
        while (true) {
            HasNext = it.hasNext();
            if (HasNext == 0) {
                break;
            }
            Map.Entry<String, String> next = it.next();
            sb2.append("--");
            sb2.append(string);
            sb2.append("\r\n");
            sb2.append("Content-Disposition: form-data; name=\"" + next.getKey() + "\"\r\n");
            sb2.append("Content-Type: text/plain; charset=UTF-8\r\nContent-Transfer-Encoding: 8bit\r\n\r\n");
            sb2.append(next.getValue());
            sb2.append("\r\n");
        }
        ?? r12 = 0;
        try {
            try {
                dataOutputStream = new DataOutputStream(conn.getOutputStream());
                try {
                    dataOutputStream.write(sb2.toString().getBytes());
                    dataOutputStream.flush();
                    if (map2 != null) {
                        for (Map.Entry<String, File> entry : map2.entrySet()) {
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append("--");
                            sb3.append(string);
                            sb3.append("\r\n");
                            sb3.append("Content-Disposition: form-data; name=\"file\"; filename=\"" + entry.getKey() + "\"\r\n");
                            StringBuilder sb4 = new StringBuilder();
                            sb4.append("Content-Type: application/octet-stream; charset=");
                            sb4.append(Constants.ENCODING);
                            sb4.append("\r\n");
                            sb3.append(sb4.toString());
                            sb3.append("\r\n");
                            dataOutputStream.write(sb3.toString().getBytes());
                            dataOutputStream.flush();
                            FileInputStream fileInputStream = new FileInputStream(entry.getValue());
                            try {
                                try {
                                    long length = entry.getValue().length();
                                    if (j11 > 0 && j11 < length) {
                                        fileInputStream.skip(j11);
                                    }
                                    byte[] bArr = new byte[1024];
                                    i11 = 0;
                                    while (true) {
                                        try {
                                            int i12 = fileInputStream.read(bArr);
                                            if (i12 == -1) {
                                                break;
                                            }
                                            dataOutputStream.write(bArr, 0, i12);
                                            dataOutputStream.flush();
                                            i11 += i12;
                                        } catch (Exception e8) {
                                            e = e8;
                                            e.printStackTrace();
                                        }
                                    }
                                } catch (Exception e10) {
                                    e = e10;
                                    i11 = 0;
                                }
                                fileInputStream.close();
                                j11 += (long) i11;
                                dataOutputStream.write("\r\n".getBytes());
                                dataOutputStream.flush();
                                seekAddressMap.put(entry.getKey(), Long.valueOf(j11));
                            } catch (Throwable th2) {
                                fileInputStream.close();
                                throw th2;
                            }
                        }
                    }
                    dataOutputStream.write(("--" + string + "--\r\n").getBytes());
                    dataOutputStream.flush();
                } catch (Exception e11) {
                    e = e11;
                    e.printStackTrace();
                    if (dataOutputStream != null) {
                    }
                    conn.getResponseCode();
                    conn.disconnect();
                    conn = null;
                    return null;
                }
            } catch (Throwable th3) {
                th = th3;
                r12 = HasNext;
                if (r12 != 0) {
                    r12.close();
                }
                throw th;
            }
        } catch (Exception e12) {
            e = e12;
            dataOutputStream = null;
        } catch (Throwable th4) {
            th = th4;
            if (r12 != 0) {
                r12.close();
            }
            throw th;
        }
        dataOutputStream.close();
        conn.getResponseCode();
        conn.disconnect();
        conn = null;
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:5:0x0008 A[Catch: Exception -> 0x0028, TryCatch #0 {Exception -> 0x0028, blocks: (B:3:0x0002, B:8:0x000d, B:10:0x0011, B:13:0x0018, B:5:0x0008), top: B:18:0x0002 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x000c  */
    private static void pushLog(final Context context, Boolean bool) {
        if (bool != null) {
            try {
                if (!bool.booleanValue()) {
                    if (!enableUploadLog) {
                        return;
                    }
                }
            } catch (Exception e8) {
                e8.printStackTrace();
                return;
            }
        } else if (!enableUploadLog) {
            return;
        }
        Thread thread = logPushThread;
        if (thread == null || !thread.isAlive()) {
            Thread thread2 = new Thread(new Runnable() { // from class: com.stkouyu.util.LogCat.3
                @Override // java.lang.Runnable
                public void run() throws Throwable {
                    MyLog.e(LogCat.TAG, "push logcat");
                    LogCat.uploadLog(LogCat.getFilesDir(context).getPath() + "/logcat.txt", LogCat.appKey + "_android_logcat", 3072L);
                    LogCat.uploadLog(LogCat.getFilesDir(context).getPath() + "/Log.txt", LogCat.appKey + "_android_Log", 512L);
                    LogCat.uploadLog(LogCat.getFilesDir(context).getPath() + "/sdklog.txt", LogCat.appKey + "_android_sdklog", 512L);
                    LogCat.uploadLog(LogCat.getFilesDir(context).getPath() + "/skegn.provision", LogCat.appKey + "_android_provision", 512L);
                    LogCat.uploadLog(LogCat.getFilesDir(context).getPath() + "/skegn.provision.d", LogCat.appKey + "_android_provision_d", 512L);
                    if (LogCat.logPushThread != null) {
                        LogCat.logPushThread.interrupt();
                        Thread unused = LogCat.logPushThread = null;
                    }
                }
            });
            logPushThread = thread2;
            thread2.start();
        }
    }

    public static void pushLogManually(Context context) {
        pushLog(context, Boolean.TRUE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void uploadLog(String str, String str2, long j11) throws Throwable {
        try {
            File file = new File(str);
            if (file.isFile() && file.exists()) {
                if (file.length() > 0) {
                    if (!logSizeMap.containsKey(str2) || logSizeMap.get(str2) == null || file.length() - ((Long) logSizeMap.get(str2)).longValue() >= j11) {
                        HashMap map = new HashMap();
                        map.put("lll", "ggg");
                        map.put("userId", userId);
                        HashMap map2 = new HashMap();
                        map2.put(str2, file);
                        post("https://log1.stkouyu.com:8034/t", map, map2, seekAddressMap.containsKey(str2) ? ((Long) seekAddressMap.get(str2)).longValue() : 0L);
                        logSizeMap.put(str2, Long.valueOf(file.length()));
                        return;
                    }
                    return;
                }
            }
            MyLog.e(TAG, "can not find file");
        } catch (Exception e8) {
            MyLog.e(TAG, "===>ST Exception", e8);
            e8.printStackTrace();
        }
    }

    public static void initLogCat(Context context, String str, String str2) {
        mContext = context.getApplicationContext();
        enableUploadLog = EngineSetting.getInstance(context).getEnableUploadLog();
        enableSaveLogCatToFile = EngineSetting.getInstance(context).getEnableSaveLogCatToFile();
        MyLog.init(context, EngineSetting.getInstance(context).isSDKLogEnabled());
        if (str != null) {
            appKey = str;
        }
        if (str2 != null) {
            userId = str2;
        }
        getCfg();
        enableLogCat();
    }

    public static void pushLog(Context context) {
        pushLog(context, null);
    }
}
