package com.google.android.gms.internal.measurement;

import com.google.common.collect.ImmutableSet;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzwa extends zzwb {
    @Override // com.google.android.gms.internal.measurement.zzwb
    public final zzwi a(String str, zzxd zzxdVar) {
        boolean z11;
        zzws zzwsVarK1;
        zzwl zzwlVar = zzwk.f12111e;
        zzxdVar.getClass();
        zzwq zzwqVarC = zzvy.c();
        zzws zzwsVar = zzwqVarC.f12135b;
        if (zzwsVar == zzwg.f12104t) {
            zzwsVar = null;
            zzvy.b(zzwqVarC, null);
            z11 = true;
        } else {
            z11 = false;
        }
        if (zzwsVar == null) {
            UUID uuidB = zzvz.f12096c.b();
            String strA = zzvn.a(uuidB);
            zzvr zzvrVar = zzwd.f12101t;
            ImmutableSet immutableSet = (ImmutableSet) zzvy.f12092a.get();
            if (!immutableSet.isEmpty()) {
                immutableSet.forEach(new zzwe());
            }
            zzwsVarK1 = new zzwf(uuidB, strA, str, zzwlVar, zzvrVar, zzwqVarC);
        } else {
            zzwsVarK1 = zzwsVar instanceof zzvs ? ((zzvs) zzwsVar).k1(str, zzwlVar, false, zzwqVarC) : zzwsVar.x1(str, zzwlVar, zzwqVarC);
        }
        zzvy.b(zzwqVarC, zzwsVarK1);
        return new zzwi(zzwsVarK1, z11);
    }
}
