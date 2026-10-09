package androidx.work;

import a4.l;
import android.content.Context;
import fb.g;
import fb.h;
import fb.v;
import gb.r;
import kotlin.jvm.internal.m;
import rz.e0;
import rz.y;
import vy.d;
import vy.i;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class CoroutineWorker extends v {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final WorkerParameters f2785e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final g f2786f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutineWorker(Context appContext, WorkerParameters params) {
        super(appContext, params);
        m.f(appContext, "appContext");
        m.f(params, "params");
        this.f2785e = params;
        this.f2786f = g.f27086a;
    }

    @Override // fb.v
    public final l a() {
        return r.G(d().plus(e0.d()), new h(this, null, 0));
    }

    @Override // fb.v
    public final l b() {
        i iVarD = !m.a(d(), g.f27086a) ? d() : this.f2785e.f2791e;
        m.e(iVarD, "if (coroutineContext != …rkerContext\n            }");
        return r.G(iVarD.plus(e0.d()), new h(this, null, 1));
    }

    public abstract Object c(d dVar);

    public y d() {
        return this.f2786f;
    }
}
