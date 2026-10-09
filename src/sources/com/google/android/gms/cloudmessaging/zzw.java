package com.google.android.gms.cloudmessaging;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.wrappers.Wrappers;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zzw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f8620a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f8621b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f8622c = 0;

    public zzw(Context context) {
        this.f8620a = context;
    }

    public final synchronized int a() {
        PackageInfo packageInfoB;
        if (this.f8621b == 0) {
            try {
                packageInfoB = Wrappers.a(this.f8620a).b(0, "com.google.android.gms");
            } catch (PackageManager.NameNotFoundException e8) {
                "Failed to find package ".concat(e8.toString());
                packageInfoB = null;
            }
            if (packageInfoB != null) {
                this.f8621b = packageInfoB.versionCode;
            }
        }
        return this.f8621b;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0047 A[Catch: all -> 0x0045, TryCatch #0 {all -> 0x0045, blocks: (B:3:0x0001, B:7:0x0007, B:12:0x0025, B:14:0x002c, B:16:0x003e, B:26:0x0061, B:21:0x0047, B:23:0x005a, B:29:0x0065, B:33:0x006d), top: B:38:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:31:0x006b  */
    /* JADX WARN: Code duplicated, block: B:32:0x006c  */
    public final synchronized int b() {
        List<ResolveInfo> listQueryBroadcastReceivers;
        try {
            int i11 = this.f8622c;
            if (i11 != 0) {
                return i11;
            }
            Context context = this.f8620a;
            PackageManager packageManager = context.getPackageManager();
            if (Wrappers.a(context).f9142a.getPackageManager().checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
                return 0;
            }
            int i12 = 1;
            if (PlatformVersion.a()) {
                Intent intent = new Intent("com.google.iid.TOKEN_REQUEST");
                intent.setPackage("com.google.android.gms");
                listQueryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent, 0);
                if (listQueryBroadcastReceivers != null) {
                }
                if (true != PlatformVersion.a()) {
                    i12 = 2;
                }
                this.f8622c = i12;
                return i12;
            }
            Intent intent2 = new Intent("com.google.android.c2dm.intent.REGISTER");
            intent2.setPackage("com.google.android.gms");
            List<ResolveInfo> listQueryIntentServices = packageManager.queryIntentServices(intent2, 0);
            if (listQueryIntentServices == null || listQueryIntentServices.isEmpty()) {
                Intent intent3 = new Intent("com.google.iid.TOKEN_REQUEST");
                intent3.setPackage("com.google.android.gms");
                listQueryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent3, 0);
                if (listQueryBroadcastReceivers != null || listQueryBroadcastReceivers.isEmpty()) {
                    if (true != PlatformVersion.a()) {
                        i12 = 2;
                    }
                    this.f8622c = i12;
                    return i12;
                }
                i12 = 2;
            }
            this.f8622c = i12;
            return i12;
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
