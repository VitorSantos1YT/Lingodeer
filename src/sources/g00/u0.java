package g00;

import java.util.Map;
import kotlinx.serialization.SerializationException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class u0 implements c00.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c00.a f28471a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c00.a f28472b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f28473c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e00.h f28474d;

    public u0(c00.a aVar, c00.a aVar2, byte b3) {
        this.f28471a = aVar;
        this.f28472b = aVar2;
    }

    @Override // c00.a
    public final Object deserialize(f00.c cVar) {
        Object t0Var;
        Object obj = d1.f28376c;
        e00.g descriptor = getDescriptor();
        f00.a aVarD = cVar.d(descriptor);
        Object objT = obj;
        Object objT2 = objT;
        while (true) {
            int iN = aVarD.n(getDescriptor());
            if (iN == -1) {
                if (objT == obj) {
                    throw new SerializationException("Element 'key' is missing");
                }
                if (objT2 == obj) {
                    throw new SerializationException("Element 'value' is missing");
                }
                switch (this.f28473c) {
                    case 0:
                        t0Var = new t0(objT, objT2);
                        break;
                    default:
                        t0Var = new qy.l(objT, objT2);
                        break;
                }
                aVarD.c(descriptor);
                return t0Var;
            }
            if (iN == 0) {
                objT = aVarD.t(getDescriptor(), 0, this.f28471a, null);
            } else {
                if (iN != 1) {
                    throw new SerializationException(nv.p.j(iN, "Invalid index: "));
                }
                objT2 = aVarD.t(getDescriptor(), 1, this.f28472b, null);
            }
        }
    }

    @Override // c00.a
    public final e00.g getDescriptor() {
        switch (this.f28473c) {
            case 0:
                break;
        }
        return this.f28474d;
    }

    @Override // c00.a
    public final void serialize(f00.d dVar, Object obj) {
        Object key;
        Object value;
        f00.b bVarD = dVar.d(getDescriptor());
        e00.g descriptor = getDescriptor();
        c00.a aVar = this.f28471a;
        switch (this.f28473c) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                kotlin.jvm.internal.m.f(entry, "<this>");
                key = entry.getKey();
                break;
            default:
                qy.l lVar = (qy.l) obj;
                kotlin.jvm.internal.m.f(lVar, "<this>");
                key = lVar.f48495a;
                break;
        }
        bVarD.A(descriptor, 0, aVar, key);
        e00.g descriptor2 = getDescriptor();
        c00.a aVar2 = this.f28472b;
        switch (this.f28473c) {
            case 0:
                Map.Entry entry2 = (Map.Entry) obj;
                kotlin.jvm.internal.m.f(entry2, "<this>");
                value = entry2.getValue();
                break;
            default:
                qy.l lVar2 = (qy.l) obj;
                kotlin.jvm.internal.m.f(lVar2, "<this>");
                value = lVar2.f48496b;
                break;
        }
        bVarD.A(descriptor2, 1, aVar2, value);
        bVarD.c(getDescriptor());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public u0(final c00.a aVar, final c00.a aVar2, int i11) {
        this(aVar, aVar2, (byte) 0);
        this.f28473c = i11;
        switch (i11) {
            case 1:
                this(aVar, aVar2, (byte) 0);
                final int i12 = 1;
                this.f28474d = ns.o.f("kotlin.Pair", new e00.g[0], new fz.c() { // from class: g00.s0
                    @Override // fz.c
                    public final Object invoke(Object obj) {
                        e00.a buildSerialDescriptor = (e00.a) obj;
                        switch (i12) {
                            case 0:
                                kotlin.jvm.internal.m.f(buildSerialDescriptor, "$this$buildSerialDescriptor");
                                e00.a.a(buildSerialDescriptor, "key", aVar.getDescriptor());
                                e00.a.a(buildSerialDescriptor, "value", aVar2.getDescriptor());
                                break;
                            default:
                                kotlin.jvm.internal.m.f(buildSerialDescriptor, "$this$buildClassSerialDescriptor");
                                e00.a.a(buildSerialDescriptor, "first", aVar.getDescriptor());
                                e00.a.a(buildSerialDescriptor, "second", aVar2.getDescriptor());
                                break;
                        }
                        return qy.b0.f48488a;
                    }
                });
                break;
            default:
                final int i13 = 0;
                this.f28474d = ns.o.h("kotlin.collections.Map.Entry", e00.m.f24702e, new e00.g[0], new fz.c() { // from class: g00.s0
                    @Override // fz.c
                    public final Object invoke(Object obj) {
                        e00.a buildSerialDescriptor = (e00.a) obj;
                        switch (i13) {
                            case 0:
                                kotlin.jvm.internal.m.f(buildSerialDescriptor, "$this$buildSerialDescriptor");
                                e00.a.a(buildSerialDescriptor, "key", aVar.getDescriptor());
                                e00.a.a(buildSerialDescriptor, "value", aVar2.getDescriptor());
                                break;
                            default:
                                kotlin.jvm.internal.m.f(buildSerialDescriptor, "$this$buildClassSerialDescriptor");
                                e00.a.a(buildSerialDescriptor, "first", aVar.getDescriptor());
                                e00.a.a(buildSerialDescriptor, "second", aVar2.getDescriptor());
                                break;
                        }
                        return qy.b0.f48488a;
                    }
                });
                break;
        }
    }
}
