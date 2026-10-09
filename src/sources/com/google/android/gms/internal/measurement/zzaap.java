package com.google.android.gms.internal.measurement;

import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzaap extends zzaat {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final zzaap f11147b = new zzaap(zzaav.f11162a);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReference f11148a;

    public zzaap(zzaat zzaatVar) {
        this.f11148a = new AtomicReference(zzaatVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzaat
    public final void a(String str, Level level, boolean z11) {
        ((zzaat) this.f11148a.get()).a(str, level, z11);
    }

    @Override // com.google.android.gms.internal.measurement.zzaat
    public final zzabe b() {
        return ((zzaat) this.f11148a.get()).b();
    }

    @Override // com.google.android.gms.internal.measurement.zzaat
    public final zzzj c() {
        return ((zzaat) this.f11148a.get()).c();
    }
}
