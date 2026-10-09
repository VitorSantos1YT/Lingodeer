package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Handler;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.ClientSettings;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zacm extends com.google.android.gms.signin.internal.zac implements GoogleApiClient.ConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener {
    public static final Api.AbstractClientBuilder H = com.google.android.gms.signin.zad.f13709a;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f8823a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Handler f8824b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Api.AbstractClientBuilder f8825c = H;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Set f8826d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ClientSettings f8827e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public com.google.android.gms.signin.zae f8828f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public zacl f8829t;

    public zacm(Context context, com.google.android.gms.internal.base.zao zaoVar, ClientSettings clientSettings) {
        this.f8823a = context;
        this.f8824b = zaoVar;
        this.f8827e = clientSettings;
        this.f8826d = clientSettings.f8899b;
    }

    @Override // com.google.android.gms.signin.internal.zac, com.google.android.gms.signin.internal.zae
    public final void Q(com.google.android.gms.signin.internal.zak zakVar) {
        this.f8824b.post(new zack(this, zakVar));
    }

    @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
    public final void g(int i11) {
        zabn zabnVar = (zabn) this.f8829t;
        zabk zabkVar = (zabk) zabnVar.f8794f.L.get(zabnVar.f8790b);
        if (zabkVar != null) {
            if (zabkVar.K) {
                zabkVar.o(new ConnectionResult(17, null, null));
            } else {
                zabkVar.g(i11);
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
    public final void h() {
        this.f8828f.a(this);
    }

    @Override // com.google.android.gms.common.api.internal.OnConnectionFailedListener
    public final void j(ConnectionResult connectionResult) {
        this.f8829t.b(connectionResult);
    }
}
