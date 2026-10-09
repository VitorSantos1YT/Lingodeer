package com.google.android.gms.internal.play_billing;

import java.nio.charset.Charset;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzeq implements zzhu {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zzep f12359a;

    public zzeq(zzep zzepVar) {
        Charset charset = zzfo.f12383a;
        this.f12359a = zzepVar;
        zzepVar.f12358a = this;
    }

    @Override // com.google.android.gms.internal.play_billing.zzhu
    public final void a(int i11, Object obj, zzgv zzgvVar) {
        zzep zzepVar = this.f12359a;
        zzepVar.q(i11, 3);
        zzgvVar.b((zzgl) obj, zzepVar.f12358a);
        zzepVar.q(i11, 4);
    }

    @Override // com.google.android.gms.internal.play_billing.zzhu
    public final void b(int i11, zzei zzeiVar) {
        this.f12359a.f(i11, zzeiVar);
    }

    @Override // com.google.android.gms.internal.play_billing.zzhu
    public final void c(int i11, Object obj, zzgv zzgvVar) {
        this.f12359a.m(i11, (zzgl) obj, zzgvVar);
    }

    @Override // com.google.android.gms.internal.play_billing.zzhu
    public final void zzA(int i11, List list, boolean z11) {
        boolean z12 = list instanceof zzga;
        zzep zzepVar = this.f12359a;
        int i12 = 0;
        if (!z12) {
            if (!z11) {
                while (i12 < list.size()) {
                    zzepVar.i(i11, ((Long) list.get(i12)).longValue());
                    i12++;
                }
                return;
            }
            zzepVar.q(i11, 2);
            int i13 = 0;
            for (int i14 = 0; i14 < list.size(); i14++) {
                ((Long) list.get(i14)).getClass();
                i13 += 8;
            }
            zzepVar.s(i13);
            while (i12 < list.size()) {
                zzepVar.j(((Long) list.get(i12)).longValue());
                i12++;
            }
            return;
        }
        zzga zzgaVar = (zzga) list;
        if (!z11) {
            while (i12 < zzgaVar.f12393c) {
                zzepVar.i(i11, zzgaVar.b(i12));
                i12++;
            }
            return;
        }
        zzepVar.q(i11, 2);
        int i15 = 0;
        for (int i16 = 0; i16 < zzgaVar.f12393c; i16++) {
            zzgaVar.b(i16);
            i15 += 8;
        }
        zzepVar.s(i15);
        while (i12 < zzgaVar.f12393c) {
            zzepVar.j(zzgaVar.b(i12));
            i12++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzhu
    public final void zzB(int i11, int i12) {
        this.f12359a.r(i11, (i12 >> 31) ^ (i12 + i12));
    }

    @Override // com.google.android.gms.internal.play_billing.zzhu
    public final void zzC(int i11, List list, boolean z11) {
        boolean z12 = list instanceof zzfj;
        zzep zzepVar = this.f12359a;
        int i12 = 0;
        if (!z12) {
            if (!z11) {
                while (i12 < list.size()) {
                    int iIntValue = ((Integer) list.get(i12)).intValue();
                    zzepVar.r(i11, (iIntValue >> 31) ^ (iIntValue + iIntValue));
                    i12++;
                }
                return;
            }
            zzepVar.q(i11, 2);
            int iB = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                int iIntValue2 = ((Integer) list.get(i13)).intValue();
                iB += zzep.b((iIntValue2 >> 31) ^ (iIntValue2 + iIntValue2));
            }
            zzepVar.s(iB);
            while (i12 < list.size()) {
                int iIntValue3 = ((Integer) list.get(i12)).intValue();
                zzepVar.s((iIntValue3 >> 31) ^ (iIntValue3 + iIntValue3));
                i12++;
            }
            return;
        }
        zzfj zzfjVar = (zzfj) list;
        if (!z11) {
            while (i12 < zzfjVar.f12382c) {
                int iB2 = zzfjVar.b(i12);
                zzepVar.r(i11, (iB2 >> 31) ^ (iB2 + iB2));
                i12++;
            }
            return;
        }
        zzepVar.q(i11, 2);
        int iB3 = 0;
        for (int i14 = 0; i14 < zzfjVar.f12382c; i14++) {
            int iB4 = zzfjVar.b(i14);
            iB3 += zzep.b((iB4 >> 31) ^ (iB4 + iB4));
        }
        zzepVar.s(iB3);
        while (i12 < zzfjVar.f12382c) {
            int iB5 = zzfjVar.b(i12);
            zzepVar.s((iB5 >> 31) ^ (iB5 + iB5));
            i12++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzhu
    public final void zzD(int i11, long j11) {
        this.f12359a.t(i11, (j11 >> 63) ^ (j11 + j11));
    }

    @Override // com.google.android.gms.internal.play_billing.zzhu
    public final void zzE(int i11, List list, boolean z11) {
        boolean z12 = list instanceof zzga;
        zzep zzepVar = this.f12359a;
        int i12 = 0;
        if (!z12) {
            if (!z11) {
                while (i12 < list.size()) {
                    long jLongValue = ((Long) list.get(i12)).longValue();
                    zzepVar.t(i11, (jLongValue >> 63) ^ (jLongValue + jLongValue));
                    i12++;
                }
                return;
            }
            zzepVar.q(i11, 2);
            int iC = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                long jLongValue2 = ((Long) list.get(i13)).longValue();
                iC += zzep.c((jLongValue2 >> 63) ^ (jLongValue2 + jLongValue2));
            }
            zzepVar.s(iC);
            while (i12 < list.size()) {
                long jLongValue3 = ((Long) list.get(i12)).longValue();
                zzepVar.u((jLongValue3 >> 63) ^ (jLongValue3 + jLongValue3));
                i12++;
            }
            return;
        }
        zzga zzgaVar = (zzga) list;
        if (!z11) {
            while (i12 < zzgaVar.f12393c) {
                long jB = zzgaVar.b(i12);
                zzepVar.t(i11, (jB >> 63) ^ (jB + jB));
                i12++;
            }
            return;
        }
        zzepVar.q(i11, 2);
        int iC2 = 0;
        for (int i14 = 0; i14 < zzgaVar.f12393c; i14++) {
            long jB2 = zzgaVar.b(i14);
            iC2 += zzep.c((jB2 >> 63) ^ (jB2 + jB2));
        }
        zzepVar.s(iC2);
        while (i12 < zzgaVar.f12393c) {
            long jB3 = zzgaVar.b(i12);
            zzepVar.u((jB3 >> 63) ^ (jB3 + jB3));
            i12++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzhu
    public final void zzF(int i11) {
        this.f12359a.q(i11, 3);
    }

    @Override // com.google.android.gms.internal.play_billing.zzhu
    public final void zzG(int i11, String str) {
        this.f12359a.p(i11, str);
    }

    @Override // com.google.android.gms.internal.play_billing.zzhu
    public final void zzH(int i11, List list) {
        boolean z11 = list instanceof zzfx;
        int i12 = 0;
        zzep zzepVar = this.f12359a;
        if (!z11) {
            while (i12 < list.size()) {
                zzepVar.p(i11, (String) list.get(i12));
                i12++;
            }
            return;
        }
        zzfx zzfxVar = (zzfx) list;
        while (i12 < list.size()) {
            Object objZza = zzfxVar.zza();
            if (objZza instanceof String) {
                zzepVar.p(i11, (String) objZza);
            } else {
                zzepVar.f(i11, (zzei) objZza);
            }
            i12++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzhu
    public final void zzI(int i11, int i12) {
        this.f12359a.r(i11, i12);
    }

    @Override // com.google.android.gms.internal.play_billing.zzhu
    public final void zzJ(int i11, List list, boolean z11) {
        boolean z12 = list instanceof zzfj;
        zzep zzepVar = this.f12359a;
        int i12 = 0;
        if (!z12) {
            if (!z11) {
                while (i12 < list.size()) {
                    zzepVar.r(i11, ((Integer) list.get(i12)).intValue());
                    i12++;
                }
                return;
            }
            zzepVar.q(i11, 2);
            int iB = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                iB += zzep.b(((Integer) list.get(i13)).intValue());
            }
            zzepVar.s(iB);
            while (i12 < list.size()) {
                zzepVar.s(((Integer) list.get(i12)).intValue());
                i12++;
            }
            return;
        }
        zzfj zzfjVar = (zzfj) list;
        if (!z11) {
            while (i12 < zzfjVar.f12382c) {
                zzepVar.r(i11, zzfjVar.b(i12));
                i12++;
            }
            return;
        }
        zzepVar.q(i11, 2);
        int iB2 = 0;
        for (int i14 = 0; i14 < zzfjVar.f12382c; i14++) {
            iB2 += zzep.b(zzfjVar.b(i14));
        }
        zzepVar.s(iB2);
        while (i12 < zzfjVar.f12382c) {
            zzepVar.s(zzfjVar.b(i12));
            i12++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzhu
    public final void zzK(int i11, long j11) {
        this.f12359a.t(i11, j11);
    }

    @Override // com.google.android.gms.internal.play_billing.zzhu
    public final void zzL(int i11, List list, boolean z11) {
        boolean z12 = list instanceof zzga;
        zzep zzepVar = this.f12359a;
        int i12 = 0;
        if (!z12) {
            if (!z11) {
                while (i12 < list.size()) {
                    zzepVar.t(i11, ((Long) list.get(i12)).longValue());
                    i12++;
                }
                return;
            }
            zzepVar.q(i11, 2);
            int iC = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                iC += zzep.c(((Long) list.get(i13)).longValue());
            }
            zzepVar.s(iC);
            while (i12 < list.size()) {
                zzepVar.u(((Long) list.get(i12)).longValue());
                i12++;
            }
            return;
        }
        zzga zzgaVar = (zzga) list;
        if (!z11) {
            while (i12 < zzgaVar.f12393c) {
                zzepVar.t(i11, zzgaVar.b(i12));
                i12++;
            }
            return;
        }
        zzepVar.q(i11, 2);
        int iC2 = 0;
        for (int i14 = 0; i14 < zzgaVar.f12393c; i14++) {
            iC2 += zzep.c(zzgaVar.b(i14));
        }
        zzepVar.s(iC2);
        while (i12 < zzgaVar.f12393c) {
            zzepVar.u(zzgaVar.b(i12));
            i12++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzhu
    public final void zzb(int i11, boolean z11) {
        this.f12359a.e(i11, z11);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.google.android.gms.internal.play_billing.zzhu
    public final void zzc(int i11, List list, boolean z11) {
        boolean z12 = list instanceof zzdy;
        zzep zzepVar = this.f12359a;
        int i12 = 0;
        if (!z12) {
            if (!z11) {
                while (i12 < list.size()) {
                    zzepVar.e(i11, ((Boolean) list.get(i12)).booleanValue());
                    i12++;
                }
                return;
            }
            zzepVar.q(i11, 2);
            int i13 = 0;
            for (int i14 = 0; i14 < list.size(); i14++) {
                ((Boolean) list.get(i14)).getClass();
                i13++;
            }
            zzepVar.s(i13);
            while (i12 < list.size()) {
                zzepVar.d(((Boolean) list.get(i12)).booleanValue() ? (byte) 1 : (byte) 0);
                i12++;
            }
            return;
        }
        zzdy zzdyVar = (zzdy) list;
        if (!z11) {
            while (i12 < zzdyVar.f12341c) {
                zzdyVar.d(i12);
                zzepVar.e(i11, zzdyVar.f12340b[i12]);
                i12++;
            }
            return;
        }
        zzepVar.q(i11, 2);
        int i15 = 0;
        for (int i16 = 0; i16 < zzdyVar.f12341c; i16++) {
            zzdyVar.d(i16);
            boolean z13 = zzdyVar.f12340b[i16];
            i15++;
        }
        zzepVar.s(i15);
        while (i12 < zzdyVar.f12341c) {
            zzdyVar.d(i12);
            zzepVar.d(zzdyVar.f12340b[i12] ? (byte) 1 : (byte) 0);
            i12++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzhu
    public final void zze(int i11, List list) {
        for (int i12 = 0; i12 < list.size(); i12++) {
            this.f12359a.f(i11, (zzei) list.get(i12));
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzhu
    public final void zzf(int i11, double d5) {
        this.f12359a.i(i11, Double.doubleToRawLongBits(d5));
    }

    @Override // com.google.android.gms.internal.play_billing.zzhu
    public final void zzg(int i11, List list, boolean z11) {
        boolean z12 = list instanceof zzer;
        zzep zzepVar = this.f12359a;
        int i12 = 0;
        if (!z12) {
            if (!z11) {
                while (i12 < list.size()) {
                    zzepVar.i(i11, Double.doubleToRawLongBits(((Double) list.get(i12)).doubleValue()));
                    i12++;
                }
                return;
            }
            zzepVar.q(i11, 2);
            int i13 = 0;
            for (int i14 = 0; i14 < list.size(); i14++) {
                ((Double) list.get(i14)).getClass();
                i13 += 8;
            }
            zzepVar.s(i13);
            while (i12 < list.size()) {
                zzepVar.j(Double.doubleToRawLongBits(((Double) list.get(i12)).doubleValue()));
                i12++;
            }
            return;
        }
        zzer zzerVar = (zzer) list;
        if (!z11) {
            while (i12 < zzerVar.f12362c) {
                zzerVar.d(i12);
                zzepVar.i(i11, Double.doubleToRawLongBits(zzerVar.f12361b[i12]));
                i12++;
            }
            return;
        }
        zzepVar.q(i11, 2);
        int i15 = 0;
        for (int i16 = 0; i16 < zzerVar.f12362c; i16++) {
            zzerVar.d(i16);
            double d5 = zzerVar.f12361b[i16];
            i15 += 8;
        }
        zzepVar.s(i15);
        while (i12 < zzerVar.f12362c) {
            zzerVar.d(i12);
            zzepVar.j(Double.doubleToRawLongBits(zzerVar.f12361b[i12]));
            i12++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzhu
    public final void zzh(int i11) {
        this.f12359a.q(i11, 4);
    }

    @Override // com.google.android.gms.internal.play_billing.zzhu
    public final void zzi(int i11, int i12) {
        this.f12359a.k(i11, i12);
    }

    @Override // com.google.android.gms.internal.play_billing.zzhu
    public final void zzj(int i11, List list, boolean z11) {
        boolean z12 = list instanceof zzfj;
        zzep zzepVar = this.f12359a;
        int i12 = 0;
        if (!z12) {
            if (!z11) {
                while (i12 < list.size()) {
                    zzepVar.k(i11, ((Integer) list.get(i12)).intValue());
                    i12++;
                }
                return;
            }
            zzepVar.q(i11, 2);
            int iC = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                iC += zzep.c(((Integer) list.get(i13)).intValue());
            }
            zzepVar.s(iC);
            while (i12 < list.size()) {
                zzepVar.l(((Integer) list.get(i12)).intValue());
                i12++;
            }
            return;
        }
        zzfj zzfjVar = (zzfj) list;
        if (!z11) {
            while (i12 < zzfjVar.f12382c) {
                zzepVar.k(i11, zzfjVar.b(i12));
                i12++;
            }
            return;
        }
        zzepVar.q(i11, 2);
        int iC2 = 0;
        for (int i14 = 0; i14 < zzfjVar.f12382c; i14++) {
            iC2 += zzep.c(zzfjVar.b(i14));
        }
        zzepVar.s(iC2);
        while (i12 < zzfjVar.f12382c) {
            zzepVar.l(zzfjVar.b(i12));
            i12++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzhu
    public final void zzk(int i11, int i12) {
        this.f12359a.g(i11, i12);
    }

    @Override // com.google.android.gms.internal.play_billing.zzhu
    public final void zzl(int i11, List list, boolean z11) {
        boolean z12 = list instanceof zzfj;
        zzep zzepVar = this.f12359a;
        int i12 = 0;
        if (!z12) {
            if (!z11) {
                while (i12 < list.size()) {
                    zzepVar.g(i11, ((Integer) list.get(i12)).intValue());
                    i12++;
                }
                return;
            }
            zzepVar.q(i11, 2);
            int i13 = 0;
            for (int i14 = 0; i14 < list.size(); i14++) {
                ((Integer) list.get(i14)).getClass();
                i13 += 4;
            }
            zzepVar.s(i13);
            while (i12 < list.size()) {
                zzepVar.h(((Integer) list.get(i12)).intValue());
                i12++;
            }
            return;
        }
        zzfj zzfjVar = (zzfj) list;
        if (!z11) {
            while (i12 < zzfjVar.f12382c) {
                zzepVar.g(i11, zzfjVar.b(i12));
                i12++;
            }
            return;
        }
        zzepVar.q(i11, 2);
        int i15 = 0;
        for (int i16 = 0; i16 < zzfjVar.f12382c; i16++) {
            zzfjVar.b(i16);
            i15 += 4;
        }
        zzepVar.s(i15);
        while (i12 < zzfjVar.f12382c) {
            zzepVar.h(zzfjVar.b(i12));
            i12++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzhu
    public final void zzm(int i11, long j11) {
        this.f12359a.i(i11, j11);
    }

    @Override // com.google.android.gms.internal.play_billing.zzhu
    public final void zzn(int i11, List list, boolean z11) {
        boolean z12 = list instanceof zzga;
        zzep zzepVar = this.f12359a;
        int i12 = 0;
        if (!z12) {
            if (!z11) {
                while (i12 < list.size()) {
                    zzepVar.i(i11, ((Long) list.get(i12)).longValue());
                    i12++;
                }
                return;
            }
            zzepVar.q(i11, 2);
            int i13 = 0;
            for (int i14 = 0; i14 < list.size(); i14++) {
                ((Long) list.get(i14)).getClass();
                i13 += 8;
            }
            zzepVar.s(i13);
            while (i12 < list.size()) {
                zzepVar.j(((Long) list.get(i12)).longValue());
                i12++;
            }
            return;
        }
        zzga zzgaVar = (zzga) list;
        if (!z11) {
            while (i12 < zzgaVar.f12393c) {
                zzepVar.i(i11, zzgaVar.b(i12));
                i12++;
            }
            return;
        }
        zzepVar.q(i11, 2);
        int i15 = 0;
        for (int i16 = 0; i16 < zzgaVar.f12393c; i16++) {
            zzgaVar.b(i16);
            i15 += 8;
        }
        zzepVar.s(i15);
        while (i12 < zzgaVar.f12393c) {
            zzepVar.j(zzgaVar.b(i12));
            i12++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzhu
    public final void zzo(int i11, float f5) {
        this.f12359a.g(i11, Float.floatToRawIntBits(f5));
    }

    @Override // com.google.android.gms.internal.play_billing.zzhu
    public final void zzp(int i11, List list, boolean z11) {
        boolean z12 = list instanceof zzfb;
        zzep zzepVar = this.f12359a;
        int i12 = 0;
        if (!z12) {
            if (!z11) {
                while (i12 < list.size()) {
                    zzepVar.g(i11, Float.floatToRawIntBits(((Float) list.get(i12)).floatValue()));
                    i12++;
                }
                return;
            }
            zzepVar.q(i11, 2);
            int i13 = 0;
            for (int i14 = 0; i14 < list.size(); i14++) {
                ((Float) list.get(i14)).getClass();
                i13 += 4;
            }
            zzepVar.s(i13);
            while (i12 < list.size()) {
                zzepVar.h(Float.floatToRawIntBits(((Float) list.get(i12)).floatValue()));
                i12++;
            }
            return;
        }
        zzfb zzfbVar = (zzfb) list;
        if (!z11) {
            while (i12 < zzfbVar.f12375c) {
                zzfbVar.d(i12);
                zzepVar.g(i11, Float.floatToRawIntBits(zzfbVar.f12374b[i12]));
                i12++;
            }
            return;
        }
        zzepVar.q(i11, 2);
        int i15 = 0;
        for (int i16 = 0; i16 < zzfbVar.f12375c; i16++) {
            zzfbVar.d(i16);
            float f5 = zzfbVar.f12374b[i16];
            i15 += 4;
        }
        zzepVar.s(i15);
        while (i12 < zzfbVar.f12375c) {
            zzfbVar.d(i12);
            zzepVar.h(Float.floatToRawIntBits(zzfbVar.f12374b[i12]));
            i12++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzhu
    public final void zzr(int i11, int i12) {
        this.f12359a.k(i11, i12);
    }

    @Override // com.google.android.gms.internal.play_billing.zzhu
    public final void zzs(int i11, List list, boolean z11) {
        boolean z12 = list instanceof zzfj;
        zzep zzepVar = this.f12359a;
        int i12 = 0;
        if (!z12) {
            if (!z11) {
                while (i12 < list.size()) {
                    zzepVar.k(i11, ((Integer) list.get(i12)).intValue());
                    i12++;
                }
                return;
            }
            zzepVar.q(i11, 2);
            int iC = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                iC += zzep.c(((Integer) list.get(i13)).intValue());
            }
            zzepVar.s(iC);
            while (i12 < list.size()) {
                zzepVar.l(((Integer) list.get(i12)).intValue());
                i12++;
            }
            return;
        }
        zzfj zzfjVar = (zzfj) list;
        if (!z11) {
            while (i12 < zzfjVar.f12382c) {
                zzepVar.k(i11, zzfjVar.b(i12));
                i12++;
            }
            return;
        }
        zzepVar.q(i11, 2);
        int iC2 = 0;
        for (int i14 = 0; i14 < zzfjVar.f12382c; i14++) {
            iC2 += zzep.c(zzfjVar.b(i14));
        }
        zzepVar.s(iC2);
        while (i12 < zzfjVar.f12382c) {
            zzepVar.l(zzfjVar.b(i12));
            i12++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzhu
    public final void zzt(int i11, long j11) {
        this.f12359a.t(i11, j11);
    }

    @Override // com.google.android.gms.internal.play_billing.zzhu
    public final void zzu(int i11, List list, boolean z11) {
        boolean z12 = list instanceof zzga;
        zzep zzepVar = this.f12359a;
        int i12 = 0;
        if (!z12) {
            if (!z11) {
                while (i12 < list.size()) {
                    zzepVar.t(i11, ((Long) list.get(i12)).longValue());
                    i12++;
                }
                return;
            }
            zzepVar.q(i11, 2);
            int iC = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                iC += zzep.c(((Long) list.get(i13)).longValue());
            }
            zzepVar.s(iC);
            while (i12 < list.size()) {
                zzepVar.u(((Long) list.get(i12)).longValue());
                i12++;
            }
            return;
        }
        zzga zzgaVar = (zzga) list;
        if (!z11) {
            while (i12 < zzgaVar.f12393c) {
                zzepVar.t(i11, zzgaVar.b(i12));
                i12++;
            }
            return;
        }
        zzepVar.q(i11, 2);
        int iC2 = 0;
        for (int i14 = 0; i14 < zzgaVar.f12393c; i14++) {
            iC2 += zzep.c(zzgaVar.b(i14));
        }
        zzepVar.s(iC2);
        while (i12 < zzgaVar.f12393c) {
            zzepVar.u(zzgaVar.b(i12));
            i12++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzhu
    public final void zzw(int i11, Object obj) {
        boolean z11 = obj instanceof zzei;
        zzep zzepVar = this.f12359a;
        if (z11) {
            zzepVar.o(i11, (zzei) obj);
        } else {
            zzepVar.n(i11, (zzgl) obj);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzhu
    public final void zzx(int i11, int i12) {
        this.f12359a.g(i11, i12);
    }

    @Override // com.google.android.gms.internal.play_billing.zzhu
    public final void zzy(int i11, List list, boolean z11) {
        boolean z12 = list instanceof zzfj;
        zzep zzepVar = this.f12359a;
        int i12 = 0;
        if (!z12) {
            if (!z11) {
                while (i12 < list.size()) {
                    zzepVar.g(i11, ((Integer) list.get(i12)).intValue());
                    i12++;
                }
                return;
            }
            zzepVar.q(i11, 2);
            int i13 = 0;
            for (int i14 = 0; i14 < list.size(); i14++) {
                ((Integer) list.get(i14)).getClass();
                i13 += 4;
            }
            zzepVar.s(i13);
            while (i12 < list.size()) {
                zzepVar.h(((Integer) list.get(i12)).intValue());
                i12++;
            }
            return;
        }
        zzfj zzfjVar = (zzfj) list;
        if (!z11) {
            while (i12 < zzfjVar.f12382c) {
                zzepVar.g(i11, zzfjVar.b(i12));
                i12++;
            }
            return;
        }
        zzepVar.q(i11, 2);
        int i15 = 0;
        for (int i16 = 0; i16 < zzfjVar.f12382c; i16++) {
            zzfjVar.b(i16);
            i15 += 4;
        }
        zzepVar.s(i15);
        while (i12 < zzfjVar.f12382c) {
            zzepVar.h(zzfjVar.b(i12));
            i12++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzhu
    public final void zzz(int i11, long j11) {
        this.f12359a.i(i11, j11);
    }
}
