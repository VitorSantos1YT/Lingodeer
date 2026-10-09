package p7;

import android.media.MediaCodec;
import b0.p2;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t7.g f46522a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f46523b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b7.w f46524c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public p2 f46525d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public p2 f46526e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public p2 f46527f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f46528g;

    public w0(t7.g gVar) {
        this.f46522a = gVar;
        int i11 = gVar.f52061b;
        this.f46523b = i11;
        this.f46524c = new b7.w(32);
        p2 p2Var = new p2(0L, i11);
        this.f46525d = p2Var;
        this.f46526e = p2Var;
        this.f46527f = p2Var;
    }

    public static p2 d(p2 p2Var, long j11, ByteBuffer byteBuffer, int i11) {
        while (j11 >= p2Var.f3637b) {
            p2Var = (p2) p2Var.f3639d;
        }
        while (i11 > 0) {
            int iMin = Math.min(i11, (int) (p2Var.f3637b - j11));
            t7.a aVar = (t7.a) p2Var.f3638c;
            byteBuffer.put(aVar.f52049a, ((int) (j11 - p2Var.f3636a)) + aVar.f52050b, iMin);
            i11 -= iMin;
            j11 += (long) iMin;
            if (j11 == p2Var.f3637b) {
                p2Var = (p2) p2Var.f3639d;
            }
        }
        return p2Var;
    }

    public static p2 e(p2 p2Var, long j11, byte[] bArr, int i11) {
        while (j11 >= p2Var.f3637b) {
            p2Var = (p2) p2Var.f3639d;
        }
        int i12 = i11;
        while (i12 > 0) {
            int iMin = Math.min(i12, (int) (p2Var.f3637b - j11));
            t7.a aVar = (t7.a) p2Var.f3638c;
            System.arraycopy(aVar.f52049a, ((int) (j11 - p2Var.f3636a)) + aVar.f52050b, bArr, i11 - i12, iMin);
            i12 -= iMin;
            j11 += (long) iMin;
            if (j11 == p2Var.f3637b) {
                p2Var = (p2) p2Var.f3639d;
            }
        }
        return p2Var;
    }

    public static p2 f(p2 p2Var, e7.d dVar, l7.e eVar, b7.w wVar) {
        if (dVar.e(1073741824)) {
            long j11 = eVar.f39781b;
            int iC = 1;
            wVar.F(1);
            p2 p2VarE = e(p2Var, j11, wVar.f4039a, 1);
            long j12 = j11 + 1;
            byte b3 = wVar.f4039a[0];
            boolean z11 = (b3 & 128) != 0;
            int i11 = b3 & 127;
            e7.b bVar = dVar.f25114d;
            byte[] bArr = bVar.f25103a;
            if (bArr == null) {
                bVar.f25103a = new byte[16];
            } else {
                Arrays.fill(bArr, (byte) 0);
            }
            p2Var = e(p2VarE, j12, bVar.f25103a, i11);
            long j13 = j12 + ((long) i11);
            if (z11) {
                wVar.F(2);
                p2Var = e(p2Var, j13, wVar.f4039a, 2);
                j13 += 2;
                iC = wVar.C();
            }
            int[] iArr = bVar.f25106d;
            if (iArr == null || iArr.length < iC) {
                iArr = new int[iC];
            }
            int[] iArr2 = bVar.f25107e;
            if (iArr2 == null || iArr2.length < iC) {
                iArr2 = new int[iC];
            }
            if (z11) {
                int i12 = iC * 6;
                wVar.F(i12);
                p2Var = e(p2Var, j13, wVar.f4039a, i12);
                j13 += (long) i12;
                wVar.I(0);
                for (int i13 = 0; i13 < iC; i13++) {
                    iArr[i13] = wVar.C();
                    iArr2[i13] = wVar.A();
                }
            } else {
                iArr[0] = 0;
                iArr2[0] = eVar.f39780a - ((int) (j13 - eVar.f39781b));
            }
            x7.d0 d0Var = (x7.d0) eVar.f39782c;
            String str = b7.f0.f3975a;
            byte[] bArr2 = d0Var.f55870b;
            byte[] bArr3 = bVar.f25103a;
            int i14 = d0Var.f55869a;
            int i15 = d0Var.f55871c;
            int i16 = d0Var.f55872d;
            bVar.f25108f = iC;
            bVar.f25106d = iArr;
            bVar.f25107e = iArr2;
            bVar.f25104b = bArr2;
            bVar.f25103a = bArr3;
            bVar.f25105c = i14;
            bVar.f25109g = i15;
            bVar.f25110h = i16;
            MediaCodec.CryptoInfo cryptoInfo = bVar.f25111i;
            cryptoInfo.numSubSamples = iC;
            cryptoInfo.numBytesOfClearData = iArr;
            cryptoInfo.numBytesOfEncryptedData = iArr2;
            cryptoInfo.key = bArr2;
            cryptoInfo.iv = bArr3;
            cryptoInfo.mode = i14;
            ob.u uVar = bVar.f25112j;
            uVar.getClass();
            MediaCodec.CryptoInfo.Pattern pattern = (MediaCodec.CryptoInfo.Pattern) uVar.f44892c;
            pattern.set(i15, i16);
            ((MediaCodec.CryptoInfo) uVar.f44891b).setPattern(pattern);
            long j14 = eVar.f39781b;
            int i17 = (int) (j13 - j14);
            eVar.f39781b = j14 + ((long) i17);
            eVar.f39780a -= i17;
        }
        if (!dVar.e(268435456)) {
            dVar.q(eVar.f39780a);
            return d(p2Var, eVar.f39781b, dVar.f25115e, eVar.f39780a);
        }
        wVar.F(4);
        p2 p2VarE2 = e(p2Var, eVar.f39781b, wVar.f4039a, 4);
        int iA = wVar.A();
        eVar.f39781b += 4;
        eVar.f39780a -= 4;
        dVar.q(iA);
        p2 p2VarD = d(p2VarE2, eVar.f39781b, dVar.f25115e, iA);
        eVar.f39781b += (long) iA;
        int i18 = eVar.f39780a - iA;
        eVar.f39780a = i18;
        ByteBuffer byteBuffer = dVar.H;
        if (byteBuffer == null || byteBuffer.capacity() < i18) {
            dVar.H = ByteBuffer.allocate(i18);
        } else {
            dVar.H.clear();
        }
        return d(p2VarD, eVar.f39781b, dVar.H, eVar.f39780a);
    }

    public final void a(p2 p2Var) {
        if (((t7.a) p2Var.f3638c) == null) {
            return;
        }
        t7.g gVar = this.f46522a;
        synchronized (gVar) {
            p2 p2Var2 = p2Var;
            while (p2Var2 != null) {
                try {
                    t7.a[] aVarArr = gVar.f52065f;
                    int i11 = gVar.f52064e;
                    gVar.f52064e = i11 + 1;
                    t7.a aVar = (t7.a) p2Var2.f3638c;
                    aVar.getClass();
                    aVarArr[i11] = aVar;
                    gVar.f52063d--;
                    p2Var2 = (p2) p2Var2.f3639d;
                    if (p2Var2 == null || ((t7.a) p2Var2.f3638c) == null) {
                        p2Var2 = null;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            gVar.notifyAll();
        }
        p2Var.f3638c = null;
        p2Var.f3639d = null;
    }

    public final void b(long j11) {
        p2 p2Var;
        if (j11 == -1) {
            return;
        }
        while (true) {
            p2Var = this.f46525d;
            if (j11 < p2Var.f3637b) {
                break;
            }
            t7.g gVar = this.f46522a;
            t7.a aVar = (t7.a) p2Var.f3638c;
            synchronized (gVar) {
                t7.a[] aVarArr = gVar.f52065f;
                int i11 = gVar.f52064e;
                gVar.f52064e = i11 + 1;
                aVarArr[i11] = aVar;
                gVar.f52063d--;
                gVar.notifyAll();
            }
            p2 p2Var2 = this.f46525d;
            p2Var2.f3638c = null;
            p2 p2Var3 = (p2) p2Var2.f3639d;
            p2Var2.f3639d = null;
            this.f46525d = p2Var3;
        }
        if (this.f46526e.f3636a < p2Var.f3636a) {
            this.f46526e = p2Var;
        }
    }

    public final int c(int i11) {
        t7.a aVar;
        p2 p2Var = this.f46527f;
        if (((t7.a) p2Var.f3638c) == null) {
            t7.g gVar = this.f46522a;
            synchronized (gVar) {
                try {
                    int i12 = gVar.f52063d + 1;
                    gVar.f52063d = i12;
                    int i13 = gVar.f52064e;
                    if (i13 > 0) {
                        t7.a[] aVarArr = gVar.f52065f;
                        int i14 = i13 - 1;
                        gVar.f52064e = i14;
                        aVar = aVarArr[i14];
                        aVar.getClass();
                        gVar.f52065f[gVar.f52064e] = null;
                    } else {
                        t7.a aVar2 = new t7.a(new byte[gVar.f52061b], 0);
                        t7.a[] aVarArr2 = gVar.f52065f;
                        if (i12 > aVarArr2.length) {
                            gVar.f52065f = (t7.a[]) Arrays.copyOf(aVarArr2, aVarArr2.length * 2);
                        }
                        aVar = aVar2;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            p2 p2Var2 = new p2(this.f46527f.f3637b, this.f46523b);
            p2Var.f3638c = aVar;
            p2Var.f3639d = p2Var2;
        }
        return Math.min(i11, (int) (this.f46527f.f3637b - this.f46528g));
    }
}
