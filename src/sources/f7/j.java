package f7;

import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t7.g f26802a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f26803b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f26804c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f26805d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f26806e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f26807f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f26808g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final HashMap f26809h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f26810i;

    public j() {
        t7.g gVar = new t7.g();
        a("bufferForPlaybackMs", 1000, 0, "0");
        a("bufferForPlaybackAfterRebufferMs", 2000, 0, "0");
        a("minBufferMs", 50000, 1000, "bufferForPlaybackMs");
        a("minBufferMs", 50000, 2000, "bufferForPlaybackAfterRebufferMs");
        a("maxBufferMs", 50000, 50000, "minBufferMs");
        a("backBufferDurationMs", 0, 0, "0");
        this.f26802a = gVar;
        long j11 = 50000;
        this.f26803b = b7.f0.K(j11);
        this.f26804c = b7.f0.K(j11);
        this.f26805d = b7.f0.K(1000);
        this.f26806e = b7.f0.K(2000);
        this.f26807f = -1;
        this.f26808g = b7.f0.K(0);
        this.f26809h = new HashMap();
        this.f26810i = -1L;
    }

    public static void a(String str, int i11, int i12, String str2) {
        b7.a.c(str + " cannot be less than " + str2, i11 >= i12);
    }

    public final int b() {
        Iterator it = this.f26809h.values().iterator();
        int i11 = 0;
        while (it.hasNext()) {
            i11 += ((i) it.next()).f26796b;
        }
        return i11;
    }

    public final boolean c(h0 h0Var) {
        int i11;
        long j11 = this.f26804c;
        i iVar = (i) this.f26809h.get(h0Var.f26789a);
        iVar.getClass();
        t7.g gVar = this.f26802a;
        synchronized (gVar) {
            i11 = gVar.f52063d * gVar.f52061b;
        }
        boolean z11 = i11 >= b();
        long jMin = this.f26803b;
        float f5 = h0Var.f26791c;
        if (f5 > 1.0f) {
            jMin = Math.min(b7.f0.u(jMin, f5), j11);
        }
        long jMax = Math.max(jMin, 500000L);
        long j12 = h0Var.f26790b;
        if (j12 < jMax) {
            iVar.f26795a = !z11;
            if (z11 && j12 < 500000) {
                b7.a.B("Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j12 >= j11 || z11) {
            iVar.f26795a = false;
        }
        return iVar.f26795a;
    }

    public final void d() {
        if (!this.f26809h.isEmpty()) {
            this.f26802a.a(b());
            return;
        }
        t7.g gVar = this.f26802a;
        synchronized (gVar) {
            if (gVar.f52060a) {
                gVar.a(0);
            }
        }
    }
}
