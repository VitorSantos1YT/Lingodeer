package com.google.android.gms.common.api.internal;

import android.app.Activity;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zabx extends zap {
    @Override // com.google.android.gms.common.api.internal.zap
    public final void a(ConnectionResult connectionResult, int i11) {
        String str = connectionResult.f8633d;
        if (str == null) {
            str = "Error connecting to Google Play services";
        }
        new ApiException(new Status(connectionResult.f8631b, str, connectionResult.f8632c, connectionResult));
        throw null;
    }

    @Override // com.google.android.gms.common.api.internal.zap
    public final void b() {
        Activity activityF = this.mLifecycleFragment.f();
        if (activityF == null) {
            new ApiException(new Status(8, null, null, null));
            throw null;
        }
        if (this.f8849d.c(activityF, GoogleApiAvailabilityLight.f8645a) != 0) {
            throw null;
        }
        throw null;
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void onDestroy() {
        super.onDestroy();
        new CancellationException("Host activity was destroyed before Google Play services could be made available.");
        throw null;
    }
}
