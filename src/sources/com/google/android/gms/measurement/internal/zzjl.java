package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.tbruyelle.rxpermissions3.BuildConfig;
import java.util.EnumMap;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzjl {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final zzjl f13204c = new zzjl(100);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EnumMap f13205a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f13206b;

    public zzjl(int i11) {
        EnumMap enumMap = new EnumMap(zzjk.class);
        this.f13205a = enumMap;
        zzjk zzjkVar = zzjk.AD_STORAGE;
        zzji zzjiVar = zzji.UNINITIALIZED;
        enumMap.put(zzjkVar, zzjiVar);
        enumMap.put(zzjk.ANALYTICS_STORAGE, zzjiVar);
        this.f13206b = i11;
    }

    public static String a(int i11) {
        if (i11 == -30) {
            return "TCF";
        }
        if (i11 == -20) {
            return "API";
        }
        if (i11 == -10) {
            return "MANIFEST";
        }
        if (i11 == 0) {
            return "1P_API";
        }
        if (i11 == 30) {
            return "1P_INIT";
        }
        if (i11 != 90) {
            return i11 != 100 ? "OTHER" : "UNKNOWN";
        }
        return "REMOTE_CONFIG";
    }

    public static zzjl b(int i11, Bundle bundle) {
        if (bundle == null) {
            return new zzjl(i11);
        }
        EnumMap enumMap = new EnumMap(zzjk.class);
        for (zzjk zzjkVar : zzjj.STORAGE.b()) {
            enumMap.put(zzjkVar, d(bundle.getString(zzjkVar.zze)));
        }
        return new zzjl(enumMap, i11);
    }

    public static zzjl c(int i11, String str) {
        EnumMap enumMap = new EnumMap(zzjk.class);
        zzjk[] zzjkVarArrA = zzjj.STORAGE.a();
        for (int i12 = 0; i12 < zzjkVarArrA.length; i12++) {
            String str2 = str == null ? BuildConfig.VERSION_NAME : str;
            zzjk zzjkVar = zzjkVarArrA[i12];
            int i13 = i12 + 2;
            if (i13 < str2.length()) {
                enumMap.put(zzjkVar, e(str2.charAt(i13)));
            } else {
                enumMap.put(zzjkVar, zzji.UNINITIALIZED);
            }
        }
        return new zzjl(enumMap, i11);
    }

    public static zzji d(String str) {
        if (str == null) {
            return zzji.UNINITIALIZED;
        }
        if (str.equals("granted")) {
            return zzji.GRANTED;
        }
        return str.equals("denied") ? zzji.DENIED : zzji.UNINITIALIZED;
    }

    public static zzji e(char c11) {
        if (c11 == '+') {
            return zzji.POLICY;
        }
        if (c11 != '0') {
            return c11 != '1' ? zzji.UNINITIALIZED : zzji.GRANTED;
        }
        return zzji.DENIED;
    }

    public static char h(zzji zzjiVar) {
        if (zzjiVar == null) {
            return '-';
        }
        int iOrdinal = zzjiVar.ordinal();
        if (iOrdinal == 1) {
            return '+';
        }
        if (iOrdinal != 2) {
            return iOrdinal != 3 ? '-' : '1';
        }
        return '0';
    }

    public static boolean l(int i11, int i12) {
        int i13 = -30;
        if (i11 == -20) {
            if (i12 == -30) {
                return true;
            }
            i11 = -20;
        }
        if (i11 != -30) {
            i13 = i11;
        } else if (i12 == -20) {
            return true;
        }
        return i13 == i12 || i11 < i12;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzjl)) {
            return false;
        }
        zzjl zzjlVar = (zzjl) obj;
        for (zzjk zzjkVar : zzjj.STORAGE.b()) {
            if (this.f13205a.get(zzjkVar) != zzjlVar.f13205a.get(zzjkVar)) {
                return false;
            }
        }
        return this.f13206b == zzjlVar.f13206b;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0032  */
    public final String f() {
        int iOrdinal;
        StringBuilder sb2 = new StringBuilder("G1");
        for (zzjk zzjkVar : zzjj.STORAGE.a()) {
            zzji zzjiVar = (zzji) this.f13205a.get(zzjkVar);
            char c11 = '-';
            if (zzjiVar != null && (iOrdinal = zzjiVar.ordinal()) != 0) {
                if (iOrdinal == 1) {
                    c11 = '1';
                } else if (iOrdinal == 2) {
                    c11 = '0';
                } else if (iOrdinal == 3) {
                    c11 = '1';
                }
            }
            sb2.append(c11);
        }
        return sb2.toString();
    }

    public final String g() {
        StringBuilder sb2 = new StringBuilder("G1");
        for (zzjk zzjkVar : zzjj.STORAGE.a()) {
            sb2.append(h((zzji) this.f13205a.get(zzjkVar)));
        }
        return sb2.toString();
    }

    public final int hashCode() {
        Iterator it = this.f13205a.values().iterator();
        int iHashCode = this.f13206b * 17;
        while (it.hasNext()) {
            iHashCode = (iHashCode * 31) + ((zzji) it.next()).hashCode();
        }
        return iHashCode;
    }

    public final boolean i(zzjk zzjkVar) {
        return ((zzji) this.f13205a.get(zzjkVar)) != zzji.DENIED;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0033  */
    public final zzjl j(zzjl zzjlVar) {
        EnumMap enumMap = new EnumMap(zzjk.class);
        for (zzjk zzjkVar : zzjj.STORAGE.b()) {
            zzji zzjiVar = (zzji) this.f13205a.get(zzjkVar);
            zzji zzjiVar2 = (zzji) zzjlVar.f13205a.get(zzjkVar);
            if (zzjiVar == null) {
                zzjiVar = zzjiVar2;
            } else if (zzjiVar2 != null) {
                zzji zzjiVar3 = zzji.UNINITIALIZED;
                if (zzjiVar == zzjiVar3) {
                    zzjiVar = zzjiVar2;
                } else if (zzjiVar2 != zzjiVar3) {
                    zzji zzjiVar4 = zzji.POLICY;
                    if (zzjiVar == zzjiVar4) {
                        zzjiVar = zzjiVar2;
                    } else if (zzjiVar2 != zzjiVar4) {
                        zzji zzjiVar5 = zzji.DENIED;
                        zzjiVar = (zzjiVar == zzjiVar5 || zzjiVar2 == zzjiVar5) ? zzjiVar5 : zzji.GRANTED;
                    }
                }
            }
            if (zzjiVar != null) {
                enumMap.put(zzjkVar, zzjiVar);
            }
        }
        return new zzjl(enumMap, 100);
    }

    public final zzjl k(zzjl zzjlVar) {
        EnumMap enumMap = new EnumMap(zzjk.class);
        for (zzjk zzjkVar : zzjj.STORAGE.b()) {
            zzji zzjiVar = (zzji) this.f13205a.get(zzjkVar);
            if (zzjiVar == zzji.UNINITIALIZED) {
                zzjiVar = (zzji) zzjlVar.f13205a.get(zzjkVar);
            }
            if (zzjiVar != null) {
                enumMap.put(zzjkVar, zzjiVar);
            }
        }
        return new zzjl(enumMap, this.f13206b);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("source=");
        sb2.append(a(this.f13206b));
        for (zzjk zzjkVar : zzjj.STORAGE.b()) {
            sb2.append(",");
            sb2.append(zzjkVar.zze);
            sb2.append("=");
            zzji zzjiVar = (zzji) this.f13205a.get(zzjkVar);
            if (zzjiVar == null) {
                zzjiVar = zzji.UNINITIALIZED;
            }
            sb2.append(zzjiVar);
        }
        return sb2.toString();
    }

    public zzjl(EnumMap enumMap, int i11) {
        EnumMap enumMap2 = new EnumMap(zzjk.class);
        this.f13205a = enumMap2;
        enumMap2.putAll(enumMap);
        this.f13206b = i11;
    }
}
