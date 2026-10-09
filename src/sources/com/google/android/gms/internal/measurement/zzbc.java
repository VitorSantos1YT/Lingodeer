package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzbc implements zzbe {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zzg f11465a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f11466b;

    public zzbc(zzg zzgVar, String str) {
        this.f11465a = zzgVar;
        this.f11466b = str;
    }

    @Override // com.google.android.gms.internal.measurement.zzbe
    public final zzg a(zzao zzaoVar) {
        zzg zzgVarC = this.f11465a.c();
        String str = this.f11466b;
        zzgVarC.f(str, zzaoVar);
        zzgVarC.f11602d.put(str, Boolean.TRUE);
        return zzgVarC;
    }
}
