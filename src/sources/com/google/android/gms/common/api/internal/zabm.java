package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.internal.IAccountAccessor;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class zabm implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ConnectionResult f8787a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zabn f8788b;

    public zabm(zabn zabnVar, ConnectionResult connectionResult) {
        this.f8787a = connectionResult;
        this.f8788b = zabnVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        IAccountAccessor iAccountAccessor;
        zabn zabnVar = this.f8788b;
        GoogleApiManager googleApiManager = zabnVar.f8794f;
        Api.Client client = zabnVar.f8789a;
        zabk zabkVar = (zabk) googleApiManager.L.get(zabnVar.f8790b);
        if (zabkVar == null) {
            return;
        }
        ConnectionResult connectionResult = this.f8787a;
        if (!connectionResult.E1()) {
            zabkVar.p(connectionResult, null);
            return;
        }
        zabnVar.f8793e = true;
        if (client.p()) {
            if (!zabnVar.f8793e || (iAccountAccessor = zabnVar.f8791c) == null) {
                return;
            }
            client.e(iAccountAccessor, zabnVar.f8792d);
            return;
        }
        try {
            client.e(null, client.d());
        } catch (SecurityException unused) {
            client.f("Failed to get service from broker.");
            zabkVar.p(new ConnectionResult(10, null, null), null);
        }
    }
}
