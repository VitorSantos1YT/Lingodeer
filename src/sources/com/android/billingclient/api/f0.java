package com.android.billingclient.api;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.internal.play_billing.zzas;
import com.google.android.gms.internal.play_billing.zzat;
import com.google.android.gms.internal.play_billing.zzau;
import com.google.android.gms.internal.play_billing.zzc;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class f0 implements ServiceConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g0 f7504a;

    public /* synthetic */ f0(g0 g0Var) {
        this.f7504a = g0Var;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        zzau zzasVar;
        zzc.h("BillingClientTesting", "Billing Override Service connected.");
        g0 g0Var = this.f7504a;
        int i11 = zzat.f12241a;
        if (iBinder == null) {
            zzasVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.apps.play.billingtestcompanion.aidl.IBillingOverrideService");
            zzasVar = iInterfaceQueryLocalInterface instanceof zzau ? (zzau) iInterfaceQueryLocalInterface : new zzas(iBinder, "com.google.android.apps.play.billingtestcompanion.aidl.IBillingOverrideService");
        }
        g0Var.F = zzasVar;
        g0Var.E = 2;
        g0Var.I(26);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        int i11 = zzc.f12272a;
        g0 g0Var = this.f7504a;
        g0Var.F = null;
        g0Var.E = 0;
    }
}
