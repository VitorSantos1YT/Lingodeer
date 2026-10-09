package androidx.compose.ui.window;

import android.os.Build;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.alibaba.sdk.android.oss.common.OSSConstants;
import com.lingodeer.R;
import f.o;
import fb.g0;
import h1.l5;
import java.util.UUID;
import kotlin.NoWhenBranchMatchedException;
import se.k;
import v3.m;
import z3.a0;
import z3.b0;
import z3.n;
import z3.r;
import z3.t;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends o {
    public boolean H;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public fz.a f1244d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public r f1245e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final View f1246f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final DialogLayout f1247t;

    public d(fz.a aVar, r rVar, View view, m mVar, v3.c cVar, UUID uuid) {
        super(new ContextThemeWrapper(view.getContext(), rVar.f58788e ? R.style.DialogWindowTheme : R.style.FloatingDialogWindowTheme), 0);
        this.f1244d = aVar;
        this.f1245e = rVar;
        this.f1246f = view;
        float f5 = 8;
        Window window = getWindow();
        if (window == null) {
            throw new IllegalStateException("Dialog has no window");
        }
        window.requestFeature(1);
        window.setBackgroundDrawableResource(android.R.color.transparent);
        android.support.v4.media.session.a.I(window, this.f1245e.f58788e);
        window.setGravity(17);
        if (!this.f1245e.f58788e) {
            window.addFlags(65792);
            WindowManager.LayoutParams attributes = window.getAttributes();
            int i11 = Build.VERSION.SDK_INT;
            if (i11 >= 28) {
                z3.m.f58777a.a(attributes);
            }
            if (i11 >= 30) {
                n nVar = n.f58778a;
                nVar.b(attributes, 0);
                nVar.c(attributes, 0);
            }
            window.setAttributes(attributes);
        }
        DialogLayout dialogLayout = new DialogLayout(getContext(), window);
        setTitle(this.f1245e.f58789f);
        dialogLayout.setTag(R.id.compose_view_saveable_id_tag, "Dialog:" + uuid);
        dialogLayout.setClipChildren(false);
        dialogLayout.setElevation(cVar.e0(f5));
        dialogLayout.setOutlineProvider(new l5(3));
        this.f1247t = dialogLayout;
        View decorView = window.getDecorView();
        ViewGroup viewGroup = decorView instanceof ViewGroup ? (ViewGroup) decorView : null;
        if (viewGroup != null) {
            c(viewGroup);
        }
        setContentView(dialogLayout);
        ViewTreeLifecycleOwner.set(dialogLayout, ViewTreeLifecycleOwner.get(view));
        ViewTreeViewModelStoreOwner.set(dialogLayout, ViewTreeViewModelStoreOwner.get(view));
        g0.B(dialogLayout, g0.p(view));
        d(this.f1244d, this.f1245e, mVar);
        k.g(this.f26165c, this, new z3.b(this, 1));
    }

    public static final void c(ViewGroup viewGroup) {
        viewGroup.setClipChildren(false);
        if (viewGroup instanceof DialogLayout) {
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = viewGroup.getChildAt(i11);
            ViewGroup viewGroup2 = childAt instanceof ViewGroup ? (ViewGroup) childAt : null;
            if (viewGroup2 != null) {
                c(viewGroup2);
            }
        }
    }

    public final void d(fz.a aVar, r rVar, m mVar) {
        int i11;
        this.f1244d = aVar;
        this.f1245e = rVar;
        a0 a0Var = rVar.f58786c;
        boolean zC = z3.k.c(this.f1246f);
        int i12 = b0.f58741a[a0Var.ordinal()];
        int i13 = 0;
        if (i12 == 1) {
            zC = false;
        } else if (i12 == 2) {
            zC = true;
        } else if (i12 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        Window window = getWindow();
        kotlin.jvm.internal.m.c(window);
        window.setFlags(zC ? 8192 : -8193, OSSConstants.DEFAULT_BUFFER_SIZE);
        int i14 = t.f58790a[mVar.ordinal()];
        if (i14 == 1) {
            i11 = 0;
        } else {
            if (i14 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i11 = 1;
        }
        DialogLayout dialogLayout = this.f1247t;
        dialogLayout.setLayoutDirection(i11);
        boolean z11 = rVar.f58788e;
        boolean z12 = rVar.f58787d;
        Window window2 = dialogLayout.K;
        boolean z13 = (dialogLayout.O && z12 == dialogLayout.M && z11 == dialogLayout.N) ? false : true;
        dialogLayout.M = z12;
        dialogLayout.N = z11;
        if (z13) {
            WindowManager.LayoutParams attributes = window2.getAttributes();
            int i15 = z12 ? -2 : -1;
            if (i15 != attributes.width || !dialogLayout.O) {
                window2.setLayout(i15, -2);
                dialogLayout.O = true;
            }
        }
        setCanceledOnTouchOutside(rVar.f58785b);
        Window window3 = getWindow();
        if (window3 != null) {
            if (!z11) {
                i13 = Build.VERSION.SDK_INT < 31 ? 16 : 48;
            }
            window3.setSoftInputMode(i13);
        }
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i11, KeyEvent keyEvent) {
        if (!this.f1245e.f58784a || !keyEvent.isTracking() || keyEvent.isCanceled() || i11 != 111) {
            return super.onKeyUp(i11, keyEvent);
        }
        this.f1244d.invoke();
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x008b  */
    @Override // android.app.Dialog
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked;
        View childAt;
        int iQ;
        boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
        if (!this.f1245e.f58785b) {
            actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 0) {
            }
            this.H = false;
            return zOnTouchEvent;
        }
        DialogLayout dialogLayout = this.f1247t;
        dialogLayout.getClass();
        float x11 = motionEvent.getX();
        if (!Float.isInfinite(x11) && !Float.isNaN(x11)) {
            float y10 = motionEvent.getY();
            if (!Float.isInfinite(y10) && !Float.isNaN(y10) && (childAt = dialogLayout.getChildAt(0)) != null) {
                int left = childAt.getLeft() + dialogLayout.getLeft();
                int width = childAt.getWidth() + left;
                int top = childAt.getTop() + dialogLayout.getTop();
                int height = childAt.getHeight() + top;
                int iQ2 = hz.b.Q(motionEvent.getX());
                if (left <= iQ2 && iQ2 <= width && top <= (iQ = hz.b.Q(motionEvent.getY())) && iQ <= height) {
                    actionMasked = motionEvent.getActionMasked();
                    if (actionMasked != 0 || actionMasked == 1 || actionMasked == 3) {
                        this.H = false;
                        return zOnTouchEvent;
                    }
                }
            }
        }
        int actionMasked2 = motionEvent.getActionMasked();
        if (actionMasked2 == 0) {
            this.H = true;
            return true;
        }
        if (actionMasked2 != 1) {
            if (actionMasked2 == 3) {
                this.H = false;
                return zOnTouchEvent;
            }
        } else if (this.H) {
            this.f1244d.invoke();
            this.H = false;
            return true;
        }
        return zOnTouchEvent;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void cancel() {
    }
}
