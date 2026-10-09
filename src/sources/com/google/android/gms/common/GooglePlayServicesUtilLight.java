package com.google.android.gms.common;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageInstaller;
import android.content.pm.PackageManager;
import android.os.Build;
import com.alibaba.sdk.android.oss.common.OSSConstants;
import com.google.android.gms.common.wrappers.Wrappers;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class GooglePlayServicesUtilLight {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f8651b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static boolean f8652c = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AtomicBoolean f8650a = new AtomicBoolean();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final AtomicBoolean f8653d = new AtomicBoolean();

    public static boolean a(Context context) {
        if (!f8652c) {
            try {
                PackageInfo packageInfoB = Wrappers.a(context).b(Build.VERSION.SDK_INT >= 28 ? 134217792 : 64, "com.google.android.gms");
                GoogleSignatureVerifier.a(context);
                if (packageInfoB == null || GoogleSignatureVerifier.c(packageInfoB, false) || !GoogleSignatureVerifier.c(packageInfoB, true)) {
                    f8651b = false;
                } else {
                    f8651b = true;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            } finally {
                f8652c = true;
            }
        }
        return f8651b || !"user".equals(Build.TYPE);
    }

    public static boolean b(Context context) {
        try {
            Iterator<PackageInstaller.SessionInfo> it = context.getPackageManager().getPackageInstaller().getAllSessions().iterator();
            while (it.hasNext()) {
                if ("com.google.android.gms".equals(it.next().getAppPackageName())) {
                    return true;
                }
            }
            return context.getPackageManager().getApplicationInfo("com.google.android.gms", OSSConstants.DEFAULT_BUFFER_SIZE).enabled;
        } catch (PackageManager.NameNotFoundException | Exception unused) {
            return false;
        }
    }
}
