package com.google.android.gms.common.wrappers;

import android.content.Context;
import com.google.android.gms.common.util.PlatformVersion;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class InstantApps {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Context f9140a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Boolean f9141b;

    public static synchronized boolean a(Context context) {
        Boolean bool;
        Context applicationContext = context.getApplicationContext();
        Context context2 = f9140a;
        if (context2 != null && (bool = f9141b) != null && context2 == applicationContext) {
            return bool.booleanValue();
        }
        f9141b = null;
        if (PlatformVersion.a()) {
            f9141b = Boolean.valueOf(applicationContext.getPackageManager().isInstantApp());
        } else {
            try {
                context.getClassLoader().loadClass("com.google.android.instantapps.supervisor.InstantAppsRuntime");
                f9141b = Boolean.TRUE;
            } catch (ClassNotFoundException unused) {
                f9141b = Boolean.FALSE;
            }
        }
        f9140a = applicationContext;
        return f9141b.booleanValue();
    }
}
