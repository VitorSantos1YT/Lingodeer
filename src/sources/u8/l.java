package u8;

import b7.f0;
import b7.w;
import java.io.EOFException;
import x7.e0;
import y6.d0;
import y6.o;
import y6.p;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class l implements e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e0 f52843a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f52844b;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public k f52849g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public p f52850h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f52851i;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f52846d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f52847e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public byte[] f52848f = f0.f3976b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w f52845c = new w();

    public l(e0 e0Var, i iVar) {
        this.f52843a = e0Var;
        this.f52844b = iVar;
    }

    @Override // x7.e0
    public final void a(w wVar, int i11, int i12) {
        if (this.f52849g == null) {
            this.f52843a.a(wVar, i11, i12);
            return;
        }
        e(i11);
        wVar.h(this.f52848f, this.f52847e, i11);
        this.f52847e += i11;
    }

    @Override // x7.e0
    public final void b(p pVar) {
        pVar.f57291n.getClass();
        String str = pVar.f57291n;
        b7.a.d(d0.i(str) == 3);
        boolean zEquals = pVar.equals(this.f52850h);
        i iVar = this.f52844b;
        if (!zEquals) {
            this.f52850h = pVar;
            this.f52849g = iVar.l(pVar) ? iVar.h(pVar) : null;
        }
        k kVar = this.f52849g;
        e0 e0Var = this.f52843a;
        if (kVar == null) {
            e0Var.b(pVar);
            return;
        }
        o oVarA = pVar.a();
        oVarA.m = d0.o("application/x-media3-cues");
        oVarA.f57262j = str;
        oVarA.f57269r = Long.MAX_VALUE;
        oVarA.K = iVar.b(pVar);
        nv.p.D(oVarA, e0Var);
    }

    @Override // x7.e0
    public final int c(y6.h hVar, int i11, boolean z11) throws EOFException {
        if (this.f52849g == null) {
            return this.f52843a.c(hVar, i11, z11);
        }
        e(i11);
        int i12 = hVar.read(this.f52848f, this.f52847e, i11);
        if (i12 != -1) {
            this.f52847e += i12;
            return i12;
        }
        if (z11) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // x7.e0
    public final void d(long j11, int i11, int i12, int i13, x7.d0 d0Var) {
        if (this.f52849g == null) {
            this.f52843a.d(j11, i11, i12, i13, d0Var);
            return;
        }
        b7.a.c("DRM on subtitles is not supported", d0Var == null);
        int i14 = (this.f52847e - i13) - i12;
        try {
            this.f52849g.j(this.f52848f, i14, i12, j.f52840c, new g7.d(this, j11, i11));
        } catch (RuntimeException e8) {
            if (!this.f52851i) {
                throw e8;
            }
            b7.a.C("Parsing subtitles failed, ignoring sample.", e8);
        }
        int i15 = i14 + i12;
        this.f52846d = i15;
        if (i15 == this.f52847e) {
            this.f52846d = 0;
            this.f52847e = 0;
        }
    }

    public final void e(int i11) {
        int length = this.f52848f.length;
        int i12 = this.f52847e;
        if (length - i12 >= i11) {
            return;
        }
        int i13 = i12 - this.f52846d;
        int iMax = Math.max(i13 * 2, i11 + i13);
        byte[] bArr = this.f52848f;
        byte[] bArr2 = iMax <= bArr.length ? bArr : new byte[iMax];
        System.arraycopy(bArr, this.f52846d, bArr2, 0, i13);
        this.f52846d = 0;
        this.f52847e = i13;
        this.f52848f = bArr2;
    }
}
