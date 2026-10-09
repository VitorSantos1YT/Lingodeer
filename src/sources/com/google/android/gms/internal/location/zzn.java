package com.google.android.gms.internal.location;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.api.internal.ListenerHolders;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class zzn extends zzx {
    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    public final void k(Api.AnyClient anyClient) {
        ListenerHolder.ListenerKey listenerKeyB = ListenerHolders.b(null, "LocationCallback");
        new zzy(this);
        zzav zzavVar = ((zzaz) anyClient).f11077g0;
        ((zzh) zzavVar.f11069a).f11110a.r();
        synchronized (zzavVar.f11073e) {
            try {
                zzar zzarVar = (zzar) zzavVar.f11073e.remove(listenerKeyB);
                if (zzarVar != null) {
                    synchronized (zzarVar) {
                        throw null;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
