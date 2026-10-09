package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzzt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final zzzp f12223a = new zzzr();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final zzzo f12224b = new zzzs();

    public static zzzm a(Set set) {
        zzzm zzzmVar = new zzzm(f12223a);
        zzzmVar.f12218d = f12224b;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            zzyl zzylVar = (zzyl) it.next();
            zzabr.a(zzylVar, "key");
            boolean z11 = zzylVar.f12181c;
            HashMap map = zzzmVar.f12216b;
            HashMap map2 = zzzmVar.f12215a;
            if (z11) {
                zzzo zzzoVar = zzzm.f12214f;
                if (!z11) {
                    throw new IllegalArgumentException("key must be repeating");
                }
                map2.remove(zzylVar);
                map.put(zzylVar, zzzoVar);
            } else {
                zzzp zzzpVar = zzzm.f12213e;
                map.remove(zzylVar);
                map2.put(zzylVar, zzzpVar);
            }
        }
        return zzzmVar;
    }
}
