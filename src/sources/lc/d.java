package lc;

import android.app.Dialog;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Point;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckBox;
import com.afollestad.materialdialogs.internal.button.DialogActionButton;
import com.afollestad.materialdialogs.internal.button.DialogActionButtonLayout;
import com.afollestad.materialdialogs.internal.main.DialogLayout;
import com.afollestad.materialdialogs.internal.main.DialogTitleLayout;
import com.afollestad.materialdialogs.internal.message.DialogContentLayout;
import com.lingodeer.R;
import com.yalantis.ucrop.view.CropImageView;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.TypeCastException;
import kotlin.jvm.internal.m;
import mz.j;
import sz.xej.iFLeRCXvYCGdPW;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends Dialog {
    public final ArrayList H;
    public final ArrayList K;
    public final ArrayList L;
    public final ArrayList M;
    public final ArrayList N;
    public final Context O;
    public final f P;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f39878a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f39879b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Typeface f39880c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Typeface f39881d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Typeface f39882e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Integer f39883f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final DialogLayout f39884t;

    public d(Context context) {
        super(context, !com.bumptech.glide.g.p(context) ? R.style.MD_Dark : R.style.MD_Light);
        this.O = context;
        this.P = f.f39887a;
        this.f39878a = new LinkedHashMap();
        int i11 = 1;
        this.f39879b = true;
        this.H = new ArrayList();
        new ArrayList();
        this.K = new ArrayList();
        new ArrayList();
        this.L = new ArrayList();
        this.M = new ArrayList();
        this.N = new ArrayList();
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        if (getWindow() == null) {
            m.l();
            throw null;
        }
        m.b(layoutInflater, "layoutInflater");
        int i12 = 0;
        View viewInflate = layoutInflater.inflate(R.layout.md_dialog_base, (ViewGroup) null, false);
        if (viewInflate == null) {
            throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup");
        }
        ViewGroup viewGroup = (ViewGroup) viewInflate;
        setContentView(viewGroup);
        DialogLayout dialogLayout = (DialogLayout) viewGroup;
        DialogTitleLayout dialogTitleLayout = dialogLayout.H;
        if (dialogTitleLayout == null) {
            m.n("titleLayout");
            throw null;
        }
        dialogTitleLayout.setDialog(this);
        DialogActionButtonLayout dialogActionButtonLayout = dialogLayout.L;
        if (dialogActionButtonLayout != null) {
            dialogActionButtonLayout.setDialog(this);
        }
        this.f39884t = dialogLayout;
        this.f39880c = v10.c.i(this, Integer.valueOf(R.attr.md_font_title));
        this.f39881d = v10.c.i(this, Integer.valueOf(R.attr.md_font_body));
        this.f39882e = v10.c.i(this, Integer.valueOf(R.attr.md_font_button));
        int iA0 = ub.a.a0(this, Integer.valueOf(R.attr.md_background_color), new c(this, i11), 1);
        Window window = getWindow();
        if (window != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
        }
        c cVar = new c(this, i12);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.md_corner_radius});
        try {
            float dimension = typedArrayObtainStyledAttributes.getDimension(0, ((Float) cVar.invoke()).floatValue());
            typedArrayObtainStyledAttributes.recycle();
            dialogLayout.setCornerRadii(new float[]{dimension, dimension, dimension, dimension, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO});
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setCornerRadius(dimension);
            gradientDrawable.setColor(iA0);
            dialogLayout.setBackground(gradientDrawable);
        } catch (Throwable th2) {
            typedArrayObtainStyledAttributes.recycle();
            throw th2;
        }
    }

    public static void b(d dVar, Integer num) {
        Integer num2 = dVar.f39883f;
        boolean z11 = num2 != null && num2.intValue() == 0;
        dVar.f39883f = num;
        if (z11) {
            dVar.f();
        }
    }

    public static void c(d dVar, Integer num, String str, int i11) {
        Context context = dVar.O;
        if ((i11 & 1) != 0) {
            num = null;
        }
        String str2 = str;
        if ((i11 & 2) != 0) {
            str2 = null;
        }
        if (num == null && str2 == null) {
            throw new IllegalArgumentException("message".concat(": You must specify a resource ID or literal value"));
        }
        DialogContentLayout contentLayout = dVar.f39884t.getContentLayout();
        Typeface typeface = dVar.f39881d;
        contentLayout.a(false);
        if (contentLayout.f7426b == null) {
            ViewGroup viewGroup = contentLayout.f7425a;
            if (viewGroup == null) {
                m.l();
                throw null;
            }
            TextView textView = (TextView) LayoutInflater.from(contentLayout.getContext()).inflate(R.layout.md_dialog_stub_message, viewGroup, false);
            ViewGroup viewGroup2 = contentLayout.f7425a;
            if (viewGroup2 == null) {
                m.l();
                throw null;
            }
            viewGroup2.addView(textView);
            contentLayout.f7426b = textView;
        }
        TextView textView2 = contentLayout.f7426b;
        if (textView2 == null) {
            m.l();
            throw null;
        }
        if (textView2 != null) {
            if (typeface != null) {
                textView2.setTypeface(typeface);
            }
            vc.c.b(textView2, context, Integer.valueOf(R.attr.md_color_content), null);
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.md_line_spacing_body});
            try {
                float f5 = typedArrayObtainStyledAttributes.getFloat(0, 1.1f);
                typedArrayObtainStyledAttributes.recycle();
                textView2.setLineSpacing(CropImageView.DEFAULT_ASPECT_RATIO, f5);
                CharSequence charSequenceE = str2;
                if (str2 == null) {
                    charSequenceE = null;
                }
                if (charSequenceE == null) {
                    charSequenceE = vc.c.e(dVar, num, null, 4);
                }
                textView2.setText(charSequenceE);
            } catch (Throwable th2) {
                typedArrayObtainStyledAttributes.recycle();
                throw th2;
            }
        }
    }

    public static void d(d dVar, fz.c cVar, int i11) {
        Integer numValueOf = (i11 & 1) != 0 ? null : Integer.valueOf(R.string.cancel);
        CharSequence charSequence = (i11 & 2) != 0 ? null : "Cancel";
        if ((i11 & 4) != 0) {
            cVar = null;
        }
        if (cVar != null) {
            dVar.M.add(cVar);
        }
        DialogActionButton dialogActionButtonR = android.support.v4.media.session.a.r(dVar, h.NEGATIVE);
        if (numValueOf == null && charSequence == null && vc.a.s(dialogActionButtonR)) {
            return;
        }
        vc.a.v(dVar, dialogActionButtonR, numValueOf, charSequence, android.R.string.cancel, dVar.f39882e, 32);
    }

    public static void e(d dVar, Integer num, String str, fz.c cVar, int i11) {
        Integer num2 = (i11 & 1) != 0 ? null : num;
        String str2 = (i11 & 2) != 0 ? null : str;
        if ((i11 & 4) != 0) {
            cVar = null;
        }
        if (cVar != null) {
            dVar.L.add(cVar);
        }
        DialogActionButton dialogActionButtonR = android.support.v4.media.session.a.r(dVar, h.POSITIVE);
        if (num2 == null && str2 == null && vc.a.s(dialogActionButtonR)) {
            return;
        }
        vc.a.v(dVar, dialogActionButtonR, num2, str2, android.R.string.ok, dVar.f39882e, 32);
    }

    public final void a() {
        super.setCanceledOnTouchOutside(false);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        this.P.getClass();
        Object systemService = this.O.getSystemService("input_method");
        if (systemService == null) {
            throw new TypeCastException("null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        }
        InputMethodManager inputMethodManager = (InputMethodManager) systemService;
        View currentFocus = getCurrentFocus();
        inputMethodManager.hideSoftInputFromWindow(currentFocus != null ? currentFocus.getWindowToken() : this.f39884t.getWindowToken(), 0);
        super.dismiss();
    }

    public final void f() {
        Integer num = this.f39883f;
        Window window = getWindow();
        if (window == null) {
            m.l();
            throw null;
        }
        m.b(window, "window!!");
        this.P.getClass();
        if (num != null && num.intValue() == 0) {
            return;
        }
        window.setSoftInputMode(16);
        WindowManager windowManager = window.getWindowManager();
        if (windowManager != null) {
            Resources resources = this.O.getResources();
            Point point = new Point();
            windowManager.getDefaultDisplay().getSize(point);
            Integer numValueOf = Integer.valueOf(point.x);
            Integer numValueOf2 = Integer.valueOf(point.y);
            int iIntValue = numValueOf.intValue();
            this.f39884t.setMaxHeight(numValueOf2.intValue() - (resources.getDimensionPixelSize(R.dimen.md_dialog_vertical_margin) * 2));
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            layoutParams.copyFrom(window.getAttributes());
            layoutParams.width = Math.min(num != null ? num.intValue() : resources.getDimensionPixelSize(R.dimen.md_dialog_max_width), iIntValue - (resources.getDimensionPixelSize(R.dimen.md_dialog_horizontal_margin) * 2));
            window.setAttributes(layoutParams);
        }
    }

    @Override // android.app.Dialog
    public final void show() {
        AppCompatCheckBox checkBoxPrompt;
        f();
        Object obj = this.f39878a.get("md.custom_view_no_vertical_padding");
        if (!(obj instanceof Boolean)) {
            obj = null;
        }
        boolean zA = m.a((Boolean) obj, Boolean.TRUE);
        md.a.n(this.H, this);
        DialogLayout dialogLayout = this.f39884t;
        if (dialogLayout.getTitleLayout().b() && !zA) {
            dialogLayout.getContentLayout().c(dialogLayout.getFrameMarginVertical$core(), dialogLayout.getFrameMarginVertical$core());
        }
        DialogActionButtonLayout buttonsLayout = dialogLayout.getButtonsLayout();
        if (buttonsLayout == null || (checkBoxPrompt = buttonsLayout.getCheckBoxPrompt()) == null) {
            throw new IllegalStateException("The dialog does not have an attached buttons layout.");
        }
        if (vc.a.s(checkBoxPrompt)) {
            DialogContentLayout contentLayout = dialogLayout.getContentLayout();
            j[] jVarArr = DialogContentLayout.H;
            contentLayout.c(-1, 0);
        } else if (dialogLayout.getContentLayout().getChildCount() > 1) {
            DialogContentLayout contentLayout2 = dialogLayout.getContentLayout();
            int frameMarginVerticalLess$core = dialogLayout.getFrameMarginVerticalLess$core();
            View view = contentLayout2.f7429e;
            if (view == null) {
                view = contentLayout2.f7430f;
            }
            View view2 = view;
            if (frameMarginVerticalLess$core != -1) {
                vc.c.f(view2, 0, 0, 0, frameMarginVerticalLess$core, 7);
            }
        }
        this.P.getClass();
        super.show();
        DialogActionButton dialogActionButtonR = android.support.v4.media.session.a.r(this, h.NEGATIVE);
        if (vc.a.s(dialogActionButtonR)) {
            dialogActionButtonR.post(new e(dialogActionButtonR, 0));
            return;
        }
        DialogActionButton dialogActionButtonR2 = android.support.v4.media.session.a.r(this, h.POSITIVE);
        if (vc.a.s(dialogActionButtonR2)) {
            dialogActionButtonR2.post(new e(dialogActionButtonR2, 1));
        }
    }

    public static void g(d dVar, Integer num, String str, int i11) {
        Integer num2 = (i11 & 1) != 0 ? null : num;
        String str2 = (i11 & 2) != 0 ? null : str;
        if (num2 == null && str2 == null) {
            throw new IllegalArgumentException("title".concat(iFLeRCXvYCGdPW.GPIdFHdA));
        }
        vc.a.v(dVar, dVar.f39884t.getTitleLayout().getTitleView$core(), num2, str2, 0, dVar.f39880c, 8);
    }
}
