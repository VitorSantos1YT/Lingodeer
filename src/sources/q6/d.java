package q6;

import com.yalantis.ucrop.view.CropImageView;
import y.u;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u f47479a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u f47480b;

    static {
        Float fValueOf = Float.valueOf(CropImageView.DEFAULT_ASPECT_RATIO);
        qy.l lVar = new qy.l(fValueOf, fValueOf);
        Float fValueOf2 = Float.valueOf(0.5f);
        new d(lVar, new qy.l(fValueOf2, fValueOf2));
    }

    public d(qy.l... mappings) {
        kotlin.jvm.internal.m.f(mappings, "mappings");
        this.f47479a = new u(mappings.length);
        this.f47480b = new u(mappings.length);
        int length = mappings.length;
        for (int i11 = 0; i11 < length; i11++) {
            this.f47479a.a(((Number) mappings[i11].f48495a).floatValue());
            this.f47480b.a(((Number) mappings[i11].f48496b).floatValue());
        }
        ff.h.T(this.f47479a);
        ff.h.T(this.f47480b);
    }
}
