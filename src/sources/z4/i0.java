package z4;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class i0 implements View.OnApplyWindowInsetsListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public v1 f58855a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f58856b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ u f58857c;

    public i0(View view, u uVar) {
        this.f58856b = view;
        this.f58857c = uVar;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        v1 v1VarH = v1.h(view, windowInsets);
        int i11 = Build.VERSION.SDK_INT;
        u uVar = this.f58857c;
        if (i11 < 30) {
            j0.a(windowInsets, this.f58856b);
            if (v1VarH.equals(this.f58855a)) {
                return uVar.e(view, v1VarH).g();
            }
        }
        this.f58855a = v1VarH;
        v1 v1VarE = uVar.e(view, v1VarH);
        if (i11 >= 30) {
            return v1VarE.g();
        }
        WeakHashMap weakHashMap = s0.f58893a;
        h0.c(view);
        return v1VarE.g();
    }
}
