package e7;

import androidx.media3.decoder.DecoderException;
import java.util.ArrayDeque;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class g implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f25122a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final d[] f25126e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final e[] f25127f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f25128g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f25129h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public d f25130i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public DecoderException f25131j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f25132k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f25133l;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f25123b = new Object();
    public long m = -9223372036854775807L;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayDeque f25124c = new ArrayDeque();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayDeque f25125d = new ArrayDeque();

    public g(d[] dVarArr, e[] eVarArr) {
        this.f25126e = dVarArr;
        this.f25128g = dVarArr.length;
        for (int i11 = 0; i11 < this.f25128g; i11++) {
            this.f25126e[i11] = f();
        }
        this.f25127f = eVarArr;
        this.f25129h = eVarArr.length;
        for (int i12 = 0; i12 < this.f25129h; i12++) {
            this.f25127f[i12] = g();
        }
        f fVar = new f(this);
        this.f25122a = fVar;
        fVar.start();
    }

    @Override // e7.c
    public final void a(long j11) {
        synchronized (this.f25123b) {
            try {
                b7.a.j(this.f25128g == this.f25126e.length || this.f25132k);
                this.m = j11;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // e7.c
    public final Object d() {
        d dVar;
        synchronized (this.f25123b) {
            try {
                DecoderException decoderException = this.f25131j;
                if (decoderException != null) {
                    throw decoderException;
                }
                b7.a.j(this.f25130i == null);
                int i11 = this.f25128g;
                if (i11 == 0) {
                    dVar = null;
                } else {
                    d[] dVarArr = this.f25126e;
                    int i12 = i11 - 1;
                    this.f25128g = i12;
                    dVar = dVarArr[i12];
                }
                this.f25130i = dVar;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return dVar;
    }

    public abstract d f();

    @Override // e7.c
    public final void flush() {
        synchronized (this.f25123b) {
            try {
                this.f25132k = true;
                d dVar = this.f25130i;
                if (dVar != null) {
                    dVar.n();
                    d[] dVarArr = this.f25126e;
                    int i11 = this.f25128g;
                    this.f25128g = i11 + 1;
                    dVarArr[i11] = dVar;
                    this.f25130i = null;
                }
                while (!this.f25124c.isEmpty()) {
                    d dVar2 = (d) this.f25124c.removeFirst();
                    dVar2.n();
                    d[] dVarArr2 = this.f25126e;
                    int i12 = this.f25128g;
                    this.f25128g = i12 + 1;
                    dVarArr2[i12] = dVar2;
                }
                while (!this.f25125d.isEmpty()) {
                    ((e) this.f25125d.removeFirst()).o();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public abstract e g();

    public abstract DecoderException h(Throwable th2);

    public abstract DecoderException i(d dVar, e eVar, boolean z11);

    public final boolean j() {
        boolean z11;
        DecoderException decoderExceptionH;
        synchronized (this.f25123b) {
            while (!this.f25133l) {
                try {
                    if (!this.f25124c.isEmpty() && this.f25129h > 0) {
                        break;
                    }
                    this.f25123b.wait();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (this.f25133l) {
                return false;
            }
            d dVar = (d) this.f25124c.removeFirst();
            e[] eVarArr = this.f25127f;
            int i11 = this.f25129h - 1;
            this.f25129h = i11;
            e eVar = eVarArr[i11];
            boolean z12 = this.f25132k;
            this.f25132k = false;
            if (dVar.e(4)) {
                eVar.a(4);
            } else {
                eVar.f25118c = dVar.f25117t;
                if (dVar.e(134217728)) {
                    eVar.a(134217728);
                }
                long j11 = dVar.f25117t;
                synchronized (this.f25123b) {
                    long j12 = this.m;
                    z11 = j12 == -9223372036854775807L || j11 >= j12;
                }
                if (!z11) {
                    eVar.f25119d = true;
                }
                try {
                    decoderExceptionH = i(dVar, eVar, z12);
                } catch (OutOfMemoryError e8) {
                    decoderExceptionH = h(e8);
                } catch (RuntimeException e10) {
                    decoderExceptionH = h(e10);
                }
                if (decoderExceptionH != null) {
                    synchronized (this.f25123b) {
                        this.f25131j = decoderExceptionH;
                    }
                    return false;
                }
            }
            synchronized (this.f25123b) {
                try {
                    if (this.f25132k || eVar.f25119d) {
                        eVar.o();
                    } else {
                        this.f25125d.addLast(eVar);
                    }
                    dVar.n();
                    d[] dVarArr = this.f25126e;
                    int i12 = this.f25128g;
                    this.f25128g = i12 + 1;
                    dVarArr[i12] = dVar;
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            return true;
        }
    }

    @Override // e7.c
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public final e c() {
        synchronized (this.f25123b) {
            try {
                DecoderException decoderException = this.f25131j;
                if (decoderException != null) {
                    throw decoderException;
                }
                if (this.f25125d.isEmpty()) {
                    return null;
                }
                return (e) this.f25125d.removeFirst();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // e7.c
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public final void e(d dVar) {
        synchronized (this.f25123b) {
            try {
                DecoderException decoderException = this.f25131j;
                if (decoderException != null) {
                    throw decoderException;
                }
                b7.a.d(dVar == this.f25130i);
                this.f25124c.addLast(dVar);
                if (!this.f25124c.isEmpty() && this.f25129h > 0) {
                    this.f25123b.notify();
                }
                this.f25130i = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void m(e eVar) {
        synchronized (this.f25123b) {
            eVar.n();
            e[] eVarArr = this.f25127f;
            int i11 = this.f25129h;
            this.f25129h = i11 + 1;
            eVarArr[i11] = eVar;
            if (!this.f25124c.isEmpty() && this.f25129h > 0) {
                this.f25123b.notify();
            }
        }
    }

    @Override // e7.c
    public final void release() {
        synchronized (this.f25123b) {
            this.f25133l = true;
            this.f25123b.notify();
        }
        try {
            this.f25122a.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }
}
