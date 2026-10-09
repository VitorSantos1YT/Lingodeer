package com.google.android.play.integrity.internal;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class ap extends an {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ar f16244c;

    public ap(ar arVar, int i11) {
        super(arVar.size(), i11);
        this.f16244c = arVar;
    }

    @Override // com.google.android.play.integrity.internal.an
    public final Object a(int i11) {
        return this.f16244c.get(i11);
    }
}
