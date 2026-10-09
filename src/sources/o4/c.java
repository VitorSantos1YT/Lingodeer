package o4;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import android.util.SparseArray;
import android.util.TypedValue;
import java.util.WeakHashMap;
import n4.t;
import q4.h;
import q4.j;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f44710a = null;

    public static int a(Context context, String str) {
        if (str == null) {
            throw new NullPointerException("permission must be non-null");
        }
        if (Build.VERSION.SDK_INT >= 33 || !TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) {
            return context.checkPermission(str, Process.myPid(), Process.myUid());
        }
        return new t(context).f43230a.areNotificationsEnabled() ? 0 : -1;
    }

    public static ColorStateList b(Context context, int i11) {
        ColorStateList colorStateListA;
        ColorStateList colorStateList;
        q4.g gVar;
        Resources resources = context.getResources();
        Resources.Theme theme = context.getTheme();
        h hVar = new h(resources, theme);
        synchronized (j.f47449c) {
            try {
                SparseArray sparseArray = (SparseArray) j.f47448b.get(hVar);
                colorStateListA = null;
                if (sparseArray == null || sparseArray.size() <= 0 || (gVar = (q4.g) sparseArray.get(i11)) == null) {
                    colorStateList = null;
                } else {
                    if (gVar.f47443b.equals(resources.getConfiguration())) {
                        if (theme != null || gVar.f47444c != 0) {
                            if (theme == null || gVar.f47444c != theme.hashCode()) {
                            }
                        }
                        colorStateList = gVar.f47442a;
                    }
                    sparseArray.remove(i11);
                    colorStateList = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (colorStateList != null) {
            return colorStateList;
        }
        ThreadLocal threadLocal = j.f47447a;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        resources.getValue(i11, typedValue, true);
        int i12 = typedValue.type;
        if (i12 < 28 || i12 > 31) {
            try {
                colorStateListA = q4.b.a(resources, resources.getXml(i11), theme);
            } catch (Exception unused) {
            }
        }
        if (colorStateListA == null) {
            return resources.getColorStateList(i11, theme);
        }
        synchronized (j.f47449c) {
            try {
                WeakHashMap weakHashMap = j.f47448b;
                SparseArray sparseArray2 = (SparseArray) weakHashMap.get(hVar);
                if (sparseArray2 == null) {
                    sparseArray2 = new SparseArray();
                    weakHashMap.put(hVar, sparseArray2);
                }
                sparseArray2.append(i11, new q4.g(colorStateListA, hVar.f47445a.getConfiguration(), theme));
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return colorStateListA;
    }

    public static String c(Context context) {
        String str = context.getApplicationContext().getPackageName() + ".DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION";
        if (g.a(context, str) == 0) {
            return str;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            str = context.getOpPackageName() + ".DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION";
            if (g.a(context, str) == 0) {
                return str;
            }
        }
        throw new RuntimeException(ep.a.g("Permission ", str, " is required by your application to receive broadcasts, please add it to your manifest"));
    }

    public static void d(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, int i11) {
        int i12 = i11 & 2;
        if (i12 == 0 && (i11 & 4) == 0) {
            throw new IllegalArgumentException("One of either RECEIVER_EXPORTED or RECEIVER_NOT_EXPORTED is required");
        }
        if (i12 != 0 && (i11 & 4) != 0) {
            throw new IllegalArgumentException("Cannot specify both RECEIVER_EXPORTED and RECEIVER_NOT_EXPORTED");
        }
        int i13 = Build.VERSION.SDK_INT;
        if (i13 >= 33) {
            a.b(context, broadcastReceiver, intentFilter, i11);
            return;
        }
        if (i13 >= 26) {
            a.a(context, broadcastReceiver, intentFilter, i11);
        } else if ((i11 & 4) != 0) {
            context.registerReceiver(broadcastReceiver, intentFilter, c(context), null);
        } else {
            context.registerReceiver(broadcastReceiver, intentFilter, null, null);
        }
    }
}
