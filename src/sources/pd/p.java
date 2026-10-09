package pd;

import android.util.Log;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final boolean f46808a = Log.isLoggable("Volley", 2);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f46809b = p.class.getName();

    public static void a(String str, Object... objArr) {
        String.format(Locale.US, str, objArr);
        StackTraceElement[] stackTrace = new Throwable().fillInStackTrace().getStackTrace();
        for (int i11 = 2; i11 < stackTrace.length; i11++) {
            if (!stackTrace[i11].getClassName().equals(f46809b)) {
                String className = stackTrace[i11].getClassName();
                String strSubstring = className.substring(className.lastIndexOf(46) + 1);
                defpackage.e.r(strSubstring.substring(strSubstring.lastIndexOf(36) + 1), ".").append(stackTrace[i11].getMethodName());
                break;
            }
        }
        Locale locale = Locale.US;
        Thread.currentThread().getId();
    }

    public static void b(String str, Object... objArr) {
        if (f46808a) {
            a(str, objArr);
        }
    }
}
