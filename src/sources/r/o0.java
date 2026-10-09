package r;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.widget.TextView;
import com.yalantis.ucrop.view.CropImageView;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import qp.m4;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextView f48605a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public k2 f48606b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public k2 f48607c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public k2 f48608d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public k2 f48609e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public k2 f48610f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public k2 f48611g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public k2 f48612h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final w0 f48613i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f48614j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f48615k = -1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Typeface f48616l;
    public boolean m;

    public o0(TextView textView) {
        this.f48605a = textView;
        this.f48613i = new w0(textView);
    }

    public static k2 c(Context context, s sVar, int i11) {
        ColorStateList colorStateListF;
        synchronized (sVar) {
            colorStateListF = sVar.f48642a.f(context, i11);
        }
        if (colorStateListF == null) {
            return null;
        }
        k2 k2Var = new k2();
        k2Var.f48596b = true;
        k2Var.f48597c = colorStateListF;
        return k2Var;
    }

    public final void a(Drawable drawable, k2 k2Var) {
        if (drawable == null || k2Var == null) {
            return;
        }
        s.e(drawable, k2Var, this.f48605a.getDrawableState());
    }

    public final void b() {
        k2 k2Var = this.f48606b;
        TextView textView = this.f48605a;
        if (k2Var != null || this.f48607c != null || this.f48608d != null || this.f48609e != null) {
            Drawable[] compoundDrawables = textView.getCompoundDrawables();
            a(compoundDrawables[0], this.f48606b);
            a(compoundDrawables[1], this.f48607c);
            a(compoundDrawables[2], this.f48608d);
            a(compoundDrawables[3], this.f48609e);
        }
        if (this.f48610f == null && this.f48611g == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
        a(compoundDrawablesRelative[0], this.f48610f);
        a(compoundDrawablesRelative[2], this.f48611g);
    }

    public final ColorStateList d() {
        k2 k2Var = this.f48612h;
        if (k2Var != null) {
            return (ColorStateList) k2Var.f48597c;
        }
        return null;
    }

    public final PorterDuff.Mode e() {
        k2 k2Var = this.f48612h;
        if (k2Var != null) {
            return (PorterDuff.Mode) k2Var.f48598d;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:227:0x03a1  */
    /* JADX WARN: Code duplicated, block: B:229:0x03a6  */
    /* JADX WARN: Code duplicated, block: B:232:0x03ad A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:233:0x03af  */
    /* JADX WARN: Code duplicated, block: B:235:0x03b4  */
    /* JADX WARN: Code duplicated, block: B:237:0x03ba  */
    /* JADX WARN: Code duplicated, block: B:239:0x03be  */
    /* JADX WARN: Code duplicated, block: B:242:? A[RETURN, SYNTHETIC] */
    public final void f(AttributeSet attributeSet, int i11) {
        boolean z11;
        boolean z12;
        String string;
        String string2;
        int i12;
        float dimensionPixelSize;
        int i13;
        ColorStateList colorStateList;
        int resourceId;
        int i14;
        int resourceId2;
        TextView textView = this.f48605a;
        Context context = textView.getContext();
        s sVarA = s.a();
        int[] iArr = k.a.f37407i;
        m4 m4VarK = m4.k(context, attributeSet, iArr, i11);
        z4.s0.p(textView, textView.getContext(), iArr, attributeSet, (TypedArray) m4VarK.f48061c, i11);
        TypedArray typedArray = (TypedArray) m4VarK.f48061c;
        int resourceId3 = typedArray.getResourceId(0, -1);
        if (typedArray.hasValue(3)) {
            this.f48606b = c(context, sVarA, typedArray.getResourceId(3, 0));
        }
        if (typedArray.hasValue(1)) {
            this.f48607c = c(context, sVarA, typedArray.getResourceId(1, 0));
        }
        if (typedArray.hasValue(4)) {
            this.f48608d = c(context, sVarA, typedArray.getResourceId(4, 0));
        }
        if (typedArray.hasValue(2)) {
            this.f48609e = c(context, sVarA, typedArray.getResourceId(2, 0));
        }
        if (typedArray.hasValue(5)) {
            this.f48610f = c(context, sVarA, typedArray.getResourceId(5, 0));
        }
        if (typedArray.hasValue(6)) {
            this.f48611g = c(context, sVarA, typedArray.getResourceId(6, 0));
        }
        m4VarK.l();
        boolean z13 = textView.getTransformationMethod() instanceof PasswordTransformationMethod;
        int[] iArr2 = k.a.f37423z;
        if (resourceId3 != -1) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(resourceId3, iArr2);
            m4 m4Var = new m4(context, typedArrayObtainStyledAttributes);
            if (z13 || !typedArrayObtainStyledAttributes.hasValue(14)) {
                z11 = false;
                z12 = false;
            } else {
                z12 = typedArrayObtainStyledAttributes.getBoolean(14, false);
                z11 = true;
            }
            m(context, m4Var);
            int i15 = Build.VERSION.SDK_INT;
            string2 = typedArrayObtainStyledAttributes.hasValue(15) ? typedArrayObtainStyledAttributes.getString(15) : null;
            string = (i15 < 26 || !typedArrayObtainStyledAttributes.hasValue(13)) ? null : typedArrayObtainStyledAttributes.getString(13);
            m4Var.l();
        } else {
            z11 = false;
            z12 = false;
            string = null;
            string2 = null;
        }
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i11, 0);
        m4 m4Var2 = new m4(context, typedArrayObtainStyledAttributes2);
        if (!z13 && typedArrayObtainStyledAttributes2.hasValue(14)) {
            z12 = typedArrayObtainStyledAttributes2.getBoolean(14, false);
            z11 = true;
        }
        boolean z14 = z12;
        int i16 = Build.VERSION.SDK_INT;
        if (typedArrayObtainStyledAttributes2.hasValue(15)) {
            string2 = typedArrayObtainStyledAttributes2.getString(15);
        }
        if (i16 >= 26 && typedArrayObtainStyledAttributes2.hasValue(13)) {
            string = typedArrayObtainStyledAttributes2.getString(13);
        }
        if (i16 >= 28 && typedArrayObtainStyledAttributes2.hasValue(0) && typedArrayObtainStyledAttributes2.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, CropImageView.DEFAULT_ASPECT_RATIO);
        }
        m(context, m4Var2);
        m4Var2.l();
        if (!z13 && z11) {
            textView.setAllCaps(z14);
        }
        Typeface typeface = this.f48616l;
        if (typeface != null) {
            if (this.f48615k == -1) {
                textView.setTypeface(typeface, this.f48614j);
            } else {
                textView.setTypeface(typeface);
            }
        }
        if (string != null) {
            m0.d(textView, string);
        }
        if (string2 != null) {
            l0.b(textView, l0.a(string2));
        }
        w0 w0Var = this.f48613i;
        Context context2 = w0Var.f48693j;
        int[] iArr3 = k.a.f37408j;
        TypedArray typedArrayObtainStyledAttributes3 = context2.obtainStyledAttributes(attributeSet, iArr3, i11, 0);
        TextView textView2 = w0Var.f48692i;
        z4.s0.p(textView2, textView2.getContext(), iArr3, attributeSet, typedArrayObtainStyledAttributes3, i11);
        if (typedArrayObtainStyledAttributes3.hasValue(5)) {
            w0Var.f48684a = typedArrayObtainStyledAttributes3.getInt(5, 0);
        }
        float dimension = typedArrayObtainStyledAttributes3.hasValue(4) ? typedArrayObtainStyledAttributes3.getDimension(4, -1.0f) : -1.0f;
        float dimension2 = typedArrayObtainStyledAttributes3.hasValue(2) ? typedArrayObtainStyledAttributes3.getDimension(2, -1.0f) : -1.0f;
        float dimension3 = typedArrayObtainStyledAttributes3.hasValue(1) ? typedArrayObtainStyledAttributes3.getDimension(1, -1.0f) : -1.0f;
        if (typedArrayObtainStyledAttributes3.hasValue(3) && (resourceId2 = typedArrayObtainStyledAttributes3.getResourceId(3, 0)) > 0) {
            TypedArray typedArrayObtainTypedArray = typedArrayObtainStyledAttributes3.getResources().obtainTypedArray(resourceId2);
            int length = typedArrayObtainTypedArray.length();
            int[] iArr4 = new int[length];
            if (length > 0) {
                for (int i17 = 0; i17 < length; i17++) {
                    iArr4[i17] = typedArrayObtainTypedArray.getDimensionPixelSize(i17, -1);
                }
                w0Var.f48689f = w0.b(iArr4);
                w0Var.h();
            }
            typedArrayObtainTypedArray.recycle();
        }
        typedArrayObtainStyledAttributes3.recycle();
        if (!w0Var.i()) {
            w0Var.f48684a = 0;
        } else if (w0Var.f48684a == 1) {
            if (!w0Var.f48690g) {
                DisplayMetrics displayMetrics = context2.getResources().getDisplayMetrics();
                if (dimension2 == -1.0f) {
                    i14 = 2;
                    dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                } else {
                    i14 = 2;
                }
                if (dimension3 == -1.0f) {
                    dimension3 = TypedValue.applyDimension(i14, 112.0f, displayMetrics);
                }
                float f5 = dimension3;
                if (dimension == -1.0f) {
                    dimension = 1.0f;
                }
                w0Var.j(dimension2, f5, dimension);
            }
            w0Var.g();
        }
        if (b3.f48533c && w0Var.f48684a != 0) {
            int[] iArr5 = w0Var.f48689f;
            if (iArr5.length > 0) {
                if (m0.a(textView) != -1.0f) {
                    m0.b(textView, Math.round(w0Var.f48687d), Math.round(w0Var.f48688e), Math.round(w0Var.f48686c), 0);
                } else {
                    m0.c(textView, iArr5, 0);
                }
            }
        }
        TypedArray typedArrayObtainStyledAttributes4 = context.obtainStyledAttributes(attributeSet, iArr3);
        int resourceId4 = typedArrayObtainStyledAttributes4.getResourceId(8, -1);
        Drawable drawableB = resourceId4 != -1 ? sVarA.b(context, resourceId4) : null;
        int resourceId5 = typedArrayObtainStyledAttributes4.getResourceId(13, -1);
        Drawable drawableB2 = resourceId5 != -1 ? sVarA.b(context, resourceId5) : null;
        int resourceId6 = typedArrayObtainStyledAttributes4.getResourceId(9, -1);
        Drawable drawableB3 = resourceId6 != -1 ? sVarA.b(context, resourceId6) : null;
        int resourceId7 = typedArrayObtainStyledAttributes4.getResourceId(6, -1);
        Drawable drawableB4 = resourceId7 != -1 ? sVarA.b(context, resourceId7) : null;
        int resourceId8 = typedArrayObtainStyledAttributes4.getResourceId(10, -1);
        Drawable drawableB5 = resourceId8 != -1 ? sVarA.b(context, resourceId8) : null;
        int resourceId9 = typedArrayObtainStyledAttributes4.getResourceId(7, -1);
        Drawable drawableB6 = resourceId9 != -1 ? sVarA.b(context, resourceId9) : null;
        if (drawableB5 != null || drawableB6 != null) {
            Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
            if (drawableB5 == null) {
                drawableB5 = compoundDrawablesRelative[0];
            }
            if (drawableB2 == null) {
                drawableB2 = compoundDrawablesRelative[1];
            }
            if (drawableB6 == null) {
                drawableB6 = compoundDrawablesRelative[2];
            }
            if (drawableB4 == null) {
                drawableB4 = compoundDrawablesRelative[3];
            }
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawableB5, drawableB2, drawableB6, drawableB4);
        } else if (drawableB != null || drawableB2 != null || drawableB3 != null || drawableB4 != null) {
            Drawable[] compoundDrawablesRelative2 = textView.getCompoundDrawablesRelative();
            Drawable drawable = compoundDrawablesRelative2[0];
            if (drawable == null && compoundDrawablesRelative2[2] == null) {
                Drawable[] compoundDrawables = textView.getCompoundDrawables();
                if (drawableB == null) {
                    drawableB = compoundDrawables[0];
                }
                if (drawableB2 == null) {
                    drawableB2 = compoundDrawables[1];
                }
                if (drawableB3 == null) {
                    drawableB3 = compoundDrawables[2];
                }
                if (drawableB4 == null) {
                    drawableB4 = compoundDrawables[3];
                }
                textView.setCompoundDrawablesWithIntrinsicBounds(drawableB, drawableB2, drawableB3, drawableB4);
            } else {
                if (drawableB2 == null) {
                    drawableB2 = compoundDrawablesRelative2[1];
                }
                if (drawableB4 == null) {
                    drawableB4 = compoundDrawablesRelative2[3];
                }
                textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawableB2, compoundDrawablesRelative2[2], drawableB4);
            }
        }
        if (typedArrayObtainStyledAttributes4.hasValue(11)) {
            if (!typedArrayObtainStyledAttributes4.hasValue(11) || (resourceId = typedArrayObtainStyledAttributes4.getResourceId(11, 0)) == 0 || (colorStateList = o4.c.b(context, resourceId)) == null) {
                colorStateList = typedArrayObtainStyledAttributes4.getColorStateList(11);
            }
            textView.setCompoundDrawableTintList(colorStateList);
        }
        if (typedArrayObtainStyledAttributes4.hasValue(12)) {
            textView.setCompoundDrawableTintMode(c1.c(typedArrayObtainStyledAttributes4.getInt(12, -1), null));
        }
        int dimensionPixelSize2 = typedArrayObtainStyledAttributes4.getDimensionPixelSize(15, -1);
        int dimensionPixelSize3 = typedArrayObtainStyledAttributes4.getDimensionPixelSize(18, -1);
        if (typedArrayObtainStyledAttributes4.hasValue(19)) {
            TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes4.peekValue(19);
            if (typedValuePeekValue == null || typedValuePeekValue.type != 5) {
                i12 = -1;
                dimensionPixelSize = typedArrayObtainStyledAttributes4.getDimensionPixelSize(19, -1);
            } else {
                int i18 = typedValuePeekValue.data;
                int i19 = i18 & 15;
                dimensionPixelSize = TypedValue.complexToFloat(i18);
                i13 = i19;
                i12 = -1;
            }
            typedArrayObtainStyledAttributes4.recycle();
            if (dimensionPixelSize2 != i12) {
                v10.c.H(textView, dimensionPixelSize2);
            }
            if (dimensionPixelSize3 != i12) {
                v10.c.I(textView, dimensionPixelSize3);
            }
            if (dimensionPixelSize != -1.0f) {
                if (i13 == i12) {
                    v10.c.J(textView, (int) dimensionPixelSize);
                } else if (Build.VERSION.SDK_INT >= 34) {
                    a5.b.o(textView, i13, dimensionPixelSize);
                } else {
                    v10.c.J(textView, Math.round(TypedValue.applyDimension(i13, dimensionPixelSize, textView.getResources().getDisplayMetrics())));
                }
            }
        }
        i12 = -1;
        dimensionPixelSize = -1.0f;
        i13 = i12;
        typedArrayObtainStyledAttributes4.recycle();
        if (dimensionPixelSize2 != i12) {
            v10.c.H(textView, dimensionPixelSize2);
        }
        if (dimensionPixelSize3 != i12) {
            v10.c.I(textView, dimensionPixelSize3);
        }
        if (dimensionPixelSize != -1.0f) {
            if (i13 == i12) {
                v10.c.J(textView, (int) dimensionPixelSize);
            } else if (Build.VERSION.SDK_INT >= 34) {
                a5.b.o(textView, i13, dimensionPixelSize);
            } else {
                v10.c.J(textView, Math.round(TypedValue.applyDimension(i13, dimensionPixelSize, textView.getResources().getDisplayMetrics())));
            }
        }
    }

    public final void g(Context context, int i11) {
        String string;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i11, k.a.f37423z);
        m4 m4Var = new m4(context, typedArrayObtainStyledAttributes);
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(14);
        TextView textView = this.f48605a;
        if (zHasValue) {
            textView.setAllCaps(typedArrayObtainStyledAttributes.getBoolean(14, false));
        }
        int i12 = Build.VERSION.SDK_INT;
        if (typedArrayObtainStyledAttributes.hasValue(0) && typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, CropImageView.DEFAULT_ASPECT_RATIO);
        }
        m(context, m4Var);
        if (i12 >= 26 && typedArrayObtainStyledAttributes.hasValue(13) && (string = typedArrayObtainStyledAttributes.getString(13)) != null) {
            m0.d(textView, string);
        }
        m4Var.l();
        Typeface typeface = this.f48616l;
        if (typeface != null) {
            textView.setTypeface(typeface, this.f48614j);
        }
    }

    public final void h(int i11, int i12, int i13, int i14) {
        w0 w0Var = this.f48613i;
        if (w0Var.i()) {
            DisplayMetrics displayMetrics = w0Var.f48693j.getResources().getDisplayMetrics();
            w0Var.j(TypedValue.applyDimension(i14, i11, displayMetrics), TypedValue.applyDimension(i14, i12, displayMetrics), TypedValue.applyDimension(i14, i13, displayMetrics));
            if (w0Var.g()) {
                w0Var.a();
            }
        }
    }

    public final void i(int[] iArr, int i11) {
        w0 w0Var = this.f48613i;
        if (w0Var.i()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArrCopyOf = new int[length];
                if (i11 == 0) {
                    iArrCopyOf = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = w0Var.f48693j.getResources().getDisplayMetrics();
                    for (int i12 = 0; i12 < length; i12++) {
                        iArrCopyOf[i12] = Math.round(TypedValue.applyDimension(i11, iArr[i12], displayMetrics));
                    }
                }
                w0Var.f48689f = w0.b(iArrCopyOf);
                if (!w0Var.h()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                w0Var.f48690g = false;
            }
            if (w0Var.g()) {
                w0Var.a();
            }
        }
    }

    public final void j(int i11) {
        w0 w0Var = this.f48613i;
        if (w0Var.i()) {
            if (i11 == 0) {
                w0Var.f48684a = 0;
                w0Var.f48687d = -1.0f;
                w0Var.f48688e = -1.0f;
                w0Var.f48686c = -1.0f;
                w0Var.f48689f = new int[0];
                w0Var.f48685b = false;
                return;
            }
            if (i11 != 1) {
                throw new IllegalArgumentException(nv.p.j(i11, "Unknown auto-size text type: "));
            }
            DisplayMetrics displayMetrics = w0Var.f48693j.getResources().getDisplayMetrics();
            w0Var.j(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (w0Var.g()) {
                w0Var.a();
            }
        }
    }

    public final void k(ColorStateList colorStateList) {
        if (this.f48612h == null) {
            this.f48612h = new k2();
        }
        k2 k2Var = this.f48612h;
        k2Var.f48597c = colorStateList;
        k2Var.f48596b = colorStateList != null;
        this.f48606b = k2Var;
        this.f48607c = k2Var;
        this.f48608d = k2Var;
        this.f48609e = k2Var;
        this.f48610f = k2Var;
        this.f48611g = k2Var;
    }

    public final void l(PorterDuff.Mode mode) {
        if (this.f48612h == null) {
            this.f48612h = new k2();
        }
        k2 k2Var = this.f48612h;
        k2Var.f48598d = mode;
        k2Var.f48595a = mode != null;
        this.f48606b = k2Var;
        this.f48607c = k2Var;
        this.f48608d = k2Var;
        this.f48609e = k2Var;
        this.f48610f = k2Var;
        this.f48611g = k2Var;
    }

    public final void m(Context context, m4 m4Var) {
        String string;
        int i11 = this.f48614j;
        TypedArray typedArray = (TypedArray) m4Var.f48061c;
        this.f48614j = typedArray.getInt(2, i11);
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 28) {
            int i13 = typedArray.getInt(11, -1);
            this.f48615k = i13;
            if (i13 != -1) {
                this.f48614j &= 2;
            }
        }
        if (!typedArray.hasValue(10) && !typedArray.hasValue(12)) {
            if (typedArray.hasValue(1)) {
                this.m = false;
                int i14 = typedArray.getInt(1, 1);
                if (i14 == 1) {
                    this.f48616l = Typeface.SANS_SERIF;
                    return;
                } else if (i14 == 2) {
                    this.f48616l = Typeface.SERIF;
                    return;
                } else {
                    if (i14 != 3) {
                        return;
                    }
                    this.f48616l = Typeface.MONOSPACE;
                    return;
                }
            }
            return;
        }
        this.f48616l = null;
        int i15 = typedArray.hasValue(12) ? 12 : 10;
        int i16 = this.f48615k;
        int i17 = this.f48614j;
        if (!context.isRestricted()) {
            try {
                Typeface typefaceI = m4Var.i(i15, this.f48614j, new k0(this, i16, i17, new WeakReference(this.f48605a)));
                if (typefaceI != null) {
                    if (i12 < 28 || this.f48615k == -1) {
                        this.f48616l = typefaceI;
                    } else {
                        this.f48616l = n0.a(Typeface.create(typefaceI, 0), this.f48615k, (this.f48614j & 2) != 0);
                    }
                }
                this.m = this.f48616l == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.f48616l != null || (string = typedArray.getString(i15)) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 28 || this.f48615k == -1) {
            this.f48616l = Typeface.create(string, this.f48614j);
        } else {
            this.f48616l = n0.a(Typeface.create(string, 0), this.f48615k, (this.f48614j & 2) != 0);
        }
    }
}
