package h4;

import android.view.animation.Interpolator;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class p implements Interpolator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31745a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c4.e f31746b;

    public /* synthetic */ p(c4.e eVar, int i11) {
        this.f31745a = i11;
        this.f31746b = eVar;
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f5) {
        double dA;
        switch (this.f31745a) {
            case 0:
                dA = this.f31746b.a(f5);
                break;
            case 1:
                dA = this.f31746b.a(f5);
                break;
            default:
                dA = this.f31746b.a(f5);
                break;
        }
        return (float) dA;
    }
}
