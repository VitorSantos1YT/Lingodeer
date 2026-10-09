package com.google.android.material.progressindicator;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class LinearProgressIndicatorSpec extends BaseProgressIndicatorSpec {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f15069o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f15070p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f15071q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f15072r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Integer f15073s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f15074t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public float f15075u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f15076v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f15077w;

    @Override // com.google.android.material.progressindicator.BaseProgressIndicatorSpec
    public final boolean c() {
        return super.c() && e() == a();
    }

    @Override // com.google.android.material.progressindicator.BaseProgressIndicatorSpec
    public final void d() {
        super.d();
        if (this.f15072r < 0) {
            throw new IllegalArgumentException("Stop indicator size must be >= 0.");
        }
        if (this.f15069o == 0) {
            if ((a() > 0 || (this.f15077w && e() > 0)) && this.f14963i == 0) {
                throw new IllegalArgumentException("Rounded corners without gap are not supported in contiguous indeterminate animation.");
            }
            if (this.f14959e.length < 3) {
                throw new IllegalArgumentException("Contiguous indeterminate animation must be used with 3 or more indicator colors.");
            }
        }
    }

    public final int e() {
        if (this.f15077w) {
            return this.f15076v ? (int) (this.f14955a * this.f15075u) : this.f15074t;
        }
        return a();
    }
}
