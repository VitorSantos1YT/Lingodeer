package com.google.android.gms.common.internal;

import com.google.android.gms.common.ConnectionResult;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zzaf extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConnectionResult f9007a;

    public zzaf(ConnectionResult connectionResult) {
        Preconditions.a("ResolvableConnectionException can only be created with a connection result containing a resolution.", connectionResult.D1());
        this.f9007a = connectionResult;
    }
}
