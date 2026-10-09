package com.google.android.gms.internal.location;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.location.LocationAvailability;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zzaz extends zzi {

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public final zzav f11077g0;

    public zzaz(Context context, Looper looper, GoogleApiClient.ConnectionCallbacks connectionCallbacks, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener, String str, ClientSettings clientSettings) {
        super(context, looper, connectionCallbacks, onConnectionFailedListener, str, clientSettings);
        this.f11077g0 = new zzav(context, this.f11112f0);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final boolean C() {
        return true;
    }

    public final LocationAvailability F() {
        zzav zzavVar = this.f11077g0;
        zzh zzhVar = (zzh) zzavVar.f11069a;
        zzhVar.f11110a.r();
        return zzhVar.a().H(zzavVar.f11070b.getPackageName());
    }

    public final void G(zzah zzahVar) {
        zzh zzhVar = (zzh) this.f11077g0.f11069a;
        zzhVar.f11110a.r();
        zzhVar.a().B(new zzbc(2, null, null, null, null, zzahVar));
    }

    public final void H() {
        zzh zzhVar = (zzh) this.f11077g0.f11069a;
        zzhVar.f11110a.r();
        zzhVar.a().zzp();
    }

    public final void I() {
        zzh zzhVar = (zzh) this.f11077g0.f11069a;
        zzhVar.f11110a.r();
        zzhVar.a().c();
    }

    public final void J(zzah zzahVar) {
        zzh zzhVar = (zzh) this.f11077g0.f11069a;
        zzhVar.f11110a.r();
        zzhVar.a().C0(zzahVar);
    }

    public final void K(BaseImplementation.ResultHolder resultHolder) {
        r();
        Preconditions.a("locationSettingsRequest can't be null nor empty.", false);
        zzay zzayVar = new zzay();
        zzayVar.f11076a = resultHolder;
        ((zzam) y()).G0(zzayVar);
    }

    public final void L() {
        r();
        Preconditions.g(null);
        throw null;
    }

    public final void M(BaseImplementation.ResultHolder resultHolder) {
        r();
        Preconditions.h(null, "geofencingRequest can't be null.");
        throw null;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.Api.Client
    public final void j() {
        synchronized (this.f11077g0) {
            if (c()) {
                try {
                    this.f11077g0.a();
                    this.f11077g0.getClass();
                } catch (Exception unused) {
                }
            }
            super.j();
        }
    }
}
