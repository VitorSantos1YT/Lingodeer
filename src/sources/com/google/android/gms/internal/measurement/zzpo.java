package com.google.android.gms.internal.measurement;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzpo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReferenceArray f11824a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zzog f11825b;

    public zzpo(zzog zzogVar, int i11) {
        this.f11825b = zzogVar;
        this.f11824a = new AtomicReferenceArray(i11);
    }

    public final zzom a(int i11, String str, boolean z11) {
        AtomicReferenceArray atomicReferenceArray = this.f11824a;
        zzom zzomVar = (zzom) atomicReferenceArray.get(i11);
        if (zzomVar != null) {
            return zzomVar;
        }
        zzom zzomVarA = this.f11825b.a(str, z11);
        while (!atomicReferenceArray.compareAndSet(i11, null, zzomVarA)) {
            if (atomicReferenceArray.get(i11) != null) {
                zzom zzomVar2 = (zzom) atomicReferenceArray.get(i11);
                zzomVar2.getClass();
                return zzomVar2;
            }
        }
        return zzomVarA;
    }

    public final zzom b(int i11, String str, long j11) {
        AtomicReferenceArray atomicReferenceArray = this.f11824a;
        zzom zzomVar = (zzom) atomicReferenceArray.get(i11);
        if (zzomVar != null) {
            return zzomVar;
        }
        zzob zzobVar = new zzob(str, this.f11825b.f11775a, j11);
        while (!atomicReferenceArray.compareAndSet(i11, null, zzobVar)) {
            if (atomicReferenceArray.get(i11) != null) {
                zzom zzomVar2 = (zzom) atomicReferenceArray.get(i11);
                zzomVar2.getClass();
                return zzomVar2;
            }
        }
        return zzobVar;
    }

    public final zzom c(int i11, String str, String str2) {
        AtomicReferenceArray atomicReferenceArray = this.f11824a;
        zzom zzomVar = (zzom) atomicReferenceArray.get(i11);
        if (zzomVar != null) {
            return zzomVar;
        }
        zzod zzodVar = new zzod(str, this.f11825b.f11775a, str2);
        while (!atomicReferenceArray.compareAndSet(i11, null, zzodVar)) {
            if (atomicReferenceArray.get(i11) != null) {
                zzom zzomVar2 = (zzom) atomicReferenceArray.get(i11);
                zzomVar2.getClass();
                return zzomVar2;
            }
        }
        return zzodVar;
    }
}
