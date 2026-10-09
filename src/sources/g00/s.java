package g00;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class s extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c00.a f28458a;

    public s(c00.a aVar) {
        this.f28458a = aVar;
    }

    @Override // g00.a
    public void f(f00.a aVar, int i11, Object obj) {
        i(i11, obj, aVar.t(getDescriptor(), i11, this.f28458a, null));
    }

    public abstract void i(int i11, Object obj, Object obj2);

    @Override // c00.a
    public void serialize(f00.d dVar, Object obj) {
        int iD = d(obj);
        e00.g descriptor = getDescriptor();
        f00.b bVarD = dVar.D(descriptor, iD);
        Iterator itC = c(obj);
        for (int i11 = 0; i11 < iD; i11++) {
            bVarD.A(getDescriptor(), i11, this.f28458a, itC.next());
        }
        bVarD.c(descriptor);
    }
}
