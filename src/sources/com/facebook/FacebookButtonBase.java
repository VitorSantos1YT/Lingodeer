package com.facebook;

import aj.b;
import android.app.Activity;
import android.app.Fragment;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import androidx.fragment.app.k0;
import b1.p;
import com.lingodeer.R;
import i.j;
import kotlin.jvm.internal.m;
import qf.a;
import re.i0;
import re.s;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class FacebookButtonBase extends Button {
    public static final /* synthetic */ int K = 0;
    public p H;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7708a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f7709b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public View.OnClickListener f7710c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public View.OnClickListener f7711d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f7712e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f7713f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f7714t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FacebookButtonBase(Context context, AttributeSet attributeSet, int i11, String str, String str2) {
        super(context, attributeSet, 0);
        m.f(context, "context");
        int defaultStyleResource = getDefaultStyleResource();
        a(context, attributeSet, i11, defaultStyleResource == 0 ? R.style.com_facebook_button : defaultStyleResource);
        this.f7708a = str;
        this.f7709b = str2;
        setClickable(true);
        setFocusable(true);
    }

    public void a(Context context, AttributeSet attributeSet, int i11, int i12) {
        if (a.b(this)) {
            return;
        }
        try {
            m.f(context, "context");
            c(context, attributeSet, i11, i12);
            d(context, attributeSet, i11, i12);
            e(context, attributeSet, i11, i12);
            f(context, attributeSet, i11, i12);
            if (a.b(this)) {
                return;
            }
            try {
                super.setOnClickListener(new b(this, 20));
            } catch (Throwable th2) {
                a.a(this, th2);
            }
        } catch (Throwable th3) {
            a.a(this, th3);
        }
    }

    public final int b(String str) {
        if (a.b(this)) {
            return 0;
        }
        try {
            return (int) Math.ceil(getPaint().measureText(str));
        } catch (Throwable th2) {
            a.a(this, th2);
            return 0;
        }
    }

    public final void c(Context context, AttributeSet attributeSet, int i11, int i12) {
        if (a.b(this)) {
            return;
        }
        try {
            if (isInEditMode()) {
                return;
            }
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, new int[]{android.R.attr.background}, i11, i12);
            m.e(typedArrayObtainStyledAttributes, "context.theme.obtainStyl…efStyleAttr, defStyleRes)");
            try {
                if (typedArrayObtainStyledAttributes.hasValue(0)) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
                    if (resourceId != 0) {
                        setBackgroundResource(resourceId);
                    } else {
                        setBackgroundColor(typedArrayObtainStyledAttributes.getColor(0, 0));
                    }
                } else {
                    setBackgroundColor(context.getColor(R.color.com_facebook_blue));
                }
            } finally {
                typedArrayObtainStyledAttributes.recycle();
            }
        } catch (Throwable th2) {
            a.a(this, th2);
        }
    }

    public final void d(Context context, AttributeSet attributeSet, int i11, int i12) {
        if (a.b(this)) {
            return;
        }
        try {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, new int[]{android.R.attr.drawableLeft, android.R.attr.drawableTop, android.R.attr.drawableRight, android.R.attr.drawableBottom, android.R.attr.drawablePadding}, i11, i12);
            m.e(typedArrayObtainStyledAttributes, "context.theme.obtainStyl…efStyleAttr, defStyleRes)");
            try {
                setCompoundDrawablesWithIntrinsicBounds(typedArrayObtainStyledAttributes.getResourceId(0, 0), typedArrayObtainStyledAttributes.getResourceId(1, 0), typedArrayObtainStyledAttributes.getResourceId(2, 0), typedArrayObtainStyledAttributes.getResourceId(3, 0));
                int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(4, 0);
                typedArrayObtainStyledAttributes.recycle();
                setCompoundDrawablePadding(dimensionPixelSize);
            } catch (Throwable th2) {
                typedArrayObtainStyledAttributes.recycle();
                throw th2;
            }
        } catch (Throwable th3) {
            a.a(this, th3);
        }
    }

    public final void e(Context context, AttributeSet attributeSet, int i11, int i12) {
        if (a.b(this)) {
            return;
        }
        try {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, new int[]{android.R.attr.paddingLeft, android.R.attr.paddingTop, android.R.attr.paddingRight, android.R.attr.paddingBottom}, i11, i12);
            m.e(typedArrayObtainStyledAttributes, "context.theme.obtainStyl…efStyleAttr, defStyleRes)");
            try {
                setPadding(typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0), typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0), typedArrayObtainStyledAttributes.getDimensionPixelSize(2, 0), typedArrayObtainStyledAttributes.getDimensionPixelSize(3, 0));
            } finally {
                typedArrayObtainStyledAttributes.recycle();
            }
        } catch (Throwable th2) {
            a.a(this, th2);
        }
    }

    public final void f(Context context, AttributeSet attributeSet, int i11, int i12) {
        if (a.b(this)) {
            return;
        }
        try {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, new int[]{android.R.attr.textColor}, i11, i12);
            m.e(typedArrayObtainStyledAttributes, "context.theme.obtainStyl…efStyleAttr, defStyleRes)");
            try {
                setTextColor(typedArrayObtainStyledAttributes.getColorStateList(0));
                typedArrayObtainStyledAttributes.recycle();
                TypedArray typedArrayObtainStyledAttributes2 = context.getTheme().obtainStyledAttributes(attributeSet, new int[]{android.R.attr.gravity}, i11, i12);
                m.e(typedArrayObtainStyledAttributes2, "context.theme.obtainStyl…efStyleAttr, defStyleRes)");
                try {
                    int i13 = typedArrayObtainStyledAttributes2.getInt(0, 17);
                    typedArrayObtainStyledAttributes2.recycle();
                    setGravity(i13);
                    TypedArray typedArrayObtainStyledAttributes3 = context.getTheme().obtainStyledAttributes(attributeSet, new int[]{android.R.attr.textSize, android.R.attr.textStyle, android.R.attr.text}, i11, i12);
                    m.e(typedArrayObtainStyledAttributes3, "context.theme.obtainStyl…efStyleAttr, defStyleRes)");
                    try {
                        setTextSize(0, typedArrayObtainStyledAttributes3.getDimensionPixelSize(0, 0));
                        setTypeface(Typeface.create(getTypeface(), 1));
                        String string = typedArrayObtainStyledAttributes3.getString(2);
                        typedArrayObtainStyledAttributes3.recycle();
                        setText(string);
                    } catch (Throwable th2) {
                        typedArrayObtainStyledAttributes3.recycle();
                        throw th2;
                    }
                } catch (Throwable th3) {
                    typedArrayObtainStyledAttributes2.recycle();
                    throw th3;
                }
            } catch (Throwable th4) {
                typedArrayObtainStyledAttributes.recycle();
                throw th4;
            }
        } catch (Throwable th5) {
            a.a(this, th5);
        }
    }

    public Activity getActivity() {
        if (a.b(this)) {
            return null;
        }
        try {
            Context context = getContext();
            while (!(context instanceof Activity) && (context instanceof ContextWrapper)) {
                context = ((ContextWrapper) context).getBaseContext();
            }
            if (context instanceof Activity) {
                return (Activity) context;
            }
            throw new FacebookException("Unable to get Activity.");
        } catch (Throwable th2) {
            a.a(this, th2);
            return null;
        }
    }

    public final String getAnalyticsButtonCreatedEventName() {
        if (a.b(this)) {
            return null;
        }
        try {
            return this.f7708a;
        } catch (Throwable th2) {
            a.a(this, th2);
            return null;
        }
    }

    public final String getAnalyticsButtonTappedEventName() {
        if (a.b(this)) {
            return null;
        }
        try {
            return this.f7709b;
        } catch (Throwable th2) {
            a.a(this, th2);
            return null;
        }
    }

    public final j getAndroidxActivityResultRegistryOwner() {
        if (a.b(this)) {
            return null;
        }
        try {
            ComponentCallbacks2 activity = getActivity();
            if (activity instanceof j) {
                return (j) activity;
            }
            return null;
        } catch (Throwable th2) {
            a.a(this, th2);
            return null;
        }
    }

    @Override // android.widget.TextView
    public int getCompoundPaddingLeft() {
        if (a.b(this)) {
            return 0;
        }
        try {
            return this.f7712e ? this.f7713f : super.getCompoundPaddingLeft();
        } catch (Throwable th2) {
            a.a(this, th2);
            return 0;
        }
    }

    @Override // android.widget.TextView
    public int getCompoundPaddingRight() {
        if (a.b(this)) {
            return 0;
        }
        try {
            return this.f7712e ? this.f7714t : super.getCompoundPaddingRight();
        } catch (Throwable th2) {
            a.a(this, th2);
            return 0;
        }
    }

    public abstract int getDefaultRequestCode();

    public int getDefaultStyleResource() {
        a.b(this);
        return 0;
    }

    public final k0 getFragment() {
        if (a.b(this)) {
            return null;
        }
        try {
            p pVar = this.H;
            if (pVar != null) {
                return (k0) pVar.f3800b;
            }
            return null;
        } catch (Throwable th2) {
            a.a(this, th2);
            return null;
        }
    }

    public final Fragment getNativeFragment() {
        if (a.b(this)) {
            return null;
        }
        try {
            p pVar = this.H;
            if (pVar != null) {
                return (Fragment) pVar.f3801c;
            }
            return null;
        } catch (Throwable th2) {
            a.a(this, th2);
            return null;
        }
    }

    public int getRequestCode() {
        if (a.b(this)) {
            return 0;
        }
        try {
            return getDefaultRequestCode();
        } catch (Throwable th2) {
            a.a(this, th2);
            return 0;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        if (a.b(this)) {
            return;
        }
        try {
            super.onAttachedToWindow();
            if (!isInEditMode()) {
                Context context = getContext();
                if (!a.b(this)) {
                    try {
                        se.m mVar = new se.m(context, (String) null);
                        String str = this.f7708a;
                        s sVar = s.f49201a;
                        if (i0.c()) {
                            mVar.g(str, null);
                        }
                    } catch (Throwable th2) {
                        a.a(this, th2);
                    }
                }
            }
        } catch (Throwable th3) {
            a.a(this, th3);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        if (a.b(this)) {
            return;
        }
        try {
            m.f(canvas, "canvas");
            if ((getGravity() & 1) != 0) {
                int compoundPaddingLeft = getCompoundPaddingLeft();
                int compoundPaddingRight = getCompoundPaddingRight();
                int iMin = Math.min((((getWidth() - (getCompoundDrawablePadding() + compoundPaddingLeft)) - compoundPaddingRight) - b(getText().toString())) / 2, (compoundPaddingLeft - getPaddingLeft()) / 2);
                this.f7713f = compoundPaddingLeft - iMin;
                this.f7714t = compoundPaddingRight + iMin;
                this.f7712e = true;
            }
            super.onDraw(canvas);
            this.f7712e = false;
        } catch (Throwable th2) {
            a.a(this, th2);
        }
    }

    public final void setFragment(Fragment fragment) {
        if (a.b(this)) {
            return;
        }
        try {
            m.f(fragment, "fragment");
            this.H = new p(fragment);
        } catch (Throwable th2) {
            a.a(this, th2);
        }
    }

    public void setInternalOnClickListener(View.OnClickListener onClickListener) {
        if (a.b(this)) {
            return;
        }
        try {
            this.f7711d = onClickListener;
        } catch (Throwable th2) {
            a.a(this, th2);
        }
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        if (a.b(this)) {
            return;
        }
        try {
            this.f7710c = onClickListener;
        } catch (Throwable th2) {
            a.a(this, th2);
        }
    }

    public final void setFragment(k0 fragment) {
        if (a.b(this)) {
            return;
        }
        try {
            m.f(fragment, "fragment");
            this.H = new p(fragment);
        } catch (Throwable th2) {
            a.a(this, th2);
        }
    }
}
