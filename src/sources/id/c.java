package id;

import android.graphics.PointF;
import android.view.animation.BaseInterpolator;
import com.yalantis.ucrop.view.CropImageView;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b1.p f34333a = b1.p.E("a", "p", "s", "rz", "r", "o", "so", "eo", "sk", "sa");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b1.p f34334b = b1.p.E("k");

    /* JADX WARN: Code duplicated, block: B:22:0x006b  */
    /* JADX WARN: Code duplicated, block: B:23:0x0088  */
    /* JADX WARN: Code duplicated, block: B:25:0x0096  */
    /* JADX WARN: Code duplicated, block: B:75:0x0179  */
    public static ed.e a(jd.e eVar, wc.h hVar) {
        ed.a aVar;
        ed.b bVarW;
        List list;
        ed.b bVar;
        ed.b bVar2;
        Float fValueOf = Float.valueOf(CropImageView.DEFAULT_ASPECT_RATIO);
        boolean z11 = eVar.v() == jd.c.BEGIN_OBJECT;
        if (z11) {
            eVar.b();
        }
        ed.b bVar3 = null;
        ed.b bVarW2 = null;
        ed.c cVarA = null;
        ed.f fVarB = null;
        ed.a aVar2 = null;
        ed.b bVarW3 = null;
        ed.a aVarY = null;
        ed.b bVarW4 = null;
        ed.b bVarW5 = null;
        while (eVar.f()) {
            switch (eVar.y(f34333a)) {
                case 0:
                    eVar.b();
                    while (eVar.f()) {
                        if (eVar.y(f34334b) != 0) {
                            eVar.A();
                            eVar.B();
                        } else {
                            cVarA = a.a(eVar, hVar);
                        }
                    }
                    eVar.d();
                    bVarW2 = bVarW2;
                    break;
                case 1:
                    fVarB = a.b(eVar, hVar);
                    break;
                case 2:
                    aVar2 = new ed.a(4, q.a(eVar, hVar, 1.0f, f.f34347t, false));
                    bVarW2 = bVarW2;
                    break;
                case 3:
                    hVar.a("Lottie doesn't support 3D layers.");
                    bVarW = qx.p.w(eVar, hVar, false);
                    list = (List) bVarW.f3561b;
                    if (list.isEmpty()) {
                        bVar = bVarW;
                        bVar2 = bVarW2;
                        list.add(new ld.a(hVar, fValueOf, fValueOf, (BaseInterpolator) null, CropImageView.DEFAULT_ASPECT_RATIO, Float.valueOf(hVar.m)));
                    } else {
                        bVar = bVarW;
                        bVar2 = bVarW2;
                        if (((ld.a) list.get(0)).f39889b == null) {
                            list.set(0, new ld.a(hVar, fValueOf, fValueOf, (BaseInterpolator) null, CropImageView.DEFAULT_ASPECT_RATIO, Float.valueOf(hVar.m)));
                        }
                    }
                    bVarW2 = bVar2;
                    bVar3 = bVar;
                    break;
                case 4:
                    bVarW = qx.p.w(eVar, hVar, false);
                    list = (List) bVarW.f3561b;
                    if (list.isEmpty()) {
                        bVar = bVarW;
                        bVar2 = bVarW2;
                        list.add(new ld.a(hVar, fValueOf, fValueOf, (BaseInterpolator) null, CropImageView.DEFAULT_ASPECT_RATIO, Float.valueOf(hVar.m)));
                    } else {
                        bVar = bVarW;
                        bVar2 = bVarW2;
                        if (((ld.a) list.get(0)).f39889b == null) {
                            list.set(0, new ld.a(hVar, fValueOf, fValueOf, (BaseInterpolator) null, CropImageView.DEFAULT_ASPECT_RATIO, Float.valueOf(hVar.m)));
                        }
                    }
                    bVarW2 = bVar2;
                    bVar3 = bVar;
                    break;
                case 5:
                    aVarY = qx.p.y(eVar, hVar);
                    break;
                case 6:
                    bVarW4 = qx.p.w(eVar, hVar, false);
                    break;
                case 7:
                    bVarW5 = qx.p.w(eVar, hVar, false);
                    break;
                case 8:
                    bVarW3 = qx.p.w(eVar, hVar, false);
                    break;
                case 9:
                    bVarW2 = qx.p.w(eVar, hVar, false);
                    break;
                default:
                    eVar.A();
                    eVar.B();
                    break;
            }
        }
        ed.b bVar4 = bVarW2;
        if (z11) {
            eVar.d();
        }
        ed.c cVar = (cVarA == null || (cVarA.R() && ((PointF) ((ld.a) cVarA.f25470a.get(0)).f39889b).equals(CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO))) ? null : cVarA;
        if (fVarB == null || (!(fVarB instanceof ed.d) && fVarB.R() && ((PointF) ((ld.a) fVarB.O().get(0)).f39889b).equals(CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO))) {
            fVarB = null;
        }
        ed.b bVar5 = (bVar3 == null || (bVar3.R() && ((Float) ((ld.a) ((List) bVar3.f3561b).get(0)).f39889b).floatValue() == CropImageView.DEFAULT_ASPECT_RATIO)) ? null : bVar3;
        if (aVar2 == null) {
            aVar = null;
        } else {
            if (aVar2.R()) {
                ld.c cVar2 = (ld.c) ((ld.a) ((List) aVar2.f3561b).get(0)).f39889b;
                if (cVar2.f39910a == 1.0f && cVar2.f39911b == 1.0f) {
                    aVar = null;
                }
            }
            aVar = aVar2;
        }
        return new ed.e(cVar, fVarB, aVar, bVar5, aVarY, bVarW4, bVarW5, (bVarW3 == null || (bVarW3.R() && ((Float) ((ld.a) ((List) bVarW3.f3561b).get(0)).f39889b).floatValue() == CropImageView.DEFAULT_ASPECT_RATIO)) ? null : bVarW3, (bVar4 == null || (bVar4.R() && ((Float) ((ld.a) ((List) bVar4.f3561b).get(0)).f39889b).floatValue() == CropImageView.DEFAULT_ASPECT_RATIO)) ? null : bVar4);
    }
}
