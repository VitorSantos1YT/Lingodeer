package z4;

import android.view.animation.Interpolator;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class f1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f58834a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f58835b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Interpolator f58836c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f58837d;

    public f1(int i11, Interpolator interpolator, long j11) {
        this.f58834a = i11;
        this.f58836c = interpolator;
        this.f58837d = j11;
    }

    public float a() {
        return 1.0f;
    }

    public long b() {
        return this.f58837d;
    }

    public float c() {
        Interpolator interpolator = this.f58836c;
        return interpolator != null ? interpolator.getInterpolation(this.f58835b) : this.f58835b;
    }

    public int d() {
        return this.f58834a;
    }

    public void e(float f5) {
        this.f58835b = f5;
    }
}
