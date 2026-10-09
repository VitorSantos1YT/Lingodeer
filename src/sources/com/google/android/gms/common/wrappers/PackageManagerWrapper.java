package com.google.android.gms.common.wrappers;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Binder;
import android.os.Process;
import com.google.android.gms.common.util.PlatformVersion;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class PackageManagerWrapper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f9142a;

    public PackageManagerWrapper(Context context) {
        this.f9142a = context;
    }

    public final ApplicationInfo a(int i11, String str) {
        return this.f9142a.getPackageManager().getApplicationInfo(str, i11);
    }

    public final PackageInfo b(int i11, String str) {
        return this.f9142a.getPackageManager().getPackageInfo(str, i11);
    }

    public final boolean c() {
        String nameForUid;
        int callingUid = Binder.getCallingUid();
        int iMyUid = Process.myUid();
        Context context = this.f9142a;
        if (callingUid == iMyUid) {
            return InstantApps.a(context);
        }
        if (!PlatformVersion.a() || (nameForUid = context.getPackageManager().getNameForUid(Binder.getCallingUid())) == null) {
            return false;
        }
        return context.getPackageManager().isInstantApp(nameForUid);
    }
}
