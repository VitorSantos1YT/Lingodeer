package g;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.lingodeer.R;
import f.f0;
import l1.d0;
import l1.s;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d0 f28305a = new d0(c.f28293d);

    public static f0 a(l1.n nVar) {
        s sVar = (s) nVar;
        f0 f0Var = (f0) sVar.j(f28305a);
        Object obj = null;
        if (f0Var == null) {
            sVar.d0(544166745);
            View view = (View) sVar.j(AndroidCompositionLocals_androidKt.f1204f);
            kotlin.jvm.internal.m.f(view, "<this>");
            while (true) {
                if (view == null) {
                    f0Var = null;
                    break;
                }
                Object tag = view.getTag(R.id.view_tree_on_back_pressed_dispatcher_owner);
                f0 f0Var2 = tag instanceof f0 ? (f0) tag : null;
                if (f0Var2 != null) {
                    f0Var = f0Var2;
                    break;
                }
                Object objX = c.a.x(view);
                view = objX instanceof View ? (View) objX : null;
            }
            sVar.p(false);
        } else {
            sVar.d0(544164296);
            sVar.p(false);
        }
        if (f0Var != null) {
            sVar.d0(544164377);
            sVar.p(false);
            return f0Var;
        }
        sVar.d0(544168748);
        for (Context baseContext = (Context) sVar.j(AndroidCompositionLocals_androidKt.f1200b); baseContext instanceof ContextWrapper; baseContext = ((ContextWrapper) baseContext).getBaseContext()) {
            if (baseContext instanceof f0) {
                obj = baseContext;
                break;
            }
        }
        f0 f0Var3 = (f0) obj;
        sVar.p(false);
        return f0Var3;
    }
}
