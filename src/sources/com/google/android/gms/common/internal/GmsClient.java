package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.content.Context;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.internal.ConnectionCallbacks;
import com.google.android.gms.common.api.internal.OnConnectionFailedListener;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class GmsClient<T extends IInterface> extends BaseGmsClient<T> implements Api.Client, zam {

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final ClientSettings f8923b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public final Set f8924c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final Account f8925d0;

    /* JADX WARN: Illegal instructions before constructor call */
    public GmsClient(Context context, Looper looper, int i11, ClientSettings clientSettings, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener) {
        GmsClientSupervisor gmsClientSupervisorA = GmsClientSupervisor.a(context);
        GoogleApiAvailability googleApiAvailability = GoogleApiAvailability.f8643e;
        Preconditions.g(connectionCallbacks);
        Preconditions.g(onConnectionFailedListener);
        super(context, looper, gmsClientSupervisorA, googleApiAvailability, i11, new zak(connectionCallbacks), new zal(onConnectionFailedListener), clientSettings.f8903f);
        this.f8923b0 = clientSettings;
        this.f8925d0 = clientSettings.f8898a;
        Set set = clientSettings.f8900c;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (!set.contains((Scope) it.next())) {
                throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
            }
        }
        this.f8924c0 = set;
    }

    @Override // com.google.android.gms.common.api.Api.Client
    public final Set d() {
        return p() ? this.f8924c0 : Collections.EMPTY_SET;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final Account t() {
        return this.f8925d0;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final Executor v() {
        return null;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final Set x() {
        return this.f8924c0;
    }
}
