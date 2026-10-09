package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class zzxo extends zzxz implements zzyi {
    @Override // com.google.android.gms.internal.measurement.zzxz
    public final zzabl c() {
        return zzabl.f11184b;
    }

    @Override // com.google.android.gms.internal.measurement.zzxz
    public final boolean d(zzyd zzydVar) {
        zzzj zzzjVarJ = j();
        int iA = zzzjVarJ.a();
        for (int i11 = 0; i11 < iA; i11++) {
            if (zzzjVarJ.b(i11).f12179a == "eye3tag") {
                if (zzzjVarJ.d(zzxx.f12152a) != null) {
                    break;
                }
                zzyl zzylVar = zzxx.f12160i;
                if (zzzjVarJ.d(zzylVar) != null) {
                    break;
                }
                k(zzylVar, zzyv.SMALL);
                break;
            }
        }
        return super.d(zzydVar);
    }
}
