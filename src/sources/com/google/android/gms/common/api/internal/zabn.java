package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.IAccountAccessor;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class zabn implements BaseGmsClient.ConnectionProgressReportCallbacks, zacl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Api.Client f8789a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ApiKey f8790b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public IAccountAccessor f8791c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Set f8792d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f8793e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ GoogleApiManager f8794f;

    public zabn(GoogleApiManager googleApiManager, Api.Client client, ApiKey apiKey) {
        Objects.requireNonNull(googleApiManager);
        this.f8794f = googleApiManager;
        this.f8791c = null;
        this.f8792d = null;
        this.f8793e = false;
        this.f8789a = client;
        this.f8790b = apiKey;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.ConnectionProgressReportCallbacks
    public final void a(ConnectionResult connectionResult) {
        this.f8794f.P.post(new zabm(this, connectionResult));
    }

    @Override // com.google.android.gms.common.api.internal.zacl
    public final void b(ConnectionResult connectionResult) {
        zabk zabkVar = (zabk) this.f8794f.L.get(this.f8790b);
        if (zabkVar != null) {
            zabkVar.o(connectionResult);
        }
    }
}
