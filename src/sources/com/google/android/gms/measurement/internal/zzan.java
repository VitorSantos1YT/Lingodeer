package com.google.android.gms.measurement.internal;

import java.util.EnumMap;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzan {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EnumMap f12632a;

    public zzan() {
        this.f12632a = new EnumMap(zzjk.class);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001b  */
    public final void a(zzjk zzjkVar, int i11) {
        zzam zzamVar = zzam.UNSET;
        if (i11 == -30) {
            zzamVar = zzam.TCF;
        } else if (i11 == -20) {
            zzamVar = zzam.API;
        } else if (i11 == -10) {
            zzamVar = zzam.MANIFEST;
        } else if (i11 == 0) {
            zzamVar = zzam.API;
        } else if (i11 == 30) {
            zzamVar = zzam.INITIALIZATION;
        }
        this.f12632a.put(zzjkVar, zzamVar);
    }

    public final void b(zzjk zzjkVar, zzam zzamVar) {
        this.f12632a.put(zzjkVar, zzamVar);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("1");
        for (zzjk zzjkVar : zzjk.values()) {
            zzam zzamVar = (zzam) this.f12632a.get(zzjkVar);
            if (zzamVar == null) {
                zzamVar = zzam.UNSET;
            }
            sb2.append(zzamVar.b());
        }
        return sb2.toString();
    }

    public zzan(EnumMap enumMap) {
        EnumMap enumMap2 = new EnumMap(zzjk.class);
        this.f12632a = enumMap2;
        enumMap2.putAll(enumMap);
    }
}
