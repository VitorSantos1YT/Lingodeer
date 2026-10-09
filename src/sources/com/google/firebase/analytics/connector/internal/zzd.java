package com.google.firebase.analytics.connector.internal;

import android.os.Bundle;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.android.gms.measurement.internal.zzjm;
import com.google.android.gms.measurement.internal.zzlt;
import com.google.common.collect.ImmutableSet;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzd implements AppMeasurementSdk.OnEventListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zze f17791a;

    public zzd(zze zzeVar) {
        this.f17791a = zzeVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzjq
    public final void a(long j11, Bundle bundle, String str, String str2) {
        zze zzeVar = this.f17791a;
        if (zzeVar.f17792a.contains(str2)) {
            Bundle bundle2 = new Bundle();
            ImmutableSet immutableSet = zzc.f17785a;
            String strB = zzlt.b(str2, zzjm.f13212f, zzjm.f13207a);
            if (strB != null) {
                str2 = strB;
            }
            bundle2.putString("events", str2);
            zzeVar.f17793b.a(2, bundle2);
        }
    }
}
