package zc;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import com.yalantis.ucrop.view.CropImageView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends ld.a {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Path f59112q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ld.a f59113r;

    public j(wc.h hVar, ld.a aVar) {
        super(hVar, (PointF) aVar.f39889b, (PointF) aVar.f39890c, aVar.f39891d, aVar.f39892e, aVar.f39893f, aVar.f39894g, aVar.f39895h);
        this.f59113r = aVar;
        d();
    }

    public final void d() {
        Object obj;
        Object obj2 = this.f39890c;
        Object obj3 = this.f39889b;
        boolean z11 = (obj2 == null || obj3 == null || !((PointF) obj3).equals(((PointF) obj2).x, ((PointF) obj2).y)) ? false : true;
        if (obj3 == null || (obj = this.f39890c) == null || z11) {
            return;
        }
        PointF pointF = (PointF) obj3;
        PointF pointF2 = (PointF) obj;
        ld.a aVar = this.f59113r;
        PointF pointF3 = aVar.f39901o;
        PointF pointF4 = aVar.f39902p;
        Matrix matrix = kd.k.f38124a;
        Path path = new Path();
        path.moveTo(pointF.x, pointF.y);
        if (pointF3 == null || pointF4 == null || (pointF3.length() == CropImageView.DEFAULT_ASPECT_RATIO && pointF4.length() == CropImageView.DEFAULT_ASPECT_RATIO)) {
            path.lineTo(pointF2.x, pointF2.y);
        } else {
            float f5 = pointF3.x + pointF.x;
            float f11 = pointF.y + pointF3.y;
            float f12 = pointF2.x;
            float f13 = f12 + pointF4.x;
            float f14 = pointF2.y;
            path.cubicTo(f5, f11, f13, f14 + pointF4.y, f12, f14);
        }
        this.f59112q = path;
    }
}
