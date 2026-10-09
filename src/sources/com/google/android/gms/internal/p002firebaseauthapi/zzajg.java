package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class zzajg implements Comparator<zzaje> {
    @Override // java.util.Comparator
    public final /* synthetic */ int compare(zzaje zzajeVar, zzaje zzajeVar2) {
        zzaje zzajeVar3 = zzajeVar;
        zzaje zzajeVar4 = zzajeVar2;
        zzajeVar3.getClass();
        zzajh zzajhVar = new zzajh(zzajeVar3);
        zzajeVar4.getClass();
        zzajh zzajhVar2 = new zzajh(zzajeVar4);
        while (zzajhVar.hasNext() && zzajhVar2.hasNext()) {
            int iCompare = Integer.compare(zzajhVar.zza() & 255, zzajhVar2.zza() & 255);
            if (iCompare != 0) {
                return iCompare;
            }
        }
        return Integer.compare(zzajeVar3.d(), zzajeVar4.d());
    }
}
