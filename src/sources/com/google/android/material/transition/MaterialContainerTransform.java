package com.google.android.material.transition;

import android.R;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.canvas.CanvasCompat;
import com.google.android.material.motion.MotionUtils;
import com.google.android.material.shape.AbsoluteCornerSize;
import com.google.android.material.shape.CornerSize;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.RelativeCornerSize;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.shape.ShapeAppearancePathProvider;
import com.google.android.material.shape.Shapeable;
import com.yalantis.ucrop.view.CropImageView;
import fr.j3;
import hh.p0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.HashMap;
import ns.o;
import nv.p;
import qa.d0;
import qa.n;
import qa.v;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class MaterialContainerTransform extends v {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static final String[] f15919q0 = {"materialContainerTransition:bounds", "materialContainerTransition:shapeAppearance"};

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static final ProgressThresholdsGroup f15920r0 = new ProgressThresholdsGroup(new ProgressThresholds(CropImageView.DEFAULT_ASPECT_RATIO, 0.25f), new ProgressThresholds(CropImageView.DEFAULT_ASPECT_RATIO, 1.0f), new ProgressThresholds(CropImageView.DEFAULT_ASPECT_RATIO, 1.0f), new ProgressThresholds(CropImageView.DEFAULT_ASPECT_RATIO, 0.75f));

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static final ProgressThresholdsGroup f15921s0 = new ProgressThresholdsGroup(new ProgressThresholds(0.6f, 0.9f), new ProgressThresholds(CropImageView.DEFAULT_ASPECT_RATIO, 1.0f), new ProgressThresholds(CropImageView.DEFAULT_ASPECT_RATIO, 0.9f), new ProgressThresholds(0.3f, 0.9f));

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static final ProgressThresholdsGroup f15922t0 = new ProgressThresholdsGroup(new ProgressThresholds(0.1f, 0.4f), new ProgressThresholds(0.1f, 1.0f), new ProgressThresholds(0.1f, 1.0f), new ProgressThresholds(0.1f, 0.9f));

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static final ProgressThresholdsGroup f15923u0 = new ProgressThresholdsGroup(new ProgressThresholds(0.6f, 0.9f), new ProgressThresholds(CropImageView.DEFAULT_ASPECT_RATIO, 0.9f), new ProgressThresholds(CropImageView.DEFAULT_ASPECT_RATIO, 0.9f), new ProgressThresholds(0.2f, 0.9f));

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public boolean f15924i0 = false;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public final int f15925j0 = R.id.content;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public final int f15926k0 = -1;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public final int f15927l0 = -1;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public final int f15928m0 = 1375731712;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public final boolean f15929n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public final float f15930o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final float f15931p0;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    @Retention(RetentionPolicy.SOURCE)
    public @interface FadeMode {
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    @Retention(RetentionPolicy.SOURCE)
    public @interface FitMode {
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class ProgressThresholds {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final float f15938a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final float f15939b;

        public ProgressThresholds(float f5, float f11) {
            this.f15938a = f5;
            this.f15939b = f11;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class ProgressThresholdsGroup {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ProgressThresholds f15940a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ProgressThresholds f15941b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ProgressThresholds f15942c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final ProgressThresholds f15943d;

        public ProgressThresholdsGroup(ProgressThresholds progressThresholds, ProgressThresholds progressThresholds2, ProgressThresholds progressThresholds3, ProgressThresholds progressThresholds4) {
            this.f15940a = progressThresholds;
            this.f15941b = progressThresholds2;
            this.f15942c = progressThresholds3;
            this.f15943d = progressThresholds4;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    @Retention(RetentionPolicy.SOURCE)
    public @interface TransitionDirection {
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class TransitionDrawable extends Drawable {
        public final ProgressThresholdsGroup A;
        public final FadeModeEvaluator B;
        public final FitModeEvaluator C;
        public FadeModeResult D;
        public FitModeResult E;
        public RectF F;
        public float G;
        public float H;
        public float I;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final View f15944a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final RectF f15945b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ShapeAppearanceModel f15946c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final float f15947d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final View f15948e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final RectF f15949f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final ShapeAppearanceModel f15950g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final float f15951h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final Paint f15952i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final Paint f15953j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final Paint f15954k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final Paint f15955l;
        public final Paint m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final MaskEvaluator f15956n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public final PathMeasure f15957o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public final float f15958p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public final float[] f15959q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public final boolean f15960r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final float f15961s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final float f15962t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final boolean f15963u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final MaterialShapeDrawable f15964v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final RectF f15965w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public final RectF f15966x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public final RectF f15967y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public final RectF f15968z;

        public TransitionDrawable(o oVar, View view, RectF rectF, ShapeAppearanceModel shapeAppearanceModel, float f5, View view2, RectF rectF2, ShapeAppearanceModel shapeAppearanceModel2, float f11, int i11, boolean z11, boolean z12, FadeModeEvaluator fadeModeEvaluator, FitModeEvaluator fitModeEvaluator, ProgressThresholdsGroup progressThresholdsGroup) {
            Paint paint = new Paint();
            this.f15952i = paint;
            Paint paint2 = new Paint();
            this.f15953j = paint2;
            Paint paint3 = new Paint();
            this.f15954k = paint3;
            this.f15955l = new Paint();
            Paint paint4 = new Paint();
            this.m = paint4;
            this.f15956n = new MaskEvaluator();
            this.f15959q = new float[]{rectF.centerX(), rectF.top};
            MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable();
            this.f15964v = materialShapeDrawable;
            Paint paint5 = new Paint();
            new Path();
            this.f15944a = view;
            this.f15945b = rectF;
            this.f15946c = shapeAppearanceModel;
            this.f15947d = f5;
            this.f15948e = view2;
            this.f15949f = rectF2;
            this.f15950g = shapeAppearanceModel2;
            this.f15951h = f11;
            this.f15960r = z11;
            this.f15963u = z12;
            this.B = fadeModeEvaluator;
            this.C = fitModeEvaluator;
            this.A = progressThresholdsGroup;
            WindowManager windowManager = (WindowManager) view.getContext().getSystemService("window");
            DisplayMetrics displayMetrics = new DisplayMetrics();
            windowManager.getDefaultDisplay().getMetrics(displayMetrics);
            this.f15961s = displayMetrics.widthPixels;
            this.f15962t = displayMetrics.heightPixels;
            paint.setColor(0);
            paint2.setColor(0);
            paint3.setColor(0);
            materialShapeDrawable.r(ColorStateList.valueOf(0));
            materialShapeDrawable.v(2);
            materialShapeDrawable.Z = false;
            materialShapeDrawable.u(-7829368);
            RectF rectF3 = new RectF(rectF);
            this.f15965w = rectF3;
            this.f15966x = new RectF(rectF3);
            RectF rectF4 = new RectF(rectF3);
            this.f15967y = rectF4;
            this.f15968z = new RectF(rectF4);
            PointF pointF = new PointF(rectF.centerX(), rectF.top);
            PointF pointF2 = new PointF(rectF2.centerX(), rectF2.top);
            PathMeasure pathMeasure = new PathMeasure(oVar.B(pointF.x, pointF.y, pointF2.x, pointF2.y), false);
            this.f15957o = pathMeasure;
            this.f15958p = pathMeasure.getLength();
            paint4.setStyle(Paint.Style.FILL);
            RectF rectF5 = TransitionUtils.f15979a;
            paint4.setShader(new LinearGradient(CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, i11, i11, Shader.TileMode.CLAMP));
            paint5.setStyle(Paint.Style.STROKE);
            paint5.setStrokeWidth(10.0f);
            d(CropImageView.DEFAULT_ASPECT_RATIO);
        }

        public final void a(Canvas canvas) {
            c(canvas, this.f15954k);
            Rect bounds = getBounds();
            RectF rectF = this.f15967y;
            TransitionUtils.f(canvas, bounds, rectF.left, rectF.top, this.E.f15909b, this.D.f15890b, new CanvasCompat.CanvasOperation() { // from class: com.google.android.material.transition.MaterialContainerTransform.TransitionDrawable.2
                @Override // com.google.android.material.canvas.CanvasCompat.CanvasOperation
                public final void a(Canvas canvas2) {
                    TransitionDrawable.this.f15948e.draw(canvas2);
                }
            });
        }

        public final void b(Canvas canvas) {
            c(canvas, this.f15953j);
            Rect bounds = getBounds();
            RectF rectF = this.f15965w;
            TransitionUtils.f(canvas, bounds, rectF.left, rectF.top, this.E.f15908a, this.D.f15889a, new CanvasCompat.CanvasOperation() { // from class: com.google.android.material.transition.MaterialContainerTransform.TransitionDrawable.1
                @Override // com.google.android.material.canvas.CanvasCompat.CanvasOperation
                public final void a(Canvas canvas2) {
                    TransitionDrawable.this.f15944a.draw(canvas2);
                }
            });
        }

        public final void c(Canvas canvas, Paint paint) {
            if (paint.getColor() == 0 || paint.getAlpha() <= 0) {
                return;
            }
            canvas.drawRect(getBounds(), paint);
        }

        public final void d(float f5) {
            float f11;
            float f12;
            RectF rectF;
            float f13;
            this.I = f5;
            this.m.setAlpha((int) (this.f15960r ? TransitionUtils.c(CropImageView.DEFAULT_ASPECT_RATIO, 255.0f, f5) : TransitionUtils.c(255.0f, CropImageView.DEFAULT_ASPECT_RATIO, f5)));
            float f14 = this.f15958p;
            PathMeasure pathMeasure = this.f15957o;
            float[] fArr = this.f15959q;
            pathMeasure.getPosTan(f14 * f5, fArr, null);
            float fA = fArr[0];
            float fA2 = fArr[1];
            if (f5 > 1.0f || f5 < CropImageView.DEFAULT_ASPECT_RATIO) {
                if (f5 > 1.0f) {
                    f12 = (f5 - 1.0f) / 0.00999999f;
                    f11 = 0.99f;
                } else {
                    f11 = 0.01f;
                    f12 = (f5 / 0.01f) * (-1.0f);
                }
                pathMeasure.getPosTan(f14 * f11, fArr, null);
                float f15 = fArr[0];
                float f16 = fArr[1];
                fA = p0.a(fA, f15, f12, fA);
                fA2 = p0.a(fA2, f16, f12, fA2);
            }
            float f17 = fA2;
            float f18 = fA;
            ProgressThresholdsGroup progressThresholdsGroup = this.A;
            ProgressThresholds progressThresholds = progressThresholdsGroup.f15941b;
            ProgressThresholds progressThresholds2 = progressThresholdsGroup.f15940a;
            ProgressThresholds progressThresholds3 = progressThresholdsGroup.f15942c;
            float f19 = progressThresholds.f15938a;
            float f21 = progressThresholdsGroup.f15941b.f15939b;
            RectF rectF2 = this.f15945b;
            float fWidth = rectF2.width();
            float fHeight = rectF2.height();
            RectF rectF3 = this.f15949f;
            FitModeResult fitModeResultA = this.C.a(f5, f19, f21, fWidth, fHeight, rectF3.width(), rectF3.height());
            this.E = fitModeResultA;
            float f22 = fitModeResultA.f15910c / 2.0f;
            float f23 = fitModeResultA.f15911d + f17;
            RectF rectF4 = this.f15965w;
            rectF4.set(f18 - f22, f17, f22 + f18, f23);
            FitModeResult fitModeResult = this.E;
            float f24 = fitModeResult.f15912e / 2.0f;
            float f25 = fitModeResult.f15913f + f17;
            RectF rectF5 = this.f15967y;
            rectF5.set(f18 - f24, f17, f24 + f18, f25);
            RectF rectF6 = this.f15966x;
            rectF6.set(rectF4);
            RectF rectF7 = this.f15968z;
            rectF7.set(rectF5);
            float f26 = progressThresholds3.f15938a;
            float f27 = progressThresholds3.f15939b;
            FitModeResult fitModeResult2 = this.E;
            FitModeEvaluator fitModeEvaluator = this.C;
            boolean zB = fitModeEvaluator.b(fitModeResult2);
            RectF rectF8 = zB ? rectF6 : rectF7;
            float fD = TransitionUtils.d(CropImageView.DEFAULT_ASPECT_RATIO, 1.0f, f26, f27, f5, false);
            if (!zB) {
                fD = 1.0f - fD;
            }
            fitModeEvaluator.c(rectF8, fD, this.E);
            this.F = new RectF(Math.min(rectF6.left, rectF7.left), Math.min(rectF6.top, rectF7.top), Math.max(rectF6.right, rectF7.right), Math.max(rectF6.bottom, rectF7.bottom));
            ProgressThresholds progressThresholds4 = progressThresholdsGroup.f15943d;
            MaskEvaluator maskEvaluator = this.f15956n;
            Path path = maskEvaluator.f15916c;
            Path path2 = maskEvaluator.f15915b;
            ShapeAppearancePathProvider shapeAppearancePathProvider = maskEvaluator.f15917d;
            float f28 = progressThresholds4.f15938a;
            float f29 = progressThresholds4.f15939b;
            ShapeAppearanceModel shapeAppearanceModelA = this.f15946c;
            if (f5 < f28) {
                rectF = rectF7;
                f13 = f5;
            } else {
                ShapeAppearanceModel shapeAppearanceModel = this.f15950g;
                if (f5 > f29) {
                    shapeAppearanceModelA = shapeAppearanceModel;
                    rectF = rectF7;
                    f13 = f5;
                } else {
                    TransitionUtils.AnonymousClass1 anonymousClass1 = new TransitionUtils.CornerSizeBinaryOperator() { // from class: com.google.android.material.transition.TransitionUtils.1

                        /* JADX INFO: renamed from: a */
                        public final /* synthetic */ RectF f15980a;

                        /* JADX INFO: renamed from: b */
                        public final /* synthetic */ RectF f15981b;

                        /* JADX INFO: renamed from: c */
                        public final /* synthetic */ float f15982c;

                        /* JADX INFO: renamed from: d */
                        public final /* synthetic */ float f15983d;

                        /* JADX INFO: renamed from: e */
                        public final /* synthetic */ float f15984e;

                        public AnonymousClass1() {
                            rectF = rectF4;
                            rectF = rectF7;
                            f = f28;
                            f = f29;
                            f = f5;
                        }

                        public final AbsoluteCornerSize a(CornerSize cornerSize, CornerSize cornerSize2) {
                            return new AbsoluteCornerSize(TransitionUtils.d(cornerSize.a(rectF), cornerSize2.a(rectF), f, f, f, false));
                        }
                    };
                    rectF = rectF7;
                    f13 = f5;
                    CornerSize cornerSize = shapeAppearanceModelA.f15249e;
                    CornerSize cornerSize2 = shapeAppearanceModelA.f15252h;
                    CornerSize cornerSize3 = shapeAppearanceModelA.f15251g;
                    CornerSize cornerSize4 = shapeAppearanceModelA.f15250f;
                    ShapeAppearanceModel.Builder builderH = ((cornerSize.a(rectF4) == CropImageView.DEFAULT_ASPECT_RATIO && cornerSize4.a(rectF4) == CropImageView.DEFAULT_ASPECT_RATIO && cornerSize3.a(rectF4) == CropImageView.DEFAULT_ASPECT_RATIO && cornerSize2.a(rectF4) == CropImageView.DEFAULT_ASPECT_RATIO) ? shapeAppearanceModel : shapeAppearanceModelA).h();
                    builderH.f15261e = anonymousClass1.a(shapeAppearanceModelA.f15249e, shapeAppearanceModel.f15249e);
                    builderH.f15262f = anonymousClass1.a(cornerSize4, shapeAppearanceModel.f15250f);
                    builderH.f15264h = anonymousClass1.a(cornerSize2, shapeAppearanceModel.f15252h);
                    builderH.f15263g = anonymousClass1.a(cornerSize3, shapeAppearanceModel.f15251g);
                    shapeAppearanceModelA = builderH.a();
                }
            }
            maskEvaluator.f15918e = shapeAppearanceModelA;
            shapeAppearancePathProvider.a(shapeAppearanceModelA, rectF6, path2);
            shapeAppearancePathProvider.a(maskEvaluator.f15918e, rectF, path);
            maskEvaluator.f15914a.op(path2, path, Path.Op.UNION);
            this.G = TransitionUtils.c(this.f15947d, this.f15951h, f13);
            float fCenterX = ((this.F.centerX() / (this.f15961s / 2.0f)) - 1.0f) * 0.3f;
            float fCenterY = (this.F.centerY() / this.f15962t) * 1.5f;
            float f30 = this.G;
            float f31 = (int) (fCenterY * f30);
            this.H = f31;
            this.f15955l.setShadowLayer(f30, (int) (fCenterX * f30), f31, 754974720);
            this.D = this.B.a(f13, progressThresholds2.f15938a, progressThresholds2.f15939b);
            Paint paint = this.f15953j;
            if (paint.getColor() != 0) {
                paint.setAlpha(this.D.f15889a);
            }
            Paint paint2 = this.f15954k;
            if (paint2.getColor() != 0) {
                paint2.setAlpha(this.D.f15890b);
            }
            invalidateSelf();
        }

        @Override // android.graphics.drawable.Drawable
        public final void draw(Canvas canvas) {
            Paint paint = this.m;
            if (paint.getAlpha() > 0) {
                canvas.drawRect(getBounds(), paint);
            }
            boolean z11 = this.f15963u;
            MaskEvaluator maskEvaluator = this.f15956n;
            if (z11 && this.G > CropImageView.DEFAULT_ASPECT_RATIO) {
                canvas.save();
                canvas.clipPath(maskEvaluator.f15914a, Region.Op.DIFFERENCE);
                if (Build.VERSION.SDK_INT > 28) {
                    ShapeAppearanceModel shapeAppearanceModel = maskEvaluator.f15918e;
                    boolean zG = shapeAppearanceModel.g(this.F);
                    Paint paint2 = this.f15955l;
                    if (zG) {
                        float fA = shapeAppearanceModel.f15249e.a(this.F);
                        canvas.drawRoundRect(this.F, fA, fA, paint2);
                    } else {
                        canvas.drawPath(maskEvaluator.f15914a, paint2);
                    }
                } else {
                    RectF rectF = this.F;
                    int i11 = (int) rectF.left;
                    int i12 = (int) rectF.top;
                    int i13 = (int) rectF.right;
                    int i14 = (int) rectF.bottom;
                    MaterialShapeDrawable materialShapeDrawable = this.f15964v;
                    materialShapeDrawable.setBounds(i11, i12, i13, i14);
                    materialShapeDrawable.q(this.G);
                    materialShapeDrawable.w((int) this.H);
                    materialShapeDrawable.setShapeAppearanceModel(maskEvaluator.f15918e);
                    materialShapeDrawable.draw(canvas);
                }
                canvas.restore();
            }
            canvas.clipPath(maskEvaluator.f15914a);
            c(canvas, this.f15952i);
            if (this.D.f15891c) {
                b(canvas);
                a(canvas);
            } else {
                a(canvas);
                b(canvas);
            }
        }

        @Override // android.graphics.drawable.Drawable
        public final int getOpacity() {
            return -3;
        }

        @Override // android.graphics.drawable.Drawable
        public final void setAlpha(int i11) {
            throw new UnsupportedOperationException("Setting alpha on is not supported");
        }

        @Override // android.graphics.drawable.Drawable
        public final void setColorFilter(ColorFilter colorFilter) {
            throw new UnsupportedOperationException("Setting a color filter is not supported");
        }
    }

    public MaterialContainerTransform() {
        this.f15929n0 = Build.VERSION.SDK_INT >= 28;
        this.f15930o0 = -1.0f;
        this.f15931p0 = -1.0f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void S(d0 d0Var, int i11) {
        final RectF rectFB;
        ShapeAppearanceModel shapeAppearanceModel;
        if (i11 != -1) {
            View view = d0Var.f47605b;
            RectF rectF = TransitionUtils.f15979a;
            View viewFindViewById = view.findViewById(i11);
            if (viewFindViewById == null) {
                viewFindViewById = TransitionUtils.a(view, i11);
            }
            d0Var.f47605b = viewFindViewById;
        } else if (d0Var.f47605b.getTag(com.lingodeer.R.id.mtrl_motion_snapshot_view) instanceof View) {
            View view2 = (View) d0Var.f47605b.getTag(com.lingodeer.R.id.mtrl_motion_snapshot_view);
            d0Var.f47605b.setTag(com.lingodeer.R.id.mtrl_motion_snapshot_view, null);
            d0Var.f47605b = view2;
        }
        View view3 = d0Var.f47605b;
        HashMap map = d0Var.f47604a;
        if (!view3.isLaidOut() && view3.getWidth() == 0 && view3.getHeight() == 0) {
            return;
        }
        if (view3.getParent() == null) {
            RectF rectF2 = TransitionUtils.f15979a;
            rectFB = new RectF(view3.getLeft(), view3.getTop(), view3.getRight(), view3.getBottom());
        } else {
            rectFB = TransitionUtils.b(view3);
        }
        map.put("materialContainerTransition:bounds", rectFB);
        if (view3.getTag(com.lingodeer.R.id.mtrl_motion_snapshot_view) instanceof ShapeAppearanceModel) {
            shapeAppearanceModel = (ShapeAppearanceModel) view3.getTag(com.lingodeer.R.id.mtrl_motion_snapshot_view);
        } else {
            Context context = view3.getContext();
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(new int[]{com.lingodeer.R.attr.transitionShapeAppearance});
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
            typedArrayObtainStyledAttributes.recycle();
            if (resourceId != -1) {
                shapeAppearanceModel = ShapeAppearanceModel.a(context, resourceId, 0).a();
            } else {
                shapeAppearanceModel = view3 instanceof Shapeable ? ((Shapeable) view3).getShapeAppearanceModel() : new ShapeAppearanceModel.Builder().a();
            }
        }
        map.put("materialContainerTransition:shapeAppearance", shapeAppearanceModel.i(new ShapeAppearanceModel.CornerSizeUnaryOperator() { // from class: com.google.android.material.transition.a
            @Override // com.google.android.material.shape.ShapeAppearanceModel.CornerSizeUnaryOperator
            public final CornerSize b(CornerSize cornerSize) {
                RectF rectF3 = TransitionUtils.f15979a;
                if (cornerSize instanceof RelativeCornerSize) {
                    return (RelativeCornerSize) cornerSize;
                }
                RectF rectF4 = rectFB;
                return new RelativeCornerSize(cornerSize.a(rectF4) / Math.min(rectF4.width(), rectF4.height()));
            }
        }));
    }

    @Override // qa.v
    public final void N(o oVar) {
        super.N(oVar);
        this.f15924i0 = true;
    }

    @Override // qa.v
    public final void f(d0 d0Var) {
        S(d0Var, this.f15927l0);
    }

    @Override // qa.v
    public final void i(d0 d0Var) {
        S(d0Var, this.f15926k0);
    }

    @Override // qa.v
    public final Animator m(ViewGroup viewGroup, d0 d0Var, d0 d0Var2) {
        final View viewA;
        View view;
        RectF rectF;
        ProgressThresholdsGroup progressThresholdsGroup;
        int iC;
        o nVar = null;
        if (d0Var != null) {
            HashMap map = d0Var.f47604a;
            if (d0Var2 != null) {
                HashMap map2 = d0Var2.f47604a;
                RectF rectF2 = (RectF) map.get("materialContainerTransition:bounds");
                ShapeAppearanceModel shapeAppearanceModel = (ShapeAppearanceModel) map.get("materialContainerTransition:shapeAppearance");
                if (rectF2 != null && shapeAppearanceModel != null) {
                    RectF rectF3 = (RectF) map2.get("materialContainerTransition:bounds");
                    ShapeAppearanceModel shapeAppearanceModel2 = (ShapeAppearanceModel) map2.get("materialContainerTransition:shapeAppearance");
                    if (rectF3 != null && shapeAppearanceModel2 != null) {
                        final View view2 = d0Var.f47605b;
                        final View view3 = d0Var2.f47605b;
                        View view4 = view3.getParent() != null ? view3 : view2;
                        int id2 = view4.getId();
                        int i11 = this.f15925j0;
                        if (i11 == id2) {
                            viewA = (View) view4.getParent();
                            view = view4;
                        } else {
                            viewA = TransitionUtils.a(view4, i11);
                            view = null;
                        }
                        RectF rectFB = TransitionUtils.b(viewA);
                        float f5 = -rectFB.left;
                        float f11 = -rectFB.top;
                        if (view != null) {
                            rectF = TransitionUtils.b(view);
                            rectF.offset(f5, f11);
                        } else {
                            rectF = new RectF(CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, viewA.getWidth(), viewA.getHeight());
                        }
                        rectF2.offset(f5, f11);
                        rectF3.offset(f5, f11);
                        boolean z11 = rectF3.height() * rectF3.width() > rectF2.height() * rectF2.width();
                        Context context = view4.getContext();
                        r6.a aVar = AnimationUtils.f13769b;
                        if (this.f47682d == null) {
                            M(MotionUtils.d(context, com.lingodeer.R.attr.motionEasingEmphasizedInterpolator, aVar));
                        }
                        int i12 = z11 ? com.lingodeer.R.attr.motionDurationLong2 : com.lingodeer.R.attr.motionDurationMedium4;
                        if (this.f47680c == -1 && (iC = MotionUtils.c(context, i12, -1)) != -1) {
                            K(iC);
                        }
                        if (!this.f15924i0) {
                            TypedValue typedValue = new TypedValue();
                            if (context.getTheme().resolveAttribute(com.lingodeer.R.attr.motionPath, typedValue, true)) {
                                int i13 = typedValue.type;
                                if (i13 == 16) {
                                    int i14 = typedValue.data;
                                    if (i14 != 0) {
                                        if (i14 != 1) {
                                            throw new IllegalArgumentException(p.j(i14, "Invalid motion path type: "));
                                        }
                                        nVar = new MaterialArcMotion();
                                    }
                                } else {
                                    if (i13 != 3) {
                                        throw new IllegalArgumentException("Motion path theme attribute must either be an enum value or path data string");
                                    }
                                    nVar = new n(j3.n(String.valueOf(typedValue.string)));
                                }
                            }
                            if (nVar != null) {
                                N(nVar);
                            }
                        }
                        o oVar = this.f47677a0;
                        float elevation = this.f15930o0;
                        if (elevation == -1.0f) {
                            elevation = view2.getElevation();
                        }
                        float f12 = elevation;
                        float elevation2 = this.f15931p0;
                        if (elevation2 == -1.0f) {
                            elevation2 = view3.getElevation();
                        }
                        float f13 = elevation2;
                        FadeModeEvaluator fadeModeEvaluator = z11 ? FadeModeEvaluators.f15887a : FadeModeEvaluators.f15888b;
                        FitModeEvaluators.AnonymousClass1 anonymousClass1 = FitModeEvaluators.f15906a;
                        FitModeEvaluators.AnonymousClass2 anonymousClass2 = FitModeEvaluators.f15907b;
                        float fWidth = rectF2.width();
                        float fHeight = rectF2.height();
                        float fWidth2 = rectF3.width();
                        float fHeight2 = rectF3.height();
                        FitModeEvaluator fitModeEvaluator = (!z11 ? (fWidth2 * fHeight) / fWidth >= fHeight2 : (fHeight2 * fWidth) / fWidth2 >= fHeight) ? anonymousClass2 : anonymousClass1;
                        if (this.f47677a0 instanceof MaterialArcMotion) {
                            ProgressThresholdsGroup progressThresholdsGroup2 = z11 ? f15922t0 : f15923u0;
                            progressThresholdsGroup = new ProgressThresholdsGroup(progressThresholdsGroup2.f15940a, progressThresholdsGroup2.f15941b, progressThresholdsGroup2.f15942c, progressThresholdsGroup2.f15943d);
                        } else {
                            ProgressThresholdsGroup progressThresholdsGroup3 = z11 ? f15920r0 : f15921s0;
                            progressThresholdsGroup = new ProgressThresholdsGroup(progressThresholdsGroup3.f15940a, progressThresholdsGroup3.f15941b, progressThresholdsGroup3.f15942c, progressThresholdsGroup3.f15943d);
                        }
                        final TransitionDrawable transitionDrawable = new TransitionDrawable(oVar, view2, rectF2, shapeAppearanceModel, f12, view3, rectF3, shapeAppearanceModel2, f13, this.f15928m0, z11, this.f15929n0, fadeModeEvaluator, fitModeEvaluator, progressThresholdsGroup);
                        transitionDrawable.setBounds(Math.round(rectF.left), Math.round(rectF.top), Math.round(rectF.right), Math.round(rectF.bottom));
                        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(CropImageView.DEFAULT_ASPECT_RATIO, 1.0f);
                        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.transition.MaterialContainerTransform.1
                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                float animatedFraction = valueAnimator.getAnimatedFraction();
                                TransitionDrawable transitionDrawable2 = transitionDrawable;
                                if (transitionDrawable2.I != animatedFraction) {
                                    transitionDrawable2.d(animatedFraction);
                                }
                            }
                        });
                        a(new TransitionListenerAdapter() { // from class: com.google.android.material.transition.MaterialContainerTransform.2
                            @Override // com.google.android.material.transition.TransitionListenerAdapter, qa.t
                            public final void a(v vVar) {
                                viewA.getOverlay().add(transitionDrawable);
                                view2.setAlpha(CropImageView.DEFAULT_ASPECT_RATIO);
                                view3.setAlpha(CropImageView.DEFAULT_ASPECT_RATIO);
                            }

                            @Override // com.google.android.material.transition.TransitionListenerAdapter, qa.t
                            public final void c(v vVar) {
                                MaterialContainerTransform materialContainerTransform = MaterialContainerTransform.this;
                                materialContainerTransform.E(this);
                                materialContainerTransform.getClass();
                                view2.setAlpha(1.0f);
                                view3.setAlpha(1.0f);
                                viewA.getOverlay().remove(transitionDrawable);
                            }
                        });
                        return valueAnimatorOfFloat;
                    }
                }
            }
        }
        return null;
    }

    @Override // qa.v
    public final String[] u() {
        return f15919q0;
    }
}
