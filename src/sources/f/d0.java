package f;

import android.os.Build;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import bt.y2;
import java.util.Iterator;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Runnable f26133a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ry.k f26134b = new ry.k();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public x f26135c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final OnBackInvokedCallback f26136d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public OnBackInvokedDispatcher f26137e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f26138f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f26139g;

    public d0(Runnable runnable) {
        this.f26133a = runnable;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 33) {
            this.f26136d = i11 >= 34 ? new a0(new y(this, 0), new y(this, 1), new z(this, 0), new z(this, 1)) : new com.google.android.material.motion.a(new z(this, 2), 1);
        }
    }

    public final void a(LifecycleOwner owner, x onBackPressedCallback) {
        kotlin.jvm.internal.m.f(owner, "owner");
        kotlin.jvm.internal.m.f(onBackPressedCallback, "onBackPressedCallback");
        Lifecycle lifecycle = owner.getLifecycle();
        if (lifecycle.getCurrentState() == Lifecycle.State.DESTROYED) {
            return;
        }
        onBackPressedCallback.f26173b.add(new b0(this, lifecycle, onBackPressedCallback));
        e();
        onBackPressedCallback.f26174c = new y2(0, this, d0.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0, 6);
    }

    public final void b() {
        Object objPrevious;
        x xVar = this.f26135c;
        if (xVar == null) {
            ry.k kVar = this.f26134b;
            ListIterator<E> listIterator = kVar.listIterator(kVar.size());
            do {
                if (!listIterator.hasPrevious()) {
                    objPrevious = null;
                    break;
                }
                objPrevious = listIterator.previous();
            } while (!((x) objPrevious).f26172a);
            xVar = (x) objPrevious;
        }
        this.f26135c = null;
        if (xVar != null) {
            xVar.a();
        }
    }

    public final void c() {
        Object objPrevious;
        x xVar = this.f26135c;
        if (xVar == null) {
            ry.k kVar = this.f26134b;
            ListIterator listIterator = kVar.listIterator(kVar.b());
            do {
                if (!listIterator.hasPrevious()) {
                    objPrevious = null;
                    break;
                }
                objPrevious = listIterator.previous();
            } while (!((x) objPrevious).f26172a);
            xVar = (x) objPrevious;
        }
        this.f26135c = null;
        if (xVar != null) {
            xVar.b();
        } else {
            this.f26133a.run();
        }
    }

    public final void d(boolean z11) {
        OnBackInvokedCallback onBackInvokedCallback;
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.f26137e;
        if (onBackInvokedDispatcher == null || (onBackInvokedCallback = this.f26136d) == null) {
            return;
        }
        if (z11 && !this.f26138f) {
            a5.e.m(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f26138f = true;
        } else {
            if (z11 || !this.f26138f) {
                return;
            }
            a5.e.o(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f26138f = false;
        }
    }

    public final void e() {
        boolean z11 = this.f26139g;
        boolean z12 = false;
        ry.k kVar = this.f26134b;
        if (kVar == null || !kVar.isEmpty()) {
            Iterator<E> it = kVar.iterator();
            while (it.hasNext()) {
                if (((x) it.next()).f26172a) {
                    z12 = true;
                    break;
                }
            }
        }
        this.f26139g = z12;
        if (z12 == z11 || Build.VERSION.SDK_INT < 33) {
            return;
        }
        d(z12);
    }
}
