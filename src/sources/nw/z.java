package nw;

import b0.s2;
import com.android.billingclient.api.d0;
import com.google.common.base.Preconditions;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class z {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f44283b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f44284c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f44285d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final y f44286e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ d0 f44288g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m00.i f44282a = new m00.i();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f44287f = false;

    public z(d0 d0Var, int i11, int i12, y yVar) {
        this.f44288g = d0Var;
        this.f44283b = i11;
        this.f44284c = i12;
        this.f44286e = yVar;
    }

    public final int a(int i11) {
        if (i11 <= 0 || Integer.MAX_VALUE - i11 >= this.f44284c) {
            int i12 = this.f44284c + i11;
            this.f44284c = i12;
            return i12;
        }
        throw new IllegalArgumentException("Window size overflow for stream: " + this.f44283b);
    }

    public final void b(int i11, m00.i iVar, boolean z11) {
        boolean zE;
        do {
            int iMin = Math.min(i11, ((d) this.f44288g.f7499c).f44198b.f44187a.f46125d);
            int i12 = -iMin;
            ((z) this.f44288g.f7500d).a(i12);
            a(i12);
            try {
                boolean z12 = false;
                ((d) this.f44288g.f7499c).b(iVar.f40718b == ((long) iMin) && z11, this.f44283b, iVar, iMin);
                mw.b bVar = (mw.b) this.f44286e;
                synchronized (bVar.f42343b) {
                    Preconditions.p("onStreamAllocated was not called, but it seems the stream is active", bVar.f42347f);
                    int i13 = bVar.f42346e;
                    boolean z13 = i13 < 32768;
                    int i14 = i13 - iMin;
                    bVar.f42346e = i14;
                    boolean z14 = i14 < 32768;
                    if (!z13 && z14) {
                        z12 = true;
                    }
                }
                if (z12) {
                    synchronized (bVar.f42343b) {
                        zE = bVar.e();
                    }
                    if (zE) {
                        bVar.f42351j.h();
                    }
                }
                i11 -= iMin;
            } catch (IOException e8) {
                throw new RuntimeException(e8);
            }
        } while (i11 > 0);
    }

    public final void c(int i11, s2 s2Var) {
        int i12 = this.f44284c;
        d0 d0Var = this.f44288g;
        int iMin = Math.min(i11, Math.min(i12, ((z) d0Var.f7500d).f44284c));
        int i13 = 0;
        while (true) {
            m00.i iVar = this.f44282a;
            long j11 = iVar.f40718b;
            if (j11 <= 0 || iMin <= 0) {
                return;
            }
            if (iMin >= j11) {
                int i14 = (int) j11;
                i13 += i14;
                b(i14, iVar, this.f44287f);
            } else {
                i13 += iMin;
                b(iMin, iVar, false);
            }
            s2Var.f3677a++;
            iMin = Math.min(i11 - i13, Math.min(this.f44284c, ((z) d0Var.f7500d).f44284c));
        }
    }
}
