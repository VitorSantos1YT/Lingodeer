package com.google.android.gms.internal.measurement;

import androidx.drawerlayout.widget.ktFt.FpIL;
import com.tbruyelle.rxpermissions3.BuildConfig;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import nv.p;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzas implements Iterable, zzao {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11458a;

    public zzas(String str) {
        if (str == null) {
            throw new IllegalArgumentException("StringValue cannot be null.");
        }
        this.f11458a = str;
    }

    @Override // com.google.android.gms.internal.measurement.zzao
    public final zzao b() {
        return new zzas(this.f11458a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzas) {
            return this.f11458a.equals(((zzas) obj).f11458a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f11458a.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new zzar(this);
    }

    public final String toString() {
        String str = this.f11458a;
        return p.u(new StringBuilder(str.length() + 2), "\"", str, "\"");
    }

    @Override // com.google.android.gms.internal.measurement.zzao
    public final String zzc() {
        return this.f11458a;
    }

    @Override // com.google.android.gms.internal.measurement.zzao
    public final Double zzd() {
        String str = this.f11458a;
        if (str.isEmpty()) {
            return Double.valueOf(0.0d);
        }
        try {
            return Double.valueOf(str);
        } catch (NumberFormatException unused) {
            return Double.valueOf(Double.NaN);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzao
    public final Boolean zze() {
        return Boolean.valueOf(!this.f11458a.isEmpty());
    }

    @Override // com.google.android.gms.internal.measurement.zzao
    public final Iterator zzf() {
        return new zzaq(this);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:104:0x02dc A[PHI: r7
      0x02dc: PHI (r7v6 boolean) = (r7v13 boolean), (r7v14 boolean), (r7v17 boolean) binds: [B:100:0x02c8, B:101:0x02ca, B:103:0x02da] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.measurement.zzao
    public final zzao g(String str, zzg zzgVar, ArrayList arrayList) {
        String str2;
        int i11;
        int i12;
        int i13;
        boolean zIsEmpty;
        zzg zzgVar2;
        boolean zEquals = "charAt".equals(str);
        String str3 = FpIL.GymVKqcoNlVg;
        if (zEquals || "concat".equals(str) || "hasOwnProperty".equals(str) || "indexOf".equals(str) || "lastIndexOf".equals(str) || "match".equals(str) || "replace".equals(str) || "search".equals(str) || "slice".equals(str) || "split".equals(str) || "substring".equals(str) || "toLowerCase".equals(str) || "toLocaleLowerCase".equals(str) || "toString".equals(str) || "toUpperCase".equals(str) || str3.equals(str)) {
            str2 = "trim";
        } else {
            str2 = "trim";
            if (!str2.equals(str)) {
                throw new IllegalArgumentException(str.concat(" is not a String function"));
            }
        }
        int iHashCode = str.hashCode();
        String strZzc = "undefined";
        String str4 = this.f11458a;
        z = false;
        boolean z11 = false;
        switch (iHashCode) {
            case -1789698943:
                if (str.equals("hasOwnProperty")) {
                    zzh.a(1, "hasOwnProperty", arrayList);
                    zzao zzaoVarB = zzgVar.f11600b.b(zzgVar, (zzao) arrayList.get(0));
                    boolean zEquals2 = "length".equals(zzaoVarB.zzc());
                    zzaf zzafVar = zzao.f11449o;
                    if (zEquals2) {
                        return zzafVar;
                    }
                    double dDoubleValue = zzaoVarB.zzd().doubleValue();
                    return (dDoubleValue != Math.floor(dDoubleValue) || (i11 = (int) dDoubleValue) < 0 || i11 >= str4.length()) ? zzao.f11450p : zzafVar;
                }
                throw new IllegalArgumentException("Command not supported");
            case -1776922004:
                if (str.equals("toString")) {
                    zzh.a(0, "toString", arrayList);
                    return this;
                }
                throw new IllegalArgumentException("Command not supported");
            case -1464939364:
                if (str.equals("toLocaleLowerCase")) {
                    zzh.a(0, "toLocaleLowerCase", arrayList);
                    return new zzas(str4.toLowerCase());
                }
                throw new IllegalArgumentException("Command not supported");
            case -1361633751:
                if (str.equals("charAt")) {
                    zzh.c(1, "charAt", arrayList);
                    int iH = arrayList.isEmpty() ? 0 : (int) zzh.h(zzgVar.f11600b.b(zzgVar, (zzao) arrayList.get(0)).zzd().doubleValue());
                    return (iH < 0 || iH >= str4.length()) ? zzao.f11451q : new zzas(String.valueOf(str4.charAt(iH)));
                }
                throw new IllegalArgumentException("Command not supported");
            case -1354795244:
                if (str.equals("concat")) {
                    if (!arrayList.isEmpty()) {
                        StringBuilder sb2 = new StringBuilder(str4);
                        for (int i14 = 0; i14 < arrayList.size(); i14++) {
                            sb2.append(zzgVar.f11600b.b(zzgVar, (zzao) arrayList.get(i14)).zzc());
                        }
                        return new zzas(sb2.toString());
                    }
                    return this;
                }
                throw new IllegalArgumentException("Command not supported");
            case -1137582698:
                if (str.equals("toLowerCase")) {
                    zzh.a(0, "toLowerCase", arrayList);
                    return new zzas(str4.toLowerCase(Locale.ENGLISH));
                }
                throw new IllegalArgumentException("Command not supported");
            case -906336856:
                if (str.equals("search")) {
                    zzh.c(1, "search", arrayList);
                    Matcher matcher = Pattern.compile(arrayList.isEmpty() ? "undefined" : zzgVar.f11600b.b(zzgVar, (zzao) arrayList.get(0)).zzc()).matcher(str4);
                    return matcher.find() ? new zzah(Double.valueOf(matcher.start())) : new zzah(Double.valueOf(-1.0d));
                }
                throw new IllegalArgumentException("Command not supported");
            case -726908483:
                if (str.equals(str3)) {
                    zzh.a(0, str3, arrayList);
                    return new zzas(str4.toUpperCase());
                }
                throw new IllegalArgumentException("Command not supported");
            case -467511597:
                if (str.equals("lastIndexOf")) {
                    zzh.c(2, "lastIndexOf", arrayList);
                    String strZzc2 = arrayList.size() > 0 ? zzgVar.f11600b.b(zzgVar, (zzao) arrayList.get(0)).zzc() : "undefined";
                    double dDoubleValue2 = arrayList.size() < 2 ? Double.NaN : zzgVar.f11600b.b(zzgVar, (zzao) arrayList.get(1)).zzd().doubleValue();
                    return new zzah(Double.valueOf(str4.lastIndexOf(strZzc2, (int) (Double.isNaN(dDoubleValue2) ? Double.POSITIVE_INFINITY : zzh.h(dDoubleValue2)))));
                }
                throw new IllegalArgumentException("Command not supported");
            case -399551817:
                if (str.equals("toUpperCase")) {
                    zzh.a(0, "toUpperCase", arrayList);
                    return new zzas(str4.toUpperCase(Locale.ENGLISH));
                }
                throw new IllegalArgumentException("Command not supported");
            case 3568674:
                if (str.equals(str2)) {
                    zzh.a(0, "toUpperCase", arrayList);
                    return new zzas(str4.trim());
                }
                throw new IllegalArgumentException("Command not supported");
            case 103668165:
                if (str.equals("match")) {
                    zzh.c(1, "match", arrayList);
                    Matcher matcher2 = Pattern.compile(arrayList.size() <= 0 ? BuildConfig.VERSION_NAME : zzgVar.f11600b.b(zzgVar, (zzao) arrayList.get(0)).zzc()).matcher(str4);
                    return matcher2.find() ? new zzae(Arrays.asList(new zzas(matcher2.group()))) : zzao.f11446k;
                }
                throw new IllegalArgumentException("Command not supported");
            case 109526418:
                if (str.equals("slice")) {
                    zzh.c(2, "slice", arrayList);
                    double dH = zzh.h(!arrayList.isEmpty() ? zzgVar.f11600b.b(zzgVar, (zzao) arrayList.get(0)).zzd().doubleValue() : 0.0d);
                    double dMax = dH < 0.0d ? Math.max(((double) str4.length()) + dH, 0.0d) : Math.min(dH, str4.length());
                    double dH2 = zzh.h(arrayList.size() > 1 ? zzgVar.f11600b.b(zzgVar, (zzao) arrayList.get(1)).zzd().doubleValue() : str4.length());
                    int i15 = (int) dMax;
                    return new zzas(str4.substring(i15, Math.max(0, ((int) (dH2 < 0.0d ? Math.max(((double) str4.length()) + dH2, 0.0d) : Math.min(dH2, str4.length()))) - i15) + i15));
                }
                throw new IllegalArgumentException("Command not supported");
            case 109648666:
                if (str.equals("split")) {
                    zzh.c(2, "split", arrayList);
                    if (str4.length() == 0) {
                        return new zzae(Arrays.asList(this));
                    }
                    ArrayList arrayList2 = new ArrayList();
                    if (arrayList.isEmpty()) {
                        arrayList2.add(this);
                    } else {
                        String strZzc3 = zzgVar.f11600b.b(zzgVar, (zzao) arrayList.get(0)).zzc();
                        long jG = arrayList.size() > 1 ? ((long) zzh.g(zzgVar.f11600b.b(zzgVar, (zzao) arrayList.get(1)).zzd().doubleValue())) & 4294967295L : 2147483647L;
                        if (jG == 0) {
                            return new zzae();
                        }
                        String[] strArrSplit = str4.split(Pattern.quote(strZzc3), ((int) jG) + 1);
                        int length = strArrSplit.length;
                        if (!strZzc3.isEmpty() || length <= 0) {
                            i13 = zIsEmpty;
                            z11 = zIsEmpty;
                            i12 = length;
                            i13 = z11;
                        } else {
                            zIsEmpty = strArrSplit[0].isEmpty();
                            i12 = length - 1;
                            if (!strArrSplit[i12].isEmpty()) {
                                i13 = zIsEmpty;
                                z11 = zIsEmpty;
                                i12 = length;
                                i13 = z11;
                            }
                        }
                        i13 = zIsEmpty;
                        z11 = zIsEmpty;
                        if (length > jG) {
                            i12--;
                        }
                        while (i13 < i12) {
                            arrayList2.add(new zzas(strArrSplit[i13]));
                            i13++;
                        }
                    }
                    return new zzae(arrayList2);
                }
                throw new IllegalArgumentException("Command not supported");
            case 530542161:
                if (str.equals("substring")) {
                    zzh.c(2, "substring", arrayList);
                    int iH2 = !arrayList.isEmpty() ? (int) zzh.h(zzgVar.f11600b.b(zzgVar, (zzao) arrayList.get(0)).zzd().doubleValue()) : 0;
                    int iH3 = arrayList.size() > 1 ? (int) zzh.h(zzgVar.f11600b.b(zzgVar, (zzao) arrayList.get(1)).zzd().doubleValue()) : str4.length();
                    int iMin = Math.min(Math.max(iH2, 0), str4.length());
                    int iMin2 = Math.min(Math.max(iH3, 0), str4.length());
                    return new zzas(str4.substring(Math.min(iMin, iMin2), Math.max(iMin, iMin2)));
                }
                throw new IllegalArgumentException("Command not supported");
            case 1094496948:
                if (str.equals("replace")) {
                    zzh.c(2, "replace", arrayList);
                    boolean zIsEmpty2 = arrayList.isEmpty();
                    zzao zzaoVarA = zzao.f11445j;
                    if (!zIsEmpty2) {
                        strZzc = zzgVar.f11600b.b(zzgVar, (zzao) arrayList.get(0)).zzc();
                        if (arrayList.size() > 1) {
                            zzaoVarA = zzgVar.f11600b.b(zzgVar, (zzao) arrayList.get(1));
                        }
                    }
                    String str5 = strZzc;
                    int iIndexOf = str4.indexOf(str5);
                    if (iIndexOf >= 0) {
                        if (zzaoVarA instanceof zzai) {
                            zzaoVarA = ((zzai) zzaoVarA).a(zzgVar, Arrays.asList(new zzas(str5), new zzah(Double.valueOf(iIndexOf)), this));
                        }
                        String strSubstring = str4.substring(0, iIndexOf);
                        String strZzc4 = zzaoVarA.zzc();
                        String strSubstring2 = str4.substring(str5.length() + iIndexOf);
                        return new zzas(p.u(new StringBuilder(String.valueOf(strSubstring).length() + String.valueOf(strZzc4).length() + String.valueOf(strSubstring2).length()), strSubstring, strZzc4, strSubstring2));
                    }
                    return this;
                }
                throw new IllegalArgumentException("Command not supported");
            case 1943291465:
                if (str.equals("indexOf")) {
                    zzh.c(2, "indexOf", arrayList);
                    if (arrayList.size() <= 0) {
                        zzgVar2 = zzgVar;
                    } else {
                        zzgVar2 = zzgVar;
                        strZzc = zzgVar2.f11600b.b(zzgVar2, (zzao) arrayList.get(0)).zzc();
                    }
                    return new zzah(Double.valueOf(str4.indexOf(strZzc, (int) zzh.h(arrayList.size() < 2 ? 0.0d : zzgVar2.f11600b.b(zzgVar2, (zzao) arrayList.get(1)).zzd().doubleValue()))));
                }
                throw new IllegalArgumentException("Command not supported");
            default:
                throw new IllegalArgumentException("Command not supported");
        }
    }
}
