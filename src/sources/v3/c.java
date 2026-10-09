package v3;

import fr.j3;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public interface c {
    default long I(int i11) {
        return n(Q(i11));
    }

    default long K(float f5) {
        return n(T(f5));
    }

    default float Q(int i11) {
        return i11 / getDensity();
    }

    default float T(float f5) {
        return f5 / getDensity();
    }

    float Z();

    default float e0(float f5) {
        return getDensity() * f5;
    }

    float getDensity();

    default int k0(long j11) {
        return Math.round(y0(j11));
    }

    default long n(float f5) {
        float[] fArr = w3.b.f54619a;
        if (Z() < 1.03f) {
            return j3.L(4294967296L, f5 / Z());
        }
        w3.a aVarA = w3.b.a(Z());
        return j3.L(4294967296L, aVarA != null ? aVarA.a(f5) : f5 / Z());
    }

    default int n0(float f5) {
        float fE0 = e0(f5);
        if (Float.isInfinite(fE0)) {
            return Integer.MAX_VALUE;
        }
        return Math.round(fE0);
    }

    default long o(long j11) {
        if (j11 != 9205357640488583168L) {
            return ef.e.a(T(Float.intBitsToFloat((int) (j11 >> 32))), T(Float.intBitsToFloat((int) (j11 & 4294967295L))));
        }
        return 9205357640488583168L;
    }

    default long v0(long j11) {
        if (j11 == 9205357640488583168L) {
            return 9205357640488583168L;
        }
        float fE0 = e0(h.b(j11));
        return (((long) Float.floatToRawIntBits(e0(h.a(j11)))) & 4294967295L) | (Float.floatToRawIntBits(fE0) << 32);
    }

    default float w(long j11) {
        float fC;
        float fZ;
        if (!p.a(o.b(j11), 4294967296L)) {
            i.b("Only Sp can convert to Px");
        }
        float[] fArr = w3.b.f54619a;
        if (Z() >= 1.03f) {
            w3.a aVarA = w3.b.a(Z());
            fC = o.c(j11);
            if (aVarA != null) {
                return aVarA.b(fC);
            }
            fZ = Z();
        } else {
            fC = o.c(j11);
            fZ = Z();
        }
        return fZ * fC;
    }

    default float y0(long j11) {
        if (!p.a(o.b(j11), 4294967296L)) {
            i.b("Only Sp can convert to Px");
        }
        return e0(w(j11));
    }
}
