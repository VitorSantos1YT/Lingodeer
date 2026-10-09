package z2;

import androidx.compose.ui.platform.AndroidComposeView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.lingodeer.R;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class b3 implements l1.v, LifecycleEventObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AndroidComposeView f58510a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l1.z f58511b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f58512c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Lifecycle f58513d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public fz.e f58514e = f1.f58536a;

    public b3(AndroidComposeView androidComposeView, l1.z zVar) {
        this.f58510a = androidComposeView;
        this.f58511b = zVar;
    }

    public final void a(fz.e eVar) {
        this.f58510a.setOnViewTreeOwnersAvailable(new a3(this, eVar));
    }

    @Override // l1.v
    public final void dispose() {
        if (!this.f58512c) {
            this.f58512c = true;
            this.f58510a.getView().setTag(R.id.wrapped_composition_tag, null);
            Lifecycle lifecycle = this.f58513d;
            if (lifecycle != null) {
                lifecycle.removeObserver(this);
            }
        }
        this.f58511b.dispose();
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            dispose();
        } else {
            if (event != Lifecycle.Event.ON_CREATE || this.f58512c) {
                return;
            }
            a(this.f58514e);
        }
    }
}
