package lb;

import android.os.Build;
import fb.l;
import fb.w;
import j9.r;
import kb.g;
import kotlin.jvm.internal.m;
import ob.p;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f39873b;

    static {
        m.e(l.c("NetworkMeteredCtrlr"), "tagWithPrefix(\"NetworkMeteredCtrlr\")");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(r tracker) {
        super(tracker);
        m.f(tracker, "tracker");
        this.f39873b = 7;
    }

    @Override // lb.d
    public final boolean c(p workSpec) {
        m.f(workSpec, "workSpec");
        return workSpec.f44857j.f27065a == w.METERED;
    }

    @Override // lb.b
    public final int d() {
        return this.f39873b;
    }

    @Override // lb.b
    public final boolean e(Object obj) {
        g value = (g) obj;
        m.f(value, "value");
        boolean z11 = value.f38037a;
        if (Build.VERSION.SDK_INT >= 26) {
            return (z11 && value.f38039c) ? false : true;
        }
        l.b().getClass();
        return !z11;
    }
}
