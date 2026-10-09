package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzahv implements zzahu {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final zzom f11399a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final zzom f11400b;

    static {
        zzog zzogVar = zzagr.f11362d;
        f11399a = zzogVar.a("45753512", false);
        f11400b = zzogVar.a("measurement.gbraid_campaign.stop_lgclid", false);
    }

    @Override // com.google.android.gms.internal.measurement.zzahu
    public final boolean zza() {
        return ((Boolean) ((zznp) f11399a).get()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzahu
    public final boolean zzb() {
        return ((Boolean) ((zznp) f11400b).get()).booleanValue();
    }
}
