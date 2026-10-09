package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class zacj implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zacm f8820a;

    public zacj(zacm zacmVar) {
        Objects.requireNonNull(zacmVar);
        this.f8820a = zacmVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f8820a.f8829t.b(new ConnectionResult(4, null, null));
    }
}
