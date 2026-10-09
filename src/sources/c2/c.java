package c2;

import android.graphics.Canvas;
import android.graphics.Point;
import android.view.View;
import g2.v;
import v3.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends View.DragShadowBuilder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v3.d f6503a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f6504b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final fz.c f6505c;

    public c(v3.d dVar, long j11, fz.c cVar) {
        this.f6503a = dVar;
        this.f6504b = j11;
        this.f6505c = cVar;
    }

    @Override // android.view.View.DragShadowBuilder
    public final void onDrawShadow(Canvas canvas) {
        i2.b bVar = new i2.b();
        m mVar = m.Ltr;
        Canvas canvas2 = g2.d.f28542a;
        g2.c cVar = new g2.c();
        cVar.f28539a = canvas;
        i2.a aVar = bVar.f34120a;
        v3.c cVar2 = aVar.f34116a;
        m mVar2 = aVar.f34117b;
        v vVar = aVar.f34118c;
        long j11 = aVar.f34119d;
        aVar.f34116a = this.f6503a;
        aVar.f34117b = mVar;
        aVar.f34118c = cVar;
        aVar.f34119d = this.f6504b;
        cVar.e();
        this.f6505c.invoke(bVar);
        cVar.p();
        aVar.f34116a = cVar2;
        aVar.f34117b = mVar2;
        aVar.f34118c = vVar;
        aVar.f34119d = j11;
    }

    @Override // android.view.View.DragShadowBuilder
    public final void onProvideShadowMetrics(Point point, Point point2) {
        long j11 = this.f6504b;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j11 >> 32));
        v3.d dVar = this.f6503a;
        point.set(dVar.n0(fIntBitsToFloat / dVar.getDensity()), dVar.n0(Float.intBitsToFloat((int) (j11 & 4294967295L)) / dVar.getDensity()));
        point2.set(point.x / 2, point.y / 2);
    }
}
