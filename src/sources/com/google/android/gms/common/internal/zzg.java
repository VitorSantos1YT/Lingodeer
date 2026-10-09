package com.google.android.gms.common.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zzg extends zza {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ BaseGmsClient f9020g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzg(BaseGmsClient baseGmsClient, int i11, Bundle bundle) {
        super(baseGmsClient, i11, bundle);
        this.f9020g = baseGmsClient;
    }

    @Override // com.google.android.gms.common.internal.zza
    public final boolean b() {
        this.f9020g.L.a(ConnectionResult.f8629f);
        return true;
    }

    @Override // com.google.android.gms.common.internal.zza
    public final void c(ConnectionResult connectionResult) {
        BaseGmsClient baseGmsClient = this.f9020g;
        baseGmsClient.getClass();
        baseGmsClient.L.a(connectionResult);
        System.currentTimeMillis();
    }
}
