package com.google.android.gms.measurement.internal;

import androidx.recyclerview.widget.p2;
import com.google.android.gms.common.internal.Preconditions;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.m;
import re.e0;
import t7.d;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzhm extends p2 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ zzht f13048h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzhm(zzht zzhtVar) {
        super(20);
        this.f13048h = zzhtVar;
    }

    @Override // androidx.recyclerview.widget.p2
    public final Object e(Object obj) throws Throwable {
        LinkedHashMap linkedHashMap;
        String str = (String) obj;
        Preconditions.d(str);
        zzht zzhtVar = this.f13048h;
        zzhtVar.h();
        Preconditions.d(str);
        zzaw zzawVar = zzhtVar.f13552b.f13597c;
        zzpg.U(zzawVar);
        zzaq zzaqVarO0 = zzawVar.o0(str);
        if (zzaqVarO0 == null) {
            return null;
        }
        zzgu zzguVar = zzhtVar.f13202a.f13099f;
        zzic.m(zzguVar);
        zzguVar.f12949n.b(str, "Populate EES config from database on cache miss. appId");
        zzhtVar.o(str, zzhtVar.p(zzaqVarO0.f12634a, str));
        p2 p2Var = zzhtVar.f13066k;
        synchronized (((e0) p2Var.f2590g)) {
            Set setEntrySet = ((LinkedHashMap) ((d) p2Var.f2589f).f52059b).entrySet();
            m.e(setEntrySet, "<get-entries>(...)");
            linkedHashMap = new LinkedHashMap(setEntrySet.size());
            Set<Map.Entry> setEntrySet2 = ((LinkedHashMap) ((d) p2Var.f2589f).f52059b).entrySet();
            m.e(setEntrySet2, "<get-entries>(...)");
            for (Map.Entry entry : setEntrySet2) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return (com.google.android.gms.internal.measurement.zzc) linkedHashMap.get(str);
    }
}
