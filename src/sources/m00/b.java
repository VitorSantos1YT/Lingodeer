package m00;

import com.google.zxing.pdf417.decoder.vBn.xTCJ;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class b {
    static {
        new ag.c();
    }

    public static final boolean a(int i11, int i12, int i13, byte[] a3, byte[] b3) {
        kotlin.jvm.internal.m.f(a3, "a");
        kotlin.jvm.internal.m.f(b3, "b");
        for (int i14 = 0; i14 < i13; i14++) {
            if (a3[i14 + i11] != b3[i14 + i12]) {
                return false;
            }
        }
        return true;
    }

    public static final d0 c(i0 i0Var) {
        kotlin.jvm.internal.m.f(i0Var, "<this>");
        return new d0(i0Var);
    }

    public static void d(long j11, i iVar, int i11, ArrayList arrayList, int i12, int i13, ArrayList arrayList2) {
        int i14;
        int i15;
        ArrayList arrayList3;
        long j12;
        int i16;
        int i17 = i11;
        ArrayList arrayList4 = arrayList;
        ArrayList arrayList5 = arrayList2;
        if (i12 >= i13) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        for (int i18 = i12; i18 < i13; i18++) {
            if (((l) arrayList4.get(i18)).e() < i17) {
                throw new IllegalArgumentException("Failed requirement.");
            }
        }
        l lVar = (l) arrayList.get(i12);
        l lVar2 = (l) arrayList4.get(i13 - 1);
        if (i17 == lVar.e()) {
            int iIntValue = ((Number) arrayList5.get(i12)).intValue();
            int i19 = i12 + 1;
            l lVar3 = (l) arrayList4.get(i19);
            i14 = i19;
            i15 = iIntValue;
            lVar = lVar3;
        } else {
            i14 = i12;
            i15 = -1;
        }
        if (lVar.k(i17) == lVar2.k(i17)) {
            int iMin = Math.min(lVar.e(), lVar2.e());
            int i21 = 0;
            for (int i22 = i17; i22 < iMin && lVar.k(i22) == lVar2.k(i22); i22++) {
                i21++;
            }
            long j13 = 4;
            long j14 = (iVar.f40718b / j13) + j11 + ((long) 2) + ((long) i21) + 1;
            iVar.T(-i21);
            iVar.T(i15);
            int i23 = i17 + i21;
            while (i17 < i23) {
                iVar.T(lVar.k(i17) & 255);
                i17++;
            }
            if (i14 + 1 == i13) {
                if (i23 != ((l) arrayList4.get(i14)).e()) {
                    throw new IllegalStateException("Check failed.");
                }
                iVar.T(((Number) arrayList5.get(i14)).intValue());
                return;
            } else {
                i iVar2 = new i();
                iVar.T(((int) ((iVar2.f40718b / j13) + j14)) * (-1));
                d(j14, iVar2, i23, arrayList4, i14, i13, arrayList5);
                iVar.m0(iVar2);
                return;
            }
        }
        int i24 = 1;
        for (int i25 = i14 + 1; i25 < i13; i25++) {
            if (((l) arrayList4.get(i25 - 1)).k(i17) != ((l) arrayList4.get(i25)).k(i17)) {
                i24++;
            }
        }
        long j15 = 4;
        long j16 = (iVar.f40718b / j15) + j11 + ((long) 2) + ((long) (i24 * 2));
        iVar.T(i24);
        iVar.T(i15);
        for (int i26 = i14; i26 < i13; i26++) {
            int iK = ((l) arrayList4.get(i26)).k(i17);
            if (i26 == i14 || iK != ((l) arrayList4.get(i26 - 1)).k(i17)) {
                iVar.T(iK & 255);
            }
        }
        i iVar3 = new i();
        int i27 = i14;
        while (i27 < i13) {
            byte bK = ((l) arrayList4.get(i27)).k(i17);
            int i28 = i27 + 1;
            int i29 = i28;
            while (true) {
                if (i29 >= i13) {
                    i29 = i13;
                    break;
                } else if (bK != ((l) arrayList4.get(i29)).k(i17)) {
                    break;
                } else {
                    i29++;
                }
            }
            if (i28 == i29 && i17 + 1 == ((l) arrayList4.get(i27)).e()) {
                iVar.T(((Number) arrayList5.get(i27)).intValue());
                arrayList3 = arrayList5;
                j12 = j16;
                i16 = i29;
            } else {
                iVar.T(((int) ((iVar3.f40718b / j15) + j16)) * (-1));
                arrayList3 = arrayList5;
                j12 = j16;
                i16 = i29;
                d(j12, iVar3, i17 + 1, arrayList, i27, i16, arrayList3);
                arrayList4 = arrayList;
            }
            j16 = j12;
            i27 = i16;
            arrayList5 = arrayList3;
        }
        iVar.m0(iVar3);
    }

    public static final void e(long j11, long j12, long j13) {
        if ((j12 | j13) < 0 || j12 > j11 || j11 - j12 < j13) {
            StringBuilder sbJ = w4.c.j(j11, "size=", " offset=");
            sbJ.append(j12);
            sbJ.append(" byteCount=");
            sbJ.append(j13);
            throw new ArrayIndexOutOfBoundsException(sbJ.toString());
        }
    }

    public static z f(l... lVarArr) {
        if (lVarArr.length == 0) {
            return new z(new l[0], new int[]{0, -1});
        }
        ArrayList arrayListL0 = ry.l.l0(lVarArr);
        ry.p.Y(arrayListL0);
        int size = arrayListL0.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i11 = 0; i11 < size; i11++) {
            arrayList.add(-1);
        }
        int length = lVarArr.length;
        int i12 = 0;
        int i13 = 0;
        while (i12 < length) {
            arrayList.set(ns.o.c(arrayListL0, lVarArr[i12]), Integer.valueOf(i13));
            i12++;
            i13++;
        }
        if (((l) arrayListL0.get(0)).e() <= 0) {
            throw new IllegalArgumentException("the empty byte string is not a supported option");
        }
        int i14 = 0;
        while (i14 < arrayListL0.size()) {
            l lVar = (l) arrayListL0.get(i14);
            int i15 = i14 + 1;
            int i16 = i15;
            while (i16 < arrayListL0.size()) {
                l lVar2 = (l) arrayListL0.get(i16);
                if (!lVar2.p(lVar)) {
                    break;
                }
                if (lVar2.e() == lVar.e()) {
                    throw new IllegalArgumentException(("duplicate option: " + lVar2).toString());
                }
                if (((Number) arrayList.get(i16)).intValue() > ((Number) arrayList.get(i14)).intValue()) {
                    arrayListL0.remove(i16);
                    ((Number) arrayList.remove(i16)).intValue();
                } else {
                    i16++;
                }
            }
            i14 = i15;
        }
        i iVar = new i();
        d(0L, iVar, 0, arrayListL0, 0, arrayListL0.size(), arrayList);
        int i17 = (int) (iVar.f40718b / ((long) 4));
        int[] iArr = new int[i17];
        for (int i18 = 0; i18 < i17; i18++) {
            iArr[i18] = iVar.readInt();
        }
        Object[] objArrCopyOf = Arrays.copyOf(lVarArr, lVarArr.length);
        kotlin.jvm.internal.m.e(objArrCopyOf, "copyOf(...)");
        return new z((l[]) objArrCopyOf, iArr);
    }

    public static final int g(int i11) {
        return ((i11 & 255) << 24) | (((-16777216) & i11) >>> 24) | ((16711680 & i11) >>> 8) | ((65280 & i11) << 8);
    }

    public static final c h(Socket socket) throws IOException {
        n00.f fVar = new n00.f(socket);
        OutputStream outputStream = socket.getOutputStream();
        kotlin.jvm.internal.m.e(outputStream, "getOutputStream(...)");
        return new c(0, fVar, new c(1, outputStream, fVar));
    }

    public static final d i(InputStream inputStream) {
        kotlin.jvm.internal.m.f(inputStream, "<this>");
        return new d(inputStream, new k0());
    }

    public static final d j(Socket socket) {
        n00.f fVar = new n00.f(socket);
        InputStream inputStream = socket.getInputStream();
        kotlin.jvm.internal.m.e(inputStream, "getInputStream(...)");
        return new d(fVar, new d(inputStream, fVar));
    }

    public static final String k(byte b3) {
        char[] cArr = n00.b.f43059a;
        return new String(new char[]{cArr[(b3 >> 4) & 15], cArr[b3 & 15]});
    }

    public static final String l(int i11) {
        if (i11 == 0) {
            return "0";
        }
        char[] cArr = n00.b.f43059a;
        int i12 = 0;
        char[] cArr2 = {cArr[(i11 >> 28) & 15], cArr[(i11 >> 24) & 15], cArr[(i11 >> 20) & 15], cArr[(i11 >> 16) & 15], cArr[(i11 >> 12) & 15], cArr[(i11 >> 8) & 15], cArr[(i11 >> 4) & 15], cArr[i11 & 15]};
        while (i12 < 8 && cArr2[i12] == '0') {
            i12++;
        }
        jh.h.c(i12, 8, 8);
        return new String(cArr2, i12, 8 - i12);
    }

    public static final c0 b(h0 h0Var) {
        kotlin.jvm.internal.m.f(h0Var, xTCJ.VBYpShXLp);
        return new c0(h0Var);
    }
}
