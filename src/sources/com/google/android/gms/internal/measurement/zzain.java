package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzain implements zzaim {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final zzom f11420a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final zzom f11421b;

    static {
        zzog zzogVar = zzagr.f11362d;
        f11420a = zzogVar.a("measurement.experiment.enable_passthrough_experiment_reporting", true);
        f11421b = zzogVar.a("measurement.experiment.enable_phenotype_experiment_reporting", true);
    }

    @Override // com.google.android.gms.internal.measurement.zzaim
    public final boolean zza() {
        return ((Boolean) ((zznp) f11420a).get()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzaim
    public final boolean zzb() {
        return ((Boolean) ((zznp) f11421b).get()).booleanValue();
    }
}
