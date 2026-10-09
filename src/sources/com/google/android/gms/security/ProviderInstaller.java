package com.google.android.gms.security;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.internal.common.zzh;
import com.google.android.gms.internal.common.zzi;
import com.google.android.gms.internal.common.zzj;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class ProviderInstaller {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final GoogleApiAvailabilityLight f13690a = GoogleApiAvailabilityLight.f8646b;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f13691b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Method f13692c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static boolean f13693d = false;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public interface ProviderInstallListener {
    }

    /* JADX WARN: Code duplicated, block: B:32:0x007c  */
    /* JADX WARN: Code duplicated, block: B:41:0x00c5 A[Catch: all -> 0x0053, TryCatch #1 {, blocks: (B:12:0x0041, B:15:0x0048, B:22:0x0065, B:23:0x006a, B:20:0x0057, B:25:0x006c, B:27:0x0071, B:33:0x007d, B:35:0x0081, B:38:0x00bb, B:41:0x00c5, B:42:0x00ca, B:44:0x00cc, B:45:0x00d3), top: B:50:0x0041, inners: #2, #3 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x00cc A[Catch: all -> 0x0053, TryCatch #1 {, blocks: (B:12:0x0041, B:15:0x0048, B:22:0x0065, B:23:0x006a, B:20:0x0057, B:25:0x006c, B:27:0x0071, B:33:0x007d, B:35:0x0081, B:38:0x00bb, B:41:0x00c5, B:42:0x00ca, B:44:0x00cc, B:45:0x00d3), top: B:50:0x0041, inners: #2, #3 }] */
    /* JADX WARN: Code duplicated, block: B:51:0x0081 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public static void a(Context context) throws GooglePlayServicesRepairableException, GooglePlayServicesNotAvailableException {
        boolean z11;
        Context contextCreatePackageContext;
        Context context2;
        Preconditions.h(context, "Context must not be null");
        f13690a.getClass();
        AtomicBoolean atomicBoolean = GooglePlayServicesUtilLight.f8650a;
        GoogleApiAvailabilityLight googleApiAvailabilityLight = GoogleApiAvailabilityLight.f8646b;
        int iC = googleApiAvailabilityLight.c(context, 11925000);
        if (iC != 0) {
            Intent intentA = googleApiAvailabilityLight.a(iC, context, "e");
            new StringBuilder(String.valueOf(iC).length() + 46);
            if (intentA != null) {
                throw new GooglePlayServicesRepairableException(iC);
            }
            throw new GooglePlayServicesNotAvailableException(iC);
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        synchronized (f13691b) {
            Context context3 = null;
            if (f13693d) {
                z11 = f13693d;
                contextCreatePackageContext = context.createPackageContext("com.google.android.gms", 3);
                if (contextCreatePackageContext != null) {
                    f13693d = true;
                    if (!z11) {
                        long jUptimeMillis2 = SystemClock.uptimeMillis();
                        ClassLoader classLoader = contextCreatePackageContext.getClassLoader();
                        zzi zziVar = new zzi(Context.class, context);
                        Class cls = Long.TYPE;
                        zzj.a(classLoader.loadClass("com.google.android.gms.common.security.ProviderInstallerImpl"), "reportRequestStats2", zziVar, new zzh(cls, Long.valueOf(jUptimeMillis)), new zzh(cls, Long.valueOf(jUptimeMillis2)));
                    }
                    context3 = contextCreatePackageContext;
                }
                if (context3 != null) {
                    throw new GooglePlayServicesNotAvailableException(8);
                }
                b(context3, "com.google.android.gms.common.security.ProviderInstallerImpl");
                return;
            }
            try {
                context2 = DynamiteModule.c(context, DynamiteModule.f9197d, "com.google.android.gms.providerinstaller.dynamite").f9207a;
            } catch (DynamiteModule.LoadingException e8) {
                "Failed to load providerinstaller module: ".concat(String.valueOf(e8.getMessage()));
                context2 = null;
            }
            if (context2 != null) {
                b(context2, "com.google.android.gms.providerinstaller.ProviderInstallerImpl");
                return;
            }
            z11 = f13693d;
            try {
                contextCreatePackageContext = context.createPackageContext("com.google.android.gms", 3);
            } catch (PackageManager.NameNotFoundException unused) {
                contextCreatePackageContext = null;
            }
            if (contextCreatePackageContext != null) {
                f13693d = true;
                if (!z11) {
                    try {
                        long jUptimeMillis3 = SystemClock.uptimeMillis();
                        ClassLoader classLoader2 = contextCreatePackageContext.getClassLoader();
                        zzi zziVar2 = new zzi(Context.class, context);
                        Class cls2 = Long.TYPE;
                        zzj.a(classLoader2.loadClass("com.google.android.gms.common.security.ProviderInstallerImpl"), "reportRequestStats2", zziVar2, new zzh(cls2, Long.valueOf(jUptimeMillis)), new zzh(cls2, Long.valueOf(jUptimeMillis3)));
                    } catch (Exception e10) {
                        "Failed to report request stats: ".concat(e10.toString());
                    }
                }
                context3 = contextCreatePackageContext;
            }
            if (context3 != null) {
                throw new GooglePlayServicesNotAvailableException(8);
            }
            b(context3, "com.google.android.gms.common.security.ProviderInstallerImpl");
            return;
            throw th;
        }
    }

    public static void b(Context context, String str) throws GooglePlayServicesNotAvailableException {
        try {
            if (f13692c == null) {
                f13692c = context.getClassLoader().loadClass(str).getMethod("insertProvider", Context.class);
            }
            f13692c.invoke(null, context);
        } catch (Exception e8) {
            Throwable cause = e8.getCause();
            if (Log.isLoggable("ProviderInstaller", 6)) {
                "Failed to install provider: ".concat(String.valueOf(cause == null ? e8.toString() : cause.toString()));
            }
            throw new GooglePlayServicesNotAvailableException(8);
        }
    }
}
