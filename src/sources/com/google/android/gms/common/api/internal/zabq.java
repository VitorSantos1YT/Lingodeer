package com.google.android.gms.common.api.internal;

import android.os.Looper;
import com.google.android.gms.common.api.GoogleApi;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zabq extends zaad {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final GoogleApi f8796b;

    public zabq(GoogleApi googleApi) {
        this.f8796b = googleApi;
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final Looper a() {
        return this.f8796b.f8682g;
    }

    public final BaseImplementation.ApiMethodImpl d(BaseImplementation.ApiMethodImpl apiMethodImpl) {
        GoogleApi googleApi = this.f8796b;
        googleApi.getClass();
        boolean z11 = true;
        if (!apiMethodImpl.f8731k && !((Boolean) BasePendingResult.f8720l.get()).booleanValue()) {
            z11 = false;
        }
        apiMethodImpl.f8731k = z11;
        GoogleApiManager googleApiManager = googleApi.f8686k;
        googleApiManager.getClass();
        zacc zaccVar = new zacc(new zae(apiMethodImpl), googleApiManager.K.get(), googleApi);
        com.google.android.gms.internal.base.zao zaoVar = googleApiManager.P;
        zaoVar.sendMessage(zaoVar.obtainMessage(4, zaccVar));
        return apiMethodImpl;
    }
}
