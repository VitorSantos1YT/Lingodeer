package jz;

import java.util.Random;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class a extends e {
    @Override // jz.e
    public final int a(int i11) {
        return ((-i11) >> 31) & (f().nextInt() >>> (32 - i11));
    }

    @Override // jz.e
    public final double b() {
        return f().nextDouble();
    }

    @Override // jz.e
    public final int c() {
        return f().nextInt();
    }

    @Override // jz.e
    public final int d(int i11) {
        return f().nextInt(i11);
    }

    public abstract Random f();
}
