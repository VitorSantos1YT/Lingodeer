package h7;

import a0.b2;
import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.AudioTrack;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.Pair;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.audio.AudioSink$ConfigurationException;
import androidx.media3.exoplayer.audio.AudioSink$InitializationException;
import androidx.media3.exoplayer.audio.AudioSink$WriteException;
import b7.f0;
import com.google.common.collect.ImmutableList;
import f7.e1;
import f7.k0;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.AbstractCollection;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import mf.sOm.txBUGYhC;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class a0 extends m7.p implements k0 {

    /* JADX INFO: renamed from: h1, reason: collision with root package name */
    public final ob.l f31806h1;

    /* JADX INFO: renamed from: i1, reason: collision with root package name */
    public final x f31807i1;

    /* JADX INFO: renamed from: j1, reason: collision with root package name */
    public final m7.j f31808j1;

    /* JADX INFO: renamed from: k1, reason: collision with root package name */
    public int f31809k1;

    /* JADX INFO: renamed from: l1, reason: collision with root package name */
    public boolean f31810l1;

    /* JADX INFO: renamed from: m1, reason: collision with root package name */
    public y6.p f31811m1;

    /* JADX INFO: renamed from: n1, reason: collision with root package name */
    public y6.p f31812n1;

    /* JADX INFO: renamed from: o1, reason: collision with root package name */
    public long f31813o1;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    public boolean f31814p1;

    /* JADX INFO: renamed from: q1, reason: collision with root package name */
    public boolean f31815q1;

    /* JADX INFO: renamed from: r1, reason: collision with root package name */
    public boolean f31816r1;

    /* JADX INFO: renamed from: s1, reason: collision with root package name */
    public int f31817s1;

    /* JADX INFO: renamed from: t1, reason: collision with root package name */
    public boolean f31818t1;

    /* JADX INFO: renamed from: u1, reason: collision with root package name */
    public long f31819u1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(Context context, m7.k kVar, Handler handler, f7.x xVar, x xVar2) {
        super(1, kVar, 44100.0f);
        m7.j jVar = Build.VERSION.SDK_INT >= 35 ? new m7.j() : null;
        context.getApplicationContext();
        this.f31807i1 = xVar2;
        this.f31808j1 = jVar;
        this.f31817s1 = -1000;
        this.f31806h1 = new ob.l(11, handler, xVar);
        this.f31819u1 = -9223372036854775807L;
        xVar2.f31993s = new b2(this, 15);
    }

    @Override // m7.p
    public final f7.g E(m7.n nVar, y6.p pVar, y6.p pVar2) {
        f7.g gVarB = nVar.b(pVar, pVar2);
        int i11 = gVarB.f26740e;
        if (this.f41013h0 == null && t0(pVar2)) {
            i11 |= 32768;
        }
        "OMX.google.raw.decoder".equals(nVar.f40984a);
        if (pVar2.f57292o > this.f31809k1) {
            i11 |= 64;
        }
        int i12 = i11;
        return new f7.g(nVar.f40984a, pVar, pVar2, i12 != 0 ? 0 : gVarB.f26739d, i12);
    }

    @Override // m7.p
    public final float M(float f5, y6.p pVar, y6.p[] pVarArr) {
        int iMax = -1;
        for (y6.p pVar2 : pVarArr) {
            int i11 = pVar2.G;
            if (i11 != -1) {
                iMax = Math.max(iMax, i11);
            }
        }
        if (iMax == -1) {
            return -1.0f;
        }
        return iMax * f5;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x002d  */
    @Override // m7.p
    public final ArrayList N(m7.i iVar, y6.p pVar, boolean z11) {
        Collection collectionF;
        if (pVar.f57291n == null) {
            collectionF = ImmutableList.s();
        } else if (this.f31807i1.i(pVar) != 0) {
            List listD = m7.s.d("audio/raw", false, false);
            m7.n nVar = listD.isEmpty() ? null : (m7.n) listD.get(0);
            if (nVar != null) {
                collectionF = ImmutableList.u(nVar);
            } else {
                collectionF = m7.s.f(iVar, pVar, z11, false);
            }
        } else {
            collectionF = m7.s.f(iVar, pVar, z11, false);
        }
        HashMap map = m7.s.f41035a;
        ArrayList arrayList = new ArrayList(collectionF);
        Collections.sort(arrayList, new com.google.android.material.button.a(new hh.c(pVar, 10), 6));
        return arrayList;
    }

    @Override // m7.p
    public final long O(long j11, long j12) {
        long jR;
        boolean z11 = this.f31819u1 != -9223372036854775807L;
        if (this.f31818t1) {
            x xVar = this.f31807i1;
            if (xVar.o()) {
                AudioTrack audioTrack = xVar.f31997w;
                q qVar = xVar.f31995u;
                if (qVar.f31936c == 0) {
                    jR = f0.P(qVar.f31938e, audioTrack.getBufferSizeInFrames());
                } else {
                    long bufferSizeInFrames = audioTrack.getBufferSizeInFrames();
                    int i11 = x7.a.i(qVar.f31940g);
                    b7.a.j(i11 != -2147483647);
                    jR = f0.R(bufferSizeInFrames, 1000000L, i11, RoundingMode.DOWN);
                }
            } else {
                jR = -9223372036854775807L;
            }
            if (z11 && jR != -9223372036854775807L) {
                float fMin = Math.min(jR, this.f31819u1 - j11);
                y6.e0 e0Var = xVar.D;
                float f5 = e0Var != null ? e0Var.f57185a : 1.0f;
                this.f26705t.getClass();
                return Math.max(10000L, ((long) ((fMin / f5) / 2.0f)) - (f0.K(SystemClock.elapsedRealtime()) - j12));
            }
        } else if (z11 || this.U0) {
            return 1000000L;
        }
        return 10000L;
    }

    @Override // m7.p
    public final void Q(e7.d dVar) {
        y6.p pVar;
        if (Build.VERSION.SDK_INT < 29 || (pVar = dVar.f25113c) == null || !Objects.equals(pVar.f57291n, "audio/opus") || !this.H0) {
            return;
        }
        ByteBuffer byteBuffer = dVar.H;
        byteBuffer.getClass();
        y6.p pVar2 = dVar.f25113c;
        pVar2.getClass();
        int i11 = pVar2.I;
        if (byteBuffer.remaining() == 8) {
            this.f31807i1.w(i11, (int) ((byteBuffer.order(ByteOrder.LITTLE_ENDIAN).getLong() * 48000) / 1000000000));
        }
    }

    @Override // m7.p
    public final void W(Exception exc) {
        b7.a.p("Audio codec error", exc);
        ob.l lVar = this.f31806h1;
        Handler handler = (Handler) lVar.f44822b;
        if (handler != null) {
            handler.post(new i(lVar, exc, 0));
        }
    }

    @Override // m7.p
    public final void X(long j11, long j12, String str) {
        ob.l lVar = this.f31806h1;
        Handler handler = (Handler) lVar.f44822b;
        if (handler != null) {
            handler.post(new i(lVar, str, j11, j12));
        }
    }

    @Override // m7.p
    public final void Y(String str) {
        ob.l lVar = this.f31806h1;
        Handler handler = (Handler) lVar.f44822b;
        if (handler != null) {
            handler.post(new i(lVar, str, 4));
        }
    }

    @Override // m7.p
    public final f7.g Z(ob.e eVar) throws ExoPlaybackException {
        y6.p pVar = (y6.p) eVar.f44805c;
        pVar.getClass();
        this.f31811m1 = pVar;
        f7.g gVarZ = super.Z(eVar);
        ob.l lVar = this.f31806h1;
        Handler handler = (Handler) lVar.f44822b;
        if (handler != null) {
            handler.post(new i(lVar, pVar, gVarZ));
        }
        return gVarZ;
    }

    /* JADX WARN: Code duplicated, block: B:50:0x00ea A[Catch: AudioSink$ConfigurationException -> 0x00e8, TryCatch #0 {AudioSink$ConfigurationException -> 0x00e8, blocks: (B:36:0x00bf, B:39:0x00c7, B:41:0x00cb, B:43:0x00d4, B:47:0x00e2, B:50:0x00ea, B:54:0x00f1, B:55:0x00f6), top: B:59:0x00bf }] */
    /* JADX WARN: Code duplicated, block: B:52:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:53:0x00f0  */
    @Override // m7.p
    public final void a0(y6.p pVar, MediaFormat mediaFormat) throws ExoPlaybackException {
        int iW;
        y6.p pVar2 = this.f31812n1;
        boolean z11 = true;
        int[] iArr = null;
        if (pVar2 != null) {
            pVar = pVar2;
        } else if (this.f41019n0 != null) {
            mediaFormat.getClass();
            if ("audio/raw".equals(pVar.f57291n)) {
                iW = pVar.H;
            } else if (mediaFormat.containsKey("pcm-encoding")) {
                iW = mediaFormat.getInteger("pcm-encoding");
            } else {
                iW = mediaFormat.containsKey("v-bits-per-sample") ? f0.w(mediaFormat.getInteger("v-bits-per-sample"), ByteOrder.LITTLE_ENDIAN) : 2;
            }
            y6.o oVar = new y6.o();
            oVar.m = y6.d0.o("audio/raw");
            oVar.G = iW;
            oVar.H = pVar.I;
            oVar.I = pVar.J;
            oVar.f57263k = pVar.f57290l;
            oVar.f57253a = pVar.f57279a;
            oVar.f57254b = pVar.f57280b;
            oVar.f57255c = ImmutableList.n(pVar.f57281c);
            oVar.f57256d = pVar.f57282d;
            oVar.f57257e = pVar.f57283e;
            oVar.f57258f = pVar.f57284f;
            oVar.E = mediaFormat.getInteger("channel-count");
            oVar.F = mediaFormat.getInteger("sample-rate");
            pVar = new y6.p(oVar);
            if (this.f31810l1) {
                int i11 = pVar.F;
                if (i11 == 3) {
                    iArr = new int[]{0, 2, 1};
                } else if (i11 == 5) {
                    iArr = new int[]{0, 2, 1, 3, 4};
                } else if (i11 == 6) {
                    iArr = new int[]{0, 2, 1, 5, 3, 4};
                } else if (i11 == 7) {
                    iArr = new int[]{0, 2, 1, 6, 5, 3, 4};
                } else if (i11 == 8) {
                    iArr = new int[]{0, 2, 1, 7, 5, 6, 3, 4};
                }
            }
        }
        try {
            int i12 = Build.VERSION.SDK_INT;
            x xVar = this.f31807i1;
            if (i12 >= 29) {
                if (this.H0) {
                    e1 e1Var = this.f26702d;
                    e1Var.getClass();
                    if (e1Var.f26713a != 0) {
                        e1 e1Var2 = this.f26702d;
                        e1Var2.getClass();
                        int i13 = e1Var2.f26713a;
                        xVar.getClass();
                        if (i12 < 29) {
                            z11 = false;
                        }
                        b7.a.j(z11);
                        xVar.f31981j = i13;
                    } else {
                        xVar.getClass();
                        if (i12 >= 29) {
                            z11 = false;
                        }
                        b7.a.j(z11);
                        xVar.f31981j = 0;
                    }
                } else {
                    xVar.getClass();
                    if (i12 >= 29) {
                        z11 = false;
                    }
                    b7.a.j(z11);
                    xVar.f31981j = 0;
                }
            }
            xVar.d(pVar, iArr);
        } catch (AudioSink$ConfigurationException e8) {
            throw g(e8, e8.f2124a, false, 5001);
        }
    }

    @Override // f7.k0
    public final y6.e0 b() {
        return this.f31807i1.D;
    }

    @Override // m7.p
    public final void b0() {
        this.f31807i1.getClass();
    }

    @Override // f7.k0
    public final void c(y6.e0 e0Var) {
        x xVar = this.f31807i1;
        xVar.getClass();
        xVar.D = new y6.e0(f0.f(e0Var.f57185a, 0.1f, 8.0f), f0.f(e0Var.f57186b, 0.1f, 8.0f));
        q qVar = xVar.f31995u;
        if (qVar != null && qVar.f31943j) {
            xVar.v();
            return;
        }
        r rVar = new r(e0Var, -9223372036854775807L, -9223372036854775807L);
        if (xVar.o()) {
            xVar.B = rVar;
        } else {
            xVar.C = rVar;
        }
    }

    @Override // f7.k0
    public final long d() {
        if (this.H == 2) {
            z0();
        }
        return this.f31813o1;
    }

    @Override // m7.p
    public final void d0() {
        this.f31807i1.M = true;
    }

    @Override // f7.k0
    public final boolean e() {
        boolean z11 = this.f31816r1;
        this.f31816r1 = false;
        return z11;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0041  */
    /* JADX WARN: Code duplicated, block: B:29:0x0045  */
    @Override // f7.e, f7.a1
    public final void f(int i11, Object obj) {
        a5.j jVar;
        m7.j jVar2;
        x xVar = this.f31807i1;
        if (i11 == 2) {
            obj.getClass();
            float fFloatValue = ((Float) obj).floatValue();
            if (xVar.P != fFloatValue) {
                xVar.P = fFloatValue;
                if (xVar.o()) {
                    xVar.f31997w.setVolume(xVar.P);
                    return;
                }
                return;
            }
            return;
        }
        if (i11 == 3) {
            y6.d dVar = (y6.d) obj;
            dVar.getClass();
            if (xVar.A.equals(dVar)) {
                return;
            }
            xVar.A = dVar;
            if (xVar.f31968c0) {
                return;
            }
            f fVar = xVar.f31999y;
            if (fVar != null) {
                fVar.f31866i = dVar;
                fVar.a(c.c(fVar.f31858a, dVar, fVar.f31865h));
            }
            xVar.g();
            return;
        }
        if (i11 == 6) {
            y6.e eVar = (y6.e) obj;
            eVar.getClass();
            if (xVar.f31964a0.equals(eVar)) {
                return;
            }
            if (xVar.f31997w != null) {
                xVar.f31964a0.getClass();
            }
            xVar.f31964a0 = eVar;
            return;
        }
        if (i11 == 12) {
            AudioDeviceInfo audioDeviceInfo = (AudioDeviceInfo) obj;
            if (audioDeviceInfo == null) {
                jVar = null;
            } else {
                xVar.getClass();
                jVar = new a5.j(audioDeviceInfo, 16);
            }
            xVar.f31966b0 = jVar;
            f fVar2 = xVar.f31999y;
            if (fVar2 != null) {
                fVar2.b(audioDeviceInfo);
            }
            AudioTrack audioTrack = xVar.f31997w;
            if (audioTrack != null) {
                a5.j jVar3 = xVar.f31966b0;
                audioTrack.setPreferredDevice(jVar3 != null ? (AudioDeviceInfo) jVar3.f385b : null);
                return;
            }
            return;
        }
        if (i11 == 16) {
            obj.getClass();
            this.f31817s1 = ((Integer) obj).intValue();
            m7.l lVar = this.f41019n0;
            if (lVar != null && Build.VERSION.SDK_INT >= 35) {
                Bundle bundle = new Bundle();
                bundle.putInt("importance", Math.max(0, -this.f31817s1));
                lVar.a(bundle);
                return;
            }
            return;
        }
        if (i11 == 9) {
            obj.getClass();
            xVar.E = ((Boolean) obj).booleanValue();
            q qVar = xVar.f31995u;
            r rVar = new r((qVar == null || !qVar.f31943j) ? xVar.D : y6.e0.f57184d, -9223372036854775807L, -9223372036854775807L);
            if (xVar.o()) {
                xVar.B = rVar;
                return;
            } else {
                xVar.C = rVar;
                return;
            }
        }
        if (i11 != 10) {
            if (i11 == 11) {
                f7.c0 c0Var = (f7.c0) obj;
                c0Var.getClass();
                this.f41014i0 = c0Var;
                return;
            }
            return;
        }
        obj.getClass();
        int iIntValue = ((Integer) obj).intValue();
        if (xVar.Z) {
            if (xVar.Y == iIntValue) {
                xVar.Z = false;
                if (xVar.Y != iIntValue) {
                    xVar.Y = iIntValue;
                    xVar.X = iIntValue != 0;
                    xVar.g();
                }
            }
        } else if (xVar.Y != iIntValue) {
            xVar.Y = iIntValue;
            xVar.X = iIntValue != 0;
            xVar.g();
        }
        if (Build.VERSION.SDK_INT < 35 || (jVar2 = this.f31808j1) == null) {
            return;
        }
        jVar2.d(iIntValue);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0055  */
    /* JADX WARN: Code duplicated, block: B:37:0x0071  */
    @Override // m7.p
    public final boolean g0(long j11, long j12, m7.l lVar, ByteBuffer byteBuffer, int i11, int i12, int i13, long j13, boolean z11, boolean z12, y6.p pVar) throws ExoPlaybackException {
        int i14;
        int i15;
        byteBuffer.getClass();
        this.f31819u1 = -9223372036854775807L;
        if (this.f31812n1 != null && (i12 & 2) != 0) {
            lVar.getClass();
            lVar.d(i11);
            return true;
        }
        x xVar = this.f31807i1;
        if (z11) {
            if (lVar != null) {
                lVar.d(i11);
            }
            this.Y0.f26720f += i13;
            xVar.M = true;
            return true;
        }
        try {
            if (!xVar.l(byteBuffer, j13, i13)) {
                this.f31819u1 = j13;
                return false;
            }
            if (lVar != null) {
                lVar.d(i11);
            }
            this.Y0.f26719e += i13;
            return true;
        } catch (AudioSink$InitializationException e8) {
            y6.p pVar2 = this.f31811m1;
            if (this.H0) {
                e1 e1Var = this.f26702d;
                e1Var.getClass();
                if (e1Var.f26713a != 0) {
                    i15 = 5004;
                } else {
                    i15 = 5001;
                }
            } else {
                i15 = 5001;
            }
            throw g(e8, pVar2, e8.f2126b, i15);
        } catch (AudioSink$WriteException e10) {
            if (this.H0) {
                e1 e1Var2 = this.f26702d;
                e1Var2.getClass();
                if (e1Var2.f26713a != 0) {
                    i14 = 5003;
                } else {
                    i14 = 5002;
                }
            } else {
                i14 = 5002;
            }
            throw g(e10, pVar, e10.f2128b, i14);
        }
    }

    @Override // f7.e
    public final k0 j() {
        return this;
    }

    @Override // m7.p
    public final void j0() throws ExoPlaybackException {
        try {
            x xVar = this.f31807i1;
            if (!xVar.T && xVar.o() && xVar.f()) {
                xVar.s();
                xVar.T = true;
            }
            long j11 = this.S0;
            if (j11 != -9223372036854775807L) {
                this.f31819u1 = j11;
            }
        } catch (AudioSink$WriteException e8) {
            throw g(e8, e8.f2129c, e8.f2128b, this.H0 ? 5003 : 5002);
        }
    }

    @Override // f7.e
    public final String k() {
        return "MediaCodecAudioRenderer";
    }

    @Override // f7.e
    public final boolean m() {
        if (!this.U0) {
            return false;
        }
        x xVar = this.f31807i1;
        if (xVar.o()) {
            return xVar.T && !xVar.m();
        }
        return true;
    }

    @Override // m7.p, f7.e
    public final boolean o() {
        return this.f31807i1.m() || super.o();
    }

    @Override // m7.p, f7.e
    public final void p() {
        ob.l lVar = this.f31806h1;
        this.f31815q1 = true;
        this.f31811m1 = null;
        this.f31819u1 = -9223372036854775807L;
        try {
            this.f31807i1.g();
            try {
                super.p();
            } finally {
                lVar.x(this.Y0);
            }
        } catch (Throwable th2) {
            try {
                super.p();
                throw th2;
            } finally {
                lVar.x(this.Y0);
            }
        }
    }

    @Override // f7.e
    public final void q(boolean z11, boolean z12) {
        f7.f fVar = new f7.f();
        this.Y0 = fVar;
        ob.l lVar = this.f31806h1;
        Handler handler = (Handler) lVar.f44822b;
        if (handler != null) {
            handler.post(new i(lVar, fVar, 5));
        }
        e1 e1Var = this.f26702d;
        e1Var.getClass();
        boolean z13 = e1Var.f26714b;
        x xVar = this.f31807i1;
        if (z13) {
            b7.a.j(xVar.X);
            if (!xVar.f31968c0) {
                xVar.f31968c0 = true;
                xVar.g();
            }
        } else if (xVar.f31968c0) {
            xVar.f31968c0 = false;
            xVar.g();
        }
        g7.j jVar = this.f26704f;
        jVar.getClass();
        xVar.f31992r = jVar;
        b7.y yVar = this.f26705t;
        yVar.getClass();
        xVar.f31977h.F = yVar;
    }

    @Override // m7.p, f7.e
    public final void r(long j11, boolean z11) throws ExoPlaybackException {
        super.r(j11, z11);
        this.f31807i1.g();
        this.f31813o1 = j11;
        this.f31819u1 = -9223372036854775807L;
        this.f31816r1 = false;
        this.f31814p1 = true;
    }

    @Override // f7.e
    public final void s() {
        m7.j jVar;
        f fVar = this.f31807i1.f31999y;
        if (fVar != null) {
            Context context = fVar.f31858a;
            if (fVar.f31867j) {
                fVar.f31864g = null;
                d dVar = fVar.f31861d;
                if (dVar != null) {
                    z6.c.f(context).unregisterAudioDeviceCallback(dVar);
                }
                context.unregisterReceiver(fVar.f31862e);
                e eVar = fVar.f31863f;
                if (eVar != null) {
                    eVar.f31849a.unregisterContentObserver(eVar);
                }
                fVar.f31867j = false;
            }
        }
        if (Build.VERSION.SDK_INT < 35 || (jVar = this.f31808j1) == null) {
            return;
        }
        jVar.b();
    }

    @Override // f7.e
    public final void t() {
        x xVar = this.f31807i1;
        this.f31816r1 = false;
        this.f31819u1 = -9223372036854775807L;
        try {
            try {
                this.H0 = false;
                k0();
                i0();
                hd.b bVar = this.f41013h0;
                if (bVar != null) {
                    bVar.x(null);
                }
                this.f41013h0 = null;
                if (this.f31815q1) {
                    this.f31815q1 = false;
                    xVar.u();
                }
            } catch (Throwable th2) {
                hd.b bVar2 = this.f41013h0;
                if (bVar2 != null) {
                    bVar2.x(null);
                }
                this.f41013h0 = null;
                throw th2;
            }
        } catch (Throwable th3) {
            if (this.f31815q1) {
                this.f31815q1 = false;
                xVar.u();
            }
            throw th3;
        }
    }

    @Override // m7.p
    public final boolean t0(y6.p pVar) {
        e1 e1Var = this.f26702d;
        e1Var.getClass();
        if (e1Var.f26713a != 0) {
            int iY0 = y0(pVar);
            if ((iY0 & 512) != 0) {
                e1 e1Var2 = this.f26702d;
                e1Var2.getClass();
                if (e1Var2.f26713a == 2 || (iY0 & 1024) != 0 || (pVar.I == 0 && pVar.J == 0)) {
                    return true;
                }
            }
        }
        return this.f31807i1.i(pVar) != 0;
    }

    @Override // f7.e
    public final void u() {
        this.f31807i1.r();
        this.f31818t1 = true;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0059  */
    /* JADX WARN: Code duplicated, block: B:47:0x00b1  */
    @Override // m7.p
    public final int u0(m7.i iVar, y6.p pVar) {
        int iY0;
        List listF;
        boolean z11;
        boolean z12;
        int iA = f7.e.a(1, 0, 0, 0);
        String str = pVar.f57291n;
        String str2 = pVar.f57291n;
        if (!y6.d0.k(str)) {
            return f7.e.a(0, 0, 0, 0);
        }
        int i11 = pVar.O;
        boolean z13 = i11 != 0;
        boolean z14 = i11 == 0 || i11 == 2;
        int i12 = 8;
        x xVar = this.f31807i1;
        if (z14) {
            if (z13) {
                List listD = m7.s.d("audio/raw", false, false);
                if ((listD.isEmpty() ? null : (m7.n) listD.get(0)) == null) {
                    iY0 = 0;
                }
            }
            iY0 = y0(pVar);
            if (xVar.i(pVar) != 0) {
                return f7.e.a(4, 8, 32, iY0);
            }
        } else {
            iY0 = 0;
        }
        if ("audio/raw".equals(str2) && xVar.i(pVar) == 0) {
            return iA;
        }
        int i13 = pVar.F;
        int i14 = pVar.G;
        y6.o oVar = new y6.o();
        oVar.m = y6.d0.o("audio/raw");
        oVar.E = i13;
        oVar.F = i14;
        oVar.G = 2;
        if (xVar.i(new y6.p(oVar)) == 0) {
            return iA;
        }
        if (str2 == null) {
            listF = ImmutableList.s();
        } else if (xVar.i(pVar) != 0) {
            List listD2 = m7.s.d("audio/raw", false, false);
            m7.n nVar = listD2.isEmpty() ? null : (m7.n) listD2.get(0);
            if (nVar != null) {
                listF = ImmutableList.u(nVar);
            } else {
                listF = m7.s.f(iVar, pVar, false, false);
            }
        } else {
            listF = m7.s.f(iVar, pVar, false, false);
        }
        if (((AbstractCollection) listF).isEmpty()) {
            return iA;
        }
        if (!z14) {
            return f7.e.a(2, 0, 0, 0);
        }
        m7.n nVar2 = (m7.n) listF.get(0);
        boolean zE = nVar2.e(pVar);
        if (!zE) {
            int i15 = 1;
            while (true) {
                if (i15 >= listF.size()) {
                    z11 = zE;
                    z12 = true;
                    break;
                }
                m7.n nVar3 = (m7.n) listF.get(i15);
                if (nVar3.e(pVar)) {
                    z12 = false;
                    nVar2 = nVar3;
                    z11 = true;
                    break;
                }
                i15++;
            }
        } else {
            z11 = zE;
            z12 = true;
            break;
        }
        int i16 = z11 ? 4 : 3;
        if (z11 && nVar2.f(pVar)) {
            i12 = 16;
        }
        return (nVar2.f40990g ? 64 : 0) | i16 | i12 | 32 | (z12 ? 128 : 0) | iY0;
    }

    @Override // f7.e
    public final void v() {
        z0();
        this.f31818t1 = false;
        x xVar = this.f31807i1;
        xVar.W = false;
        if (xVar.o()) {
            m mVar = xVar.f31977h;
            mVar.f();
            if (mVar.f31920w == -9223372036854775807L) {
                l lVar = mVar.f31903e;
                lVar.getClass();
                lVar.a(0);
            }
            mVar.f31922y = mVar.b();
            if (!xVar.U || x.p(xVar.f31997w)) {
                xVar.f31997w.pause();
            }
        }
    }

    public final int y0(y6.p pVar) {
        h hVarH = this.f31807i1.h(pVar);
        if (!hVarH.f31872a) {
            return 0;
        }
        int i11 = hVarH.f31873b ? 1536 : 512;
        return hVarH.f31874c ? i11 | 2048 : i11;
    }

    public final void z0() {
        long j11;
        long jMax;
        long j12;
        m();
        x xVar = this.f31807i1;
        xq.c cVar = xVar.f31965b;
        if (!xVar.o() || xVar.N) {
            j11 = Long.MIN_VALUE;
            jMax = Long.MIN_VALUE;
        } else {
            long jMin = Math.min(xVar.f31977h.a(), f0.P(xVar.f31995u.f31938e, xVar.k()));
            ArrayDeque arrayDeque = xVar.f31979i;
            while (!arrayDeque.isEmpty() && jMin >= ((r) arrayDeque.getFirst()).f31948c) {
                xVar.C = (r) arrayDeque.remove();
            }
            r rVar = xVar.C;
            long jR = jMin - rVar.f31948c;
            long jU = f0.u(jR, rVar.f31946a.f57185a);
            if (arrayDeque.isEmpty()) {
                z6.i iVar = (z6.i) cVar.f56176d;
                if (!iVar.isActive()) {
                    j11 = Long.MIN_VALUE;
                } else if (iVar.f58985o >= 1024) {
                    long j13 = iVar.f58984n;
                    z6.h hVar = iVar.f58981j;
                    hVar.getClass();
                    long j14 = j13 - ((long) ((hVar.f58961k * hVar.f58952b) * 2));
                    int i11 = iVar.f58979h.f58939a;
                    int i12 = iVar.f58978g.f58939a;
                    if (i11 == i12) {
                        jR = f0.R(jR, j14, iVar.f58985o, RoundingMode.DOWN);
                        j11 = Long.MIN_VALUE;
                    } else {
                        j11 = Long.MIN_VALUE;
                        jR = f0.R(jR, j14 * ((long) i11), iVar.f58985o * ((long) i12), RoundingMode.DOWN);
                    }
                } else {
                    j11 = Long.MIN_VALUE;
                    jR = (long) (((double) iVar.f58974c) * jR);
                }
                r rVar2 = xVar.C;
                j12 = rVar2.f31947b + jR;
                rVar2.f31949d = jR - jU;
            } else {
                j11 = Long.MIN_VALUE;
                r rVar3 = xVar.C;
                j12 = rVar3.f31947b + jU + rVar3.f31949d;
            }
            long j15 = ((c0) cVar.f56175c).f31841q;
            jMax = f0.P(xVar.f31995u.f31938e, j15) + j12;
            long j16 = xVar.f31980i0;
            if (j15 > j16) {
                long jP = f0.P(xVar.f31995u.f31938e, j15 - j16);
                xVar.f31980i0 = j15;
                xVar.f31982j0 += jP;
                if (xVar.f31984k0 == null) {
                    xVar.f31984k0 = new Handler(Looper.myLooper());
                }
                xVar.f31984k0.removeCallbacksAndMessages(null);
                xVar.f31984k0.postDelayed(new b2.a(xVar, 19), 100L);
            }
        }
        if (jMax != j11) {
            if (!this.f31814p1) {
                jMax = Math.max(this.f31813o1, jMax);
            }
            this.f31813o1 = jMax;
            this.f31814p1 = false;
        }
    }

    @Override // m7.p
    public final oi.c P(m7.n nVar, y6.p pVar, MediaCrypto mediaCrypto, float f5) {
        y6.p[] pVarArr = this.L;
        pVarArr.getClass();
        String str = nVar.f40984a;
        "OMX.google.raw.decoder".equals(str);
        int iMax = pVar.f57292o;
        String str2 = pVar.f57291n;
        int i11 = pVar.F;
        if (pVarArr.length != 1) {
            for (y6.p pVar2 : pVarArr) {
                if (nVar.b(pVar, pVar2).f26739d != 0) {
                    "OMX.google.raw.decoder".equals(str);
                    iMax = Math.max(iMax, pVar2.f57292o);
                }
            }
        }
        this.f31809k1 = iMax;
        this.f31810l1 = str.equals("OMX.google.opus.decoder") || str.equals("c2.android.opus.decoder") || str.equals("OMX.google.vorbis.decoder") || str.equals("c2.android.vorbis.decoder");
        String str3 = nVar.f40986c;
        int i12 = this.f31809k1;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str3);
        mediaFormat.setInteger("channel-count", i11);
        int i13 = pVar.G;
        mediaFormat.setInteger("sample-rate", i13);
        b7.q.b(mediaFormat, pVar.f57294q);
        b7.q.a(mediaFormat, "max-input-size", i12);
        int i14 = Build.VERSION.SDK_INT;
        mediaFormat.setInteger("priority", 0);
        if (f5 != -1.0f) {
            mediaFormat.setFloat("operating-rate", f5);
        }
        if ("audio/ac4".equals(str2)) {
            Pair pairB = b7.d.b(pVar);
            if (pairB != null) {
                b7.q.a(mediaFormat, "profile", ((Integer) pairB.first).intValue());
                b7.q.a(mediaFormat, "level", ((Integer) pairB.second).intValue());
            }
            if (i14 <= 28) {
                mediaFormat.setInteger("ac4-is-sync", 1);
            }
        }
        y6.o oVar = new y6.o();
        oVar.m = y6.d0.o("audio/raw");
        oVar.E = i11;
        oVar.F = i13;
        oVar.G = 4;
        if (this.f31807i1.i(new y6.p(oVar)) == 2) {
            mediaFormat.setInteger(txBUGYhC.IYNxPGzQ, 4);
        }
        if (i14 >= 32) {
            mediaFormat.setInteger("max-output-channel-count", 99);
        }
        if (i14 >= 35) {
            mediaFormat.setInteger("importance", Math.max(0, -this.f31817s1));
        }
        this.f31812n1 = (!"audio/raw".equals(nVar.f40985b) || "audio/raw".equals(str2)) ? null : pVar;
        return new oi.c(nVar, mediaFormat, pVar, (Parcelable) null, mediaCrypto, this.f31808j1);
    }
}
