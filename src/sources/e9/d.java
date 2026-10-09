package e9;

import androidx.media3.common.ParserException;
import java.io.EOFException;
import java.io.InterruptedIOException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements x7.m {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b7.w f25173c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b7.v f25174d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public x7.o f25175e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f25176f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f25178h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f25179i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f25171a = new e(0, null, "audio/mp4a-latm", true);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b7.w f25172b = new b7.w(2048);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f25177g = -1;

    public d() {
        b7.w wVar = new b7.w(10);
        this.f25173c = wVar;
        byte[] bArr = wVar.f4039a;
        this.f25174d = new b7.v(bArr, bArr.length);
    }

    @Override // x7.m
    public final boolean c(x7.n nVar) throws EOFException, InterruptedIOException {
        int i11 = 0;
        while (true) {
            b7.w wVar = this.f25173c;
            nVar.A(wVar.f4039a, 0, 10);
            wVar.I(0);
            if (wVar.z() != 4801587) {
                break;
            }
            wVar.J(3);
            int iV = wVar.v();
            i11 += iV + 10;
            nVar.k(iV);
        }
        nVar.r();
        nVar.k(i11);
        if (this.f25177g == -1) {
            this.f25177g = i11;
        }
        int i12 = i11;
        int i13 = 0;
        int i14 = 0;
        do {
            b7.w wVar2 = this.f25173c;
            x7.j jVar = (x7.j) nVar;
            jVar.f(wVar2.f4039a, 0, 2, false);
            wVar2.I(0);
            if ((wVar2.C() & 65526) == 65520) {
                i13++;
                if (i13 >= 4 && i14 > 188) {
                    return true;
                }
                jVar.f(wVar2.f4039a, 0, 4, false);
                b7.v vVar = this.f25174d;
                vVar.q(14);
                int i15 = vVar.i(13);
                if (i15 <= 6) {
                    i12++;
                    jVar.f55903f = 0;
                    jVar.b(i12, false);
                } else {
                    jVar.b(i15 - 6, false);
                    i14 += i15;
                }
            } else {
                i12++;
                jVar.f55903f = 0;
                jVar.b(i12, false);
            }
            i13 = 0;
            i14 = 0;
        } while (i12 - i11 < 8192);
        return false;
    }

    @Override // x7.m
    public final void e(x7.o oVar) {
        this.f25175e = oVar;
        this.f25171a.d(oVar, new b10.b(0, 1));
        oVar.o();
    }

    @Override // x7.m
    public final void f(long j11, long j12) {
        this.f25178h = false;
        this.f25171a.a();
        this.f25176f = j12;
    }

    @Override // x7.m
    public final int g(x7.n nVar, kw.b bVar) throws ParserException {
        b7.a.k(this.f25175e);
        nVar.getLength();
        b7.w wVar = this.f25172b;
        int i11 = nVar.read(wVar.f4039a, 0, 2048);
        boolean z11 = i11 == -1;
        if (!this.f25179i) {
            this.f25175e.q(new x7.q(-9223372036854775807L));
            this.f25179i = true;
        }
        if (z11) {
            return -1;
        }
        wVar.I(0);
        wVar.H(i11);
        boolean z12 = this.f25178h;
        e eVar = this.f25171a;
        if (!z12) {
            eVar.f25216u = this.f25176f;
            this.f25178h = true;
        }
        eVar.c(wVar);
        return 0;
    }

    @Override // x7.m
    public final void release() {
    }
}
