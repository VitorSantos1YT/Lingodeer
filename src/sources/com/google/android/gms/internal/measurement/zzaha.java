package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzaha implements zzagz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final zzom f11372a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final zzom f11373b;

    static {
        zzog zzogVar = zzagr.f11362d;
        f11372a = zzogVar.a("measurement.set_default_event_parameters.fix_app_update_logging", true);
        f11373b = zzogVar.a("measurement.set_default_event_parameters.fix_service_request_ordering", false);
    }

    @Override // com.google.android.gms.internal.measurement.zzagz
    public final boolean zza() {
        return ((Boolean) ((zznp) f11372a).get()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzagz
    public final boolean zzb() {
        return ((Boolean) ((zznp) f11373b).get()).booleanValue();
    }
}
