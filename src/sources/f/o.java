package f;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import com.lingodeer.R;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class o extends Dialog implements LifecycleOwner, f0, da.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public LifecycleRegistry f26163a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final da.f f26164b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d0 f26165c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(Context context, int i11) {
        super(context, i11);
        kotlin.jvm.internal.m.f(context, "context");
        this.f26164b = new da.f(new fa.a(this, new cr.n(this, 3)));
        this.f26165c = new d0(new b2.a(this, 11));
    }

    public static void a(o oVar) {
        super.onBackPressed();
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        kotlin.jvm.internal.m.f(view, "view");
        b();
        super.addContentView(view, layoutParams);
    }

    public final void b() {
        Window window = getWindow();
        kotlin.jvm.internal.m.c(window);
        View decorView = window.getDecorView();
        kotlin.jvm.internal.m.e(decorView, "window!!.decorView");
        ViewTreeLifecycleOwner.set(decorView, this);
        Window window2 = getWindow();
        kotlin.jvm.internal.m.c(window2);
        View decorView2 = window2.getDecorView();
        kotlin.jvm.internal.m.e(decorView2, "window!!.decorView");
        decorView2.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        Window window3 = getWindow();
        kotlin.jvm.internal.m.c(window3);
        View decorView3 = window3.getDecorView();
        kotlin.jvm.internal.m.e(decorView3, "window!!.decorView");
        fb.g0.B(decorView3, this);
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public final Lifecycle getLifecycle() {
        LifecycleRegistry lifecycleRegistry = this.f26163a;
        if (lifecycleRegistry != null) {
            return lifecycleRegistry;
        }
        LifecycleRegistry lifecycleRegistry2 = new LifecycleRegistry(this);
        this.f26163a = lifecycleRegistry2;
        return lifecycleRegistry2;
    }

    @Override // f.f0
    public final d0 getOnBackPressedDispatcher() {
        return this.f26165c;
    }

    @Override // da.g
    public final da.e getSavedStateRegistry() {
        return this.f26164b.f23340b;
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        this.f26165c.c();
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            kotlin.jvm.internal.m.e(onBackInvokedDispatcher, "onBackInvokedDispatcher");
            d0 d0Var = this.f26165c;
            d0Var.f26137e = onBackInvokedDispatcher;
            d0Var.d(d0Var.f26139g);
        }
        this.f26164b.a(bundle);
        LifecycleRegistry lifecycleRegistry = this.f26163a;
        if (lifecycleRegistry == null) {
            lifecycleRegistry = new LifecycleRegistry(this);
            this.f26163a = lifecycleRegistry;
        }
        lifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_CREATE);
    }

    @Override // android.app.Dialog
    public final Bundle onSaveInstanceState() {
        Bundle bundleOnSaveInstanceState = super.onSaveInstanceState();
        kotlin.jvm.internal.m.e(bundleOnSaveInstanceState, "super.onSaveInstanceState()");
        this.f26164b.b(bundleOnSaveInstanceState);
        return bundleOnSaveInstanceState;
    }

    @Override // android.app.Dialog
    public void onStart() {
        super.onStart();
        LifecycleRegistry lifecycleRegistry = this.f26163a;
        if (lifecycleRegistry == null) {
            lifecycleRegistry = new LifecycleRegistry(this);
            this.f26163a = lifecycleRegistry;
        }
        lifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_RESUME);
    }

    @Override // android.app.Dialog
    public void onStop() {
        LifecycleRegistry lifecycleRegistry = this.f26163a;
        if (lifecycleRegistry == null) {
            lifecycleRegistry = new LifecycleRegistry(this);
            this.f26163a = lifecycleRegistry;
        }
        lifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_DESTROY);
        this.f26163a = null;
        super.onStop();
    }

    @Override // android.app.Dialog
    public void setContentView(int i11) {
        b();
        super.setContentView(i11);
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        kotlin.jvm.internal.m.f(view, "view");
        b();
        super.setContentView(view);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        kotlin.jvm.internal.m.f(view, "view");
        b();
        super.setContentView(view, layoutParams);
    }
}
