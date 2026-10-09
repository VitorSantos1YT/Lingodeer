package com.google.android.gms.internal.fido;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class zzaw extends zzar {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final zzaz f9646c;

    public zzaw(zzaz zzazVar, int i11) {
        super(zzazVar.size(), i11);
        this.f9646c = zzazVar;
    }

    @Override // com.google.android.gms.internal.fido.zzar
    public final Object a(int i11) {
        return this.f9646c.get(i11);
    }
}
