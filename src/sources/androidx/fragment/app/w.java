package androidx.fragment.app;

import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class w implements Observer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ y f1859a;

    public w(y yVar) {
        this.f1859a = yVar;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        if (((LifecycleOwner) obj) != null) {
            y yVar = this.f1859a;
            if (yVar.H) {
                View viewRequireView = yVar.requireView();
                if (viewRequireView.getParent() != null) {
                    throw new IllegalStateException("DialogFragment can not be attached to a container view");
                }
                if (yVar.N != null) {
                    if (k1.L(3)) {
                        Objects.toString(yVar.N);
                    }
                    yVar.N.setContentView(viewRequireView);
                }
            }
        }
    }
}
