package ag;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f693a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f694b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f695c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f696d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f697e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f698f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final c f699g;

    public b(boolean z11, c cVar, int i11) {
        this.f698f = i11;
        switch (i11) {
            case 1:
                this.f693a = z11;
                this.f699g = cVar;
                ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
                byteBufferAllocate.order(z11 ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
                cVar.d(byteBufferAllocate, 16L);
                cVar.c(byteBufferAllocate, 32L, 8);
                this.f694b = byteBufferAllocate.getLong();
                cVar.c(byteBufferAllocate, 40L, 8);
                this.f695c = byteBufferAllocate.getLong();
                this.f696d = cVar.d(byteBufferAllocate, 54L);
                this.f697e = cVar.d(byteBufferAllocate, 56L);
                cVar.d(byteBufferAllocate, 58L);
                cVar.d(byteBufferAllocate, 60L);
                cVar.d(byteBufferAllocate, 62L);
                break;
            default:
                this.f693a = z11;
                this.f699g = cVar;
                ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(4);
                byteBufferAllocate2.order(z11 ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
                cVar.d(byteBufferAllocate2, 16L);
                this.f694b = cVar.e(byteBufferAllocate2, 28L);
                this.f695c = cVar.e(byteBufferAllocate2, 32L);
                this.f696d = cVar.d(byteBufferAllocate2, 42L);
                this.f697e = cVar.d(byteBufferAllocate2, 44L);
                cVar.d(byteBufferAllocate2, 46L);
                cVar.d(byteBufferAllocate2, 48L);
                cVar.d(byteBufferAllocate2, 50L);
                break;
        }
    }

    public final d a(long j11) {
        switch (this.f698f) {
            case 0:
                d dVar = new d();
                ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
                byteBufferAllocate.order(this.f693a ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
                long j12 = (j11 * ((long) this.f696d)) + this.f694b;
                c cVar = this.f699g;
                dVar.f702a = cVar.e(byteBufferAllocate, j12);
                dVar.f703b = cVar.e(byteBufferAllocate, 4 + j12);
                dVar.f704c = cVar.e(byteBufferAllocate, 8 + j12);
                dVar.f705d = cVar.e(byteBufferAllocate, j12 + 20);
                return dVar;
            default:
                d dVar2 = new d();
                ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(8);
                byteBufferAllocate2.order(this.f693a ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
                long j13 = (j11 * ((long) this.f696d)) + this.f694b;
                c cVar2 = this.f699g;
                dVar2.f702a = cVar2.e(byteBufferAllocate2, j13);
                cVar2.c(byteBufferAllocate2, 8 + j13, 8);
                dVar2.f703b = byteBufferAllocate2.getLong();
                cVar2.c(byteBufferAllocate2, 16 + j13, 8);
                dVar2.f704c = byteBufferAllocate2.getLong();
                cVar2.c(byteBufferAllocate2, j13 + 40, 8);
                dVar2.f705d = byteBufferAllocate2.getLong();
                return dVar2;
        }
    }
}
