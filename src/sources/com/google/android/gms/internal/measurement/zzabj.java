package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.EnumMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzabj extends zzabh {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Map f11182d;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final zzyz f11183c;

    static {
        EnumMap enumMap = new EnumMap(zzyz.class);
        for (zzyz zzyzVar : zzyz.values()) {
            zzabj[] zzabjVarArr = new zzabj[10];
            for (int i11 = 0; i11 < 10; i11++) {
                zzabjVarArr[i11] = new zzabj(i11, zzyzVar, zzza.f12204e);
            }
            enumMap.put(zzyzVar, zzabjVarArr);
        }
        f11182d = Collections.unmodifiableMap(enumMap);
    }

    public zzabj(int i11, zzyz zzyzVar, zzza zzzaVar) {
        super(zzzaVar, i11);
        zzabr.a(zzyzVar, "format char");
        this.f11183c = zzyzVar;
        if (zzzaVar.a()) {
            return;
        }
        int iB = zzyzVar.b();
        iB = zzzaVar.c() ? iB & 65503 : iB;
        StringBuilder sb2 = new StringBuilder("%");
        zzzaVar.d(sb2);
        sb2.append((char) iB);
    }

    @Override // com.google.android.gms.internal.measurement.zzabh
    public final void a(zzyy zzyyVar, Object obj) {
        zzyyVar.a(obj, this.f11183c, this.f11181b);
    }
}
