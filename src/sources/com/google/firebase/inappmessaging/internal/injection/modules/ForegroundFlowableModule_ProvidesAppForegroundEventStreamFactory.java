package com.google.firebase.inappmessaging.internal.injection.modules;

import android.app.Application;
import com.google.firebase.inappmessaging.dagger.internal.Factory;
import com.google.firebase.inappmessaging.dagger.internal.Provider;
import com.google.firebase.inappmessaging.internal.ForegroundNotifier;
import ex.c0;
import ex.f1;
import ex.n0;
import ex.w;
import ex.y0;
import ny.b;
import uw.a;
import uw.d;
import uw.j;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class ForegroundFlowableModule_ProvidesAppForegroundEventStreamFactory implements Factory<f1> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ForegroundFlowableModule f20210a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Provider f20211b;

    public ForegroundFlowableModule_ProvidesAppForegroundEventStreamFactory(ForegroundFlowableModule foregroundFlowableModule, Provider provider) {
        this.f20210a = foregroundFlowableModule;
        this.f20211b = provider;
    }

    @Override // oy.a
    public final Object get() {
        d c0Var;
        d y0Var;
        Application application = (Application) this.f20211b.get();
        this.f20210a.getClass();
        ForegroundNotifier foregroundNotifier = new ForegroundNotifier();
        a aVar = a.BUFFER;
        b bVar = foregroundNotifier.f20005e;
        bVar.getClass();
        n0 n0Var = new n0(bVar, 2);
        int i11 = j.f53245a[aVar.ordinal()];
        if (i11 == 1) {
            c0Var = new c0(n0Var);
        } else {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 != 4) {
                        y0Var = n0Var;
                        int i12 = d.f53244a;
                        ax.d.b(i12, "capacity");
                        y0Var = new y0(n0Var, i12);
                    } else {
                        y0Var = n0Var;
                        c0Var = new w(n0Var, 1);
                    }
                }
                y0Var = n0Var;
                f1 f1VarC = y0Var.c();
                f1VarC.f();
                application.registerActivityLifecycleCallbacks(foregroundNotifier);
                return f1VarC;
            }
            c0Var = new w(n0Var, 2);
        }
        y0Var = c0Var;
        y0Var = n0Var;
        f1 f1VarC2 = y0Var.c();
        f1VarC2.f();
        application.registerActivityLifecycleCallbacks(foregroundNotifier);
        return f1VarC2;
    }
}
