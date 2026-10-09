package com.google.android.gms.internal.measurement;

import java.util.Calendar;
import java.util.Date;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzabg extends zzabh {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final zzabf f11179c;

    public zzabg(zzza zzzaVar, int i11, zzabf zzabfVar) {
        super(zzzaVar, i11);
        this.f11179c = zzabfVar;
        StringBuilder sb2 = new StringBuilder("%");
        zzzaVar.d(sb2);
        sb2.append(true != zzzaVar.c() ? 't' : 'T');
        sb2.append(zzabfVar.b());
    }

    @Override // com.google.android.gms.internal.measurement.zzabh
    public final void a(zzyy zzyyVar, Object obj) {
        StringBuilder sb2 = zzyyVar.f12199e;
        boolean z11 = obj instanceof Date;
        zzabf zzabfVar = this.f11179c;
        if (!z11 && !(obj instanceof Calendar) && !(obj instanceof Long)) {
            char cB = zzabfVar.b();
            StringBuilder sb3 = new StringBuilder(String.valueOf(cB).length() + 2);
            sb3.append("%t");
            sb3.append(cB);
            zzyy.b(sb2, obj, sb3.toString());
            return;
        }
        StringBuilder sb4 = new StringBuilder("%");
        zzza zzzaVar = this.f11181b;
        zzzaVar.d(sb4);
        sb4.append(true != zzzaVar.c() ? 't' : 'T');
        sb4.append(zzabfVar.b());
        sb2.append(String.format(zzzh.f12211a, sb4.toString(), obj));
    }
}
