package ew;

import android.app.ActivityManager;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.PowerManager;
import android.os.Process;
import android.text.TextUtils;
import androidx.drawerlayout.widget.ktFt.FpIL;
import com.adjust.sdk.Constants;
import i0.pKy.shrCcjmOhAmRC;
import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import ns.o;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f25949a = 65536;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static long f25950b = 2000;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Boolean f25951c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Pattern f25952d = Pattern.compile("attachment;\\s*filename\\*\\s*=\\s*\"*([^\"]*)'\\S*'([^\"]*)\"*");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Pattern f25953e = Pattern.compile(shrCcjmOhAmRC.TbJwf);

    public static xq.c a(String str) throws IOException {
        if (TextUtils.isEmpty(str)) {
            throw new RuntimeException("found invalid internal destination path, empty");
        }
        File file = new File(str);
        if (file.exists() && file.isDirectory()) {
            throw new RuntimeException(String.format(Locale.ENGLISH, "found invalid internal destination path[%s], & path is directory[%B]", str, Boolean.valueOf(file.isDirectory())));
        }
        if (file.exists() || file.createNewFile()) {
            xv.c.f56595a.f().getClass();
            return new xq.c(file);
        }
        String absolutePath = file.getAbsolutePath();
        Locale locale = Locale.ENGLISH;
        throw new IOException(ep.a.e("create new file error  ", absolutePath));
    }

    public static void b(String str, String str2) {
        if (str2 != null) {
            File file = new File(str2);
            if (file.exists()) {
                file.delete();
            }
        }
        if (str != null) {
            File file2 = new File(str);
            if (file2.exists()) {
                file2.delete();
            }
        }
    }

    public static String c(String str, String str2) {
        if (str2 == null) {
            throw new IllegalStateException("can't generate real path, the file name is null");
        }
        if (str == null) {
            throw new IllegalStateException("can't generate real path, the directory is null");
        }
        String str3 = File.separator;
        Locale locale = Locale.ENGLISH;
        return ep.a.D(str, str3, str2);
    }

    public static String d(String str) {
        int length = str.length();
        char c11 = File.separatorChar;
        int i11 = (c11 == '\\' && length > 2 && str.charAt(1) == ':') ? 2 : 0;
        int iLastIndexOf = str.lastIndexOf(c11);
        int i12 = (iLastIndexOf != -1 || i11 <= 0) ? iLastIndexOf : 2;
        if (i12 == -1 || str.charAt(length - 1) == c11) {
            return null;
        }
        return (str.indexOf(c11) == i12 && str.charAt(i11) == c11) ? str.substring(0, i12 + 1) : str.substring(0, i12);
    }

    public static boolean e(bw.c cVar, String str) {
        if (str == null) {
            return false;
        }
        File file = new File(str);
        boolean zExists = file.exists();
        boolean zIsDirectory = file.isDirectory();
        if (!zExists || zIsDirectory) {
            return false;
        }
        long length = file.length();
        long j11 = cVar.f6396t.get();
        if (cVar.M <= 1 && j11 == 0) {
            return false;
        }
        long j12 = cVar.H;
        if (length >= j11) {
            return j12 == -1 || (length <= j12 && j11 < j12);
        }
        return false;
    }

    public static boolean g() {
        ConnectivityManager connectivityManager = (ConnectivityManager) o.f44007a.getSystemService("connectivity");
        if (connectivityManager == null) {
            o00.a.P(f.class, "failed to get connectivity manager!", new Object[0]);
            return true;
        }
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        return activeNetworkInfo == null || activeNetworkInfo.getType() != 1;
    }

    public static void h(Context context) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(context.getFilesDir().getAbsolutePath());
        File file = new File(ep.a.k(sb2, File.separator, "filedownloader"), ".old_file_converted");
        try {
            file.getParentFile().mkdirs();
            file.createNewFile();
        } catch (IOException e8) {
            e8.printStackTrace();
        }
    }

    public static String i(String str) {
        try {
            byte[] bArrDigest = MessageDigest.getInstance("MD5").digest(str.getBytes(Constants.ENCODING));
            StringBuilder sb2 = new StringBuilder(bArrDigest.length * 2);
            for (byte b3 : bArrDigest) {
                int i11 = b3 & 255;
                if (i11 < 16) {
                    sb2.append("0");
                }
                sb2.append(Integer.toHexString(i11));
            }
            return sb2.toString();
        } catch (UnsupportedEncodingException e8) {
            throw new RuntimeException("Huh, UTF-8 should be supported?", e8);
        } catch (NoSuchAlgorithmException e10) {
            throw new RuntimeException("Huh, MD5 should be supported?", e10);
        }
    }

    public static boolean j(Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        PowerManager powerManager;
        if (Build.VERSION.SDK_INT < 26) {
            return false;
        }
        ActivityManager activityManager = (ActivityManager) context.getApplicationContext().getSystemService("activity");
        if (activityManager == null || (runningAppProcesses = activityManager.getRunningAppProcesses()) == null || (powerManager = (PowerManager) context.getSystemService("power")) == null || !powerManager.isInteractive()) {
            return true;
        }
        String packageName = context.getApplicationContext().getPackageName();
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
            if (runningAppProcessInfo.processName.equals(packageName) && runningAppProcessInfo.importance == 100) {
                return false;
            }
        }
        return true;
    }

    public static boolean f(Context context) {
        boolean zEndsWith;
        Boolean bool = f25951c;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (d.f25940a.f25944d) {
            zEndsWith = true;
        } else {
            int iMyPid = Process.myPid();
            ActivityManager activityManager = (ActivityManager) context.getSystemService(FpIL.pMmEJJ);
            if (activityManager == null) {
                o00.a.P(f.class, "fail to get the activity manager!", new Object[0]);
                return false;
            }
            List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = activityManager.getRunningAppProcesses();
            if (runningAppProcesses == null || runningAppProcesses.isEmpty()) {
                o00.a.P(f.class, "The running app process info list from ActivityManager is null or empty, maybe current App is not running.", new Object[0]);
                return false;
            }
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (runningAppProcessInfo.pid == iMyPid) {
                    zEndsWith = runningAppProcessInfo.processName.endsWith(":filedownloader");
                }
            }
            zEndsWith = false;
        }
        f25951c = Boolean.valueOf(zEndsWith);
        return zEndsWith;
    }
}
