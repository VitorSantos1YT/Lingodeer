package com.google.zxing.common.reedsolomon;

import java.util.ArrayList;
import nv.p;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class ReedSolomonEncoder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final GenericGF f21498a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f21499b;

    public ReedSolomonEncoder(GenericGF genericGF) {
        this.f21498a = genericGF;
        ArrayList arrayList = new ArrayList();
        this.f21499b = arrayList;
        arrayList.add(new GenericGFPoly(genericGF, new int[]{1}));
    }

    public final void a(int[] iArr, int i11) {
        GenericGFPoly genericGFPoly;
        GenericGFPoly genericGFPoly2;
        if (i11 == 0) {
            throw new IllegalArgumentException("No error correction bytes");
        }
        int length = iArr.length - i11;
        if (length <= 0) {
            throw new IllegalArgumentException("No data bytes provided");
        }
        ArrayList arrayList = this.f21499b;
        int size = arrayList.size();
        GenericGF genericGF = this.f21498a;
        int i12 = 1;
        if (i11 >= size) {
            GenericGFPoly genericGFPoly3 = (GenericGFPoly) p.f(1, arrayList);
            int size2 = arrayList.size();
            while (size2 <= i11) {
                GenericGFPoly genericGFPoly4 = new GenericGFPoly(genericGF, new int[]{i12, genericGF.f21490a[(size2 - 1) + genericGF.f21495f]});
                GenericGF genericGF2 = genericGFPoly3.f21496a;
                if (!genericGF2.equals(genericGF)) {
                    throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
                }
                if (genericGFPoly3.c() || genericGFPoly4.c()) {
                    genericGFPoly2 = genericGF2.f21492c;
                } else {
                    int[] iArr2 = genericGFPoly3.f21497b;
                    int length2 = iArr2.length;
                    int[] iArr3 = genericGFPoly4.f21497b;
                    int length3 = iArr3.length;
                    int[] iArr4 = new int[(length2 + length3) - i12];
                    for (int i13 = 0; i13 < length2; i13++) {
                        int i14 = iArr2[i13];
                        int i15 = 0;
                        while (i15 < length3) {
                            int i16 = i13 + i15;
                            int i17 = i15;
                            iArr4[i16] = iArr4[i16] ^ genericGF2.a(i14, iArr3[i17]);
                            i15 = i17 + 1;
                        }
                    }
                    genericGFPoly2 = new GenericGFPoly(genericGF2, iArr4);
                }
                genericGFPoly3 = genericGFPoly2;
                arrayList.add(genericGFPoly3);
                size2++;
                i12 = 1;
            }
        }
        GenericGFPoly genericGFPoly5 = (GenericGFPoly) arrayList.get(i11);
        int[] iArr5 = new int[length];
        System.arraycopy(iArr, 0, iArr5, 0, length);
        GenericGFPoly genericGFPolyD = new GenericGFPoly(genericGF, iArr5).d(i11, 1);
        GenericGF genericGF3 = genericGFPolyD.f21496a;
        boolean zEquals = genericGF3.equals(genericGFPoly5.f21496a);
        GenericGFPoly genericGFPoly6 = genericGF3.f21492c;
        if (!zEquals) {
            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        }
        if (genericGFPoly5.c()) {
            throw new IllegalArgumentException("Divide by 0");
        }
        int iB = genericGFPoly5.b();
        int[] iArr6 = genericGFPoly5.f21497b;
        int i18 = iArr6[(iArr6.length - 1) - iB];
        if (i18 == 0) {
            throw new ArithmeticException();
        }
        int i19 = genericGF3.f21490a[(genericGF3.f21493d - genericGF3.f21491b[i18]) - 1];
        GenericGFPoly genericGFPolyA = genericGFPoly6;
        while (genericGFPolyD.b() >= genericGFPoly5.b() && !genericGFPolyD.c()) {
            int iB2 = genericGFPolyD.b() - genericGFPoly5.b();
            int iB3 = genericGFPolyD.b();
            int[] iArr7 = genericGFPolyD.f21497b;
            int iA = genericGF3.a(iArr7[(iArr7.length - 1) - iB3], i19);
            GenericGFPoly genericGFPolyD2 = genericGFPoly5.d(iB2, iA);
            if (iB2 < 0) {
                throw new IllegalArgumentException();
            }
            if (iA == 0) {
                genericGFPoly = genericGFPoly6;
            } else {
                int[] iArr8 = new int[iB2 + 1];
                iArr8[0] = iA;
                genericGFPoly = new GenericGFPoly(genericGF3, iArr8);
            }
            genericGFPolyA = genericGFPolyA.a(genericGFPoly);
            genericGFPolyD = genericGFPolyD.a(genericGFPolyD2);
        }
        int[] iArr9 = new GenericGFPoly[]{genericGFPolyA, genericGFPolyD}[1].f21497b;
        int length4 = i11 - iArr9.length;
        for (int i21 = 0; i21 < length4; i21++) {
            iArr[length + i21] = 0;
        }
        System.arraycopy(iArr9, 0, iArr, length + length4, iArr9.length);
    }
}
