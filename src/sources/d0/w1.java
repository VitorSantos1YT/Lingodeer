package d0;

import android.view.View;
import android.widget.Magnifier;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class w1 implements u1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final w1 f22821b = new w1(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final w1 f22822c = new w1(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22823a;

    public /* synthetic */ w1(int i11) {
        this.f22823a = i11;
    }

    @Override // d0.u1
    public final boolean a() {
        switch (this.f22823a) {
            case 0:
                return false;
            default:
                return true;
        }
    }

    @Override // d0.u1
    public final t1 b(View view, v3.c cVar) {
        switch (this.f22823a) {
            case 0:
                return new v1(new Magnifier(view));
            default:
                return new x1(new Magnifier(view));
        }
    }
}
