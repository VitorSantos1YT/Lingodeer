package l8;

import b7.f0;
import b7.v;
import b7.w;
import com.google.common.base.Ascii;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableListIterator;
import com.tbruyelle.rxpermissions3.BuildConfig;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import y6.c0;
import y6.d0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class i extends android.support.v4.media.session.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final h2.d f39823b = new h2.d(19);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f39824a;

    public i(g gVar) {
        this.f39824a = gVar;
    }

    public static a O(w wVar, int i11, int i12) {
        int iG0;
        String strConcat;
        int iW = wVar.w();
        Charset charsetD0 = d0(iW);
        int i13 = i11 - 1;
        byte[] bArr = new byte[i13];
        wVar.h(bArr, 0, i13);
        if (i12 == 2) {
            strConcat = "image/" + Ascii.c(new String(bArr, 0, 3, StandardCharsets.ISO_8859_1));
            if ("image/jpg".equals(strConcat)) {
                strConcat = "image/jpeg";
            }
            iG0 = 2;
        } else {
            iG0 = g0(bArr, 0);
            String strC = Ascii.c(new String(bArr, 0, iG0, StandardCharsets.ISO_8859_1));
            strConcat = strC.indexOf(47) == -1 ? "image/".concat(strC) : strC;
        }
        int i14 = bArr[iG0 + 1] & 255;
        int i15 = iG0 + 2;
        int iF0 = f0(bArr, i15, iW);
        String str = new String(bArr, i15, iF0 - i15, charsetD0);
        int iC0 = c0(iW) + iF0;
        return new a(i14, strConcat, str, i13 <= iC0 ? f0.f3976b : Arrays.copyOfRange(bArr, iC0, i13));
    }

    public static c P(w wVar, int i11, int i12, boolean z11, int i13, g gVar) throws Throwable {
        int i14 = wVar.f4040b;
        int iG0 = g0(wVar.f4039a, i14);
        String str = new String(wVar.f4039a, i14, iG0 - i14, StandardCharsets.ISO_8859_1);
        wVar.I(iG0 + 1);
        int iJ = wVar.j();
        int iJ2 = wVar.j();
        long jY = wVar.y();
        if (jY == 4294967295L) {
            jY = -1;
        }
        long jY2 = wVar.y();
        long j11 = jY2 == 4294967295L ? -1L : jY2;
        ArrayList arrayList = new ArrayList();
        int i15 = i14 + i11;
        while (wVar.f4040b < i15) {
            j jVarS = S(i12, wVar, z11, i13, gVar);
            if (jVarS != null) {
                arrayList.add(jVarS);
            }
        }
        return new c(str, iJ, iJ2, jY, j11, (j[]) arrayList.toArray(new j[0]));
    }

    public static d Q(w wVar, int i11, int i12, boolean z11, int i13, g gVar) throws Throwable {
        int i14 = wVar.f4040b;
        int iG0 = g0(wVar.f4039a, i14);
        String str = new String(wVar.f4039a, i14, iG0 - i14, StandardCharsets.ISO_8859_1);
        wVar.I(iG0 + 1);
        int iW = wVar.w();
        boolean z12 = (iW & 2) != 0;
        boolean z13 = (iW & 1) != 0;
        int iW2 = wVar.w();
        String[] strArr = new String[iW2];
        for (int i15 = 0; i15 < iW2; i15++) {
            int i16 = wVar.f4040b;
            int iG1 = g0(wVar.f4039a, i16);
            strArr[i15] = new String(wVar.f4039a, i16, iG1 - i16, StandardCharsets.ISO_8859_1);
            wVar.I(iG1 + 1);
        }
        ArrayList arrayList = new ArrayList();
        int i17 = i14 + i11;
        while (wVar.f4040b < i17) {
            j jVarS = S(i12, wVar, z11, i13, gVar);
            if (jVarS != null) {
                arrayList.add(jVarS);
            }
        }
        return new d(str, z12, z13, strArr, (j[]) arrayList.toArray(new j[0]));
    }

    public static e R(int i11, w wVar) {
        if (i11 < 4) {
            return null;
        }
        int iW = wVar.w();
        Charset charsetD0 = d0(iW);
        byte[] bArr = new byte[3];
        wVar.h(bArr, 0, 3);
        String str = new String(bArr, 0, 3);
        int i12 = i11 - 4;
        byte[] bArr2 = new byte[i12];
        wVar.h(bArr2, 0, i12);
        int iF0 = f0(bArr2, 0, iW);
        String str2 = new String(bArr2, 0, iF0, charsetD0);
        int iC0 = c0(iW) + iF0;
        return new e(str, str2, W(bArr2, iC0, f0(bArr2, iC0, iW), charsetD0));
    }

    /* JADX WARN: Code duplicated, block: B:194:0x023b  */
    /* JADX WARN: Instruction removed from duplicated block: B:194:0x023b, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v2, types: [l8.j] */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v10, types: [b7.w] */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r1v28, types: [b7.w] */
    /* JADX WARN: Type inference failed for: r1v29 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v30 */
    /* JADX WARN: Type inference failed for: r1v32 */
    /* JADX WARN: Type inference failed for: r1v33 */
    /* JADX WARN: Type inference failed for: r1v34 */
    /* JADX WARN: Type inference failed for: r1v35 */
    /* JADX WARN: Type inference failed for: r1v36 */
    /* JADX WARN: Type inference failed for: r1v37 */
    /* JADX WARN: Type inference failed for: r1v38 */
    /* JADX WARN: Type inference failed for: r1v39 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v40 */
    /* JADX WARN: Type inference failed for: r1v41 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v9, types: [b7.w] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12, types: [int] */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14, types: [int] */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v25 */
    /* JADX WARN: Type inference failed for: r8v26 */
    /* JADX WARN: Type inference failed for: r8v27 */
    /* JADX WARN: Type inference failed for: r8v28 */
    /* JADX WARN: Type inference failed for: r8v29 */
    /* JADX WARN: Type inference failed for: r8v30 */
    /* JADX WARN: Type inference failed for: r8v9 */
    public static j S(int i11, w wVar, boolean z11, int i12, g gVar) throws Throwable {
        int iA;
        ?? r9;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        ?? r11;
        Throwable th2;
        ?? r12;
        int i13;
        ?? r13;
        ?? r14;
        ?? r15;
        ?? r16;
        j bVar;
        int i14 = i11;
        w wVar2 = wVar;
        int iW = wVar2.w();
        int iW2 = wVar2.w();
        int iW3 = wVar2.w();
        int iW4 = i14 >= 3 ? wVar2.w() : 0;
        if (i14 == 4) {
            iA = wVar2.A();
            if (!z11) {
                iA = (((iA >> 24) & 255) << 21) | (iA & 255) | (((iA >> 8) & 255) << 7) | (((iA >> 16) & 255) << 14);
            }
        } else {
            iA = i14 == 3 ? wVar2.A() : wVar2.z();
        }
        iW3 = iA;
        int iC = i14 >= 3 ? wVar2.C() : 0;
        if (iW == 0 && iW2 == 0 && iW3 == 0 && iW4 == 0 && iW3 == 0 && iC == 0) {
            wVar2.I(wVar2.f4041c);
            return null;
        }
        int i15 = wVar2.f4040b + iW3;
        if (i15 > wVar2.f4041c) {
            b7.a.B("Frame size exceeds remaining tag data");
            wVar2.I(wVar2.f4041c);
            return null;
        }
        if (gVar == null) {
            r9 = iW2;
        } else if (!gVar.f(i14, iW, iW2, iW3, iW4)) {
            i14 = i14;
            r9 = iW2;
            wVar2.I(i15);
            return null;
        }
        i14 = i14;
        r9 = iW2;
        if (i14 == 3) {
            z12 = (iC & 128) != 0;
            z13 = (iC & 64) != 0;
            z16 = false;
            z15 = (iC & 32) != 0;
            z14 = z12;
        } else if (i14 == 4) {
            boolean z17 = (iC & 64) != 0;
            boolean z18 = (iC & 8) != 0;
            boolean z19 = (iC & 4) != 0;
            z16 = (iC & 2) != 0;
            z14 = (iC & 1) != 0;
            boolean z20 = z19;
            z15 = z17;
            z12 = z18;
            z13 = z20;
        } else {
            z12 = false;
            z13 = false;
            z14 = false;
            z15 = false;
            z16 = false;
        }
        if (z12 || z13) {
            b7.a.B("Skipping unsupported compressed or encrypted frame");
            wVar2.I(i15);
            return null;
        }
        if (z15) {
            iW3--;
            wVar2.J(1);
        }
        if (z14) {
            iW3 -= 4;
            wVar2.J(4);
        }
        if (z16) {
            iW3 = h0(iW3, wVar2);
        }
        try {
            try {
                if (iW == 84 && r9 == 88 && iW3 == 88 && (i14 == 2 || iW4 == 88)) {
                    bVar = Z(iW3, wVar2);
                } else if (iW == 84) {
                    bVar = X(iW3, wVar2, e0(i14, iW, r9, iW3, iW4));
                } else if (iW == 87 && r9 == 88 && iW3 == 88 && (i14 == 2 || iW4 == 88)) {
                    bVar = b0(iW3, wVar2);
                } else if (iW == 87) {
                    bVar = a0(iW3, wVar2, e0(i14, iW, r9, iW3, iW4));
                } else {
                    if (iW != 80 || r9 != 82 || iW3 != 73 || iW4 != 86) {
                        if (iW == 71 && r9 == 69 && iW3 == 79 && (iW4 == 66 || i14 == 2)) {
                            bVar = T(iW3, wVar2);
                        } else {
                            th2 = null;
                            try {
                                if (i14 != 2 ? iW == 65 && r9 == 80 && iW3 == 73 && iW4 == 67 : iW == 80 && r9 == 73 && iW3 == 67) {
                                    bVar = O(wVar2, iW3, i14);
                                } else {
                                    if (iW != 67 || r9 != 79 || iW3 != 77 || (iW4 != 77 && i14 != 2)) {
                                        if (iW == 67 && r9 == 72 && iW3 == 65 && iW4 == 80) {
                                            r9 = r9;
                                            iW3 = iW3;
                                            iW3 = iW3;
                                            i13 = iW4;
                                            try {
                                                bVar = P(wVar2, iW3, i14, z11, i12, gVar);
                                                i14 = i11;
                                                r9 = wVar;
                                            } catch (Exception e8) {
                                                e = e8;
                                                i14 = i11;
                                                r14 = wVar;
                                                r13 = r9;
                                                r14.I(i15);
                                                r15 = th2;
                                                r16 = r13;
                                            } catch (OutOfMemoryError e10) {
                                                e = e10;
                                                i14 = i11;
                                                r14 = wVar;
                                                r13 = r9;
                                                r14.I(i15);
                                                r15 = th2;
                                                r16 = r13;
                                            } catch (Throwable th3) {
                                                th = th3;
                                                r12 = wVar;
                                                r12.I(i15);
                                                throw th;
                                            }
                                        } else {
                                            r9 = r9;
                                            iW3 = iW3;
                                            iW3 = iW3;
                                            i13 = iW4;
                                            try {
                                                if (iW == 67 && r9 == 84 && iW3 == 79 && i13 == 67) {
                                                    i14 = i11;
                                                    w wVar3 = wVar;
                                                    bVar = Q(wVar3, iW3, i14, z11, i12, gVar);
                                                    r9 = wVar3;
                                                } else {
                                                    i14 = i11;
                                                    w wVar4 = wVar;
                                                    if (iW == 77 && r9 == 76 && iW3 == 76 && i13 == 84) {
                                                        bVar = U(iW3, wVar4);
                                                        r9 = wVar4;
                                                    } else {
                                                        String strE0 = e0(i14, iW, r9, iW3, i13);
                                                        byte[] bArr = new byte[iW3];
                                                        wVar4.h(bArr, 0, iW3);
                                                        bVar = new b(bArr, strE0);
                                                        r9 = wVar4;
                                                    }
                                                }
                                            } catch (Exception e11) {
                                                e = e11;
                                                r14 = r9;
                                                r13 = r9;
                                                r14.I(i15);
                                                r15 = th2;
                                                r16 = r13;
                                            } catch (OutOfMemoryError e12) {
                                                e = e12;
                                                r14 = r9;
                                                r13 = r9;
                                                r14.I(i15);
                                                r15 = th2;
                                                r16 = r13;
                                            } catch (Throwable th4) {
                                                th = th4;
                                                r12 = r9;
                                                r12.I(i15);
                                                throw th;
                                            }
                                        }
                                        if (r15 == 0) {
                                            b7.a.C("Failed to decode frame: id=" + e0(i14, iW, r16, iW3, i13) + ", frameSize=" + iW3, e);
                                        }
                                        return r15;
                                    }
                                    bVar = R(iW3, wVar2);
                                }
                                r9 = wVar2;
                                iW3 = iW3;
                                r9 = r9;
                                i13 = iW4;
                            } catch (Exception e13) {
                                e = e13;
                                r11 = r9;
                                iW3 = iW3;
                                i13 = iW4;
                                r14 = wVar2;
                                r13 = r11;
                                r14.I(i15);
                                r15 = th2;
                                r16 = r13;
                                if (r15 == 0) {
                                    b7.a.C("Failed to decode frame: id=" + e0(i14, iW, r16, iW3, i13) + ", frameSize=" + iW3, e);
                                }
                                return r15;
                            } catch (OutOfMemoryError e14) {
                                e = e14;
                                r11 = r9;
                                iW3 = iW3;
                                i13 = iW4;
                                r14 = wVar2;
                                r13 = r11;
                                r14.I(i15);
                                r15 = th2;
                                r16 = r13;
                                if (r15 == 0) {
                                    b7.a.C("Failed to decode frame: id=" + e0(i14, iW, r16, iW3, i13) + ", frameSize=" + iW3, e);
                                }
                                return r15;
                            }
                        }
                        r9.I(i15);
                        r15 = bVar;
                        e = th2;
                        r16 = r9;
                        if (r15 == 0) {
                            b7.a.C("Failed to decode frame: id=" + e0(i14, iW, r16, iW3, i13) + ", frameSize=" + iW3, e);
                        }
                        return r15;
                    }
                    bVar = V(iW3, wVar2);
                }
                r9 = wVar2;
                iW3 = iW3;
                th2 = null;
                r9 = r9;
                i13 = iW4;
                r9.I(i15);
                r15 = bVar;
                e = th2;
                r16 = r9;
            } catch (Throwable th5) {
                th = th5;
                r12 = wVar2;
            }
        } catch (Exception e15) {
            e = e15;
            r11 = r9;
            iW3 = iW3;
            th2 = null;
            i13 = iW4;
            r14 = wVar2;
            r13 = r11;
            r14.I(i15);
            r15 = th2;
            r16 = r13;
            if (r15 == 0) {
                b7.a.C("Failed to decode frame: id=" + e0(i14, iW, r16, iW3, i13) + ", frameSize=" + iW3, e);
            }
            return r15;
        } catch (OutOfMemoryError e16) {
            e = e16;
            r11 = r9;
            iW3 = iW3;
            th2 = null;
            i13 = iW4;
            r14 = wVar2;
            r13 = r11;
            r14.I(i15);
            r15 = th2;
            r16 = r13;
            if (r15 == 0) {
                b7.a.C("Failed to decode frame: id=" + e0(i14, iW, r16, iW3, i13) + ", frameSize=" + iW3, e);
            }
            return r15;
        }
        if (r15 == 0) {
            b7.a.C("Failed to decode frame: id=" + e0(i14, iW, r16, iW3, i13) + ", frameSize=" + iW3, e);
        }
        return r15;
    }

    public static f T(int i11, w wVar) {
        int iW = wVar.w();
        Charset charsetD0 = d0(iW);
        int i12 = i11 - 1;
        byte[] bArr = new byte[i12];
        wVar.h(bArr, 0, i12);
        int iG0 = g0(bArr, 0);
        String strO = d0.o(new String(bArr, 0, iG0, StandardCharsets.ISO_8859_1));
        int i13 = iG0 + 1;
        int iF0 = f0(bArr, i13, iW);
        String strW = W(bArr, i13, iF0, charsetD0);
        int iC0 = c0(iW) + iF0;
        int iF1 = f0(bArr, iC0, iW);
        String strW2 = W(bArr, iC0, iF1, charsetD0);
        int iC1 = c0(iW) + iF1;
        return new f(strO, strW, strW2, i12 <= iC1 ? f0.f3976b : Arrays.copyOfRange(bArr, iC1, i12));
    }

    public static m U(int i11, w wVar) {
        int iC = wVar.C();
        int iZ = wVar.z();
        int iZ2 = wVar.z();
        int iW = wVar.w();
        int iW2 = wVar.w();
        v vVar = new v();
        vVar.o(wVar);
        int i12 = ((i11 - 10) * 8) / (iW + iW2);
        int[] iArr = new int[i12];
        int[] iArr2 = new int[i12];
        for (int i13 = 0; i13 < i12; i13++) {
            int i14 = vVar.i(iW);
            int i15 = vVar.i(iW2);
            iArr[i13] = i14;
            iArr2[i13] = i15;
        }
        return new m(iC, iZ, iArr, iArr2, iZ2);
    }

    public static n V(int i11, w wVar) {
        byte[] bArr = new byte[i11];
        wVar.h(bArr, 0, i11);
        int iG0 = g0(bArr, 0);
        String str = new String(bArr, 0, iG0, StandardCharsets.ISO_8859_1);
        int i12 = iG0 + 1;
        return new n(i11 <= i12 ? f0.f3976b : Arrays.copyOfRange(bArr, i12, i11), str);
    }

    public static String W(byte[] bArr, int i11, int i12, Charset charset) {
        return (i12 <= i11 || i12 > bArr.length) ? BuildConfig.VERSION_NAME : new String(bArr, i11, i12 - i11, charset);
    }

    public static o X(int i11, w wVar, String str) {
        if (i11 < 1) {
            return null;
        }
        int iW = wVar.w();
        int i12 = i11 - 1;
        byte[] bArr = new byte[i12];
        wVar.h(bArr, 0, i12);
        return new o(Y(bArr, iW, 0), str, null);
    }

    public static ImmutableList Y(byte[] bArr, int i11, int i12) {
        if (i12 >= bArr.length) {
            return ImmutableList.u(BuildConfig.VERSION_NAME);
        }
        UnmodifiableListIterator unmodifiableListIterator = ImmutableList.f16771b;
        ImmutableList.Builder builder = new ImmutableList.Builder();
        int iF0 = f0(bArr, i12, i11);
        while (i12 < iF0) {
            builder.h(new String(bArr, i12, iF0 - i12, d0(i11)));
            i12 = c0(i11) + iF0;
            iF0 = f0(bArr, i12, i11);
        }
        ImmutableList immutableListJ = builder.j();
        return immutableListJ.isEmpty() ? ImmutableList.u(BuildConfig.VERSION_NAME) : immutableListJ;
    }

    public static o Z(int i11, w wVar) {
        if (i11 < 1) {
            return null;
        }
        int iW = wVar.w();
        int i12 = i11 - 1;
        byte[] bArr = new byte[i12];
        wVar.h(bArr, 0, i12);
        int iF0 = f0(bArr, 0, iW);
        return new o(Y(bArr, iW, c0(iW) + iF0), "TXXX", new String(bArr, 0, iF0, d0(iW)));
    }

    public static p a0(int i11, w wVar, String str) {
        byte[] bArr = new byte[i11];
        wVar.h(bArr, 0, i11);
        return new p(str, null, new String(bArr, 0, g0(bArr, 0), StandardCharsets.ISO_8859_1));
    }

    public static p b0(int i11, w wVar) {
        if (i11 < 1) {
            return null;
        }
        int iW = wVar.w();
        int i12 = i11 - 1;
        byte[] bArr = new byte[i12];
        wVar.h(bArr, 0, i12);
        int iF0 = f0(bArr, 0, iW);
        String str = new String(bArr, 0, iF0, d0(iW));
        int iC0 = c0(iW) + iF0;
        return new p("WXXX", str, W(bArr, iC0, g0(bArr, iC0), StandardCharsets.ISO_8859_1));
    }

    public static int c0(int i11) {
        return (i11 == 0 || i11 == 3) ? 1 : 2;
    }

    public static Charset d0(int i11) {
        if (i11 == 1) {
            return StandardCharsets.UTF_16;
        }
        if (i11 != 2) {
            return i11 != 3 ? StandardCharsets.ISO_8859_1 : StandardCharsets.UTF_8;
        }
        return StandardCharsets.UTF_16BE;
    }

    public static String e0(int i11, int i12, int i13, int i14, int i15) {
        return i11 == 2 ? String.format(Locale.US, "%c%c%c", Integer.valueOf(i12), Integer.valueOf(i13), Integer.valueOf(i14)) : String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i12), Integer.valueOf(i13), Integer.valueOf(i14), Integer.valueOf(i15));
    }

    public static int f0(byte[] bArr, int i11, int i12) {
        int iG0 = g0(bArr, i11);
        if (i12 == 0 || i12 == 3) {
            return iG0;
        }
        while (iG0 < bArr.length - 1) {
            if ((iG0 - i11) % 2 == 0 && bArr[iG0 + 1] == 0) {
                return iG0;
            }
            iG0 = g0(bArr, iG0 + 1);
        }
        return bArr.length;
    }

    public static int g0(byte[] bArr, int i11) {
        while (i11 < bArr.length) {
            if (bArr[i11] == 0) {
                return i11;
            }
            i11++;
        }
        return bArr.length;
    }

    public static int h0(int i11, w wVar) {
        byte[] bArr = wVar.f4039a;
        int i12 = wVar.f4040b;
        int i13 = i12;
        while (true) {
            int i14 = i13 + 1;
            if (i14 >= i12 + i11) {
                return i11;
            }
            if ((bArr[i13] & 255) == 255 && bArr[i14] == 0) {
                System.arraycopy(bArr, i13 + 2, bArr, i14, (i11 - (i13 - i12)) - 2);
                i11--;
            }
            i13 = i14;
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x007a A[PHI: r3
      0x007a: PHI (r3v16 int) = (r3v5 int), (r3v19 int) binds: [B:42:0x0087, B:33:0x0077] A[DONT_GENERATE, DONT_INLINE]] */
    public static boolean i0(w wVar, int i11, int i12, boolean z11) {
        int iZ;
        long jZ;
        int iC;
        int i13;
        int i14 = wVar.f4040b;
        while (true) {
            try {
                boolean z12 = true;
                if (wVar.a() < i12) {
                    wVar.I(i14);
                    return true;
                }
                if (i11 >= 3) {
                    iZ = wVar.j();
                    jZ = wVar.y();
                    iC = wVar.C();
                } else {
                    iZ = wVar.z();
                    jZ = wVar.z();
                    iC = 0;
                }
                if (iZ == 0 && jZ == 0 && iC == 0) {
                    wVar.I(i14);
                    return true;
                }
                if (i11 == 4 && !z11) {
                    if ((8421504 & jZ) != 0) {
                        wVar.I(i14);
                        return false;
                    }
                    jZ = (((jZ >> 24) & 255) << 21) | (jZ & 255) | (((jZ >> 8) & 255) << 7) | (((jZ >> 16) & 255) << 14);
                }
                if (i11 == 4) {
                    i13 = (iC & 64) != 0 ? 1 : 0;
                    if ((iC & 1) == 0) {
                        z12 = false;
                    }
                } else if (i11 == 3) {
                    i13 = (iC & 32) != 0 ? 1 : 0;
                    if ((iC & 128) == 0) {
                        z12 = false;
                    }
                } else {
                    i13 = 0;
                    z12 = false;
                }
                if (z12) {
                    i13 += 4;
                }
                if (jZ < i13) {
                    wVar.I(i14);
                    return false;
                }
                if (wVar.a() < jZ) {
                    wVar.I(i14);
                    return false;
                }
                wVar.J((int) jZ);
            } catch (Throwable th2) {
                wVar.I(i14);
                throw th2;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x008a  */
    /* JADX WARN: Code duplicated, block: B:34:0x0099 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:35:0x009a  */
    /* JADX WARN: Code duplicated, block: B:37:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:40:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:43:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:51:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:57:0x00d3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x00c5 A[SYNTHETIC] */
    public final c0 N(byte[] bArr, int i11) throws Throwable {
        boolean z11;
        h hVar;
        int i12;
        int i13;
        int iH0;
        j jVarS;
        ArrayList arrayList = new ArrayList();
        w wVar = new w(bArr, i11);
        boolean z12 = false;
        if (wVar.a() < 10) {
            b7.a.B("Data too short to be an ID3 tag");
        } else {
            int iZ = wVar.z();
            if (iZ == 4801587) {
                int iW = wVar.w();
                wVar.J(1);
                int iW2 = wVar.w();
                int iV = wVar.v();
                if (iW != 2) {
                    if (iW == 3) {
                        if ((iW2 & 64) != 0) {
                            int iJ = wVar.j();
                            wVar.J(iJ);
                            iV -= iJ + 4;
                        }
                    } else if (iW == 4) {
                        if ((iW2 & 64) != 0) {
                            int iV2 = wVar.v();
                            wVar.J(iV2 - 4);
                            iV -= iV2;
                        }
                        if ((iW2 & 16) != 0) {
                            iV -= 10;
                        }
                    } else {
                        defpackage.e.y(iW, "Skipped ID3 tag with unsupported majorVersion=");
                    }
                    if (iW < 4) {
                        z11 = false;
                    } else {
                        z11 = false;
                    }
                    hVar = new h(iW, z11, iV);
                } else if ((iW2 & 64) != 0) {
                    b7.a.B("Skipped ID3 tag with majorVersion=2 and undefined compression scheme");
                } else {
                    if (iW < 4 || (iW2 & 128) == 0) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    hVar = new h(iW, z11, iV);
                }
                if (hVar == null) {
                    return null;
                }
                i12 = hVar.f39820a;
                int i14 = wVar.f4040b;
                i13 = i12 == 2 ? 6 : 10;
                iH0 = hVar.f39821b;
                if (hVar.f39822c) {
                    iH0 = h0(iH0, wVar);
                }
                wVar.H(i14 + iH0);
                if (!i0(wVar, i12, i13, false)) {
                    if (i12 == 4 || !i0(wVar, 4, i13, true)) {
                        defpackage.e.y(i12, "Failed to validate ID3 tag with majorVersion=");
                        return null;
                    }
                    z12 = true;
                }
                while (wVar.a() >= i13) {
                    jVarS = S(i12, wVar, z12, i13, this.f39824a);
                    if (jVarS != null) {
                        arrayList.add(jVarS);
                    }
                }
                return new c0(arrayList);
            }
            b7.a.B("Unexpected first three bytes of ID3 tag header: 0x".concat(String.format("%06X", Integer.valueOf(iZ))));
        }
        hVar = null;
        if (hVar == null) {
            return null;
        }
        i12 = hVar.f39820a;
        int i15 = wVar.f4040b;
        if (i12 == 2) {
        }
        iH0 = hVar.f39821b;
        if (hVar.f39822c) {
            iH0 = h0(iH0, wVar);
        }
        wVar.H(i15 + iH0);
        if (!i0(wVar, i12, i13, false)) {
            if (i12 == 4) {
            }
            defpackage.e.y(i12, "Failed to validate ID3 tag with majorVersion=");
            return null;
        }
        while (wVar.a() >= i13) {
            jVarS = S(i12, wVar, z12, i13, this.f39824a);
            if (jVarS != null) {
                arrayList.add(jVarS);
            }
        }
        return new c0(arrayList);
    }

    @Override // android.support.v4.media.session.a
    public final c0 k(g8.a aVar, ByteBuffer byteBuffer) {
        return N(byteBuffer.array(), byteBuffer.limit());
    }
}
