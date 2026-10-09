package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzaw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f11460a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zzbi f11461b = new zzbi();

    public zzaw() {
        a(new zzau());
        a(new zzax());
        a(new zzay());
        a(new zzbb());
        a(new zzbg());
        a(new zzbh());
        a(new zzbj());
    }

    public final void a(zzav zzavVar) {
        ArrayList arrayList = zzavVar.f11459a;
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            this.f11460a.put(((zzbk) obj).b().toString(), zzavVar);
        }
    }

    public final zzao b(zzg zzgVar, zzao zzaoVar) {
        zzh.k(zzgVar);
        if (!(zzaoVar instanceof zzap)) {
            return zzaoVar;
        }
        zzap zzapVar = (zzap) zzaoVar;
        ArrayList arrayList = zzapVar.f11453b;
        String str = zzapVar.f11452a;
        HashMap map = this.f11460a;
        return (map.containsKey(str) ? (zzav) map.get(str) : this.f11461b).a(str, zzgVar, arrayList);
    }
}
