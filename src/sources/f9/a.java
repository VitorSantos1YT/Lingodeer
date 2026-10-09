package f9;

import androidx.media3.common.ParserException;
import b7.f0;
import b7.p;
import b7.w;
import java.math.RoundingMode;
import x7.e0;
import x7.n;
import x7.o;
import y6.d0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements b {
    public static final int[] m = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int[] f26992n = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, 118, 130, 143, 157, 173, 190, 209, 230, 253, 279, 307, 337, 371, 408, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f26993a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e0 f26994b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p f26995c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f26996d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[] f26997e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final w f26998f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f26999g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final y6.p f27000h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f27001i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f27002j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f27003k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f27004l;

    public a(o oVar, e0 e0Var, p pVar) throws ParserException {
        this.f26993a = oVar;
        this.f26994b = e0Var;
        this.f26995c = pVar;
        int i11 = pVar.f4017c;
        int iMax = Math.max(1, i11 / 10);
        this.f26999g = iMax;
        w wVar = new w((byte[]) pVar.f4020f);
        wVar.p();
        int iP = wVar.p();
        this.f26996d = iP;
        int i12 = pVar.f4016b;
        int i13 = pVar.f4018d;
        int i14 = (((i13 - (i12 * 4)) * 8) / (pVar.f4019e * i12)) + 1;
        if (iP != i14) {
            throw ParserException.a(null, "Expected frames per block: " + i14 + "; got: " + iP);
        }
        int iE = f0.e(iMax, iP);
        this.f26997e = new byte[iE * i13];
        this.f26998f = new w(iP * 2 * i12 * iE);
        int i15 = ((i13 * i11) * 8) / iP;
        y6.o oVar2 = new y6.o();
        oVar2.m = d0.o("audio/raw");
        oVar2.f57260h = i15;
        oVar2.f57261i = i15;
        oVar2.f57265n = iMax * 2 * i12;
        oVar2.E = i12;
        oVar2.F = i11;
        oVar2.G = 2;
        this.f27000h = new y6.p(oVar2);
    }

    @Override // f9.b
    public final void a(long j11) {
        this.f27001i = 0;
        this.f27002j = j11;
        this.f27003k = 0;
        this.f27004l = 0L;
    }

    @Override // f9.b
    public final void b(int i11, long j11) {
        this.f26993a.q(new g(this.f26995c, this.f26996d, i11, j11));
        y6.p pVar = this.f27000h;
        e0 e0Var = this.f26994b;
        e0Var.b(pVar);
        e0Var.getClass();
    }

    /* JADX WARN: Code duplicated, block: B:16:0x004a  */
    /* JADX WARN: Code duplicated, block: B:19:0x004f  */
    /* JADX WARN: Code duplicated, block: B:22:0x0054  */
    /* JADX WARN: Code duplicated, block: B:25:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:27:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:28:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:31:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:37:0x0135  */
    /* JADX WARN: Code duplicated, block: B:43:0x0045 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:47:0x010b A[EDGE_INSN: B:47:0x010b->B:35:0x010b BREAK  A[LOOP:1: B:17:0x004b->B:34:0x0101], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:51:0x00cd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x0027  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x003c -> B:4:0x0020). Please report as a decompilation issue!!! */
    @Override // f9.b
    public final boolean c(n nVar, long j11) {
        byte[] bArr;
        int i11;
        int i12;
        int i13;
        w wVar;
        int i14;
        int i15;
        int i16;
        byte[] bArr2;
        int i17;
        int i18;
        int iG;
        int iMin;
        int[] iArr;
        int i19;
        int i21;
        int i22;
        byte b3;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29 = this.f27003k;
        p pVar = this.f26995c;
        int i30 = i29 / (pVar.f4016b * 2);
        int i31 = this.f26999g;
        int i32 = this.f26996d;
        int iE = f0.e(i31 - i30, i32);
        int i33 = pVar.f4018d;
        int i34 = iE * i33;
        boolean z11 = j11 == 0;
        while (true) {
            bArr = this.f26997e;
            if (z11 && (i27 = this.f27001i) < i34) {
                i28 = nVar.read(bArr, this.f27001i, (int) Math.min(i34 - i27, j11));
                if (i28 == -1) {
                    break;
                }
                this.f27001i += i28;
                bArr = this.f26997e;
                if (z11) {
                }
            }
            i11 = this.f27001i / i33;
            if (i11 > 0) {
                i13 = 0;
                while (true) {
                    wVar = this.f26998f;
                    if (i13 < i11) {
                        break;
                    }
                    i15 = 0;
                    while (true) {
                        i16 = pVar.f4016b;
                        if (i15 < i16) {
                            bArr2 = wVar.f4039a;
                            int i35 = (i15 * 4) + (i13 * i33);
                            i17 = (i16 * 4) + i35;
                            i18 = (i33 / i16) - 4;
                            iG = (short) ((bArr[i35] & 255) | ((bArr[i35 + 1] & 255) << 8));
                            int i36 = i11;
                            iMin = Math.min(bArr[i35 + 2] & 255, 88);
                            iArr = f26992n;
                            i19 = iArr[iMin];
                            i21 = ((i13 * i32 * i16) + i15) * 2;
                            bArr2[i21] = (byte) (iG & 255);
                            bArr2[i21 + 1] = (byte) (iG >> 8);
                            int i37 = i13;
                            i22 = 0;
                            while (i22 < i18 * 2) {
                                b3 = bArr[((i22 / 8) * i16 * 4) + i17 + ((i22 / 2) % 4)];
                                i23 = i22;
                                i24 = b3 & 255;
                                if (i23 % 2 == 0) {
                                    i25 = b3 & 15;
                                } else {
                                    i25 = i24 >> 4;
                                }
                                i26 = ((((i25 & 7) * 2) + 1) * i19) >> 3;
                                if ((i25 & 8) != 0) {
                                    i26 = -i26;
                                }
                                iG = f0.g(iG + i26, -32768, 32767);
                                i21 = (i16 * 2) + i21;
                                bArr2[i21] = (byte) (iG & 255);
                                bArr2[i21 + 1] = (byte) (iG >> 8);
                                iMin = f0.g(iMin + m[i25], 0, 88);
                                i19 = iArr[iMin];
                                i22 = i23 + 1;
                            }
                            i15++;
                            i11 = i36;
                            i13 = i37;
                        }
                    }
                    i13++;
                }
                int i38 = i11;
                int i39 = i32 * i38 * 2 * pVar.f4016b;
                wVar.I(0);
                wVar.H(i39);
                this.f27001i -= i38 * i33;
                int i40 = wVar.f4041c;
                this.f26994b.a(wVar, i40, 0);
                i14 = this.f27003k + i40;
                this.f27003k = i14;
                if (i14 / (pVar.f4016b * 2) >= i31) {
                    d(i31);
                }
            }
            if (z11 && (i12 = this.f27003k / (pVar.f4016b * 2)) > 0) {
                d(i12);
            }
            return z11;
        }
        while (true) {
            bArr = this.f26997e;
            if (z11) {
            }
            i11 = this.f27001i / i33;
            if (i11 > 0) {
                i13 = 0;
                while (true) {
                    wVar = this.f26998f;
                    if (i13 < i11) {
                        break;
                        break;
                    }
                    i15 = 0;
                    while (true) {
                        i16 = pVar.f4016b;
                        if (i15 < i16) {
                            bArr2 = wVar.f4039a;
                            int i310 = (i15 * 4) + (i13 * i33);
                            i17 = (i16 * 4) + i310;
                            i18 = (i33 / i16) - 4;
                            iG = (short) ((bArr[i310] & 255) | ((bArr[i310 + 1] & 255) << 8));
                            int i311 = i11;
                            iMin = Math.min(bArr[i310 + 2] & 255, 88);
                            iArr = f26992n;
                            i19 = iArr[iMin];
                            i21 = ((i13 * i32 * i16) + i15) * 2;
                            bArr2[i21] = (byte) (iG & 255);
                            bArr2[i21 + 1] = (byte) (iG >> 8);
                            int i312 = i13;
                            i22 = 0;
                            while (i22 < i18 * 2) {
                                b3 = bArr[((i22 / 8) * i16 * 4) + i17 + ((i22 / 2) % 4)];
                                i23 = i22;
                                i24 = b3 & 255;
                                if (i23 % 2 == 0) {
                                    i25 = b3 & 15;
                                } else {
                                    i25 = i24 >> 4;
                                }
                                i26 = ((((i25 & 7) * 2) + 1) * i19) >> 3;
                                if ((i25 & 8) != 0) {
                                    i26 = -i26;
                                }
                                iG = f0.g(iG + i26, -32768, 32767);
                                i21 = (i16 * 2) + i21;
                                bArr2[i21] = (byte) (iG & 255);
                                bArr2[i21 + 1] = (byte) (iG >> 8);
                                iMin = f0.g(iMin + m[i25], 0, 88);
                                i19 = iArr[iMin];
                                i22 = i23 + 1;
                            }
                            i15++;
                            i11 = i311;
                            i13 = i312;
                        }
                    }
                    i13++;
                }
                int i313 = i11;
                int i314 = i32 * i313 * 2 * pVar.f4016b;
                wVar.I(0);
                wVar.H(i314);
                this.f27001i -= i313 * i33;
                int i41 = wVar.f4041c;
                this.f26994b.a(wVar, i41, 0);
                i14 = this.f27003k + i41;
                this.f27003k = i14;
                if (i14 / (pVar.f4016b * 2) >= i31) {
                    d(i31);
                }
            }
            if (z11) {
                d(i12);
            }
            return z11;
            this.f27001i += i28;
        }
    }

    public final void d(int i11) {
        long j11 = this.f27002j;
        long j12 = this.f27004l;
        p pVar = this.f26995c;
        long j13 = pVar.f4017c;
        String str = f0.f3975a;
        long jR = j11 + f0.R(j12, 1000000L, j13, RoundingMode.DOWN);
        int i12 = i11 * 2 * pVar.f4016b;
        this.f26994b.d(jR, 1, i12, this.f27003k - i12, null);
        this.f27004l += (long) i11;
        this.f27003k -= i12;
    }
}
