package com.google.firebase.analytics.connector.internal;

import android.os.Bundle;
import com.google.android.gms.measurement.api.AppMeasurementSdk;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzf implements AppMeasurementSdk.OnEventListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zzg f17794a;

    public zzf(zzg zzgVar) {
        this.f17794a = zzgVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzjq
    public final void a(long j11, Bundle bundle, String str, String str2) {
        if (str == null || zzc.f17785a.contains(str2)) {
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putString("name", str2);
        bundle2.putLong("timestampInMillis", j11);
        bundle2.putBundle("params", bundle);
        this.f17794a.f17795a.a(3, bundle2);
    }
}
