package f9;

import android.util.Pair;
import androidx.media3.common.ParserException;
import b7.f0;
import b7.p;
import b7.w;
import java.nio.ByteOrder;
import java.util.Arrays;
import x7.e0;
import x7.m;
import x7.n;
import x7.o;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public o f27013a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public e0 f27014b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public b f27017e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f27015c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f27016d = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f27018f = -1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f27019g = -1;

    @Override // x7.m
    public final boolean c(n nVar) {
        return f.a(nVar);
    }

    @Override // x7.m
    public final void e(o oVar) {
        this.f27013a = oVar;
        this.f27014b = oVar.v(0, 1);
        oVar.o();
    }

    @Override // x7.m
    public final void f(long j11, long j12) {
        this.f27015c = j11 == 0 ? 0 : 4;
        b bVar = this.f27017e;
        if (bVar != null) {
            bVar.a(j12);
        }
    }

    /* JADX WARN: Code duplicated, block: B:83:0x0226  */
    @Override // x7.m
    public final int g(n nVar, kw.b bVar) throws ParserException {
        byte[] bArr;
        int i11;
        b7.a.k(this.f27014b);
        String str = f0.f3975a;
        int i12 = this.f27015c;
        int iW = 4;
        if (i12 == 0) {
            b7.a.j(nVar.getPosition() == 0);
            int i13 = this.f27018f;
            if (i13 != -1) {
                nVar.s(i13);
                this.f27015c = 4;
                return 0;
            }
            if (!f.a(nVar)) {
                throw ParserException.a(null, "Unsupported or unrecognized wav file type.");
            }
            nVar.s((int) (nVar.i() - nVar.getPosition()));
            this.f27015c = 1;
            return 0;
        }
        long jM = -1;
        if (i12 == 1) {
            w wVar = new w(8);
            e eVarA = e.a(nVar, wVar);
            if (eVarA.f27021b != 1685272116) {
                nVar.r();
            } else {
                nVar.k(8);
                wVar.I(0);
                nVar.A(wVar.f4039a, 0, 8);
                jM = wVar.m();
                nVar.s(((int) eVarA.f27020a) + 8);
            }
            this.f27016d = jM;
            this.f27015c = 2;
            return 0;
        }
        if (i12 != 2) {
            if (i12 != 3) {
                if (i12 != 4) {
                    throw new IllegalStateException();
                }
                b7.a.j(this.f27019g != -1);
                long position = this.f27019g - nVar.getPosition();
                b bVar2 = this.f27017e;
                bVar2.getClass();
                return bVar2.c(nVar, position) ? -1 : 0;
            }
            nVar.r();
            e eVarB = f.b(1684108385, nVar, new w(8));
            nVar.s(8);
            Pair pairCreate = Pair.create(Long.valueOf(nVar.getPosition()), Long.valueOf(eVarB.f27020a));
            this.f27018f = ((Long) pairCreate.first).intValue();
            long jLongValue = ((Long) pairCreate.second).longValue();
            long j11 = this.f27016d;
            if (j11 != -1 && jLongValue == 4294967295L) {
                jLongValue = j11;
            }
            this.f27019g = ((long) this.f27018f) + jLongValue;
            long length = nVar.getLength();
            if (length != -1 && this.f27019g > length) {
                b7.a.B("Data exceeds input length: " + this.f27019g + ", " + length);
                this.f27019g = length;
            }
            b bVar3 = this.f27017e;
            bVar3.getClass();
            bVar3.b(this.f27018f, this.f27019g);
            this.f27015c = 4;
            return 0;
        }
        w wVar2 = new w(16);
        long j12 = f.b(1718449184, nVar, wVar2).f27020a;
        b7.a.j(j12 >= 16);
        nVar.A(wVar2.f4039a, 0, 16);
        wVar2.I(0);
        int iP = wVar2.p();
        int iP2 = wVar2.p();
        int iO = wVar2.o();
        wVar2.o();
        int iP3 = wVar2.p();
        int iP4 = wVar2.p();
        int i14 = ((int) j12) - 16;
        if (i14 > 0) {
            bArr = new byte[i14];
            nVar.A(bArr, 0, i14);
            if (iP == 65534 && i14 == 24) {
                w wVar3 = new w(bArr);
                wVar3.p();
                int iP5 = wVar3.p();
                if (iP5 != 0 && iP5 != iP4) {
                    throw ParserException.c("validBits ( " + iP5 + ")  != bitsPerSample( " + iP4 + ") are not supported");
                }
                int iO2 = wVar3.o();
                if ((iO2 >> 18) != 0) {
                    throw ParserException.c("invalid channel mask " + iO2);
                }
                if (iO2 != 0 && Integer.bitCount(iO2) != iP2) {
                    throw ParserException.c("invalid number of channels (" + Integer.bitCount(iO2) + ") in channel mask " + iO2);
                }
                iP = wVar3.p();
                byte[] bArr2 = new byte[14];
                wVar3.h(bArr2, 0, 14);
                if (!Arrays.equals(bArr2, f.f27022a) && !Arrays.equals(bArr2, f.f27023b)) {
                    throw ParserException.c("invalid wav format extension guid");
                }
            }
        } else {
            bArr = f0.f3976b;
        }
        byte[] bArr3 = bArr;
        int i15 = iP;
        nVar.s((int) (nVar.i() - nVar.getPosition()));
        p pVar = new p(i15, iP2, iO, iP3, iP4, bArr3);
        if (i15 == 17) {
            this.f27017e = new a(this.f27013a, this.f27014b, pVar);
        } else if (i15 == 6) {
            this.f27017e = new c(this.f27013a, this.f27014b, pVar, "audio/g711-alaw", -1);
        } else if (i15 == 7) {
            this.f27017e = new c(this.f27013a, this.f27014b, pVar, "audio/g711-mlaw", -1);
        } else {
            if (i15 == 1) {
                iW = f0.w(iP4, ByteOrder.LITTLE_ENDIAN);
                i11 = iW;
            } else {
                if (i15 != 3) {
                    if (i15 == 65534) {
                        iW = f0.w(iP4, ByteOrder.LITTLE_ENDIAN);
                        i11 = iW;
                    }
                } else if (iP4 == 32) {
                    i11 = iW;
                }
                i11 = 0;
            }
            if (i11 == 0) {
                throw ParserException.c("Unsupported WAV format type: " + i15);
            }
            this.f27017e = new c(this.f27013a, this.f27014b, pVar, "audio/raw", i11);
        }
        this.f27015c = 3;
        return 0;
    }

    @Override // x7.m
    public final void release() {
    }
}
