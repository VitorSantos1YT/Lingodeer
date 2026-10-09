package com.google.android.material.transition.platform;

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
import android.transition.ArcMotion;
import android.transition.PathMotion;
import android.transition.PatternPathMotion;
import android.transition.Transition;
import android.transition.TransitionValues;
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
import java.util.Map;
import nv.p;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class MaterialContainerTransform extends Transition {
    public static final String[] L = {"materialContainerTransition:bounds", "materialContainerTransition:shapeAppearance"};
    public static final ProgressThresholdsGroup M = new ProgressThresholdsGroup(new ProgressThresholds(CropImageView.DEFAULT_ASPECT_RATIO, 0.25f), new ProgressThresholds(CropImageView.DEFAULT_ASPECT_RATIO, 1.0f), new ProgressThresholds(CropImageView.DEFAULT_ASPECT_RATIO, 1.0f), new ProgressThresholds(CropImageView.DEFAULT_ASPECT_RATIO, 0.75f));
    public static final ProgressThresholdsGroup N = new ProgressThresholdsGroup(new ProgressThresholds(0.6f, 0.9f), new ProgressThresholds(CropImageView.DEFAULT_ASPECT_RATIO, 1.0f), new ProgressThresholds(CropImageView.DEFAULT_ASPECT_RATIO, 0.9f), new ProgressThresholds(0.3f, 0.9f));
    public static final ProgressThresholdsGroup O = new ProgressThresholdsGroup(new ProgressThresholds(0.1f, 0.4f), new ProgressThresholds(0.1f, 1.0f), new ProgressThresholds(0.1f, 1.0f), new ProgressThresholds(0.1f, 0.9f));
    public static final ProgressThresholdsGroup P = new ProgressThresholdsGroup(new ProgressThresholds(0.6f, 0.9f), new ProgressThresholds(CropImageView.DEFAULT_ASPECT_RATIO, 0.9f), new ProgressThresholds(CropImageView.DEFAULT_ASPECT_RATIO, 0.9f), new ProgressThresholds(0.2f, 0.9f));
    public final float H;
    public final float K;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f16018a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f16019b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f16020c = R.id.content;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f16021d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f16022e = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f16023f = 1375731712;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final boolean f16024t;

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
        public final float f16031a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final float f16032b;

        public ProgressThresholds(float f5, float f11) {
            this.f16031a = f5;
            this.f16032b = f11;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class ProgressThresholdsGroup {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ProgressThresholds f16033a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ProgressThresholds f16034b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ProgressThresholds f16035c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final ProgressThresholds f16036d;

        public ProgressThresholdsGroup(ProgressThresholds progressThresholds, ProgressThresholds progressThresholds2, ProgressThresholds progressThresholds3, ProgressThresholds progressThresholds4) {
            this.f16033a = progressThresholds;
            this.f16034b = progressThresholds2;
            this.f16035c = progressThresholds3;
            this.f16036d = progressThresholds4;
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
        public final View f16037a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final RectF f16038b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ShapeAppearanceModel f16039c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final float f16040d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final View f16041e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final RectF f16042f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final ShapeAppearanceModel f16043g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final float f16044h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final Paint f16045i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final Paint f16046j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final Paint f16047k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final Paint f16048l;
        public final Paint m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final MaskEvaluator f16049n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public final PathMeasure f16050o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public final float f16051p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public final float[] f16052q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public final boolean f16053r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final float f16054s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final float f16055t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final boolean f16056u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final MaterialShapeDrawable f16057v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final RectF f16058w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public final RectF f16059x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public final RectF f16060y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public final RectF f16061z;

        public TransitionDrawable(PathMotion pathMotion, View view, RectF rectF, ShapeAppearanceModel shapeAppearanceModel, float f5, View view2, RectF rectF2, ShapeAppearanceModel shapeAppearanceModel2, float f11, int i11, boolean z11, boolean z12, FadeModeEvaluator fadeModeEvaluator, FitModeEvaluator fitModeEvaluator, ProgressThresholdsGroup progressThresholdsGroup) {
            Paint paint = new Paint();
            this.f16045i = paint;
            Paint paint2 = new Paint();
            this.f16046j = paint2;
            Paint paint3 = new Paint();
            this.f16047k = paint3;
            this.f16048l = new Paint();
            Paint paint4 = new Paint();
            this.m = paint4;
            this.f16049n = new MaskEvaluator();
            this.f16052q = new float[]{rectF.centerX(), rectF.top};
            MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable();
            this.f16057v = materialShapeDrawable;
            Paint paint5 = new Paint();
            new Path();
            this.f16037a = view;
            this.f16038b = rectF;
            this.f16039c = shapeAppearanceModel;
            this.f16040d = f5;
            this.f16041e = view2;
            this.f16042f = rectF2;
            this.f16043g = shapeAppearanceModel2;
            this.f16044h = f11;
            this.f16053r = z11;
            this.f16056u = z12;
            this.B = fadeModeEvaluator;
            this.C = fitModeEvaluator;
            this.A = progressThresholdsGroup;
            WindowManager windowManager = (WindowManager) view.getContext().getSystemService("window");
            DisplayMetrics displayMetrics = new DisplayMetrics();
            windowManager.getDefaultDisplay().getMetrics(displayMetrics);
            this.f16054s = displayMetrics.widthPixels;
            this.f16055t = displayMetrics.heightPixels;
            paint.setColor(0);
            paint2.setColor(0);
            paint3.setColor(0);
            materialShapeDrawable.r(ColorStateList.valueOf(0));
            materialShapeDrawable.v(2);
            materialShapeDrawable.Z = false;
            materialShapeDrawable.u(-7829368);
            RectF rectF3 = new RectF(rectF);
            this.f16058w = rectF3;
            this.f16059x = new RectF(rectF3);
            RectF rectF4 = new RectF(rectF3);
            this.f16060y = rectF4;
            this.f16061z = new RectF(rectF4);
            PointF pointF = new PointF(rectF.centerX(), rectF.top);
            PointF pointF2 = new PointF(rectF2.centerX(), rectF2.top);
            PathMeasure pathMeasure = new PathMeasure(pathMotion.getPath(pointF.x, pointF.y, pointF2.x, pointF2.y), false);
            this.f16050o = pathMeasure;
            this.f16051p = pathMeasure.getLength();
            paint4.setStyle(Paint.Style.FILL);
            RectF rectF5 = TransitionUtils.f16080a;
            paint4.setShader(new LinearGradient(CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, i11, i11, Shader.TileMode.CLAMP));
            paint5.setStyle(Paint.Style.STROKE);
            paint5.setStrokeWidth(10.0f);
            d(CropImageView.DEFAULT_ASPECT_RATIO);
        }

        public final void a(Canvas canvas) {
            c(canvas, this.f16047k);
            Rect bounds = getBounds();
            RectF rectF = this.f16060y;
            TransitionUtils.f(canvas, bounds, rectF.left, rectF.top, this.E.f16008b, this.D.f15989b, new CanvasCompat.CanvasOperation() { // from class: com.google.android.material.transition.platform.MaterialContainerTransform.TransitionDrawable.2
                @Override // com.google.android.material.canvas.CanvasCompat.CanvasOperation
                public final void a(Canvas canvas2) {
                    TransitionDrawable.this.f16041e.draw(canvas2);
                }
            });
        }

        public final void b(Canvas canvas) {
            c(canvas, this.f16046j);
            Rect bounds = getBounds();
            RectF rectF = this.f16058w;
            TransitionUtils.f(canvas, bounds, rectF.left, rectF.top, this.E.f16007a, this.D.f15988a, new CanvasCompat.CanvasOperation() { // from class: com.google.android.material.transition.platform.MaterialContainerTransform.TransitionDrawable.1
                @Override // com.google.android.material.canvas.CanvasCompat.CanvasOperation
                public final void a(Canvas canvas2) {
                    TransitionDrawable.this.f16037a.draw(canvas2);
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
            this.m.setAlpha((int) (this.f16053r ? TransitionUtils.c(CropImageView.DEFAULT_ASPECT_RATIO, 255.0f, f5) : TransitionUtils.c(255.0f, CropImageView.DEFAULT_ASPECT_RATIO, f5)));
            float f14 = this.f16051p;
            PathMeasure pathMeasure = this.f16050o;
            float[] fArr = this.f16052q;
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
            ProgressThresholds progressThresholds = progressThresholdsGroup.f16034b;
            ProgressThresholds progressThresholds2 = progressThresholdsGroup.f16033a;
            ProgressThresholds progressThresholds3 = progressThresholdsGroup.f16035c;
            float f19 = progressThresholds.f16031a;
            float f21 = progressThresholdsGroup.f16034b.f16032b;
            RectF rectF2 = this.f16038b;
            float fWidth = rectF2.width();
            float fHeight = rectF2.height();
            RectF rectF3 = this.f16042f;
            FitModeResult fitModeResultA = this.C.a(f5, f19, f21, fWidth, fHeight, rectF3.width(), rectF3.height());
            this.E = fitModeResultA;
            float f22 = fitModeResultA.f16009c / 2.0f;
            float f23 = fitModeResultA.f16010d + f17;
            RectF rectF4 = this.f16058w;
            rectF4.set(f18 - f22, f17, f22 + f18, f23);
            FitModeResult fitModeResult = this.E;
            float f24 = fitModeResult.f16011e / 2.0f;
            float f25 = fitModeResult.f16012f + f17;
            RectF rectF5 = this.f16060y;
            rectF5.set(f18 - f24, f17, f24 + f18, f25);
            RectF rectF6 = this.f16059x;
            rectF6.set(rectF4);
            RectF rectF7 = this.f16061z;
            rectF7.set(rectF5);
            float f26 = progressThresholds3.f16031a;
            float f27 = progressThresholds3.f16032b;
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
            ProgressThresholds progressThresholds4 = progressThresholdsGroup.f16036d;
            MaskEvaluator maskEvaluator = this.f16049n;
            Path path = maskEvaluator.f16015c;
            Path path2 = maskEvaluator.f16014b;
            ShapeAppearancePathProvider shapeAppearancePathProvider = maskEvaluator.f16016d;
            float f28 = progressThresholds4.f16031a;
            float f29 = progressThresholds4.f16032b;
            ShapeAppearanceModel shapeAppearanceModelA = this.f16039c;
            if (f5 < f28) {
                rectF = rectF7;
                f13 = f5;
            } else {
                ShapeAppearanceModel shapeAppearanceModel = this.f16043g;
                if (f5 > f29) {
                    shapeAppearanceModelA = shapeAppearanceModel;
                    rectF = rectF7;
                    f13 = f5;
                } else {
                    TransitionUtils.AnonymousClass1 anonymousClass1 = new TransitionUtils.CornerSizeBinaryOperator() { // from class: com.google.android.material.transition.platform.TransitionUtils.1

                        /* JADX INFO: renamed from: a */
                        public final /* synthetic */ RectF f16081a;

                        /* JADX INFO: renamed from: b */
                        public final /* synthetic */ RectF f16082b;

                        /* JADX INFO: renamed from: c */
                        public final /* synthetic */ float f16083c;

                        /* JADX INFO: renamed from: d */
                        public final /* synthetic */ float f16084d;

                        /* JADX INFO: renamed from: e */
                        public final /* synthetic */ float f16085e;

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
            maskEvaluator.f16017e = shapeAppearanceModelA;
            shapeAppearancePathProvider.a(shapeAppearanceModelA, rectF6, path2);
            shapeAppearancePathProvider.a(maskEvaluator.f16017e, rectF, path);
            maskEvaluator.f16013a.op(path2, path, Path.Op.UNION);
            this.G = TransitionUtils.c(this.f16040d, this.f16044h, f13);
            float fCenterX = ((this.F.centerX() / (this.f16054s / 2.0f)) - 1.0f) * 0.3f;
            float fCenterY = (this.F.centerY() / this.f16055t) * 1.5f;
            float f30 = this.G;
            float f31 = (int) (fCenterY * f30);
            this.H = f31;
            this.f16048l.setShadowLayer(f30, (int) (fCenterX * f30), f31, 754974720);
            this.D = this.B.a(f13, progressThresholds2.f16031a, progressThresholds2.f16032b);
            Paint paint = this.f16046j;
            if (paint.getColor() != 0) {
                paint.setAlpha(this.D.f15988a);
            }
            Paint paint2 = this.f16047k;
            if (paint2.getColor() != 0) {
                paint2.setAlpha(this.D.f15989b);
            }
            invalidateSelf();
        }

        @Override // android.graphics.drawable.Drawable
        public final void draw(Canvas canvas) {
            Paint paint = this.m;
            if (paint.getAlpha() > 0) {
                canvas.drawRect(getBounds(), paint);
            }
            boolean z11 = this.f16056u;
            MaskEvaluator maskEvaluator = this.f16049n;
            if (z11 && this.G > CropImageView.DEFAULT_ASPECT_RATIO) {
                canvas.save();
                canvas.clipPath(maskEvaluator.f16013a, Region.Op.DIFFERENCE);
                if (Build.VERSION.SDK_INT > 28) {
                    ShapeAppearanceModel shapeAppearanceModel = maskEvaluator.f16017e;
                    boolean zG = shapeAppearanceModel.g(this.F);
                    Paint paint2 = this.f16048l;
                    if (zG) {
                        float fA = shapeAppearanceModel.f15249e.a(this.F);
                        canvas.drawRoundRect(this.F, fA, fA, paint2);
                    } else {
                        canvas.drawPath(maskEvaluator.f16013a, paint2);
                    }
                } else {
                    RectF rectF = this.F;
                    int i11 = (int) rectF.left;
                    int i12 = (int) rectF.top;
                    int i13 = (int) rectF.right;
                    int i14 = (int) rectF.bottom;
                    MaterialShapeDrawable materialShapeDrawable = this.f16057v;
                    materialShapeDrawable.setBounds(i11, i12, i13, i14);
                    materialShapeDrawable.q(this.G);
                    materialShapeDrawable.w((int) this.H);
                    materialShapeDrawable.setShapeAppearanceModel(maskEvaluator.f16017e);
                    materialShapeDrawable.draw(canvas);
                }
                canvas.restore();
            }
            canvas.clipPath(maskEvaluator.f16013a);
            c(canvas, this.f16045i);
            if (this.D.f15990c) {
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
        this.f16024t = Build.VERSION.SDK_INT >= 28;
        this.H = -1.0f;
        this.K = -1.0f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void a(TransitionValues transitionValues, int i11) {
        final RectF rectFB;
        ShapeAppearanceModel shapeAppearanceModel;
        if (i11 != -1) {
            View view = transitionValues.view;
            RectF rectF = TransitionUtils.f16080a;
            View viewFindViewById = view.findViewById(i11);
            if (viewFindViewById == null) {
                viewFindViewById = TransitionUtils.a(view, i11);
            }
            transitionValues.view = viewFindViewById;
        } else if (transitionValues.view.getTag(com.lingodeer.R.id.mtrl_motion_snapshot_view) instanceof View) {
            View view2 = (View) transitionValues.view.getTag(com.lingodeer.R.id.mtrl_motion_snapshot_view);
            transitionValues.view.setTag(com.lingodeer.R.id.mtrl_motion_snapshot_view, null);
            transitionValues.view = view2;
        }
        View view3 = transitionValues.view;
        if (!view3.isLaidOut() && view3.getWidth() == 0 && view3.getHeight() == 0) {
            return;
        }
        if (view3.getParent() == null) {
            RectF rectF2 = TransitionUtils.f16080a;
            rectFB = new RectF(view3.getLeft(), view3.getTop(), view3.getRight(), view3.getBottom());
        } else {
            rectFB = TransitionUtils.b(view3);
        }
        transitionValues.values.put("materialContainerTransition:bounds", rectFB);
        Map map = transitionValues.values;
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
        map.put("materialContainerTransition:shapeAppearance", shapeAppearanceModel.i(new ShapeAppearanceModel.CornerSizeUnaryOperator() { // from class: com.google.android.material.transition.platform.a
            @Override // com.google.android.material.shape.ShapeAppearanceModel.CornerSizeUnaryOperator
            public final CornerSize b(CornerSize cornerSize) {
                RectF rectF3 = TransitionUtils.f16080a;
                if (cornerSize instanceof RelativeCornerSize) {
                    return (RelativeCornerSize) cornerSize;
                }
                RectF rectF4 = rectFB;
                return new RelativeCornerSize(cornerSize.a(rectF4) / Math.min(rectF4.width(), rectF4.height()));
            }
        }));
    }

    @Override // android.transition.Transition
    public final void captureEndValues(TransitionValues transitionValues) {
        a(transitionValues, this.f16022e);
    }

    @Override // android.transition.Transition
    public final void captureStartValues(TransitionValues transitionValues) {
        a(transitionValues, this.f16021d);
    }

    /* JADX WARN: Code duplicated, block: B:50:0x0104  */
    @Override // android.transition.Transition
    public final Animator createAnimator(ViewGroup viewGroup, TransitionValues transitionValues, TransitionValues transitionValues2) {
        View viewA;
        View view;
        RectF rectF;
        PathMotion pathMotion;
        ProgressThresholdsGroup progressThresholdsGroup;
        PathMotion patternPathMotion;
        int iC;
        if (transitionValues == null || transitionValues2 == null) {
            return null;
        }
        RectF rectF2 = (RectF) transitionValues.values.get("materialContainerTransition:bounds");
        ShapeAppearanceModel shapeAppearanceModel = (ShapeAppearanceModel) transitionValues.values.get("materialContainerTransition:shapeAppearance");
        if (rectF2 == null || shapeAppearanceModel == null) {
            return null;
        }
        RectF rectF3 = (RectF) transitionValues2.values.get("materialContainerTransition:bounds");
        ShapeAppearanceModel shapeAppearanceModel2 = (ShapeAppearanceModel) transitionValues2.values.get("materialContainerTransition:shapeAppearance");
        if (rectF3 == null || shapeAppearanceModel2 == null) {
            return null;
        }
        final View view2 = transitionValues.view;
        final View view3 = transitionValues2.view;
        View view4 = view3.getParent() != null ? view3 : view2;
        int id2 = view4.getId();
        int i11 = this.f16020c;
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
        if (getInterpolator() == null) {
            setInterpolator(MotionUtils.d(context, com.lingodeer.R.attr.motionEasingEmphasizedInterpolator, aVar));
        }
        int i12 = z11 ? com.lingodeer.R.attr.motionDurationLong2 : com.lingodeer.R.attr.motionDurationMedium4;
        if (getDuration() != -1 || (iC = MotionUtils.c(context, i12, -1)) == -1) {
            pathMotion = null;
        } else {
            pathMotion = null;
            setDuration(iC);
        }
        if (!this.f16019b) {
            TypedValue typedValue = new TypedValue();
            if (context.getTheme().resolveAttribute(com.lingodeer.R.attr.motionPath, typedValue, true)) {
                int i13 = typedValue.type;
                if (i13 == 16) {
                    int i14 = typedValue.data;
                    if (i14 == 0) {
                        patternPathMotion = pathMotion;
                    } else {
                        if (i14 != 1) {
                            throw new IllegalArgumentException(p.j(i14, "Invalid motion path type: "));
                        }
                        patternPathMotion = new MaterialArcMotion();
                    }
                } else {
                    if (i13 != 3) {
                        throw new IllegalArgumentException("Motion path theme attribute must either be an enum value or path data string");
                    }
                    patternPathMotion = new PatternPathMotion(j3.n(String.valueOf(typedValue.string)));
                }
            } else {
                patternPathMotion = pathMotion;
            }
            if (patternPathMotion != null) {
                setPathMotion(patternPathMotion);
            }
        }
        PathMotion pathMotion2 = getPathMotion();
        float elevation = this.H;
        if (elevation == -1.0f) {
            elevation = view2.getElevation();
        }
        float f12 = elevation;
        float elevation2 = this.K;
        if (elevation2 == -1.0f) {
            elevation2 = view3.getElevation();
        }
        float f13 = elevation2;
        FadeModeEvaluator fadeModeEvaluator = z11 ? FadeModeEvaluators.f15986a : FadeModeEvaluators.f15987b;
        FitModeEvaluators.AnonymousClass1 anonymousClass1 = FitModeEvaluators.f16005a;
        FitModeEvaluators.AnonymousClass2 anonymousClass2 = FitModeEvaluators.f16006b;
        float fWidth = rectF2.width();
        float fHeight = rectF2.height();
        float fWidth2 = rectF3.width();
        float fHeight2 = rectF3.height();
        FitModeEvaluator fitModeEvaluator = (!z11 ? (fWidth2 * fHeight) / fWidth >= fHeight2 : (fHeight2 * fWidth) / fWidth2 >= fHeight) ? anonymousClass2 : anonymousClass1;
        PathMotion pathMotion3 = getPathMotion();
        if ((pathMotion3 instanceof ArcMotion) || (pathMotion3 instanceof MaterialArcMotion)) {
            ProgressThresholdsGroup progressThresholdsGroup2 = z11 ? O : P;
            progressThresholdsGroup = new ProgressThresholdsGroup(progressThresholdsGroup2.f16033a, progressThresholdsGroup2.f16034b, progressThresholdsGroup2.f16035c, progressThresholdsGroup2.f16036d);
        } else {
            ProgressThresholdsGroup progressThresholdsGroup3 = z11 ? M : N;
            progressThresholdsGroup = new ProgressThresholdsGroup(progressThresholdsGroup3.f16033a, progressThresholdsGroup3.f16034b, progressThresholdsGroup3.f16035c, progressThresholdsGroup3.f16036d);
        }
        final TransitionDrawable transitionDrawable = new TransitionDrawable(pathMotion2, view2, rectF2, shapeAppearanceModel, f12, view3, rectF3, shapeAppearanceModel2, f13, this.f16023f, z11, this.f16024t, fadeModeEvaluator, fitModeEvaluator, progressThresholdsGroup);
        transitionDrawable.setBounds(Math.round(rectF.left), Math.round(rectF.top), Math.round(rectF.right), Math.round(rectF.bottom));
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(CropImageView.DEFAULT_ASPECT_RATIO, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.transition.platform.MaterialContainerTransform.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                float animatedFraction = valueAnimator.getAnimatedFraction();
                TransitionDrawable transitionDrawable2 = transitionDrawable;
                if (transitionDrawable2.I != animatedFraction) {
                    transitionDrawable2.d(animatedFraction);
                }
            }
        });
        final View view5 = viewA;
        addListener(new TransitionListenerAdapter() { // from class: com.google.android.material.transition.platform.MaterialContainerTransform.2
            @Override // com.google.android.material.transition.platform.TransitionListenerAdapter, android.transition.Transition.TransitionListener
            public final void onTransitionEnd(Transition transition) {
                MaterialContainerTransform materialContainerTransform = MaterialContainerTransform.this;
                materialContainerTransform.removeListener(this);
                if (materialContainerTransform.f16018a) {
                    return;
                }
                view2.setAlpha(1.0f);
                view3.setAlpha(1.0f);
                view5.getOverlay().remove(transitionDrawable);
            }

            @Override // com.google.android.material.transition.platform.TransitionListenerAdapter, android.transition.Transition.TransitionListener
            public final void onTransitionStart(Transition transition) {
                view5.getOverlay().add(transitionDrawable);
                view2.setAlpha(CropImageView.DEFAULT_ASPECT_RATIO);
                view3.setAlpha(CropImageView.DEFAULT_ASPECT_RATIO);
            }
        });
        return valueAnimatorOfFloat;
    }

    @Override // android.transition.Transition
    public final String[] getTransitionProperties() {
        return L;
    }

    @Override // android.transition.Transition
    public final void setPathMotion(PathMotion pathMotion) {
        super.setPathMotion(pathMotion);
        this.f16019b = true;
    }
}
