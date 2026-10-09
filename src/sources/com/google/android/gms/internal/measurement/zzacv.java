package com.google.android.gms.internal.measurement;

import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class zzacv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f11229a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f11230b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f11231c;

    private zzacv() {
    }

    public static zzacv h(InputStream inputStream, int i11) {
        if (i11 <= 0) {
            throw new IllegalArgumentException("bufferSize must be > 0");
        }
        if (inputStream != null) {
            return new zzacu(inputStream, i11);
        }
        zzact zzactVar = new zzact(zzaed.f11274a);
        try {
            zzactVar.a(0);
            return zzactVar;
        } catch (zzaeh e8) {
            throw new IllegalArgumentException(e8);
        }
    }

    public static int j(int i11) {
        return (i11 >>> 1) ^ (-(i11 & 1));
    }

    public static long k(long j11) {
        return (j11 >>> 1) ^ (-(1 & j11));
    }

    public abstract int A();

    public abstract int B();

    public abstract int C();

    public abstract long D();

    public abstract int E();

    public abstract long F();

    public abstract int G();

    public abstract long H();

    public abstract int a(int i11);

    public abstract void b(int i11);

    public abstract int c();

    public abstract boolean d();

    public abstract int e();

    public abstract int f(byte[] bArr, int i11, int i12);

    public abstract void g(int i11);

    public final void i() {
        boolean zN;
        do {
            int iL = l();
            if (iL == 0) {
                return;
            }
            int i11 = this.f11229a;
            int i12 = this.f11230b;
            if (i11 + i12 >= 100) {
                throw new zzaeh("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
            }
            this.f11230b = i12 + 1;
            zN = n(iL);
            this.f11230b--;
        } while (zN);
    }

    public abstract int l();

    public abstract void m(int i11);

    public abstract boolean n(int i11);

    public abstract double o();

    public abstract float p();

    public abstract long q();

    public abstract long r();

    public abstract int s();

    public abstract long t();

    public abstract int u();

    public abstract boolean v();

    public abstract String w();

    public abstract String x();

    public abstract zzacr y();

    public abstract byte[] z();
}
