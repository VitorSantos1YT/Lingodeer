package com.google.android.gms.internal.measurement;

import b7.e0;
import defpackage.e;
import ep.a;
import java.util.ArrayList;
import nv.p;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzbj extends zzav {
    public zzbj() {
        this.f11459a.add(zzbk.ASSIGN);
        this.f11459a.add(zzbk.CONST);
        this.f11459a.add(zzbk.CREATE_ARRAY);
        this.f11459a.add(zzbk.CREATE_OBJECT);
        this.f11459a.add(zzbk.EXPRESSION_LIST);
        this.f11459a.add(zzbk.GET);
        this.f11459a.add(zzbk.GET_INDEX);
        this.f11459a.add(zzbk.GET_PROPERTY);
        this.f11459a.add(zzbk.NULL);
        this.f11459a.add(zzbk.SET_PROPERTY);
        this.f11459a.add(zzbk.TYPEOF);
        this.f11459a.add(zzbk.UNDEFINED);
        this.f11459a.add(zzbk.VAR);
    }

    @Override // com.google.android.gms.internal.measurement.zzav
    public final zzao a(String str, zzg zzgVar, ArrayList arrayList) {
        String str2;
        zzbk zzbkVar = zzbk.ADD;
        int iOrdinal = zzh.e(str).ordinal();
        int i11 = 0;
        if (iOrdinal == 3) {
            zzao zzaoVarB = zzgVar.f11600b.b(zzgVar, (zzao) e0.j(zzbk.ASSIGN, 2, arrayList, 0));
            if (!(zzaoVarB instanceof zzas)) {
                throw new IllegalArgumentException(a.e("Expected string for assign var. got ", zzaoVarB.getClass().getCanonicalName()));
            }
            String str3 = ((zzas) zzaoVarB).f11458a;
            if (!zzgVar.d(str3)) {
                throw new IllegalArgumentException(a.e("Attempting to assign undefined value ", str3));
            }
            zzao zzaoVarB2 = zzgVar.f11600b.b(zzgVar, (zzao) arrayList.get(1));
            zzgVar.e(str3, zzaoVarB2);
            return zzaoVarB2;
        }
        if (iOrdinal == 14) {
            zzh.b(2, zzbk.CONST.name(), arrayList);
            if (arrayList.size() % 2 != 0) {
                throw new IllegalArgumentException(p.j(arrayList.size(), "CONST requires an even number of arguments, found "));
            }
            while (i11 < arrayList.size() - 1) {
                zzao zzaoVarB3 = zzgVar.f11600b.b(zzgVar, (zzao) arrayList.get(i11));
                if (!(zzaoVarB3 instanceof zzas)) {
                    throw new IllegalArgumentException(a.e("Expected string for const name. got ", zzaoVarB3.getClass().getCanonicalName()));
                }
                String str4 = ((zzas) zzaoVarB3).f11458a;
                zzgVar.f(str4, zzgVar.f11600b.b(zzgVar, (zzao) arrayList.get(i11 + 1)));
                zzgVar.f11602d.put(str4, Boolean.TRUE);
                i11 += 2;
            }
            return zzao.f11445j;
        }
        if (iOrdinal == 24) {
            zzh.b(1, zzbk.EXPRESSION_LIST.name(), arrayList);
            zzao zzaoVarB4 = zzao.f11445j;
            while (i11 < arrayList.size()) {
                zzaoVarB4 = zzgVar.f11600b.b(zzgVar, (zzao) arrayList.get(i11));
                if (zzaoVarB4 instanceof zzag) {
                    throw new IllegalStateException("ControlValue cannot be in an expression list");
                }
                i11++;
            }
            return zzaoVarB4;
        }
        if (iOrdinal == 33) {
            zzao zzaoVarB5 = zzgVar.f11600b.b(zzgVar, (zzao) e0.j(zzbk.GET, 1, arrayList, 0));
            if (zzaoVarB5 instanceof zzas) {
                return zzgVar.g(((zzas) zzaoVarB5).f11458a);
            }
            throw new IllegalArgumentException(a.e("Expected string for get var. got ", zzaoVarB5.getClass().getCanonicalName()));
        }
        if (iOrdinal == 49) {
            zzh.a(0, zzbk.NULL.name(), arrayList);
            return zzao.f11446k;
        }
        if (iOrdinal == 58) {
            zzao zzaoVar = (zzao) e0.j(zzbk.SET_PROPERTY, 3, arrayList, 0);
            zzaw zzawVar = zzgVar.f11600b;
            zzaw zzawVar2 = zzgVar.f11600b;
            zzao zzaoVarB6 = zzawVar.b(zzgVar, zzaoVar);
            zzao zzaoVarB7 = zzawVar2.b(zzgVar, (zzao) arrayList.get(1));
            zzao zzaoVarB8 = zzawVar2.b(zzgVar, (zzao) arrayList.get(2));
            if (zzaoVarB6 == zzao.f11445j || zzaoVarB6 == zzao.f11446k) {
                throw new IllegalStateException(e.n("Can't set property ", zzaoVarB7.zzc(), " of ", zzaoVarB6.zzc()));
            }
            if ((zzaoVarB6 instanceof zzae) && (zzaoVarB7 instanceof zzah)) {
                ((zzae) zzaoVarB6).n(((zzah) zzaoVarB7).f11371a.intValue(), zzaoVarB8);
                return zzaoVarB8;
            }
            if (!(zzaoVarB6 instanceof zzak)) {
                return zzaoVarB8;
            }
            ((zzak) zzaoVarB6).e(zzaoVarB7.zzc(), zzaoVarB8);
            return zzaoVarB8;
        }
        if (iOrdinal == 17) {
            if (arrayList.isEmpty()) {
                return new zzae();
            }
            zzae zzaeVar = new zzae();
            int size = arrayList.size();
            int i12 = 0;
            while (i12 < size) {
                Object obj = arrayList.get(i12);
                i12++;
                zzao zzaoVarB9 = zzgVar.f11600b.b(zzgVar, (zzao) obj);
                if (zzaoVarB9 instanceof zzag) {
                    throw new IllegalStateException("Failed to evaluate array element");
                }
                zzaeVar.n(i11, zzaoVarB9);
                i11++;
            }
            return zzaeVar;
        }
        if (iOrdinal == 18) {
            if (arrayList.isEmpty()) {
                return new zzal();
            }
            if (arrayList.size() % 2 != 0) {
                throw new IllegalArgumentException(p.j(arrayList.size(), "CREATE_OBJECT requires an even number of arguments, found "));
            }
            zzal zzalVar = new zzal();
            while (i11 < arrayList.size() - 1) {
                zzao zzaoVarB10 = zzgVar.f11600b.b(zzgVar, (zzao) arrayList.get(i11));
                zzao zzaoVarB11 = zzgVar.f11600b.b(zzgVar, (zzao) arrayList.get(i11 + 1));
                if ((zzaoVarB10 instanceof zzag) || (zzaoVarB11 instanceof zzag)) {
                    throw new IllegalStateException("Failed to evaluate map entry");
                }
                zzalVar.e(zzaoVarB10.zzc(), zzaoVarB11);
                i11 += 2;
            }
            return zzalVar;
        }
        if (iOrdinal == 35 || iOrdinal == 36) {
            zzao zzaoVarB12 = zzgVar.f11600b.b(zzgVar, (zzao) e0.j(zzbk.GET_PROPERTY, 2, arrayList, 0));
            zzao zzaoVarB13 = zzgVar.f11600b.b(zzgVar, (zzao) arrayList.get(1));
            if ((zzaoVarB12 instanceof zzae) && zzh.d(zzaoVarB13)) {
                return ((zzae) zzaoVarB12).m(zzaoVarB13.zzd().intValue());
            }
            if (zzaoVarB12 instanceof zzak) {
                return ((zzak) zzaoVarB12).d(zzaoVarB13.zzc());
            }
            if (zzaoVarB12 instanceof zzas) {
                if ("length".equals(zzaoVarB13.zzc())) {
                    return new zzah(Double.valueOf(((zzas) zzaoVarB12).f11458a.length()));
                }
                if (zzh.d(zzaoVarB13)) {
                    double dDoubleValue = zzaoVarB13.zzd().doubleValue();
                    String str5 = ((zzas) zzaoVarB12).f11458a;
                    if (dDoubleValue < str5.length()) {
                        return new zzas(String.valueOf(str5.charAt(zzaoVarB13.zzd().intValue())));
                    }
                }
            }
            return zzao.f11445j;
        }
        switch (iOrdinal) {
            case 62:
                zzao zzaoVarB14 = zzgVar.f11600b.b(zzgVar, (zzao) e0.j(zzbk.TYPEOF, 1, arrayList, 0));
                if (zzaoVarB14 instanceof zzat) {
                    str2 = "undefined";
                } else if (zzaoVarB14 instanceof zzaf) {
                    str2 = "boolean";
                } else if (zzaoVarB14 instanceof zzah) {
                    str2 = "number";
                } else if (zzaoVarB14 instanceof zzas) {
                    str2 = "string";
                } else if (zzaoVarB14 instanceof zzan) {
                    str2 = "function";
                } else {
                    if ((zzaoVarB14 instanceof zzap) || (zzaoVarB14 instanceof zzag)) {
                        throw new IllegalArgumentException(String.format("Unsupported value type %s in typeof", zzaoVarB14));
                    }
                    str2 = "object";
                }
                return new zzas(str2);
            case 63:
                zzh.a(0, zzbk.UNDEFINED.name(), arrayList);
                return zzao.f11445j;
            case 64:
                zzh.b(1, zzbk.VAR.name(), arrayList);
                int size2 = arrayList.size();
                while (i11 < size2) {
                    Object obj2 = arrayList.get(i11);
                    i11++;
                    zzao zzaoVarB15 = zzgVar.f11600b.b(zzgVar, (zzao) obj2);
                    if (!(zzaoVarB15 instanceof zzas)) {
                        throw new IllegalArgumentException(a.e("Expected string for var name. got ", zzaoVarB15.getClass().getCanonicalName()));
                    }
                    zzgVar.f(((zzas) zzaoVarB15).f11458a, zzao.f11445j);
                }
                return zzao.f11445j;
            default:
                b(str);
                throw null;
        }
    }
}
