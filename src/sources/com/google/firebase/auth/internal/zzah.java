package com.google.firebase.auth.internal;

import com.google.android.gms.common.internal.Preconditions;
import com.google.firebase.auth.MultiFactor;
import com.google.firebase.auth.PhoneMultiFactorInfo;
import com.google.firebase.auth.TotpMultiFactorInfo;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzah extends MultiFactor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zzad f17942a;

    public zzah(zzad zzadVar) {
        Preconditions.g(zzadVar);
        this.f17942a = zzadVar;
    }

    public final ArrayList a() {
        zzbl zzblVar = this.f17942a.N;
        if (zzblVar == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = zzblVar.f17971a.iterator();
        while (it.hasNext()) {
            arrayList.add((PhoneMultiFactorInfo) it.next());
        }
        Iterator it2 = zzblVar.f17972b.iterator();
        while (it2.hasNext()) {
            arrayList.add((TotpMultiFactorInfo) it2.next());
        }
        return arrayList;
    }
}
