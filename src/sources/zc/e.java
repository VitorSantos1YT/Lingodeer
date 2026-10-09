package zc;

import android.graphics.PointF;
import com.yalantis.ucrop.view.CropImageView;
import fb.g0;
import java.util.List;
import ob.u;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends i {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f59101i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(int i11, List list) {
        super(list);
        this.f59101i = i11;
    }

    @Override // zc.d
    public final Object g(ld.a aVar, float f5) {
        int i11;
        int iIntValue;
        Integer num;
        Object obj;
        switch (this.f59101i) {
            case 0:
                return Integer.valueOf(m(aVar, f5));
            case 1:
                Object obj2 = aVar.f39889b;
                if (obj2 == null) {
                    throw new IllegalStateException("Missing values for keyframe.");
                }
                Object obj3 = aVar.f39890c;
                if (obj3 == null) {
                    if (aVar.f39898k == 784923401) {
                        aVar.f39898k = ((Integer) obj2).intValue();
                    }
                    i11 = aVar.f39898k;
                } else {
                    if (aVar.f39899l == 784923401) {
                        aVar.f39899l = ((Integer) obj3).intValue();
                    }
                    i11 = aVar.f39899l;
                }
                int i12 = i11;
                u uVar = this.f59097e;
                if (uVar == null || (num = (Integer) uVar.u(aVar.f39894g, aVar.f39895h.floatValue(), (Integer) obj2, Integer.valueOf(i12), f5, e(), this.f59096d)) == null) {
                    if (aVar.f39898k == 784923401) {
                        aVar.f39898k = ((Integer) obj2).intValue();
                    }
                    int i13 = aVar.f39898k;
                    PointF pointF = kd.h.f38098a;
                    iIntValue = (int) (((i12 - i13) * f5) + i13);
                } else {
                    iIntValue = num.intValue();
                }
                return Integer.valueOf(iIntValue);
            default:
                Object obj4 = aVar.f39889b;
                u uVar2 = this.f59097e;
                if (uVar2 == null) {
                    return (f5 != 1.0f || (obj = aVar.f39890c) == null) ? (dd.c) obj4 : (dd.c) obj;
                }
                float f11 = aVar.f39894g;
                Float f12 = aVar.f39895h;
                float fFloatValue = f12 == null ? Float.MAX_VALUE : f12.floatValue();
                dd.c cVar = (dd.c) obj4;
                Object obj5 = aVar.f39890c;
                return (dd.c) uVar2.u(f11, fFloatValue, cVar, obj5 == null ? cVar : (dd.c) obj5, f5, d(), this.f59096d);
        }
    }

    public int m(ld.a aVar, float f5) {
        float f11;
        Float f12;
        Object obj = aVar.f39889b;
        Object obj2 = aVar.f39889b;
        if (obj == null || aVar.f39890c == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        u uVar = this.f59097e;
        if (uVar == null || (f12 = aVar.f39895h) == null) {
            f11 = f5;
        } else {
            f11 = f5;
            Integer num = (Integer) uVar.u(aVar.f39894g, f12.floatValue(), (Integer) obj2, (Integer) aVar.f39890c, f11, e(), this.f59096d);
            if (num != null) {
                return num.intValue();
            }
        }
        return g0.n(((Integer) obj2).intValue(), kd.h.b(f11, CropImageView.DEFAULT_ASPECT_RATIO, 1.0f), ((Integer) aVar.f39890c).intValue());
    }
}
