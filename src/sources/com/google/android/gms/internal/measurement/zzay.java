package com.google.android.gms.internal.measurement;

import b7.e0;
import com.tbruyelle.rxpermissions3.BuildConfig;
import ep.a;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzay extends zzav {
    public zzay() {
        this.f11459a.add(zzbk.APPLY);
        this.f11459a.add(zzbk.BLOCK);
        this.f11459a.add(zzbk.BREAK);
        this.f11459a.add(zzbk.CASE);
        this.f11459a.add(zzbk.DEFAULT);
        this.f11459a.add(zzbk.CONTINUE);
        this.f11459a.add(zzbk.DEFINE_FUNCTION);
        this.f11459a.add(zzbk.FN);
        this.f11459a.add(zzbk.IF);
        this.f11459a.add(zzbk.QUOTE);
        this.f11459a.add(zzbk.RETURN);
        this.f11459a.add(zzbk.SWITCH);
        this.f11459a.add(zzbk.TERNARY);
    }

    public static zzan c(zzg zzgVar, List list) {
        zzh.b(2, zzbk.FN.name(), list);
        zzao zzaoVarB = zzgVar.f11600b.b(zzgVar, (zzao) list.get(0));
        zzao zzaoVarB2 = zzgVar.f11600b.b(zzgVar, (zzao) list.get(1));
        if (!(zzaoVarB2 instanceof zzae)) {
            throw new IllegalArgumentException(a.e("FN requires an ArrayValue of parameter names found ", zzaoVarB2.getClass().getCanonicalName()));
        }
        List listJ = ((zzae) zzaoVarB2).j();
        List arrayList = new ArrayList();
        if (list.size() > 2) {
            arrayList = list.subList(2, list.size());
        }
        return new zzan(zzaoVarB.zzc(), (ArrayList) listJ, arrayList, zzgVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzav
    public final zzao a(String str, zzg zzgVar, ArrayList arrayList) {
        zzbk zzbkVar = zzbk.ADD;
        int iOrdinal = zzh.e(str).ordinal();
        if (iOrdinal == 2) {
            zzao zzaoVar = (zzao) e0.j(zzbk.APPLY, 3, arrayList, 0);
            zzaw zzawVar = zzgVar.f11600b;
            zzaw zzawVar2 = zzgVar.f11600b;
            zzao zzaoVarB = zzawVar.b(zzgVar, zzaoVar);
            String strZzc = zzawVar2.b(zzgVar, (zzao) arrayList.get(1)).zzc();
            zzao zzaoVarB2 = zzawVar2.b(zzgVar, (zzao) arrayList.get(2));
            if (!(zzaoVarB2 instanceof zzae)) {
                throw new IllegalArgumentException(a.e("Function arguments for Apply are not a list found ", zzaoVarB2.getClass().getCanonicalName()));
            }
            if (strZzc.isEmpty()) {
                throw new IllegalArgumentException("Function name for apply is undefined");
            }
            return zzaoVarB.g(strZzc, zzgVar, (ArrayList) ((zzae) zzaoVarB2).j());
        }
        if (iOrdinal == 15) {
            zzh.a(0, zzbk.BREAK.name(), arrayList);
            return zzao.f11447l;
        }
        if (iOrdinal == 25) {
            return c(zzgVar, arrayList);
        }
        if (iOrdinal == 41) {
            zzh.b(2, zzbk.IF.name(), arrayList);
            zzao zzaoVar2 = (zzao) arrayList.get(0);
            zzaw zzawVar3 = zzgVar.f11600b;
            zzaw zzawVar4 = zzgVar.f11600b;
            zzao zzaoVarB3 = zzawVar3.b(zzgVar, zzaoVar2);
            zzao zzaoVarB4 = zzawVar4.b(zzgVar, (zzao) arrayList.get(1));
            zzao zzaoVarB5 = arrayList.size() > 2 ? zzawVar4.b(zzgVar, (zzao) arrayList.get(2)) : null;
            zzao zzaoVar3 = zzao.f11445j;
            zzao zzaoVarB6 = zzaoVarB3.zze().booleanValue() ? zzgVar.b((zzae) zzaoVarB4) : zzaoVarB5 != null ? zzgVar.b((zzae) zzaoVarB5) : zzaoVar3;
            return true != (zzaoVarB6 instanceof zzag) ? zzaoVar3 : zzaoVarB6;
        }
        if (iOrdinal == 54) {
            return new zzae(arrayList);
        }
        if (iOrdinal == 57) {
            if (arrayList.isEmpty()) {
                return zzao.f11448n;
            }
            return new zzag("return", zzgVar.f11600b.b(zzgVar, (zzao) e0.j(zzbk.RETURN, 1, arrayList, 0)));
        }
        if (iOrdinal != 19) {
            if (iOrdinal == 20) {
                zzh.b(2, zzbk.DEFINE_FUNCTION.name(), arrayList);
                zzan zzanVarC = c(zzgVar, arrayList);
                String str2 = zzanVarC.f11406a;
                if (str2 == null) {
                    zzgVar.e(BuildConfig.VERSION_NAME, zzanVarC);
                    return zzanVarC;
                }
                zzgVar.e(str2, zzanVarC);
                return zzanVarC;
            }
            if (iOrdinal == 60) {
                zzao zzaoVar4 = (zzao) e0.j(zzbk.SWITCH, 3, arrayList, 0);
                zzaw zzawVar5 = zzgVar.f11600b;
                zzaw zzawVar6 = zzgVar.f11600b;
                zzao zzaoVarB7 = zzawVar5.b(zzgVar, zzaoVar4);
                zzao zzaoVarB8 = zzawVar6.b(zzgVar, (zzao) arrayList.get(1));
                zzao zzaoVarB9 = zzawVar6.b(zzgVar, (zzao) arrayList.get(2));
                if (!(zzaoVarB8 instanceof zzae)) {
                    throw new IllegalArgumentException("Malformed SWITCH statement, cases are not a list");
                }
                if (!(zzaoVarB9 instanceof zzae)) {
                    throw new IllegalArgumentException("Malformed SWITCH statement, case statements are not a list");
                }
                zzae zzaeVar = (zzae) zzaoVarB8;
                zzae zzaeVar2 = (zzae) zzaoVarB9;
                boolean z11 = false;
                for (int i11 = 0; i11 < zzaeVar.l(); i11++) {
                    if (z11 || zzaoVarB7.equals(zzawVar6.b(zzgVar, zzaeVar.m(i11)))) {
                        zzao zzaoVarB10 = zzawVar6.b(zzgVar, zzaeVar2.m(i11));
                        if (zzaoVarB10 instanceof zzag) {
                            return ((zzag) zzaoVarB10).f11344b.equals("break") ? zzao.f11445j : zzaoVarB10;
                        }
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                }
                if (zzaeVar.l() + 1 == zzaeVar2.l()) {
                    zzao zzaoVarB11 = zzawVar6.b(zzgVar, zzaeVar2.m(zzaeVar.l()));
                    if (zzaoVarB11 instanceof zzag) {
                        String str3 = ((zzag) zzaoVarB11).f11344b;
                        if (str3.equals("return") || str3.equals("continue")) {
                            return zzaoVarB11;
                        }
                    }
                }
                return zzao.f11445j;
            }
            if (iOrdinal == 61) {
                zzao zzaoVar5 = (zzao) e0.j(zzbk.TERNARY, 3, arrayList, 0);
                zzaw zzawVar7 = zzgVar.f11600b;
                zzaw zzawVar8 = zzgVar.f11600b;
                return zzawVar7.b(zzgVar, zzaoVar5).zze().booleanValue() ? zzawVar8.b(zzgVar, (zzao) arrayList.get(1)) : zzawVar8.b(zzgVar, (zzao) arrayList.get(2));
            }
            switch (iOrdinal) {
                case 11:
                    return zzgVar.c().b(new zzae(arrayList));
                case 12:
                    zzh.a(0, zzbk.BREAK.name(), arrayList);
                    return zzao.m;
                case 13:
                    break;
                default:
                    b(str);
                    throw null;
            }
        }
        if (arrayList.isEmpty()) {
            return zzao.f11445j;
        }
        zzao zzaoVarB12 = zzgVar.f11600b.b(zzgVar, (zzao) arrayList.get(0));
        return zzaoVarB12 instanceof zzae ? zzgVar.b((zzae) zzaoVarB12) : zzao.f11445j;
    }
}
