package com.android.billingclient.api;

import android.content.Context;
import com.google.android.gms.internal.play_billing.zzc;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f7466a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile Object f7467b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile Object f7468c;

    public /* synthetic */ c(Object obj) {
        this.f7466a = obj;
    }

    public d a() {
        Context context = (Context) this.f7466a;
        if (context == null) {
            throw new IllegalArgumentException("Please provide a valid Context.");
        }
        if (((r) this.f7468c) == null) {
            throw new IllegalArgumentException("Please provide a valid listener for purchases updates.");
        }
        if (((ay.k0) this.f7467b) == null) {
            throw new IllegalArgumentException("Pending purchases for one-time products must be supported.");
        }
        ((ay.k0) this.f7467b).getClass();
        if (((r) this.f7468c) == null) {
            ay.k0 k0Var = (ay.k0) this.f7467b;
            return b() ? new g0(k0Var, context, this) : new d(k0Var, context, this);
        }
        ay.k0 k0Var2 = (ay.k0) this.f7467b;
        r rVar = (r) this.f7468c;
        return b() ? new g0(k0Var2, context, rVar, this) : new d(k0Var2, context, rVar, this);
    }

    public boolean b() {
        try {
            Context context = (Context) this.f7466a;
            return context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData.getBoolean("com.google.android.play.billingclient.enableBillingOverridesTesting", false);
        } catch (Exception unused) {
            int i11 = zzc.f12272a;
            return false;
        }
    }
}
