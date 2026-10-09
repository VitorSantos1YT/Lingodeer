package q;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Parcelable;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.widget.DropDownListView;
import com.lingodeer.R;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class a0 extends r implements PopupWindow.OnDismissListener, View.OnKeyListener {
    public final androidx.appcompat.widget.i H;
    public PopupWindow.OnDismissListener M;
    public View N;
    public View O;
    public u P;
    public ViewTreeObserver Q;
    public boolean R;
    public boolean S;
    public int T;
    public boolean V;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f47244b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l f47245c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i f47246d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f47247e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f47248f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f47249t;
    public final d K = new d(this, 1);
    public final g2.f L = new g2.f(this, 2);
    public int U = 0;

    public a0(Context context, l lVar, View view, int i11, boolean z11) {
        this.f47244b = context;
        this.f47245c = lVar;
        this.f47247e = z11;
        this.f47246d = new i(lVar, LayoutInflater.from(context), z11, R.layout.abc_popup_menu_item_layout);
        this.f47249t = i11;
        Resources resources = context.getResources();
        this.f47248f = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.N = view;
        this.H = new androidx.appcompat.widget.i(context, null, i11, 0);
        lVar.b(this, context);
    }

    @Override // q.z
    public final void a() {
        View view;
        if (b()) {
            return;
        }
        if (this.R || (view = this.N) == null) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
        this.O = view;
        androidx.appcompat.widget.i iVar = this.H;
        r.w wVar = iVar.f1095b0;
        r.w wVar2 = iVar.f1095b0;
        wVar.setOnDismissListener(this);
        iVar.R = this;
        iVar.f1093a0 = true;
        wVar2.setFocusable(true);
        View view2 = this.O;
        boolean z11 = this.Q == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.Q = viewTreeObserver;
        if (z11) {
            viewTreeObserver.addOnGlobalLayoutListener(this.K);
        }
        view2.addOnAttachStateChangeListener(this.L);
        iVar.Q = view2;
        iVar.N = this.U;
        boolean z12 = this.S;
        Context context = this.f47244b;
        i iVar2 = this.f47246d;
        if (!z12) {
            this.T = r.o(iVar2, context, this.f47248f);
            this.S = true;
        }
        iVar.r(this.T);
        wVar2.setInputMethodMode(2);
        Rect rect = this.f47308a;
        iVar.Z = rect != null ? new Rect(rect) : null;
        iVar.a();
        DropDownListView dropDownListView = iVar.f1096c;
        dropDownListView.setOnKeyListener(this);
        if (this.V) {
            l lVar = this.f47245c;
            if (lVar.O != null) {
                FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) dropDownListView, false);
                TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
                if (textView != null) {
                    textView.setText(lVar.O);
                }
                frameLayout.setEnabled(false);
                dropDownListView.addHeaderView(frameLayout, null, false);
            }
        }
        iVar.p(iVar2);
        iVar.a();
    }

    @Override // q.z
    public final boolean b() {
        return !this.R && this.H.f1095b0.isShowing();
    }

    @Override // q.v
    public final void c(boolean z11) {
        this.S = false;
        i iVar = this.f47246d;
        if (iVar != null) {
            iVar.notifyDataSetChanged();
        }
    }

    @Override // q.v
    public final void d(l lVar, boolean z11) {
        if (lVar != this.f47245c) {
            return;
        }
        dismiss();
        u uVar = this.P;
        if (uVar != null) {
            uVar.d(lVar, z11);
        }
    }

    @Override // q.z
    public final void dismiss() {
        if (b()) {
            this.H.dismiss();
        }
    }

    @Override // q.v
    public final boolean e() {
        return false;
    }

    @Override // q.v
    public final boolean f(b0 b0Var) {
        boolean z11;
        if (b0Var.hasVisibleItems()) {
            t tVar = new t(this.f47244b, b0Var, this.O, this.f47247e, this.f47249t, 0);
            u uVar = this.P;
            tVar.f47317h = uVar;
            r rVar = tVar.f47318i;
            if (rVar != null) {
                rVar.l(uVar);
            }
            int size = b0Var.f47285f.size();
            int i11 = 0;
            while (true) {
                if (i11 >= size) {
                    z11 = false;
                    break;
                }
                MenuItem item = b0Var.getItem(i11);
                if (item.isVisible() && item.getIcon() != null) {
                    z11 = true;
                    break;
                }
                i11++;
            }
            tVar.f47316g = z11;
            r rVar2 = tVar.f47318i;
            if (rVar2 != null) {
                rVar2.q(z11);
            }
            tVar.f47319j = this.M;
            this.M = null;
            this.f47245c.c(false);
            androidx.appcompat.widget.i iVar = this.H;
            int width = iVar.f1099f;
            int iN = iVar.n();
            if ((Gravity.getAbsoluteGravity(this.U, this.N.getLayoutDirection()) & 7) == 5) {
                width += this.N.getWidth();
            }
            if (!tVar.b()) {
                if (tVar.f47314e != null) {
                    tVar.d(width, iN, true, true);
                }
            }
            u uVar2 = this.P;
            if (uVar2 != null) {
                uVar2.q(b0Var);
            }
            return true;
        }
        return false;
    }

    @Override // q.z
    public final ListView h() {
        return this.H.f1096c;
    }

    @Override // q.v
    public final Parcelable k() {
        return null;
    }

    @Override // q.v
    public final void l(u uVar) {
        this.P = uVar;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.R = true;
        this.f47245c.c(true);
        ViewTreeObserver viewTreeObserver = this.Q;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.Q = this.O.getViewTreeObserver();
            }
            this.Q.removeGlobalOnLayoutListener(this.K);
            this.Q = null;
        }
        this.O.removeOnAttachStateChangeListener(this.L);
        PopupWindow.OnDismissListener onDismissListener = this.M;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i11, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i11 != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // q.r
    public final void p(View view) {
        this.N = view;
    }

    @Override // q.r
    public final void q(boolean z11) {
        this.f47246d.f47275c = z11;
    }

    @Override // q.r
    public final void r(int i11) {
        this.U = i11;
    }

    @Override // q.r
    public final void s(int i11) {
        this.H.f1099f = i11;
    }

    @Override // q.r
    public final void t(PopupWindow.OnDismissListener onDismissListener) {
        this.M = onDismissListener;
    }

    @Override // q.r
    public final void u(boolean z11) {
        this.V = z11;
    }

    @Override // q.r
    public final void v(int i11) {
        this.H.k(i11);
    }

    @Override // q.v
    public final void g(Parcelable parcelable) {
    }

    @Override // q.r
    public final void n(l lVar) {
    }
}
