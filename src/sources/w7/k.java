package w7;

import android.content.Context;
import android.graphics.PointF;
import android.opengl.Matrix;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.yalantis.ucrop.view.CropImageView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class k extends GestureDetector.SimpleOnGestureListener implements View.OnTouchListener, c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f54700c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final GestureDetector f54702e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PointF f54698a = new PointF();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PointF f54699b = new PointF();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f54701d = 25.0f;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile float f54703f = 3.1415927f;

    public k(Context context, j jVar) {
        this.f54700c = jVar;
        this.f54702e = new GestureDetector(context, this);
    }

    @Override // w7.c
    public final void f(float f5, float[] fArr) {
        this.f54703f = -f5;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        this.f54698a.set(motionEvent.getX(), motionEvent.getY());
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f5, float f11) {
        float x11 = (motionEvent2.getX() - this.f54698a.x) / this.f54701d;
        float y10 = motionEvent2.getY();
        PointF pointF = this.f54698a;
        float f12 = (y10 - pointF.y) / this.f54701d;
        pointF.set(motionEvent2.getX(), motionEvent2.getY());
        double d5 = this.f54703f;
        float fCos = (float) Math.cos(d5);
        float fSin = (float) Math.sin(d5);
        PointF pointF2 = this.f54699b;
        pointF2.x -= (fCos * x11) - (fSin * f12);
        float f13 = (fCos * f12) + (fSin * x11) + pointF2.y;
        pointF2.y = f13;
        pointF2.y = Math.max(-45.0f, Math.min(45.0f, f13));
        j jVar = this.f54700c;
        PointF pointF3 = this.f54699b;
        synchronized (jVar) {
            float f14 = pointF3.y;
            jVar.f54697t = f14;
            Matrix.setRotateM(jVar.f54695e, 0, -f14, (float) Math.cos(jVar.H), (float) Math.sin(jVar.H), CropImageView.DEFAULT_ASPECT_RATIO);
            Matrix.setRotateM(jVar.f54696f, 0, -pointF3.x, CropImageView.DEFAULT_ASPECT_RATIO, 1.0f, CropImageView.DEFAULT_ASPECT_RATIO);
        }
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        return this.f54700c.M.performClick();
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        return this.f54702e.onTouchEvent(motionEvent);
    }
}
