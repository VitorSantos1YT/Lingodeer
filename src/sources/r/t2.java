package r;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.Toolbar;
import com.lingodeer.R;
import qp.m4;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class t2 implements z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Toolbar f48654a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f48655b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final View f48656c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Drawable f48657d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Drawable f48658e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Drawable f48659f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f48660g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public CharSequence f48661h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final CharSequence f48662i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final CharSequence f48663j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Window.Callback f48664k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f48665l;
    public androidx.appcompat.widget.c m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f48666n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Drawable f48667o;

    public t2(Toolbar toolbar, boolean z11) {
        Drawable drawable;
        this.f48666n = 0;
        this.f48654a = toolbar;
        this.f48661h = toolbar.getTitle();
        this.f48662i = toolbar.getSubtitle();
        this.f48660g = this.f48661h != null;
        this.f48659f = toolbar.getNavigationIcon();
        m4 m4VarK = m4.k(toolbar.getContext(), null, k.a.f37399a, R.attr.actionBarStyle);
        TypedArray typedArray = (TypedArray) m4VarK.f48061c;
        int i11 = 15;
        this.f48667o = m4VarK.g(15);
        if (z11) {
            CharSequence text = typedArray.getText(27);
            if (!TextUtils.isEmpty(text)) {
                this.f48660g = true;
                this.f48661h = text;
                if ((this.f48655b & 8) != 0) {
                    toolbar.setTitle(text);
                    if (this.f48660g) {
                        z4.s0.r(toolbar.getRootView(), text);
                    }
                }
            }
            CharSequence text2 = typedArray.getText(25);
            if (!TextUtils.isEmpty(text2)) {
                this.f48662i = text2;
                if ((this.f48655b & 8) != 0) {
                    toolbar.setSubtitle(text2);
                }
            }
            Drawable drawableG = m4VarK.g(20);
            if (drawableG != null) {
                this.f48658e = drawableG;
                c();
            }
            Drawable drawableG2 = m4VarK.g(17);
            if (drawableG2 != null) {
                this.f48657d = drawableG2;
                c();
            }
            if (this.f48659f == null && (drawable = this.f48667o) != null) {
                this.f48659f = drawable;
                if ((this.f48655b & 4) != 0) {
                    toolbar.setNavigationIcon(drawable);
                } else {
                    toolbar.setNavigationIcon((Drawable) null);
                }
            }
            a(typedArray.getInt(10, 0));
            int resourceId = typedArray.getResourceId(9, 0);
            if (resourceId != 0) {
                View viewInflate = LayoutInflater.from(toolbar.getContext()).inflate(resourceId, (ViewGroup) toolbar, false);
                View view = this.f48656c;
                if (view != null && (this.f48655b & 16) != 0) {
                    toolbar.removeView(view);
                }
                this.f48656c = viewInflate;
                if (viewInflate != null && (this.f48655b & 16) != 0) {
                    toolbar.addView(viewInflate);
                }
                a(this.f48655b | 16);
            }
            int layoutDimension = typedArray.getLayoutDimension(13, 0);
            if (layoutDimension > 0) {
                ViewGroup.LayoutParams layoutParams = toolbar.getLayoutParams();
                layoutParams.height = layoutDimension;
                toolbar.setLayoutParams(layoutParams);
            }
            int dimensionPixelOffset = typedArray.getDimensionPixelOffset(7, -1);
            int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(3, -1);
            if (dimensionPixelOffset >= 0 || dimensionPixelOffset2 >= 0) {
                int iMax = Math.max(dimensionPixelOffset, 0);
                int iMax2 = Math.max(dimensionPixelOffset2, 0);
                toolbar.d();
                toolbar.V.a(iMax, iMax2);
            }
            int resourceId2 = typedArray.getResourceId(28, 0);
            if (resourceId2 != 0) {
                Context context = toolbar.getContext();
                toolbar.N = resourceId2;
                AppCompatTextView appCompatTextView = toolbar.f1030b;
                if (appCompatTextView != null) {
                    appCompatTextView.setTextAppearance(context, resourceId2);
                }
            }
            int resourceId3 = typedArray.getResourceId(26, 0);
            if (resourceId3 != 0) {
                Context context2 = toolbar.getContext();
                toolbar.O = resourceId3;
                AppCompatTextView appCompatTextView2 = toolbar.f1032c;
                if (appCompatTextView2 != null) {
                    appCompatTextView2.setTextAppearance(context2, resourceId3);
                }
            }
            int resourceId4 = typedArray.getResourceId(22, 0);
            if (resourceId4 != 0) {
                toolbar.setPopupTheme(resourceId4);
            }
        } else {
            if (toolbar.getNavigationIcon() != null) {
                this.f48667o = toolbar.getNavigationIcon();
            } else {
                i11 = 11;
            }
            this.f48655b = i11;
        }
        m4VarK.l();
        if (R.string.abc_action_bar_up_description != this.f48666n) {
            this.f48666n = R.string.abc_action_bar_up_description;
            if (TextUtils.isEmpty(toolbar.getNavigationContentDescription())) {
                int i12 = this.f48666n;
                this.f48663j = i12 != 0 ? toolbar.getContext().getString(i12) : null;
                b();
            }
        }
        this.f48663j = toolbar.getNavigationContentDescription();
        toolbar.setNavigationOnClickListener(new s2(this));
    }

    public final void a(int i11) {
        View view;
        int i12 = this.f48655b ^ i11;
        this.f48655b = i11;
        if (i12 != 0) {
            int i13 = i12 & 4;
            Toolbar toolbar = this.f48654a;
            if (i13 != 0) {
                if ((i11 & 4) != 0) {
                    b();
                }
                if ((this.f48655b & 4) != 0) {
                    Drawable drawable = this.f48659f;
                    if (drawable == null) {
                        drawable = this.f48667o;
                    }
                    toolbar.setNavigationIcon(drawable);
                } else {
                    toolbar.setNavigationIcon((Drawable) null);
                }
            }
            if ((i12 & 3) != 0) {
                c();
            }
            if ((i12 & 8) != 0) {
                if ((i11 & 8) != 0) {
                    toolbar.setTitle(this.f48661h);
                    toolbar.setSubtitle(this.f48662i);
                } else {
                    toolbar.setTitle((CharSequence) null);
                    toolbar.setSubtitle((CharSequence) null);
                }
            }
            if ((i12 & 16) == 0 || (view = this.f48656c) == null) {
                return;
            }
            if ((i11 & 16) != 0) {
                toolbar.addView(view);
            } else {
                toolbar.removeView(view);
            }
        }
    }

    public final void b() {
        if ((this.f48655b & 4) != 0) {
            boolean zIsEmpty = TextUtils.isEmpty(this.f48663j);
            Toolbar toolbar = this.f48654a;
            if (zIsEmpty) {
                toolbar.setNavigationContentDescription(this.f48666n);
            } else {
                toolbar.setNavigationContentDescription(this.f48663j);
            }
        }
    }

    public final void c() {
        Drawable drawable;
        int i11 = this.f48655b;
        if ((i11 & 2) == 0) {
            drawable = null;
        } else if ((i11 & 1) == 0 || (drawable = this.f48658e) == null) {
            drawable = this.f48657d;
        }
        this.f48654a.setLogo(drawable);
    }
}
