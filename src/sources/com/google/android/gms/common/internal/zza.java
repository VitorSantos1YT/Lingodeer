package com.google.android.gms.common.internal;

import android.app.PendingIntent;
import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
abstract class zza extends zzc {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f8999d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Bundle f9000e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ BaseGmsClient f9001f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zza(BaseGmsClient baseGmsClient, int i11, Bundle bundle) {
        super(baseGmsClient);
        this.f9001f = baseGmsClient;
        this.f8999d = i11;
        this.f9000e = bundle;
    }

    @Override // com.google.android.gms.common.internal.zzc
    public final void a(Object obj) {
        BaseGmsClient baseGmsClient = this.f9001f;
        int i11 = this.f8999d;
        if (i11 != 0) {
            baseGmsClient.E(1, null);
            Bundle bundle = this.f9000e;
            c(new ConnectionResult(i11, bundle != null ? (PendingIntent) bundle.getParcelable("pendingIntent") : null, null));
        } else {
            if (b()) {
                return;
            }
            baseGmsClient.E(1, null);
            c(new ConnectionResult(8, null, null));
        }
    }

    public abstract boolean b();

    public abstract void c(ConnectionResult connectionResult);
}
