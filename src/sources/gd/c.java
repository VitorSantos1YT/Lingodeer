package gd;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.os.Build;
import com.yalantis.ucrop.view.CropImageView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import ob.u;
import qp.m3;
import wc.c0;
import wc.v;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c implements yc.e, zc.a, dd.g {
    public float A;
    public BlurMaskFilter B;
    public m C;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Path f29073a = new Path();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Matrix f29074b = new Matrix();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Matrix f29075c = new Matrix();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final m f29076d = new m(1, 2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final m f29077e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final m f29078f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final m f29079g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final m f29080h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final RectF f29081i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final RectF f29082j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final RectF f29083k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final RectF f29084l;
    public final RectF m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Matrix f29085n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final v f29086o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final i f29087p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final m3 f29088q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final zc.g f29089r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public c f29090s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public c f29091t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public List f29092u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final ArrayList f29093v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final zc.o f29094w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f29095x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f29096y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public m f29097z;

    public c(v vVar, i iVar) {
        PorterDuff.Mode mode = PorterDuff.Mode.DST_IN;
        this.f29077e = new m(mode);
        PorterDuff.Mode mode2 = PorterDuff.Mode.DST_OUT;
        this.f29078f = new m(mode2);
        m mVar = new m(1, 2);
        this.f29079g = mVar;
        PorterDuff.Mode mode3 = PorterDuff.Mode.CLEAR;
        m mVar2 = new m();
        mVar2.setXfermode(new PorterDuffXfermode(mode3));
        this.f29080h = mVar2;
        this.f29081i = new RectF();
        this.f29082j = new RectF();
        this.f29083k = new RectF();
        this.f29084l = new RectF();
        this.m = new RectF();
        this.f29085n = new Matrix();
        this.f29093v = new ArrayList();
        this.f29095x = true;
        this.A = CropImageView.DEFAULT_ASPECT_RATIO;
        this.f29086o = vVar;
        this.f29087p = iVar;
        List list = iVar.f29106h;
        if (iVar.f29118u == h.INVERT) {
            mVar.setXfermode(new PorterDuffXfermode(mode2));
        } else {
            mVar.setXfermode(new PorterDuffXfermode(mode));
        }
        ed.e eVar = iVar.f29107i;
        eVar.getClass();
        zc.o oVar = new zc.o(eVar);
        this.f29094w = oVar;
        oVar.b(this);
        if (list != null && !list.isEmpty()) {
            m3 m3Var = new m3();
            m3Var.f48057b = list;
            m3Var.f48058c = new ArrayList(list.size());
            m3Var.f48056a = new ArrayList(list.size());
            for (int i11 = 0; i11 < list.size(); i11++) {
                ((ArrayList) m3Var.f48058c).add(new zc.l((List) ((fd.i) list.get(i11)).f27171b.f3561b));
                ((ArrayList) m3Var.f48056a).add(((fd.i) list.get(i11)).f27172c.I());
            }
            this.f29088q = m3Var;
            ArrayList arrayList = (ArrayList) m3Var.f48058c;
            int size = arrayList.size();
            int i12 = 0;
            while (i12 < size) {
                Object obj = arrayList.get(i12);
                i12++;
                ((zc.d) obj).a(this);
            }
            ArrayList arrayList2 = (ArrayList) this.f29088q.f48056a;
            int size2 = arrayList2.size();
            int i13 = 0;
            while (i13 < size2) {
                Object obj2 = arrayList2.get(i13);
                i13++;
                zc.d dVar = (zc.d) obj2;
                g(dVar);
                dVar.a(this);
            }
        }
        i iVar2 = this.f29087p;
        if (iVar2.f29117t.isEmpty()) {
            if (true != this.f29095x) {
                this.f29095x = true;
                this.f29086o.invalidateSelf();
                return;
            }
            return;
        }
        zc.g gVar = new zc.g(iVar2.f29117t);
        this.f29089r = gVar;
        gVar.f59094b = true;
        gVar.a(new zc.a() { // from class: gd.a
            @Override // zc.a
            public final void b() {
                c cVar = this.f29070a;
                boolean z11 = cVar.f29089r.m() == 1.0f;
                if (z11 != cVar.f29095x) {
                    cVar.f29095x = z11;
                    cVar.f29086o.invalidateSelf();
                }
            }
        });
        boolean z11 = ((Float) this.f29089r.f()).floatValue() == 1.0f;
        if (z11 != this.f29095x) {
            this.f29095x = z11;
            this.f29086o.invalidateSelf();
        }
        g(this.f29089r);
    }

    @Override // zc.a
    public final void b() {
        this.f29086o.invalidateSelf();
    }

    @Override // yc.e
    public final void d(Canvas canvas, Matrix matrix, int i11, kd.b bVar) {
        Path path;
        float f5;
        int i12;
        m mVar;
        float f11;
        char c11;
        r4.a aVar;
        Integer num;
        wc.a aVar2 = wc.d.f54943a;
        if (this.f29095x) {
            i iVar = this.f29087p;
            boolean z11 = iVar.f29119v;
            fd.g gVar = iVar.f29122y;
            if (z11) {
                return;
            }
            i();
            Matrix matrix2 = this.f29074b;
            matrix2.reset();
            matrix2.set(matrix);
            for (int size = this.f29092u.size() - 1; size >= 0; size--) {
                matrix2.preConcat(((c) this.f29092u.get(size)).f29094w.e());
            }
            wc.a aVar3 = wc.d.f54943a;
            zc.o oVar = this.f29094w;
            zc.d dVar = oVar.f59139j;
            int iIntValue = (int) ((((i11 / 255.0f) * ((dVar == null || (num = (Integer) dVar.f()) == null) ? 100 : num.intValue())) / 100.0f) * 255.0f);
            if (this.f29090s == null && !m() && gVar == fd.g.NORMAL) {
                matrix2.preConcat(oVar.e());
                k(canvas, matrix2, iIntValue, bVar);
                n();
                return;
            }
            RectF rectF = this.f29081i;
            e(rectF, matrix2, false);
            if (this.f29090s != null && iVar.f29118u != h.INVERT) {
                RectF rectF2 = this.f29084l;
                rectF2.set(CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO);
                this.f29090s.e(rectF2, matrix, true);
                if (!rectF.intersect(rectF2)) {
                    rectF.set(CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO);
                }
            }
            matrix2.preConcat(oVar.e());
            RectF rectF3 = this.f29083k;
            rectF3.set(CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO);
            boolean zM = m();
            m3 m3Var = this.f29088q;
            Path path2 = this.f29073a;
            if (zM) {
                int size2 = ((List) m3Var.f48057b).size();
                int i13 = 0;
                while (true) {
                    if (i13 < size2) {
                        fd.i iVar2 = (fd.i) ((List) m3Var.f48057b).get(i13);
                        Path path3 = (Path) ((zc.d) ((ArrayList) m3Var.f48058c).get(i13)).f();
                        if (path3 == null) {
                            i12 = size2;
                        } else {
                            path2.set(path3);
                            path2.transform(matrix2);
                            i12 = size2;
                            int i14 = b.f29072b[iVar2.f27170a.ordinal()];
                            if (i14 == 1 || i14 == 2 || ((i14 == 3 || i14 == 4) && iVar2.f27173d)) {
                                path = path2;
                                f5 = CropImageView.DEFAULT_ASPECT_RATIO;
                            } else {
                                RectF rectF4 = this.m;
                                path2.computeBounds(rectF4, false);
                                if (i13 == 0) {
                                    rectF3.set(rectF4);
                                } else {
                                    rectF3.set(Math.min(rectF3.left, rectF4.left), Math.min(rectF3.top, rectF4.top), Math.max(rectF3.right, rectF4.right), Math.max(rectF3.bottom, rectF4.bottom));
                                }
                                i13++;
                                size2 = i12;
                                path2 = path2;
                            }
                        }
                        i13++;
                        size2 = i12;
                        path2 = path2;
                    } else {
                        path = path2;
                        if (rectF.intersect(rectF3)) {
                            f5 = CropImageView.DEFAULT_ASPECT_RATIO;
                        } else {
                            f5 = CropImageView.DEFAULT_ASPECT_RATIO;
                            rectF.set(CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO);
                        }
                    }
                }
            } else {
                path = path2;
                f5 = CropImageView.DEFAULT_ASPECT_RATIO;
            }
            float width = canvas.getWidth();
            float height = canvas.getHeight();
            RectF rectF5 = this.f29082j;
            rectF5.set(f5, f5, width, height);
            Matrix matrix3 = this.f29075c;
            canvas.getMatrix(matrix3);
            if (!matrix3.isIdentity()) {
                matrix3.invert(matrix3);
                matrix3.mapRect(rectF5);
            }
            if (!rectF.intersect(rectF5)) {
                rectF.set(f5, f5, f5, f5);
            }
            wc.a aVar4 = wc.d.f54943a;
            if (rectF.width() >= 1.0f && rectF.height() >= 1.0f) {
                m mVar2 = this.f29076d;
                mVar2.setAlpha(255);
                int iOrdinal = gVar.ordinal();
                if (iOrdinal != 1) {
                    c11 = 2;
                    if (iOrdinal != 2) {
                        f11 = 1.0f;
                        if (iOrdinal == 3) {
                            aVar = r4.a.OVERLAY;
                        } else if (iOrdinal == 4) {
                            aVar = r4.a.DARKEN;
                        } else if (iOrdinal != 5) {
                            aVar = iOrdinal != 16 ? null : r4.a.PLUS;
                        } else {
                            aVar = r4.a.LIGHTEN;
                        }
                    } else {
                        f11 = 1.0f;
                        aVar = r4.a.SCREEN;
                    }
                } else {
                    f11 = 1.0f;
                    c11 = 2;
                    aVar = r4.a.MODULATE;
                }
                r4.e.a(mVar2, aVar);
                kd.k.e(canvas, rectF, mVar2);
                if (gVar != fd.g.MULTIPLY) {
                    j(canvas);
                } else {
                    if (this.C == null) {
                        m mVar3 = new m();
                        this.C = mVar3;
                        mVar3.setColor(-1);
                    }
                    canvas.drawRect(rectF.left - f11, rectF.top - f11, rectF.right + f11, rectF.bottom + f11, this.C);
                }
                k(canvas, matrix2, iIntValue, bVar);
                if (m()) {
                    Paint paint = this.f29077e;
                    canvas.saveLayer(rectF, paint);
                    if (Build.VERSION.SDK_INT < 28) {
                        j(canvas);
                    }
                    int i15 = 0;
                    while (true) {
                        List list = (List) m3Var.f48057b;
                        ArrayList arrayList = (ArrayList) m3Var.f48058c;
                        if (i15 >= list.size()) {
                            break;
                        }
                        fd.i iVar3 = (fd.i) list.get(i15);
                        zc.d dVar2 = (zc.d) arrayList.get(i15);
                        zc.d dVar3 = (zc.d) ((ArrayList) m3Var.f48056a).get(i15);
                        int[] iArr = b.f29072b;
                        fd.h hVar = iVar3.f27170a;
                        boolean z12 = iVar3.f27173d;
                        int i16 = iArr[hVar.ordinal()];
                        int i17 = i15;
                        if (i16 != 1) {
                            Paint paint2 = this.f29078f;
                            if (i16 == 2) {
                                if (i17 == 0) {
                                    mVar2.setColor(-16777216);
                                    mVar2.setAlpha(255);
                                    canvas.drawRect(rectF, mVar2);
                                }
                                if (z12) {
                                    kd.k.e(canvas, rectF, paint2);
                                    canvas.drawRect(rectF, mVar2);
                                    paint2.setAlpha((int) (((Integer) dVar3.f()).intValue() * 2.55f));
                                    path.set((Path) dVar2.f());
                                    path.transform(matrix2);
                                    canvas.drawPath(path, paint2);
                                    canvas.restore();
                                } else {
                                    path.set((Path) dVar2.f());
                                    path.transform(matrix2);
                                    canvas.drawPath(path, paint2);
                                }
                            } else if (i16 != 3) {
                                if (i16 == 4) {
                                    if (z12) {
                                        kd.k.e(canvas, rectF, mVar2);
                                        canvas.drawRect(rectF, mVar2);
                                        path.set((Path) dVar2.f());
                                        path.transform(matrix2);
                                        mVar2.setAlpha((int) (((Integer) dVar3.f()).intValue() * 2.55f));
                                        canvas.drawPath(path, paint2);
                                        canvas.restore();
                                    } else {
                                        path.set((Path) dVar2.f());
                                        path.transform(matrix2);
                                        mVar2.setAlpha((int) (((Integer) dVar3.f()).intValue() * 2.55f));
                                        canvas.drawPath(path, mVar2);
                                    }
                                }
                            } else if (z12) {
                                kd.k.e(canvas, rectF, paint);
                                canvas.drawRect(rectF, mVar2);
                                paint2.setAlpha((int) (((Integer) dVar3.f()).intValue() * 2.55f));
                                path.set((Path) dVar2.f());
                                path.transform(matrix2);
                                canvas.drawPath(path, paint2);
                                canvas.restore();
                            } else {
                                kd.k.e(canvas, rectF, paint);
                                path.set((Path) dVar2.f());
                                path.transform(matrix2);
                                mVar2.setAlpha((int) (((Integer) dVar3.f()).intValue() * 2.55f));
                                canvas.drawPath(path, mVar2);
                                canvas.restore();
                            }
                        } else {
                            if (!arrayList.isEmpty()) {
                                int i18 = 0;
                                while (true) {
                                    if (i18 >= list.size()) {
                                        mVar2.setAlpha(255);
                                        canvas.drawRect(rectF, mVar2);
                                        break;
                                    } else if (((fd.i) list.get(i18)).f27170a == fd.h.MASK_MODE_NONE) {
                                        i18++;
                                    }
                                }
                            }
                            i15 = i17 + 1;
                        }
                        i15 = i17 + 1;
                    }
                    wc.a aVar5 = wc.d.f54943a;
                    canvas.restore();
                }
                if (this.f29090s != null) {
                    canvas.saveLayer(rectF, this.f29079g);
                    j(canvas);
                    this.f29090s.d(canvas, matrix, i11, null);
                    canvas.restore();
                }
                canvas.restore();
            }
            if (this.f29096y && (mVar = this.f29097z) != null) {
                mVar.setStyle(Paint.Style.STROKE);
                this.f29097z.setColor(-251901);
                this.f29097z.setStrokeWidth(4.0f);
                canvas.drawRect(rectF, this.f29097z);
                this.f29097z.setStyle(Paint.Style.FILL);
                this.f29097z.setColor(1357638635);
                canvas.drawRect(rectF, this.f29097z);
            }
            n();
        }
    }

    @Override // yc.e
    public void e(RectF rectF, Matrix matrix, boolean z11) {
        this.f29081i.set(CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO);
        i();
        Matrix matrix2 = this.f29085n;
        matrix2.set(matrix);
        if (z11) {
            List list = this.f29092u;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    matrix2.preConcat(((c) this.f29092u.get(size)).f29094w.e());
                }
            } else {
                c cVar = this.f29091t;
                if (cVar != null) {
                    matrix2.preConcat(cVar.f29094w.e());
                }
            }
        }
        matrix2.preConcat(this.f29094w.e());
    }

    @Override // dd.g
    public void f(Object obj, u uVar) {
        this.f29094w.c(obj, uVar);
    }

    public final void g(zc.d dVar) {
        if (dVar == null) {
            return;
        }
        this.f29093v.add(dVar);
    }

    @Override // dd.g
    public final void h(dd.f fVar, int i11, ArrayList arrayList, dd.f fVar2) {
        c cVar = this.f29090s;
        i iVar = this.f29087p;
        if (cVar != null) {
            String str = cVar.f29087p.f29101c;
            dd.f fVar3 = new dd.f(fVar2);
            fVar3.f23379a.add(str);
            if (fVar.a(i11, this.f29090s.f29087p.f29101c)) {
                c cVar2 = this.f29090s;
                dd.f fVar4 = new dd.f(fVar3);
                fVar4.f23380b = cVar2;
                arrayList.add(fVar4);
            }
            if (fVar.c(i11, this.f29090s.f29087p.f29101c) && fVar.d(i11, iVar.f29101c)) {
                this.f29090s.p(fVar, fVar.b(i11, this.f29090s.f29087p.f29101c) + i11, arrayList, fVar3);
            }
        }
        String str2 = iVar.f29101c;
        String str3 = iVar.f29101c;
        if (fVar.c(i11, str2)) {
            if (!"__container".equals(str3)) {
                dd.f fVar5 = new dd.f(fVar2);
                fVar5.f23379a.add(str3);
                if (fVar.a(i11, str3)) {
                    dd.f fVar6 = new dd.f(fVar5);
                    fVar6.f23380b = this;
                    arrayList.add(fVar6);
                }
                fVar2 = fVar5;
            }
            if (fVar.d(i11, str3)) {
                p(fVar, fVar.b(i11, str3) + i11, arrayList, fVar2);
            }
        }
    }

    public final void i() {
        if (this.f29092u != null) {
            return;
        }
        if (this.f29091t == null) {
            this.f29092u = Collections.EMPTY_LIST;
            return;
        }
        this.f29092u = new ArrayList();
        for (c cVar = this.f29091t; cVar != null; cVar = cVar.f29091t) {
            this.f29092u.add(cVar);
        }
    }

    public final void j(Canvas canvas) {
        wc.a aVar = wc.d.f54943a;
        RectF rectF = this.f29081i;
        canvas.drawRect(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f, this.f29080h);
    }

    public abstract void k(Canvas canvas, Matrix matrix, int i11, kd.b bVar);

    public a5.j l() {
        return this.f29087p.f29120w;
    }

    public final boolean m() {
        m3 m3Var = this.f29088q;
        return (m3Var == null || ((ArrayList) m3Var.f48058c).isEmpty()) ? false : true;
    }

    public final void n() {
        c0 c0Var = this.f29086o.f55010a.f54957a;
        String str = this.f29087p.f29101c;
        HashMap map = c0Var.f54942c;
        if (c0Var.f54940a) {
            kd.g gVar = (kd.g) map.get(str);
            if (gVar == null) {
                gVar = new kd.g();
                map.put(str, gVar);
            }
            int i11 = gVar.f38097a + 1;
            gVar.f38097a = i11;
            if (i11 == Integer.MAX_VALUE) {
                gVar.f38097a = i11 / 2;
            }
            if (str.equals("__container")) {
                y.f fVar = c0Var.f54941b;
                fVar.getClass();
                y.a aVar = new y.a(fVar);
                if (aVar.hasNext()) {
                    aVar.next().getClass();
                    throw new ClassCastException();
                }
            }
        }
    }

    public final void o(zc.d dVar) {
        this.f29093v.remove(dVar);
    }

    public void q(boolean z11) {
        if (z11 && this.f29097z == null) {
            this.f29097z = new m();
        }
        this.f29096y = z11;
    }

    public void r(float f5) {
        wc.a aVar = wc.d.f54943a;
        zc.o oVar = this.f29094w;
        zc.d dVar = oVar.f59139j;
        if (dVar != null) {
            dVar.j(f5);
        }
        zc.d dVar2 = oVar.m;
        if (dVar2 != null) {
            dVar2.j(f5);
        }
        zc.d dVar3 = oVar.f59142n;
        if (dVar3 != null) {
            dVar3.j(f5);
        }
        zc.d dVar4 = oVar.f59135f;
        if (dVar4 != null) {
            dVar4.j(f5);
        }
        zc.d dVar5 = oVar.f59136g;
        if (dVar5 != null) {
            dVar5.j(f5);
        }
        zc.d dVar6 = oVar.f59137h;
        if (dVar6 != null) {
            dVar6.j(f5);
        }
        zc.d dVar7 = oVar.f59138i;
        if (dVar7 != null) {
            dVar7.j(f5);
        }
        zc.g gVar = oVar.f59140k;
        if (gVar != null) {
            gVar.j(f5);
        }
        zc.g gVar2 = oVar.f59141l;
        if (gVar2 != null) {
            gVar2.j(f5);
        }
        int i11 = 0;
        m3 m3Var = this.f29088q;
        if (m3Var != null) {
            ArrayList arrayList = (ArrayList) m3Var.f48058c;
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                ((zc.d) arrayList.get(i12)).j(f5);
            }
            wc.a aVar2 = wc.d.f54943a;
        }
        zc.g gVar3 = this.f29089r;
        if (gVar3 != null) {
            gVar3.j(f5);
        }
        c cVar = this.f29090s;
        if (cVar != null) {
            cVar.r(f5);
        }
        while (true) {
            ArrayList arrayList2 = this.f29093v;
            if (i11 >= arrayList2.size()) {
                wc.a aVar3 = wc.d.f54943a;
                return;
            } else {
                ((zc.d) arrayList2.get(i11)).j(f5);
                i11++;
            }
        }
    }

    @Override // yc.c
    public final void c(List list, List list2) {
    }

    public void p(dd.f fVar, int i11, ArrayList arrayList, dd.f fVar2) {
    }
}
