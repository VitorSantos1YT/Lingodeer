package z3;

import bt.j1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends kotlin.jvm.internal.n implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f58739a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.window.d f58740b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(androidx.compose.ui.window.d dVar, int i11) {
        super(1);
        this.f58739a = i11;
        this.f58740b = dVar;
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        switch (this.f58739a) {
            case 0:
                androidx.compose.ui.window.d dVar = this.f58740b;
                dVar.show();
                return new j1(dVar, 18);
            default:
                androidx.compose.ui.window.d dVar2 = this.f58740b;
                if (dVar2.f1245e.f58784a) {
                    dVar2.f1244d.invoke();
                }
                return qy.b0.f48488a;
        }
    }
}
