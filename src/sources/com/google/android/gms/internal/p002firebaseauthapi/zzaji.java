package com.google.android.gms.internal.p002firebaseauthapi;

import nv.p;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class zzaji extends zzajm {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f10072d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f10073e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f10074f;

    public zzaji(byte[] bArr, int i11, int i12) {
        super(0);
        zzaje.e(i11, i11 + i12, bArr.length);
        this.f10072d = bArr;
        this.f10073e = i11;
        this.f10074f = i12;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaje
    public final byte b(int i11) {
        return this.f10072d[this.f10073e + i11];
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaje
    public final int d() {
        return this.f10074f;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaje
    public final zzaje f(int i11, int i12) {
        int iE = zzaje.e(i11, i12, this.f10074f);
        if (iE == 0) {
            return zzaje.f10066b;
        }
        return new zzaji(this.f10072d, this.f10073e + i11, iE);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaje
    public final void h(zzakb zzakbVar) {
        zzakbVar.a(this.f10072d, this.f10073e, this.f10074f);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaje
    public final void j(byte[] bArr, int i11) {
        System.arraycopy(this.f10072d, this.f10073e, bArr, 0, i11);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaje
    public final boolean l(zzaje zzajeVar) {
        if (!(zzajeVar instanceof zzajp) && !(zzajeVar instanceof zzaji)) {
            return zzajeVar.l(this);
        }
        int iD = zzajeVar.d();
        int i11 = this.f10074f;
        if (i11 > iD) {
            throw new IllegalArgumentException("Length too large: " + i11 + i11);
        }
        if (i11 > zzajeVar.d()) {
            throw new IllegalArgumentException(p.p("Ran off end of other: 0, ", i11, zzajeVar.d(), ", "));
        }
        boolean z11 = zzajeVar instanceof zzajp;
        byte[] bArr = this.f10072d;
        int i12 = this.f10073e;
        if (z11) {
            return zzaje.k(i12, 0, i11, bArr, ((zzajp) zzajeVar).f10077d);
        }
        if (!(zzajeVar instanceof zzaji)) {
            return zzajeVar.f(0, i11).equals(f(i12, i11 + i12));
        }
        zzaji zzajiVar = (zzaji) zzajeVar;
        return zzaje.k(i12, zzajiVar.f10073e, i11, bArr, zzajiVar.f10072d);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaje
    public final int n(int i11, int i12) {
        return zzakw.a(i11, this.f10072d, this.f10073e, i12);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaje
    public final zzajq o() {
        return zzajq.d(this.f10072d, this.f10073e, this.f10074f);
    }
}
