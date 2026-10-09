package kotlin.jvm.internal;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class n implements h, Serializable {
    private final int arity;

    public n(int i11) {
        this.arity = i11;
    }

    @Override // kotlin.jvm.internal.h
    public int getArity() {
        return this.arity;
    }

    public String toString() {
        z.f38362a.getClass();
        String strA = a0.a(this);
        m.e(strA, "renderLambdaToString(...)");
        return strA;
    }
}
