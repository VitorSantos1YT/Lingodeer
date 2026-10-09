package com.google.android.gms.internal.location;

import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class zzax extends zzaj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public BaseImplementation.ResultHolder f11075a;

    @Override // com.google.android.gms.internal.location.zzak
    public final void f(int i11) {
        Log.wtf("LocationClientImpl", "Unexpected call to onAddGeofencesResult", new Exception());
    }

    public final void h(int i11) {
        if (this.f11075a == null) {
            Log.wtf("LocationClientImpl", "onRemoveGeofencesResult called multiple times", new Exception());
            return;
        }
        if ((i11 < 0 || i11 > 1) && (i11 < 1000 || i11 >= 1006)) {
            i11 = 1;
        }
        if (i11 == 1) {
            i11 = 13;
        }
        this.f11075a.a(new Status(i11, null, null, null));
        this.f11075a = null;
    }

    @Override // com.google.android.gms.internal.location.zzak
    public final void p(int i11) {
        h(i11);
    }

    @Override // com.google.android.gms.internal.location.zzak
    public final void zzd(int i11) {
        h(i11);
    }
}
