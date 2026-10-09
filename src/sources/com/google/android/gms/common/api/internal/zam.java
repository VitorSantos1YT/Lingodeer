package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class zam {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f8840a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConnectionResult f8841b;

    public zam(ConnectionResult connectionResult, int i11) {
        Preconditions.g(connectionResult);
        this.f8841b = connectionResult;
        this.f8840a = i11;
    }
}
