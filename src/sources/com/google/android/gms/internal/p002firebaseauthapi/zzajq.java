package com.google.android.gms.internal.p002firebaseauthapi;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class zzajq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f10078a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f10079b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f10080c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f10081d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f10082e;

    public /* synthetic */ zzajq(int i11) {
        this();
    }

    public static int b(int i11) {
        return (-(i11 & 1)) ^ (i11 >>> 1);
    }

    public static long c(long j11) {
        return (-(j11 & 1)) ^ (j11 >>> 1);
    }

    public static zzajq d(byte[] bArr, int i11, int i12) {
        zzaju zzajuVar = new zzaju(bArr, i11, i12);
        try {
            zzajuVar.f(i12);
            return zzajuVar;
        } catch (zzale e8) {
            throw new IllegalArgumentException(e8);
        }
    }

    public abstract boolean A();

    public abstract boolean B();

    public abstract double a();

    public abstract float e();

    public abstract int f(int i11);

    public abstract int g();

    public abstract void h(int i11);

    public abstract int i();

    public abstract void j(int i11);

    public abstract int k();

    public abstract boolean l(int i11);

    public abstract int m();

    public abstract int n();

    public abstract int o();

    public abstract int p();

    public abstract int q();

    public abstract long r();

    public abstract long s();

    public abstract long t();

    public abstract long u();

    public abstract long v();

    public abstract zzaje w();

    public abstract String x();

    public abstract String y();

    public final void z() throws zzale {
        boolean zL;
        do {
            int iP = p();
            if (iP == 0) {
                return;
            }
            int i11 = this.f10078a;
            int i12 = this.f10079b;
            if (i11 + i12 >= this.f10080c) {
                throw new zzale("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
            }
            this.f10079b = i12 + 1;
            zL = l(iP);
            this.f10079b--;
        } while (zL);
    }

    private zzajq() {
        this.f10080c = 100;
        this.f10081d = Integer.MAX_VALUE;
    }
}
