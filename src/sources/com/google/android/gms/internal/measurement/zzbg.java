package com.google.android.gms.internal.measurement;

import b7.e0;
import com.google.api.Service;
import com.stkouyu.util.httputil.Consts;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzbg extends zzav {
    public zzbg() {
        this.f11459a.add(zzbk.FOR_IN);
        this.f11459a.add(zzbk.FOR_IN_CONST);
        this.f11459a.add(zzbk.FOR_IN_LET);
        this.f11459a.add(zzbk.FOR_LET);
        this.f11459a.add(zzbk.FOR_OF);
        this.f11459a.add(zzbk.FOR_OF_CONST);
        this.f11459a.add(zzbk.FOR_OF_LET);
        this.f11459a.add(zzbk.WHILE);
    }

    public static zzao c(zzbe zzbeVar, zzao zzaoVar, zzao zzaoVar2) {
        if (zzaoVar instanceof Iterable) {
            return d(zzbeVar, ((Iterable) zzaoVar).iterator(), zzaoVar2);
        }
        throw new IllegalArgumentException("Non-iterable type in for...of loop.");
    }

    public static zzao d(zzbe zzbeVar, Iterator it, zzao zzaoVar) {
        if (it != null) {
            while (it.hasNext()) {
                zzao zzaoVarB = zzbeVar.a((zzao) it.next()).b((zzae) zzaoVar);
                if (zzaoVarB instanceof zzag) {
                    zzag zzagVar = (zzag) zzaoVarB;
                    String str = zzagVar.f11344b;
                    if ("break".equals(str)) {
                        return zzao.f11445j;
                    }
                    if ("return".equals(str)) {
                        return zzagVar;
                    }
                }
            }
        }
        return zzao.f11445j;
    }

    @Override // com.google.android.gms.internal.measurement.zzav
    public final zzao a(String str, zzg zzgVar, ArrayList arrayList) {
        zzbk zzbkVar = zzbk.ADD;
        int iOrdinal = zzh.e(str).ordinal();
        if (iOrdinal == 65) {
            zzao zzaoVar = (zzao) e0.j(zzbk.WHILE, 4, arrayList, 0);
            zzao zzaoVar2 = (zzao) arrayList.get(1);
            zzao zzaoVar3 = (zzao) arrayList.get(2);
            zzao zzaoVar4 = (zzao) arrayList.get(3);
            zzaw zzawVar = zzgVar.f11600b;
            zzaw zzawVar2 = zzgVar.f11600b;
            zzao zzaoVarB = zzawVar.b(zzgVar, zzaoVar4);
            if (zzawVar2.b(zzgVar, zzaoVar3).zze().booleanValue()) {
                zzao zzaoVarB2 = zzgVar.b((zzae) zzaoVarB);
                if (zzaoVarB2 instanceof zzag) {
                    zzag zzagVar = (zzag) zzaoVarB2;
                    String str2 = zzagVar.f11344b;
                    if ("break".equals(str2)) {
                        return zzao.f11445j;
                    }
                    if ("return".equals(str2)) {
                        return zzagVar;
                    }
                }
            }
            while (zzawVar2.b(zzgVar, zzaoVar).zze().booleanValue()) {
                zzao zzaoVarB3 = zzgVar.b((zzae) zzaoVarB);
                if (zzaoVarB3 instanceof zzag) {
                    zzag zzagVar2 = (zzag) zzaoVarB3;
                    String str3 = zzagVar2.f11344b;
                    if ("break".equals(str3)) {
                        return zzao.f11445j;
                    }
                    if ("return".equals(str3)) {
                        return zzagVar2;
                    }
                }
                zzgVar.a(zzaoVar2);
            }
            return zzao.f11445j;
        }
        switch (iOrdinal) {
            case Service.BILLING_FIELD_NUMBER /* 26 */:
                if (!(e0.j(zzbk.FOR_IN, 3, arrayList, 0) instanceof zzas)) {
                    throw new IllegalArgumentException("Variable name in FOR_IN must be a string");
                }
                return d(new zzbf(zzgVar, ((zzao) arrayList.get(0)).zzc()), zzgVar.f11600b.b(zzgVar, (zzao) arrayList.get(1)).zzf(), zzgVar.f11600b.b(zzgVar, (zzao) arrayList.get(2)));
            case 27:
                if (!(e0.j(zzbk.FOR_IN_CONST, 3, arrayList, 0) instanceof zzas)) {
                    throw new IllegalArgumentException("Variable name in FOR_IN_CONST must be a string");
                }
                return d(new zzbc(zzgVar, ((zzao) arrayList.get(0)).zzc()), zzgVar.f11600b.b(zzgVar, (zzao) arrayList.get(1)).zzf(), zzgVar.f11600b.b(zzgVar, (zzao) arrayList.get(2)));
            case Service.MONITORING_FIELD_NUMBER /* 28 */:
                if (!(e0.j(zzbk.FOR_IN_LET, 3, arrayList, 0) instanceof zzas)) {
                    throw new IllegalArgumentException("Variable name in FOR_IN_LET must be a string");
                }
                return d(new zzbd(zzgVar, ((zzao) arrayList.get(0)).zzc()), zzgVar.f11600b.b(zzgVar, (zzao) arrayList.get(1)).zzf(), zzgVar.f11600b.b(zzgVar, (zzao) arrayList.get(2)));
            case Service.SYSTEM_PARAMETERS_FIELD_NUMBER /* 29 */:
                zzao zzaoVar5 = (zzao) e0.j(zzbk.FOR_LET, 4, arrayList, 0);
                zzaw zzawVar3 = zzgVar.f11600b;
                zzaw zzawVar4 = zzgVar.f11600b;
                zzao zzaoVarB4 = zzawVar3.b(zzgVar, zzaoVar5);
                if (!(zzaoVarB4 instanceof zzae)) {
                    throw new IllegalArgumentException("Initializer variables in FOR_LET must be an ArrayList");
                }
                zzae zzaeVar = (zzae) zzaoVarB4;
                zzao zzaoVar6 = (zzao) arrayList.get(1);
                zzao zzaoVar7 = (zzao) arrayList.get(2);
                zzao zzaoVarB5 = zzawVar4.b(zzgVar, (zzao) arrayList.get(3));
                zzg zzgVarC = zzgVar.c();
                for (int i11 = 0; i11 < zzaeVar.l(); i11++) {
                    String strZzc = zzaeVar.m(i11).zzc();
                    zzgVarC.e(strZzc, zzgVar.g(strZzc));
                }
                while (zzawVar4.b(zzgVar, zzaoVar6).zze().booleanValue()) {
                    zzao zzaoVarB6 = zzgVar.b((zzae) zzaoVarB5);
                    if (zzaoVarB6 instanceof zzag) {
                        zzag zzagVar3 = (zzag) zzaoVarB6;
                        String str4 = zzagVar3.f11344b;
                        if ("break".equals(str4)) {
                            return zzao.f11445j;
                        }
                        if ("return".equals(str4)) {
                            return zzagVar3;
                        }
                    }
                    zzg zzgVarC2 = zzgVar.c();
                    for (int i12 = 0; i12 < zzaeVar.l(); i12++) {
                        String strZzc2 = zzaeVar.m(i12).zzc();
                        zzgVarC2.e(strZzc2, zzgVarC.g(strZzc2));
                    }
                    zzgVarC2.a(zzaoVar7);
                    zzgVarC = zzgVarC2;
                }
                return zzao.f11445j;
            case 30:
                if (!(e0.j(zzbk.FOR_OF, 3, arrayList, 0) instanceof zzas)) {
                    throw new IllegalArgumentException("Variable name in FOR_OF must be a string");
                }
                return c(new zzbf(zzgVar, ((zzao) arrayList.get(0)).zzc()), zzgVar.f11600b.b(zzgVar, (zzao) arrayList.get(1)), zzgVar.f11600b.b(zzgVar, (zzao) arrayList.get(2)));
            case 31:
                if (!(e0.j(zzbk.FOR_OF_CONST, 3, arrayList, 0) instanceof zzas)) {
                    throw new IllegalArgumentException("Variable name in FOR_OF_CONST must be a string");
                }
                return c(new zzbc(zzgVar, ((zzao) arrayList.get(0)).zzc()), zzgVar.f11600b.b(zzgVar, (zzao) arrayList.get(1)), zzgVar.f11600b.b(zzgVar, (zzao) arrayList.get(2)));
            case Consts.SP /* 32 */:
                if (!(e0.j(zzbk.FOR_OF_LET, 3, arrayList, 0) instanceof zzas)) {
                    throw new IllegalArgumentException("Variable name in FOR_OF_LET must be a string");
                }
                return c(new zzbd(zzgVar, ((zzao) arrayList.get(0)).zzc()), zzgVar.f11600b.b(zzgVar, (zzao) arrayList.get(1)), zzgVar.f11600b.b(zzgVar, (zzao) arrayList.get(2)));
            default:
                b(str);
                throw null;
        }
    }
}
