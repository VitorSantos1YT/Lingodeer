package zc;

import ob.u;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends i {
    @Override // zc.d
    public final Object g(ld.a aVar, float f5) {
        return Float.valueOf(n(aVar, f5));
    }

    public final float m() {
        return n(b(), d());
    }

    public final float n(ld.a aVar, float f5) {
        float f11;
        Object obj = aVar.f39889b;
        Object obj2 = aVar.f39889b;
        if (obj == null || aVar.f39890c == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        u uVar = this.f59097e;
        if (uVar != null) {
            f11 = f5;
            Float f12 = (Float) uVar.u(aVar.f39894g, aVar.f39895h.floatValue(), (Float) obj2, (Float) aVar.f39890c, f11, e(), this.f59096d);
            if (f12 != null) {
                return f12.floatValue();
            }
        } else {
            f11 = f5;
        }
        if (aVar.f39896i == -3987645.8f) {
            aVar.f39896i = ((Float) obj2).floatValue();
        }
        float f13 = aVar.f39896i;
        if (aVar.f39897j == -3987645.8f) {
            aVar.f39897j = ((Float) aVar.f39890c).floatValue();
        }
        return kd.h.f(f13, aVar.f39897j, f11);
    }
}
