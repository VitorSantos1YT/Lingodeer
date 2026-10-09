package com.google.android.gms.internal.measurement;

import b7.e0;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzafg implements zzafp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zzafc f11312a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zzafz f11313b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f11314c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final zzadg f11315d;

    public zzafg(zzafz zzafzVar, zzadg zzadgVar, zzafc zzafcVar) {
        this.f11313b = zzafzVar;
        this.f11314c = zzafcVar instanceof zzadr;
        this.f11315d = zzadgVar;
        this.f11312a = zzafcVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzafp
    public final void a(Object obj) {
        this.f11313b.j(obj);
        this.f11315d.a(obj);
    }

    @Override // com.google.android.gms.internal.measurement.zzafp
    public final void b(Object obj, zzadb zzadbVar) {
        Iterator itB = ((zzadr) obj).zzb.b();
        if (itB.hasNext()) {
            ((zzadj) ((Map.Entry) itB.next()).getKey()).zzc();
            throw null;
        }
        zzaga zzagaVar = ((zzadu) obj).zzc;
        for (int i11 = 0; i11 < zzagaVar.f11346a; i11++) {
            int i12 = zzagaVar.f11347b[i11] >>> 3;
            Object obj2 = zzagaVar.f11348c[i11];
            zzada zzadaVar = zzadbVar.f11247a;
            if (obj2 instanceof zzacr) {
                zzadaVar.r(i12, (zzacr) obj2);
            } else {
                zzadaVar.q(i12, (zzafc) obj2);
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzafp
    public final void c(Object obj, Object obj2) {
        zzafq.b(obj, obj2);
        if (!this.f11314c || ((zzadr) obj2).zzb.f11258a.isEmpty()) {
            return;
        }
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.zzafp
    public final int d(zzadu zzaduVar) {
        zzaga zzagaVar = zzaduVar.zzc;
        int iC = zzagaVar.f11349d;
        if (iC == -1) {
            iC = 0;
            for (int i11 = 0; i11 < zzagaVar.f11346a; i11++) {
                int i12 = zzagaVar.f11347b[i11] >>> 3;
                zzacr zzacrVar = (zzacr) zzagaVar.f11348c[i11];
                int iB = zzada.b(8);
                int iB2 = zzada.b(i12) + zzada.b(16);
                int iB3 = zzada.b(24);
                int iD = zzacrVar.d();
                iC += iB + iB + iB2 + e0.C(iD, iD, iB3);
            }
            zzagaVar.f11349d = iC;
        }
        if (this.f11314c) {
            zzafr zzafrVar = ((zzadr) zzaduVar).zzb.f11258a;
            if (zzafrVar.f11338b > 0) {
                zzadk.g(zzafrVar.b(0));
                throw null;
            }
            Iterator it = zzafrVar.c().iterator();
            if (it.hasNext()) {
                zzadk.g((Map.Entry) it.next());
                throw null;
            }
        }
        return iC;
    }

    @Override // com.google.android.gms.internal.measurement.zzafp
    public final boolean e(zzadu zzaduVar, zzadu zzaduVar2) {
        if (!zzaduVar.zzc.equals(zzaduVar2.zzc)) {
            return false;
        }
        if (this.f11314c) {
            return ((zzadr) zzaduVar).zzb.equals(((zzadr) zzaduVar2).zzb);
        }
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.zzafp
    public final void f(Object obj, byte[] bArr, int i11, int i12, zzacg zzacgVar) {
        zzadu zzaduVar = (zzadu) obj;
        if (zzaduVar.zzc == zzaga.f11345f) {
            zzaduVar.zzc = zzaga.a();
        }
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.zzafp
    public final void g(Object obj, zzacw zzacwVar, zzadf zzadfVar) {
        this.f11313b.h(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.zzafp
    public final int h(zzadu zzaduVar) {
        int iHashCode = zzaduVar.zzc.hashCode();
        return this.f11314c ? (iHashCode * 53) + ((zzadr) zzaduVar).zzb.f11258a.hashCode() : iHashCode;
    }

    @Override // com.google.android.gms.internal.measurement.zzafp
    public final Object zza() {
        zzafc zzafcVar = this.f11312a;
        return zzafcVar instanceof zzadu ? ((zzadu) zzafcVar).n() : zzafcVar.d().S0();
    }

    @Override // com.google.android.gms.internal.measurement.zzafp
    public final boolean zzl(Object obj) {
        ((zzadr) obj).zzb.c();
        return true;
    }
}
