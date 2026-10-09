package com.google.android.recaptcha.internal;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzlo implements zzpy {
    private final zzln zza;

    private zzlo(zzln zzlnVar) {
        byte[] bArr = zznl.zzb;
        this.zza = zzlnVar;
        zzlnVar.zza = this;
    }

    public static zzlo zza(zzln zzlnVar) {
        zzlo zzloVar = zzlnVar.zza;
        return zzloVar != null ? zzloVar : new zzlo(zzlnVar);
    }

    @Override // com.google.android.recaptcha.internal.zzpy
    public final void zzA(int i11, List list, boolean z11) {
        int i12 = 0;
        if (!(list instanceof zznx)) {
            if (!z11) {
                while (i12 < list.size()) {
                    this.zza.zzh(i11, ((Long) list.get(i12)).longValue());
                    i12++;
                }
                return;
            }
            this.zza.zzr(i11, 2);
            int i13 = 0;
            for (int i14 = 0; i14 < list.size(); i14++) {
                ((Long) list.get(i14)).getClass();
                i13 += 8;
            }
            this.zza.zzt(i13);
            while (i12 < list.size()) {
                this.zza.zzi(((Long) list.get(i12)).longValue());
                i12++;
            }
            return;
        }
        zznx zznxVar = (zznx) list;
        if (!z11) {
            while (i12 < zznxVar.size()) {
                this.zza.zzh(i11, zznxVar.zze(i12));
                i12++;
            }
            return;
        }
        this.zza.zzr(i11, 2);
        int i15 = 0;
        for (int i16 = 0; i16 < zznxVar.size(); i16++) {
            zznxVar.zze(i16);
            i15 += 8;
        }
        this.zza.zzt(i15);
        while (i12 < zznxVar.size()) {
            this.zza.zzi(zznxVar.zze(i12));
            i12++;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzpy
    public final void zzB(int i11, int i12) {
        this.zza.zzs(i11, (i12 >> 31) ^ (i12 + i12));
    }

    @Override // com.google.android.recaptcha.internal.zzpy
    public final void zzC(int i11, List list, boolean z11) {
        int i12 = 0;
        if (!(list instanceof zzne)) {
            if (!z11) {
                while (i12 < list.size()) {
                    zzln zzlnVar = this.zza;
                    int iIntValue = ((Integer) list.get(i12)).intValue();
                    zzlnVar.zzs(i11, (iIntValue >> 31) ^ (iIntValue + iIntValue));
                    i12++;
                }
                return;
            }
            this.zza.zzr(i11, 2);
            int iZzA = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                int iIntValue2 = ((Integer) list.get(i13)).intValue();
                iZzA += zzln.zzA((iIntValue2 >> 31) ^ (iIntValue2 + iIntValue2));
            }
            this.zza.zzt(iZzA);
            while (i12 < list.size()) {
                zzln zzlnVar2 = this.zza;
                int iIntValue3 = ((Integer) list.get(i12)).intValue();
                zzlnVar2.zzt((iIntValue3 >> 31) ^ (iIntValue3 + iIntValue3));
                i12++;
            }
            return;
        }
        zzne zzneVar = (zzne) list;
        if (!z11) {
            while (i12 < zzneVar.size()) {
                zzln zzlnVar3 = this.zza;
                int iZze = zzneVar.zze(i12);
                zzlnVar3.zzs(i11, (iZze >> 31) ^ (iZze + iZze));
                i12++;
            }
            return;
        }
        this.zza.zzr(i11, 2);
        int iZzA2 = 0;
        for (int i14 = 0; i14 < zzneVar.size(); i14++) {
            int iZze2 = zzneVar.zze(i14);
            iZzA2 += zzln.zzA((iZze2 >> 31) ^ (iZze2 + iZze2));
        }
        this.zza.zzt(iZzA2);
        while (i12 < zzneVar.size()) {
            zzln zzlnVar4 = this.zza;
            int iZze3 = zzneVar.zze(i12);
            zzlnVar4.zzt((iZze3 >> 31) ^ (iZze3 + iZze3));
            i12++;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzpy
    public final void zzD(int i11, long j11) {
        this.zza.zzu(i11, (j11 >> 63) ^ (j11 + j11));
    }

    @Override // com.google.android.recaptcha.internal.zzpy
    public final void zzE(int i11, List list, boolean z11) {
        int i12 = 0;
        if (!(list instanceof zznx)) {
            if (!z11) {
                while (i12 < list.size()) {
                    zzln zzlnVar = this.zza;
                    long jLongValue = ((Long) list.get(i12)).longValue();
                    zzlnVar.zzu(i11, (jLongValue >> 63) ^ (jLongValue + jLongValue));
                    i12++;
                }
                return;
            }
            this.zza.zzr(i11, 2);
            int iZzB = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                long jLongValue2 = ((Long) list.get(i13)).longValue();
                iZzB += zzln.zzB((jLongValue2 >> 63) ^ (jLongValue2 + jLongValue2));
            }
            this.zza.zzt(iZzB);
            while (i12 < list.size()) {
                zzln zzlnVar2 = this.zza;
                long jLongValue3 = ((Long) list.get(i12)).longValue();
                zzlnVar2.zzv((jLongValue3 >> 63) ^ (jLongValue3 + jLongValue3));
                i12++;
            }
            return;
        }
        zznx zznxVar = (zznx) list;
        if (!z11) {
            while (i12 < zznxVar.size()) {
                zzln zzlnVar3 = this.zza;
                long jZze = zznxVar.zze(i12);
                zzlnVar3.zzu(i11, (jZze >> 63) ^ (jZze + jZze));
                i12++;
            }
            return;
        }
        this.zza.zzr(i11, 2);
        int iZzB2 = 0;
        for (int i14 = 0; i14 < zznxVar.size(); i14++) {
            long jZze2 = zznxVar.zze(i14);
            iZzB2 += zzln.zzB((jZze2 >> 63) ^ (jZze2 + jZze2));
        }
        this.zza.zzt(iZzB2);
        while (i12 < zznxVar.size()) {
            zzln zzlnVar4 = this.zza;
            long jZze3 = zznxVar.zze(i12);
            zzlnVar4.zzv((jZze3 >> 63) ^ (jZze3 + jZze3));
            i12++;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzpy
    @Deprecated
    public final void zzF(int i11) {
        this.zza.zzr(i11, 3);
    }

    @Override // com.google.android.recaptcha.internal.zzpy
    public final void zzG(int i11, String str) {
        this.zza.zzp(i11, str);
    }

    @Override // com.google.android.recaptcha.internal.zzpy
    public final void zzH(int i11, List list) {
        int i12 = 0;
        if (!(list instanceof zznu)) {
            while (i12 < list.size()) {
                this.zza.zzp(i11, (String) list.get(i12));
                i12++;
            }
            return;
        }
        zznu zznuVar = (zznu) list;
        while (i12 < list.size()) {
            Object objZzc = zznuVar.zzc();
            if (objZzc instanceof String) {
                this.zza.zzp(i11, (String) objZzc);
            } else {
                this.zza.zze(i11, (zzle) objZzc);
            }
            i12++;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzpy
    public final void zzI(int i11, int i12) {
        this.zza.zzs(i11, i12);
    }

    @Override // com.google.android.recaptcha.internal.zzpy
    public final void zzJ(int i11, List list, boolean z11) {
        int i12 = 0;
        if (!(list instanceof zzne)) {
            if (!z11) {
                while (i12 < list.size()) {
                    this.zza.zzs(i11, ((Integer) list.get(i12)).intValue());
                    i12++;
                }
                return;
            }
            this.zza.zzr(i11, 2);
            int iZzA = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                iZzA += zzln.zzA(((Integer) list.get(i13)).intValue());
            }
            this.zza.zzt(iZzA);
            while (i12 < list.size()) {
                this.zza.zzt(((Integer) list.get(i12)).intValue());
                i12++;
            }
            return;
        }
        zzne zzneVar = (zzne) list;
        if (!z11) {
            while (i12 < zzneVar.size()) {
                this.zza.zzs(i11, zzneVar.zze(i12));
                i12++;
            }
            return;
        }
        this.zza.zzr(i11, 2);
        int iZzA2 = 0;
        for (int i14 = 0; i14 < zzneVar.size(); i14++) {
            iZzA2 += zzln.zzA(zzneVar.zze(i14));
        }
        this.zza.zzt(iZzA2);
        while (i12 < zzneVar.size()) {
            this.zza.zzt(zzneVar.zze(i12));
            i12++;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzpy
    public final void zzK(int i11, long j11) {
        this.zza.zzu(i11, j11);
    }

    @Override // com.google.android.recaptcha.internal.zzpy
    public final void zzL(int i11, List list, boolean z11) {
        int i12 = 0;
        if (!(list instanceof zznx)) {
            if (!z11) {
                while (i12 < list.size()) {
                    this.zza.zzu(i11, ((Long) list.get(i12)).longValue());
                    i12++;
                }
                return;
            }
            this.zza.zzr(i11, 2);
            int iZzB = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                iZzB += zzln.zzB(((Long) list.get(i13)).longValue());
            }
            this.zza.zzt(iZzB);
            while (i12 < list.size()) {
                this.zza.zzv(((Long) list.get(i12)).longValue());
                i12++;
            }
            return;
        }
        zznx zznxVar = (zznx) list;
        if (!z11) {
            while (i12 < zznxVar.size()) {
                this.zza.zzu(i11, zznxVar.zze(i12));
                i12++;
            }
            return;
        }
        this.zza.zzr(i11, 2);
        int iZzB2 = 0;
        for (int i14 = 0; i14 < zznxVar.size(); i14++) {
            iZzB2 += zzln.zzB(zznxVar.zze(i14));
        }
        this.zza.zzt(iZzB2);
        while (i12 < zznxVar.size()) {
            this.zza.zzv(zznxVar.zze(i12));
            i12++;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzpy
    public final void zzb(int i11, boolean z11) {
        this.zza.zzd(i11, z11);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.google.android.recaptcha.internal.zzpy
    public final void zzc(int i11, List list, boolean z11) {
        int i12 = 0;
        if (!(list instanceof zzkv)) {
            if (!z11) {
                while (i12 < list.size()) {
                    this.zza.zzd(i11, ((Boolean) list.get(i12)).booleanValue());
                    i12++;
                }
                return;
            }
            this.zza.zzr(i11, 2);
            int i13 = 0;
            for (int i14 = 0; i14 < list.size(); i14++) {
                ((Boolean) list.get(i14)).getClass();
                i13++;
            }
            this.zza.zzt(i13);
            while (i12 < list.size()) {
                this.zza.zzb(((Boolean) list.get(i12)).booleanValue() ? (byte) 1 : (byte) 0);
                i12++;
            }
            return;
        }
        zzkv zzkvVar = (zzkv) list;
        if (!z11) {
            while (i12 < zzkvVar.size()) {
                this.zza.zzd(i11, zzkvVar.zzf(i12));
                i12++;
            }
            return;
        }
        this.zza.zzr(i11, 2);
        int i15 = 0;
        for (int i16 = 0; i16 < zzkvVar.size(); i16++) {
            zzkvVar.zzf(i16);
            i15++;
        }
        this.zza.zzt(i15);
        while (i12 < zzkvVar.size()) {
            this.zza.zzb(zzkvVar.zzf(i12) ? (byte) 1 : (byte) 0);
            i12++;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzpy
    public final void zzd(int i11, zzle zzleVar) {
        this.zza.zze(i11, zzleVar);
    }

    @Override // com.google.android.recaptcha.internal.zzpy
    public final void zze(int i11, List list) {
        for (int i12 = 0; i12 < list.size(); i12++) {
            this.zza.zze(i11, (zzle) list.get(i12));
        }
    }

    @Override // com.google.android.recaptcha.internal.zzpy
    public final void zzf(int i11, double d5) {
        this.zza.zzh(i11, Double.doubleToRawLongBits(d5));
    }

    @Override // com.google.android.recaptcha.internal.zzpy
    public final void zzg(int i11, List list, boolean z11) {
        int i12 = 0;
        if (!(list instanceof zzmi)) {
            if (!z11) {
                while (i12 < list.size()) {
                    this.zza.zzh(i11, Double.doubleToRawLongBits(((Double) list.get(i12)).doubleValue()));
                    i12++;
                }
                return;
            }
            this.zza.zzr(i11, 2);
            int i13 = 0;
            for (int i14 = 0; i14 < list.size(); i14++) {
                ((Double) list.get(i14)).getClass();
                i13 += 8;
            }
            this.zza.zzt(i13);
            while (i12 < list.size()) {
                this.zza.zzi(Double.doubleToRawLongBits(((Double) list.get(i12)).doubleValue()));
                i12++;
            }
            return;
        }
        zzmi zzmiVar = (zzmi) list;
        if (!z11) {
            while (i12 < zzmiVar.size()) {
                this.zza.zzh(i11, Double.doubleToRawLongBits(zzmiVar.zze(i12)));
                i12++;
            }
            return;
        }
        this.zza.zzr(i11, 2);
        int i15 = 0;
        for (int i16 = 0; i16 < zzmiVar.size(); i16++) {
            zzmiVar.zze(i16);
            i15 += 8;
        }
        this.zza.zzt(i15);
        while (i12 < zzmiVar.size()) {
            this.zza.zzi(Double.doubleToRawLongBits(zzmiVar.zze(i12)));
            i12++;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzpy
    @Deprecated
    public final void zzh(int i11) {
        this.zza.zzr(i11, 4);
    }

    @Override // com.google.android.recaptcha.internal.zzpy
    public final void zzi(int i11, int i12) {
        this.zza.zzj(i11, i12);
    }

    @Override // com.google.android.recaptcha.internal.zzpy
    public final void zzj(int i11, List list, boolean z11) {
        int i12 = 0;
        if (!(list instanceof zzne)) {
            if (!z11) {
                while (i12 < list.size()) {
                    this.zza.zzj(i11, ((Integer) list.get(i12)).intValue());
                    i12++;
                }
                return;
            }
            this.zza.zzr(i11, 2);
            int iZzB = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                iZzB += zzln.zzB(((Integer) list.get(i13)).intValue());
            }
            this.zza.zzt(iZzB);
            while (i12 < list.size()) {
                this.zza.zzk(((Integer) list.get(i12)).intValue());
                i12++;
            }
            return;
        }
        zzne zzneVar = (zzne) list;
        if (!z11) {
            while (i12 < zzneVar.size()) {
                this.zza.zzj(i11, zzneVar.zze(i12));
                i12++;
            }
            return;
        }
        this.zza.zzr(i11, 2);
        int iZzB2 = 0;
        for (int i14 = 0; i14 < zzneVar.size(); i14++) {
            iZzB2 += zzln.zzB(zzneVar.zze(i14));
        }
        this.zza.zzt(iZzB2);
        while (i12 < zzneVar.size()) {
            this.zza.zzk(zzneVar.zze(i12));
            i12++;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzpy
    public final void zzk(int i11, int i12) {
        this.zza.zzf(i11, i12);
    }

    @Override // com.google.android.recaptcha.internal.zzpy
    public final void zzl(int i11, List list, boolean z11) {
        int i12 = 0;
        if (!(list instanceof zzne)) {
            if (!z11) {
                while (i12 < list.size()) {
                    this.zza.zzf(i11, ((Integer) list.get(i12)).intValue());
                    i12++;
                }
                return;
            }
            this.zza.zzr(i11, 2);
            int i13 = 0;
            for (int i14 = 0; i14 < list.size(); i14++) {
                ((Integer) list.get(i14)).getClass();
                i13 += 4;
            }
            this.zza.zzt(i13);
            while (i12 < list.size()) {
                this.zza.zzg(((Integer) list.get(i12)).intValue());
                i12++;
            }
            return;
        }
        zzne zzneVar = (zzne) list;
        if (!z11) {
            while (i12 < zzneVar.size()) {
                this.zza.zzf(i11, zzneVar.zze(i12));
                i12++;
            }
            return;
        }
        this.zza.zzr(i11, 2);
        int i15 = 0;
        for (int i16 = 0; i16 < zzneVar.size(); i16++) {
            zzneVar.zze(i16);
            i15 += 4;
        }
        this.zza.zzt(i15);
        while (i12 < zzneVar.size()) {
            this.zza.zzg(zzneVar.zze(i12));
            i12++;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzpy
    public final void zzm(int i11, long j11) {
        this.zza.zzh(i11, j11);
    }

    @Override // com.google.android.recaptcha.internal.zzpy
    public final void zzn(int i11, List list, boolean z11) {
        int i12 = 0;
        if (!(list instanceof zznx)) {
            if (!z11) {
                while (i12 < list.size()) {
                    this.zza.zzh(i11, ((Long) list.get(i12)).longValue());
                    i12++;
                }
                return;
            }
            this.zza.zzr(i11, 2);
            int i13 = 0;
            for (int i14 = 0; i14 < list.size(); i14++) {
                ((Long) list.get(i14)).getClass();
                i13 += 8;
            }
            this.zza.zzt(i13);
            while (i12 < list.size()) {
                this.zza.zzi(((Long) list.get(i12)).longValue());
                i12++;
            }
            return;
        }
        zznx zznxVar = (zznx) list;
        if (!z11) {
            while (i12 < zznxVar.size()) {
                this.zza.zzh(i11, zznxVar.zze(i12));
                i12++;
            }
            return;
        }
        this.zza.zzr(i11, 2);
        int i15 = 0;
        for (int i16 = 0; i16 < zznxVar.size(); i16++) {
            zznxVar.zze(i16);
            i15 += 8;
        }
        this.zza.zzt(i15);
        while (i12 < zznxVar.size()) {
            this.zza.zzi(zznxVar.zze(i12));
            i12++;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzpy
    public final void zzo(int i11, float f5) {
        this.zza.zzf(i11, Float.floatToRawIntBits(f5));
    }

    @Override // com.google.android.recaptcha.internal.zzpy
    public final void zzp(int i11, List list, boolean z11) {
        int i12 = 0;
        if (!(list instanceof zzmv)) {
            if (!z11) {
                while (i12 < list.size()) {
                    this.zza.zzf(i11, Float.floatToRawIntBits(((Float) list.get(i12)).floatValue()));
                    i12++;
                }
                return;
            }
            this.zza.zzr(i11, 2);
            int i13 = 0;
            for (int i14 = 0; i14 < list.size(); i14++) {
                ((Float) list.get(i14)).getClass();
                i13 += 4;
            }
            this.zza.zzt(i13);
            while (i12 < list.size()) {
                this.zza.zzg(Float.floatToRawIntBits(((Float) list.get(i12)).floatValue()));
                i12++;
            }
            return;
        }
        zzmv zzmvVar = (zzmv) list;
        if (!z11) {
            while (i12 < zzmvVar.size()) {
                this.zza.zzf(i11, Float.floatToRawIntBits(zzmvVar.zze(i12)));
                i12++;
            }
            return;
        }
        this.zza.zzr(i11, 2);
        int i15 = 0;
        for (int i16 = 0; i16 < zzmvVar.size(); i16++) {
            zzmvVar.zze(i16);
            i15 += 4;
        }
        this.zza.zzt(i15);
        while (i12 < zzmvVar.size()) {
            this.zza.zzg(Float.floatToRawIntBits(zzmvVar.zze(i12)));
            i12++;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzpy
    public final void zzq(int i11, Object obj, zzow zzowVar) {
        zzln zzlnVar = this.zza;
        zzlnVar.zzr(i11, 3);
        zzowVar.zzj((zzoi) obj, zzlnVar.zza);
        zzlnVar.zzr(i11, 4);
    }

    @Override // com.google.android.recaptcha.internal.zzpy
    public final void zzr(int i11, int i12) {
        this.zza.zzj(i11, i12);
    }

    @Override // com.google.android.recaptcha.internal.zzpy
    public final void zzs(int i11, List list, boolean z11) {
        int i12 = 0;
        if (!(list instanceof zzne)) {
            if (!z11) {
                while (i12 < list.size()) {
                    this.zza.zzj(i11, ((Integer) list.get(i12)).intValue());
                    i12++;
                }
                return;
            }
            this.zza.zzr(i11, 2);
            int iZzB = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                iZzB += zzln.zzB(((Integer) list.get(i13)).intValue());
            }
            this.zza.zzt(iZzB);
            while (i12 < list.size()) {
                this.zza.zzk(((Integer) list.get(i12)).intValue());
                i12++;
            }
            return;
        }
        zzne zzneVar = (zzne) list;
        if (!z11) {
            while (i12 < zzneVar.size()) {
                this.zza.zzj(i11, zzneVar.zze(i12));
                i12++;
            }
            return;
        }
        this.zza.zzr(i11, 2);
        int iZzB2 = 0;
        for (int i14 = 0; i14 < zzneVar.size(); i14++) {
            iZzB2 += zzln.zzB(zzneVar.zze(i14));
        }
        this.zza.zzt(iZzB2);
        while (i12 < zzneVar.size()) {
            this.zza.zzk(zzneVar.zze(i12));
            i12++;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzpy
    public final void zzt(int i11, long j11) {
        this.zza.zzu(i11, j11);
    }

    @Override // com.google.android.recaptcha.internal.zzpy
    public final void zzu(int i11, List list, boolean z11) {
        int i12 = 0;
        if (!(list instanceof zznx)) {
            if (!z11) {
                while (i12 < list.size()) {
                    this.zza.zzu(i11, ((Long) list.get(i12)).longValue());
                    i12++;
                }
                return;
            }
            this.zza.zzr(i11, 2);
            int iZzB = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                iZzB += zzln.zzB(((Long) list.get(i13)).longValue());
            }
            this.zza.zzt(iZzB);
            while (i12 < list.size()) {
                this.zza.zzv(((Long) list.get(i12)).longValue());
                i12++;
            }
            return;
        }
        zznx zznxVar = (zznx) list;
        if (!z11) {
            while (i12 < zznxVar.size()) {
                this.zza.zzu(i11, zznxVar.zze(i12));
                i12++;
            }
            return;
        }
        this.zza.zzr(i11, 2);
        int iZzB2 = 0;
        for (int i14 = 0; i14 < zznxVar.size(); i14++) {
            iZzB2 += zzln.zzB(zznxVar.zze(i14));
        }
        this.zza.zzt(iZzB2);
        while (i12 < zznxVar.size()) {
            this.zza.zzv(zznxVar.zze(i12));
            i12++;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzpy
    public final void zzv(int i11, Object obj, zzow zzowVar) {
        this.zza.zzm(i11, (zzoi) obj, zzowVar);
    }

    @Override // com.google.android.recaptcha.internal.zzpy
    public final void zzw(int i11, Object obj) {
        if (obj instanceof zzle) {
            this.zza.zzo(i11, (zzle) obj);
        } else {
            this.zza.zzn(i11, (zzoi) obj);
        }
    }

    @Override // com.google.android.recaptcha.internal.zzpy
    public final void zzx(int i11, int i12) {
        this.zza.zzf(i11, i12);
    }

    @Override // com.google.android.recaptcha.internal.zzpy
    public final void zzy(int i11, List list, boolean z11) {
        int i12 = 0;
        if (!(list instanceof zzne)) {
            if (!z11) {
                while (i12 < list.size()) {
                    this.zza.zzf(i11, ((Integer) list.get(i12)).intValue());
                    i12++;
                }
                return;
            }
            this.zza.zzr(i11, 2);
            int i13 = 0;
            for (int i14 = 0; i14 < list.size(); i14++) {
                ((Integer) list.get(i14)).getClass();
                i13 += 4;
            }
            this.zza.zzt(i13);
            while (i12 < list.size()) {
                this.zza.zzg(((Integer) list.get(i12)).intValue());
                i12++;
            }
            return;
        }
        zzne zzneVar = (zzne) list;
        if (!z11) {
            while (i12 < zzneVar.size()) {
                this.zza.zzf(i11, zzneVar.zze(i12));
                i12++;
            }
            return;
        }
        this.zza.zzr(i11, 2);
        int i15 = 0;
        for (int i16 = 0; i16 < zzneVar.size(); i16++) {
            zzneVar.zze(i16);
            i15 += 4;
        }
        this.zza.zzt(i15);
        while (i12 < zzneVar.size()) {
            this.zza.zzg(zzneVar.zze(i12));
            i12++;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzpy
    public final void zzz(int i11, long j11) {
        this.zza.zzh(i11, j11);
    }
}
