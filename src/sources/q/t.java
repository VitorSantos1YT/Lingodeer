package q;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import com.lingodeer.R;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f47310a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f47311b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f47312c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f47313d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public View f47314e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f47316g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public u f47317h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public r f47318i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public PopupWindow.OnDismissListener f47319j;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f47315f = 8388611;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final s f47320k = new s(this);

    public t(Context context, l lVar, View view, boolean z11, int i11, int i12) {
        this.f47310a = context;
        this.f47311b = lVar;
        this.f47314e = view;
        this.f47312c = z11;
        this.f47313d = i11;
    }

    public final r a() {
        r a0Var;
        if (this.f47318i == null) {
            Context context = this.f47310a;
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            if (Math.min(point.x, point.y) >= context.getResources().getDimensionPixelSize(R.dimen.abc_cascading_menus_min_smallest_width)) {
                a0Var = new f(context, this.f47314e, this.f47313d, this.f47312c);
            } else {
                a0Var = new a0(this.f47310a, this.f47311b, this.f47314e, this.f47313d, this.f47312c);
            }
            a0Var.n(this.f47311b);
            a0Var.t(this.f47320k);
            a0Var.p(this.f47314e);
            a0Var.l(this.f47317h);
            a0Var.q(this.f47316g);
            a0Var.r(this.f47315f);
            this.f47318i = a0Var;
        }
        return this.f47318i;
    }

    public final boolean b() {
        r rVar = this.f47318i;
        return rVar != null && rVar.b();
    }

    public void c() {
        this.f47318i = null;
        PopupWindow.OnDismissListener onDismissListener = this.f47319j;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public final void d(int i11, int i12, boolean z11, boolean z12) {
        r rVarA = a();
        rVarA.u(z12);
        if (z11) {
            if ((Gravity.getAbsoluteGravity(this.f47315f, this.f47314e.getLayoutDirection()) & 7) == 5) {
                i11 -= this.f47314e.getWidth();
            }
            rVarA.s(i11);
            rVarA.v(i12);
            int i13 = (int) ((this.f47310a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            rVarA.f47308a = new Rect(i11 - i13, i12 - i13, i11 + i13, i12 + i13);
        }
        rVarA.a();
    }
}
