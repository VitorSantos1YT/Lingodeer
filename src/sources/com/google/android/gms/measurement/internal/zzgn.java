package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import ep.a;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzgn {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final AtomicReference f12918b = new AtomicReference();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final AtomicReference f12919c = new AtomicReference();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final AtomicReference f12920d = new AtomicReference();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zzgm f12921a;

    public zzgn(zzgm zzgmVar) {
        this.f12921a = zzgmVar;
    }

    public static final String g(String str, String[] strArr, String[] strArr2, AtomicReference atomicReference) {
        String str2;
        Preconditions.g(atomicReference);
        Preconditions.b(strArr.length == strArr2.length);
        for (int i11 = 0; i11 < strArr.length; i11++) {
            if (Objects.equals(str, strArr[i11])) {
                synchronized (atomicReference) {
                    try {
                        String[] strArr3 = (String[]) atomicReference.get();
                        if (strArr3 == null) {
                            strArr3 = new String[strArr2.length];
                            atomicReference.set(strArr3);
                        }
                        str2 = strArr3[i11];
                        if (str2 == null) {
                            str2 = strArr2[i11] + "(" + strArr[i11] + ")";
                            strArr3[i11] = str2;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return str2;
            }
        }
        return str;
    }

    public final String a(String str) {
        if (str == null) {
            return null;
        }
        if (!this.f12921a.zza()) {
            return str;
        }
        return g(str, zzjm.f13212f, zzjm.f13207a, f12918b);
    }

    public final String b(String str) {
        if (str == null) {
            return null;
        }
        if (!this.f12921a.zza()) {
            return str;
        }
        return g(str, zzjn.f13215b, zzjn.f13214a, f12919c);
    }

    public final String c(String str) {
        if (str == null) {
            return null;
        }
        if (!this.f12921a.zza()) {
            return str;
        }
        if (str.startsWith("_exp_")) {
            return a.g("experiment_id(", str, ")");
        }
        return g(str, zzjo.f13219b, zzjo.f13218a, f12920d);
    }

    public final String d(zzbh zzbhVar) {
        String string;
        zzjr zzjrVar = (zzjr) this.f12921a;
        if (!zzjrVar.zza()) {
            return zzbhVar.toString();
        }
        StringBuilder sb2 = new StringBuilder("origin=");
        sb2.append(zzbhVar.f12704c);
        sb2.append(",name=");
        sb2.append(a(zzbhVar.f12702a));
        sb2.append(",params=");
        zzbf zzbfVar = zzbhVar.f12703b;
        if (zzbfVar == null) {
            string = null;
        } else {
            string = !zzjrVar.zza() ? zzbfVar.f12701a.toString() : e(zzbfVar.G1());
        }
        sb2.append(string);
        return sb2.toString();
    }

    public final String e(Bundle bundle) {
        String strF;
        if (bundle == null) {
            return null;
        }
        if (!this.f12921a.zza()) {
            return bundle.toString();
        }
        StringBuilder sbN = a.n("Bundle[{");
        for (String str : bundle.keySet()) {
            if (sbN.length() != 8) {
                sbN.append(", ");
            }
            sbN.append(b(str));
            sbN.append("=");
            Object obj = bundle.get(str);
            if (obj instanceof Bundle) {
                strF = f(new Object[]{obj});
            } else if (obj instanceof Object[]) {
                strF = f((Object[]) obj);
            } else {
                strF = obj instanceof ArrayList ? f(((ArrayList) obj).toArray()) : String.valueOf(obj);
            }
            sbN.append(strF);
        }
        sbN.append("}]");
        return sbN.toString();
    }

    public final String f(Object[] objArr) {
        if (objArr == null) {
            return "[]";
        }
        StringBuilder sbN = a.n("[");
        for (Object obj : objArr) {
            String strE = obj instanceof Bundle ? e((Bundle) obj) : String.valueOf(obj);
            if (strE != null) {
                if (sbN.length() != 1) {
                    sbN.append(", ");
                }
                sbN.append(strE);
            }
        }
        sbN.append("]");
        return sbN.toString();
    }
}
