package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzaih implements zzaig {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final zzpo f11414a = new zzpo(zzagr.f11362d, 11);

    @Override // com.google.android.gms.internal.measurement.zzaig
    public final boolean zzb() {
        return ((Boolean) f11414a.a(1, "measurement.rb.attribution.client2", true).get()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzaig
    public final boolean zzc() {
        return ((Boolean) f11414a.a(2, "measurement.rb.attribution.service.trigger_uris_high_priority", true).get()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzaig
    public final boolean zzd() {
        return ((Boolean) f11414a.a(4, "measurement.rb.attribution.service.enable_max_trigger_uris_queried_at_once", true).get()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzaig
    public final boolean zze() {
        return ((Boolean) f11414a.a(6, "measurement.rb.attribution.service", true).get()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzaig
    public final boolean zzf() {
        return ((Boolean) f11414a.a(7, "measurement.rb.attribution.enable_trigger_redaction", true).get()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzaig
    public final boolean zzg() {
        return ((Boolean) f11414a.a(8, "measurement.rb.attribution.uuid_generation", true).get()).booleanValue();
    }
}
