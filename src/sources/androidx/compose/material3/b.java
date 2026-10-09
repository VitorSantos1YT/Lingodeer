package androidx.compose.material3;

import android.os.Build;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import b0.d;
import cf.x;
import com.alibaba.sdk.android.oss.common.OSSConstants;
import com.lingodeer.R;
import f.o;
import fb.g0;
import h1.b6;
import h1.d6;
import h1.l5;
import h1.m5;
import h1.n5;
import java.util.UUID;
import kotlin.NoWhenBranchMatchedException;
import rz.b0;
import se.k;
import tp.g;
import v3.m;
import z3.a0;
import z4.a2;
import z4.w1;
import z4.x1;
import z4.y1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends o {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public fz.a f1129d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public b6 f1130e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final View f1131f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ModalBottomSheetDialogLayout f1132t;

    public b(fz.a aVar, b6 b6Var, View view, m mVar, v3.c cVar, UUID uuid, d dVar, b0 b0Var, boolean z11) {
        super(new ContextThemeWrapper(view.getContext(), R.style.EdgeToEdgeFloatingDialogWindowTheme), 0);
        this.f1129d = aVar;
        this.f1130e = b6Var;
        this.f1131f = view;
        float f5 = 8;
        Window window = getWindow();
        if (window == null) {
            throw new IllegalStateException("Dialog has no window");
        }
        window.requestFeature(1);
        window.setBackgroundDrawableResource(android.R.color.transparent);
        android.support.v4.media.session.a.I(window, false);
        ModalBottomSheetDialogLayout modalBottomSheetDialogLayout = new ModalBottomSheetDialogLayout(getContext(), window, this.f1130e.f30040b, this.f1129d, dVar, b0Var);
        modalBottomSheetDialogLayout.setTag(R.id.compose_view_saveable_id_tag, "Dialog:" + uuid);
        modalBottomSheetDialogLayout.setClipChildren(false);
        modalBottomSheetDialogLayout.setElevation(cVar.e0(f5));
        modalBottomSheetDialogLayout.setOutlineProvider(new l5(0));
        this.f1132t = modalBottomSheetDialogLayout;
        setContentView(modalBottomSheetDialogLayout);
        ViewTreeLifecycleOwner.set(modalBottomSheetDialogLayout, ViewTreeLifecycleOwner.get(view));
        ViewTreeViewModelStoreOwner.set(modalBottomSheetDialogLayout, ViewTreeViewModelStoreOwner.get(view));
        g0.B(modalBottomSheetDialogLayout, g0.p(view));
        c(this.f1129d, this.f1130e, mVar);
        g gVar = new g(window.getDecorView());
        int i11 = Build.VERSION.SDK_INT;
        x a2Var = i11 >= 35 ? new a2(window, gVar) : i11 >= 30 ? new y1(window, gVar) : i11 >= 26 ? new x1(window, gVar) : new w1(window, gVar);
        boolean z12 = !z11;
        a2Var.K(z12);
        a2Var.J(z12);
        k.g(this.f26165c, this, new m5(this, 0));
    }

    public final void c(fz.a aVar, b6 b6Var, m mVar) {
        this.f1129d = aVar;
        this.f1130e = b6Var;
        a0 a0Var = b6Var.f30039a;
        ViewGroup.LayoutParams layoutParams = this.f1131f.getRootView().getLayoutParams();
        WindowManager.LayoutParams layoutParams2 = layoutParams instanceof WindowManager.LayoutParams ? (WindowManager.LayoutParams) layoutParams : null;
        int i11 = 1;
        boolean z11 = (layoutParams2 == null || (layoutParams2.flags & OSSConstants.DEFAULT_BUFFER_SIZE) == 0) ? false : true;
        int i12 = d6.f30142a[a0Var.ordinal()];
        if (i12 == 1) {
            z11 = false;
        } else if (i12 == 2) {
            z11 = true;
        } else if (i12 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        Window window = getWindow();
        kotlin.jvm.internal.m.c(window);
        window.setFlags(z11 ? 8192 : -8193, OSSConstants.DEFAULT_BUFFER_SIZE);
        int i13 = n5.f30726a[mVar.ordinal()];
        if (i13 == 1) {
            i11 = 0;
        } else if (i13 != 2) {
            throw new NoWhenBranchMatchedException();
        }
        this.f1132t.setLayoutDirection(i11);
        Window window2 = getWindow();
        if (window2 != null) {
            window2.setLayout(-1, -1);
        }
        Window window3 = getWindow();
        if (window3 != null) {
            window3.setSoftInputMode(Build.VERSION.SDK_INT >= 30 ? 48 : 16);
        }
    }

    @Override // android.app.Dialog
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
        if (zOnTouchEvent) {
            this.f1129d.invoke();
        }
        return zOnTouchEvent;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void cancel() {
    }
}
