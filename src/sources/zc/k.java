package zc;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import com.yalantis.ucrop.view.CropImageView;
import java.util.ArrayList;
import ob.u;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class k extends i {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final PointF f59114i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final float[] f59115j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final float[] f59116k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final PathMeasure f59117l;
    public j m;

    public k(ArrayList arrayList) {
        super(arrayList);
        this.f59114i = new PointF();
        this.f59115j = new float[2];
        this.f59116k = new float[2];
        this.f59117l = new PathMeasure();
    }

    @Override // zc.d
    public final Object g(ld.a aVar, float f5) {
        float f11;
        j jVar = (j) aVar;
        Path path = jVar.f59112q;
        u uVar = this.f59097e;
        if (uVar == null || aVar.f39895h == null) {
            f11 = f5;
        } else {
            f11 = f5;
            PointF pointF = (PointF) uVar.u(jVar.f39894g, jVar.f39895h.floatValue(), (PointF) jVar.f39889b, (PointF) jVar.f39890c, e(), f11, this.f59096d);
            if (pointF != null) {
                return pointF;
            }
        }
        if (path == null) {
            return (PointF) aVar.f39889b;
        }
        j jVar2 = this.m;
        PathMeasure pathMeasure = this.f59117l;
        if (jVar2 != jVar) {
            pathMeasure.setPath(path, false);
            this.m = jVar;
        }
        float length = pathMeasure.getLength();
        float f12 = f11 * length;
        float[] fArr = this.f59115j;
        float[] fArr2 = this.f59116k;
        pathMeasure.getPosTan(f12, fArr, fArr2);
        float f13 = fArr[0];
        float f14 = fArr[1];
        PointF pointF2 = this.f59114i;
        pointF2.set(f13, f14);
        if (f12 < CropImageView.DEFAULT_ASPECT_RATIO) {
            pointF2.offset(fArr2[0] * f12, fArr2[1] * f12);
            return pointF2;
        }
        if (f12 > length) {
            float f15 = f12 - length;
            pointF2.offset(fArr2[0] * f15, fArr2[1] * f15);
        }
        return pointF2;
    }
}
