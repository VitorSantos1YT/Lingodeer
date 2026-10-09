package xy;

import kotlin.jvm.internal.a0;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.z;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class h extends g implements kotlin.jvm.internal.h {
    private final int arity;

    public h(int i11, vy.d dVar) {
        super(dVar);
        this.arity = i11;
    }

    @Override // kotlin.jvm.internal.h
    public int getArity() {
        return this.arity;
    }

    @Override // xy.a
    public String toString() {
        if (getCompletion() != null) {
            return super.toString();
        }
        z.f38362a.getClass();
        String strA = a0.a(this);
        m.e(strA, "renderLambdaToString(...)");
        return strA;
    }
}
