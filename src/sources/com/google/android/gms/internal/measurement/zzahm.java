package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzahm implements zzahl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final zzom f11387a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final zzom f11388b;

    static {
        zzog zzogVar = zzagr.f11362d;
        f11387a = zzogVar.a("measurement.service.store_null_safelist", true);
        f11388b = zzogVar.a("measurement.service.store_safelist", true);
    }

    @Override // com.google.android.gms.internal.measurement.zzahl
    public final boolean zzb() {
        return ((Boolean) ((zznp) f11387a).get()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzahl
    public final boolean zzc() {
        return ((Boolean) ((zznp) f11388b).get()).booleanValue();
    }
}
