package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.wrappers.PackageManagerWrapper;
import com.google.android.gms.common.wrappers.Wrappers;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzhk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zzic f13046a;

    public zzhk(zzpg zzpgVar) {
        this.f13046a = zzpgVar.f13606l;
    }

    public final boolean a() {
        zzic zzicVar = this.f13046a;
        try {
            PackageManagerWrapper packageManagerWrapperA = Wrappers.a(zzicVar.f13094a);
            if (packageManagerWrapperA != null) {
                return packageManagerWrapperA.b(128, "com.android.vending").versionCode >= 80837300;
            }
            zzgu zzguVar = zzicVar.f13099f;
            zzic.m(zzguVar);
            zzguVar.f12949n.a("Failed to get PackageManager for Install Referrer Play Store compatibility check");
            return false;
        } catch (Exception e8) {
            zzgu zzguVar2 = zzicVar.f13099f;
            zzic.m(zzguVar2);
            zzguVar2.f12949n.b(e8, "Failed to retrieve Play Store version for Install Referrer");
            return false;
        }
    }
}
