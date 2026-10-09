package uz;

import kotlinx.coroutines.flow.internal.AbortFlowException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class b0 implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f53260a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.y f53261b;

    public /* synthetic */ b0(kotlin.jvm.internal.y yVar, int i11) {
        this.f53260a = i11;
        this.f53261b = yVar;
    }

    @Override // uz.j
    public final Object emit(Object obj, vy.d dVar) {
        switch (this.f53260a) {
            case 0:
                this.f53261b.f38361a = obj;
                throw new AbortFlowException(this);
            default:
                this.f53261b.f38361a = obj;
                throw new AbortFlowException(this);
        }
    }
}
