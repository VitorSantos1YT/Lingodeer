package com.google.android.gms.internal.fido;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class zzbs extends zzaz {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final zzaz f9665e = new zzbs(0, new Object[0]);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final transient Object[] f9666c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient int f9667d;

    public zzbs(int i11, Object[] objArr) {
        this.f9666c = objArr;
        this.f9667d = i11;
    }

    @Override // com.google.android.gms.internal.fido.zzaz, com.google.android.gms.internal.fido.zzav
    public final int b(Object[] objArr) {
        Object[] objArr2 = this.f9666c;
        int i11 = this.f9667d;
        System.arraycopy(objArr2, 0, objArr, 0, i11);
        return i11;
    }

    @Override // com.google.android.gms.internal.fido.zzav
    public final int d() {
        return this.f9667d;
    }

    @Override // com.google.android.gms.internal.fido.zzav
    public final int e() {
        return 0;
    }

    @Override // com.google.android.gms.internal.fido.zzav
    public final Object[] g() {
        return this.f9666c;
    }

    @Override // java.util.List
    public final Object get(int i11) {
        zzap.a(i11, this.f9667d);
        Object obj = this.f9666c[i11];
        obj.getClass();
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f9667d;
    }
}
