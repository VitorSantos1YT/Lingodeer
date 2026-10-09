package z2;

import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.AbstractComposeView;
import androidx.compose.ui.platform.AndroidComposeView;
import com.lingodeer.R;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class e3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ViewGroup.LayoutParams f58533a = new ViewGroup.LayoutParams(-2, -2);

    /* JADX WARN: Code duplicated, block: B:20:0x0059  */
    /* JADX WARN: Code duplicated, block: B:23:0x007e  */
    /* JADX WARN: Code duplicated, block: B:25:0x0083  */
    /* JADX WARN: Code duplicated, block: B:28:0x00ae  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, java.util.Collection] */
    public static final b3 a(AbstractComposeView abstractComposeView, l1.w wVar, t1.d dVar) {
        AndroidComposeView androidComposeView;
        b3 b3Var;
        Object[] objArr = 0;
        if (l1.f58610a.compareAndSet(false, true)) {
            tz.h hVarB = qx.p.b(1, 6, null);
            rz.e0.B(rz.e0.c((vy.i) p0.M.getValue()), null, null, new y0.j((Object) hVarB, (vy.d) (objArr == true ? 1 : 0), 4), 3);
            y.p0 p0Var = new y.p0(hVarB, 11);
            synchronized (x1.l.f55691c) {
                x1.l.f55697i = ry.m.G0(p0Var, x1.l.f55697i);
            }
            x1.l.a();
        }
        if (abstractComposeView.getChildCount() > 0) {
            View childAt = abstractComposeView.getChildAt(0);
            if (childAt instanceof AndroidComposeView) {
                androidComposeView = (AndroidComposeView) childAt;
            }
            if (androidComposeView == null) {
                androidComposeView = new AndroidComposeView(abstractComposeView.getContext(), wVar.j());
                abstractComposeView.addView(androidComposeView.getView(), f58533a);
            }
            Object tag = androidComposeView.getView().getTag(R.id.wrapped_composition_tag);
            b3Var = tag instanceof b3 ? (b3) tag : null;
            if (b3Var == null) {
                b3Var = new b3(androidComposeView, new l1.z(wVar, new y2.h2(androidComposeView.getRoot())));
                androidComposeView.getView().setTag(R.id.wrapped_composition_tag, b3Var);
            }
            b3Var.a(dVar);
            if (!kotlin.jvm.internal.m.a(androidComposeView.getCoroutineContext(), wVar.j())) {
                androidComposeView.setCoroutineContext(wVar.j());
            }
            androidComposeView.setFrameEndScheduler$ui(new d3(wVar));
            return b3Var;
        }
        abstractComposeView.removeAllViews();
        androidComposeView = null;
        if (androidComposeView == null) {
            androidComposeView = new AndroidComposeView(abstractComposeView.getContext(), wVar.j());
            abstractComposeView.addView(androidComposeView.getView(), f58533a);
        }
        Object tag2 = androidComposeView.getView().getTag(R.id.wrapped_composition_tag);
        if (tag2 instanceof b3) {
        }
        if (b3Var == null) {
            b3Var = new b3(androidComposeView, new l1.z(wVar, new y2.h2(androidComposeView.getRoot())));
            androidComposeView.getView().setTag(R.id.wrapped_composition_tag, b3Var);
        }
        b3Var.a(dVar);
        if (!kotlin.jvm.internal.m.a(androidComposeView.getCoroutineContext(), wVar.j())) {
            androidComposeView.setCoroutineContext(wVar.j());
        }
        androidComposeView.setFrameEndScheduler$ui(new d3(wVar));
        return b3Var;
    }
}
