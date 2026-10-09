package mw;

import com.alibaba.sdk.android.oss.common.OSSConstants;
import com.google.common.base.Preconditions;
import com.google.internal.firebase.inappmessaging.v1.sdkserving.FetchEligibleCampaignsRequest;
import com.google.protobuf.ExtensionRegistryLite;
import io.grpc.StatusRuntimeException;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class m3 implements g1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f42536a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public nw.x f42538c;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ay.k0 f42542g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final n5 f42543h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f42544i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f42545j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f42547l;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f42537b = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public lw.l f42539d = lw.k.f40407b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final m00.h f42540e = new m00.h(this, 1);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ByteBuffer f42541f = ByteBuffer.allocate(5);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f42546k = -1;

    public m3(c cVar, ay.k0 k0Var, n5 n5Var) {
        this.f42536a = cVar;
        this.f42542g = k0Var;
        this.f42543h = n5Var;
    }

    public static int h(qw.a aVar, OutputStream outputStream) throws IOException {
        FetchEligibleCampaignsRequest fetchEligibleCampaignsRequest = aVar.f48454a;
        if (fetchEligibleCampaignsRequest != null) {
            int iK = fetchEligibleCampaignsRequest.k(null);
            aVar.f48454a.o(outputStream);
            aVar.f48454a = null;
            return iK;
        }
        ByteArrayInputStream byteArrayInputStream = aVar.f48456c;
        if (byteArrayInputStream == null) {
            return 0;
        }
        ExtensionRegistryLite extensionRegistryLite = qw.c.f48461a;
        Preconditions.k(outputStream, "outputStream cannot be null!");
        byte[] bArr = new byte[OSSConstants.DEFAULT_BUFFER_SIZE];
        long j11 = 0;
        while (true) {
            int i11 = byteArrayInputStream.read(bArr);
            if (i11 == -1) {
                int i12 = (int) j11;
                aVar.f48456c = null;
                return i12;
            }
            outputStream.write(bArr, 0, i11);
            j11 += (long) i11;
        }
    }

    public final void a(boolean z11, boolean z12) {
        nw.x xVar = this.f42538c;
        this.f42538c = null;
        this.f42536a.v(xVar, z11, z12, this.f42545j);
        this.f42545j = 0;
    }

    public final void b(l3 l3Var, boolean z11) {
        ArrayList arrayList = l3Var.f42523a;
        int size = arrayList.size();
        int i11 = 0;
        int i12 = 0;
        while (i12 < size) {
            Object obj = arrayList.get(i12);
            i12++;
            i11 += ((nw.x) obj).f44281c;
        }
        int i13 = this.f42537b;
        if (i13 >= 0 && i11 > i13) {
            lw.q1 q1Var = lw.q1.f40439j;
            Locale locale = Locale.US;
            throw q1Var.h("message too large " + i11 + " > " + i13).a();
        }
        ByteBuffer byteBuffer = this.f42541f;
        byteBuffer.clear();
        byteBuffer.put(z11 ? (byte) 1 : (byte) 0).putInt(i11);
        this.f42542g.getClass();
        nw.x xVarM = ay.k0.m(5);
        xVarM.a(byteBuffer.array(), 0, byteBuffer.position());
        if (i11 == 0) {
            this.f42538c = xVarM;
            return;
        }
        int i14 = this.f42545j - 1;
        c cVar = this.f42536a;
        cVar.v(xVarM, false, false, i14);
        this.f42545j = 1;
        for (int i15 = 0; i15 < arrayList.size() - 1; i15++) {
            cVar.v((nw.x) arrayList.get(i15), false, false, 0);
        }
        this.f42538c = (nw.x) nv.p.f(1, arrayList);
        this.f42547l = i11;
    }

    @Override // mw.g1
    public final g1 c(lw.l lVar) {
        this.f42539d = lVar;
        return this;
    }

    @Override // mw.g1
    public final void close() {
        if (this.f42544i) {
            return;
        }
        this.f42544i = true;
        nw.x xVar = this.f42538c;
        if (xVar != null && xVar.f44281c == 0) {
            this.f42538c = null;
        }
        a(true, true);
    }

    @Override // mw.g1
    public final void d(int i11) {
        Preconditions.p("max size already set", this.f42537b == -1);
        this.f42537b = i11;
    }

    @Override // mw.g1
    public final void e(qw.a aVar) {
        if (this.f42544i) {
            throw new IllegalStateException("Framer already closed");
        }
        this.f42545j++;
        int i11 = this.f42546k + 1;
        this.f42546k = i11;
        this.f42547l = 0L;
        n5 n5Var = this.f42543h;
        lw.j[] jVarArr = n5Var.f42589a;
        lw.j[] jVarArr2 = n5Var.f42589a;
        for (lw.j jVar : jVarArr) {
            jVar.i(i11);
        }
        boolean z11 = this.f42539d != lw.k.f40407b;
        try {
            int iAvailable = aVar.available();
            int i12 = (iAvailable == 0 || !z11) ? i(aVar, iAvailable) : f(aVar);
            if (iAvailable != -1 && i12 != iAvailable) {
                throw lw.q1.f40441l.h(nv.p.p("Message length inaccurate ", i12, iAvailable, " != ")).a();
            }
            long j11 = i12;
            for (lw.j jVar2 : jVarArr2) {
                jVar2.k(j11);
            }
            long j12 = this.f42547l;
            for (lw.j jVar3 : jVarArr2) {
                jVar3.l(j12);
            }
            int i13 = this.f42546k;
            long j13 = this.f42547l;
            for (lw.j jVar4 : n5Var.f42589a) {
                jVar4.j(j13, i13, j11);
            }
        } catch (StatusRuntimeException e8) {
            throw e8;
        } catch (IOException e10) {
            throw lw.q1.f40441l.h("Failed to frame message").g(e10).a();
        } catch (RuntimeException e11) {
            throw lw.q1.f40441l.h("Failed to frame message").g(e11).a();
        }
    }

    public final int f(qw.a aVar) throws IOException {
        l3 l3Var = new l3(this);
        OutputStream outputStreamB = this.f42539d.b(l3Var);
        try {
            int iH = h(aVar, outputStreamB);
            outputStreamB.close();
            int i11 = this.f42537b;
            if (i11 < 0 || iH <= i11) {
                b(l3Var, true);
                return iH;
            }
            lw.q1 q1Var = lw.q1.f40439j;
            Locale locale = Locale.US;
            throw q1Var.h("message too large " + iH + " > " + i11).a();
        } catch (Throwable th2) {
            outputStreamB.close();
            throw th2;
        }
    }

    @Override // mw.g1
    public final void flush() {
        nw.x xVar = this.f42538c;
        if (xVar == null || xVar.f44281c <= 0) {
            return;
        }
        a(false, true);
    }

    public final void g(byte[] bArr, int i11, int i12) {
        while (i12 > 0) {
            nw.x xVar = this.f42538c;
            if (xVar != null && xVar.f44280b == 0) {
                a(false, false);
            }
            if (this.f42538c == null) {
                this.f42542g.getClass();
                this.f42538c = ay.k0.m(i12);
            }
            int iMin = Math.min(i12, this.f42538c.f44280b);
            this.f42538c.a(bArr, i11, iMin);
            i11 += iMin;
            i12 -= iMin;
        }
    }

    public final int i(qw.a aVar, int i11) throws IOException {
        if (i11 == -1) {
            l3 l3Var = new l3(this);
            int iH = h(aVar, l3Var);
            b(l3Var, false);
            return iH;
        }
        this.f42547l = i11;
        int i12 = this.f42537b;
        if (i12 >= 0 && i11 > i12) {
            lw.q1 q1Var = lw.q1.f40439j;
            Locale locale = Locale.US;
            throw q1Var.h("message too large " + i11 + " > " + i12).a();
        }
        ByteBuffer byteBuffer = this.f42541f;
        byteBuffer.clear();
        byteBuffer.put((byte) 0).putInt(i11);
        if (this.f42538c == null) {
            int iPosition = byteBuffer.position() + i11;
            this.f42542g.getClass();
            this.f42538c = ay.k0.m(iPosition);
        }
        g(byteBuffer.array(), 0, byteBuffer.position());
        return h(aVar, this.f42540e);
    }

    @Override // mw.g1
    public final boolean isClosed() {
        return this.f42544i;
    }
}
