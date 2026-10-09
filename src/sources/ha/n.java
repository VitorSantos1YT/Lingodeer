package ha;

import g00.e0;
import g00.f1;
import java.util.List;
import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class n {
    public final <T> c00.a serializer(final c00.a typeSerial0) {
        kotlin.jvm.internal.m.f(typeSerial0, "typeSerial0");
        return new e0() { // from class: ha.m
            private final e00.g descriptor;

            {
                f1 f1Var = new f1("androidx.savedstate.serialization.serializers.SparseArraySerializer.SparseArraySurrogate", this, 2);
                f1Var.k("keys", false);
                f1Var.k("values", false);
                this.descriptor = f1Var;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // g00.e0
            public final c00.a[] childSerializers() {
                return new c00.a[]{o.f32150c[0].getValue(), new g00.d(typeSerial0, 0)};
            }

            @Override // c00.a
            public final Object deserialize(f00.c cVar) {
                e00.g gVar = this.descriptor;
                f00.a aVarD = cVar.d(gVar);
                qy.h[] hVarArr = o.f32150c;
                List list = null;
                boolean z11 = true;
                int i11 = 0;
                List list2 = null;
                while (z11) {
                    int iN = aVarD.n(gVar);
                    if (iN == -1) {
                        z11 = false;
                    } else if (iN == 0) {
                        list = (List) aVarD.t(gVar, 0, (c00.a) hVarArr[0].getValue(), list);
                        i11 |= 1;
                    } else {
                        if (iN != 1) {
                            throw new UnknownFieldException(iN);
                        }
                        list2 = (List) aVarD.t(gVar, 1, new g00.d(typeSerial0, 0), list2);
                        i11 |= 2;
                    }
                }
                aVarD.c(gVar);
                return new o(i11, list, list2);
            }

            @Override // c00.a
            public final e00.g getDescriptor() {
                return this.descriptor;
            }

            @Override // c00.a
            public final void serialize(f00.d dVar, Object obj) {
                o value = (o) obj;
                kotlin.jvm.internal.m.f(value, "value");
                e00.g gVar = this.descriptor;
                f00.b bVarD = dVar.d(gVar);
                bVarD.A(gVar, 0, (c00.a) o.f32150c[0].getValue(), value.f32152a);
                bVarD.A(gVar, 1, new g00.d(typeSerial0, 0), value.f32153b);
                bVarD.c(gVar);
            }

            @Override // g00.e0
            public final c00.a[] typeParametersSerializers() {
                return new c00.a[]{typeSerial0};
            }
        };
    }
}
