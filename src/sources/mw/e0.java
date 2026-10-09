package mw;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.InvalidMarkException;
import java.util.ArrayDeque;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class e0 extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayDeque f42401a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ArrayDeque f42402b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f42403c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f42404d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final n3 f42398e = new n3(4);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final n3 f42399f = new n3(5);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final n3 f42400t = new n3(6);
    public static final n3 H = new n3(7);
    public static final n3 K = new n3(8);

    public e0() {
        new ArrayDeque(2);
        this.f42401a = new ArrayDeque();
    }

    public final int A(c0 c0Var, int i11, Object obj, int i12) {
        try {
            return y(c0Var, i11, obj, i12);
        } catch (IOException e8) {
            throw new AssertionError(e8);
        }
    }

    @Override // mw.d
    public final void b() throws IOException {
        ArrayDeque arrayDeque = this.f42402b;
        ArrayDeque arrayDeque2 = this.f42401a;
        if (arrayDeque == null) {
            this.f42402b = new ArrayDeque(Math.min(arrayDeque2.size(), 16));
        }
        while (!this.f42402b.isEmpty()) {
            ((d) this.f42402b.remove()).close();
        }
        this.f42404d = true;
        d dVar = (d) arrayDeque2.peek();
        if (dVar != null) {
            dVar.b();
        }
    }

    @Override // mw.d
    public final boolean c() {
        Iterator it = this.f42401a.iterator();
        while (it.hasNext()) {
            if (!((d) it.next()).c()) {
                return false;
            }
        }
        return true;
    }

    @Override // mw.d, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        while (true) {
            ArrayDeque arrayDeque = this.f42401a;
            if (arrayDeque.isEmpty()) {
                break;
            } else {
                ((d) arrayDeque.remove()).close();
            }
        }
        if (this.f42402b != null) {
            while (!this.f42402b.isEmpty()) {
                ((d) this.f42402b.remove()).close();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x005c, code lost:
    
        r1 = r1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [mw.d] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6, types: [mw.d] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2, types: [mw.e0] */
    /* JADX WARN: Type inference failed for: r1v3, types: [mw.e0] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    @Override // mw.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final mw.d d(int r8) throws java.io.IOException {
        /*
            r7 = this;
            if (r8 > 0) goto L5
            mw.e4 r8 = mw.f4.f42422a
            return r8
        L5:
            r7.a(r8)
            int r0 = r7.f42403c
            int r0 = r0 - r8
            r7.f42403c = r0
            r0 = 0
            r1 = r0
        Lf:
            java.util.ArrayDeque r2 = r7.f42401a
            java.lang.Object r3 = r2.peek()
            mw.d r3 = (mw.d) r3
            int r4 = r3.p()
            if (r4 <= r8) goto L23
            mw.d r8 = r3.d(r8)
            r3 = 0
            goto L39
        L23:
            boolean r5 = r7.f42404d
            if (r5 == 0) goto L2f
            mw.d r3 = r3.d(r4)
            r7.x()
            goto L35
        L2f:
            java.lang.Object r3 = r2.poll()
            mw.d r3 = (mw.d) r3
        L35:
            int r8 = r8 - r4
            r6 = r3
            r3 = r8
            r8 = r6
        L39:
            if (r0 != 0) goto L3d
            r0 = r8
            goto L5a
        L3d:
            if (r1 != 0) goto L57
            mw.e0 r1 = new mw.e0
            r4 = 2
            if (r3 != 0) goto L45
            goto L50
        L45:
            int r2 = r2.size()
            int r2 = r2 + r4
            r4 = 16
            int r4 = java.lang.Math.min(r2, r4)
        L50:
            r1.<init>(r4)
            r1.v(r0)
            r0 = r1
        L57:
            r1.v(r8)
        L5a:
            if (r3 > 0) goto L5d
            return r0
        L5d:
            r8 = r3
            goto Lf
        */
        throw new UnsupportedOperationException("Method not decompiled: mw.e0.d(int):mw.d");
    }

    @Override // mw.d
    public final void e(OutputStream outputStream, int i11) throws IOException {
        y(K, i11, outputStream, 0);
    }

    @Override // mw.d
    public final void f(ByteBuffer byteBuffer) {
        A(H, byteBuffer.remaining(), byteBuffer, 0);
    }

    @Override // mw.d
    public final void h(byte[] bArr, int i11, int i12) {
        A(f42400t, i12, bArr, i11);
    }

    @Override // mw.d
    public final int i() {
        return A(f42398e, 1, null, 0);
    }

    @Override // mw.d
    public final int p() {
        return this.f42403c;
    }

    @Override // mw.d
    public final void q(int i11) {
        A(f42399f, i11, null, 0);
    }

    @Override // mw.d
    public final void reset() {
        if (!this.f42404d) {
            throw new InvalidMarkException();
        }
        ArrayDeque arrayDeque = this.f42401a;
        d dVar = (d) arrayDeque.peek();
        if (dVar != null) {
            int iP = dVar.p();
            dVar.reset();
            this.f42403c = (dVar.p() - iP) + this.f42403c;
        }
        while (true) {
            d dVar2 = (d) this.f42402b.pollLast();
            if (dVar2 == null) {
                return;
            }
            dVar2.reset();
            arrayDeque.addFirst(dVar2);
            this.f42403c = dVar2.p() + this.f42403c;
        }
    }

    public final void v(d dVar) throws IOException {
        boolean z11 = this.f42404d;
        ArrayDeque arrayDeque = this.f42401a;
        boolean z12 = z11 && arrayDeque.isEmpty();
        if (dVar instanceof e0) {
            e0 e0Var = (e0) dVar;
            ArrayDeque arrayDeque2 = e0Var.f42401a;
            while (!arrayDeque2.isEmpty()) {
                arrayDeque.add((d) arrayDeque2.remove());
            }
            this.f42403c += e0Var.f42403c;
            e0Var.f42403c = 0;
            e0Var.close();
        } else {
            arrayDeque.add(dVar);
            this.f42403c = dVar.p() + this.f42403c;
        }
        if (z12) {
            ((d) arrayDeque.peek()).b();
        }
    }

    public final void x() throws IOException {
        boolean z11 = this.f42404d;
        ArrayDeque arrayDeque = this.f42401a;
        if (!z11) {
            ((d) arrayDeque.remove()).close();
            return;
        }
        this.f42402b.add((d) arrayDeque.remove());
        d dVar = (d) arrayDeque.peek();
        if (dVar != null) {
            dVar.b();
        }
    }

    public final int y(d0 d0Var, int i11, Object obj, int i12) throws IOException {
        a(i11);
        ArrayDeque arrayDeque = this.f42401a;
        if (!arrayDeque.isEmpty() && ((d) arrayDeque.peek()).p() == 0) {
            x();
        }
        while (i11 > 0 && !arrayDeque.isEmpty()) {
            d dVar = (d) arrayDeque.peek();
            int iMin = Math.min(i11, dVar.p());
            i12 = d0Var.o(dVar, iMin, obj, i12);
            i11 -= iMin;
            this.f42403c -= iMin;
            if (((d) arrayDeque.peek()).p() == 0) {
                x();
            }
        }
        if (i11 <= 0) {
            return i12;
        }
        throw new AssertionError("Failed executing read operation");
    }

    public e0(int i11) {
        new ArrayDeque(2);
        this.f42401a = new ArrayDeque(i11);
    }
}
