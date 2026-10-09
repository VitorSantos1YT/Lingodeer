package com.google.android.gms.common.api.internal;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class zabh implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8774a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zabk f8775b;

    public zabh(zabk zabkVar, int i11) {
        this.f8774a = i11;
        this.f8775b = zabkVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f8775b.b(this.f8774a);
    }
}
