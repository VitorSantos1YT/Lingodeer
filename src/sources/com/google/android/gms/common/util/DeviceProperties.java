package com.google.android.gms.common.util;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class DeviceProperties {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Boolean f9118a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Boolean f9119b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Boolean f9120c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static Boolean f9121d;

    private DeviceProperties() {
    }

    public static boolean a(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (f9118a == null) {
            f9118a = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
        }
        return f9118a.booleanValue();
    }

    public static boolean b(Context context) {
        a(context);
        if (f9119b == null) {
            f9119b = Boolean.valueOf(context.getPackageManager().hasSystemFeature("cn.google"));
        }
        if (f9119b.booleanValue()) {
            return !PlatformVersion.a() || Build.VERSION.SDK_INT >= 30;
        }
        return false;
    }
}
