package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzqd implements zzpm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zzqm f11841a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zzqe f11842b;

    public zzqd(zzqe zzqeVar, zzqm zzqmVar) {
        Objects.requireNonNull(zzqeVar);
        this.f11842b = zzqeVar;
        this.f11841a = zzqmVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzpm
    public final void a(zzpl zzplVar) {
        Iterator it = this.f11842b.f11848f.iterator();
        boolean z11 = false;
        while (it.hasNext()) {
            if (((zzqc) it.next()).a((zzaef) zzplVar.y()) && !z11) {
                this.f11841a.zza();
                z11 = true;
            }
        }
    }
}
