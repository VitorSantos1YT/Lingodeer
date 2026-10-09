package se;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.util.Patterns;
import com.tbruyelle.rxpermissions3.BuildConfig;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;
import lf.j1;
import okhttp3.internal.platform.ZjS.OYAvlbfUyD;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class z {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static SharedPreferences f51624b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final z f51623a = new z();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final AtomicBoolean f51625c = new AtomicBoolean(false);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ConcurrentHashMap f51626d = new ConcurrentHashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ConcurrentHashMap f51627e = new ConcurrentHashMap();

    public final HashMap a() {
        ConcurrentHashMap concurrentHashMap = f51627e;
        if (qf.a.b(this)) {
            return null;
        }
        try {
            HashMap map = new HashMap();
            CopyOnWriteArraySet copyOnWriteArraySet = te.c.f52131d;
            HashSet hashSet = new HashSet();
            Iterator it = te.c.a().iterator();
            while (it.hasNext()) {
                hashSet.add(((te.c) it.next()).b());
            }
            for (String str : concurrentHashMap.keySet()) {
                if (hashSet.contains(str)) {
                    map.put(str, concurrentHashMap.get(str));
                }
            }
            return map;
        } catch (Throwable th2) {
            qf.a.a(this, th2);
            return null;
        }
    }

    public final synchronized void b() {
        if (qf.a.b(this)) {
            return;
        }
        try {
            AtomicBoolean atomicBoolean = f51625c;
            if (atomicBoolean.get()) {
                return;
            }
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(re.s.a());
            kotlin.jvm.internal.m.e(defaultSharedPreferences, "getDefaultSharedPreferen….getApplicationContext())");
            f51624b = defaultSharedPreferences;
            String string = defaultSharedPreferences.getString(OYAvlbfUyD.IPtfgfWl, BuildConfig.VERSION_NAME);
            if (string == null) {
                string = BuildConfig.VERSION_NAME;
            }
            SharedPreferences sharedPreferences = f51624b;
            if (sharedPreferences == null) {
                kotlin.jvm.internal.m.n("sharedPreferences");
                throw null;
            }
            String string2 = sharedPreferences.getString("com.facebook.appevents.UserDataStore.internalUserData", BuildConfig.VERSION_NAME);
            if (string2 == null) {
                string2 = BuildConfig.VERSION_NAME;
            }
            f51626d.putAll(j1.B(string));
            f51627e.putAll(j1.B(string2));
            atomicBoolean.set(true);
        } catch (Throwable th2) {
            qf.a.a(this, th2);
        }
    }

    public final String c(String str, String str2) {
        String strSubstring;
        if (qf.a.b(this)) {
            return null;
        }
        try {
            int length = str2.length() - 1;
            int i11 = 0;
            boolean z11 = false;
            while (i11 <= length) {
                boolean z12 = kotlin.jvm.internal.m.h(str2.charAt(!z11 ? i11 : length), 32) <= 0;
                if (z11) {
                    if (!z12) {
                        break;
                    }
                    length--;
                } else if (z12) {
                    i11++;
                } else {
                    z11 = true;
                }
            }
            String lowerCase = str2.subSequence(i11, length + 1).toString().toLowerCase();
            kotlin.jvm.internal.m.e(lowerCase, "this as java.lang.String).toLowerCase()");
            if ("em".equals(str)) {
                if (!Patterns.EMAIL_ADDRESS.matcher(lowerCase).matches()) {
                    return BuildConfig.VERSION_NAME;
                }
            } else {
                if ("ph".equals(str)) {
                    Pattern patternCompile = Pattern.compile("[^0-9]");
                    kotlin.jvm.internal.m.e(patternCompile, "compile(...)");
                    String strReplaceAll = patternCompile.matcher(lowerCase).replaceAll(BuildConfig.VERSION_NAME);
                    kotlin.jvm.internal.m.e(strReplaceAll, "replaceAll(...)");
                    return strReplaceAll;
                }
                if ("ge".equals(str)) {
                    if (lowerCase.length() > 0) {
                        strSubstring = lowerCase.substring(0, 1);
                        kotlin.jvm.internal.m.e(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                    } else {
                        strSubstring = BuildConfig.VERSION_NAME;
                    }
                    return ("f".equals(strSubstring) || "m".equals(strSubstring)) ? strSubstring : BuildConfig.VERSION_NAME;
                }
            }
            return lowerCase;
        } catch (Throwable th2) {
            qf.a.a(this, th2);
            return null;
        }
    }
}
