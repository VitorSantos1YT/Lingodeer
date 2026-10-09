package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
class Metadata {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f20497a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f20498b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f20499c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f20500d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f20501e = 0;

    public Metadata(Context context) {
        this.f20497a = context;
    }

    public static String b(FirebaseApp firebaseApp) {
        firebaseApp.b();
        FirebaseOptions firebaseOptions = firebaseApp.f17716c;
        String str = firebaseOptions.f17735e;
        if (str != null) {
            return str;
        }
        firebaseApp.b();
        String str2 = firebaseOptions.f17732b;
        if (!str2.startsWith("1:")) {
            return str2;
        }
        String[] strArrSplit = str2.split(":");
        if (strArrSplit.length < 2) {
            return null;
        }
        String str3 = strArrSplit[1];
        if (str3.isEmpty()) {
            return null;
        }
        return str3;
    }

    public final synchronized String a() {
        try {
            if (this.f20498b == null) {
                d();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f20498b;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0042 A[Catch: all -> 0x0040, TRY_ENTER, TryCatch #0 {, blocks: (B:3:0x0001, B:8:0x0009, B:13:0x001d, B:15:0x0023, B:17:0x0035, B:19:0x003b, B:24:0x0042, B:26:0x0055, B:28:0x005b, B:31:0x0060, B:33:0x0066, B:35:0x006b, B:34:0x0069), top: B:42:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:31:0x0060 A[Catch: all -> 0x0040, TRY_ENTER, TryCatch #0 {, blocks: (B:3:0x0001, B:8:0x0009, B:13:0x001d, B:15:0x0023, B:17:0x0035, B:19:0x003b, B:24:0x0042, B:26:0x0055, B:28:0x005b, B:31:0x0060, B:33:0x0066, B:35:0x006b, B:34:0x0069), top: B:42:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x0066 A[Catch: all -> 0x0040, TryCatch #0 {, blocks: (B:3:0x0001, B:8:0x0009, B:13:0x001d, B:15:0x0023, B:17:0x0035, B:19:0x003b, B:24:0x0042, B:26:0x0055, B:28:0x005b, B:31:0x0060, B:33:0x0066, B:35:0x006b, B:34:0x0069), top: B:42:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x0069 A[Catch: all -> 0x0040, TryCatch #0 {, blocks: (B:3:0x0001, B:8:0x0009, B:13:0x001d, B:15:0x0023, B:17:0x0035, B:19:0x003b, B:24:0x0042, B:26:0x0055, B:28:0x005b, B:31:0x0060, B:33:0x0066, B:35:0x006b, B:34:0x0069), top: B:42:0x0001 }] */
    public final boolean c() {
        int i11;
        List<ResolveInfo> listQueryBroadcastReceivers;
        synchronized (this) {
            i11 = this.f20501e;
            if (i11 == 0) {
                PackageManager packageManager = this.f20497a.getPackageManager();
                if (packageManager.checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
                    i11 = 0;
                } else if (PlatformVersion.a()) {
                    Intent intent = new Intent("com.google.iid.TOKEN_REQUEST");
                    intent.setPackage("com.google.android.gms");
                    listQueryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent, 0);
                    if (listQueryBroadcastReceivers != null) {
                        if (PlatformVersion.a()) {
                            this.f20501e = 2;
                        } else {
                            this.f20501e = 1;
                        }
                        i11 = this.f20501e;
                    } else {
                        if (PlatformVersion.a()) {
                            this.f20501e = 2;
                        } else {
                            this.f20501e = 1;
                        }
                        i11 = this.f20501e;
                    }
                } else {
                    Intent intent2 = new Intent("com.google.android.c2dm.intent.REGISTER");
                    intent2.setPackage("com.google.android.gms");
                    List<ResolveInfo> listQueryIntentServices = packageManager.queryIntentServices(intent2, 0);
                    if (listQueryIntentServices == null || listQueryIntentServices.size() <= 0) {
                        Intent intent3 = new Intent("com.google.iid.TOKEN_REQUEST");
                        intent3.setPackage("com.google.android.gms");
                        listQueryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent3, 0);
                        if (listQueryBroadcastReceivers != null || listQueryBroadcastReceivers.size() <= 0) {
                            if (PlatformVersion.a()) {
                                this.f20501e = 2;
                            } else {
                                this.f20501e = 1;
                            }
                            i11 = this.f20501e;
                        } else {
                            this.f20501e = 2;
                            i11 = 2;
                        }
                    } else {
                        this.f20501e = 1;
                        i11 = 1;
                    }
                }
            }
        }
        return i11 != 0;
    }

    public final synchronized void d() {
        PackageInfo packageInfo;
        try {
            packageInfo = this.f20497a.getPackageManager().getPackageInfo(this.f20497a.getPackageName(), 0);
        } catch (PackageManager.NameNotFoundException e8) {
            e8.toString();
            packageInfo = null;
        }
        if (packageInfo != null) {
            this.f20498b = Integer.toString(packageInfo.versionCode);
            this.f20499c = packageInfo.versionName;
        }
    }
}
