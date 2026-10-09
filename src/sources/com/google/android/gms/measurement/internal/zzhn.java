package com.google.android.gms.measurement.internal;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzhn implements com.google.android.gms.internal.measurement.zzr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zzht f13049a;

    public zzhn(zzht zzhtVar) {
        this.f13049a = zzhtVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzr
    public final void a(int i11, String str, List list, boolean z11, boolean z12) {
        zzgs zzgsVar;
        int i12 = i11 - 1;
        zzht zzhtVar = this.f13049a;
        if (i12 == 0) {
            zzgu zzguVar = zzhtVar.f13202a.f13099f;
            zzic.m(zzguVar);
            zzgsVar = zzguVar.m;
        } else if (i12 != 1) {
            if (i12 == 3) {
                zzgu zzguVar2 = zzhtVar.f13202a.f13099f;
                zzic.m(zzguVar2);
                zzgsVar = zzguVar2.f12949n;
            } else if (i12 != 4) {
                zzgu zzguVar3 = zzhtVar.f13202a.f13099f;
                zzic.m(zzguVar3);
                zzgsVar = zzguVar3.f12948l;
            } else if (z11) {
                zzgu zzguVar4 = zzhtVar.f13202a.f13099f;
                zzic.m(zzguVar4);
                zzgsVar = zzguVar4.f12946j;
            } else if (z12) {
                zzgu zzguVar5 = zzhtVar.f13202a.f13099f;
                zzic.m(zzguVar5);
                zzgsVar = zzguVar5.f12945i;
            } else {
                zzgu zzguVar6 = zzhtVar.f13202a.f13099f;
                zzic.m(zzguVar6);
                zzgsVar = zzguVar6.f12947k;
            }
        } else if (z11) {
            zzgu zzguVar7 = zzhtVar.f13202a.f13099f;
            zzic.m(zzguVar7);
            zzgsVar = zzguVar7.f12943g;
        } else if (z12) {
            zzgu zzguVar8 = zzhtVar.f13202a.f13099f;
            zzic.m(zzguVar8);
            zzgsVar = zzguVar8.f12942f;
        } else {
            zzgu zzguVar9 = zzhtVar.f13202a.f13099f;
            zzic.m(zzguVar9);
            zzgsVar = zzguVar9.f12944h;
        }
        int size = list.size();
        if (size == 1) {
            zzgsVar.b(list.get(0), str);
            return;
        }
        if (size == 2) {
            zzgsVar.c(list.get(0), list.get(1), str);
        } else if (size != 3) {
            zzgsVar.a(str);
        } else {
            zzgsVar.d(str, list.get(0), list.get(1), list.get(2));
        }
    }
}
