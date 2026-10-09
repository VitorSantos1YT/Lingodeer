package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import java.util.EnumMap;
import java.util.Objects;
import ko.Zea.ealNNtLp;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzba {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final zzba f12674f = new zzba((Boolean) null, 100, (Boolean) null, (String) null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f12675a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f12676b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Boolean f12677c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f12678d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final EnumMap f12679e;

    public zzba(Boolean bool, int i11, Boolean bool2, String str) {
        EnumMap enumMap = new EnumMap(zzjk.class);
        this.f12679e = enumMap;
        enumMap.put(zzjk.AD_USER_DATA, bool == null ? zzji.UNINITIALIZED : bool.booleanValue() ? zzji.GRANTED : zzji.DENIED);
        this.f12675a = i11;
        this.f12676b = e();
        this.f12677c = bool2;
        this.f12678d = str;
    }

    public static zzba b(String str) {
        if (str == null || str.length() <= 0) {
            return f12674f;
        }
        String[] strArrSplit = str.split(":");
        int i11 = Integer.parseInt(strArrSplit[0]);
        EnumMap enumMap = new EnumMap(zzjk.class);
        zzjk[] zzjkVarArrA = zzjj.DMA.a();
        int length = zzjkVarArrA.length;
        int i12 = 1;
        int i13 = 0;
        while (i13 < length) {
            enumMap.put(zzjkVarArrA[i13], zzjl.e(strArrSplit[i12].charAt(0)));
            i13++;
            i12++;
        }
        return new zzba(enumMap, i11, (Boolean) null, (String) null);
    }

    public static zzba c(int i11, Bundle bundle) {
        if (bundle == null) {
            return new zzba((Boolean) null, i11, (Boolean) null, (String) null);
        }
        EnumMap enumMap = new EnumMap(zzjk.class);
        for (zzjk zzjkVar : zzjj.DMA.a()) {
            enumMap.put(zzjkVar, zzjl.d(bundle.getString(zzjkVar.zze)));
        }
        return new zzba(enumMap, i11, bundle.containsKey("is_dma_region") ? Boolean.valueOf(bundle.getString("is_dma_region")) : null, bundle.getString("cps_display_str"));
    }

    public static Boolean d(Bundle bundle) {
        zzji zzjiVarD;
        if (bundle == null || (zzjiVarD = zzjl.d(bundle.getString("ad_personalization"))) == null) {
            return null;
        }
        int iOrdinal = zzjiVarD.ordinal();
        if (iOrdinal == 2) {
            return Boolean.FALSE;
        }
        if (iOrdinal != 3) {
            return null;
        }
        return Boolean.TRUE;
    }

    public final zzji a() {
        zzji zzjiVar = (zzji) this.f12679e.get(zzjk.AD_USER_DATA);
        return zzjiVar == null ? zzji.UNINITIALIZED : zzjiVar;
    }

    public final String e() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f12675a);
        for (zzjk zzjkVar : zzjj.DMA.a()) {
            sb2.append(":");
            sb2.append(zzjl.h((zzji) this.f12679e.get(zzjkVar)));
        }
        return sb2.toString();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzba)) {
            return false;
        }
        zzba zzbaVar = (zzba) obj;
        if (this.f12676b.equalsIgnoreCase(zzbaVar.f12676b) && Objects.equals(this.f12677c, zzbaVar.f12677c)) {
            return Objects.equals(this.f12678d, zzbaVar.f12678d);
        }
        return false;
    }

    public final int hashCode() {
        int i11;
        Boolean bool = this.f12677c;
        if (bool == null) {
            i11 = 3;
        } else {
            i11 = true != bool.booleanValue() ? 13 : 7;
        }
        String str = this.f12678d;
        return ((str == null ? 17 : str.hashCode()) * 137) + this.f12676b.hashCode() + (i11 * 29);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("source=");
        sb2.append(zzjl.a(this.f12675a));
        for (zzjk zzjkVar : zzjj.DMA.a()) {
            sb2.append(",");
            sb2.append(zzjkVar.zze);
            sb2.append("=");
            zzji zzjiVar = (zzji) this.f12679e.get(zzjkVar);
            if (zzjiVar == null) {
                sb2.append("uninitialized");
            } else {
                int iOrdinal = zzjiVar.ordinal();
                if (iOrdinal == 0) {
                    sb2.append("uninitialized");
                } else if (iOrdinal == 1) {
                    sb2.append("eu_consent_policy");
                } else if (iOrdinal == 2) {
                    sb2.append("denied");
                } else if (iOrdinal == 3) {
                    sb2.append("granted");
                }
            }
        }
        Boolean bool = this.f12677c;
        if (bool != null) {
            sb2.append(ealNNtLp.HSEcSVMB);
            sb2.append(bool);
        }
        String str = this.f12678d;
        if (str != null) {
            sb2.append(",cpsDisplayStr=");
            sb2.append(str);
        }
        return sb2.toString();
    }

    public zzba(EnumMap enumMap, int i11, Boolean bool, String str) {
        EnumMap enumMap2 = new EnumMap(zzjk.class);
        this.f12679e = enumMap2;
        enumMap2.putAll(enumMap);
        this.f12675a = i11;
        this.f12676b = e();
        this.f12677c = bool;
        this.f12678d = str;
    }
}
