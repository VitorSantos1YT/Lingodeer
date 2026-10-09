package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzahp implements zzaho {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final zzom f11391a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final zzom f11392b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final zzom f11393c;

    static {
        zzog zzogVar = zzagr.f11362d;
        f11391a = zzogVar.a("measurement.audience.refresh_event_count_filters_timestamp", false);
        f11392b = zzogVar.a("measurement.audience.use_bundle_end_timestamp_for_non_sequence_property_filters", false);
        f11393c = zzogVar.a("measurement.audience.use_bundle_timestamp_for_event_count_filters", false);
    }

    @Override // com.google.android.gms.internal.measurement.zzaho
    public final boolean zzb() {
        return ((Boolean) ((zznp) f11391a).get()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzaho
    public final boolean zzc() {
        return ((Boolean) ((zznp) f11392b).get()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzaho
    public final boolean zzd() {
        return ((Boolean) ((zznp) f11393c).get()).booleanValue();
    }
}
