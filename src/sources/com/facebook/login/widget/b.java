package com.facebook.login.widget;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.lingodeer.R;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.m;
import lf.i0;
import uf.i;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7737a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WeakReference f7738b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f7739c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ToolTipPopup$PopupContentView f7740d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public PopupWindow f7741e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public i f7742f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f7743g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final a f7744h;

    /* JADX WARN: Type inference failed for: r1v5, types: [com.facebook.login.widget.a] */
    public b(String str, LoginButton loginButton) {
        this.f7737a = str;
        this.f7738b = new WeakReference(loginButton);
        Context context = loginButton.getContext();
        m.e(context, "anchor.context");
        this.f7739c = context;
        this.f7742f = i.BLUE;
        this.f7743g = 6000L;
        this.f7744h = new ViewTreeObserver.OnScrollChangedListener() { // from class: com.facebook.login.widget.a
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public final void onScrollChanged() {
                PopupWindow popupWindow;
                b bVar = this.f7736a;
                if (qf.a.b(b.class)) {
                    return;
                }
                try {
                    if (bVar.f7738b.get() == null || (popupWindow = bVar.f7741e) == null || !popupWindow.isShowing()) {
                        return;
                    }
                    if (popupWindow.isAboveAnchor()) {
                        ToolTipPopup$PopupContentView toolTipPopup$PopupContentView = bVar.f7740d;
                        if (toolTipPopup$PopupContentView != null) {
                            toolTipPopup$PopupContentView.f7732a.setVisibility(4);
                            toolTipPopup$PopupContentView.f7733b.setVisibility(0);
                            return;
                        }
                        return;
                    }
                    ToolTipPopup$PopupContentView toolTipPopup$PopupContentView2 = bVar.f7740d;
                    if (toolTipPopup$PopupContentView2 != null) {
                        toolTipPopup$PopupContentView2.f7732a.setVisibility(0);
                        toolTipPopup$PopupContentView2.f7733b.setVisibility(4);
                    }
                } catch (Throwable th2) {
                    qf.a.a(b.class, th2);
                }
            }
        };
    }

    public final void a() {
        if (qf.a.b(this)) {
            return;
        }
        try {
            c();
            PopupWindow popupWindow = this.f7741e;
            if (popupWindow != null) {
                popupWindow.dismiss();
            }
        } catch (Throwable th2) {
            qf.a.a(this, th2);
        }
    }

    public final void b() {
        ViewTreeObserver viewTreeObserver;
        Context context = this.f7739c;
        WeakReference weakReference = this.f7738b;
        if (qf.a.b(this)) {
            return;
        }
        try {
            if (weakReference.get() != null) {
                ToolTipPopup$PopupContentView toolTipPopup$PopupContentView = new ToolTipPopup$PopupContentView(context);
                ImageView imageView = toolTipPopup$PopupContentView.f7735d;
                ImageView imageView2 = toolTipPopup$PopupContentView.f7732a;
                ImageView imageView3 = toolTipPopup$PopupContentView.f7733b;
                View view = toolTipPopup$PopupContentView.f7734c;
                this.f7740d = toolTipPopup$PopupContentView;
                View viewFindViewById = toolTipPopup$PopupContentView.findViewById(R.id.com_facebook_tooltip_bubble_view_text_body);
                m.d(viewFindViewById, "null cannot be cast to non-null type android.widget.TextView");
                ((TextView) viewFindViewById).setText(this.f7737a);
                if (this.f7742f == i.BLUE) {
                    view.setBackgroundResource(2131231282);
                    imageView3.setImageResource(2131231283);
                    imageView2.setImageResource(2131231284);
                    imageView.setImageResource(2131231285);
                } else {
                    view.setBackgroundResource(2131231278);
                    imageView3.setImageResource(2131231279);
                    imageView2.setImageResource(2131231280);
                    imageView.setImageResource(2131231281);
                }
                View decorView = ((Activity) context).getWindow().getDecorView();
                m.e(decorView, "window.decorView");
                int width = decorView.getWidth();
                int height = decorView.getHeight();
                if (!qf.a.b(this)) {
                    try {
                        c();
                        View view2 = (View) weakReference.get();
                        if (view2 != null && (viewTreeObserver = view2.getViewTreeObserver()) != null) {
                            viewTreeObserver.addOnScrollChangedListener(this.f7744h);
                        }
                    } catch (Throwable th2) {
                        qf.a.a(this, th2);
                    }
                }
                toolTipPopup$PopupContentView.measure(View.MeasureSpec.makeMeasureSpec(width, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(height, Integer.MIN_VALUE));
                PopupWindow popupWindow = new PopupWindow(toolTipPopup$PopupContentView, toolTipPopup$PopupContentView.getMeasuredWidth(), toolTipPopup$PopupContentView.getMeasuredHeight());
                this.f7741e = popupWindow;
                popupWindow.showAsDropDown((View) weakReference.get());
                if (!qf.a.b(this)) {
                    try {
                        PopupWindow popupWindow2 = this.f7741e;
                        if (popupWindow2 != null && popupWindow2.isShowing()) {
                            if (popupWindow2.isAboveAnchor()) {
                                ToolTipPopup$PopupContentView toolTipPopup$PopupContentView2 = this.f7740d;
                                if (toolTipPopup$PopupContentView2 != null) {
                                    toolTipPopup$PopupContentView2.f7732a.setVisibility(4);
                                    toolTipPopup$PopupContentView2.f7733b.setVisibility(0);
                                }
                            } else {
                                ToolTipPopup$PopupContentView toolTipPopup$PopupContentView3 = this.f7740d;
                                if (toolTipPopup$PopupContentView3 != null) {
                                    toolTipPopup$PopupContentView3.f7732a.setVisibility(0);
                                    toolTipPopup$PopupContentView3.f7733b.setVisibility(4);
                                }
                            }
                        }
                    } catch (Throwable th3) {
                        qf.a.a(this, th3);
                    }
                }
                long j11 = this.f7743g;
                if (j11 > 0) {
                    toolTipPopup$PopupContentView.postDelayed(new i0(this, 14), j11);
                }
                popupWindow.setTouchable(true);
                toolTipPopup$PopupContentView.setOnClickListener(new aj.b(this, 23));
            }
        } catch (Throwable th4) {
            qf.a.a(this, th4);
        }
    }

    public final void c() {
        ViewTreeObserver viewTreeObserver;
        if (qf.a.b(this)) {
            return;
        }
        try {
            View view = (View) this.f7738b.get();
            if (view == null || (viewTreeObserver = view.getViewTreeObserver()) == null) {
                return;
            }
            viewTreeObserver.removeOnScrollChangedListener(this.f7744h);
        } catch (Throwable th2) {
            qf.a.a(this, th2);
        }
    }
}
