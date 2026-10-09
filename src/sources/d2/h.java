package d2;

import com.yalantis.ucrop.view.CropImageView;
import g2.f0;
import g2.p;
import g2.w0;
import z1.r;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class h {
    public static final r a(r rVar, float f5) {
        return f5 == 1.0f ? rVar : f0.s(rVar, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, f5, CropImageView.DEFAULT_ASPECT_RATIO, null, 520187);
    }

    public static final r b(r rVar, w0 w0Var) {
        return f0.s(rVar, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, w0Var, 518143);
    }

    public static final r c(r rVar) {
        return f0.s(rVar, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, null, 520191);
    }

    public static final r d(r rVar, fz.c cVar) {
        return rVar.i(new g(cVar));
    }

    public static final r e(r rVar, fz.c cVar) {
        return rVar.i(new i(cVar));
    }

    public static final r f(r rVar, fz.c cVar) {
        return rVar.i(new j(cVar));
    }

    public static r g(r rVar, k2.b bVar, z1.e eVar, w2.j jVar, float f5, p pVar, int i11) {
        if ((i11 & 4) != 0) {
            eVar = z1.c.f58467e;
        }
        z1.e eVar2 = eVar;
        if ((i11 & 16) != 0) {
            f5 = 1.0f;
        }
        return rVar.i(new m(bVar, eVar2, jVar, f5, pVar));
    }

    public static final r h(r rVar, float f5) {
        return f5 == CropImageView.DEFAULT_ASPECT_RATIO ? rVar : f0.s(rVar, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, f5, null, 524031);
    }

    public static final r i(r rVar, float f5, float f11) {
        return (f5 == 1.0f && f11 == 1.0f) ? rVar : f0.s(rVar, f5, f11, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, null, 524284);
    }
}
