package sy;

import java.io.Externalizable;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Map;
import kotlin.jvm.internal.m;
import nv.p;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class j implements Externalizable {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public g f51955a;

    private final Object readResolve() {
        return this.f51955a;
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput input) throws IOException {
        m.f(input, "input");
        byte b3 = input.readByte();
        if (b3 != 0) {
            throw new InvalidObjectException(p.j(b3, "Unsupported flags value: "));
        }
        int i11 = input.readInt();
        if (i11 < 0) {
            throw new InvalidObjectException(p.o("Illegal size value: ", i11, '.'));
        }
        g gVar = new g(i11);
        for (int i12 = 0; i12 < i11; i12++) {
            gVar.put(input.readObject(), input.readObject());
        }
        this.f51955a = gVar.b();
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput output) throws IOException {
        m.f(output, "output");
        output.writeByte(0);
        output.writeInt(this.f51955a.K);
        for (Map.Entry entry : (h) this.f51955a.entrySet()) {
            output.writeObject(entry.getKey());
            output.writeObject(entry.getValue());
        }
    }
}
