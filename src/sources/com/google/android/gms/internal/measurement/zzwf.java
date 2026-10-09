package com.google.android.gms.internal.measurement;

import java.util.UUID;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzwf extends zzvt implements zzvs {
    public final boolean H;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Exception f12103t;

    public zzwf(String str, zzvs zzvsVar, zzwl zzwlVar, boolean z11, zzwq zzwqVar) {
        super("<missing root>:".concat(str), zzvsVar, zzwl.a(zzwlVar, zzwk.f12112f), zzwqVar);
        this.f12103t = zzvsVar.zzf();
        this.H = z11;
    }

    @Override // com.google.android.gms.internal.measurement.zzvs
    public final zzws k1(String str, zzwl zzwlVar, boolean z11, zzwq zzwqVar) {
        boolean z12 = this.H;
        if (z11 && !z12) {
            AtomicReference atomicReference = zzvy.f12092a;
        }
        boolean z13 = true;
        if ((!z11 || z12) && !z12) {
            z13 = false;
        }
        return new zzwf(str, this, zzwlVar, z13, zzwqVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzws
    public final zzws x1(String str, zzwl zzwlVar, zzwq zzwqVar) {
        AtomicReference atomicReference = zzvy.f12092a;
        return k1(str, zzwlVar, true, zzwqVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzvs
    public final Exception zzf() {
        return this.f12103t;
    }

    @Override // com.google.android.gms.internal.measurement.zzws
    public final zzwl zzl() {
        return zzwk.f12111e;
    }

    public zzwf(UUID uuid, String str, String str2, zzwl zzwlVar, zzvr zzvrVar, zzwq zzwqVar) {
        super("<missing root>:".concat(str2), uuid, str, zzwl.a(zzwlVar, zzwk.f12112f), zzwqVar);
        this.f12103t = zzvrVar;
        this.H = false;
    }
}
