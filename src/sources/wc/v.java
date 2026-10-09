package wc;

import android.animation.Animator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.view.Choreographer;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import com.yalantis.ucrop.view.CropImageView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class v extends Drawable implements Drawable.Callback, Animatable {

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static final boolean f55007u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public static final List f55008v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public static final ThreadPoolExecutor f55009w0;
    public cd.a H;
    public String K;
    public a9.i L;
    public Map M;
    public String N;
    public final o20.i O;
    public boolean P;
    public boolean Q;
    public gd.e R;
    public int S;
    public boolean T;
    public boolean U;
    public boolean V;
    public boolean W;
    public boolean X;
    public e0 Y;
    public boolean Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public h f55010a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final Matrix f55011a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kd.f f55012b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public Bitmap f55013b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f55014c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public Canvas f55015c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f55016d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public Rect f55017d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f55018e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public RectF f55019e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public u f55020f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public gd.m f55021f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public Rect f55022g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public Rect f55023h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public RectF f55024i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public RectF f55025j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public Matrix f55026k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public final float[] f55027l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public Matrix f55028m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public boolean f55029n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public a f55030o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Semaphore f55031p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public Handler f55032q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public r f55033r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final r f55034s0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ArrayList f55035t;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public float f55036t0;

    static {
        f55007u0 = Build.VERSION.SDK_INT <= 25;
        f55008v0 = Arrays.asList("reduced motion", "reduced_motion", "reduced-motion", "reducedmotion");
        f55009w0 = new ThreadPoolExecutor(0, 2, 35L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new kd.e());
    }

    public v() {
        kd.f fVar = new kd.f();
        fVar.f38093d = 1.0f;
        fVar.f38094e = false;
        fVar.f38095f = 0L;
        fVar.f38096t = CropImageView.DEFAULT_ASPECT_RATIO;
        fVar.H = CropImageView.DEFAULT_ASPECT_RATIO;
        fVar.K = 0;
        fVar.L = -2.1474836E9f;
        fVar.M = 2.1474836E9f;
        fVar.O = false;
        fVar.P = false;
        this.f55012b = fVar;
        this.f55014c = true;
        this.f55016d = false;
        this.f55018e = false;
        this.f55020f = u.NONE;
        this.f55035t = new ArrayList();
        this.O = new o20.i(27);
        this.P = false;
        this.Q = true;
        this.S = 255;
        this.X = false;
        this.Y = e0.AUTOMATIC;
        this.Z = false;
        this.f55011a0 = new Matrix();
        this.f55027l0 = new float[9];
        this.f55029n0 = false;
        com.google.android.material.motion.c cVar = new com.google.android.material.motion.c(this, 9);
        this.f55031p0 = new Semaphore(1);
        this.f55034s0 = new r(this, 1);
        this.f55036t0 = -3.4028235E38f;
        fVar.addUpdateListener(cVar);
    }

    public static void f(Rect rect, RectF rectF) {
        rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
    }

    public final void a(final dd.f fVar, final Object obj, final ob.u uVar) {
        gd.e eVar = this.R;
        if (eVar == null) {
            this.f55035t.add(new t() { // from class: wc.o
                @Override // wc.t
                public final void run() {
                    this.f54993a.a(fVar, obj, uVar);
                }
            });
            return;
        }
        boolean zIsEmpty = true;
        if (fVar == dd.f.f23378c) {
            eVar.f(obj, uVar);
        } else {
            dd.g gVar = fVar.f23380b;
            if (gVar != null) {
                gVar.f(obj, uVar);
            } else {
                ArrayList arrayList = new ArrayList();
                this.R.h(fVar, 0, arrayList, new dd.f(new String[0]));
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    ((dd.f) arrayList.get(i11)).f23380b.f(obj, uVar);
                }
                zIsEmpty = true ^ arrayList.isEmpty();
            }
        }
        if (zIsEmpty) {
            invalidateSelf();
            if (obj == z.f55067z) {
                v(this.f55012b.f());
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0027  */
    public final boolean b(Context context) {
        bd.a aVar;
        if (this.f55016d) {
            return true;
        }
        if (!this.f55014c) {
            return false;
        }
        d.f54946d.getClass();
        if (context != null) {
            Matrix matrix = kd.k.f38124a;
            if (Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f) != CropImageView.DEFAULT_ASPECT_RATIO) {
                aVar = bd.a.STANDARD_MOTION;
            } else {
                aVar = bd.a.REDUCED_MOTION;
            }
        } else {
            aVar = bd.a.STANDARD_MOTION;
        }
        return aVar == bd.a.STANDARD_MOTION;
    }

    public final void c() {
        h hVar = this.f55010a;
        if (hVar == null) {
            return;
        }
        b1.p pVar = id.s.f34374a;
        Rect rect = hVar.f54967k;
        List list = Collections.EMPTY_LIST;
        gd.e eVar = new gd.e(this, new gd.i(list, hVar, "__container", -1L, gd.g.PRE_COMP, -1L, null, list, new ed.e(), 0, 0, 0, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, rect.width(), rect.height(), null, null, list, gd.h.NONE, null, false, null, null, fd.g.NORMAL), hVar.f54966j, hVar);
        this.R = eVar;
        if (this.U) {
            eVar.q(true);
        }
        this.R.L = this.Q;
    }

    public final void d() {
        kd.f fVar = this.f55012b;
        if (fVar.O) {
            fVar.cancel();
            if (!isVisible()) {
                this.f55020f = u.NONE;
            }
        }
        this.f55010a = null;
        this.R = null;
        this.H = null;
        this.f55036t0 = -3.4028235E38f;
        fVar.N = null;
        fVar.L = -2.1474836E9f;
        fVar.M = 2.1474836E9f;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        gd.e eVar = this.R;
        if (eVar == null) {
            return;
        }
        a aVar = this.f55030o0;
        if (aVar == null) {
            aVar = d.f54943a;
        }
        boolean z11 = aVar == a.ENABLED;
        r rVar = this.f55034s0;
        ThreadPoolExecutor threadPoolExecutor = f55009w0;
        kd.f fVar = this.f55012b;
        Semaphore semaphore = this.f55031p0;
        if (z11) {
            try {
                semaphore.acquire();
            } catch (InterruptedException unused) {
                a aVar2 = d.f54943a;
                if (!z11) {
                    return;
                }
                semaphore.release();
                if (eVar.K == fVar.f()) {
                    return;
                }
            } catch (Throwable th2) {
                a aVar3 = d.f54943a;
                if (z11) {
                    semaphore.release();
                    if (eVar.K != fVar.f()) {
                        threadPoolExecutor.execute(rVar);
                    }
                }
                throw th2;
            }
        }
        a aVar4 = d.f54943a;
        if (z11 && w()) {
            v(fVar.f());
        }
        if (this.f55018e) {
            try {
                if (this.Z) {
                    m(canvas, eVar);
                } else {
                    g(canvas);
                }
            } catch (Throwable unused2) {
                kd.d.f38088a.getClass();
                a aVar5 = d.f54943a;
            }
        } else if (this.Z) {
            m(canvas, eVar);
        } else {
            g(canvas);
        }
        this.f55029n0 = false;
        if (z11) {
            semaphore.release();
            if (eVar.K == fVar.f()) {
                return;
            }
            threadPoolExecutor.execute(rVar);
        }
    }

    public final void e() {
        h hVar = this.f55010a;
        if (hVar == null) {
            return;
        }
        e0 e0Var = this.Y;
        int i11 = Build.VERSION.SDK_INT;
        boolean z11 = hVar.f54970o;
        int i12 = hVar.f54971p;
        int iOrdinal = e0Var.ordinal();
        boolean z12 = false;
        if (iOrdinal != 1 && (iOrdinal == 2 || ((z11 && i11 < 28) || i12 > 4 || i11 <= 25))) {
            z12 = true;
        }
        this.Z = z12;
    }

    public final void g(Canvas canvas) {
        gd.e eVar = this.R;
        h hVar = this.f55010a;
        if (eVar == null || hVar == null) {
            return;
        }
        Matrix matrix = this.f55011a0;
        matrix.reset();
        Rect bounds = getBounds();
        if (!bounds.isEmpty()) {
            float fWidth = bounds.width() / hVar.f54967k.width();
            float fHeight = bounds.height() / hVar.f54967k.height();
            matrix.preTranslate(bounds.left, bounds.top);
            matrix.preScale(fWidth, fHeight);
        }
        eVar.d(canvas, matrix, this.S, null);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.S;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        h hVar = this.f55010a;
        if (hVar == null) {
            return -1;
        }
        return hVar.f54967k.height();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        h hVar = this.f55010a;
        if (hVar == null) {
            return -1;
        }
        return hVar.f54967k.width();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    public final void h(w wVar, boolean z11) {
        boolean zRemove;
        HashSet hashSet = (HashSet) this.O.f44522b;
        if (!z11) {
            zRemove = hashSet.remove(wVar);
        } else if (Build.VERSION.SDK_INT < wVar.minRequiredSdkVersion) {
            kd.d.b(String.format("%s is not supported pre SDK %d", wVar.name(), Integer.valueOf(wVar.minRequiredSdkVersion)));
            zRemove = false;
        } else {
            zRemove = hashSet.add(wVar);
        }
        if (this.f55010a == null || !zRemove) {
            return;
        }
        c();
    }

    public final Context i() {
        Drawable.Callback callback = getCallback();
        if (callback != null && (callback instanceof View)) {
            return ((View) callback).getContext();
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.invalidateDrawable(this);
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        Drawable.Callback callback;
        if (this.f55029n0) {
            return;
        }
        this.f55029n0 = true;
        if ((!f55007u0 || Looper.getMainLooper() == Looper.myLooper()) && (callback = getCallback()) != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        kd.f fVar = this.f55012b;
        if (fVar == null) {
            return false;
        }
        return fVar.O;
    }

    public final a9.i j() {
        if (getCallback() == null) {
            return null;
        }
        if (this.L == null) {
            Drawable.Callback callback = getCallback();
            a9.i iVar = new a9.i();
            iVar.f517a = new ob.c(6);
            iVar.f520d = new HashMap();
            iVar.f521e = new HashMap();
            iVar.f519c = ".ttf";
            if (callback instanceof View) {
                iVar.f518b = ((View) callback).getContext().getAssets();
            } else {
                kd.d.b("LottieDrawable must be inside of a view for images to work.");
                iVar.f518b = null;
            }
            this.L = iVar;
            String str = this.N;
            if (str != null) {
                iVar.f519c = str;
            }
        }
        return this.L;
    }

    public final void k() {
        this.f55035t.clear();
        kd.f fVar = this.f55012b;
        fVar.j(true);
        Iterator it = fVar.f38081c.iterator();
        while (it.hasNext()) {
            ((Animator.AnimatorPauseListener) it.next()).onAnimationPause(fVar);
        }
        if (isVisible()) {
            return;
        }
        this.f55020f = u.NONE;
    }

    public final void l() {
        if (this.R == null) {
            this.f55035t.add(new s(this, 1));
            return;
        }
        e();
        boolean zB = b(i());
        kd.f fVar = this.f55012b;
        if (zB || fVar.getRepeatCount() == 0) {
            if (isVisible()) {
                fVar.O = true;
                fVar.c(fVar.i());
                fVar.k((int) (fVar.i() ? fVar.g() : fVar.h()));
                fVar.f38095f = 0L;
                fVar.K = 0;
                if (fVar.O) {
                    fVar.j(false);
                    Choreographer.getInstance().postFrameCallback(fVar);
                }
                this.f55020f = u.NONE;
            } else {
                this.f55020f = u.PLAY;
            }
        }
        if (b(i())) {
            return;
        }
        Iterator it = f55008v0.iterator();
        dd.i iVarD = null;
        while (it.hasNext()) {
            iVarD = this.f55010a.d((String) it.next());
            if (iVarD != null) {
                break;
            }
        }
        if (iVarD != null) {
            p((int) iVarD.f23384b);
        } else {
            p((int) (fVar.f38093d < CropImageView.DEFAULT_ASPECT_RATIO ? fVar.h() : fVar.g()));
        }
        fVar.j(true);
        fVar.a(fVar.i());
        if (isVisible()) {
            return;
        }
        this.f55020f = u.NONE;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x00d5  */
    public final void m(Canvas canvas, gd.e eVar) {
        boolean z11;
        if (this.f55010a == null || eVar == null) {
            return;
        }
        if (this.f55015c0 == null) {
            this.f55015c0 = new Canvas();
            this.f55025j0 = new RectF();
            this.f55026k0 = new Matrix();
            this.f55028m0 = new Matrix();
            this.f55017d0 = new Rect();
            this.f55019e0 = new RectF();
            this.f55021f0 = new gd.m();
            this.f55022g0 = new Rect();
            this.f55023h0 = new Rect();
            this.f55024i0 = new RectF();
        }
        canvas.getMatrix(this.f55026k0);
        canvas.getClipBounds(this.f55017d0);
        Rect rect = this.f55017d0;
        this.f55019e0.set(rect.left, rect.top, rect.right, rect.bottom);
        this.f55026k0.mapRect(this.f55019e0);
        f(this.f55017d0, this.f55019e0);
        if (this.Q) {
            this.f55025j0.set(CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, getIntrinsicWidth(), getIntrinsicHeight());
        } else {
            eVar.e(this.f55025j0, null, false);
        }
        this.f55026k0.mapRect(this.f55025j0);
        Rect bounds = getBounds();
        float fWidth = bounds.width() / getIntrinsicWidth();
        float fHeight = bounds.height() / getIntrinsicHeight();
        RectF rectF = this.f55025j0;
        rectF.set(rectF.left * fWidth, rectF.top * fHeight, rectF.right * fWidth, rectF.bottom * fHeight);
        Drawable.Callback callback = getCallback();
        if (callback instanceof View) {
            ViewParent parent = ((View) callback).getParent();
            if (parent instanceof ViewGroup) {
                z11 = !((ViewGroup) parent).getClipChildren();
            } else {
                z11 = false;
            }
        } else {
            z11 = false;
        }
        if (!z11) {
            RectF rectF2 = this.f55025j0;
            Rect rect2 = this.f55017d0;
            rectF2.intersect(rect2.left, rect2.top, rect2.right, rect2.bottom);
        }
        int iCeil = (int) Math.ceil(this.f55025j0.width());
        int iCeil2 = (int) Math.ceil(this.f55025j0.height());
        if (iCeil <= 0 || iCeil2 <= 0) {
            return;
        }
        Bitmap bitmap = this.f55013b0;
        if (bitmap == null || bitmap.getWidth() < iCeil || this.f55013b0.getHeight() < iCeil2) {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iCeil, iCeil2, Bitmap.Config.ARGB_8888);
            this.f55013b0 = bitmapCreateBitmap;
            this.f55015c0.setBitmap(bitmapCreateBitmap);
            this.f55029n0 = true;
        } else if (this.f55013b0.getWidth() > iCeil || this.f55013b0.getHeight() > iCeil2) {
            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(this.f55013b0, 0, 0, iCeil, iCeil2);
            this.f55013b0 = bitmapCreateBitmap2;
            this.f55015c0.setBitmap(bitmapCreateBitmap2);
            this.f55029n0 = true;
        }
        if (this.f55029n0) {
            Matrix matrix = this.f55026k0;
            float[] fArr = this.f55027l0;
            matrix.getValues(fArr);
            float f5 = fArr[0];
            float f11 = fArr[4];
            Matrix matrix2 = this.f55026k0;
            Matrix matrix3 = this.f55011a0;
            matrix3.set(matrix2);
            matrix3.preScale(fWidth, fHeight);
            RectF rectF3 = this.f55025j0;
            matrix3.postTranslate(-rectF3.left, -rectF3.top);
            matrix3.postScale(1.0f / f5, 1.0f / f11);
            this.f55013b0.eraseColor(0);
            this.f55015c0.setMatrix(kd.k.f38124a);
            this.f55015c0.scale(f5, f11);
            eVar.d(this.f55015c0, matrix3, this.S, null);
            this.f55026k0.invert(this.f55028m0);
            this.f55028m0.mapRect(this.f55024i0, this.f55025j0);
            f(this.f55023h0, this.f55024i0);
        }
        this.f55022g0.set(0, 0, iCeil, iCeil2);
        canvas.drawBitmap(this.f55013b0, this.f55022g0, this.f55023h0, this.f55021f0);
    }

    public final void n() {
        if (this.R == null) {
            this.f55035t.add(new s(this, 0));
            return;
        }
        e();
        boolean zB = b(i());
        kd.f fVar = this.f55012b;
        if (zB || fVar.getRepeatCount() == 0) {
            if (isVisible()) {
                fVar.O = true;
                fVar.j(false);
                Choreographer.getInstance().postFrameCallback(fVar);
                fVar.f38095f = 0L;
                if (fVar.i() && fVar.H == fVar.h()) {
                    fVar.k(fVar.g());
                } else if (!fVar.i() && fVar.H == fVar.g()) {
                    fVar.k(fVar.h());
                }
                Iterator it = fVar.f38081c.iterator();
                while (it.hasNext()) {
                    ((Animator.AnimatorPauseListener) it.next()).onAnimationResume(fVar);
                }
                this.f55020f = u.NONE;
            } else {
                this.f55020f = u.RESUME;
            }
        }
        if (b(i())) {
            return;
        }
        p((int) (fVar.f38093d < CropImageView.DEFAULT_ASPECT_RATIO ? fVar.h() : fVar.g()));
        fVar.j(true);
        fVar.a(fVar.i());
        if (isVisible()) {
            return;
        }
        this.f55020f = u.NONE;
    }

    public final boolean o(h hVar) {
        if (this.f55010a == hVar) {
            return false;
        }
        this.f55029n0 = true;
        d();
        this.f55010a = hVar;
        c();
        kd.f fVar = this.f55012b;
        boolean z11 = fVar.N == null;
        fVar.N = hVar;
        if (z11) {
            fVar.l(Math.max(fVar.L, hVar.f54968l), Math.min(fVar.M, hVar.m));
        } else {
            fVar.l((int) hVar.f54968l, (int) hVar.m);
        }
        float f5 = fVar.H;
        fVar.H = CropImageView.DEFAULT_ASPECT_RATIO;
        fVar.f38096t = CropImageView.DEFAULT_ASPECT_RATIO;
        fVar.k((int) f5);
        fVar.d();
        v(fVar.getAnimatedFraction());
        ArrayList arrayList = this.f55035t;
        Iterator it = new ArrayList(arrayList).iterator();
        while (it.hasNext()) {
            t tVar = (t) it.next();
            if (tVar != null) {
                tVar.run();
            }
            it.remove();
        }
        arrayList.clear();
        hVar.f54957a.f54940a = this.T;
        e();
        Drawable.Callback callback = getCallback();
        if (callback instanceof ImageView) {
            ImageView imageView = (ImageView) callback;
            imageView.setImageDrawable(null);
            imageView.setImageDrawable(this);
        }
        return true;
    }

    public final void p(int i11) {
        if (this.f55010a != null) {
            this.f55012b.k(i11);
        } else {
            this.f55035t.add(new n(this, i11, 2));
        }
    }

    public final void q(int i11) {
        if (this.f55010a == null) {
            this.f55035t.add(new n(this, i11, 0));
        } else {
            kd.f fVar = this.f55012b;
            fVar.l(fVar.L, i11 + 0.99f);
        }
    }

    public final void r(String str) {
        h hVar = this.f55010a;
        if (hVar == null) {
            this.f55035t.add(new m(this, str, 1));
        } else {
            dd.i iVarD = hVar.d(str);
            if (iVarD == null) {
                throw new IllegalArgumentException(ep.a.g("Cannot find marker with name ", str, "."));
            }
            q((int) (iVarD.f23384b + iVarD.f23385c));
        }
    }

    public final void s(String str) {
        h hVar = this.f55010a;
        ArrayList arrayList = this.f55035t;
        if (hVar == null) {
            arrayList.add(new m(this, str, 0));
            return;
        }
        dd.i iVarD = hVar.d(str);
        if (iVarD == null) {
            throw new IllegalArgumentException(ep.a.g("Cannot find marker with name ", str, "."));
        }
        int i11 = (int) iVarD.f23384b;
        int i12 = ((int) iVarD.f23385c) + i11;
        if (this.f55010a == null) {
            arrayList.add(new q(this, i11, i12));
        } else {
            this.f55012b.l(i11, i12 + 0.99f);
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j11) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.scheduleDrawable(this, runnable, j11);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i11) {
        this.S = i11;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        kd.d.b("Use addColorFilter instead.");
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z11, boolean z12) {
        boolean zIsVisible = isVisible();
        boolean visible = super.setVisible(z11, z12);
        if (z11) {
            u uVar = this.f55020f;
            if (uVar == u.PLAY) {
                l();
                return visible;
            }
            if (uVar == u.RESUME) {
                n();
                return visible;
            }
        } else {
            if (this.f55012b.O) {
                k();
                this.f55020f = u.RESUME;
                return visible;
            }
            if (zIsVisible) {
                this.f55020f = u.NONE;
            }
        }
        return visible;
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        Drawable.Callback callback = getCallback();
        if ((callback instanceof View) && ((View) callback).isInEditMode()) {
            return;
        }
        l();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.f55035t.clear();
        kd.f fVar = this.f55012b;
        fVar.j(true);
        fVar.a(fVar.i());
        if (isVisible()) {
            return;
        }
        this.f55020f = u.NONE;
    }

    public final void t(int i11) {
        if (this.f55010a == null) {
            this.f55035t.add(new n(this, i11, 1));
        } else {
            kd.f fVar = this.f55012b;
            fVar.l(i11, (int) fVar.M);
        }
    }

    public final void u(String str) {
        h hVar = this.f55010a;
        if (hVar == null) {
            this.f55035t.add(new m(this, str, 2));
        } else {
            dd.i iVarD = hVar.d(str);
            if (iVarD == null) {
                throw new IllegalArgumentException(ep.a.g("Cannot find marker with name ", str, "."));
            }
            t((int) iVarD.f23384b);
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.unscheduleDrawable(this, runnable);
    }

    public final void v(float f5) {
        h hVar = this.f55010a;
        if (hVar == null) {
            this.f55035t.add(new p(this, f5, 2));
        } else {
            a aVar = d.f54943a;
            this.f55012b.k(kd.h.f(hVar.f54968l, hVar.m, f5));
        }
    }

    public final boolean w() {
        h hVar = this.f55010a;
        if (hVar == null) {
            return false;
        }
        float f5 = this.f55036t0;
        float f11 = this.f55012b.f();
        this.f55036t0 = f11;
        return Math.abs(f11 - f5) * hVar.b() >= 50.0f;
    }
}
