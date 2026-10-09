package he;

import ce.d0;
import ge.i;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicReference;
import td.j;
import vd.b0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final d f32192b = new d(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32193a;

    public /* synthetic */ d(int i11) {
        this.f32193a = i11;
    }

    @Override // he.b
    public final b0 k(b0 b0Var, j jVar) {
        byte[] bArrArray;
        switch (this.f32193a) {
            case 0:
                return b0Var;
            default:
                ByteBuffer byteBufferAsReadOnlyBuffer = ((i) ((ge.d) b0Var.get()).f29140a.f29139b).f29154a.f51562d.asReadOnlyBuffer();
                AtomicReference atomicReference = pe.b.f46813a;
                b.a aVar = (byteBufferAsReadOnlyBuffer.isReadOnly() || !byteBufferAsReadOnlyBuffer.hasArray()) ? null : new b.a(byteBufferAsReadOnlyBuffer.array(), byteBufferAsReadOnlyBuffer.arrayOffset(), byteBufferAsReadOnlyBuffer.limit());
                if (aVar != null && aVar.f3413a == 0 && aVar.f3414b == ((byte[]) aVar.f3415c).length) {
                    bArrArray = byteBufferAsReadOnlyBuffer.array();
                } else {
                    ByteBuffer byteBufferAsReadOnlyBuffer2 = byteBufferAsReadOnlyBuffer.asReadOnlyBuffer();
                    byte[] bArr = new byte[byteBufferAsReadOnlyBuffer2.limit()];
                    byteBufferAsReadOnlyBuffer2.get(bArr);
                    bArrArray = bArr;
                }
                return new d0(bArrArray);
        }
    }
}
