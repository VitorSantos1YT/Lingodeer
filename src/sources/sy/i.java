package sy;

import java.io.Externalizable;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.AbstractCollection;
import java.util.Iterator;
import kotlin.jvm.internal.m;
import ns.o;
import nv.p;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class i implements Externalizable {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public AbstractCollection f51953a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f51954b;

    public i(AbstractCollection abstractCollection, int i11) {
        this.f51953a = abstractCollection;
        this.f51954b = i11;
    }

    private final Object readResolve() {
        return this.f51953a;
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput input) throws IOException {
        AbstractCollection abstractCollectionE;
        m.f(input, "input");
        byte b3 = input.readByte();
        int i11 = b3 & 1;
        if ((b3 & (-2)) != 0) {
            throw new InvalidObjectException(p.o("Unsupported flags value: ", b3, '.'));
        }
        int i12 = input.readInt();
        if (i12 < 0) {
            throw new InvalidObjectException(p.o("Illegal size value: ", i12, '.'));
        }
        int i13 = 0;
        if (i11 == 0) {
            c cVar = new c(i12);
            while (i13 < i12) {
                cVar.add(input.readObject());
                i13++;
            }
            abstractCollectionE = o.e(cVar);
        } else {
            if (i11 != 1) {
                throw new InvalidObjectException(p.o("Unsupported collection type tag: ", i11, '.'));
            }
            k kVar = new k(new g(i12));
            while (i13 < i12) {
                kVar.add(input.readObject());
                i13++;
            }
            abstractCollectionE = qx.b.f(kVar);
        }
        this.f51953a = abstractCollectionE;
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput output) throws IOException {
        m.f(output, "output");
        output.writeByte(this.f51954b);
        output.writeInt(this.f51953a.size());
        Iterator it = this.f51953a.iterator();
        while (it.hasNext()) {
            output.writeObject(it.next());
        }
    }
}
