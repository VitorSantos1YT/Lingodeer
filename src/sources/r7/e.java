package r7;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Parcel;
import androidx.media3.extractor.text.SubtitleDecoderException;
import com.android.billingclient.api.m;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableListIterator;
import f7.a0;
import f7.u;
import f7.x;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Objects;
import lp.j;
import p7.b0;
import p7.z0;
import re.g0;
import re.v;
import u8.h;
import u8.k;
import v8.f;
import y6.d0;
import y6.p;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends f7.e implements Handler.Callback {
    public final v U;
    public final e7.d V;
    public a W;
    public final d X;
    public boolean Y;
    public int Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public u8.e f48833a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public h f48834b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public u8.c f48835c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public u8.c f48836d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public int f48837e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public final Handler f48838f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public final x f48839g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public final ob.e f48840h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public boolean f48841i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public boolean f48842j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public p f48843k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public long f48844l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public long f48845m0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(x xVar, Looper looper) {
        super(3);
        j jVar = d.C;
        this.f48839g0 = xVar;
        this.f48838f0 = looper == null ? null : new Handler(looper, this);
        this.X = jVar;
        this.U = new v(3);
        this.V = new e7.d(1);
        this.f48840h0 = new ob.e(8, false);
        this.f48845m0 = -9223372036854775807L;
        this.f48844l0 = -9223372036854775807L;
    }

    @Override // f7.e
    public final int B(p pVar) {
        boolean zEquals = Objects.equals(pVar.f57291n, "application/x-media3-cues");
        String str = pVar.f57291n;
        if (!zEquals) {
            j jVar = (j) this.X;
            jVar.getClass();
            if (!((g0) jVar.f40203b).l(pVar) && !Objects.equals(str, "application/cea-608") && !Objects.equals(str, "application/x-mp4-cea-608") && !Objects.equals(str, "application/cea-708")) {
                return d0.m(str) ? f7.e.a(1, 0, 0, 0) : f7.e.a(0, 0, 0, 0);
            }
        }
        return f7.e.a(pVar.O == 0 ? 4 : 2, 0, 0, 0);
    }

    public final void D() {
        b7.a.i("Legacy decoding is disabled, can't handle " + this.f48843k0.f57291n + " samples (expected application/x-media3-cues).", Objects.equals(this.f48843k0.f57291n, "application/cea-608") || Objects.equals(this.f48843k0.f57291n, "application/x-mp4-cea-608") || Objects.equals(this.f48843k0.f57291n, "application/cea-708"));
    }

    public final void E() {
        ImmutableList immutableListS = ImmutableList.s();
        G(this.f48844l0);
        a7.d dVar = new a7.d(immutableListS);
        Handler handler = this.f48838f0;
        if (handler != null) {
            handler.obtainMessage(1, dVar).sendToTarget();
        } else {
            I(dVar);
        }
    }

    public final long F() {
        if (this.f48837e0 == -1) {
            return Long.MAX_VALUE;
        }
        this.f48835c0.getClass();
        if (this.f48837e0 >= this.f48835c0.s()) {
            return Long.MAX_VALUE;
        }
        return this.f48835c0.j(this.f48837e0);
    }

    public final long G(long j11) {
        b7.a.j(j11 != -9223372036854775807L);
        return j11 - this.M;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0050  */
    /* JADX WARN: Code duplicated, block: B:24:0x0056  */
    /* JADX WARN: Code duplicated, block: B:27:0x0075  */
    public final void H() {
        u8.e bVar;
        byte b3 = 1;
        this.Y = true;
        p pVar = this.f48843k0;
        pVar.getClass();
        g0 g0Var = (g0) ((j) this.X).f40203b;
        String str = pVar.f57291n;
        int i11 = pVar.K;
        if (str != null) {
            switch (str.hashCode()) {
                case 930165504:
                    b3 = !str.equals("application/x-mp4-cea-608") ? (byte) -1 : (byte) 0;
                    break;
                case 1566015601:
                    if (!str.equals("application/cea-608")) {
                        b3 = -1;
                    }
                    break;
                case 1566016562:
                    b3 = !str.equals("application/cea-708") ? (byte) -1 : (byte) 2;
                    break;
                default:
                    b3 = -1;
                    break;
            }
            switch (b3) {
                case 0:
                case 1:
                    bVar = new v8.c(str, i11);
                    break;
                case 2:
                    bVar = new f(i11, pVar.f57294q);
                    break;
                default:
                    if (g0Var.l(pVar)) {
                        throw new IllegalArgumentException(ep.a.e("Attempted to create decoder for unsupported MIME type: ", str));
                    }
                    k kVarH = g0Var.h(pVar);
                    kVarH.getClass().getSimpleName().concat("Decoder");
                    bVar = new b(kVarH);
                    break;
                    break;
            }
        } else {
            if (g0Var.l(pVar)) {
                throw new IllegalArgumentException(ep.a.e("Attempted to create decoder for unsupported MIME type: ", str));
            }
            k kVarH2 = g0Var.h(pVar);
            kVarH2.getClass().getSimpleName().concat("Decoder");
            bVar = new b(kVarH2);
        }
        this.f48833a0 = bVar;
        bVar.a(this.N);
    }

    public final void I(a7.d dVar) {
        ImmutableList immutableList = dVar.f433a;
        x xVar = this.f48839g0;
        xVar.f26935a.P.e(27, new u(immutableList));
        a0 a0Var = xVar.f26935a;
        a0Var.H0 = dVar;
        a0Var.P.e(27, new com.google.firebase.database.android.d(dVar, 14));
    }

    public final void J() {
        this.f48834b0 = null;
        this.f48837e0 = -1;
        u8.c cVar = this.f48835c0;
        if (cVar != null) {
            cVar.o();
            this.f48835c0 = null;
        }
        u8.c cVar2 = this.f48836d0;
        if (cVar2 != null) {
            cVar2.o();
            this.f48836d0 = null;
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 1) {
            throw new IllegalStateException();
        }
        I((a7.d) message.obj);
        return true;
    }

    @Override // f7.e
    public final String k() {
        return "TextRenderer";
    }

    @Override // f7.e
    public final boolean m() {
        return this.f48842j0;
    }

    @Override // f7.e
    public final boolean o() {
        p pVar = this.f48843k0;
        if (pVar != null) {
            if (Objects.equals(pVar.f57291n, "application/x-media3-cues")) {
                a aVar = this.W;
                aVar.getClass();
                if (aVar.a(this.f48844l0) == Long.MIN_VALUE) {
                    try {
                        z0 z0Var = this.K;
                        z0Var.getClass();
                        z0Var.b();
                        return true;
                    } catch (IOException unused) {
                        return false;
                    }
                }
            } else {
                if (this.f48842j0) {
                    return false;
                }
                if (this.f48841i0) {
                    u8.c cVar = this.f48835c0;
                    long j11 = this.f48844l0;
                    if (cVar == null || cVar.s() <= 0 || cVar.j(cVar.s() - 1) <= j11) {
                        u8.c cVar2 = this.f48836d0;
                        long j12 = this.f48844l0;
                        if ((cVar2 == null || cVar2.s() <= 0 || cVar2.j(cVar2.s() - 1) <= j12) && this.f48834b0 != null) {
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }

    @Override // f7.e
    public final void p() {
        this.f48843k0 = null;
        this.f48845m0 = -9223372036854775807L;
        E();
        this.f48844l0 = -9223372036854775807L;
        if (this.f48833a0 != null) {
            J();
            u8.e eVar = this.f48833a0;
            eVar.getClass();
            eVar.release();
            this.f48833a0 = null;
            this.Z = 0;
        }
    }

    @Override // f7.e
    public final void r(long j11, boolean z11) {
        this.f48844l0 = j11;
        a aVar = this.W;
        if (aVar != null) {
            aVar.clear();
        }
        E();
        this.f48841i0 = false;
        this.f48842j0 = false;
        this.f48845m0 = -9223372036854775807L;
        p pVar = this.f48843k0;
        if (pVar == null || Objects.equals(pVar.f57291n, "application/x-media3-cues")) {
            return;
        }
        if (this.Z == 0) {
            J();
            u8.e eVar = this.f48833a0;
            eVar.getClass();
            eVar.flush();
            eVar.a(this.N);
            return;
        }
        J();
        u8.e eVar2 = this.f48833a0;
        eVar2.getClass();
        eVar2.release();
        this.f48833a0 = null;
        this.Z = 0;
        H();
    }

    @Override // f7.e
    public final void w(p[] pVarArr, long j11, long j12, b0 b0Var) {
        p pVar = pVarArr[0];
        this.f48843k0 = pVar;
        if (Objects.equals(pVar.f57291n, "application/x-media3-cues")) {
            this.W = this.f48843k0.L == 1 ? new c() : new m(3);
            return;
        }
        D();
        if (this.f48833a0 != null) {
            this.Z = 1;
        } else {
            H();
        }
    }

    @Override // f7.e
    public final void y(long j11, long j12) {
        boolean z11;
        long j13;
        if (this.P) {
            long j14 = this.f48845m0;
            if (j14 != -9223372036854775807L && j11 >= j14) {
                J();
                this.f48842j0 = true;
            }
        }
        if (this.f48842j0) {
            return;
        }
        p pVar = this.f48843k0;
        pVar.getClass();
        boolean zEquals = Objects.equals(pVar.f57291n, "application/x-media3-cues");
        Handler handler = this.f48838f0;
        ob.e eVar = this.f48840h0;
        boolean zD = false;
        zD = false;
        zD = false;
        if (zEquals) {
            this.W.getClass();
            if (!this.f48841i0) {
                e7.d dVar = this.V;
                if (x(eVar, dVar, 0) == -4) {
                    if (dVar.e(4)) {
                        this.f48841i0 = true;
                    } else {
                        dVar.r();
                        ByteBuffer byteBuffer = dVar.f25115e;
                        byteBuffer.getClass();
                        long j15 = dVar.f25117t;
                        byte[] bArrArray = byteBuffer.array();
                        int iArrayOffset = byteBuffer.arrayOffset();
                        int iLimit = byteBuffer.limit();
                        this.U.getClass();
                        Parcel parcelObtain = Parcel.obtain();
                        parcelObtain.unmarshall(bArrArray, iArrayOffset, iLimit);
                        parcelObtain.setDataPosition(0);
                        Bundle bundle = parcelObtain.readBundle(Bundle.class.getClassLoader());
                        parcelObtain.recycle();
                        ArrayList parcelableArrayList = bundle.getParcelableArrayList("c");
                        parcelableArrayList.getClass();
                        a7.c cVar = new a7.c(11);
                        UnmodifiableListIterator unmodifiableListIterator = ImmutableList.f16771b;
                        ImmutableList.Builder builder = new ImmutableList.Builder();
                        for (int i11 = 0; i11 < parcelableArrayList.size(); i11++) {
                            Bundle bundle2 = (Bundle) parcelableArrayList.get(i11);
                            bundle2.getClass();
                            builder.h(cVar.apply(bundle2));
                        }
                        u8.a aVar = new u8.a(j15, bundle.getLong("d"), builder.j());
                        dVar.n();
                        zD = this.W.d(aVar, j11);
                    }
                }
            }
            long jA = this.W.a(this.f48844l0);
            if (jA == Long.MIN_VALUE && this.f48841i0 && !zD) {
                this.f48842j0 = true;
            }
            if (jA != Long.MIN_VALUE && jA <= j11) {
                zD = true;
            }
            if (zD) {
                ImmutableList immutableListB = this.W.b(j11);
                long jC = this.W.c(j11);
                G(jC);
                a7.d dVar2 = new a7.d(immutableListB);
                if (handler != null) {
                    handler.obtainMessage(1, dVar2).sendToTarget();
                } else {
                    I(dVar2);
                }
                this.W.e(jC);
            }
            this.f48844l0 = j11;
            return;
        }
        D();
        this.f48844l0 = j11;
        if (this.f48836d0 == null) {
            u8.e eVar2 = this.f48833a0;
            eVar2.getClass();
            eVar2.b(j11);
            try {
                u8.e eVar3 = this.f48833a0;
                eVar3.getClass();
                this.f48836d0 = (u8.c) eVar3.c();
            } catch (SubtitleDecoderException e8) {
                b7.a.p("Subtitle decoding failed. streamFormat=" + this.f48843k0, e8);
                E();
                J();
                u8.e eVar4 = this.f48833a0;
                eVar4.getClass();
                eVar4.release();
                this.f48833a0 = null;
                this.Z = 0;
                H();
                return;
            }
        }
        if (this.H != 2) {
            return;
        }
        if (this.f48835c0 != null) {
            long jF = F();
            z11 = false;
            while (jF <= j11) {
                this.f48837e0++;
                jF = F();
                z11 = true;
            }
        } else {
            z11 = false;
        }
        u8.c cVar2 = this.f48836d0;
        boolean z12 = z11;
        if (cVar2 != null) {
            if (cVar2.e(4)) {
                if (!z11) {
                    z12 = z11;
                    if (F() == Long.MAX_VALUE) {
                        if (this.Z == 2) {
                            J();
                            u8.e eVar5 = this.f48833a0;
                            eVar5.getClass();
                            eVar5.release();
                            this.f48833a0 = null;
                            this.Z = 0;
                            H();
                        } else {
                            J();
                            this.f48842j0 = true;
                        }
                    }
                }
            } else if (cVar2.f25118c <= j11) {
                u8.c cVar3 = this.f48835c0;
                if (cVar3 != null) {
                    z12 = z11;
                    z12 = z11;
                    cVar3.o();
                }
                z12 = z11;
                z12 = z11;
                this.f48837e0 = cVar2.f(j11);
                this.f48835c0 = cVar2;
                this.f48836d0 = null;
                z12 = true;
            }
        }
        if (z12) {
            z12 = z11;
            z12 = z11;
            this.f48835c0.getClass();
            int iF = this.f48835c0.f(j11);
            if (iF == 0 || this.f48835c0.s() == 0) {
                j13 = this.f48835c0.f25118c;
            } else if (iF == -1) {
                u8.c cVar4 = this.f48835c0;
                j13 = cVar4.j(cVar4.s() - 1);
            } else {
                j13 = this.f48835c0.j(iF - 1);
            }
            G(j13);
            a7.d dVar3 = new a7.d(this.f48835c0.p(j11));
            if (handler != null) {
                handler.obtainMessage(1, dVar3).sendToTarget();
            } else {
                I(dVar3);
            }
        }
        z12 = z11;
        z12 = z11;
        if (this.Z == 2) {
            return;
        }
        while (!this.f48841i0) {
            try {
                h hVar = this.f48834b0;
                if (hVar == null) {
                    u8.e eVar6 = this.f48833a0;
                    eVar6.getClass();
                    hVar = (h) eVar6.d();
                    if (hVar == null) {
                        return;
                    } else {
                        this.f48834b0 = hVar;
                    }
                }
                if (this.Z == 1) {
                    hVar.f6652b = 4;
                    u8.e eVar7 = this.f48833a0;
                    eVar7.getClass();
                    eVar7.e(hVar);
                    this.f48834b0 = null;
                    this.Z = 2;
                    return;
                }
                int iX = x(eVar, hVar, 0);
                if (iX == -4) {
                    if (hVar.e(4)) {
                        this.f48841i0 = true;
                        this.Y = false;
                    } else {
                        p pVar2 = (p) eVar.f44805c;
                        if (pVar2 == null) {
                            return;
                        }
                        hVar.L = pVar2.f57296s;
                        hVar.r();
                        this.Y &= !hVar.e(1);
                    }
                    if (!this.Y) {
                        u8.e eVar8 = this.f48833a0;
                        eVar8.getClass();
                        eVar8.e(hVar);
                        this.f48834b0 = null;
                    }
                } else if (iX == -3) {
                    return;
                }
            } catch (SubtitleDecoderException e10) {
                b7.a.p("Subtitle decoding failed. streamFormat=" + this.f48843k0, e10);
                E();
                J();
                u8.e eVar9 = this.f48833a0;
                eVar9.getClass();
                eVar9.release();
                this.f48833a0 = null;
                this.Z = 0;
                H();
                return;
            }
        }
    }
}
