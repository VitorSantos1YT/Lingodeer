package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzii implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zzah f13133a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zzjd f13134b;

    public zzii(zzjd zzjdVar, zzah zzahVar) {
        this.f13133a = zzahVar;
        Objects.requireNonNull(zzjdVar);
        this.f13134b = zzjdVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzpg zzpgVar = this.f13134b.f13199a;
        zzpgVar.W();
        zzah zzahVar = this.f13133a;
        if (zzahVar.f12622c.zza() == null) {
            zzpgVar.getClass();
            String str = zzahVar.f12620a;
            Preconditions.g(str);
            zzr zzrVarQ = zzpgVar.Q(str);
            if (zzrVarQ != null) {
                zzpgVar.b0(zzahVar, zzrVarQ);
                return;
            }
            return;
        }
        zzpgVar.getClass();
        String str2 = zzahVar.f12620a;
        Preconditions.g(str2);
        zzr zzrVarQ2 = zzpgVar.Q(str2);
        if (zzrVarQ2 != null) {
            zzpgVar.a0(zzahVar, zzrVarQ2);
        }
    }
}
