package u8;

import androidx.media3.common.ParserException;
import b7.f0;
import b7.w;
import com.google.common.primitives.Ints;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import x7.e0;
import x7.m;
import x7.n;
import x7.v;
import y6.d0;
import y6.o;
import y6.p;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class g implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f52830a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p f52831b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f52832c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public e0 f52835f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f52836g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f52837h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long[] f52838i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f52839j;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public byte[] f52834e = f0.f3976b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final w f52833d = new w();

    public g(k kVar, p pVar) {
        p pVar2;
        this.f52830a = kVar;
        if (pVar != null) {
            o oVarA = pVar.a();
            oVarA.m = d0.o("application/x-media3-cues");
            oVarA.f57262j = pVar.f57291n;
            oVarA.K = kVar.l();
            pVar2 = new p(oVarA);
        } else {
            pVar2 = null;
        }
        this.f52831b = pVar2;
        this.f52832c = new ArrayList();
        this.f52837h = 0;
        this.f52838i = f0.f3977c;
        this.f52839j = -9223372036854775807L;
    }

    public final void a(f fVar) {
        b7.a.k(this.f52835f);
        byte[] bArr = fVar.f52829b;
        int length = bArr.length;
        w wVar = this.f52833d;
        wVar.getClass();
        wVar.G(bArr, bArr.length);
        this.f52835f.a(wVar, length, 0);
        this.f52835f.d(fVar.f52828a, 1, length, 0, null);
    }

    @Override // x7.m
    public final boolean c(n nVar) {
        return true;
    }

    @Override // x7.m
    public final void e(x7.o oVar) {
        b7.a.j(this.f52837h == 0);
        e0 e0VarV = oVar.v(0, 3);
        this.f52835f = e0VarV;
        p pVar = this.f52831b;
        if (pVar != null) {
            e0VarV.b(pVar);
            oVar.o();
            oVar.q(new v(-9223372036854775807L, new long[]{0}, new long[]{0}));
        }
        this.f52837h = 1;
    }

    @Override // x7.m
    public final void f(long j11, long j12) {
        int i11 = this.f52837h;
        b7.a.j((i11 == 0 || i11 == 5) ? false : true);
        this.f52839j = j12;
        if (this.f52837h == 2) {
            this.f52837h = 1;
        }
        if (this.f52837h == 4) {
            this.f52837h = 3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0084 A[Catch: RuntimeException -> 0x00c7, TryCatch #0 {RuntimeException -> 0x00c7, blocks: (B:33:0x007e, B:35:0x0084, B:38:0x008f, B:39:0x00b2, B:41:0x00b8, B:44:0x00c9, B:37:0x008c), top: B:68:0x007e }] */
    /* JADX WARN: Code duplicated, block: B:37:0x008c A[Catch: RuntimeException -> 0x00c7, TryCatch #0 {RuntimeException -> 0x00c7, blocks: (B:33:0x007e, B:35:0x0084, B:38:0x008f, B:39:0x00b2, B:41:0x00b8, B:44:0x00c9, B:37:0x008c), top: B:68:0x007e }] */
    /* JADX WARN: Code duplicated, block: B:41:0x00b8 A[Catch: RuntimeException -> 0x00c7, LOOP:1: B:39:0x00b2->B:41:0x00b8, LOOP_END, TryCatch #0 {RuntimeException -> 0x00c7, blocks: (B:33:0x007e, B:35:0x0084, B:38:0x008f, B:39:0x00b2, B:41:0x00b8, B:44:0x00c9, B:37:0x008c), top: B:68:0x007e }] */
    /* JADX WARN: Code duplicated, block: B:68:0x007e A[EXC_TOP_SPLITTER, PHI: r22
      0x007e: PHI (r22v4 int) = (r22v5 int), (r22v6 int) binds: [B:32:0x007c, B:29:0x0077] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    @Override // x7.m
    public final int g(n nVar, kw.b bVar) throws ParserException {
        int i11;
        long j11;
        j jVar;
        int i12;
        int i13 = this.f52837h;
        b7.a.j((i13 == 0 || i13 == 5) ? false : true);
        if (this.f52837h == 1) {
            int iB = nVar.getLength() != -1 ? Ints.b(nVar.getLength()) : 1024;
            if (iB > this.f52834e.length) {
                this.f52834e = new byte[iB];
            }
            this.f52836g = 0;
            this.f52837h = 2;
        }
        int i14 = this.f52837h;
        ArrayList arrayList = this.f52832c;
        if (i14 == 2) {
            byte[] bArr = this.f52834e;
            if (bArr.length == this.f52836g) {
                this.f52834e = Arrays.copyOf(bArr, bArr.length + 1024);
            }
            byte[] bArr2 = this.f52834e;
            int i15 = this.f52836g;
            int i16 = nVar.read(bArr2, i15, bArr2.length - i15);
            if (i16 != -1) {
                this.f52836g += i16;
            }
            long length = nVar.getLength();
            if (length != -1) {
                i11 = 0;
                if (this.f52836g == length) {
                    try {
                        j11 = this.f52839j;
                        if (j11 != -9223372036854775807L) {
                            jVar = new j(j11, true);
                        } else {
                            jVar = j.f52840c;
                        }
                        this.f52830a.j(this.f52834e, 0, this.f52836g, jVar, new hh.c(this, 27));
                        Collections.sort(arrayList);
                        this.f52838i = new long[arrayList.size()];
                        for (i12 = i11; i12 < arrayList.size(); i12++) {
                            this.f52838i[i12] = ((f) arrayList.get(i12)).f52828a;
                        }
                        this.f52834e = f0.f3976b;
                        this.f52837h = 4;
                    } catch (RuntimeException e8) {
                        throw ParserException.a(e8, "SubtitleParser failed.");
                    }
                }
            } else {
                i11 = 0;
            }
            if (i16 == -1) {
                j11 = this.f52839j;
                if (j11 != -9223372036854775807L) {
                    jVar = new j(j11, true);
                } else {
                    jVar = j.f52840c;
                }
                this.f52830a.j(this.f52834e, 0, this.f52836g, jVar, new hh.c(this, 27));
                Collections.sort(arrayList);
                this.f52838i = new long[arrayList.size()];
                while (i12 < arrayList.size()) {
                    this.f52838i[i12] = ((f) arrayList.get(i12)).f52828a;
                }
                this.f52834e = f0.f3976b;
                this.f52837h = 4;
            }
        } else {
            i11 = 0;
        }
        if (this.f52837h == 3) {
            if (nVar.m(nVar.getLength() != -1 ? Ints.b(nVar.getLength()) : 1024) == -1) {
                long j12 = this.f52839j;
                for (int iD = j12 == -9223372036854775807L ? i11 : f0.d(this.f52838i, j12, true); iD < arrayList.size(); iD++) {
                    a((f) arrayList.get(iD));
                }
                this.f52837h = 4;
            }
        }
        if (this.f52837h == 4) {
            return -1;
        }
        return i11;
    }

    @Override // x7.m
    public final void release() {
        if (this.f52837h == 5) {
            return;
        }
        this.f52830a.reset();
        this.f52837h = 5;
    }
}
