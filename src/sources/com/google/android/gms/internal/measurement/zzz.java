package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.Iterator;
import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TreeMap f12201a = new TreeMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TreeMap f12202b = new TreeMap();

    public final void a(zzg zzgVar, zzab zzabVar) {
        zzl zzlVar = new zzl(zzabVar);
        TreeMap treeMap = this.f12201a;
        for (Integer num : treeMap.keySet()) {
            zzaa zzaaVarClone = zzabVar.f11164b.clone();
            zzao zzaoVarA = ((zzan) treeMap.get(num)).a(zzgVar, Collections.singletonList(zzlVar));
            int iG = zzaoVarA instanceof zzah ? zzh.g(((zzah) zzaoVarA).f11371a.doubleValue()) : -1;
            if (iG == 2 || iG == -1) {
                zzabVar.f11164b = zzaaVarClone;
            }
        }
        TreeMap treeMap2 = this.f12202b;
        Iterator it = treeMap2.keySet().iterator();
        while (it.hasNext()) {
            zzao zzaoVarA2 = ((zzan) treeMap2.get((Integer) it.next())).a(zzgVar, Collections.singletonList(zzlVar));
            if (zzaoVarA2 instanceof zzah) {
                zzh.g(((zzah) zzaoVarA2).f11371a.doubleValue());
            }
        }
    }
}
