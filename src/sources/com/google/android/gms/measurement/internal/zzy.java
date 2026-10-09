package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.zzahn;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.List;
import y.b;
import y.e;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f13675a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f13676b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.google.android.gms.internal.measurement.zzii f13677c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final BitSet f13678d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final BitSet f13679e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final e f13680f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e f13681g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ zzad f13682h;

    public zzy(zzad zzadVar, String str, com.google.android.gms.internal.measurement.zzii zziiVar, BitSet bitSet, BitSet bitSet2, e eVar, e eVar2) {
        this.f13682h = zzadVar;
        this.f13675a = str;
        this.f13678d = bitSet;
        this.f13679e = bitSet2;
        this.f13680f = eVar;
        this.f13681g = new e(0);
        for (Integer num : (b) eVar2.keySet()) {
            ArrayList arrayList = new ArrayList();
            arrayList.add((Long) eVar2.get(num));
            this.f13681g.put(num, arrayList);
        }
        this.f13676b = false;
        this.f13677c = zziiVar;
    }

    public final void a(zzab zzabVar) {
        int iA = zzabVar.a();
        if (zzabVar.f12606c != null) {
            this.f13679e.set(iA, true);
        }
        Boolean bool = zzabVar.f12607d;
        if (bool != null) {
            this.f13678d.set(iA, bool.booleanValue());
        }
        if (zzabVar.f12608e != null) {
            Integer numValueOf = Integer.valueOf(iA);
            e eVar = this.f13680f;
            Long l9 = (Long) eVar.get(numValueOf);
            long jLongValue = zzabVar.f12608e.longValue() / 1000;
            if (l9 == null || jLongValue > l9.longValue()) {
                eVar.put(numValueOf, Long.valueOf(jLongValue));
            }
        }
        if (zzabVar.f12609f != null) {
            Integer numValueOf2 = Integer.valueOf(iA);
            e eVar2 = this.f13681g;
            List arrayList = (List) eVar2.get(numValueOf2);
            if (arrayList == null) {
                arrayList = new ArrayList();
                eVar2.put(numValueOf2, arrayList);
            }
            if (zzabVar.b()) {
                arrayList.clear();
            }
            zzahn.a();
            zzic zzicVar = this.f13682h.f13202a;
            zzal zzalVar = zzicVar.f13097d;
            zzfx zzfxVar = zzfy.F0;
            String str = this.f13675a;
            if (zzalVar.r(str, zzfxVar) && zzabVar.c()) {
                arrayList.clear();
            }
            zzahn.a();
            if (!zzicVar.f13097d.r(str, zzfxVar)) {
                arrayList.add(Long.valueOf(zzabVar.f12609f.longValue() / 1000));
                return;
            }
            Long lValueOf = Long.valueOf(zzabVar.f12609f.longValue() / 1000);
            if (arrayList.contains(lValueOf)) {
                return;
            }
            arrayList.add(lValueOf);
        }
    }

    public final com.google.android.gms.internal.measurement.zzhg b(int i11) {
        ArrayList arrayList;
        List list;
        com.google.android.gms.internal.measurement.zzhf zzhfVarF = com.google.android.gms.internal.measurement.zzhg.F();
        zzhfVarF.m();
        ((com.google.android.gms.internal.measurement.zzhg) zzhfVarF.f11266b).G(i11);
        zzhfVarF.m();
        ((com.google.android.gms.internal.measurement.zzhg) zzhfVarF.f11266b).J(this.f13676b);
        com.google.android.gms.internal.measurement.zzii zziiVar = this.f13677c;
        if (zziiVar != null) {
            zzhfVarF.m();
            ((com.google.android.gms.internal.measurement.zzhg) zzhfVarF.f11266b).I(zziiVar);
        }
        com.google.android.gms.internal.measurement.zzih zzihVarG = com.google.android.gms.internal.measurement.zzii.G();
        ArrayList arrayListM = zzpk.M(this.f13678d);
        zzihVarG.m();
        ((com.google.android.gms.internal.measurement.zzii) zzihVarG.f11266b).K(arrayListM);
        ArrayList arrayListM2 = zzpk.M(this.f13679e);
        zzihVarG.m();
        ((com.google.android.gms.internal.measurement.zzii) zzihVarG.f11266b).I(arrayListM2);
        e eVar = this.f13680f;
        if (eVar == null) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList(eVar.f56767c);
            for (Integer num : (b) eVar.keySet()) {
                int iIntValue = num.intValue();
                Long l9 = (Long) eVar.get(num);
                if (l9 != null) {
                    com.google.android.gms.internal.measurement.zzhp zzhpVarC = com.google.android.gms.internal.measurement.zzhq.C();
                    zzhpVarC.m();
                    ((com.google.android.gms.internal.measurement.zzhq) zzhpVarC.f11266b).D(iIntValue);
                    long jLongValue = l9.longValue();
                    zzhpVarC.m();
                    ((com.google.android.gms.internal.measurement.zzhq) zzhpVarC.f11266b).E(jLongValue);
                    arrayList2.add((com.google.android.gms.internal.measurement.zzhq) zzhpVarC.p());
                }
            }
            arrayList = arrayList2;
        }
        if (arrayList != null) {
            zzihVarG.m();
            ((com.google.android.gms.internal.measurement.zzii) zzihVarG.f11266b).M(arrayList);
        }
        e eVar2 = this.f13681g;
        if (eVar2 == null) {
            list = Collections.EMPTY_LIST;
        } else {
            ArrayList arrayList3 = new ArrayList(eVar2.f56767c);
            for (Integer num2 : (b) eVar2.keySet()) {
                com.google.android.gms.internal.measurement.zzij zzijVarD = com.google.android.gms.internal.measurement.zzik.D();
                int iIntValue2 = num2.intValue();
                zzijVarD.m();
                ((com.google.android.gms.internal.measurement.zzik) zzijVarD.f11266b).E(iIntValue2);
                List list2 = (List) eVar2.get(num2);
                if (list2 != null) {
                    Collections.sort(list2);
                    zzijVarD.m();
                    ((com.google.android.gms.internal.measurement.zzik) zzijVarD.f11266b).F(list2);
                }
                arrayList3.add((com.google.android.gms.internal.measurement.zzik) zzijVarD.p());
            }
            list = arrayList3;
        }
        zzihVarG.m();
        ((com.google.android.gms.internal.measurement.zzii) zzihVarG.f11266b).O(list);
        zzhfVarF.m();
        ((com.google.android.gms.internal.measurement.zzhg) zzhfVarF.f11266b).H((com.google.android.gms.internal.measurement.zzii) zzihVarG.p());
        return (com.google.android.gms.internal.measurement.zzhg) zzhfVarF.p();
    }

    public zzy(zzad zzadVar, String str) {
        this.f13682h = zzadVar;
        this.f13675a = str;
        this.f13676b = true;
        this.f13678d = new BitSet();
        this.f13679e = new BitSet();
        this.f13680f = new e(0);
        this.f13681g = new e(0);
    }
}
