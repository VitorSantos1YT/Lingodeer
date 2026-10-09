package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.util.SparseArray;
import com.google.common.util.concurrent.FutureCallback;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzjw implements FutureCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zzoh f13232a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zzlj f13233b;

    public zzjw(zzlj zzljVar, zzoh zzohVar) {
        this.f13232a = zzohVar;
        this.f13233b = zzljVar;
    }

    @Override // com.google.common.util.concurrent.FutureCallback
    public final void a(Throwable th2) {
        zzlj zzljVar = this.f13233b;
        zzljVar.g();
        zzic zzicVar = zzljVar.f13202a;
        zzljVar.f13330i = false;
        zzljVar.K().add(this.f13232a);
        if (zzljVar.f13331j > ((Integer) zzfy.f12886v0.a(null)).intValue()) {
            zzljVar.f13331j = 1;
            zzgu zzguVar = zzicVar.f13099f;
            zzic.m(zzguVar);
            zzguVar.f12945i.c(zzgu.o(zzicVar.r().m()), zzgu.o(th2.toString()), "registerTriggerAsync failed. May try later. App ID, throwable");
            return;
        }
        zzgu zzguVar2 = zzicVar.f13099f;
        zzic.m(zzguVar2);
        zzguVar2.f12945i.d("registerTriggerAsync failed. App ID, delay in seconds, throwable", zzgu.o(zzicVar.r().m()), zzgu.o(String.valueOf(zzljVar.f13331j)), zzgu.o(th2.toString()));
        int i11 = zzljVar.f13331j;
        if (zzljVar.f13332k == null) {
            zzljVar.f13332k = new zzjx(zzljVar, zzicVar);
        }
        zzljVar.f13332k.b(((long) i11) * 1000);
        int i12 = zzljVar.f13331j;
        zzljVar.f13331j = i12 + i12;
    }

    @Override // com.google.common.util.concurrent.FutureCallback
    public final void onSuccess(Object obj) {
        zzlj zzljVar = this.f13233b;
        zzljVar.g();
        zzic zzicVar = zzljVar.f13202a;
        zzhh zzhhVar = zzicVar.f13098e;
        zzic.k(zzhhVar);
        SparseArray sparseArrayM = zzhhVar.m();
        zzoh zzohVar = this.f13232a;
        sparseArrayM.put(zzohVar.f13547c, Long.valueOf(zzohVar.f13546b));
        zzhh zzhhVar2 = zzicVar.f13098e;
        zzic.k(zzhhVar2);
        int[] iArr = new int[sparseArrayM.size()];
        long[] jArr = new long[sparseArrayM.size()];
        for (int i11 = 0; i11 < sparseArrayM.size(); i11++) {
            iArr[i11] = sparseArrayM.keyAt(i11);
            jArr[i11] = ((Long) sparseArrayM.valueAt(i11)).longValue();
        }
        Bundle bundle = new Bundle();
        bundle.putIntArray("uriSources", iArr);
        bundle.putLongArray("uriTimestamps", jArr);
        zzhhVar2.f13030n.b(bundle);
        zzljVar.f13330i = false;
        zzljVar.f13331j = 1;
        zzgu zzguVar = zzicVar.f13099f;
        zzic.m(zzguVar);
        zzguVar.m.b(zzohVar.f13545a, "Successfully registered trigger URI");
        zzljVar.L();
    }
}
