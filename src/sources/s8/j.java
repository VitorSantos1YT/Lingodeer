package s8;

import androidx.media3.common.ParserException;
import b7.v;
import bp.u3;
import com.google.common.collect.ImmutableList;
import dt.Xk.wuoM;
import java.util.ArrayList;
import java.util.Arrays;
import rt.m5;
import x7.w;
import y6.c0;
import y6.d0;
import y6.o;
import y6.p;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends i {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public a.a f51514n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f51515o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f51516p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public w f51517q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public m5 f51518r;

    @Override // s8.i
    public final void a(long j11) {
        this.f51508g = j11;
        this.f51516p = j11 != 0;
        w wVar = this.f51517q;
        this.f51515o = wVar != null ? wVar.f55953e : 0;
    }

    @Override // s8.i
    public final long b(b7.w wVar) {
        byte b3 = wVar.f4039a[0];
        if ((b3 & 1) == 1) {
            return -1L;
        }
        a.a aVar = this.f51514n;
        b7.a.k(aVar);
        int i11 = aVar.f5b;
        w wVar2 = (w) aVar.f6c;
        int i12 = !((u3[]) aVar.f9f)[(b3 >> 1) & (255 >>> (8 - i11))].f4841b ? wVar2.f55953e : wVar2.f55954f;
        long j11 = this.f51516p ? (this.f51515o + i12) / 4 : 0;
        byte[] bArr = wVar.f4039a;
        int length = bArr.length;
        int i13 = wVar.f4041c + 4;
        if (length < i13) {
            byte[] bArrCopyOf = Arrays.copyOf(bArr, i13);
            wVar.G(bArrCopyOf, bArrCopyOf.length);
        } else {
            wVar.H(i13);
        }
        byte[] bArr2 = wVar.f4039a;
        int i14 = wVar.f4041c;
        bArr2[i14 - 4] = (byte) (j11 & 255);
        bArr2[i14 - 3] = (byte) ((j11 >>> 8) & 255);
        bArr2[i14 - 2] = (byte) ((j11 >>> 16) & 255);
        bArr2[i14 - 1] = (byte) ((j11 >>> 24) & 255);
        this.f51516p = true;
        this.f51515o = i12;
        return j11;
    }

    @Override // s8.i
    public final void d(boolean z11) {
        super.d(z11);
        if (z11) {
            this.f51514n = null;
            this.f51517q = null;
            this.f51518r = null;
        }
        this.f51515o = 0;
        this.f51516p = false;
    }

    /* JADX WARN: Code duplicated, block: B:166:0x03ad A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:168:0x03b0  */
    /* JADX WARN: Type inference failed for: r1v59, types: [byte[], java.io.Serializable] */
    @Override // s8.i
    public final boolean c(b7.w wVar, long j11, qp.b bVar) throws ParserException {
        a.a aVar;
        if (this.f51514n != null) {
            ((p) bVar.f47832b).getClass();
            return false;
        }
        w wVar2 = this.f51517q;
        int i11 = 4;
        if (wVar2 != null) {
            m5 m5Var = this.f51518r;
            if (m5Var == null) {
                this.f51518r = x7.a.v(wVar, true, true);
            } else {
                int i12 = wVar.f4041c;
                byte[] bArr = new byte[i12];
                System.arraycopy(wVar.f4039a, 0, bArr, 0, i12);
                int i13 = wVar2.f55949a;
                int i14 = 5;
                x7.a.x(5, wVar, false);
                int iW = wVar.w() + 1;
                v vVar = new v(wVar.f4039a);
                int i15 = 8;
                vVar.t(wVar.f4040b * 8);
                int i16 = 0;
                while (true) {
                    int i17 = 16;
                    if (i16 < iW) {
                        int i18 = i15;
                        if (vVar.i(24) != 5653314) {
                            throw ParserException.a(null, wuoM.TZeGYN + ((vVar.f4034d * 8) + vVar.f4035e));
                        }
                        int i19 = vVar.i(16);
                        int i21 = vVar.i(24);
                        if (vVar.h()) {
                            vVar.t(i14);
                            int i22 = 0;
                            while (i22 < i21) {
                                int i23 = 0;
                                for (int i24 = i21 - i22; i24 > 0; i24 >>>= 1) {
                                    i23++;
                                }
                                i22 += vVar.i(i23);
                            }
                        } else {
                            boolean zH = vVar.h();
                            for (int i25 = 0; i25 < i21; i25++) {
                                if (!zH) {
                                    vVar.t(i14);
                                } else if (vVar.h()) {
                                    vVar.t(i14);
                                }
                            }
                        }
                        int i26 = vVar.i(4);
                        if (i26 > 2) {
                            throw ParserException.a(null, "lookup type greater than 2 not decodable: " + i26);
                        }
                        if (i26 == 1 || i26 == 2) {
                            vVar.t(32);
                            vVar.t(32);
                            int i27 = vVar.i(4) + 1;
                            vVar.t(1);
                            vVar.t((int) ((i26 == 1 ? i19 != 0 ? (long) Math.floor(Math.pow(i21, 1.0d / ((double) i19))) : 0L : ((long) i21) * ((long) i19)) * ((long) i27)));
                        }
                        i16++;
                        i15 = i18;
                        i14 = 5;
                    } else {
                        int i28 = i15;
                        int i29 = 6;
                        int i30 = vVar.i(6) + 1;
                        for (int i31 = 0; i31 < i30; i31++) {
                            if (vVar.i(16) != 0) {
                                throw ParserException.a(null, "placeholder of time domain transforms not zeroed out");
                            }
                        }
                        int i32 = 1;
                        int i33 = vVar.i(6) + 1;
                        int i34 = 0;
                        while (true) {
                            int i35 = 3;
                            if (i34 >= i33) {
                                int i36 = vVar.i(i29) + 1;
                                int i37 = 0;
                                while (i37 < i36) {
                                    if (vVar.i(16) > 2) {
                                        throw ParserException.a(null, "residueType greater than 2 is not decodable");
                                    }
                                    vVar.t(24);
                                    vVar.t(24);
                                    vVar.t(24);
                                    int i38 = vVar.i(i29) + 1;
                                    int i39 = 8;
                                    vVar.t(8);
                                    int[] iArr = new int[i38];
                                    for (int i40 = 0; i40 < i38; i40++) {
                                        iArr[i40] = ((vVar.h() ? vVar.i(5) : 0) * 8) + vVar.i(3);
                                    }
                                    int i41 = 0;
                                    while (i41 < i38) {
                                        int i42 = 0;
                                        while (i42 < i39) {
                                            if ((iArr[i41] & (1 << i42)) != 0) {
                                                vVar.t(i39);
                                            }
                                            i42++;
                                            i39 = 8;
                                        }
                                        i41++;
                                        i39 = 8;
                                    }
                                    i37++;
                                    i29 = 6;
                                }
                                int i43 = vVar.i(i29) + 1;
                                for (int i44 = 0; i44 < i43; i44++) {
                                    int i45 = vVar.i(16);
                                    if (i45 != 0) {
                                        b7.a.o("mapping type other than 0 not supported: " + i45);
                                    } else {
                                        int i46 = vVar.h() ? vVar.i(4) + 1 : 1;
                                        if (vVar.h()) {
                                            int i47 = vVar.i(8) + 1;
                                            for (int i48 = 0; i48 < i47; i48++) {
                                                int i49 = i13 - 1;
                                                int i50 = 0;
                                                for (int i51 = i49; i51 > 0; i51 >>>= 1) {
                                                    i50++;
                                                }
                                                vVar.t(i50);
                                                int i52 = 0;
                                                while (i49 > 0) {
                                                    i52++;
                                                    i49 >>>= 1;
                                                }
                                                vVar.t(i52);
                                            }
                                        }
                                        if (vVar.i(2) != 0) {
                                            throw ParserException.a(null, "to reserved bits must be zero after mapping coupling steps");
                                        }
                                        if (i46 > 1) {
                                            for (int i53 = 0; i53 < i13; i53++) {
                                                vVar.t(4);
                                            }
                                        }
                                        for (int i54 = 0; i54 < i46; i54++) {
                                            vVar.t(8);
                                            vVar.t(8);
                                            vVar.t(8);
                                        }
                                    }
                                }
                                int i55 = vVar.i(6);
                                int i56 = i55 + 1;
                                u3[] u3VarArr = new u3[i56];
                                for (int i57 = 0; i57 < i56; i57++) {
                                    boolean zH2 = vVar.h();
                                    vVar.i(16);
                                    vVar.i(16);
                                    vVar.i(8);
                                    u3VarArr[i57] = new u3(zH2, 5);
                                }
                                if (!vVar.h()) {
                                    throw ParserException.a(null, "framing bit after modes not set as expected");
                                }
                                int i58 = 0;
                                while (i55 > 0) {
                                    i58++;
                                    i55 >>>= 1;
                                }
                                aVar = new a.a(wVar2, m5Var, bArr, u3VarArr, i58);
                                break;
                            }
                            int i59 = vVar.i(i17);
                            if (i59 == 0) {
                                int i60 = i28;
                                vVar.t(i60);
                                vVar.t(16);
                                vVar.t(16);
                                vVar.t(6);
                                vVar.t(i60);
                                int i61 = vVar.i(4) + 1;
                                int i62 = 0;
                                while (i62 < i61) {
                                    vVar.t(i60);
                                    i62++;
                                    i60 = 8;
                                }
                            } else {
                                if (i59 != i32) {
                                    throw ParserException.a(null, "floor type greater than 1 not decodable: " + i59);
                                }
                                int i63 = vVar.i(5);
                                int[] iArr2 = new int[i63];
                                int i64 = -1;
                                for (int i65 = 0; i65 < i63; i65++) {
                                    int i66 = vVar.i(i11);
                                    iArr2[i65] = i66;
                                    if (i66 > i64) {
                                        i64 = i66;
                                    }
                                }
                                int i67 = i64 + 1;
                                int[] iArr3 = new int[i67];
                                int i68 = 0;
                                while (i68 < i67) {
                                    iArr3[i68] = vVar.i(i35) + 1;
                                    int i69 = vVar.i(2);
                                    int i70 = i28;
                                    if (i69 > 0) {
                                        vVar.t(i70);
                                    }
                                    int[] iArr4 = iArr3;
                                    int i71 = 0;
                                    for (int i72 = 1; i71 < (i72 << i69); i72 = 1) {
                                        vVar.t(i70);
                                        i71++;
                                        i70 = 8;
                                    }
                                    i68++;
                                    iArr3 = iArr4;
                                    i28 = 8;
                                    i35 = 3;
                                }
                                int[] iArr5 = iArr3;
                                vVar.t(2);
                                int i73 = vVar.i(4);
                                int i74 = 0;
                                int i75 = 0;
                                for (int i76 = 0; i76 < i63; i76++) {
                                    i74 += iArr5[iArr2[i76]];
                                    while (i75 < i74) {
                                        vVar.t(i73);
                                        i75++;
                                    }
                                }
                            }
                            i34++;
                            i28 = 8;
                            i29 = 6;
                            i11 = 4;
                            i17 = 16;
                            i32 = 1;
                        }
                    }
                }
            }
            this.f51514n = aVar;
            if (aVar == null) {
                return true;
            }
            w wVar3 = (w) aVar.f6c;
            ArrayList arrayList = new ArrayList();
            arrayList.add((byte[]) wVar3.f55955g);
            arrayList.add((byte[]) aVar.f8e);
            c0 c0VarR = x7.a.r(ImmutableList.o((String[]) ((m5) aVar.f7d).f50058b));
            o oVar = new o();
            oVar.f57264l = d0.o("audio/ogg");
            oVar.m = d0.o("audio/vorbis");
            oVar.f57260h = wVar3.f55952d;
            oVar.f57261i = wVar3.f55951c;
            oVar.E = wVar3.f55949a;
            oVar.F = wVar3.f55950b;
            oVar.f57267p = arrayList;
            oVar.f57263k = c0VarR;
            bVar.f47832b = new p(oVar);
            return true;
        }
        x7.a.x(1, wVar, false);
        wVar.o();
        int iW2 = wVar.w();
        int iO = wVar.o();
        int iL = wVar.l();
        if (iL <= 0) {
            iL = -1;
        }
        int iL2 = wVar.l();
        int i77 = iL2 > 0 ? iL2 : -1;
        wVar.l();
        int iW3 = wVar.w();
        int iPow = (int) Math.pow(2.0d, iW3 & 15);
        int iPow2 = (int) Math.pow(2.0d, (iW3 & 240) >> 4);
        wVar.w();
        ?? CopyOf = Arrays.copyOf(wVar.f4039a, wVar.f4041c);
        w wVar4 = new w();
        wVar4.f55949a = iW2;
        wVar4.f55950b = iO;
        wVar4.f55951c = iL;
        wVar4.f55952d = i77;
        wVar4.f55953e = iPow;
        wVar4.f55954f = iPow2;
        wVar4.f55955g = CopyOf;
        this.f51517q = wVar4;
        aVar = null;
        this.f51514n = aVar;
        if (aVar == null) {
            return true;
        }
        w wVar5 = (w) aVar.f6c;
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add((byte[]) wVar5.f55955g);
        arrayList2.add((byte[]) aVar.f8e);
        c0 c0VarR2 = x7.a.r(ImmutableList.o((String[]) ((m5) aVar.f7d).f50058b));
        o oVar2 = new o();
        oVar2.f57264l = d0.o("audio/ogg");
        oVar2.m = d0.o("audio/vorbis");
        oVar2.f57260h = wVar5.f55952d;
        oVar2.f57261i = wVar5.f55951c;
        oVar2.E = wVar5.f55949a;
        oVar2.F = wVar5.f55950b;
        oVar2.f57267p = arrayList2;
        oVar2.f57263k = c0VarR2;
        bVar.f47832b = new p(oVar2);
        return true;
    }
}
