package zc;

import android.graphics.PointF;
import com.yalantis.ucrop.view.CropImageView;
import fb.g0;
import hh.p0;
import java.util.List;
import ob.u;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends i {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f59110i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Object f59111j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(int i11, List list) {
        super(list);
        this.f59110i = i11;
        switch (i11) {
            case 1:
                super(list);
                this.f59111j = new PointF();
                break;
            case 2:
                super(list);
                this.f59111j = new ld.c();
                break;
            default:
                int iMax = 0;
                for (int i12 = 0; i12 < list.size(); i12++) {
                    fd.c cVar = (fd.c) ((ld.a) list.get(i12)).f39889b;
                    if (cVar != null) {
                        iMax = Math.max(iMax, cVar.f27149b.length);
                    }
                }
                this.f59111j = new fd.c(new float[iMax], new int[iMax]);
                break;
        }
    }

    @Override // zc.d
    public final Object g(ld.a aVar, float f5) {
        Object obj;
        float f11;
        switch (this.f59110i) {
            case 0:
                fd.c cVar = (fd.c) this.f59111j;
                fd.c cVar2 = (fd.c) aVar.f39889b;
                fd.c cVar3 = (fd.c) aVar.f39890c;
                int[] iArr = cVar.f27149b;
                float[] fArr = cVar.f27148a;
                boolean zEquals = cVar2.equals(cVar3);
                int[] iArr2 = cVar2.f27149b;
                if (zEquals || f5 <= CropImageView.DEFAULT_ASPECT_RATIO) {
                    cVar.a(cVar2);
                } else if (f5 >= 1.0f) {
                    cVar.a(cVar3);
                } else {
                    int length = iArr2.length;
                    int[] iArr3 = cVar3.f27149b;
                    if (length != iArr3.length) {
                        StringBuilder sb2 = new StringBuilder("Cannot interpolate between gradients. Lengths vary (");
                        sb2.append(iArr2.length);
                        sb2.append(" vs ");
                        throw new IllegalArgumentException(p0.i(iArr3.length, ")", sb2));
                    }
                    for (int i11 = 0; i11 < iArr2.length; i11++) {
                        fArr[i11] = kd.h.f(cVar2.f27148a[i11], cVar3.f27148a[i11], f5);
                        iArr[i11] = g0.n(iArr2[i11], f5, iArr3[i11]);
                    }
                    for (int length2 = iArr2.length; length2 < fArr.length; length2++) {
                        fArr[length2] = fArr[iArr2.length - 1];
                        iArr[length2] = iArr[iArr2.length - 1];
                    }
                }
                return cVar;
            case 1:
                return m(aVar, f5, f5, f5);
            default:
                ld.c cVar4 = (ld.c) this.f59111j;
                Object obj2 = aVar.f39889b;
                if (obj2 == null || (obj = aVar.f39890c) == null) {
                    throw new IllegalStateException("Missing values for keyframe.");
                }
                ld.c cVar5 = (ld.c) obj2;
                ld.c cVar6 = (ld.c) obj;
                u uVar = this.f59097e;
                if (uVar != null) {
                    f11 = f5;
                    ld.c cVar7 = (ld.c) uVar.u(aVar.f39894g, aVar.f39895h.floatValue(), cVar5, cVar6, f11, e(), this.f59096d);
                    if (cVar7 != null) {
                        return cVar7;
                    }
                } else {
                    f11 = f5;
                }
                float f12 = kd.h.f(cVar5.f39910a, cVar6.f39910a, f11);
                float f13 = kd.h.f(cVar5.f39911b, cVar6.f39911b, f11);
                cVar4.f39910a = f12;
                cVar4.f39911b = f13;
                return cVar4;
        }
    }

    @Override // zc.d
    public /* bridge */ /* synthetic */ Object h(ld.a aVar, float f5, float f11, float f12) {
        switch (this.f59110i) {
            case 1:
                return m(aVar, f5, f11, f12);
            default:
                return super.h(aVar, f5, f11, f12);
        }
    }

    public PointF m(ld.a aVar, float f5, float f11, float f12) {
        Object obj;
        PointF pointF;
        PointF pointF2 = (PointF) this.f59111j;
        Object obj2 = aVar.f39889b;
        if (obj2 == null || (obj = aVar.f39890c) == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        PointF pointF3 = (PointF) obj2;
        PointF pointF4 = (PointF) obj;
        u uVar = this.f59097e;
        if (uVar != null && (pointF = (PointF) uVar.u(aVar.f39894g, aVar.f39895h.floatValue(), pointF3, pointF4, f5, e(), this.f59096d)) != null) {
            return pointF;
        }
        float f13 = pointF3.x;
        float fA = p0.a(pointF4.x, f13, f11, f13);
        float f14 = pointF3.y;
        pointF2.set(fA, p0.a(pointF4.y, f14, f12, f14));
        return pointF2;
    }
}
