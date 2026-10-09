package androidx.compose.ui.platform;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import com.yalantis.ucrop.view.CropImageView;
import f2.a;
import fz.e;
import g2.f0;
import g2.p0;
import g2.r0;
import g2.t0;
import g2.v;
import g2.z0;
import h1.l5;
import j2.c;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.jvm.internal.m;
import y2.s1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewLayer extends View implements s1 {
    public static boolean H;
    public static boolean K;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static Method f1208f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static Field f1209t;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f1210a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Rect f1211b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f1212c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f1213d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f1214e;

    static {
        new l5(2);
    }

    private final p0 getManualClipPath() {
        if (getClipToOutline()) {
            throw null;
        }
        return null;
    }

    private final void setInvalidated(boolean z11) {
        if (z11 == this.f1212c) {
            return;
        }
        this.f1212c = z11;
        throw null;
    }

    @Override // y2.s1
    public final void a(v vVar, c cVar) {
        if (getElevation() > CropImageView.DEFAULT_ASPECT_RATIO) {
            vVar.t();
        }
        getDrawingTime();
        throw null;
    }

    @Override // y2.s1
    public final void b(a aVar, boolean z11) {
        if (!z11) {
            throw null;
        }
        throw null;
    }

    @Override // y2.s1
    public final void c(t0 t0Var) {
        Rect rect;
        int i11 = t0Var.f28600a | 0;
        if ((i11 & 4096) != 0) {
            long j11 = t0Var.N;
            this.f1214e = j11;
            setPivotX(z0.b(j11) * getWidth());
            setPivotY(z0.c(this.f1214e) * getHeight());
        }
        if ((i11 & 1) != 0) {
            setScaleX(t0Var.f28601b);
        }
        if ((i11 & 2) != 0) {
            setScaleY(t0Var.f28602c);
        }
        if ((i11 & 4) != 0) {
            setAlpha(t0Var.f28603d);
        }
        if ((i11 & 8) != 0) {
            setTranslationX(t0Var.f28604e);
        }
        if ((i11 & 16) != 0) {
            setTranslationY(t0Var.f28605f);
        }
        if ((i11 & 32) != 0) {
            setElevation(t0Var.f28606t);
        }
        if ((i11 & 1024) != 0) {
            setRotation(t0Var.L);
        }
        if ((i11 & 256) != 0) {
            setRotationX(CropImageView.DEFAULT_ASPECT_RATIO);
        }
        if ((i11 & 512) != 0) {
            setRotationY(CropImageView.DEFAULT_ASPECT_RATIO);
        }
        if ((i11 & 2048) != 0) {
            setCameraDistancePx(t0Var.M);
        }
        getManualClipPath();
        boolean z11 = t0Var.P;
        r0 r0Var = f0.f28556b;
        boolean z12 = false;
        boolean z13 = z11 && t0Var.O != r0Var;
        if ((i11 & 24576) != 0) {
            if (z11 && t0Var.O == r0Var) {
                z12 = true;
            }
            this.f1210a = z12;
            if (this.f1210a) {
                Rect rect2 = this.f1211b;
                if (rect2 == null) {
                    this.f1211b = new Rect(0, 0, getWidth(), getHeight());
                } else {
                    m.c(rect2);
                    rect2.set(0, 0, getWidth(), getHeight());
                }
                rect = this.f1211b;
            } else {
                rect = null;
            }
            setClipBounds(rect);
            setClipToOutline(z13);
        }
        throw null;
    }

    @Override // y2.s1
    public final void d(float[] fArr) {
        throw null;
    }

    @Override // y2.s1
    public final void destroy() {
        setInvalidated(false);
        throw null;
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        throw null;
    }

    @Override // y2.s1
    public final void e(e eVar, fz.a aVar) {
        throw null;
    }

    @Override // y2.s1
    public final boolean f(long j11) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j11 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j11 & 4294967295L));
        if (this.f1210a) {
            return CropImageView.DEFAULT_ASPECT_RATIO <= fIntBitsToFloat && fIntBitsToFloat < ((float) getWidth()) && CropImageView.DEFAULT_ASPECT_RATIO <= fIntBitsToFloat2 && fIntBitsToFloat2 < ((float) getHeight());
        }
        if (getClipToOutline()) {
            throw null;
        }
        return true;
    }

    @Override // y2.s1
    public final long g(long j11, boolean z11) {
        if (z11) {
            throw null;
        }
        throw null;
    }

    public final float getCameraDistancePx() {
        return getCameraDistance() / getResources().getDisplayMetrics().densityDpi;
    }

    public final DrawChildContainer getContainer() {
        return null;
    }

    public float getFrameRate() {
        return this.f1213d;
    }

    public long getLayerId() {
        return 0L;
    }

    public final AndroidComposeView getOwnerView() {
        return null;
    }

    public long getOwnerViewId() {
        if (Build.VERSION.SDK_INT < 29) {
            return -1L;
        }
        throw null;
    }

    @Override // y2.s1
    /* JADX INFO: renamed from: getUnderlyingMatrix-sQKQjiQ, reason: not valid java name */
    public float[] mo6getUnderlyingMatrixsQKQjiQ() {
        throw null;
    }

    @Override // y2.s1
    public final void h(long j11) {
        int i11 = (int) (j11 >> 32);
        int i12 = (int) (j11 & 4294967295L);
        if (i11 == getWidth() && i12 == getHeight()) {
            return;
        }
        setPivotX(z0.b(this.f1214e) * i11);
        setPivotY(z0.c(this.f1214e) * i12);
        throw null;
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override // y2.s1
    public final void i(float[] fArr) {
        throw null;
    }

    @Override // android.view.View, y2.s1
    public final void invalidate() {
        if (this.f1212c) {
            return;
        }
        setInvalidated(true);
        super.invalidate();
        throw null;
    }

    @Override // y2.s1
    public final void j(long j11) {
        int i11 = (int) (j11 >> 32);
        if (i11 != getLeft()) {
            offsetLeftAndRight(i11 - getLeft());
            throw null;
        }
        int i12 = (int) (j11 & 4294967295L);
        if (i12 == getTop()) {
            return;
        }
        offsetTopAndBottom(i12 - getTop());
        throw null;
    }

    @Override // y2.s1
    public final void k() {
        if (!this.f1212c || K) {
            return;
        }
        try {
            if (!H) {
                H = true;
                if (Build.VERSION.SDK_INT < 28) {
                    f1208f = View.class.getDeclaredMethod("updateDisplayListIfDirty", null);
                    f1209t = View.class.getDeclaredField("mRecreateDisplayList");
                } else {
                    f1208f = (Method) Class.class.getDeclaredMethod("getDeclaredMethod", String.class, new Class[0].getClass()).invoke(View.class, "updateDisplayListIfDirty", new Class[0]);
                    f1209t = (Field) Class.class.getDeclaredMethod("getDeclaredField", String.class).invoke(View.class, "mRecreateDisplayList");
                }
                Method method = f1208f;
                if (method != null) {
                    method.setAccessible(true);
                }
                Field field = f1209t;
                if (field != null) {
                    field.setAccessible(true);
                }
            }
            Field field2 = f1209t;
            if (field2 != null) {
                field2.setBoolean(this, true);
            }
            Method method2 = f1208f;
            if (method2 != null) {
                method2.invoke(this, null);
            }
        } catch (Throwable unused) {
            K = true;
        }
        setInvalidated(false);
    }

    public final void setCameraDistancePx(float f5) {
        setCameraDistance(f5 * getResources().getDisplayMetrics().densityDpi);
    }

    public void setFrameRate(float f5) {
        this.f1213d = f5;
    }

    @Override // android.view.View
    public final void forceLayout() {
    }

    public void setFrameRateFromParent(boolean z11) {
    }

    @Override // android.view.View
    public final void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
    }
}
