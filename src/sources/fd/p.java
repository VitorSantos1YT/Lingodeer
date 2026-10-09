package fd;

import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f27194a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public PointF f27195b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f27196c;

    public p(PointF pointF, boolean z11, List list) {
        this.f27195b = pointF;
        this.f27196c = z11;
        this.f27194a = new ArrayList(list);
    }

    public final void a(float f5, float f11) {
        if (this.f27195b == null) {
            this.f27195b = new PointF();
        }
        this.f27195b.set(f5, f11);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ShapeData{numCurves=");
        sb2.append(this.f27194a.size());
        sb2.append("closed=");
        return ep.a.l(sb2, this.f27196c, '}');
    }

    public p() {
        this.f27194a = new ArrayList();
    }
}
