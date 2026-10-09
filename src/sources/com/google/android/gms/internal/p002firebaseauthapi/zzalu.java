package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class zzalu implements zzalv {
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalv
    public final zzals a(Object obj) {
        return (zzals) obj;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalv
    /* JADX INFO: renamed from: b, reason: collision with other method in class */
    public final void mo204b(Object obj, Object obj2) {
        zzals zzalsVar = (zzals) obj;
        if (zzalsVar.isEmpty()) {
            return;
        }
        Iterator it = zzalsVar.entrySet().iterator();
        if (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            entry.getKey();
            entry.getValue();
            throw new NoSuchMethodError();
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalv
    public final zzals c(Object obj) {
        return (zzals) obj;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalv
    public final Object d(Object obj) {
        ((zzals) obj).f10155a = false;
        return obj;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalv
    public final zzalt zza(Object obj) {
        throw new NoSuchMethodError();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalv
    public final zzals zzb() {
        return zzals.f10154b.c();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalv
    public final boolean zzf(Object obj) {
        return !((zzals) obj).f10155a;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalv
    public final zzals b(Object obj, Object obj2) {
        zzals zzalsVarC = (zzals) obj;
        zzals zzalsVar = (zzals) obj2;
        if (!zzalsVar.isEmpty()) {
            if (!zzalsVarC.f10155a) {
                zzalsVarC = zzalsVarC.c();
            }
            zzalsVarC.d();
            if (!zzalsVar.isEmpty()) {
                zzalsVarC.putAll(zzalsVar);
            }
        }
        return zzalsVarC;
    }
}
