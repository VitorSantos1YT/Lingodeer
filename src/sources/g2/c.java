package g2;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Region;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Canvas f28539a = d.f28542a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Rect f28540b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Rect f28541c;

    @Override // g2.v
    public final void a(float f5, float f11) {
        this.f28539a.scale(f5, f11);
    }

    @Override // g2.v
    public final void b(float f5) {
        this.f28539a.rotate(f5);
    }

    @Override // g2.v
    public final void c(h hVar, long j11, long j12, long j13, a.a aVar) {
        if (this.f28540b == null) {
            this.f28540b = new Rect();
            this.f28541c = new Rect();
        }
        Canvas canvas = this.f28539a;
        Bitmap bitmapA = i.a(hVar);
        Rect rect = this.f28540b;
        kotlin.jvm.internal.m.c(rect);
        int i11 = (int) (j11 >> 32);
        rect.left = i11;
        int i12 = (int) (j11 & 4294967295L);
        rect.top = i12;
        rect.right = i11 + ((int) (j12 >> 32));
        rect.bottom = i12 + ((int) (j12 & 4294967295L));
        Rect rect2 = this.f28541c;
        kotlin.jvm.internal.m.c(rect2);
        int i13 = (int) 0;
        rect2.left = i13;
        int i14 = (int) 0;
        rect2.top = i14;
        rect2.right = i13 + ((int) (j13 >> 32));
        rect2.bottom = i14 + ((int) (4294967295L & j13));
        canvas.drawBitmap(bitmapA, rect, rect2, (Paint) aVar.f6c);
    }

    @Override // g2.v
    public final void d(h hVar, a.a aVar) {
        this.f28539a.drawBitmap(i.a(hVar), Float.intBitsToFloat((int) 0), Float.intBitsToFloat((int) 0), (Paint) aVar.f6c);
    }

    @Override // g2.v
    public final void e() {
        this.f28539a.save();
    }

    @Override // g2.v
    public final void f() {
        f0.o(this.f28539a, false);
    }

    @Override // g2.v
    public final void g(float[] fArr) {
        if (f0.t(fArr)) {
            return;
        }
        Matrix matrix = new Matrix();
        f0.y(matrix, fArr);
        this.f28539a.concat(matrix);
    }

    @Override // g2.v
    public final void h(long j11, long j12, a.a aVar) {
        this.f28539a.drawLine(Float.intBitsToFloat((int) (j11 >> 32)), Float.intBitsToFloat((int) (j11 & 4294967295L)), Float.intBitsToFloat((int) (j12 >> 32)), Float.intBitsToFloat((int) (j12 & 4294967295L)), (Paint) aVar.f6c);
    }

    @Override // g2.v
    public final void i(float f5, float f11, float f12, float f13, float f14, float f15, a.a aVar) {
        this.f28539a.drawRoundRect(f5, f11, f12, f13, f14, f15, (Paint) aVar.f6c);
    }

    @Override // g2.v
    public final void j(p0 p0Var, a.a aVar) {
        Canvas canvas = this.f28539a;
        if (!(p0Var instanceof k)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        canvas.drawPath(((k) p0Var).f28575a, (Paint) aVar.f6c);
    }

    @Override // g2.v
    public final void k(float f5, float f11, float f12, float f13, float f14, float f15, a.a aVar) {
        this.f28539a.drawArc(f5, f11, f12, f13, f14, f15, false, (Paint) aVar.f6c);
    }

    @Override // g2.v
    public final void l(f2.c cVar, a.a aVar) {
        this.f28539a.saveLayer(cVar.f26572a, cVar.f26573b, cVar.f26574c, cVar.f26575d, (Paint) aVar.f6c, 31);
    }

    @Override // g2.v
    public final void m(float f5, float f11, float f12, float f13, int i11) {
        this.f28539a.clipRect(f5, f11, f12, f13, i11 == 0 ? Region.Op.DIFFERENCE : Region.Op.INTERSECT);
    }

    @Override // g2.v
    public final void n(float f5, float f11) {
        this.f28539a.translate(f5, f11);
    }

    @Override // g2.v
    public final void o(float f5, float f11, float f12, float f13, a.a aVar) {
        this.f28539a.drawRect(f5, f11, f12, f13, (Paint) aVar.f6c);
    }

    @Override // g2.v
    public final void p() {
        this.f28539a.restore();
    }

    @Override // g2.v
    public final void q(p0 p0Var) {
        Canvas canvas = this.f28539a;
        if (!(p0Var instanceof k)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        canvas.clipPath(((k) p0Var).f28575a, Region.Op.INTERSECT);
    }

    @Override // g2.v
    public final void s(float f5, long j11, a.a aVar) {
        this.f28539a.drawCircle(Float.intBitsToFloat((int) (j11 >> 32)), Float.intBitsToFloat((int) (j11 & 4294967295L)), f5, (Paint) aVar.f6c);
    }

    @Override // g2.v
    public final void t() {
        f0.o(this.f28539a, true);
    }
}
