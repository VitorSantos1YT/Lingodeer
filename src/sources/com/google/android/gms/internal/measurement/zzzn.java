package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzzn extends zzzq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f12219a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f12220b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final zzzp f12221c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final zzzo f12222d;

    public /* synthetic */ zzzn(zzzm zzzmVar) {
        HashMap map = new HashMap();
        this.f12219a = map;
        HashMap map2 = new HashMap();
        this.f12220b = map2;
        map.putAll(zzzmVar.f12215a);
        map2.putAll(zzzmVar.f12216b);
        this.f12221c = zzzmVar.f12217c;
        this.f12222d = zzzmVar.f12218d;
    }

    @Override // com.google.android.gms.internal.measurement.zzzq
    public final void a(zzyl zzylVar, Object obj, zzzc zzzcVar) {
        zzzp zzzpVar = (zzzp) this.f12219a.get(zzylVar);
        if (zzzpVar != null) {
            zzzpVar.a(zzylVar, obj, zzzcVar);
        } else {
            this.f12221c.a(zzylVar, obj, zzzcVar);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzzq
    public final void b(zzyl zzylVar, Iterator it, zzzc zzzcVar) {
        zzzo zzzoVar = (zzzo) this.f12220b.get(zzylVar);
        if (zzzoVar != null) {
            zzzoVar.a(zzylVar, it, zzzcVar);
            return;
        }
        zzzo zzzoVar2 = this.f12222d;
        if (zzzoVar2 != null && !this.f12219a.containsKey(zzylVar)) {
            zzzoVar2.a(zzylVar, it, zzzcVar);
        } else {
            while (it.hasNext()) {
                a(zzylVar, it.next(), zzzcVar);
            }
        }
    }
}
