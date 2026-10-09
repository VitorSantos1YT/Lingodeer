package com.google.android.gms.internal.measurement;

import java.util.UUID;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzwd extends zzvn implements zzvs {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final zzvr f12101t = new zzvr();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Exception f12102f;

    public zzwd(UUID uuid, String str, zzvr zzvrVar, zzwq zzwqVar) {
        super("<missing root>", uuid, str, zzwqVar);
        this.f12102f = zzvrVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzvs
    public final zzws k1(String str, zzwl zzwlVar, boolean z11, zzwq zzwqVar) {
        if (z11) {
            AtomicReference atomicReference = zzvy.f12092a;
        }
        return new zzwf(str, this, zzwlVar, z11, zzwqVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzws
    public final zzws x1(String str, zzwl zzwlVar, zzwq zzwqVar) {
        AtomicReference atomicReference = zzvy.f12092a;
        return k1(str, zzwlVar, true, zzwqVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzvs
    public final Exception zzf() {
        return this.f12102f;
    }

    @Override // com.google.android.gms.internal.measurement.zzws
    public final zzwl zzh() {
        return zzwk.f12111e;
    }
}
