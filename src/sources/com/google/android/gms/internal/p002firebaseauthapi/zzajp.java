package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Arrays;
import nv.p;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class zzajp extends zzajm {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f10077d;

    public zzajp(byte[] bArr) {
        super(0);
        bArr.getClass();
        this.f10077d = bArr;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaje
    public final byte b(int i11) {
        return this.f10077d[i11];
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaje
    public final int d() {
        return this.f10077d.length;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaje
    public final zzaje f(int i11, int i12) {
        byte[] bArr = this.f10077d;
        int iE = zzaje.e(0, i12, bArr.length);
        return iE == 0 ? zzaje.f10066b : new zzaji(bArr, 0, iE);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaje
    public final void h(zzakb zzakbVar) {
        byte[] bArr = this.f10077d;
        zzakbVar.a(bArr, 0, bArr.length);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaje
    public final void j(byte[] bArr, int i11) {
        System.arraycopy(this.f10077d, 0, bArr, 0, i11);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaje
    public final boolean l(zzaje zzajeVar) {
        boolean z11 = zzajeVar instanceof zzajp;
        byte[] bArr = this.f10077d;
        if (z11) {
            return Arrays.equals(bArr, ((zzajp) zzajeVar).f10077d);
        }
        if (!(zzajeVar instanceof zzaji)) {
            return zzajeVar.l(this);
        }
        int length = bArr.length;
        if (length > zzajeVar.d()) {
            throw new IllegalArgumentException("Length too large: " + length + bArr.length);
        }
        if (length > zzajeVar.d()) {
            throw new IllegalArgumentException(p.p("Ran off end of other: 0, ", length, zzajeVar.d(), ", "));
        }
        if (zzajeVar instanceof zzajp) {
            return zzaje.k(0, 0, length, bArr, ((zzajp) zzajeVar).f10077d);
        }
        zzaji zzajiVar = (zzaji) zzajeVar;
        return zzaje.k(0, zzajiVar.f10073e, length, bArr, zzajiVar.f10072d);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaje
    public final int n(int i11, int i12) {
        return zzakw.a(i11, this.f10077d, 0, i12);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaje
    public final zzajq o() {
        byte[] bArr = this.f10077d;
        return zzajq.d(bArr, 0, bArr.length);
    }
}
