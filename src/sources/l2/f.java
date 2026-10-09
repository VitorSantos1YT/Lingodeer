package l2;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f39600a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f39601b;

    public f(int i11) {
        this.f39600a = i11;
        switch (i11) {
            case 1:
                this.f39601b = new ArrayList();
                break;
            default:
                this.f39601b = new ArrayList(32);
                break;
        }
    }

    public void a(Object obj, String str) {
        this.f39601b.add(str + "=" + obj);
    }

    public void b() {
        this.f39601b.add(j.f39641c);
    }

    public void c(float f5, float f11, float f12, float f13, float f14, float f15) {
        this.f39601b.add(new s(f5, f11, f12, f13, f14, f15));
    }

    public void d(float f5) {
        this.f39601b.add(new t(f5));
    }

    public void e(float f5, float f11) {
        this.f39601b.add(new m(f5, f11));
    }

    public void f(float f5, float f11) {
        this.f39601b.add(new u(f5, f11));
    }

    public void g(float f5, float f11) {
        this.f39601b.add(new n(f5, f11));
    }

    public void h(float f5) {
        this.f39601b.add(new z(f5));
    }

    public String toString() {
        switch (this.f39600a) {
            case 1:
                return this.f39601b.toString();
            default:
                return super.toString();
        }
    }
}
