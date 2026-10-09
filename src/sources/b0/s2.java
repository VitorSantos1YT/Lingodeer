package b0;

import android.graphics.Color;
import com.yalantis.ucrop.view.CropImageView;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class s2 implements n2, id.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f3677a;

    /* JADX WARN: Code duplicated, block: B:38:0x00d5  */
    @Override // id.f0
    public Object a(jd.d dVar, float f5) {
        int i11;
        int iArgb;
        float f11;
        int iArgb2;
        float f12;
        float f13;
        ArrayList arrayList = new ArrayList();
        int i12 = 1;
        int i13 = 0;
        boolean z11 = dVar.v() == jd.c.BEGIN_ARRAY;
        if (z11) {
            dVar.a();
        }
        while (dVar.f()) {
            arrayList.add(Float.valueOf((float) dVar.i()));
        }
        int i14 = 2;
        if (arrayList.size() == 4 && ((Float) arrayList.get(0)).floatValue() == 1.0f) {
            arrayList.set(0, Float.valueOf(CropImageView.DEFAULT_ASPECT_RATIO));
            arrayList.add(Float.valueOf(1.0f));
            arrayList.add((Float) arrayList.get(1));
            arrayList.add((Float) arrayList.get(2));
            arrayList.add((Float) arrayList.get(3));
            this.f3677a = 2;
        }
        if (z11) {
            dVar.c();
        }
        if (this.f3677a == -1) {
            this.f3677a = arrayList.size() / 4;
        }
        int i15 = this.f3677a;
        float[] fArr = new float[i15];
        int[] iArr = new int[i15];
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        while (true) {
            i11 = this.f3677a * 4;
            if (i16 >= i11) {
                break;
            }
            int i19 = i16 / 4;
            double dFloatValue = ((Float) arrayList.get(i16)).floatValue();
            int i21 = i13;
            int i22 = i16 % 4;
            if (i22 != 0) {
                if (i22 == i12) {
                    i17 = (int) (dFloatValue * 255.0d);
                } else if (i22 == 2) {
                    i18 = (int) (dFloatValue * 255.0d);
                } else if (i22 == 3) {
                    iArr[i19] = Color.argb(255, i17, i18, (int) (dFloatValue * 255.0d));
                }
            } else if (i19 > 0) {
                float f14 = (float) dFloatValue;
                if (fArr[i19 - 1] >= f14) {
                    fArr[i19] = f14 + 0.01f;
                } else {
                    fArr[i19] = (float) dFloatValue;
                }
            } else {
                fArr[i19] = (float) dFloatValue;
            }
            i16++;
            i13 = i21;
            i12 = 1;
        }
        int i23 = i13;
        fd.c cVar = new fd.c(fArr, iArr);
        if (arrayList.size() <= i11) {
            return cVar;
        }
        int size = (arrayList.size() - i11) / 2;
        float[] fArr2 = new float[size];
        float[] fArr3 = new float[size];
        int i24 = i23;
        while (i11 < arrayList.size()) {
            if (i11 % 2 == 0) {
                fArr2[i24] = ((Float) arrayList.get(i11)).floatValue();
            } else {
                fArr3[i24] = ((Float) arrayList.get(i11)).floatValue();
                i24++;
            }
            i11++;
        }
        float[] fArrCopyOf = cVar.f27148a;
        if (fArrCopyOf.length == 0) {
            fArrCopyOf = fArr2;
        } else if (size != 0) {
            int length = fArrCopyOf.length + size;
            float[] fArr4 = new float[length];
            int i25 = i23;
            int i26 = i25;
            int i27 = i26;
            int i28 = i27;
            while (i25 < length) {
                float f15 = i27 < fArrCopyOf.length ? fArrCopyOf[i27] : Float.NaN;
                float f16 = i28 < size ? fArr2[i28] : Float.NaN;
                if (Float.isNaN(f16) || f15 < f16) {
                    fArr4[i25] = f15;
                    i27++;
                } else if (Float.isNaN(f15) || f16 < f15) {
                    fArr4[i25] = f16;
                    i28++;
                } else {
                    fArr4[i25] = f15;
                    i27++;
                    i28++;
                    i26++;
                }
                i25++;
            }
            fArrCopyOf = i26 == 0 ? fArr4 : Arrays.copyOf(fArr4, length - i26);
        }
        int length2 = fArrCopyOf.length;
        int[] iArr2 = new int[length2];
        int i29 = i23;
        while (i29 < length2) {
            float f17 = fArrCopyOf[i29];
            int iBinarySearch = Arrays.binarySearch(fArr, f17);
            int iBinarySearch2 = Arrays.binarySearch(fArr2, f17);
            if (iBinarySearch < 0 || iBinarySearch2 > 0) {
                if (iBinarySearch2 < 0) {
                    iBinarySearch2 = -(iBinarySearch2 + 1);
                }
                float f18 = fArr3[iBinarySearch2];
                if (i15 < 2 || f17 == fArr[i23]) {
                    iArgb = iArr[i23];
                } else {
                    int i30 = 1;
                    while (true) {
                        if (i30 >= i15) {
                            throw new IllegalArgumentException("Unreachable code.");
                        }
                        f11 = fArr[i30];
                        if (f11 >= f17 || i30 == i15 - 1) {
                            break;
                        }
                        i30++;
                    }
                    if (i30 != i15 - 1 || f17 < f11) {
                        int i31 = i30 - 1;
                        float f19 = fArr[i31];
                        int iN = fb.g0.n(iArr[i31], (f17 - f19) / (f11 - f19), iArr[i30]);
                        iArgb = Color.argb((int) (f18 * 255.0f), Color.red(iN), Color.green(iN), Color.blue(iN));
                    } else {
                        iArgb = Color.argb((int) (f18 * 255.0f), Color.red(iArr[i30]), Color.green(iArr[i30]), Color.blue(iArr[i30]));
                    }
                }
                iArr2[i29] = iArgb;
            } else {
                int i32 = iArr[iBinarySearch];
                if (size < i14 || f17 <= fArr2[i23]) {
                    iArgb2 = Color.argb((int) (fArr3[i23] * 255.0f), Color.red(i32), Color.green(i32), Color.blue(i32));
                } else {
                    int i33 = 1;
                    while (true) {
                        if (i33 >= size) {
                            throw new IllegalArgumentException("Unreachable code.");
                        }
                        f12 = fArr2[i33];
                        if (f12 >= f17 || i33 == size - 1) {
                            break;
                        }
                        i33++;
                    }
                    if (f12 <= f17) {
                        f13 = fArr3[i33];
                    } else {
                        int i34 = i33 - 1;
                        float f21 = fArr2[i34];
                        f13 = kd.h.f(fArr3[i34], fArr3[i33], (f17 - f21) / (f12 - f21));
                    }
                    iArgb2 = Color.argb((int) (f13 * 255.0f), Color.red(i32), Color.green(i32), Color.blue(i32));
                }
                iArr2[i29] = iArgb2;
            }
            i29++;
            i14 = 2;
        }
        return new fd.c(fArrCopyOf, iArr2);
    }

    @Override // b0.l2
    public s i(long j11, s sVar, s sVar2, s sVar3) {
        return j11 < ((long) this.f3677a) * 1000000 ? sVar : sVar2;
    }

    @Override // b0.n2
    public int n() {
        return this.f3677a;
    }

    @Override // b0.n2
    public int r() {
        return 0;
    }

    @Override // b0.l2
    public s m(long j11, s sVar, s sVar2, s sVar3) {
        return sVar3;
    }
}
