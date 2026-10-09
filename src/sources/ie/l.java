package ie;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.fragment.app.p0;
import ay.k0;
import ce.x;
import fr.p3;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class l implements Handler.Callback {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final k0 f34398d = new k0(16);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile com.bumptech.glide.p f34399a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f34400b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b1.p f34401c = new b1.p(f34398d);

    public l() {
        this.f34400b = (x.f6894f && x.f6893e) ? new e() : new p3(15);
    }

    public static Activity a(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return a(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    public final com.bumptech.glide.p b(Context context) {
        if (context == null) {
            throw new IllegalArgumentException("You cannot start a load on a null Context");
        }
        char[] cArr = pe.m.f46830a;
        if (Looper.myLooper() == Looper.getMainLooper() && !(context instanceof Application)) {
            if (context instanceof p0) {
                p0 p0Var = (p0) context;
                if (!(Looper.myLooper() == Looper.getMainLooper())) {
                    return b(p0Var.getApplicationContext());
                }
                if (p0Var.isDestroyed()) {
                    throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
                }
                this.f34400b.a(p0Var);
                Activity activityA = a(p0Var);
                return this.f34401c.A(p0Var, com.bumptech.glide.c.c(p0Var.getApplicationContext()), p0Var.getLifecycle(), p0Var.getSupportFragmentManager(), activityA == null || !activityA.isFinishing());
            }
            if (context instanceof ContextWrapper) {
                ContextWrapper contextWrapper = (ContextWrapper) context;
                if (contextWrapper.getBaseContext().getApplicationContext() != null) {
                    return b(contextWrapper.getBaseContext());
                }
            }
        }
        if (this.f34399a == null) {
            synchronized (this) {
                try {
                    if (this.f34399a == null) {
                        this.f34399a = new com.bumptech.glide.p(com.bumptech.glide.c.c(context.getApplicationContext()), new tw.c(14), new p20.c(15), context.getApplicationContext());
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return this.f34399a;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        return false;
    }
}
