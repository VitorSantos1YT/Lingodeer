package yc;

import android.graphics.Path;
import android.graphics.PointF;
import com.yalantis.ucrop.view.CropImageView;
import fd.w;
import java.util.ArrayList;
import java.util.List;
import wc.z;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements n, zc.a, k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f57620b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final wc.v f57621c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final zc.h f57622d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final zc.d f57623e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final fd.a f57624f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f57626h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Path f57619a = new Path();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ke.f f57625g = new ke.f(1);

    public f(wc.v vVar, gd.c cVar, fd.a aVar) {
        this.f57620b = aVar.f27143a;
        this.f57621c = vVar;
        zc.d dVarI = aVar.f27145c.I();
        this.f57622d = (zc.h) dVarI;
        zc.d dVarI2 = aVar.f27144b.I();
        this.f57623e = dVarI2;
        this.f57624f = aVar;
        cVar.g(dVarI);
        cVar.g(dVarI2);
        dVarI.a(this);
        dVarI2.a(this);
    }

    @Override // yc.n
    public final Path a() {
        boolean z11 = this.f57626h;
        Path path = this.f57619a;
        if (z11) {
            return path;
        }
        path.reset();
        fd.a aVar = this.f57624f;
        if (aVar.f27147e) {
            this.f57626h = true;
            return path;
        }
        PointF pointF = (PointF) this.f57622d.f();
        float f5 = pointF.x / 2.0f;
        float f11 = pointF.y / 2.0f;
        float f12 = f5 * 0.55228f;
        float f13 = f11 * 0.55228f;
        path.reset();
        if (aVar.f27146d) {
            float f14 = -f11;
            path.moveTo(CropImageView.DEFAULT_ASPECT_RATIO, f14);
            float f15 = CropImageView.DEFAULT_ASPECT_RATIO - f12;
            float f16 = -f5;
            float f17 = CropImageView.DEFAULT_ASPECT_RATIO - f13;
            path.cubicTo(f15, f14, f16, f17, f16, CropImageView.DEFAULT_ASPECT_RATIO);
            float f18 = f13 + CropImageView.DEFAULT_ASPECT_RATIO;
            path.cubicTo(f16, f18, f15, f11, CropImageView.DEFAULT_ASPECT_RATIO, f11);
            float f19 = f12 + CropImageView.DEFAULT_ASPECT_RATIO;
            path.cubicTo(f19, f11, f5, f18, f5, CropImageView.DEFAULT_ASPECT_RATIO);
            path.cubicTo(f5, f17, f19, f14, CropImageView.DEFAULT_ASPECT_RATIO, f14);
        } else {
            float f21 = -f11;
            path.moveTo(CropImageView.DEFAULT_ASPECT_RATIO, f21);
            float f22 = f12 + CropImageView.DEFAULT_ASPECT_RATIO;
            float f23 = CropImageView.DEFAULT_ASPECT_RATIO - f13;
            path.cubicTo(f22, f21, f5, f23, f5, CropImageView.DEFAULT_ASPECT_RATIO);
            float f24 = f13 + CropImageView.DEFAULT_ASPECT_RATIO;
            path.cubicTo(f5, f24, f22, f11, CropImageView.DEFAULT_ASPECT_RATIO, f11);
            float f25 = CropImageView.DEFAULT_ASPECT_RATIO - f12;
            float f26 = -f5;
            path.cubicTo(f25, f11, f26, f24, f26, CropImageView.DEFAULT_ASPECT_RATIO);
            path.cubicTo(f26, f23, f25, f21, CropImageView.DEFAULT_ASPECT_RATIO, f21);
        }
        PointF pointF2 = (PointF) this.f57623e.f();
        path.offset(pointF2.x, pointF2.y);
        path.close();
        this.f57625g.a(path);
        this.f57626h = true;
        return path;
    }

    @Override // zc.a
    public final void b() {
        this.f57626h = false;
        this.f57621c.invalidateSelf();
    }

    @Override // yc.c
    public final void c(List list, List list2) {
        int i11 = 0;
        while (true) {
            ArrayList arrayList = (ArrayList) list;
            if (i11 >= arrayList.size()) {
                return;
            }
            c cVar = (c) arrayList.get(i11);
            if (cVar instanceof v) {
                v vVar = (v) cVar;
                if (vVar.f57730c == w.SIMULTANEOUSLY) {
                    this.f57625g.f38141a.add(vVar);
                    vVar.f(this);
                }
            }
            i11++;
        }
    }

    @Override // dd.g
    public final void f(Object obj, ob.u uVar) {
        if (obj == z.f55048f) {
            this.f57622d.k(uVar);
        } else if (obj == z.f55051i) {
            this.f57623e.k(uVar);
        }
    }

    @Override // yc.c
    public final String getName() {
        return this.f57620b;
    }

    @Override // dd.g
    public final void h(dd.f fVar, int i11, ArrayList arrayList, dd.f fVar2) {
        kd.h.g(fVar, i11, arrayList, fVar2, this);
    }
}
