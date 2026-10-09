package com.facebook.login.widget;

import android.content.Context;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import bq.f;
import com.bumptech.glide.d;
import com.facebook.FacebookButtonBase;
import com.lingodeer.R;
import com.yalantis.ucrop.view.CropImageView;
import i.j;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.UUID;
import kotlin.jvm.internal.m;
import ns.o;
import qy.h;
import ry.l;
import ry.r;
import se.n;
import tf.b0;
import tf.d0;
import tf.h0;
import tf.j0;
import tf.s;
import uf.c;
import uf.e;
import uf.g;
import uf.i;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class LoginButton extends FacebookButtonBase {

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final /* synthetic */ int f7721d0 = 0;
    public boolean L;
    public String M;
    public String N;
    public final uf.b O;
    public boolean P;
    public i Q;
    public e R;
    public long S;
    public b T;
    public f U;
    public h V;
    public Float W;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public int f7722a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final String f7723b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public i.h f7724c0;

    public LoginButton(Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, "fb_login_button_create", "fb_login_button_did_tap");
        uf.b bVar = new uf.b();
        bVar.f52948a = tf.e.FRIENDS;
        bVar.f52949b = r.f50854a;
        bVar.f52950c = s.NATIVE_WITH_FALLBACK;
        bVar.f52951d = "rerequest";
        bVar.f52952e = h0.FACEBOOK;
        this.O = bVar;
        this.Q = i.BLUE;
        e.Companion.getClass();
        this.R = e.DEFAULT;
        this.S = 6000L;
        this.V = d.v(g.f52957a);
        this.f7722a0 = 255;
        String string = UUID.randomUUID().toString();
        m.e(string, "randomUUID().toString()");
        this.f7723b0 = string;
    }

    @Override // com.facebook.FacebookButtonBase
    public final void a(Context context, AttributeSet attributeSet, int i11, int i12) {
        if (qf.a.b(this)) {
            return;
        }
        try {
            m.f(context, "context");
            super.a(context, attributeSet, i11, i12);
            setInternalOnClickListener(getNewLoginClickListener());
            j(context, attributeSet, i11, i12);
            if (isInEditMode()) {
                setBackgroundColor(getResources().getColor(R.color.com_facebook_blue));
                setLoginText("Continue with Facebook");
            } else {
                this.U = new f(this);
            }
            m();
            l();
            if (!qf.a.b(this)) {
                try {
                    getBackground().setAlpha(this.f7722a0);
                } catch (Throwable th2) {
                    qf.a.a(this, th2);
                }
            }
            k();
        } catch (Throwable th3) {
            qf.a.a(this, th3);
        }
    }

    public final void g() {
        if (qf.a.b(this)) {
            return;
        }
        try {
            int i11 = uf.f.f52956a[this.R.ordinal()];
            if (i11 == 1) {
                if (getContext() == null) {
                    throw new NullPointerException("Argument 'context' cannot be null");
                }
                re.s.d().execute(new pb.b(13, re.s.b(), this));
                return;
            }
            if (i11 != 2) {
                return;
            }
            String string = getResources().getString(R.string.com_facebook_tooltip_default);
            m.e(string, "resources.getString(R.st…facebook_tooltip_default)");
            h(string);
        } catch (Throwable th2) {
            qf.a.a(this, th2);
        }
    }

    public final String getAuthType() {
        return this.O.f52951d;
    }

    public final re.m getCallbackManager() {
        return null;
    }

    public final tf.e getDefaultAudience() {
        return this.O.f52948a;
    }

    @Override // com.facebook.FacebookButtonBase
    public int getDefaultRequestCode() {
        if (qf.a.b(this)) {
            return 0;
        }
        try {
            return lf.i.Login.a();
        } catch (Throwable th2) {
            qf.a.a(this, th2);
            return 0;
        }
    }

    @Override // com.facebook.FacebookButtonBase
    public int getDefaultStyleResource() {
        return R.style.com_facebook_loginview_default_style;
    }

    public final String getLoggerID() {
        return this.f7723b0;
    }

    public final s getLoginBehavior() {
        return this.O.f52950c;
    }

    public final int getLoginButtonContinueLabel() {
        return R.string.com_facebook_loginview_log_in_button_continue;
    }

    public final h getLoginManagerLazy() {
        return this.V;
    }

    public final h0 getLoginTargetApp() {
        return this.O.f52952e;
    }

    public final String getLoginText() {
        return this.M;
    }

    public final String getLogoutText() {
        return this.N;
    }

    public final String getMessengerPageId() {
        return this.O.f52953f;
    }

    public c getNewLoginClickListener() {
        return new c(this);
    }

    public final List<String> getPermissions() {
        return this.O.f52949b;
    }

    public final uf.b getProperties() {
        return this.O;
    }

    public final boolean getResetMessengerState() {
        return this.O.f52954g;
    }

    public final boolean getShouldSkipAccountDeduplication() {
        this.O.getClass();
        return false;
    }

    public final long getToolTipDisplayTime() {
        return this.S;
    }

    public final e getToolTipMode() {
        return this.R;
    }

    public final i getToolTipStyle() {
        return this.Q;
    }

    public final void h(String str) {
        if (qf.a.b(this)) {
            return;
        }
        try {
            b bVar = new b(str, this);
            i style = this.Q;
            if (!qf.a.b(bVar)) {
                try {
                    m.f(style, "style");
                    bVar.f7742f = style;
                } catch (Throwable th2) {
                    qf.a.a(bVar, th2);
                }
            }
            long j11 = this.S;
            if (!qf.a.b(bVar)) {
                try {
                    bVar.f7743g = j11;
                } catch (Throwable th3) {
                    qf.a.a(bVar, th3);
                }
            }
            bVar.b();
            this.T = bVar;
        } catch (Throwable th4) {
            qf.a.a(this, th4);
        }
    }

    public final int i(String str) {
        if (qf.a.b(this)) {
            return 0;
        }
        try {
            return getCompoundPaddingLeft() + getCompoundDrawablePadding() + b(str) + getCompoundPaddingRight();
        } catch (Throwable th2) {
            qf.a.a(this, th2);
            return 0;
        }
    }

    public final void j(Context context, AttributeSet attributeSet, int i11, int i12) {
        e eVar;
        if (qf.a.b(this)) {
            return;
        }
        try {
            m.f(context, "context");
            uf.d dVar = e.Companion;
            dVar.getClass();
            this.R = e.DEFAULT;
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, j0.f52189a, i11, i12);
            m.e(typedArrayObtainStyledAttributes, "context\n            .the…efStyleAttr, defStyleRes)");
            try {
                this.L = typedArrayObtainStyledAttributes.getBoolean(0, true);
                setLoginText(typedArrayObtainStyledAttributes.getString(3));
                setLogoutText(typedArrayObtainStyledAttributes.getString(4));
                dVar.getClass();
                int i13 = typedArrayObtainStyledAttributes.getInt(5, e.DEFAULT.b());
                dVar.getClass();
                e[] eVarArrValues = e.values();
                int length = eVarArrValues.length;
                int i14 = 0;
                while (true) {
                    if (i14 >= length) {
                        eVar = null;
                        break;
                    }
                    eVar = eVarArrValues[i14];
                    if (eVar.b() == i13) {
                        break;
                    } else {
                        i14++;
                    }
                }
                if (eVar == null) {
                    e.Companion.getClass();
                    eVar = e.DEFAULT;
                }
                this.R = eVar;
                if (typedArrayObtainStyledAttributes.hasValue(1)) {
                    this.W = Float.valueOf(typedArrayObtainStyledAttributes.getDimension(1, CropImageView.DEFAULT_ASPECT_RATIO));
                }
                int integer = typedArrayObtainStyledAttributes.getInteger(2, 255);
                this.f7722a0 = integer;
                int iMax = Math.max(0, integer);
                this.f7722a0 = iMax;
                this.f7722a0 = Math.min(255, iMax);
            } finally {
                typedArrayObtainStyledAttributes.recycle();
            }
        } catch (Throwable th2) {
            qf.a.a(this, th2);
        }
    }

    public final void k() {
        if (qf.a.b(this)) {
            return;
        }
        try {
            setCompoundDrawablesWithIntrinsicBounds(jh.h.k(getContext(), R.drawable.com_facebook_button_icon), (Drawable) null, (Drawable) null, (Drawable) null);
        } catch (Throwable th2) {
            qf.a.a(this, th2);
        }
    }

    public final void l() {
        if (qf.a.b(this)) {
            return;
        }
        try {
            Float f5 = this.W;
            if (f5 != null) {
                float fFloatValue = f5.floatValue();
                Drawable background = getBackground();
                if (Build.VERSION.SDK_INT >= 29 && (background instanceof StateListDrawable)) {
                    int stateCount = ((StateListDrawable) background).getStateCount();
                    for (int i11 = 0; i11 < stateCount; i11++) {
                        Drawable stateDrawable = ((StateListDrawable) background).getStateDrawable(i11);
                        GradientDrawable gradientDrawable = stateDrawable instanceof GradientDrawable ? (GradientDrawable) stateDrawable : null;
                        if (gradientDrawable != null) {
                            gradientDrawable.setCornerRadius(fFloatValue);
                        }
                    }
                }
                if (background instanceof GradientDrawable) {
                    ((GradientDrawable) background).setCornerRadius(fFloatValue);
                }
            }
        } catch (Throwable th2) {
            qf.a.a(this, th2);
        }
    }

    public final void m() {
        if (qf.a.b(this)) {
            return;
        }
        try {
            Resources resources = getResources();
            if (!isInEditMode()) {
                Date date = re.b.N;
                if (o.F()) {
                    String string = this.N;
                    if (string == null) {
                        string = resources.getString(R.string.com_facebook_loginview_log_out_button);
                    }
                    setText(string);
                    return;
                }
            }
            String str = this.M;
            if (str != null) {
                setText(str);
                return;
            }
            String string2 = resources.getString(getLoginButtonContinueLabel());
            m.e(string2, "resources.getString(loginButtonContinueLabel)");
            int width = getWidth();
            if (width != 0 && i(string2) > width) {
                string2 = resources.getString(R.string.com_facebook_loginview_log_in_button);
                m.e(string2, "resources.getString(R.st…_loginview_log_in_button)");
            }
            setText(string2);
        } catch (Throwable th2) {
            qf.a.a(this, th2);
        }
    }

    @Override // com.facebook.FacebookButtonBase, android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        boolean z11;
        if (qf.a.b(this)) {
            return;
        }
        try {
            super.onAttachedToWindow();
            if (getContext() instanceof j) {
                Object context = getContext();
                m.d(context, "null cannot be cast to non-null type androidx.activity.result.ActivityResultRegistryOwner");
                i.i activityResultRegistry = ((j) context).getActivityResultRegistry();
                d0 d0Var = (d0) this.V.getValue();
                String str = this.f7723b0;
                d0Var.getClass();
                this.f7724c0 = activityResultRegistry.d("facebook-login", new b0(d0Var, str), new n(18));
            }
            f fVar = this.U;
            if (fVar == null || !(z11 = fVar.f4943a)) {
                return;
            }
            if (!z11) {
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED");
                ((x6.b) fVar.f4945c).b((lf.e) fVar.f4944b, intentFilter);
                fVar.f4943a = true;
            }
            m();
        } catch (Throwable th2) {
            qf.a.a(this, th2);
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        if (qf.a.b(this)) {
            return;
        }
        try {
            super.onDetachedFromWindow();
            i.h hVar = this.f7724c0;
            if (hVar != null) {
                hVar.b();
            }
            f fVar = this.U;
            if (fVar != null && fVar.f4943a) {
                ((x6.b) fVar.f4945c).d((lf.e) fVar.f4944b);
                fVar.f4943a = false;
            }
            b bVar = this.T;
            if (bVar != null) {
                bVar.a();
            }
            this.T = null;
        } catch (Throwable th2) {
            qf.a.a(this, th2);
        }
    }

    @Override // com.facebook.FacebookButtonBase, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        if (qf.a.b(this)) {
            return;
        }
        try {
            m.f(canvas, "canvas");
            super.onDraw(canvas);
            if (this.P || isInEditMode()) {
                return;
            }
            this.P = true;
            g();
        } catch (Throwable th2) {
            qf.a.a(this, th2);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        if (qf.a.b(this)) {
            return;
        }
        try {
            super.onLayout(z11, i11, i12, i13, i14);
            try {
                m();
            } catch (Throwable th2) {
                th = th2;
                qf.a.a(this, th);
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i11, int i12) {
        if (qf.a.b(this)) {
            return;
        }
        try {
            Paint.FontMetrics fontMetrics = getPaint().getFontMetrics();
            int compoundPaddingTop = getCompoundPaddingTop() + ((int) Math.ceil(Math.abs(fontMetrics.top) + Math.abs(fontMetrics.bottom))) + getCompoundPaddingBottom();
            Resources resources = getResources();
            int i13 = 0;
            if (!qf.a.b(this)) {
                try {
                    Resources resources2 = getResources();
                    String string = this.M;
                    if (string == null) {
                        string = resources2.getString(R.string.com_facebook_loginview_log_in_button_continue);
                        int i14 = i(string);
                        if (View.resolveSize(i14, i11) < i14) {
                            string = resources2.getString(R.string.com_facebook_loginview_log_in_button);
                        }
                    }
                    i13 = i(string);
                } catch (Throwable th2) {
                    qf.a.a(this, th2);
                }
            }
            String string2 = this.N;
            if (string2 == null) {
                string2 = resources.getString(R.string.com_facebook_loginview_log_out_button);
                m.e(string2, "resources.getString(R.st…loginview_log_out_button)");
            }
            setMeasuredDimension(View.resolveSize(Math.max(i13, i(string2)), i11), compoundPaddingTop);
        } catch (Throwable th3) {
            qf.a.a(this, th3);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onVisibilityChanged(View changedView, int i11) {
        if (qf.a.b(this)) {
            return;
        }
        try {
            m.f(changedView, "changedView");
            super.onVisibilityChanged(changedView, i11);
            if (i11 != 0) {
                b bVar = this.T;
                if (bVar != null) {
                    bVar.a();
                }
                this.T = null;
            }
        } catch (Throwable th2) {
            qf.a.a(this, th2);
        }
    }

    public final void setAuthType(String value) {
        m.f(value, "value");
        uf.b bVar = this.O;
        bVar.getClass();
        bVar.f52951d = value;
    }

    public final void setDefaultAudience(tf.e value) {
        m.f(value, "value");
        uf.b bVar = this.O;
        bVar.getClass();
        bVar.f52948a = value;
    }

    public final void setLoginBehavior(s value) {
        m.f(value, "value");
        uf.b bVar = this.O;
        bVar.getClass();
        bVar.f52950c = value;
    }

    public final void setLoginManagerLazy(h hVar) {
        m.f(hVar, "<set-?>");
        this.V = hVar;
    }

    public final void setLoginTargetApp(h0 value) {
        m.f(value, "value");
        uf.b bVar = this.O;
        bVar.getClass();
        bVar.f52952e = value;
    }

    public final void setLoginText(String str) {
        this.M = str;
        m();
    }

    public final void setLogoutText(String str) {
        this.N = str;
        m();
    }

    public final void setMessengerPageId(String str) {
        this.O.f52953f = str;
    }

    public final void setPermissions(String... permissions) {
        m.f(permissions, "permissions");
        Object[] elements = Arrays.copyOf(permissions, permissions.length);
        m.f(elements, "elements");
        ArrayList arrayListT = l.T(elements);
        uf.b bVar = this.O;
        bVar.getClass();
        bVar.f52949b = arrayListT;
    }

    @qy.c
    public final void setPublishPermissions(List<String> permissions) {
        m.f(permissions, "permissions");
        uf.b bVar = this.O;
        bVar.getClass();
        bVar.f52949b = permissions;
    }

    @qy.c
    public final void setReadPermissions(List<String> permissions) {
        m.f(permissions, "permissions");
        uf.b bVar = this.O;
        bVar.getClass();
        bVar.f52949b = permissions;
    }

    public final void setResetMessengerState(boolean z11) {
        this.O.f52954g = z11;
    }

    public final void setToolTipDisplayTime(long j11) {
        this.S = j11;
    }

    public final void setToolTipMode(e eVar) {
        m.f(eVar, "<set-?>");
        this.R = eVar;
    }

    public final void setToolTipStyle(i iVar) {
        m.f(iVar, "<set-?>");
        this.Q = iVar;
    }

    @qy.c
    public final void setPublishPermissions(String... permissions) {
        m.f(permissions, "permissions");
        Object[] elements = Arrays.copyOf(permissions, permissions.length);
        m.f(elements, "elements");
        ArrayList arrayListT = l.T(elements);
        uf.b bVar = this.O;
        bVar.getClass();
        bVar.f52949b = arrayListT;
    }

    @qy.c
    public final void setReadPermissions(String... permissions) {
        m.f(permissions, "permissions");
        Object[] elements = Arrays.copyOf(permissions, permissions.length);
        m.f(elements, "elements");
        ArrayList arrayListT = l.T(elements);
        uf.b bVar = this.O;
        bVar.getClass();
        bVar.f52949b = arrayListT;
    }

    public final void setPermissions(List<String> value) {
        m.f(value, "value");
        uf.b bVar = this.O;
        bVar.getClass();
        bVar.f52949b = value;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LoginButton(Context context) {
        this(context, null, 0, 0);
        m.f(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LoginButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0);
        m.f(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LoginButton(Context context, AttributeSet attributeSet, int i11) {
        this(context, attributeSet, i11, 0);
        m.f(context, "context");
    }
}
