package bv;

import java.util.List;
import kotlinx.serialization.SerializationException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class s0 implements c00.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final s0 f6350a = new s0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final g00.d f6351b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final e00.g f6352c;

    static {
        g00.d dVarE = qx.b.e(r0.Companion.serializer());
        f6351b = dVarE;
        f6352c = (g00.c) dVarE.f28371c;
    }

    @Override // c00.a
    public final Object deserialize(f00.c cVar) {
        if (!(cVar instanceof h00.k)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        h00.k kVar = (h00.k) cVar;
        h00.m mVarI = kVar.i();
        if (mVarI instanceof h00.e) {
            return (List) kVar.b().a(f6351b, mVarI);
        }
        if (mVarI instanceof h00.z) {
            return ns.o.K(kVar.b().a(r0.Companion.serializer(), mVarI));
        }
        throw new SerializationException("word_parts 必须是对象或数组");
    }

    @Override // c00.a
    public final e00.g getDescriptor() {
        return f6352c;
    }

    @Override // c00.a
    public final void serialize(f00.d dVar, Object obj) {
        List value = (List) obj;
        kotlin.jvm.internal.m.f(value, "value");
        if (!(dVar instanceof h00.q)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        h00.q qVar = (h00.q) dVar;
        h00.c cVarB = qVar.b();
        cVarB.getClass();
        g00.d serializer = f6351b;
        kotlin.jvm.internal.m.f(serializer, "serializer");
        kotlin.jvm.internal.y yVar = new kotlin.jvm.internal.y();
        new i00.m(cVarB, new fr.e(yVar, 1), 1).y(serializer, value);
        Object obj2 = yVar.f38361a;
        if (obj2 != null) {
            qVar.f((h00.m) obj2);
        } else {
            kotlin.jvm.internal.m.n("result");
            throw null;
        }
    }
}
