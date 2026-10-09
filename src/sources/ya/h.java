package ya;

import kotlin.jvm.internal.m;
import se.k;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f57555a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f57556b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f57557c;

    public h(Object value, i verificationMode, a aVar) {
        m.f(value, "value");
        m.f(verificationMode, "verificationMode");
        this.f57555a = value;
        this.f57556b = verificationMode;
        this.f57557c = aVar;
    }

    @Override // se.k
    public final k B(String str, fz.c cVar) {
        Object obj = this.f57555a;
        return ((Boolean) cVar.invoke(obj)).booleanValue() ? this : new g(obj, str, this.f57557c, this.f57556b);
    }

    @Override // se.k
    public final Object l() {
        return this.f57555a;
    }
}
