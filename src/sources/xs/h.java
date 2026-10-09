package xs;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.graphics.Region;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.lingodeer.course.stroke_order_view_new.old.HwView;
import com.yalantis.ucrop.view.CropImageView;
import hh.p0;
import java.util.ArrayList;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class h implements k {
    public d H;
    public float K;
    public float[] L;
    public ArrayList M;
    public boolean N;
    public float O;
    public float P;
    public float Q;
    public float R;
    public Bitmap S;
    public int T;
    public int U;
    public AlphaAnimation V;
    public py.b W;
    public boolean X;
    public Path Y;
    public float[] Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Canvas f56238a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public float[] f56239a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public j f56240b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public boolean f56241b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public HwView f56242c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f56243d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f56244e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public PathMeasure f56245f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f56246t;

    @Override // xs.k
    public final boolean a() {
        return this.f56244e;
    }

    @Override // xs.k
    public final void b(Canvas canvas) {
        HwView hwView = this.f56242c;
        Bitmap bitmap = hwView.M;
        ArrayList arrayList = hwView.H;
        ArrayList arrayList2 = hwView.K;
        Paint paint = hwView.f22277f;
        if (bitmap == null || this.f56243d == arrayList2.size()) {
            return;
        }
        if (!this.f56244e || this.f56243d >= arrayList2.size()) {
            if (!this.N || this.f56243d >= arrayList2.size()) {
                return;
            }
            canvas.drawBitmap(hwView.M, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, (Paint) null);
            return;
        }
        if (hwView.S) {
            paint.setStyle(Paint.Style.STROKE);
            paint.setColor(hwView.f22274c);
            Context context = hwView.getContext();
            m.f(context, "context");
            paint.setStrokeWidth((int) ((1.0f * context.getResources().getDisplayMetrics().density) + 0.5f));
            canvas.drawPath(((f) arrayList.get(this.f56243d)).f56233a, paint);
            canvas.drawPath(((f) arrayList.get(this.f56243d)).f56234b, paint);
        }
        canvas.drawBitmap(hwView.M, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, (Paint) null);
    }

    @Override // xs.k
    public final void c() {
        this.f56244e = true;
        this.f56241b0 = false;
        Bitmap bitmap = this.f56242c.M;
        if (bitmap == null) {
            return;
        }
        this.f56243d = 0;
        bitmap.eraseColor(0);
        this.T = 0;
        f();
    }

    @Override // xs.k
    public final void d() {
        this.f56244e = false;
        this.f56241b0 = true;
        reset();
    }

    public final void f() {
        float[] fArr = this.L;
        PathMeasure pathMeasure = this.f56245f;
        HwView hwView = this.f56242c;
        Bitmap bitmap = hwView.M;
        ArrayList arrayList = hwView.H;
        if (bitmap != null && this.f56243d < arrayList.size()) {
            this.W = new py.b(this, 14);
            hwView.getHandler().postDelayed(this.W, 3000L);
            this.M.clear();
            this.K = CropImageView.DEFAULT_ASPECT_RATIO;
            pathMeasure.setPath(((f) arrayList.get(this.f56243d)).f56233a, false);
            pathMeasure.getPosTan(CropImageView.DEFAULT_ASPECT_RATIO, fArr, null);
            d dVar = this.H;
            float f5 = fArr[0];
            float f11 = fArr[1];
            dVar.f56228a = f5;
            dVar.f56229b = f11;
            this.U = 0;
            this.O = f5;
            this.P = f11;
            Bitmap bitmap2 = hwView.M;
            ArrayList arrayList2 = hwView.K;
            bitmap2.eraseColor(0);
            Canvas canvas = this.f56238a;
            canvas.save();
            canvas.clipPath((Path) arrayList2.get(this.f56243d), Region.Op.INTERSECT);
            hwView.b(canvas);
            canvas.restore();
            RectF rectF = new RectF();
            ((Path) arrayList2.get(this.f56243d)).computeBounds(rectF, true);
            float fWidth = rectF.width();
            float fHeight = rectF.height();
            if (rectF.left + fWidth > hwView.M.getWidth()) {
                fWidth = hwView.M.getWidth() - rectF.left;
            }
            if (rectF.top + fHeight > hwView.M.getHeight()) {
                fHeight = hwView.M.getHeight() - rectF.top;
            }
            this.S = Bitmap.createBitmap(hwView.M, (int) rectF.left, (int) rectF.top, (int) fWidth, (int) fHeight, (Matrix) null, false);
            k();
            hwView.invalidate();
        }
    }

    @Override // xs.k
    public final void g(j jVar) {
        this.f56240b = jVar;
    }

    public final void h() {
        HwView hwView = this.f56242c;
        k();
        RectF rectF = new RectF();
        ((Path) hwView.K.get(this.f56243d)).computeBounds(rectF, true);
        ImageView imageView = new ImageView(hwView.getContext());
        imageView.setImageBitmap(this.S);
        imageView.getDrawable().setColorFilter(hwView.f22274c, PorterDuff.Mode.SRC_ATOP);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) rectF.width(), (int) rectF.height());
        layoutParams.leftMargin = (int) rectF.left;
        layoutParams.topMargin = (int) rectF.top;
        hwView.addView(imageView, layoutParams);
        AlphaAnimation alphaAnimation = this.V;
        if (alphaAnimation != null) {
            alphaAnimation.cancel();
        }
        AlphaAnimation alphaAnimation2 = new AlphaAnimation(1.0f, CropImageView.DEFAULT_ASPECT_RATIO);
        this.V = alphaAnimation2;
        alphaAnimation2.setDuration(700L);
        imageView.startAnimation(this.V);
        this.V.setAnimationListener(new oa.e(this, 1));
        hwView.invalidate();
    }

    public final void i(float f5, float f11) {
        char c11;
        HwView hwView = this.f56242c;
        float[] fArr = this.L;
        PathMeasure pathMeasure = this.f56245f;
        d dVar = this.H;
        float f12 = dVar.f56228a;
        double dSqrt = Math.sqrt(Math.pow(dVar.f56229b - f11, 2.0d) + Math.pow(f12 - f5, 2.0d));
        int i11 = this.f56246t;
        double d5 = i11;
        if (dSqrt <= d5) {
            if (this.W != null) {
                c11 = 1;
                hwView.getHandler().removeCallbacks(this.W);
            } else {
                c11 = 1;
            }
            float length = this.K + i11;
            if (length > pathMeasure.getLength()) {
                length = pathMeasure.getLength();
            }
            pathMeasure.getPosTan(length, fArr, null);
            float f13 = fArr[0];
            if (Math.sqrt(Math.pow(fArr[c11] - f11, 2.0d) + Math.pow(f13 - f5, 2.0d)) <= d5) {
                this.M.add(new d(f5, f11));
                float f14 = (float) (((double) this.K) + dSqrt);
                this.K = f14;
                if (f14 > pathMeasure.getLength()) {
                    this.K = pathMeasure.getLength();
                }
                pathMeasure.getPosTan(this.K, fArr, null);
                dVar.f56228a = fArr[0];
                dVar.f56229b = fArr[c11];
                hwView.invalidate();
                return;
            }
        }
        this.U++;
    }

    public final void j() {
        int i11 = this.f56243d + 1;
        this.f56243d = i11;
        this.T = 0;
        HwView hwView = this.f56242c;
        if (i11 < hwView.H.size()) {
            this.f56244e = true;
            f();
            return;
        }
        this.f56244e = false;
        j jVar = this.f56240b;
        if (jVar != null) {
            jVar.a();
        }
        hwView.invalidate();
    }

    public final void k() {
        Canvas canvas = this.f56238a;
        HwView hwView = this.f56242c;
        Bitmap bitmap = hwView.M;
        ArrayList arrayList = hwView.K;
        if (bitmap == null) {
            return;
        }
        if ((this.f56244e || this.N) && this.f56243d < arrayList.size()) {
            hwView.M.eraseColor(0);
            canvas.save();
            canvas.clipPath(new Path(), Region.Op.INTERSECT);
            hwView.b(canvas);
            canvas.restore();
            for (int i11 = 0; i11 < this.f56243d; i11++) {
                canvas.save();
                canvas.clipPath((Path) arrayList.get(i11));
                hwView.b(canvas);
                canvas.restore();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:66:0x0209  */
    /* JADX WARN: Code duplicated, block: B:68:0x021f  */
    /* JADX WARN: Code duplicated, block: B:70:0x0222  */
    /* JADX WARN: Code duplicated, block: B:72:0x0225  */
    /* JADX WARN: Code duplicated, block: B:93:0x0228 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:95:0x0207 A[SYNTHETIC] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z11;
        boolean z12;
        int size;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        Canvas canvas = this.f56238a;
        float[] fArr = this.Z;
        float[] fArr2 = this.f56239a0;
        HwView hwView = this.f56242c;
        if (this.f56244e) {
            int action = motionEvent.getAction();
            if (action == 0) {
                view.getParent().requestDisallowInterceptTouchEvent(true);
                float x11 = motionEvent.getX();
                float y10 = motionEvent.getY();
                this.X = true;
                fArr[0] = 0.0f;
                fArr[1] = 0.0f;
                fArr2[0] = x11;
                fArr2[1] = y10;
                Path path = new Path();
                this.Y = path;
                path.moveTo(fArr2[0], fArr2[1]);
                canvas.drawPath(this.Y, hwView.f22277f);
                hwView.invalidate();
                float f5 = this.O - x11;
                this.Q = f5;
                float f11 = this.P - y10;
                this.R = f11;
                i(x11 + f5, y10 + f11);
                return true;
            }
            if (action != 1) {
                if (action == 2) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    float x12 = motionEvent.getX();
                    float y11 = motionEvent.getY();
                    if (this.X) {
                        float f12 = 0;
                        if (Math.abs(x12 - fArr[0]) >= f12 || Math.abs(y11 - fArr[1]) >= f12) {
                            fArr[0] = fArr2[0];
                            fArr[1] = fArr2[1];
                            fArr2[0] = x12;
                            fArr2[1] = y11;
                            Paint paint = hwView.f22277f;
                            paint.setStyle(Paint.Style.STROKE);
                            paint.setColor(hwView.f22273b);
                            Context context = hwView.getContext();
                            m.f(context, "context");
                            paint.setStrokeWidth((int) ((10.0f * context.getResources().getDisplayMetrics().density) + 0.5f));
                            paint.setStrokeCap(Paint.Cap.ROUND);
                            float f13 = fArr[0];
                            float f14 = fArr2[0];
                            if (f13 == f14) {
                                this.Y.lineTo(f14, fArr2[1]);
                            } else {
                                float f15 = fArr[1];
                                float f16 = fArr2[1];
                                if (f15 == f16) {
                                    this.Y.lineTo(f14, f16);
                                } else {
                                    this.Y.quadTo(f13, f15, (f14 + f13) / 2.0f, (f16 + f15) / 2.0f);
                                }
                            }
                            canvas.drawPath(this.Y, paint);
                            hwView.invalidate();
                            i(x12 + this.Q, y11 + this.R);
                            return true;
                        }
                    }
                }
                return true;
            }
            view.getParent().requestDisallowInterceptTouchEvent(false);
            motionEvent.getX();
            motionEvent.getY();
            ArrayList arrayList = this.M;
            if (this.X) {
                this.X = false;
                float[] fArr3 = this.L;
                PathMeasure pathMeasure = this.f56245f;
                double size2 = this.U / (arrayList.size() + this.U);
                if (size2 <= 0.5d) {
                    if (this.K / pathMeasure.getLength() >= 0.99d) {
                        z11 = true;
                        z12 = false;
                    }
                    this.f56244e = z12;
                    boolean z13 = z11;
                    this.N = z13;
                    RectF rectF = new RectF();
                    ((Path) hwView.K.get(this.f56243d)).computeBounds(rectF, z13);
                    k();
                    size = arrayList.size();
                    i11 = Integer.MAX_VALUE;
                    i12 = Integer.MIN_VALUE;
                    i13 = Integer.MIN_VALUE;
                    i14 = 0;
                    i15 = Integer.MAX_VALUE;
                    while (i14 < size) {
                        Object obj = arrayList.get(i14);
                        i14++;
                        d dVar = (d) obj;
                        i16 = (int) (dVar.f56228a - this.Q);
                        i17 = (int) (dVar.f56229b - this.R);
                        if (i16 < i11) {
                            i11 = i16;
                        }
                        if (i17 < i15) {
                            i15 = i17;
                        }
                        if (i16 > i12) {
                            i12 = i16;
                        }
                        if (i17 > i13) {
                            i13 = i17;
                        }
                    }
                    hwView.removeAllViews();
                    ImageView imageView = new ImageView(hwView.getContext());
                    imageView.setImageBitmap(this.S);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) rectF.width(), (int) rectF.height());
                    layoutParams.leftMargin = i11;
                    layoutParams.topMargin = i15;
                    hwView.addView(imageView, layoutParams);
                    AnimationSet animationSet = new AnimationSet(true);
                    TranslateAnimation translateAnimation = new TranslateAnimation(CropImageView.DEFAULT_ASPECT_RATIO, rectF.left - i11, CropImageView.DEFAULT_ASPECT_RATIO, rectF.top - i15);
                    ScaleAnimation scaleAnimation = new ScaleAnimation((i12 - i11) / rectF.width(), 1.0f, (i13 - i15) / rectF.width(), 1.0f);
                    animationSet.addAnimation(translateAnimation);
                    animationSet.addAnimation(scaleAnimation);
                    animationSet.setDuration(500L);
                    animationSet.setAnimationListener(new g(this, imageView));
                    animationSet.setFillAfter(true);
                    animationSet.setFillEnabled(true);
                    animationSet.setInterpolator(new DecelerateInterpolator());
                    imageView.startAnimation(animationSet);
                    return true;
                }
                RectF rectF2 = new RectF();
                ((f) hwView.H.get(this.f56243d)).f56233a.computeBounds(rectF2, true);
                float fWidth = rectF2.width();
                float fHeight = rectF2.height();
                int size3 = arrayList.size();
                float f17 = Float.MIN_VALUE;
                z11 = true;
                float f18 = Float.MAX_VALUE;
                float f19 = Float.MAX_VALUE;
                int i18 = 0;
                float f21 = Float.MIN_VALUE;
                while (i18 < size3) {
                    Object obj2 = arrayList.get(i18);
                    i18++;
                    d dVar2 = (d) obj2;
                    float f22 = dVar2.f56228a;
                    if (f22 < f18) {
                        f18 = f22;
                    }
                    float f23 = dVar2.f56229b;
                    if (f23 < f19) {
                        f19 = f23;
                    }
                    if (f22 > f17) {
                        f17 = f22;
                    }
                    if (f23 > f21) {
                        f21 = f23;
                    }
                }
                float f24 = fWidth / (f17 - f18);
                float f25 = fHeight / (f21 - f19);
                int size4 = arrayList.size();
                int i19 = 0;
                while (i19 < size4) {
                    Object obj3 = arrayList.get(i19);
                    i19++;
                    d dVar3 = (d) obj3;
                    dVar3.f56228a = p0.a(dVar3.f56228a, f18, f24, f18);
                    dVar3.f56229b = p0.a(dVar3.f56229b, f19, f25, f19);
                }
                ArrayList arrayList2 = new ArrayList();
                arrayList2.addAll(arrayList);
                arrayList.clear();
                this.K = CropImageView.DEFAULT_ASPECT_RATIO;
                pathMeasure.setPath(((f) hwView.H.get(this.f56243d)).f56233a, false);
                pathMeasure.getPosTan(CropImageView.DEFAULT_ASPECT_RATIO, fArr3, null);
                d dVar4 = this.H;
                float f26 = fArr3[0];
                float f27 = fArr3[1];
                dVar4.f56228a = f26;
                dVar4.f56229b = f27;
                int size5 = arrayList2.size();
                int i21 = 0;
                while (i21 < size5) {
                    Object obj4 = arrayList2.get(i21);
                    i21++;
                    d dVar5 = (d) obj4;
                    i(dVar5.f56228a, dVar5.f56229b);
                }
                if (size2 <= 4602678819172646912) {
                    if (this.K / pathMeasure.getLength() >= 0.99d) {
                        z12 = false;
                        this.f56244e = z12;
                        boolean z14 = z11;
                        this.N = z14;
                        RectF rectF3 = new RectF();
                        ((Path) hwView.K.get(this.f56243d)).computeBounds(rectF3, z14);
                        k();
                        size = arrayList.size();
                        i11 = Integer.MAX_VALUE;
                        i12 = Integer.MIN_VALUE;
                        i13 = Integer.MIN_VALUE;
                        i14 = 0;
                        i15 = Integer.MAX_VALUE;
                        while (i14 < size) {
                            Object obj5 = arrayList.get(i14);
                            i14++;
                            d dVar6 = (d) obj5;
                            i16 = (int) (dVar6.f56228a - this.Q);
                            i17 = (int) (dVar6.f56229b - this.R);
                            if (i16 < i11) {
                                i11 = i16;
                            }
                            if (i17 < i15) {
                                i15 = i17;
                            }
                            if (i16 > i12) {
                                i12 = i16;
                            }
                            if (i17 > i13) {
                                i13 = i17;
                            }
                        }
                        hwView.removeAllViews();
                        ImageView imageView2 = new ImageView(hwView.getContext());
                        imageView2.setImageBitmap(this.S);
                        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams((int) rectF3.width(), (int) rectF3.height());
                        layoutParams2.leftMargin = i11;
                        layoutParams2.topMargin = i15;
                        hwView.addView(imageView2, layoutParams2);
                        AnimationSet animationSet2 = new AnimationSet(true);
                        TranslateAnimation translateAnimation2 = new TranslateAnimation(CropImageView.DEFAULT_ASPECT_RATIO, rectF3.left - i11, CropImageView.DEFAULT_ASPECT_RATIO, rectF3.top - i15);
                        ScaleAnimation scaleAnimation2 = new ScaleAnimation((i12 - i11) / rectF3.width(), 1.0f, (i13 - i15) / rectF3.width(), 1.0f);
                        animationSet2.addAnimation(translateAnimation2);
                        animationSet2.addAnimation(scaleAnimation2);
                        animationSet2.setDuration(500L);
                        animationSet2.setAnimationListener(new g(this, imageView2));
                        animationSet2.setFillAfter(true);
                        animationSet2.setFillEnabled(true);
                        animationSet2.setInterpolator(new DecelerateInterpolator());
                        imageView2.startAnimation(animationSet2);
                        return true;
                    }
                }
                int i22 = this.T + 1;
                this.T = i22;
                if (i22 > 5) {
                    j();
                    return true;
                }
                if (i22 < 3) {
                    f();
                    return true;
                }
                this.f56244e = false;
                this.N = true;
                try {
                    h();
                    return true;
                } catch (Exception e8) {
                    e8.printStackTrace();
                    return true;
                }
            }
        }
        return false;
    }

    @Override // xs.k
    public final void reset() {
        this.f56243d = 0;
        this.M.clear();
        this.K = CropImageView.DEFAULT_ASPECT_RATIO;
        this.f56244e = false;
        HwView hwView = this.f56242c;
        if (hwView != null && this.W != null && hwView.getHandler() != null) {
            hwView.getHandler().removeCallbacks(this.W);
        }
        AlphaAnimation alphaAnimation = this.V;
        if (alphaAnimation != null) {
            alphaAnimation.cancel();
        }
    }
}
