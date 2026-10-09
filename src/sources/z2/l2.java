package z2;

import android.view.View;
import android.view.ViewParent;
import androidx.compose.ui.platform.AbstractComposeView;
import com.lingodeer.R;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class l2 implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f58612a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractComposeView f58613b;

    public /* synthetic */ l2(AbstractComposeView abstractComposeView, int i11) {
        this.f58612a = i11;
        this.f58613b = abstractComposeView;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        int i11 = this.f58612a;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        boolean z11;
        switch (this.f58612a) {
            case 0:
                this.f58613b.d();
                break;
            default:
                AbstractComposeView abstractComposeView = this.f58613b;
                Iterator it = nz.n.U(abstractComposeView.getParent(), z4.v0.f58903a).iterator();
                while (true) {
                    z11 = false;
                    if (it.hasNext()) {
                        Object obj = (ViewParent) it.next();
                        if (obj instanceof View) {
                            View view2 = (View) obj;
                            kotlin.jvm.internal.m.f(view2, "<this>");
                            Object tag = view2.getTag(R.id.is_pooling_container_tag);
                            Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
                            if (bool != null ? bool.booleanValue() : false) {
                                z11 = true;
                            }
                        }
                    }
                }
                if (!z11) {
                    abstractComposeView.d();
                }
                break;
        }
    }

    private final void a(View view) {
    }

    private final void b(View view) {
    }
}
