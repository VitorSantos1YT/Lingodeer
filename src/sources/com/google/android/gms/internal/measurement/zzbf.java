package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzbf implements zzbe {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zzg f11469a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f11470b;

    public zzbf(zzg zzgVar, String str) {
        this.f11469a = zzgVar;
        this.f11470b = str;
    }

    @Override // com.google.android.gms.internal.measurement.zzbe
    public final zzg a(zzao zzaoVar) {
        String str = this.f11470b;
        zzg zzgVar = this.f11469a;
        zzgVar.f(str, zzaoVar);
        return zzgVar;
    }
}
