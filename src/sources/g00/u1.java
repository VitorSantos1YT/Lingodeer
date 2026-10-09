package g00;

import kotlinx.serialization.SerializationException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class u1 implements c00.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c00.a f28475a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c00.a f28476b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c00.a f28477c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e00.h f28478d = ns.o.f("kotlin.Triple", new e00.g[0], new com.google.firebase.datastorage.a(this, 26));

    public u1(c00.a aVar, c00.a aVar2, c00.a aVar3) {
        this.f28475a = aVar;
        this.f28476b = aVar2;
        this.f28477c = aVar3;
    }

    @Override // c00.a
    public final Object deserialize(f00.c cVar) {
        e00.h hVar = this.f28478d;
        f00.a aVarD = cVar.d(hVar);
        Object obj = d1.f28376c;
        Object objT = obj;
        Object objT2 = objT;
        Object objT3 = objT2;
        while (true) {
            int iN = aVarD.n(hVar);
            if (iN == -1) {
                aVarD.c(hVar);
                if (objT == obj) {
                    throw new SerializationException("Element 'first' is missing");
                }
                if (objT2 == obj) {
                    throw new SerializationException("Element 'second' is missing");
                }
                if (objT3 != obj) {
                    return new qy.r(objT, objT2, objT3);
                }
                throw new SerializationException("Element 'third' is missing");
            }
            if (iN == 0) {
                objT = aVarD.t(hVar, 0, this.f28475a, null);
            } else if (iN == 1) {
                objT2 = aVarD.t(hVar, 1, this.f28476b, null);
            } else {
                if (iN != 2) {
                    throw new SerializationException(nv.p.j(iN, "Unexpected index "));
                }
                objT3 = aVarD.t(hVar, 2, this.f28477c, null);
            }
        }
    }

    @Override // c00.a
    public final e00.g getDescriptor() {
        return this.f28478d;
    }

    @Override // c00.a
    public final void serialize(f00.d dVar, Object obj) {
        qy.r value = (qy.r) obj;
        kotlin.jvm.internal.m.f(value, "value");
        e00.h hVar = this.f28478d;
        f00.b bVarD = dVar.d(hVar);
        bVarD.A(hVar, 0, this.f28475a, value.f48505a);
        bVarD.A(hVar, 1, this.f28476b, value.f48506b);
        bVarD.A(hVar, 2, this.f28477c, value.f48507c);
        bVarD.c(hVar);
    }
}
