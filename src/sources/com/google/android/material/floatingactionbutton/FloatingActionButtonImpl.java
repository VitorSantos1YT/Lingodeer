package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.FloatEvaluator;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.Property;
import android.view.View;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.animation.AnimatorSetCompat;
import com.google.android.material.animation.ImageMatrixProperty;
import com.google.android.material.animation.MatrixEvaluator;
import com.google.android.material.animation.MotionSpec;
import com.google.android.material.motion.MotionUtils;
import com.google.android.material.shadow.ShadowViewDelegate;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.shape.Shapeable;
import com.lingodeer.R;
import com.yalantis.ucrop.view.CropImageView;
import java.util.ArrayList;
import ns.o;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
class FloatingActionButtonImpl {
    public static final r6.a B = AnimationUtils.f13770c;
    public static final int C = R.attr.motionDurationLong2;
    public static final int D = R.attr.motionEasingEmphasizedInterpolator;
    public static final int E = R.attr.motionDurationMedium1;
    public static final int F = R.attr.motionEasingEmphasizedAccelerateInterpolator;
    public static final int[] G = {android.R.attr.state_pressed, android.R.attr.state_enabled};
    public static final int[] H = {android.R.attr.state_hovered, android.R.attr.state_focused, android.R.attr.state_enabled};
    public static final int[] I = {android.R.attr.state_focused, android.R.attr.state_enabled};
    public static final int[] J = {android.R.attr.state_hovered, android.R.attr.state_enabled};
    public static final int[] K = {android.R.attr.state_enabled};
    public static final int[] L = new int[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ShapeAppearanceModel f14531a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public MaterialShapeDrawable f14532b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public RippleDrawable f14533c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public BorderDrawable f14534d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public RippleDrawable f14535e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f14536f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f14538h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f14539i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f14540j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f14541k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public StateListAnimator f14542l;
    public Animator m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public MotionSpec f14543n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public MotionSpec f14544o;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f14546q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public ArrayList f14548s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public ArrayList f14549t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public ArrayList f14550u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final FloatingActionButton f14551v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final ShadowViewDelegate f14552w;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f14537g = true;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f14545p = 1.0f;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f14547r = 0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Rect f14553x = new Rect();

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final RectF f14554y = new RectF();

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final RectF f14555z = new RectF();
    public final Matrix A = new Matrix();

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class AlwaysStatefulMaterialShapeDrawable extends MaterialShapeDrawable {
        @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
        public final boolean isStateful() {
            return true;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public interface InternalTransformationCallback {
        void a();

        void b();
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public interface InternalVisibilityChangedListener {
        void a();

        void b();
    }

    public FloatingActionButtonImpl(FloatingActionButton floatingActionButton, ShadowViewDelegate shadowViewDelegate) {
        this.f14551v = floatingActionButton;
        this.f14552w = shadowViewDelegate;
    }

    public final void a(float f5, Matrix matrix) {
        matrix.reset();
        Drawable drawable = this.f14551v.getDrawable();
        if (drawable == null || this.f14546q == 0) {
            return;
        }
        float intrinsicWidth = drawable.getIntrinsicWidth();
        float intrinsicHeight = drawable.getIntrinsicHeight();
        RectF rectF = this.f14554y;
        rectF.set(CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, intrinsicWidth, intrinsicHeight);
        float f11 = this.f14546q;
        RectF rectF2 = this.f14555z;
        rectF2.set(CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, f11, f11);
        matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
        float f12 = this.f14546q / 2.0f;
        matrix.postScale(f5, f5, f12, f12);
    }

    public final AnimatorSet b(MotionSpec motionSpec, float f5, float f11, float f12) {
        ArrayList arrayList = new ArrayList();
        Property property = View.ALPHA;
        float[] fArr = {f5};
        FloatingActionButton floatingActionButton = this.f14551v;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) property, fArr);
        motionSpec.f("opacity").a(objectAnimatorOfFloat);
        arrayList.add(objectAnimatorOfFloat);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) View.SCALE_X, f11);
        motionSpec.f("scale").a(objectAnimatorOfFloat2);
        int i11 = Build.VERSION.SDK_INT;
        if (i11 == 26) {
            objectAnimatorOfFloat2.setEvaluator(new TypeEvaluator<Float>() { // from class: com.google.android.material.floatingactionbutton.FloatingActionButtonImpl.4

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final FloatEvaluator f14564a = new FloatEvaluator();

                @Override // android.animation.TypeEvaluator
                public final Float evaluate(float f13, Float f14, Float f15) {
                    float fFloatValue = this.f14564a.evaluate(f13, (Number) f14, (Number) f15).floatValue();
                    if (fFloatValue < 0.1f) {
                        fFloatValue = CropImageView.DEFAULT_ASPECT_RATIO;
                    }
                    return Float.valueOf(fFloatValue);
                }
            });
        }
        arrayList.add(objectAnimatorOfFloat2);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) View.SCALE_Y, f11);
        motionSpec.f("scale").a(objectAnimatorOfFloat3);
        if (i11 == 26) {
            objectAnimatorOfFloat3.setEvaluator(new TypeEvaluator<Float>() { // from class: com.google.android.material.floatingactionbutton.FloatingActionButtonImpl.4

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final FloatEvaluator f14564a = new FloatEvaluator();

                @Override // android.animation.TypeEvaluator
                public final Float evaluate(float f13, Float f14, Float f15) {
                    float fFloatValue = this.f14564a.evaluate(f13, (Number) f14, (Number) f15).floatValue();
                    if (fFloatValue < 0.1f) {
                        fFloatValue = CropImageView.DEFAULT_ASPECT_RATIO;
                    }
                    return Float.valueOf(fFloatValue);
                }
            });
        }
        arrayList.add(objectAnimatorOfFloat3);
        Matrix matrix = this.A;
        a(f12, matrix);
        ObjectAnimator objectAnimatorOfObject = ObjectAnimator.ofObject(floatingActionButton, new ImageMatrixProperty(), new MatrixEvaluator() { // from class: com.google.android.material.floatingactionbutton.FloatingActionButtonImpl.3
            @Override // com.google.android.material.animation.MatrixEvaluator, android.animation.TypeEvaluator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Matrix evaluate(float f13, Matrix matrix2, Matrix matrix3) {
                FloatingActionButtonImpl.this.f14545p = f13;
                return super.evaluate(f13, matrix2, matrix3);
            }
        }, new Matrix(matrix));
        motionSpec.f("iconScale").a(objectAnimatorOfObject);
        arrayList.add(objectAnimatorOfObject);
        AnimatorSet animatorSet = new AnimatorSet();
        AnimatorSetCompat.a(animatorSet, arrayList);
        return animatorSet;
    }

    public final AnimatorSet c(final float f5, final float f11, final float f12, int i11, int i12) {
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(CropImageView.DEFAULT_ASPECT_RATIO, 1.0f);
        FloatingActionButton floatingActionButton = this.f14551v;
        final float alpha = floatingActionButton.getAlpha();
        final float scaleX = floatingActionButton.getScaleX();
        final float scaleY = floatingActionButton.getScaleY();
        final float f13 = this.f14545p;
        final Matrix matrix = new Matrix(this.A);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.floatingactionbutton.a
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                r6.a aVar = FloatingActionButtonImpl.B;
                FloatingActionButtonImpl floatingActionButtonImpl = this.f14565a;
                floatingActionButtonImpl.getClass();
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                FloatingActionButton floatingActionButton2 = floatingActionButtonImpl.f14551v;
                floatingActionButton2.setAlpha(AnimationUtils.b(alpha, f5, CropImageView.DEFAULT_ASPECT_RATIO, 0.2f, fFloatValue));
                float f14 = scaleX;
                float f15 = f11;
                floatingActionButton2.setScaleX(AnimationUtils.a(f14, f15, fFloatValue));
                floatingActionButton2.setScaleY(AnimationUtils.a(scaleY, f15, fFloatValue));
                float f16 = f13;
                float f17 = f12;
                floatingActionButtonImpl.f14545p = AnimationUtils.a(f16, f17, fFloatValue);
                float fA = AnimationUtils.a(f16, f17, fFloatValue);
                Matrix matrix2 = matrix;
                floatingActionButtonImpl.a(fA, matrix2);
                floatingActionButton2.setImageMatrix(matrix2);
            }
        });
        arrayList.add(valueAnimatorOfFloat);
        AnimatorSetCompat.a(animatorSet, arrayList);
        animatorSet.setDuration(MotionUtils.c(floatingActionButton.getContext(), i11, floatingActionButton.getContext().getResources().getInteger(R.integer.material_motion_duration_long_1)));
        animatorSet.setInterpolator(MotionUtils.d(floatingActionButton.getContext(), i12, AnimationUtils.f13769b));
        return animatorSet;
    }

    public final AnimatorSet d(float f5, float f11) {
        AnimatorSet animatorSet = new AnimatorSet();
        float[] fArr = {f5};
        FloatingActionButton floatingActionButton = this.f14551v;
        animatorSet.play(ObjectAnimator.ofFloat(floatingActionButton, "elevation", fArr).setDuration(0L)).with(ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) View.TRANSLATION_Z, f11).setDuration(100L));
        animatorSet.setInterpolator(B);
        return animatorSet;
    }

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
    public final void e(float f5, float f11, float f12) {
        int i11 = Build.VERSION.SDK_INT;
        FloatingActionButton floatingActionButton = this.f14551v;
        if (floatingActionButton.getStateListAnimator() == this.f14542l) {
            StateListAnimator stateListAnimator = new StateListAnimator();
            stateListAnimator.addState(G, d(f5, f12));
            stateListAnimator.addState(H, d(f5, f11));
            stateListAnimator.addState(I, d(f5, f11));
            stateListAnimator.addState(J, d(f5, f11));
            AnimatorSet animatorSet = new AnimatorSet();
            ArrayList arrayList = new ArrayList();
            arrayList.add(ObjectAnimator.ofFloat(floatingActionButton, "elevation", f5).setDuration(0L));
            if (i11 <= 24) {
                arrayList.add(ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) View.TRANSLATION_Z, floatingActionButton.getTranslationZ()).setDuration(100L));
            }
            arrayList.add(ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) View.TRANSLATION_Z, CropImageView.DEFAULT_ASPECT_RATIO).setDuration(100L));
            animatorSet.playSequentially((Animator[]) arrayList.toArray(new Animator[0]));
            animatorSet.setInterpolator(B);
            stateListAnimator.addState(K, animatorSet);
            stateListAnimator.addState(L, d(CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO));
            this.f14542l = stateListAnimator;
            floatingActionButton.setStateListAnimator(stateListAnimator);
        }
        if (FloatingActionButton.this.M || (this.f14536f && floatingActionButton.getSizeDimension() < this.f14541k)) {
            h();
        }
    }

    public final void f() {
        ArrayList arrayList = this.f14550u;
        if (arrayList != null) {
            int size = arrayList.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList.get(i11);
                i11++;
                ((InternalTransformationCallback) obj).a();
            }
        }
    }

    public final void g(ShapeAppearanceModel shapeAppearanceModel) {
        this.f14531a = shapeAppearanceModel;
        MaterialShapeDrawable materialShapeDrawable = this.f14532b;
        if (materialShapeDrawable != null) {
            materialShapeDrawable.setShapeAppearanceModel(shapeAppearanceModel);
        }
        Drawable.Callback callback = this.f14533c;
        if (callback instanceof Shapeable) {
            ((Shapeable) callback).setShapeAppearanceModel(shapeAppearanceModel);
        }
        BorderDrawable borderDrawable = this.f14534d;
        if (borderDrawable != null) {
            borderDrawable.f14485o = shapeAppearanceModel;
            borderDrawable.invalidateSelf();
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0060  */
    public final void h() {
        ShadowViewDelegate shadowViewDelegate = this.f14552w;
        boolean z11 = FloatingActionButton.this.M;
        Rect rect = this.f14553x;
        FloatingActionButton floatingActionButton = this.f14551v;
        if (z11) {
            int iMax = this.f14536f ? Math.max((this.f14541k - floatingActionButton.getSizeDimension()) / 2, 0) : 0;
            float elevation = this.f14537g ? floatingActionButton.getElevation() + this.f14540j : CropImageView.DEFAULT_ASPECT_RATIO;
            int iMax2 = Math.max(iMax, (int) Math.ceil(elevation));
            int iMax3 = Math.max(iMax, (int) Math.ceil(elevation * 1.5f));
            rect.set(iMax2, iMax3, iMax2, iMax3);
        } else if (this.f14536f) {
            int sizeDimension = floatingActionButton.getSizeDimension();
            int i11 = this.f14541k;
            if (sizeDimension < i11) {
                int sizeDimension2 = (i11 - floatingActionButton.getSizeDimension()) / 2;
                rect.set(sizeDimension2, sizeDimension2, sizeDimension2, sizeDimension2);
            } else {
                rect.set(0, 0, 0, 0);
            }
        } else {
            rect.set(0, 0, 0, 0);
        }
        o.l(this.f14535e, "Didn't initialize content background");
        if (FloatingActionButton.this.M || (this.f14536f && floatingActionButton.getSizeDimension() < this.f14541k)) {
            ((FloatingActionButton.ShadowDelegateImpl) shadowViewDelegate).a(new InsetDrawable((Drawable) this.f14535e, rect.left, rect.top, rect.right, rect.bottom));
        } else {
            ((FloatingActionButton.ShadowDelegateImpl) shadowViewDelegate).a(this.f14535e);
        }
        int i12 = rect.left;
        int i13 = rect.top;
        int i14 = rect.right;
        int i15 = rect.bottom;
        FloatingActionButton floatingActionButton2 = FloatingActionButton.this;
        floatingActionButton2.N.set(i12, i13, i14, i15);
        int i16 = floatingActionButton2.K;
        floatingActionButton2.setPadding(i12 + i16, i13 + i16, i14 + i16, i15 + i16);
    }
}
