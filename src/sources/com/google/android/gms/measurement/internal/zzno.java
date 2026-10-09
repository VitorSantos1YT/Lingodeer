package com.google.android.gms.measurement.internal;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzno implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zzpg f13506a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Runnable f13507b;

    public zzno(zznt zzntVar, zzpg zzpgVar, Runnable runnable) {
        this.f13506a = zzpgVar;
        this.f13507b = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzpg zzpgVar = this.f13506a;
        zzpgVar.W();
        zzpgVar.e().g();
        if (zzpgVar.f13609p == null) {
            zzpgVar.f13609p = new ArrayList();
        }
        zzpgVar.f13609p.add(this.f13507b);
        zzpgVar.q();
    }
}
