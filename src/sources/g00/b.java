package g00;

import kotlinx.serialization.SerializationException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class b implements c00.a {
    @Override // c00.a
    public final Object deserialize(f00.c cVar) {
        c00.c cVar2 = (c00.c) this;
        e00.g descriptor = cVar2.getDescriptor();
        f00.a aVarD = cVar.d(descriptor);
        Object objT = null;
        String strK = null;
        while (true) {
            int iN = aVarD.n(cVar2.getDescriptor());
            if (iN == -1) {
                if (objT == null) {
                    throw new IllegalArgumentException(ep.a.e("Polymorphic value has not been read for class ", strK).toString());
                }
                aVarD.c(descriptor);
                return objT;
            }
            if (iN == 0) {
                strK = aVarD.k(cVar2.getDescriptor(), iN);
            } else {
                if (iN != 1) {
                    StringBuilder sb2 = new StringBuilder("Invalid index in polymorphic deserialization of ");
                    if (strK == null) {
                        strK = "unknown class";
                    }
                    sb2.append(strK);
                    sb2.append("\n Expected 0, 1 or DECODE_DONE(-1), but found ");
                    sb2.append(iN);
                    throw new SerializationException(sb2.toString());
                }
                if (strK == null) {
                    throw new IllegalArgumentException("Cannot read polymorphic value before its type token");
                }
                objT = aVarD.t(cVar2.getDescriptor(), iN, o00.a.r(this, aVarD, strK), null);
            }
        }
    }

    @Override // c00.a
    public final void serialize(f00.d dVar, Object value) {
        kotlin.jvm.internal.m.f(value, "value");
        c00.a aVarS = o00.a.s(this, dVar, value);
        c00.c cVar = (c00.c) this;
        e00.g descriptor = cVar.getDescriptor();
        f00.b bVarD = dVar.d(descriptor);
        bVarD.w(cVar.getDescriptor(), 0, aVarS.getDescriptor().a());
        bVarD.A(cVar.getDescriptor(), 1, aVarS, value);
        bVarD.c(descriptor);
    }
}
