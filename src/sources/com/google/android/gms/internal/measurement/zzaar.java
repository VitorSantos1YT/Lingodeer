package com.google.android.gms.internal.measurement;

import java.util.Set;
import java.util.logging.Level;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzaar extends zzaag {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Level f11152b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set f11153c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final zzzq f11154d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzaar(String str) {
        super(str);
        Level level = Level.ALL;
        Set set = zzaas.f11155f;
        this.f11152b = level;
        this.f11153c = zzaas.f11155f;
        this.f11154d = zzaas.f11156g;
    }

    @Override // com.google.android.gms.internal.measurement.zzzf
    public final boolean b(Level level) {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.zzzf
    public final void c(zzxz zzxzVar) {
        String strA = (String) zzxzVar.j().d(zzyw.f12196a);
        if (strA == null) {
            strA = this.f11134a;
        }
        if (strA == null) {
            strA = zzxzVar.g().a();
            int iIndexOf = strA.indexOf(36, strA.lastIndexOf(46));
            if (iIndexOf >= 0) {
                strA = strA.substring(0, iIndexOf);
            }
        }
        zzaal.a(strA);
        zzaas.e(zzxzVar, this.f11152b, this.f11153c, this.f11154d);
    }
}
