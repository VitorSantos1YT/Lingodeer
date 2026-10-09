package c2;

import a0.b2;
import kotlin.jvm.internal.n;
import kotlin.jvm.internal.u;
import y2.f2;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends n implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6507a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u f6508b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(b2 b2Var, g gVar, u uVar) {
        super(1);
        this.f6508b = uVar;
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        switch (this.f6507a) {
            case 0:
                g gVar = (g) obj;
                if (!gVar.P) {
                    return f2.SkipSubtreeAndContinueTraversal;
                }
                if (gVar.R != null) {
                    v2.a.b("DragAndDropTarget self reference must be null at the start of a drag and drop session");
                }
                gVar.R = null;
                u uVar = this.f6508b;
                uVar.f38357a = uVar.f38357a;
                return f2.ContinueTraversal;
            default:
                if (!((s2.f) obj).S) {
                    return f2.ContinueTraversal;
                }
                this.f6508b.f38357a = false;
                return f2.CancelTraversal;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(u uVar) {
        super(1);
        this.f6508b = uVar;
    }
}
