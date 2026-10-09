package com.google.android.gms.common.api.internal;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class zabi implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zabj f8776a;

    public zabi(zabj zabjVar) {
        this.f8776a = zabjVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zabk zabkVar = this.f8776a.f8777a;
        zabkVar.f8779b.f(zabkVar.f8779b.getClass().getName().concat(" disconnecting because it was signed out."));
    }
}
