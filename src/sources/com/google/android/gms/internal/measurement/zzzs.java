package com.google.android.gms.internal.measurement;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzzs implements zzzo {
    @Override // com.google.android.gms.internal.measurement.zzzo
    public final void a(zzyl zzylVar, Iterator it, zzzc zzzcVar) {
        if (!zzylVar.f12181c) {
            throw new IllegalStateException("non repeating key");
        }
        if (!zzylVar.f12182d || ((zzabt) zzabt.f11191b.get()).f11192a <= 20) {
            zzylVar.a(it, zzzcVar);
            return;
        }
        while (it.hasNext()) {
            zzzcVar.a(it.next(), zzylVar.f12179a);
        }
    }
}
