package com.google.protobuf;

import com.google.android.material.datepicker.d;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class UnknownFieldSetLite {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final UnknownFieldSetLite f21406f = new UnknownFieldSetLite(0, new int[0], new Object[0], false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f21407a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f21408b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object[] f21409c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f21410d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f21411e;

    private UnknownFieldSetLite() {
        this(0, new int[8], new Object[8], true);
    }

    public static UnknownFieldSetLite c() {
        return new UnknownFieldSetLite();
    }

    public static void e(int i11, Object obj, Writer writer) {
        int i12 = i11 >>> 3;
        int i13 = i11 & 7;
        if (i13 == 0) {
            writer.r(i12, ((Long) obj).longValue());
            return;
        }
        if (i13 == 1) {
            writer.k(i12, ((Long) obj).longValue());
            return;
        }
        if (i13 == 2) {
            writer.w(i12, (ByteString) obj);
            return;
        }
        if (i13 != 3) {
            if (i13 != 5) {
                throw new RuntimeException(InvalidProtocolBufferException.d());
            }
            writer.f(i12, ((Integer) obj).intValue());
        } else if (writer.l() == Writer.FieldOrder.ASCENDING) {
            writer.v(i12);
            ((UnknownFieldSetLite) obj).f(writer);
            writer.I(i12);
        } else {
            writer.I(i12);
            ((UnknownFieldSetLite) obj).f(writer);
            writer.v(i12);
        }
    }

    public final void a(int i11) {
        int[] iArr = this.f21408b;
        if (i11 > iArr.length) {
            int i12 = this.f21407a;
            int i13 = (i12 / 2) + i12;
            if (i13 >= i11) {
                i11 = i13;
            }
            if (i11 < 8) {
                i11 = 8;
            }
            this.f21408b = Arrays.copyOf(iArr, i11);
            this.f21409c = Arrays.copyOf(this.f21409c, i11);
        }
    }

    public final int b() {
        int iV;
        int iX;
        int iV2;
        int i11 = this.f21410d;
        if (i11 != -1) {
            return i11;
        }
        int iB = 0;
        for (int i12 = 0; i12 < this.f21407a; i12++) {
            int i13 = this.f21408b[i12];
            int i14 = i13 >>> 3;
            int i15 = i13 & 7;
            if (i15 != 0) {
                if (i15 != 1) {
                    if (i15 == 2) {
                        ByteString byteString = (ByteString) this.f21409c[i12];
                        int iV3 = CodedOutputStream.V(i14);
                        int size = byteString.size();
                        iB = d.b(size, size, iV3, iB);
                    } else if (i15 == 3) {
                        iV = CodedOutputStream.V(i14) * 2;
                        iX = ((UnknownFieldSetLite) this.f21409c[i12]).b();
                    } else {
                        if (i15 != 5) {
                            throw new IllegalStateException(InvalidProtocolBufferException.d());
                        }
                        ((Integer) this.f21409c[i12]).getClass();
                        iV2 = CodedOutputStream.V(i14) + 4;
                    }
                } else {
                    ((Long) this.f21409c[i12]).getClass();
                    iV2 = CodedOutputStream.V(i14) + 8;
                }
                iB = iV2 + iB;
            } else {
                long jLongValue = ((Long) this.f21409c[i12]).longValue();
                iV = CodedOutputStream.V(i14);
                iX = CodedOutputStream.X(jLongValue);
            }
            iB = iX + iV + iB;
        }
        this.f21410d = iB;
        return iB;
    }

    public final void d(int i11, Object obj) {
        if (!this.f21411e) {
            throw new UnsupportedOperationException();
        }
        a(this.f21407a + 1);
        int[] iArr = this.f21408b;
        int i12 = this.f21407a;
        iArr[i12] = i11;
        this.f21409c[i12] = obj;
        this.f21407a = i12 + 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof UnknownFieldSetLite)) {
            return false;
        }
        UnknownFieldSetLite unknownFieldSetLite = (UnknownFieldSetLite) obj;
        int i11 = this.f21407a;
        if (i11 == unknownFieldSetLite.f21407a) {
            int[] iArr = this.f21408b;
            int[] iArr2 = unknownFieldSetLite.f21408b;
            for (int i12 = 0; i12 < i11; i12++) {
                if (iArr[i12] == iArr2[i12]) {
                }
            }
            Object[] objArr = this.f21409c;
            Object[] objArr2 = unknownFieldSetLite.f21409c;
            int i13 = this.f21407a;
            for (int i14 = 0; i14 < i13; i14++) {
                if (objArr[i14].equals(objArr2[i14])) {
                }
            }
            return true;
        }
        return false;
    }

    public final void f(Writer writer) {
        if (this.f21407a == 0) {
            return;
        }
        if (writer.l() == Writer.FieldOrder.ASCENDING) {
            for (int i11 = 0; i11 < this.f21407a; i11++) {
                e(this.f21408b[i11], this.f21409c[i11], writer);
            }
            return;
        }
        for (int i12 = this.f21407a - 1; i12 >= 0; i12--) {
            e(this.f21408b[i12], this.f21409c[i12], writer);
        }
    }

    public final int hashCode() {
        int i11 = this.f21407a;
        int i12 = (527 + i11) * 31;
        int[] iArr = this.f21408b;
        int iHashCode = 17;
        int i13 = 17;
        for (int i14 = 0; i14 < i11; i14++) {
            i13 = (i13 * 31) + iArr[i14];
        }
        int i15 = (i12 + i13) * 31;
        Object[] objArr = this.f21409c;
        int i16 = this.f21407a;
        for (int i17 = 0; i17 < i16; i17++) {
            iHashCode = (iHashCode * 31) + objArr[i17].hashCode();
        }
        return i15 + iHashCode;
    }

    public UnknownFieldSetLite(int i11, int[] iArr, Object[] objArr, boolean z11) {
        this.f21410d = -1;
        this.f21407a = i11;
        this.f21408b = iArr;
        this.f21409c = objArr;
        this.f21411e = z11;
    }
}
