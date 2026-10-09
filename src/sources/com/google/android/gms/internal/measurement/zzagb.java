package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzagb extends zzafz {
    @Override // com.google.android.gms.internal.measurement.zzafz
    public final /* bridge */ /* synthetic */ void a(long j11, Object obj, int i11) {
        ((zzaga) obj).d(i11 << 3, Long.valueOf(j11));
    }

    @Override // com.google.android.gms.internal.measurement.zzafz
    public final /* bridge */ /* synthetic */ void b(int i11, int i12, Object obj) {
        ((zzaga) obj).d((i11 << 3) | 5, Integer.valueOf(i12));
    }

    @Override // com.google.android.gms.internal.measurement.zzafz
    public final /* bridge */ /* synthetic */ void c(long j11, Object obj, int i11) {
        ((zzaga) obj).d((i11 << 3) | 1, Long.valueOf(j11));
    }

    @Override // com.google.android.gms.internal.measurement.zzafz
    public final /* bridge */ /* synthetic */ void d(Object obj, int i11, zzacr zzacrVar) {
        ((zzaga) obj).d((i11 << 3) | 2, zzacrVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzafz
    public final /* bridge */ /* synthetic */ void e(int i11, Object obj, Object obj2) {
        ((zzaga) obj).d((i11 << 3) | 3, (zzaga) obj2);
    }

    @Override // com.google.android.gms.internal.measurement.zzafz
    public final /* synthetic */ zzaga f() {
        return zzaga.a();
    }

    @Override // com.google.android.gms.internal.measurement.zzafz
    public final zzaga g(Object obj) {
        zzaga zzagaVar = (zzaga) obj;
        if (zzagaVar.f11350e) {
            zzagaVar.f11350e = false;
        }
        return zzagaVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzafz
    public final /* bridge */ /* synthetic */ zzaga h(Object obj) {
        zzadu zzaduVar = (zzadu) obj;
        zzaga zzagaVar = zzaduVar.zzc;
        if (zzagaVar != zzaga.f11345f) {
            return zzagaVar;
        }
        zzaga zzagaVarA = zzaga.a();
        zzaduVar.zzc = zzagaVarA;
        return zzagaVarA;
    }

    @Override // com.google.android.gms.internal.measurement.zzafz
    public final /* synthetic */ void i(Object obj, Object obj2) {
        ((zzadu) obj).zzc = (zzaga) obj2;
    }

    @Override // com.google.android.gms.internal.measurement.zzafz
    public final void j(Object obj) {
        zzaga zzagaVar = ((zzadu) obj).zzc;
        if (zzagaVar.f11350e) {
            zzagaVar.f11350e = false;
        }
    }
}
