package com.google.android.gms.internal.location;

import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationResult;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class zzap implements ListenerHolder.Notifier<LocationCallback> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ LocationResult f11068a;

    public zzap(LocationResult locationResult) {
        this.f11068a = locationResult;
    }

    @Override // com.google.android.gms.common.api.internal.ListenerHolder.Notifier
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        ((LocationCallback) obj).a(this.f11068a);
    }
}
