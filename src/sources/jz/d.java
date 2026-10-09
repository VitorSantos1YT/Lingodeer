package jz;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import se.i;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class d extends e implements Serializable {
    private final void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    private final Object writeReplace() {
        return c.f37396a;
    }

    @Override // jz.e
    public final int a(int i11) {
        return e.f37398b.a(i11);
    }

    @Override // jz.e
    public final double b() {
        return e.f37398b.b();
    }

    @Override // jz.e
    public final int c() {
        return e.f37398b.c();
    }

    @Override // jz.e
    public final int d(int i11) {
        return e.f37398b.d(i11);
    }

    @Override // jz.e
    public final int e(int i11, int i12) {
        return e.f37398b.e(i11, i12);
    }

    public final double f(double d5) {
        double dB;
        a aVar = e.f37398b;
        aVar.getClass();
        if (d5 <= 1.0d) {
            throw new IllegalArgumentException(i.f(Double.valueOf(1.0d), Double.valueOf(d5)).toString());
        }
        double d11 = d5 - 1.0d;
        if (!Double.isInfinite(d11) || Math.abs(1.0d) > Double.MAX_VALUE || Math.abs(d5) > Double.MAX_VALUE) {
            dB = 1.0d + (aVar.b() * d11);
        } else {
            double d12 = 2;
            double dB2 = ((d5 / d12) - (1.0d / d12)) * aVar.b();
            dB = 1.0d + dB2 + dB2;
        }
        return dB >= d5 ? Math.nextAfter(d5, Double.NEGATIVE_INFINITY) : dB;
    }
}
