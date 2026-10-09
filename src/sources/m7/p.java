package m7;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.os.Trace;
import androidx.media3.decoder.DecoderInputBuffer$InsufficientCapacityException;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.drm.DrmSession$DrmSessionException;
import androidx.media3.exoplayer.mediacodec.MediaCodecDecoderException;
import androidx.media3.exoplayer.mediacodec.MediaCodecRenderer$DecoderInitializationException;
import androidx.media3.exoplayer.mediacodec.MediaCodecUtil$DecoderQueryException;
import b7.f0;
import com.google.common.primitives.UnsignedBytes;
import com.lingodeer.data.model.INTENTS;
import f7.c0;
import f7.e1;
import h7.b0;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import lf.x0;
import p7.z0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class p extends f7.e {

    /* JADX INFO: renamed from: g1, reason: collision with root package name */
    public static final byte[] f41001g1 = {0, 0, 1, 103, 66, -64, 11, -38, 37, -112, 0, 0, 1, 104, -50, 15, 19, 32, 0, 0, 1, 101, -120, -124, 13, -50, 113, 24, -96, 0, 47, -65, 28, 49, -61, 39, 93, 120};
    public long A0;
    public long B0;
    public int C0;
    public int D0;
    public ByteBuffer E0;
    public boolean F0;
    public boolean G0;
    public boolean H0;
    public boolean I0;
    public boolean J0;
    public boolean K0;
    public int L0;
    public int M0;
    public int N0;
    public boolean O0;
    public boolean P0;
    public boolean Q0;
    public long R0;
    public long S0;
    public boolean T0;
    public final k U;
    public boolean U0;
    public final i V;
    public boolean V0;
    public final float W;
    public boolean W0;
    public final e7.d X;
    public ExoPlaybackException X0;
    public final e7.d Y;
    public f7.f Y0;
    public final e7.d Z;
    public o Z0;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final g f41002a0;

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    public long f41003a1;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final MediaCodec.BufferInfo f41004b0;

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    public boolean f41005b1;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public final ArrayDeque f41006c0;

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    public boolean f41007c1;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final b0 f41008d0;

    /* JADX INFO: renamed from: d1, reason: collision with root package name */
    public boolean f41009d1;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public y6.p f41010e0;
    public long e1;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public y6.p f41011f0;
    public long f1;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public hd.b f41012g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public hd.b f41013h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public c0 f41014i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public MediaCrypto f41015j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public final long f41016k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public float f41017l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public float f41018m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public l f41019n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public y6.p f41020o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public MediaFormat f41021p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public boolean f41022q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public float f41023r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public ArrayDeque f41024s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public MediaCodecRenderer$DecoderInitializationException f41025t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public n f41026u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public int f41027v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public boolean f41028w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public boolean f41029x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public boolean f41030y0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public boolean f41031z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(int i11, k kVar, float f5) {
        super(i11);
        i iVar = i.f40980b;
        this.U = kVar;
        this.V = iVar;
        this.W = f5;
        this.X = new e7.d(0);
        this.Y = new e7.d(0);
        this.Z = new e7.d(2);
        g gVar = new g(2);
        gVar.N = 32;
        this.f41002a0 = gVar;
        this.f41004b0 = new MediaCodec.BufferInfo();
        this.f41017l0 = 1.0f;
        this.f41018m0 = 1.0f;
        this.f41016k0 = -9223372036854775807L;
        this.f41006c0 = new ArrayDeque();
        this.Z0 = o.f40996e;
        gVar.q(0);
        gVar.f25115e.order(ByteOrder.nativeOrder());
        b0 b0Var = new b0();
        b0Var.f31826a = z6.f.f58943a;
        b0Var.f31828c = 0;
        b0Var.f31827b = 2;
        this.f41008d0 = b0Var;
        this.f41023r0 = -1.0f;
        this.f41027v0 = 0;
        this.L0 = 0;
        this.C0 = -1;
        this.D0 = -1;
        this.B0 = -9223372036854775807L;
        this.R0 = -9223372036854775807L;
        this.S0 = -9223372036854775807L;
        this.f41003a1 = -9223372036854775807L;
        this.A0 = -9223372036854775807L;
        this.M0 = 0;
        this.N0 = 0;
        this.Y0 = new f7.f();
        this.e1 = -9223372036854775807L;
        this.f1 = -9223372036854775807L;
    }

    @Override // f7.e
    public void A(float f5, float f11) throws ExoPlaybackException {
        this.f41017l0 = f5;
        this.f41018m0 = f11;
        v0(this.f41020o0);
    }

    @Override // f7.e
    public final int B(y6.p pVar) throws ExoPlaybackException {
        try {
            return u0(this.V, pVar);
        } catch (MediaCodecUtil$DecoderQueryException e8) {
            throw g(e8, pVar, false, INTENTS.RESULT_NEED_CHECK_EMAIL);
        }
    }

    @Override // f7.e
    public final int C() {
        return 8;
    }

    /* JADX WARN: Code duplicated, block: B:114:0x02ff  */
    /* JADX WARN: Code duplicated, block: B:117:0x0307 A[LOOP:0: B:25:0x0090->B:117:0x0307, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:136:0x0305 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r24v0, types: [f7.e, m7.p] */
    /* JADX WARN: Type inference failed for: r28v0 */
    /* JADX WARN: Type inference failed for: r28v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r4v22, types: [int] */
    /* JADX WARN: Type inference failed for: r4v40 */
    /* JADX WARN: Type inference failed for: r4v41 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r5v16, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v32, types: [java.util.List] */
    public final boolean D(long j11, long j12) throws ExoPlaybackException {
        g gVar;
        ?? r9;
        ?? r28;
        b7.a.j(!this.U0);
        g gVar2 = this.f41002a0;
        if (gVar2.u()) {
            ByteBuffer byteBuffer = gVar2.f25115e;
            int i11 = this.D0;
            int i12 = gVar2.M;
            long j13 = gVar2.f25117t;
            boolean zS = S(this.N, gVar2.L);
            boolean zE = gVar2.e(4);
            y6.p pVar = this.f41011f0;
            pVar.getClass();
            gVar = gVar2;
            if (g0(j11, j12, null, byteBuffer, i11, 0, i12, j13, zS, zE, pVar)) {
                c0(gVar.L);
                gVar.n();
            }
        }
        gVar = gVar2;
        if (this.T0) {
            this.U0 = true;
            return false;
        }
        ?? r11 = 0;
        boolean z11 = this.I0;
        e7.d dVar = this.Z;
        if (z11) {
            b7.a.j(gVar.t(dVar));
            this.I0 = false;
        }
        if (this.J0) {
            if (gVar.u()) {
                return true;
            }
            this.H0 = false;
            k0();
            this.J0 = false;
            T();
            if (!this.H0) {
                return false;
            }
        }
        b7.a.j(!this.T0);
        ob.e eVar = this.f26701c;
        eVar.f();
        dVar.n();
        while (true) {
            dVar.n();
            int iX = x(eVar, dVar, r11);
            if (iX == -5) {
                Z(eVar);
            } else if (iX != -4) {
                if (iX != -3) {
                    throw new IllegalStateException();
                }
                if (l()) {
                    this.S0 = this.R0;
                }
            } else if (dVar.e(4)) {
                this.T0 = true;
                this.S0 = this.R0;
            } else {
                this.R0 = Math.max(this.R0, dVar.f25117t);
                if (l() || this.Y.e(536870912)) {
                    this.S0 = this.R0;
                }
                byte[] bArr = null;
                if (this.V0) {
                    y6.p pVar2 = this.f41010e0;
                    pVar2.getClass();
                    this.f41011f0 = pVar2;
                    if (Objects.equals(pVar2.f57291n, "audio/opus") && !this.f41011f0.f57294q.isEmpty()) {
                        byte[] bArr2 = (byte[]) this.f41011f0.f57294q.get(r11);
                        int i13 = (bArr2[10] & 255) | ((bArr2[11] & 255) << 8);
                        y6.o oVarA = this.f41011f0.a();
                        oVarA.H = i13;
                        this.f41011f0 = new y6.p(oVarA);
                    }
                    a0(this.f41011f0, null);
                    this.V0 = r11;
                }
                dVar.r();
                y6.p pVar3 = this.f41011f0;
                if (pVar3 != null && Objects.equals(pVar3.f57291n, "audio/opus")) {
                    if (dVar.e(268435456)) {
                        dVar.f25113c = this.f41011f0;
                        Q(dVar);
                    }
                    if (this.N - dVar.f25117t <= 80000) {
                        ?? r12 = this.f41011f0.f57294q;
                        b0 b0Var = this.f41008d0;
                        b0Var.getClass();
                        dVar.f25115e.getClass();
                        if (dVar.f25115e.limit() - dVar.f25115e.position() != 0) {
                            if (b0Var.f31827b == 2 && (r12.size() == 1 || r12.size() == 3)) {
                                bArr = (byte[]) r12.get(r11);
                            }
                            ByteBuffer byteBuffer2 = dVar.f25115e;
                            int iPosition = byteBuffer2.position();
                            int iLimit = byteBuffer2.limit();
                            int i14 = iLimit - iPosition;
                            int i15 = (i14 + 255) / 255;
                            int i16 = i15 + 27 + i14;
                            if (b0Var.f31827b == 2) {
                                int length = bArr != null ? bArr.length + 28 : 47;
                                i16 = (length == true ? 1 : 0) + 44 + i16;
                                r9 = length;
                            } else {
                                r9 = r11;
                            }
                            if (b0Var.f31826a.capacity() < i16) {
                                b0Var.f31826a = ByteBuffer.allocate(i16).order(ByteOrder.LITTLE_ENDIAN);
                            } else {
                                b0Var.f31826a.clear();
                            }
                            ByteBuffer byteBuffer3 = b0Var.f31826a;
                            if (b0Var.f31827b == 2) {
                                if (bArr != null) {
                                    b0.a(byteBuffer3, 0L, 0, 1, true);
                                    byteBuffer3.put(UnsignedBytes.a(bArr.length));
                                    byteBuffer3.put(bArr);
                                    byteBuffer3.putInt(22, f0.l(byteBuffer3.arrayOffset(), byteBuffer3.array(), bArr.length + 28, 0));
                                    byteBuffer3.position(bArr.length + 28);
                                } else {
                                    byteBuffer3.put(b0.f31824d);
                                }
                                byteBuffer3.put(b0.f31825e);
                                r28 = r9;
                            } else {
                                r28 = r9 == true ? 1 : 0;
                                iLimit = iLimit;
                            }
                            int iK = b0Var.f31828c + ((int) ((x7.a.k(byteBuffer2.get(0), byteBuffer2.limit() > 1 ? byteBuffer2.get(1) : (byte) 0) * 48000) / 1000000));
                            b0Var.f31828c = iK;
                            b0.a(byteBuffer3, iK, b0Var.f31827b, i15, false);
                            for (int i17 = 0; i17 < i15; i17++) {
                                if (i14 >= 255) {
                                    byteBuffer3.put((byte) -1);
                                    i14 -= 255;
                                } else {
                                    byteBuffer3.put((byte) i14);
                                    i14 = 0;
                                }
                            }
                            int i18 = iLimit;
                            while (iPosition < i18) {
                                byteBuffer3.put(byteBuffer2.get(iPosition));
                                iPosition++;
                            }
                            byteBuffer2.position(byteBuffer2.limit());
                            byteBuffer3.flip();
                            if (b0Var.f31827b == 2) {
                                byteBuffer3.putInt(r28 + 66, f0.l(byteBuffer3.arrayOffset() + r28 + 44, byteBuffer3.array(), byteBuffer3.limit() - byteBuffer3.position(), 0));
                            } else {
                                byteBuffer3.putInt(22, f0.l(byteBuffer3.arrayOffset(), byteBuffer3.array(), byteBuffer3.limit() - byteBuffer3.position(), 0));
                            }
                            b0Var.f31827b++;
                            b0Var.f31826a = byteBuffer3;
                            dVar.n();
                            dVar.q(b0Var.f31826a.remaining());
                            dVar.f25115e.put(b0Var.f31826a);
                            dVar.r();
                        }
                    }
                }
                if (gVar.u()) {
                    long j14 = this.N;
                    if (S(j14, gVar.L) == S(j14, dVar.f25117t)) {
                        if (!gVar.t(dVar)) {
                            r11 = 0;
                        }
                    }
                } else if (!gVar.t(dVar)) {
                    r11 = 0;
                }
                this.I0 = true;
            }
            if (gVar.u()) {
                gVar.r();
            }
            return gVar.u() || this.T0 || this.J0;
        }
    }

    public abstract f7.g E(n nVar, y6.p pVar, y6.p pVar2);

    public MediaCodecDecoderException F(IllegalStateException illegalStateException, n nVar) {
        return new MediaCodecDecoderException(illegalStateException, nVar);
    }

    public final boolean G(long j11, long j12) throws ExoPlaybackException {
        l lVar = this.f41019n0;
        lVar.getClass();
        int i11 = this.D0;
        MediaCodec.BufferInfo bufferInfo = this.f41004b0;
        if (i11 < 0) {
            int iJ = lVar.j(bufferInfo);
            if (iJ < 0) {
                if (iJ == -2) {
                    this.Q0 = true;
                    l lVar2 = this.f41019n0;
                    lVar2.getClass();
                    MediaFormat mediaFormatF = lVar2.f();
                    if (this.f41027v0 != 0 && mediaFormatF.getInteger("width") == 32 && mediaFormatF.getInteger("height") == 32) {
                        this.f41030y0 = true;
                        return true;
                    }
                    this.f41021p0 = mediaFormatF;
                    this.f41022q0 = true;
                    return true;
                }
                if (this.f41031z0 && (this.T0 || this.M0 == 2)) {
                    f0();
                }
                long j13 = this.A0;
                if (j13 != -9223372036854775807L) {
                    long j14 = j13 + 100;
                    this.f26705t.getClass();
                    if (j14 < System.currentTimeMillis()) {
                        f0();
                        return false;
                    }
                }
                return false;
            }
            if (this.f41030y0) {
                this.f41030y0 = false;
                lVar.d(iJ);
                return true;
            }
            if (bufferInfo.size == 0 && (bufferInfo.flags & 4) != 0) {
                f0();
                return false;
            }
            this.D0 = iJ;
            ByteBuffer byteBufferN = lVar.n(iJ);
            this.E0 = byteBufferN;
            if (byteBufferN != null) {
                byteBufferN.position(bufferInfo.offset);
                this.E0.limit(bufferInfo.offset + bufferInfo.size);
            }
            x0(bufferInfo.presentationTimeUs);
        }
        long j15 = bufferInfo.presentationTimeUs;
        this.F0 = j15 < this.N;
        long j16 = this.S0;
        this.G0 = j16 != -9223372036854775807L && j16 <= j15;
        if (this.f41009d1) {
            long j17 = this.e1;
            if (j17 == -9223372036854775807L || j15 > j17) {
                this.e1 = j15;
                this.F0 = true;
                this.G0 = false;
            } else {
                this.f41009d1 = false;
                this.e1 = -9223372036854775807L;
            }
        }
        ByteBuffer byteBuffer = this.E0;
        int i12 = this.D0;
        int i13 = bufferInfo.flags;
        boolean z11 = this.F0;
        boolean z12 = this.G0;
        y6.p pVar = this.f41011f0;
        pVar.getClass();
        if (!g0(j11, j12, lVar, byteBuffer, i12, i13, 1, j15, z11, z12, pVar)) {
            return false;
        }
        c0(bufferInfo.presentationTimeUs);
        boolean z13 = (bufferInfo.flags & 4) != 0;
        if (!z13 && this.P0 && this.G0) {
            this.f26705t.getClass();
            this.A0 = System.currentTimeMillis();
        }
        this.D0 = -1;
        this.E0 = null;
        if (!z13) {
            return true;
        }
        f0();
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0197  */
    /* JADX WARN: Code duplicated, block: B:102:0x019b  */
    /* JADX WARN: Code duplicated, block: B:104:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:106:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:107:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:116:0x0091 A[EDGE_INSN: B:116:0x0091->B:33:0x0091 BREAK  A[LOOP:0: B:30:0x006f->B:32:0x007c], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:17:0x0032  */
    /* JADX WARN: Code duplicated, block: B:20:0x0037  */
    /* JADX WARN: Code duplicated, block: B:23:0x0049  */
    /* JADX WARN: Code duplicated, block: B:25:0x004d  */
    /* JADX WARN: Code duplicated, block: B:27:0x006a  */
    /* JADX WARN: Code duplicated, block: B:29:0x006e  */
    /* JADX WARN: Code duplicated, block: B:32:0x007c A[LOOP:0: B:30:0x006f->B:32:0x007c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:38:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:40:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:42:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:44:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:46:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:49:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:51:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:53:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:56:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:58:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:61:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:63:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:71:0x010b  */
    /* JADX WARN: Code duplicated, block: B:74:0x0112  */
    /* JADX WARN: Code duplicated, block: B:76:0x011a  */
    /* JADX WARN: Code duplicated, block: B:78:0x011e  */
    /* JADX WARN: Code duplicated, block: B:79:0x0122  */
    /* JADX WARN: Code duplicated, block: B:81:0x0126  */
    /* JADX WARN: Code duplicated, block: B:85:0x013b  */
    /* JADX WARN: Code duplicated, block: B:87:0x0143  */
    /* JADX WARN: Code duplicated, block: B:88:0x0154  */
    /* JADX WARN: Code duplicated, block: B:92:0x0170  */
    /* JADX WARN: Code duplicated, block: B:94:0x0178  */
    /* JADX WARN: Code duplicated, block: B:97:0x0187  */
    public final boolean H() throws ExoPlaybackException {
        int iPosition;
        ob.e eVar;
        int iX;
        boolean zE;
        long j11;
        int iL;
        e1 e1Var;
        ArrayDeque arrayDeque;
        e7.b bVar;
        int i11;
        y6.p pVar;
        l lVar = this.f41019n0;
        if (lVar != null && this.M0 != 2 && !this.T0) {
            int i12 = this.C0;
            e7.d dVar = this.Y;
            if (i12 < 0) {
                int i13 = lVar.i();
                this.C0 = i13;
                if (i13 >= 0) {
                    dVar.f25115e = lVar.l(i13);
                    dVar.n();
                    if (this.M0 == 1) {
                        if (!this.f41031z0) {
                            this.P0 = true;
                            lVar.b(this.C0, 0, 4, 0L);
                            this.C0 = -1;
                            dVar.f25115e = null;
                        }
                        this.M0 = 2;
                        return false;
                    }
                    if (this.f41029x0) {
                        this.f41029x0 = false;
                        ByteBuffer byteBuffer = dVar.f25115e;
                        byteBuffer.getClass();
                        byteBuffer.put(f41001g1);
                        lVar.b(this.C0, 38, 0, 0L);
                        this.C0 = -1;
                        dVar.f25115e = null;
                        this.O0 = true;
                        return true;
                    }
                    if (this.L0 == 1) {
                        i11 = 0;
                        while (true) {
                            pVar = this.f41020o0;
                            pVar.getClass();
                            if (i11 < pVar.f57294q.size()) {
                                break;
                            }
                            byte[] bArr = (byte[]) this.f41020o0.f57294q.get(i11);
                            ByteBuffer byteBuffer2 = dVar.f25115e;
                            byteBuffer2.getClass();
                            byteBuffer2.put(bArr);
                            i11++;
                        }
                        this.L0 = 2;
                    }
                    ByteBuffer byteBuffer3 = dVar.f25115e;
                    byteBuffer3.getClass();
                    iPosition = byteBuffer3.position();
                    eVar = this.f26701c;
                    eVar.f();
                    try {
                        iX = x(eVar, dVar, 0);
                        if (iX == -3) {
                            if (l()) {
                                this.S0 = this.R0;
                                return false;
                            }
                        } else {
                            if (iX == -5) {
                                if (this.L0 == 2) {
                                    dVar.n();
                                    this.L0 = 1;
                                }
                                Z(eVar);
                                return true;
                            }
                            if (dVar.e(4)) {
                                if (this.O0 && !dVar.e(1)) {
                                    dVar.n();
                                    if (this.L0 == 2) {
                                        this.L0 = 1;
                                        return true;
                                    }
                                } else if (!p0(dVar)) {
                                    zE = dVar.e(1073741824);
                                    if (zE) {
                                        bVar = dVar.f25114d;
                                        if (iPosition == 0) {
                                            bVar.getClass();
                                        } else {
                                            if (bVar.f25106d == null) {
                                                int[] iArr = new int[1];
                                                bVar.f25106d = iArr;
                                                bVar.f25111i.numBytesOfClearData = iArr;
                                            }
                                            int[] iArr2 = bVar.f25106d;
                                            iArr2[0] = iArr2[0] + iPosition;
                                        }
                                    }
                                    j11 = dVar.f25117t;
                                    if (this.V0) {
                                        arrayDeque = this.f41006c0;
                                        if (arrayDeque.isEmpty()) {
                                            ar.f fVar = this.Z0.f41000d;
                                            y6.p pVar2 = this.f41010e0;
                                            pVar2.getClass();
                                            fVar.a(j11, pVar2);
                                        } else {
                                            ar.f fVar2 = ((o) arrayDeque.peekLast()).f41000d;
                                            y6.p pVar3 = this.f41010e0;
                                            pVar3.getClass();
                                            fVar2.a(j11, pVar3);
                                        }
                                        this.V0 = false;
                                    }
                                    this.R0 = Math.max(this.R0, j11);
                                    if (l() || dVar.e(536870912)) {
                                        this.S0 = this.R0;
                                    }
                                    dVar.r();
                                    if (dVar.e(268435456)) {
                                        Q(dVar);
                                    }
                                    e0(dVar);
                                    iL = L(dVar);
                                    if (Build.VERSION.SDK_INT >= 34 || (iL & 32) == 0) {
                                        e1Var = this.f26702d;
                                        e1Var.getClass();
                                        if (!e1Var.f26714b) {
                                            this.f1 = Math.max(this.f1, dVar.f25117t);
                                        }
                                    }
                                    if (zE) {
                                        lVar.c(this.C0, dVar.f25114d, j11, iL);
                                    } else {
                                        int i14 = this.C0;
                                        ByteBuffer byteBuffer4 = dVar.f25115e;
                                        byteBuffer4.getClass();
                                        lVar.b(i14, byteBuffer4.limit(), iL, j11);
                                    }
                                    this.C0 = -1;
                                    dVar.f25115e = null;
                                    this.O0 = true;
                                    this.L0 = 0;
                                    this.Y0.f26717c++;
                                    return true;
                                }
                                return true;
                            }
                            this.S0 = this.R0;
                            if (this.L0 == 2) {
                                dVar.n();
                                this.L0 = 1;
                            }
                            this.T0 = true;
                            if (!this.O0) {
                                f0();
                                return false;
                            }
                            if (!this.f41031z0) {
                                this.P0 = true;
                                lVar.b(this.C0, 0, 4, 0L);
                                this.C0 = -1;
                                dVar.f25115e = null;
                                return false;
                            }
                        }
                    } catch (DecoderInputBuffer$InsufficientCapacityException e8) {
                        W(e8);
                        h0(0);
                        I();
                        return true;
                    }
                }
            } else {
                if (this.M0 == 1) {
                    if (!this.f41031z0) {
                        this.P0 = true;
                        lVar.b(this.C0, 0, 4, 0L);
                        this.C0 = -1;
                        dVar.f25115e = null;
                    }
                    this.M0 = 2;
                    return false;
                }
                if (this.f41029x0) {
                    this.f41029x0 = false;
                    ByteBuffer byteBuffer5 = dVar.f25115e;
                    byteBuffer5.getClass();
                    byteBuffer5.put(f41001g1);
                    lVar.b(this.C0, 38, 0, 0L);
                    this.C0 = -1;
                    dVar.f25115e = null;
                    this.O0 = true;
                    return true;
                }
                if (this.L0 == 1) {
                    i11 = 0;
                    while (true) {
                        pVar = this.f41020o0;
                        pVar.getClass();
                        if (i11 < pVar.f57294q.size()) {
                            break;
                            break;
                        }
                        byte[] bArr2 = (byte[]) this.f41020o0.f57294q.get(i11);
                        ByteBuffer byteBuffer6 = dVar.f25115e;
                        byteBuffer6.getClass();
                        byteBuffer6.put(bArr2);
                        i11++;
                    }
                    this.L0 = 2;
                }
                ByteBuffer byteBuffer7 = dVar.f25115e;
                byteBuffer7.getClass();
                iPosition = byteBuffer7.position();
                eVar = this.f26701c;
                eVar.f();
                iX = x(eVar, dVar, 0);
                if (iX == -3) {
                    if (l()) {
                        this.S0 = this.R0;
                        return false;
                    }
                } else {
                    if (iX == -5) {
                        if (this.L0 == 2) {
                            dVar.n();
                            this.L0 = 1;
                        }
                        Z(eVar);
                        return true;
                    }
                    if (dVar.e(4)) {
                        if (this.O0) {
                            if (!p0(dVar)) {
                                zE = dVar.e(1073741824);
                                if (zE) {
                                    bVar = dVar.f25114d;
                                    if (iPosition == 0) {
                                        bVar.getClass();
                                    } else {
                                        if (bVar.f25106d == null) {
                                            int[] iArr3 = new int[1];
                                            bVar.f25106d = iArr3;
                                            bVar.f25111i.numBytesOfClearData = iArr3;
                                        }
                                        int[] iArr4 = bVar.f25106d;
                                        iArr4[0] = iArr4[0] + iPosition;
                                    }
                                }
                                j11 = dVar.f25117t;
                                if (this.V0) {
                                    arrayDeque = this.f41006c0;
                                    if (arrayDeque.isEmpty()) {
                                        ar.f fVar3 = ((o) arrayDeque.peekLast()).f41000d;
                                        y6.p pVar4 = this.f41010e0;
                                        pVar4.getClass();
                                        fVar3.a(j11, pVar4);
                                    } else {
                                        ar.f fVar4 = this.Z0.f41000d;
                                        y6.p pVar5 = this.f41010e0;
                                        pVar5.getClass();
                                        fVar4.a(j11, pVar5);
                                    }
                                    this.V0 = false;
                                }
                                this.R0 = Math.max(this.R0, j11);
                                if (l()) {
                                    this.S0 = this.R0;
                                } else {
                                    this.S0 = this.R0;
                                }
                                dVar.r();
                                if (dVar.e(268435456)) {
                                    Q(dVar);
                                }
                                e0(dVar);
                                iL = L(dVar);
                                if (Build.VERSION.SDK_INT >= 34) {
                                    e1Var = this.f26702d;
                                    e1Var.getClass();
                                    if (!e1Var.f26714b) {
                                        this.f1 = Math.max(this.f1, dVar.f25117t);
                                    }
                                } else {
                                    e1Var = this.f26702d;
                                    e1Var.getClass();
                                    if (!e1Var.f26714b) {
                                        this.f1 = Math.max(this.f1, dVar.f25117t);
                                    }
                                }
                                if (zE) {
                                    lVar.c(this.C0, dVar.f25114d, j11, iL);
                                } else {
                                    int i15 = this.C0;
                                    ByteBuffer byteBuffer8 = dVar.f25115e;
                                    byteBuffer8.getClass();
                                    lVar.b(i15, byteBuffer8.limit(), iL, j11);
                                }
                                this.C0 = -1;
                                dVar.f25115e = null;
                                this.O0 = true;
                                this.L0 = 0;
                                this.Y0.f26717c++;
                                return true;
                            }
                        } else if (!p0(dVar)) {
                            zE = dVar.e(1073741824);
                            if (zE) {
                                bVar = dVar.f25114d;
                                if (iPosition == 0) {
                                    bVar.getClass();
                                } else {
                                    if (bVar.f25106d == null) {
                                        int[] iArr5 = new int[1];
                                        bVar.f25106d = iArr5;
                                        bVar.f25111i.numBytesOfClearData = iArr5;
                                    }
                                    int[] iArr6 = bVar.f25106d;
                                    iArr6[0] = iArr6[0] + iPosition;
                                }
                            }
                            j11 = dVar.f25117t;
                            if (this.V0) {
                                arrayDeque = this.f41006c0;
                                if (arrayDeque.isEmpty()) {
                                    ar.f fVar5 = ((o) arrayDeque.peekLast()).f41000d;
                                    y6.p pVar6 = this.f41010e0;
                                    pVar6.getClass();
                                    fVar5.a(j11, pVar6);
                                } else {
                                    ar.f fVar6 = this.Z0.f41000d;
                                    y6.p pVar7 = this.f41010e0;
                                    pVar7.getClass();
                                    fVar6.a(j11, pVar7);
                                }
                                this.V0 = false;
                            }
                            this.R0 = Math.max(this.R0, j11);
                            if (l()) {
                                this.S0 = this.R0;
                            } else {
                                this.S0 = this.R0;
                            }
                            dVar.r();
                            if (dVar.e(268435456)) {
                                Q(dVar);
                            }
                            e0(dVar);
                            iL = L(dVar);
                            if (Build.VERSION.SDK_INT >= 34) {
                                e1Var = this.f26702d;
                                e1Var.getClass();
                                if (!e1Var.f26714b) {
                                    this.f1 = Math.max(this.f1, dVar.f25117t);
                                }
                            } else {
                                e1Var = this.f26702d;
                                e1Var.getClass();
                                if (!e1Var.f26714b) {
                                    this.f1 = Math.max(this.f1, dVar.f25117t);
                                }
                            }
                            if (zE) {
                                lVar.c(this.C0, dVar.f25114d, j11, iL);
                            } else {
                                int i16 = this.C0;
                                ByteBuffer byteBuffer9 = dVar.f25115e;
                                byteBuffer9.getClass();
                                lVar.b(i16, byteBuffer9.limit(), iL, j11);
                            }
                            this.C0 = -1;
                            dVar.f25115e = null;
                            this.O0 = true;
                            this.L0 = 0;
                            this.Y0.f26717c++;
                            return true;
                        }
                        return true;
                    }
                    this.S0 = this.R0;
                    if (this.L0 == 2) {
                        dVar.n();
                        this.L0 = 1;
                    }
                    this.T0 = true;
                    if (!this.O0) {
                        f0();
                        return false;
                    }
                    if (!this.f41031z0) {
                        this.P0 = true;
                        lVar.b(this.C0, 0, 4, 0L);
                        this.C0 = -1;
                        dVar.f25115e = null;
                        return false;
                    }
                }
            }
        }
        return false;
    }

    public final void I() {
        try {
            l lVar = this.f41019n0;
            b7.a.k(lVar);
            lVar.flush();
        } finally {
            l0();
        }
    }

    public final boolean J() {
        if (this.f41019n0 != null) {
            if (s0()) {
                i0();
                return true;
            }
            if (q0()) {
                I();
                return false;
            }
            long j11 = this.f1;
            if (j11 != -9223372036854775807L && this.N <= j11 && this.f41003a1 < j11) {
                this.f41009d1 = true;
                this.f1 = -9223372036854775807L;
            }
        }
        return false;
    }

    public final List K(boolean z11) {
        y6.p pVar = this.f41010e0;
        pVar.getClass();
        i iVar = this.V;
        ArrayList arrayListN = N(iVar, pVar, z11);
        if (!arrayListN.isEmpty() || !z11) {
            return arrayListN;
        }
        ArrayList arrayListN2 = N(iVar, pVar, false);
        if (!arrayListN2.isEmpty()) {
            b7.a.B("Drm session requires secure decoder for " + pVar.f57291n + ", but no secure decoder available. Trying to proceed with " + arrayListN2 + ".");
        }
        return arrayListN2;
    }

    public int L(e7.d dVar) {
        return 0;
    }

    public abstract float M(float f5, y6.p pVar, y6.p[] pVarArr);

    public abstract ArrayList N(i iVar, y6.p pVar, boolean z11);

    public long O(long j11, long j12) {
        return super.i(j11, j12);
    }

    public abstract oi.c P(n nVar, y6.p pVar, MediaCrypto mediaCrypto, float f5);

    public abstract void Q(e7.d dVar);

    /* JADX WARN: Code duplicated, block: B:25:0x00c7  */
    public final void R(n nVar, MediaCrypto mediaCrypto) {
        int i11;
        this.f41026u0 = nVar;
        y6.p pVar = this.f41010e0;
        pVar.getClass();
        String str = nVar.f40984a;
        int i12 = Build.VERSION.SDK_INT;
        float f5 = this.f41018m0;
        y6.p[] pVarArr = this.L;
        pVarArr.getClass();
        float fM = M(f5, pVar, pVarArr);
        if (fM <= this.W) {
            fM = -1.0f;
        }
        this.f26705t.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        oi.c cVarP = P(nVar, pVar, mediaCrypto, fM);
        if (i12 >= 31) {
            g7.j jVar = this.f26704f;
            jVar.getClass();
            b2.d.f(cVarP, jVar);
        }
        try {
            Trace.beginSection("createCodec:" + str);
            l lVarH = this.U.h(cVarP);
            this.f41019n0 = lVarH;
            lVarH.o(new x0(this, 2));
            Trace.endSection();
            this.f26705t.getClass();
            float f11 = fM;
            long jElapsedRealtime2 = SystemClock.elapsedRealtime();
            if (!nVar.e(pVar)) {
                String strC = y6.p.c(pVar);
                Locale locale = Locale.US;
                b7.a.B("Format exceeds selected codec's capabilities [" + strC + ", " + str + "]");
            }
            this.f41023r0 = f11;
            this.f41020o0 = pVar;
            boolean z11 = false;
            if (i12 > 25 || !"OMX.Exynos.avc.dec.secure".equals(str)) {
                i11 = 0;
            } else {
                String str2 = Build.MODEL;
                if (str2.startsWith("SM-T585") || str2.startsWith("SM-A510") || str2.startsWith("SM-A520") || str2.startsWith("SM-J700")) {
                    i11 = 2;
                } else {
                    i11 = 0;
                }
            }
            this.f41027v0 = i11;
            this.f41028w0 = i12 == 29 && "c2.android.aac.decoder".equals(str);
            String str3 = nVar.f40984a;
            if ((i12 <= 25 && "OMX.rk.video_decoder.avc".equals(str3)) || ((i12 <= 29 && ("OMX.broadcom.video_decoder.tunnel".equals(str3) || "OMX.broadcom.video_decoder.tunnel.secure".equals(str3) || "OMX.bcm.vdec.avc.tunnel".equals(str3) || "OMX.bcm.vdec.avc.tunnel.secure".equals(str3) || "OMX.bcm.vdec.hevc.tunnel".equals(str3) || "OMX.bcm.vdec.hevc.tunnel.secure".equals(str3))) || ("Amazon".equals(Build.MANUFACTURER) && "AFTS".equals(Build.MODEL) && nVar.f40989f))) {
                z11 = true;
            }
            this.f41031z0 = z11;
            this.f41019n0.getClass();
            if (this.H == 2) {
                this.f26705t.getClass();
                this.B0 = SystemClock.elapsedRealtime() + 1000;
            }
            this.Y0.f26715a++;
            X(jElapsedRealtime2, jElapsedRealtime2 - jElapsedRealtime, str);
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    public final boolean S(long j11, long j12) {
        if (j12 >= j11) {
            return false;
        }
        y6.p pVar = this.f41011f0;
        return pVar == null || !Objects.equals(pVar.f57291n, "audio/opus") || j11 - j12 > 80000;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0086 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:40:0x0088  */
    /* JADX WARN: Code duplicated, block: B:43:0x008f  */
    /* JADX WARN: Code duplicated, block: B:45:0x0093  */
    /* JADX WARN: Code duplicated, block: B:53:0x00ad A[Catch: MediaCodecRenderer$DecoderInitializationException -> 0x00bd, TryCatch #1 {MediaCodecRenderer$DecoderInitializationException -> 0x00bd, blocks: (B:51:0x00a9, B:53:0x00ad, B:55:0x00b4, B:60:0x00bf, B:64:0x00cc), top: B:76:0x00a9 }] */
    /* JADX WARN: Code duplicated, block: B:63:0x00cb  */
    public final void T() throws ExoPlaybackException {
        y6.p pVar;
        hd.b bVar;
        if (this.f41019n0 != null || this.H0 || (pVar = this.f41010e0) == null) {
            return;
        }
        String str = pVar.f57291n;
        boolean z11 = true;
        if (this.f41013h0 == null && t0(pVar)) {
            this.H0 = false;
            k0();
            boolean zEquals = "audio/mp4a-latm".equals(str);
            g gVar = this.f41002a0;
            if (zEquals || "audio/mpeg".equals(str) || "audio/opus".equals(str)) {
                gVar.getClass();
                gVar.N = 32;
            } else {
                gVar.getClass();
                gVar.N = 1;
            }
            this.H0 = true;
            return;
        }
        n0(this.f41013h0);
        if (this.f41012g0 == null) {
            try {
                bVar = this.f41012g0;
                if (bVar == null && (bVar.r() == 3 || this.f41012g0.r() == 4)) {
                    hd.b bVar2 = this.f41012g0;
                    b7.a.k(str);
                    if (!bVar2.y(str)) {
                        z11 = false;
                    }
                } else {
                    z11 = false;
                }
                U(this.f41015j0, z11);
            } catch (MediaCodecRenderer$DecoderInitializationException e8) {
                throw g(e8, pVar, false, INTENTS.RESULT_CHANGE_USER_CONFIG);
            }
        } else {
            b7.a.j(this.f41015j0 == null);
            hd.b bVar3 = this.f41012g0;
            e7.a aVarN = bVar3.n();
            if (k7.h.f37961a && (aVarN instanceof k7.h)) {
                int iR = bVar3.r();
                if (iR == 1) {
                    DrmSession$DrmSessionException drmSession$DrmSessionExceptionO = bVar3.o();
                    drmSession$DrmSessionExceptionO.getClass();
                    throw g(drmSession$DrmSessionExceptionO, this.f41010e0, false, drmSession$DrmSessionExceptionO.f2137a);
                }
                if (iR == 4) {
                    if (aVarN == null) {
                        if (bVar3.o() != null) {
                        }
                    } else if (aVarN instanceof k7.h) {
                        this.f41015j0 = new MediaCrypto(null, null);
                    }
                    bVar = this.f41012g0;
                    if (bVar == null) {
                        z11 = false;
                    } else {
                        z11 = false;
                    }
                    U(this.f41015j0, z11);
                }
            } else {
                if (aVarN == null) {
                    if (bVar3.o() != null) {
                    }
                } else if (aVarN instanceof k7.h) {
                    try {
                        this.f41015j0 = new MediaCrypto(null, null);
                    } catch (MediaCryptoException e10) {
                        throw g(e10, this.f41010e0, false, 6006);
                    }
                }
                bVar = this.f41012g0;
                if (bVar == null) {
                    z11 = false;
                } else {
                    z11 = false;
                }
                U(this.f41015j0, z11);
            }
        }
        MediaCrypto mediaCrypto = this.f41015j0;
        if (mediaCrypto == null || this.f41019n0 != null) {
            return;
        }
        mediaCrypto.release();
        this.f41015j0 = null;
    }

    public final void U(MediaCrypto mediaCrypto, boolean z11) throws MediaCodecRenderer$DecoderInitializationException {
        y6.p pVar = this.f41010e0;
        pVar.getClass();
        if (this.f41024s0 == null) {
            try {
                List listK = K(z11);
                this.f41024s0 = new ArrayDeque();
                ArrayList arrayList = (ArrayList) listK;
                if (!arrayList.isEmpty()) {
                    this.f41024s0.add((n) arrayList.get(0));
                }
                this.f41025t0 = null;
            } catch (MediaCodecUtil$DecoderQueryException e8) {
                throw new MediaCodecRenderer$DecoderInitializationException(pVar, e8, z11, -49998);
            }
        }
        if (this.f41024s0.isEmpty()) {
            throw new MediaCodecRenderer$DecoderInitializationException(pVar, null, z11, -49999);
        }
        ArrayDeque arrayDeque = this.f41024s0;
        arrayDeque.getClass();
        while (this.f41019n0 == null) {
            n nVar = (n) arrayDeque.peekFirst();
            nVar.getClass();
            if (!V(pVar) || !r0(nVar)) {
                return;
            }
            try {
                R(nVar, mediaCrypto);
            } catch (Exception e10) {
                b7.a.C("Failed to initialize decoder: " + nVar, e10);
                arrayDeque.removeFirst();
                MediaCodecRenderer$DecoderInitializationException mediaCodecRenderer$DecoderInitializationException = new MediaCodecRenderer$DecoderInitializationException("Decoder init failed: " + nVar.f40984a + ", " + pVar, e10, pVar.f57291n, z11, nVar, e10 instanceof MediaCodec.CodecException ? ((MediaCodec.CodecException) e10).getDiagnosticInfo() : null);
                W(mediaCodecRenderer$DecoderInitializationException);
                MediaCodecRenderer$DecoderInitializationException mediaCodecRenderer$DecoderInitializationException2 = this.f41025t0;
                if (mediaCodecRenderer$DecoderInitializationException2 == null) {
                    this.f41025t0 = mediaCodecRenderer$DecoderInitializationException;
                } else {
                    this.f41025t0 = new MediaCodecRenderer$DecoderInitializationException(mediaCodecRenderer$DecoderInitializationException2.getMessage(), mediaCodecRenderer$DecoderInitializationException2.getCause(), mediaCodecRenderer$DecoderInitializationException2.f2140a, mediaCodecRenderer$DecoderInitializationException2.f2141b, mediaCodecRenderer$DecoderInitializationException2.f2142c, mediaCodecRenderer$DecoderInitializationException2.f2143d);
                }
                if (arrayDeque.isEmpty()) {
                    throw this.f41025t0;
                }
            }
        }
        this.f41024s0 = null;
    }

    public boolean V(y6.p pVar) {
        return true;
    }

    public abstract void W(Exception exc);

    public abstract void X(long j11, long j12, String str);

    public abstract void Y(String str);

    /* JADX WARN: Code duplicated, block: B:75:0x0106  */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00e3, code lost:
    
        if (r4.y(r2) != false) goto L128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public f7.g Z(ob.e r13) throws androidx.media3.exoplayer.ExoPlaybackException {
        /*
            Method dump skipped, instruction units count: 451
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m7.p.Z(ob.e):f7.g");
    }

    public abstract void a0(y6.p pVar, MediaFormat mediaFormat);

    public void c0(long j11) {
        this.f41003a1 = j11;
        while (true) {
            ArrayDeque arrayDeque = this.f41006c0;
            if (arrayDeque.isEmpty() || j11 < ((o) arrayDeque.peek()).f40997a) {
                return;
            }
            o oVar = (o) arrayDeque.poll();
            oVar.getClass();
            o0(oVar);
            d0();
        }
    }

    public abstract void d0();

    public final void f0() throws ExoPlaybackException {
        int i11 = this.N0;
        if (i11 == 1) {
            I();
            return;
        }
        if (i11 == 2) {
            I();
            w0();
        } else if (i11 != 3) {
            this.U0 = true;
            j0();
        } else {
            i0();
            T();
        }
    }

    public abstract boolean g0(long j11, long j12, l lVar, ByteBuffer byteBuffer, int i11, int i12, int i13, long j13, boolean z11, boolean z12, y6.p pVar);

    public final boolean h0(int i11) throws ExoPlaybackException {
        ob.e eVar = this.f26701c;
        eVar.f();
        e7.d dVar = this.X;
        dVar.n();
        int iX = x(eVar, dVar, i11 | 4);
        if (iX == -5) {
            Z(eVar);
            return true;
        }
        if (iX != -4 || !dVar.e(4)) {
            return false;
        }
        this.T0 = true;
        f0();
        return false;
    }

    @Override // f7.e
    public final long i(long j11, long j12) {
        return O(j11, j12);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void i0() {
        try {
            l lVar = this.f41019n0;
            if (lVar != null) {
                lVar.release();
                this.Y0.f26716b++;
                n nVar = this.f41026u0;
                nVar.getClass();
                Y(nVar.f40984a);
            }
            this.f41019n0 = null;
            try {
                MediaCrypto mediaCrypto = this.f41015j0;
                if (mediaCrypto != null) {
                    mediaCrypto.release();
                }
            } finally {
                this.f41015j0 = null;
                n0(null);
                m0();
            }
        } catch (Throwable th2) {
            this.f41019n0 = null;
            try {
                MediaCrypto mediaCrypto2 = this.f41015j0;
                if (mediaCrypto2 != null) {
                    mediaCrypto2.release();
                }
                throw th2;
            } finally {
                this.f41015j0 = null;
                n0(null);
                m0();
            }
        }
    }

    public abstract void j0();

    public final void k0() {
        this.R0 = -9223372036854775807L;
        this.S0 = -9223372036854775807L;
        this.f41003a1 = -9223372036854775807L;
        this.J0 = false;
        this.f41002a0.n();
        this.Z.n();
        this.I0 = false;
        b0 b0Var = this.f41008d0;
        b0Var.getClass();
        b0Var.f31826a = z6.f.f58943a;
        b0Var.f31828c = 0;
        b0Var.f31827b = 2;
    }

    public void l0() {
        this.C0 = -1;
        this.Y.f25115e = null;
        this.D0 = -1;
        this.E0 = null;
        this.R0 = -9223372036854775807L;
        this.S0 = -9223372036854775807L;
        this.f41003a1 = -9223372036854775807L;
        this.B0 = -9223372036854775807L;
        this.P0 = false;
        this.A0 = -9223372036854775807L;
        this.O0 = false;
        this.f41029x0 = false;
        this.f41030y0 = false;
        this.F0 = false;
        this.G0 = false;
        this.M0 = 0;
        this.N0 = 0;
        this.L0 = this.K0 ? 1 : 0;
        this.f41009d1 = false;
        this.e1 = -9223372036854775807L;
        this.f1 = -9223372036854775807L;
    }

    public final void m0() {
        l0();
        this.X0 = null;
        this.f41024s0 = null;
        this.f41026u0 = null;
        this.f41020o0 = null;
        this.f41021p0 = null;
        this.f41022q0 = false;
        this.Q0 = false;
        this.f41023r0 = -1.0f;
        this.f41027v0 = 0;
        this.f41028w0 = false;
        this.f41031z0 = false;
        this.K0 = false;
        this.L0 = 0;
    }

    public final void n0(hd.b bVar) {
        hd.b bVar2 = this.f41012g0;
        if (bVar2 != bVar) {
            if (bVar != null) {
                bVar.e(null);
            }
            if (bVar2 != null) {
                bVar2.x(null);
            }
        }
        this.f41012g0 = bVar;
    }

    @Override // f7.e
    public boolean o() {
        boolean zF;
        if (this.f41010e0 != null) {
            if (l()) {
                zF = this.P;
            } else {
                z0 z0Var = this.K;
                z0Var.getClass();
                zF = z0Var.f();
            }
            if (!zF) {
                if (!(this.D0 >= 0)) {
                    if (this.B0 != -9223372036854775807L) {
                        this.f26705t.getClass();
                        if (SystemClock.elapsedRealtime() < this.B0) {
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final void o0(o oVar) {
        this.Z0 = oVar;
        if (oVar.f40999c != -9223372036854775807L) {
            this.f41005b1 = true;
            b0();
        }
    }

    @Override // f7.e
    public void p() {
        this.f41010e0 = null;
        o0(o.f40996e);
        this.f41006c0.clear();
        if (!this.H0) {
            J();
        } else {
            this.H0 = false;
            k0();
        }
    }

    public boolean p0(e7.d dVar) {
        return false;
    }

    public boolean q0() {
        return true;
    }

    @Override // f7.e
    public void r(long j11, boolean z11) throws ExoPlaybackException {
        this.T0 = false;
        this.U0 = false;
        this.W0 = false;
        if (this.H0) {
            k0();
        } else if (J()) {
            T();
        }
        if (this.Z0.f41000d.t() > 0) {
            this.V0 = true;
        }
        this.Z0.f41000d.c();
        this.f41006c0.clear();
    }

    public boolean r0(n nVar) {
        return true;
    }

    public boolean s0() {
        int i11 = this.N0;
        if (i11 == 3 || (this.f41028w0 && !this.Q0)) {
            return true;
        }
        if (i11 != 2) {
            return false;
        }
        try {
            w0();
            return false;
        } catch (ExoPlaybackException e8) {
            b7.a.C("Failed to update the DRM session, releasing the codec instead.", e8);
            return true;
        }
    }

    public boolean t0(y6.p pVar) {
        return false;
    }

    public abstract int u0(i iVar, y6.p pVar);

    public final boolean v0(y6.p pVar) throws ExoPlaybackException {
        if (this.f41019n0 != null && this.N0 != 3 && this.H != 0) {
            float f5 = this.f41018m0;
            pVar.getClass();
            y6.p[] pVarArr = this.L;
            pVarArr.getClass();
            float fM = M(f5, pVar, pVarArr);
            float f11 = this.f41023r0;
            if (f11 != fM) {
                if (fM == -1.0f) {
                    if (this.O0) {
                        this.M0 = 1;
                        this.N0 = 3;
                        return false;
                    }
                    i0();
                    T();
                    return false;
                }
                if (f11 != -1.0f || fM > this.W) {
                    Bundle bundle = new Bundle();
                    bundle.putFloat("operating-rate", fM);
                    l lVar = this.f41019n0;
                    lVar.getClass();
                    lVar.a(bundle);
                    this.f41023r0 = fM;
                }
            }
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003a, code lost:
    
        if (r4 >= r0) goto L16;
     */
    @Override // f7.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void w(y6.p[] r12, long r13, long r15, p7.b0 r17) {
        /*
            r11 = this;
            m7.o r12 = r11.Z0
            long r0 = r12.f40999c
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r12 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r12 != 0) goto L24
            m7.o r4 = new m7.o
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7 = r13
            r9 = r15
            r4.<init>(r5, r7, r9)
            r11.o0(r4)
            boolean r12 = r11.f41007c1
            if (r12 == 0) goto L56
            r11.d0()
            return
        L24:
            java.util.ArrayDeque r12 = r11.f41006c0
            boolean r0 = r12.isEmpty()
            if (r0 == 0) goto L57
            long r0 = r11.R0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L3c
            long r4 = r11.f41003a1
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 == 0) goto L57
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 < 0) goto L57
        L3c:
            m7.o r4 = new m7.o
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7 = r13
            r9 = r15
            r4.<init>(r5, r7, r9)
            r11.o0(r4)
            m7.o r12 = r11.Z0
            long r12 = r12.f40999c
            int r12 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r12 == 0) goto L56
            r11.d0()
        L56:
            return
        L57:
            m7.o r0 = new m7.o
            long r1 = r11.R0
            r3 = r13
            r5 = r15
            r0.<init>(r1, r3, r5)
            r12.add(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: m7.p.w(y6.p[], long, long, p7.b0):void");
    }

    public final void w0() throws ExoPlaybackException {
        hd.b bVar = this.f41013h0;
        bVar.getClass();
        if (bVar.n() instanceof k7.h) {
            try {
                MediaCrypto mediaCrypto = this.f41015j0;
                mediaCrypto.getClass();
                mediaCrypto.setMediaDrmSession(null);
            } catch (MediaCryptoException e8) {
                throw g(e8, this.f41010e0, false, 6006);
            }
        }
        n0(this.f41013h0);
        this.M0 = 0;
        this.N0 = 0;
    }

    public final void x0(long j11) {
        y6.p pVar = (y6.p) this.Z0.f41000d.o(j11);
        if (pVar == null && this.f41005b1 && this.f41021p0 != null) {
            pVar = (y6.p) this.Z0.f41000d.n();
        }
        if (pVar != null) {
            this.f41011f0 = pVar;
        } else if (!this.f41022q0 || this.f41011f0 == null) {
            return;
        }
        y6.p pVar2 = this.f41011f0;
        pVar2.getClass();
        a0(pVar2, this.f41021p0);
        this.f41022q0 = false;
        this.f41005b1 = false;
    }

    @Override // f7.e
    public void y(long j11, long j12) throws ExoPlaybackException {
        boolean z11;
        boolean z12;
        boolean z13 = false;
        if (this.W0) {
            this.W0 = false;
            f0();
        }
        ExoPlaybackException exoPlaybackException = this.X0;
        if (exoPlaybackException != null) {
            this.X0 = null;
            throw exoPlaybackException;
        }
        try {
            if (this.U0) {
                j0();
                return;
            }
            if (this.f41010e0 != null || h0(2)) {
                T();
                if (this.H0) {
                    Trace.beginSection("bypassRender");
                    while (D(j11, j12)) {
                    }
                    Trace.endSection();
                } else if (this.f41019n0 != null) {
                    this.f26705t.getClass();
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    Trace.beginSection("drainAndFeed");
                    while (G(j11, j12)) {
                        long j13 = this.f41016k0;
                        if (j13 != -9223372036854775807L) {
                            this.f26705t.getClass();
                            z12 = SystemClock.elapsedRealtime() - jElapsedRealtime < j13;
                        }
                        if (!z12) {
                            break;
                        }
                    }
                    while (H()) {
                        long j14 = this.f41016k0;
                        if (j14 != -9223372036854775807L) {
                            this.f26705t.getClass();
                            z11 = SystemClock.elapsedRealtime() - jElapsedRealtime < j14;
                        }
                        if (!z11) {
                            break;
                        }
                    }
                    Trace.endSection();
                } else {
                    f7.f fVar = this.Y0;
                    int i11 = fVar.f26718d;
                    z0 z0Var = this.K;
                    z0Var.getClass();
                    fVar.f26718d = i11 + z0Var.m(j11 - this.M);
                    h0(1);
                }
                synchronized (this.Y0) {
                }
            }
        } catch (MediaCodec.CryptoException e8) {
            throw g(e8, this.f41010e0, false, f0.s(e8.getErrorCode()));
        } catch (IllegalStateException e10) {
            boolean z14 = e10 instanceof MediaCodec.CodecException;
            if (!z14) {
                StackTraceElement[] stackTrace = e10.getStackTrace();
                if (stackTrace.length <= 0 || !stackTrace[0].getClassName().equals("android.media.MediaCodec")) {
                    throw e10;
                }
            }
            W(e10);
            if (z14 && ((MediaCodec.CodecException) e10).isRecoverable()) {
                z13 = true;
            }
            if (z13) {
                i0();
            }
            MediaCodecDecoderException mediaCodecDecoderExceptionF = F(e10, this.f41026u0);
            throw g(mediaCodecDecoderExceptionF, this.f41010e0, z13, mediaCodecDecoderExceptionF.f2139a == 1101 ? INTENTS.RESULT_LOGIN_CHANGE_LAN_SUCCESS : INTENTS.RESULT_NEED_VERIFICATION_EMAIL);
        }
    }

    public void b0() {
    }

    public void e0(e7.d dVar) {
    }
}
