package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import com.google.android.gms.measurement.api.AppMeasurementSdk;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzeq extends zzcx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AppMeasurementSdk.OnEventListener f11564a;

    public zzeq(AppMeasurementSdk.OnEventListener onEventListener) {
        this.f11564a = onEventListener;
    }

    @Override // com.google.android.gms.internal.measurement.zzcy
    public final void N(long j11, Bundle bundle, String str, String str2) {
        this.f11564a.a(j11, bundle, str, str2);
    }

    @Override // com.google.android.gms.internal.measurement.zzcy
    public final int zzf() {
        return System.identityHashCode(this.f11564a);
    }
}
