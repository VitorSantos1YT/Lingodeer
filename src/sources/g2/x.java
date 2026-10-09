package g2;

import com.yalantis.ucrop.view.CropImageView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class x {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f28615b = f0.e(4278190080L);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final long f28616c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final long f28617d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final long f28618e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final long f28619f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final long f28620g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final long f28621h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final long f28622i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f28623j = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f28624a;

    static {
        f0.e(4282664004L);
        f28616c = f0.e(4287137928L);
        f28617d = f0.e(4291611852L);
        f28618e = f0.e(4294967295L);
        f28619f = f0.e(4294901760L);
        f0.e(4278255360L);
        f28620g = f0.e(4278190335L);
        f0.e(4294967040L);
        f0.e(4278255615L);
        f0.e(4294902015L);
        f28621h = f0.c(0);
        f28622i = f0.b(CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, h2.e.f31479u);
    }

    public /* synthetic */ x(long j11) {
        this.f28624a = j11;
    }

    public static final /* synthetic */ x a(long j11) {
        return new x(j11);
    }

    public static final long b(long j11, h2.c cVar) {
        h2.h hVarE;
        h2.c cVarG = g(j11);
        int i11 = cVarG.f31458c;
        int i12 = cVar.f31458c;
        if ((i11 | i12) < 0) {
            hVarE = h2.k.e(cVarG, cVar);
        } else {
            y.x xVar = h2.i.f31491a;
            int i13 = i11 | (i12 << 6);
            Object objB = xVar.b(i13);
            if (objB == null) {
                objB = h2.k.e(cVarG, cVar);
                xVar.h(i13, objB);
            }
            hVarE = (h2.h) objB;
        }
        return hVarE.a(j11);
    }

    public static long c(long j11, float f5) {
        return f0.b(i(j11), h(j11), f(j11), f5, g(j11));
    }

    public static final boolean d(long j11, long j12) {
        return j11 == j12;
    }

    public static final float e(long j11) {
        float fA;
        float f5;
        if ((63 & j11) == 0) {
            fA = (float) com.bumptech.glide.g.A((j11 >>> 56) & 255);
            f5 = 255.0f;
        } else {
            fA = (float) com.bumptech.glide.g.A((j11 >>> 6) & 1023);
            f5 = 1023.0f;
        }
        return fA / f5;
    }

    public static final float f(long j11) {
        int i11;
        int i12;
        int i13;
        if ((63 & j11) == 0) {
            return ((float) com.bumptech.glide.g.A((j11 >>> 32) & 255)) / 255.0f;
        }
        short s3 = (short) ((j11 >>> 16) & 65535);
        int i14 = Short.MIN_VALUE & s3;
        int i15 = ((65535 & s3) >>> 10) & 31;
        int i16 = s3 & 1023;
        if (i15 != 0) {
            int i17 = i16 << 13;
            if (i15 == 31) {
                i11 = 255;
                if (i17 != 0) {
                    i17 |= 4194304;
                }
            } else {
                i11 = i15 + 112;
            }
            int i18 = i11;
            i12 = i17;
            i13 = i18;
        } else {
            if (i16 != 0) {
                float fIntBitsToFloat = Float.intBitsToFloat(i16 + 1056964608) - b0.f28538a;
                return i14 == 0 ? fIntBitsToFloat : -fIntBitsToFloat;
            }
            i13 = 0;
            i12 = 0;
        }
        return Float.intBitsToFloat((i13 << 23) | (i14 << 16) | i12);
    }

    public static final h2.c g(long j11) {
        float[] fArr = h2.e.f31460a;
        return h2.e.f31483y[(int) (j11 & 63)];
    }

    public static final float h(long j11) {
        int i11;
        int i12;
        int i13;
        if ((63 & j11) == 0) {
            return ((float) com.bumptech.glide.g.A((j11 >>> 40) & 255)) / 255.0f;
        }
        short s3 = (short) ((j11 >>> 32) & 65535);
        int i14 = Short.MIN_VALUE & s3;
        int i15 = ((65535 & s3) >>> 10) & 31;
        int i16 = s3 & 1023;
        if (i15 != 0) {
            int i17 = i16 << 13;
            if (i15 == 31) {
                i11 = 255;
                if (i17 != 0) {
                    i17 |= 4194304;
                }
            } else {
                i11 = i15 + 112;
            }
            int i18 = i11;
            i12 = i17;
            i13 = i18;
        } else {
            if (i16 != 0) {
                float fIntBitsToFloat = Float.intBitsToFloat(i16 + 1056964608) - b0.f28538a;
                return i14 == 0 ? fIntBitsToFloat : -fIntBitsToFloat;
            }
            i13 = 0;
            i12 = 0;
        }
        return Float.intBitsToFloat((i13 << 23) | (i14 << 16) | i12);
    }

    public static final float i(long j11) {
        int i11;
        int i12;
        int i13;
        if ((63 & j11) == 0) {
            return ((float) com.bumptech.glide.g.A((j11 >>> 48) & 255)) / 255.0f;
        }
        short s3 = (short) ((j11 >>> 48) & 65535);
        int i14 = Short.MIN_VALUE & s3;
        int i15 = ((65535 & s3) >>> 10) & 31;
        int i16 = s3 & 1023;
        if (i15 != 0) {
            int i17 = i16 << 13;
            if (i15 == 31) {
                i11 = 255;
                if (i17 != 0) {
                    i17 |= 4194304;
                }
            } else {
                i11 = i15 + 112;
            }
            int i18 = i11;
            i12 = i17;
            i13 = i18;
        } else {
            if (i16 != 0) {
                float fIntBitsToFloat = Float.intBitsToFloat(i16 + 1056964608) - b0.f28538a;
                return i14 == 0 ? fIntBitsToFloat : -fIntBitsToFloat;
            }
            i13 = 0;
            i12 = 0;
        }
        return Float.intBitsToFloat((i13 << 23) | (i14 << 16) | i12);
    }

    public static String j(long j11) {
        StringBuilder sb2 = new StringBuilder("Color(");
        sb2.append(i(j11));
        sb2.append(", ");
        sb2.append(h(j11));
        sb2.append(", ");
        sb2.append(f(j11));
        sb2.append(", ");
        sb2.append(e(j11));
        sb2.append(", ");
        return hh.p0.o(sb2, g(j11).f31456a, ')');
    }

    public final boolean equals(Object obj) {
        if (obj instanceof x) {
            return this.f28624a == ((x) obj).f28624a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f28624a);
    }

    public final String toString() {
        return j(this.f28624a);
    }
}
