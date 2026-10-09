package s2;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f0 implements PointerInputEventHandler, kotlin.jvm.internal.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ fz.e f51301a;

    public f0(fz.e eVar) {
        this.f51301a = eVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof PointerInputEventHandler) || !(obj instanceof kotlin.jvm.internal.g)) {
            return false;
        }
        return kotlin.jvm.internal.m.a(this.f51301a, ((kotlin.jvm.internal.g) obj).getFunctionDelegate());
    }

    @Override // kotlin.jvm.internal.g
    public final qy.e getFunctionDelegate() {
        return this.f51301a;
    }

    public final int hashCode() {
        return this.f51301a.hashCode();
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final /* synthetic */ Object invoke(w wVar, vy.d dVar) {
        return this.f51301a.invoke(wVar, dVar);
    }
}
