package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzhj implements ServiceConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f13044a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zzhk f13045b;

    public zzhj(zzhk zzhkVar, String str) {
        Objects.requireNonNull(zzhkVar);
        this.f13045b = zzhkVar;
        this.f13044a = str;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        zzhk zzhkVar = this.f13045b;
        if (iBinder == null) {
            zzgu zzguVar = zzhkVar.f13046a.f13099f;
            zzic.m(zzguVar);
            zzguVar.f12945i.a("Install Referrer connection returned with null binder");
            return;
        }
        try {
            int i11 = com.google.android.gms.internal.measurement.zzbr.f11474a;
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
            com.google.android.gms.internal.measurement.zzbs zzbqVar = iInterfaceQueryLocalInterface instanceof com.google.android.gms.internal.measurement.zzbs ? (com.google.android.gms.internal.measurement.zzbs) iInterfaceQueryLocalInterface : new com.google.android.gms.internal.measurement.zzbq(iBinder, "com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
            zzic zzicVar = zzhkVar.f13046a;
            zzgu zzguVar2 = zzicVar.f13099f;
            zzic.m(zzguVar2);
            zzguVar2.f12949n.a("Install Referrer Service connected");
            zzhz zzhzVar = zzicVar.f13100g;
            zzic.m(zzhzVar);
            zzhzVar.p(new zzhi(this, zzbqVar, this));
        } catch (RuntimeException e8) {
            zzgu zzguVar3 = zzhkVar.f13046a.f13099f;
            zzic.m(zzguVar3);
            zzguVar3.f12945i.b(e8, "Exception occurred while calling Install Referrer API");
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        zzgu zzguVar = this.f13045b.f13046a.f13099f;
        zzic.m(zzguVar);
        zzguVar.f12949n.a("Install Referrer Service disconnected");
    }
}
