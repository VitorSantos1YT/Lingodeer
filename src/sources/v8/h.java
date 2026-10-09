package v8;

import b7.f0;
import java.util.ArrayDeque;
import ui.k;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class h implements u8.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayDeque f53798a = new ArrayDeque();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayDeque f53799b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayDeque f53800c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public g f53801d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f53802e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f53803f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f53804g;

    public h() {
        for (int i11 = 0; i11 < 10; i11++) {
            this.f53798a.add(new g(1));
        }
        this.f53799b = new ArrayDeque();
        for (int i12 = 0; i12 < 2; i12++) {
            ArrayDeque arrayDeque = this.f53799b;
            k kVar = new k(this, 3);
            u8.c cVar = new u8.c();
            cVar.H = kVar;
            arrayDeque.add(cVar);
        }
        this.f53800c = new ArrayDeque();
        this.f53804g = -9223372036854775807L;
    }

    @Override // e7.c
    public final void a(long j11) {
        this.f53804g = j11;
    }

    @Override // u8.e
    public final void b(long j11) {
        this.f53802e = j11;
    }

    @Override // e7.c
    public final Object d() {
        b7.a.j(this.f53801d == null);
        ArrayDeque arrayDeque = this.f53798a;
        if (arrayDeque.isEmpty()) {
            return null;
        }
        g gVar = (g) arrayDeque.pollFirst();
        this.f53801d = gVar;
        return gVar;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0033  */
    @Override // e7.c
    public final void e(u8.h hVar) {
        b7.a.d(hVar == this.f53801d);
        g gVar = (g) hVar;
        if (gVar.e(4)) {
            long j11 = this.f53803f;
            this.f53803f = 1 + j11;
            gVar.M = j11;
            this.f53800c.add(gVar);
        } else {
            long j12 = gVar.f25117t;
            if (j12 != Long.MIN_VALUE) {
                long j13 = this.f53804g;
                if (j13 == -9223372036854775807L || j12 >= j13) {
                    long j14 = this.f53803f;
                    this.f53803f = 1 + j14;
                    gVar.M = j14;
                    this.f53800c.add(gVar);
                } else {
                    gVar.n();
                    this.f53798a.add(gVar);
                }
            } else {
                long j15 = this.f53803f;
                this.f53803f = 1 + j15;
                gVar.M = j15;
                this.f53800c.add(gVar);
            }
        }
        this.f53801d = null;
    }

    public abstract tp.g f();

    @Override // e7.c
    public void flush() {
        ArrayDeque arrayDeque;
        this.f53803f = 0L;
        this.f53802e = 0L;
        while (true) {
            ArrayDeque arrayDeque2 = this.f53800c;
            boolean zIsEmpty = arrayDeque2.isEmpty();
            arrayDeque = this.f53798a;
            if (zIsEmpty) {
                break;
            }
            g gVar = (g) arrayDeque2.poll();
            String str = f0.f3975a;
            gVar.n();
            arrayDeque.add(gVar);
        }
        g gVar2 = this.f53801d;
        if (gVar2 != null) {
            gVar2.n();
            arrayDeque.add(gVar2);
            this.f53801d = null;
        }
    }

    public abstract void g(g gVar);

    @Override // e7.c
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public u8.c c() {
        ArrayDeque arrayDeque = this.f53799b;
        if (arrayDeque.isEmpty()) {
            return null;
        }
        while (true) {
            ArrayDeque arrayDeque2 = this.f53800c;
            if (arrayDeque2.isEmpty()) {
                return null;
            }
            g gVar = (g) arrayDeque2.peek();
            String str = f0.f3975a;
            if (gVar.f25117t > this.f53802e) {
                return null;
            }
            g gVar2 = (g) arrayDeque2.poll();
            boolean zE = gVar2.e(4);
            ArrayDeque arrayDeque3 = this.f53798a;
            if (zE) {
                u8.c cVar = (u8.c) arrayDeque.pollFirst();
                cVar.a(4);
                gVar2.n();
                arrayDeque3.add(gVar2);
                return cVar;
            }
            g(gVar2);
            if (i()) {
                tp.g gVarF = f();
                u8.c cVar2 = (u8.c) arrayDeque.pollFirst();
                long j11 = gVar2.f25117t;
                cVar2.f25118c = j11;
                cVar2.f52825e = gVarF;
                cVar2.f52826f = j11;
                gVar2.n();
                arrayDeque3.add(gVar2);
                return cVar2;
            }
            gVar2.n();
            arrayDeque3.add(gVar2);
        }
    }

    public abstract boolean i();

    @Override // e7.c
    public void release() {
    }
}
