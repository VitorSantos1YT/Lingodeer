package com.google.android.gms.internal.measurement;

import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzwg extends zzvt {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final zzwg f12104t;

    static {
        UUID uuidRandomUUID = UUID.randomUUID();
        f12104t = new zzwg("<skip trace>", uuidRandomUUID, zzvn.a(uuidRandomUUID), zzwk.f12111e, zzvy.c());
    }

    @Override // com.google.android.gms.internal.measurement.zzws
    public final zzws x1(String str, zzwl zzwlVar, zzwq zzwqVar) {
        throw new IllegalStateException("Can't create child trace for no trace!");
    }

    @Override // com.google.android.gms.internal.measurement.zzws
    public final zzwl zzl() {
        return zzwk.f12111e;
    }
}
