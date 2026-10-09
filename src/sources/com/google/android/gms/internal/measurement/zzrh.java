package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzrh implements zzrl {
    @Override // com.google.android.gms.internal.measurement.zzrl
    public final boolean a(zzrg zzrgVar) {
        zzrgVar.getClass();
        String str = "false";
        try {
            str = (String) zzrm.f11907a.invoke(null, "tiktok_systrace", "false");
        } catch (Exception unused) {
        }
        return str.equals("true");
    }
}
