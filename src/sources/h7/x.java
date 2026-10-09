package h7;

import a0.b2;
import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioAttributes;
import android.media.AudioDeviceInfo;
import android.media.AudioFormat;
import android.media.AudioTrack;
import android.media.PlaybackParams;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Pair;
import androidx.media3.common.audio.AudioProcessor$UnhandledAudioFormatException;
import androidx.media3.exoplayer.audio.AudioSink$ConfigurationException;
import androidx.media3.exoplayer.audio.AudioSink$InitializationException;
import androidx.media3.exoplayer.audio.AudioSink$WriteException;
import b7.f0;
import com.google.android.gms.measurement.zfxB.ypOOxsaJG;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableListIterator;
import com.google.common.math.IntMath;
import com.google.common.primitives.Ints;
import com.yalantis.ucrop.view.CropImageView;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.Objects;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class x {

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public static final Object f31960n0 = new Object();

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public static ScheduledExecutorService f31961o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static int f31962p0;
    public y6.d A;
    public r B;
    public r C;
    public y6.e0 D;
    public boolean E;
    public ByteBuffer F;
    public int G;
    public long H;
    public long I;
    public long J;
    public long K;
    public int L;
    public boolean M;
    public boolean N;
    public long O;
    public float P;
    public ByteBuffer Q;
    public int R;
    public ByteBuffer S;
    public boolean T;
    public boolean U;
    public boolean V;
    public boolean W;
    public boolean X;
    public int Y;
    public boolean Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f31963a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public y6.e f31964a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xq.c f31965b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public a5.j f31966b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n f31967c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public boolean f31968c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e0 f31969d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public long f31970d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final z6.j f31971e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public long f31972e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final d0 f31973f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public boolean f31974f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ImmutableList f31975g;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public boolean f31976g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final m f31977h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public Looper f31978h0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ArrayDeque f31979i;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public long f31980i0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f31981j;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public long f31982j0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public w f31983k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public Handler f31984k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final t f31985l;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public Context f31986l0;
    public final t m;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public final boolean f31987m0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final y f31988n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final ob.u f31989o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final z f31990p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f31991q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public g7.j f31992r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public b2 f31993s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public q f31994t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public q f31995u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public z6.d f31996v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public AudioTrack f31997w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public c f31998x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public f f31999y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public ob.m f32000z;

    public x(p pVar) {
        int deviceId;
        Context context = pVar.f31927a;
        Context applicationContext = context == null ? null : context.getApplicationContext();
        this.f31963a = applicationContext;
        this.A = y6.d.f57180b;
        this.f31998x = applicationContext == null ? pVar.f31928b : null;
        this.f31965b = pVar.f31929c;
        int i11 = Build.VERSION.SDK_INT;
        this.f31981j = 0;
        this.f31988n = pVar.f31931e;
        ob.u uVar = pVar.f31933g;
        uVar.getClass();
        this.f31989o = uVar;
        this.f31977h = new m(new dm.a(this, 13));
        n nVar = new n();
        this.f31967c = nVar;
        e0 e0Var = new e0();
        e0Var.m = f0.f3976b;
        this.f31969d = e0Var;
        this.f31971e = new z6.j();
        this.f31973f = new d0();
        this.f31975g = ImmutableList.v(e0Var, nVar);
        this.P = 1.0f;
        this.Y = 0;
        this.f31964a0 = new y6.e();
        y6.e0 e0Var2 = y6.e0.f57184d;
        this.C = new r(e0Var2, 0L, 0L);
        this.D = e0Var2;
        this.E = false;
        this.f31979i = new ArrayDeque();
        this.f31985l = new t();
        this.m = new t();
        this.f31990p = pVar.f31932f;
        int i12 = -1;
        if (i11 >= 34 && context != null && (deviceId = context.getDeviceId()) != 0 && deviceId != -1) {
            i12 = deviceId;
        }
        this.f31991q = i12;
        this.f31987m0 = true;
    }

    public static boolean p(AudioTrack audioTrack) {
        return Build.VERSION.SDK_INT >= 29 && audioTrack.isOffloadedPlayback();
    }

    public final void a(long j11) {
        y6.e0 e0Var;
        q qVar = this.f31995u;
        boolean z11 = false;
        xq.c cVar = this.f31965b;
        if (qVar == null || !qVar.f31943j) {
            if (this.f31968c0 || qVar.f31936c != 0) {
                e0Var = y6.e0.f57184d;
            } else {
                int i11 = qVar.f31934a.H;
                e0Var = this.D;
                z6.i iVar = (z6.i) cVar.f56176d;
                float f5 = e0Var.f57185a;
                iVar.getClass();
                b7.a.d(f5 > CropImageView.DEFAULT_ASPECT_RATIO);
                if (iVar.f58974c != f5) {
                    iVar.f58974c = f5;
                    iVar.f58980i = true;
                }
                float f11 = e0Var.f57186b;
                b7.a.d(f11 > CropImageView.DEFAULT_ASPECT_RATIO);
                if (iVar.f58975d != f11) {
                    iVar.f58975d = f11;
                    iVar.f58980i = true;
                }
            }
            this.D = e0Var;
        } else {
            e0Var = y6.e0.f57184d;
        }
        y6.e0 e0Var2 = e0Var;
        if (!this.f31968c0) {
            q qVar2 = this.f31995u;
            if (qVar2.f31936c == 0) {
                int i12 = qVar2.f31934a.H;
                z11 = this.E;
                ((c0) cVar.f56175c).f31839o = z11;
            }
        }
        this.E = z11;
        this.f31979i.add(new r(e0Var2, Math.max(0L, j11), f0.P(this.f31995u.f31938e, k())));
        z6.d dVar = this.f31995u.f31942i;
        this.f31996v = dVar;
        dVar.a();
        b2 b2Var = this.f31993s;
        if (b2Var != null) {
            boolean z12 = this.E;
            ob.l lVar = ((a0) b2Var.f27b).f31806h1;
            Handler handler = (Handler) lVar.f44822b;
            if (handler != null) {
                handler.post(new com.adjust.sdk.b(lVar, z12, 9));
            }
        }
    }

    public final AudioTrack b(j jVar, y6.d dVar, int i11, y6.p pVar, Context context) throws AudioSink$InitializationException {
        try {
            AudioTrack audioTrackA = this.f31990p.a(jVar, dVar, i11, context);
            int state = audioTrackA.getState();
            if (state == 1) {
                return audioTrackA;
            }
            try {
                audioTrackA.release();
            } catch (Exception unused) {
            }
            throw new AudioSink$InitializationException(state, jVar.f31878b, jVar.f31879c, jVar.f31877a, jVar.f31882f, pVar, jVar.f31881e, null);
        } catch (IllegalArgumentException | UnsupportedOperationException e8) {
            throw new AudioSink$InitializationException(0, jVar.f31878b, jVar.f31879c, jVar.f31877a, jVar.f31882f, pVar, jVar.f31881e, e8);
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0026  */
    /* JADX WARN: Code duplicated, block: B:27:0x0041  */
    /* JADX WARN: Code duplicated, block: B:35:? A[SYNTHETIC] */
    public final AudioTrack c(q qVar) throws AudioSink$InitializationException {
        x xVar;
        AudioSink$InitializationException audioSink$InitializationException;
        b2 b2Var;
        Context context;
        int i11;
        try {
            int i12 = this.Y;
            int i13 = this.f31991q;
            if (i13 != -1) {
                try {
                    Context context2 = this.f31963a;
                    if (context2 == null || Build.VERSION.SDK_INT < 34) {
                        i11 = i12;
                        context = null;
                    } else {
                        if (this.f31986l0 == null) {
                            this.f31986l0 = context2.createDeviceContext(i13);
                        }
                        context = this.f31986l0;
                        i11 = 0;
                    }
                } catch (AudioSink$InitializationException e8) {
                    audioSink$InitializationException = e8;
                    xVar = this;
                    b2Var = xVar.f31993s;
                    if (b2Var != null) {
                        throw audioSink$InitializationException;
                    }
                    b2Var.j(audioSink$InitializationException);
                    throw audioSink$InitializationException;
                }
            } else {
                i11 = i12;
                context = null;
            }
            xVar = this;
            try {
                return xVar.b(qVar.a(), this.A, i11, qVar.f31934a, context);
            } catch (AudioSink$InitializationException e10) {
                e = e10;
                audioSink$InitializationException = e;
                b2Var = xVar.f31993s;
                if (b2Var != null) {
                    throw audioSink$InitializationException;
                }
                b2Var.j(audioSink$InitializationException);
                throw audioSink$InitializationException;
            }
        } catch (AudioSink$InitializationException e11) {
            e = e11;
            xVar = this;
        }
    }

    public final void d(y6.p pVar, int[] iArr) throws AudioSink$ConfigurationException {
        int iIntValue;
        int iIntValue2;
        int i11;
        int i12;
        z6.d dVar;
        boolean z11;
        int i13;
        boolean z12;
        int iG;
        int i14;
        q();
        String str = pVar.f57291n;
        int i15 = pVar.G;
        int i16 = pVar.F;
        int i17 = pVar.H;
        boolean zEquals = "audio/raw".equals(str);
        z zVar = this.f31990p;
        if (zEquals) {
            b7.a.d(f0.H(i17));
            int iQ = f0.q(i17) * i16;
            ImmutableList.Builder builder = new ImmutableList.Builder();
            builder.f(this.f31975g);
            builder.h(this.f31971e);
            builder.i((z6.f[]) this.f31965b.f56174b);
            z6.d dVar2 = new z6.d(builder.j());
            if (dVar2.equals(this.f31996v)) {
                dVar2 = this.f31996v;
            }
            int i18 = pVar.I;
            int i19 = pVar.J;
            e0 e0Var = this.f31969d;
            e0Var.f31852i = i18;
            e0Var.f31853j = i19;
            this.f31967c.f31924i = iArr;
            z6.e eVar = new z6.e(i15, i16, i17);
            try {
                ImmutableList immutableList = dVar2.f58934a;
                if (eVar.equals(z6.e.f58938e)) {
                    throw new AudioProcessor$UnhandledAudioFormatException(eVar);
                }
                for (int i21 = 0; i21 < immutableList.size(); i21++) {
                    z6.f fVar = (z6.f) immutableList.get(i21);
                    z6.e eVarE = fVar.e(eVar);
                    if (fVar.isActive()) {
                        b7.a.j(!eVarE.equals(z6.e.f58938e));
                        eVar = eVarE;
                    }
                }
                int i22 = eVar.f58940b;
                int i23 = eVar.f58941c;
                int i24 = eVar.f58939a;
                zVar.getClass();
                int iP = f0.p(i22);
                int iQ2 = f0.q(i23) * i22;
                i15 = i24;
                iIntValue2 = iP;
                i13 = 0;
                z12 = false;
                iIntValue = i23;
                i11 = iQ;
                i12 = iQ2;
                dVar = dVar2;
                z11 = false;
            } catch (AudioProcessor$UnhandledAudioFormatException e8) {
                throw new AudioSink$ConfigurationException(e8, pVar);
            }
        } else {
            z6.d dVar3 = new z6.d(ImmutableList.s());
            h hVarH = this.f31981j != 0 ? h(pVar) : h.f31871d;
            if (this.f31981j == 0 || !hVarH.f31872a) {
                Pair pairD = this.f31998x.d(this.A, pVar);
                if (pairD == null) {
                    throw new AudioSink$ConfigurationException("Unable to configure passthrough for: " + pVar, pVar);
                }
                iIntValue = ((Integer) pairD.first).intValue();
                iIntValue2 = ((Integer) pairD.second).intValue();
                i11 = -1;
                i12 = -1;
                dVar = dVar3;
                z11 = false;
                i13 = 2;
                z12 = false;
            } else {
                str.getClass();
                int iD = y6.d0.d(str, pVar.f57289k);
                zVar.getClass();
                int iP2 = f0.p(i16);
                boolean z13 = hVarH.f31873b;
                iIntValue2 = iP2;
                i13 = 1;
                z12 = true;
                dVar = dVar3;
                z11 = z13;
                iIntValue = iD;
                i11 = -1;
                i12 = -1;
            }
        }
        if (iIntValue == 0) {
            throw new AudioSink$ConfigurationException("Invalid output encoding (mode=" + i13 + ") for: " + pVar, pVar);
        }
        if (iIntValue2 == 0) {
            throw new AudioSink$ConfigurationException("Invalid output channel config (mode=" + i13 + ") for: " + pVar, pVar);
        }
        int i25 = pVar.f57288j;
        if ("audio/vnd.dts.hd;profile=lbr".equals(str) && i25 == -1) {
            i25 = 768000;
        }
        int minBufferSize = AudioTrack.getMinBufferSize(i15, iIntValue2, iIntValue);
        b7.a.j(minBufferSize != -2);
        int i26 = i12 != -1 ? i12 : 1;
        double d5 = z12 ? 8.0d : 1.0d;
        this.f31988n.getClass();
        if (i13 == 0) {
            i11 = i11;
            long j11 = i15;
            long j12 = ((long) 250000) * j11;
            long j13 = i26;
            iG = f0.g(minBufferSize * 4, Ints.b((j12 * j13) / 1000000), Ints.b(((((long) 750000) * j11) * j13) / 1000000));
        } else if (i13 == 1) {
            int i27 = x7.a.i(iIntValue);
            b7.a.j(i27 != -2147483647);
            iG = Ints.b((((long) 50000000) * ((long) i27)) / 1000000);
        } else {
            if (i13 != 2) {
                throw new IllegalArgumentException();
            }
            int i28 = iIntValue == 5 ? 500000 : iIntValue == 8 ? 1000000 : 250000;
            if (i25 != -1) {
                i14 = IntMath.c(i25, 8, RoundingMode.CEILING);
            } else {
                i14 = x7.a.i(iIntValue);
                b7.a.j(i14 != -2147483647);
            }
            iG = Ints.b((((long) i28) * ((long) i14)) / 1000000);
        }
        int iMax = (((Math.max(minBufferSize, (int) (((double) iG) * d5)) + i26) - 1) / i26) * i26;
        this.f31974f0 = false;
        q qVar = new q(pVar, i11, i13, i12, i15, iIntValue2, iIntValue, iMax, dVar, z12, z11, this.f31968c0);
        if (o()) {
            this.f31994t = qVar;
        } else {
            this.f31995u = qVar;
        }
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:48:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:49:0x00b6  */
    public final void e(long j11) throws AudioSink$WriteException {
        int iWrite;
        b2 b2Var;
        f7.c0 c0Var;
        boolean z11;
        t tVar = this.m;
        if (this.S == null) {
            return;
        }
        boolean z12 = false;
        if (((Exception) tVar.f31953c) != null) {
            synchronized (f31960n0) {
                z11 = f31962p0 > 0;
            }
            if (z11 || SystemClock.elapsedRealtime() < tVar.f31952b) {
                return;
            }
        }
        int iRemaining = this.S.remaining();
        if (this.f31968c0) {
            b7.a.j(j11 != -9223372036854775807L);
            if (j11 == Long.MIN_VALUE) {
                j11 = this.f31970d0;
            } else {
                this.f31970d0 = j11;
            }
            AudioTrack audioTrack = this.f31997w;
            ByteBuffer byteBuffer = this.S;
            if (Build.VERSION.SDK_INT >= 26) {
                iWrite = audioTrack.write(byteBuffer, iRemaining, 1, 1000 * j11);
            } else {
                if (this.F == null) {
                    ByteBuffer byteBufferAllocate = ByteBuffer.allocate(16);
                    this.F = byteBufferAllocate;
                    byteBufferAllocate.order(ByteOrder.BIG_ENDIAN);
                    this.F.putInt(1431633921);
                }
                if (this.G == 0) {
                    this.F.putInt(4, iRemaining);
                    this.F.putLong(8, j11 * 1000);
                    this.F.position(0);
                    this.G = iRemaining;
                }
                int iRemaining2 = this.F.remaining();
                if (iRemaining2 <= 0) {
                    iWrite = audioTrack.write(byteBuffer, iRemaining, 1);
                    if (iWrite < 0) {
                        this.G = 0;
                    } else {
                        this.G -= iWrite;
                    }
                } else {
                    int iWrite2 = audioTrack.write(this.F, iRemaining2, 1);
                    if (iWrite2 < 0) {
                        this.G = 0;
                        iWrite = iWrite2;
                    } else if (iWrite2 < iRemaining2) {
                        iWrite = 0;
                    } else {
                        iWrite = audioTrack.write(byteBuffer, iRemaining, 1);
                        if (iWrite < 0) {
                            this.G = 0;
                        } else {
                            this.G -= iWrite;
                        }
                    }
                }
            }
        } else {
            iWrite = this.f31997w.write(this.S, iRemaining, 1);
        }
        this.f31972e0 = SystemClock.elapsedRealtime();
        if (iWrite < 0) {
            if (iWrite == -6 || iWrite == -32) {
                if (k() > 0) {
                    z12 = true;
                } else if (p(this.f31997w)) {
                    if (this.f31995u.f31936c == 1) {
                        this.f31974f0 = true;
                    }
                    z12 = true;
                }
            }
            AudioSink$WriteException audioSink$WriteException = new AudioSink$WriteException(iWrite, this.f31995u.f31934a, z12);
            b2 b2Var2 = this.f31993s;
            if (b2Var2 != null) {
                b2Var2.j(audioSink$WriteException);
            }
            if (!audioSink$WriteException.f2128b || this.f31963a == null) {
                tVar.e(audioSink$WriteException);
                return;
            }
            c cVar = c.f31829c;
            this.f31998x = cVar;
            this.f31999y.a(cVar);
            throw audioSink$WriteException;
        }
        tVar.f31953c = null;
        tVar.f31951a = -9223372036854775807L;
        tVar.f31952b = -9223372036854775807L;
        if (p(this.f31997w)) {
            if (this.K > 0) {
                this.f31976g0 = false;
            }
            if (this.W && (b2Var = this.f31993s) != null && iWrite < iRemaining && !this.f31976g0 && (c0Var = ((a0) b2Var.f27b).f41014i0) != null) {
                c0Var.f26674a.f26765s0 = true;
            }
        }
        int i11 = this.f31995u.f31936c;
        if (i11 == 0) {
            this.J += (long) iWrite;
        }
        if (iWrite == iRemaining) {
            if (i11 != 0) {
                b7.a.j(this.S == this.Q);
                this.K = (((long) this.L) * ((long) this.R)) + this.K;
            }
            this.S = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0043 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:20:0x0044 A[RETURN] */
    public final boolean f() throws AudioSink$WriteException {
        ByteBuffer byteBuffer;
        if (!this.f31996v.d()) {
            e(Long.MIN_VALUE);
            if (this.S == null) {
                return true;
            }
            return false;
        }
        z6.d dVar = this.f31996v;
        if (dVar.d() && !dVar.f58937d) {
            dVar.f58937d = true;
            ((z6.f) dVar.f58935b.get(0)).d();
        }
        t(Long.MIN_VALUE);
        if (!this.f31996v.c() || ((byteBuffer = this.S) != null && byteBuffer.hasRemaining())) {
            return false;
        }
        return true;
    }

    public final void g() {
        if (o()) {
            this.H = 0L;
            this.I = 0L;
            this.J = 0L;
            this.K = 0L;
            this.f31976g0 = false;
            this.L = 0;
            this.C = new r(this.D, 0L, 0L);
            this.O = 0L;
            this.B = null;
            this.f31979i.clear();
            this.Q = null;
            this.R = 0;
            this.S = null;
            this.U = false;
            this.T = false;
            this.V = false;
            this.F = null;
            this.G = 0;
            this.f31969d.f31857o = 0L;
            z6.d dVar = this.f31995u.f31942i;
            this.f31996v = dVar;
            dVar.a();
            AudioTrack audioTrack = this.f31977h.f31901c;
            audioTrack.getClass();
            if (audioTrack.getPlayState() == 3) {
                this.f31997w.pause();
            }
            if (p(this.f31997w)) {
                w wVar = this.f31983k;
                wVar.getClass();
                wVar.a(this.f31997w);
            }
            j jVarA = this.f31995u.a();
            q qVar = this.f31994t;
            if (qVar != null) {
                this.f31995u = qVar;
                this.f31994t = null;
            }
            m mVar = this.f31977h;
            mVar.f();
            mVar.f31901c = null;
            mVar.f31903e = null;
            ob.m mVar2 = this.f32000z;
            if (mVar2 != null) {
                AudioTrack audioTrack2 = (AudioTrack) mVar2.f44826b;
                s sVar = (s) mVar2.f44828d;
                sVar.getClass();
                audioTrack2.removeOnRoutingChangedListener(sVar);
                mVar2.f44828d = null;
                this.f32000z = null;
            }
            AudioTrack audioTrack3 = this.f31997w;
            b2 b2Var = this.f31993s;
            Handler handler = new Handler(Looper.myLooper());
            synchronized (f31960n0) {
                try {
                    if (f31961o0 == null) {
                        String str = f0.f3975a;
                        f31961o0 = Executors.newSingleThreadScheduledExecutor(new b7.d0());
                    }
                    f31962p0++;
                    f31961o0.schedule(new cf.i(audioTrack3, b2Var, handler, jVarA, 3), 20L, TimeUnit.MILLISECONDS);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            this.f31997w = null;
        }
        t tVar = this.m;
        tVar.f31953c = null;
        tVar.f31951a = -9223372036854775807L;
        tVar.f31952b = -9223372036854775807L;
        t tVar2 = this.f31985l;
        tVar2.f31953c = null;
        tVar2.f31951a = -9223372036854775807L;
        tVar2.f31952b = -9223372036854775807L;
        this.f31980i0 = 0L;
        this.f31982j0 = 0L;
        Handler handler2 = this.f31984k0;
        if (handler2 != null) {
            handler2.removeCallbacksAndMessages(null);
        }
    }

    public final h h(y6.p pVar) {
        boolean zBooleanValue;
        if (this.f31974f0) {
            return h.f31871d;
        }
        y6.d dVar = this.A;
        ob.u uVar = this.f31989o;
        uVar.getClass();
        pVar.getClass();
        int i11 = pVar.G;
        dVar.getClass();
        int i12 = Build.VERSION.SDK_INT;
        if (i12 < 29 || i11 == -1) {
            return h.f31871d;
        }
        Context context = (Context) uVar.f44891b;
        Boolean bool = (Boolean) uVar.f44892c;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            if (context != null) {
                String parameters = z6.c.f(context).getParameters("offloadVariableRateSupported");
                uVar.f44892c = Boolean.valueOf(parameters != null && parameters.equals("offloadVariableRateSupported=1"));
            } else {
                uVar.f44892c = Boolean.FALSE;
            }
            zBooleanValue = ((Boolean) uVar.f44892c).booleanValue();
        }
        String str = pVar.f57291n;
        str.getClass();
        int iD = y6.d0.d(str, pVar.f57289k);
        if (iD == 0 || i12 < f0.o(iD)) {
            return h.f31871d;
        }
        int iP = f0.p(pVar.F);
        if (iP == 0) {
            return h.f31871d;
        }
        try {
            AudioFormat audioFormatBuild = new AudioFormat.Builder().setSampleRate(i11).setChannelMask(iP).setEncoding(iD).build();
            return i12 >= 31 ? b2.d.b(audioFormatBuild, (AudioAttributes) dVar.a().f52461b, zBooleanValue) : c3.c.e(audioFormatBuild, (AudioAttributes) dVar.a().f52461b, zBooleanValue);
        } catch (IllegalArgumentException unused) {
            return h.f31871d;
        }
    }

    public final int i(y6.p pVar) {
        q();
        String str = pVar.f57291n;
        int i11 = pVar.H;
        if ("audio/raw".equals(str)) {
            if (!f0.H(i11)) {
                defpackage.e.y(i11, "Invalid PCM encoding: ");
                return 0;
            }
            if (i11 != 2) {
                return 1;
            }
        } else if (this.f31998x.d(this.A, pVar) == null) {
            return 0;
        }
        return 2;
    }

    public final long j() {
        q qVar = this.f31995u;
        return qVar.f31936c == 0 ? this.H / ((long) qVar.f31935b) : this.I;
    }

    public final long k() {
        q qVar = this.f31995u;
        if (qVar.f31936c != 0) {
            return this.K;
        }
        long j11 = this.J;
        long j12 = qVar.f31937d;
        String str = f0.f3975a;
        return ((j11 + j12) - 1) / j12;
    }

    public final boolean m() {
        if (!o()) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 29 && this.f31997w.isOffloadedPlayback() && this.V) {
            return false;
        }
        long jK = k();
        m mVar = this.f31977h;
        long jA = mVar.a();
        int i11 = mVar.f31904f;
        String str = f0.f3975a;
        return jK > f0.R(jA, (long) i11, 1000000L, RoundingMode.UP);
    }

    /* JADX WARN: Code duplicated, block: B:74:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:85:? A[SYNTHETIC] */
    public final boolean n() throws AudioSink$InitializationException {
        AudioTrack audioTrackC;
        m7.j jVar;
        g7.j jVar2;
        boolean z11;
        t tVar = this.f31985l;
        if (((Exception) tVar.f31953c) != null) {
            synchronized (f31960n0) {
                z11 = f31962p0 > 0;
            }
            if (z11 || SystemClock.elapsedRealtime() < tVar.f31952b) {
                return false;
            }
        }
        try {
            q qVar = this.f31995u;
            qVar.getClass();
            audioTrackC = c(qVar);
        } catch (AudioSink$InitializationException e8) {
            q qVar2 = this.f31995u;
            if (qVar2.f31941h > 1000000) {
                q qVar3 = new q(qVar2.f31934a, qVar2.f31935b, qVar2.f31936c, qVar2.f31937d, qVar2.f31938e, qVar2.f31939f, qVar2.f31940g, 1000000, qVar2.f31942i, qVar2.f31943j, qVar2.f31944k, qVar2.f31945l);
                try {
                    audioTrackC = c(qVar3);
                    this.f31995u = qVar3;
                } catch (AudioSink$InitializationException e10) {
                    e8.addSuppressed(e10);
                    if (this.f31995u.f31936c == 1) {
                        throw e8;
                    }
                    this.f31974f0 = true;
                    throw e8;
                }
            }
            if (this.f31995u.f31936c == 1) {
                throw e8;
            }
            this.f31974f0 = true;
            throw e8;
        }
        this.f31997w = audioTrackC;
        if (p(audioTrackC)) {
            AudioTrack audioTrack = this.f31997w;
            if (this.f31983k == null) {
                this.f31983k = new w(this);
            }
            w wVar = this.f31983k;
            Handler handler = wVar.f31957a;
            Objects.requireNonNull(handler);
            audioTrack.registerStreamEventCallback(new u(handler, 0), wVar.f31958b);
            q qVar4 = this.f31995u;
            if (qVar4.f31944k) {
                AudioTrack audioTrack2 = this.f31997w;
                y6.p pVar = qVar4.f31934a;
                audioTrack2.setOffloadDelayPadding(pVar.I, pVar.J);
            }
        }
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 31 && (jVar2 = this.f31992r) != null) {
            b2.d.e(this.f31997w, jVar2);
        }
        m mVar = this.f31977h;
        AudioTrack audioTrack3 = this.f31997w;
        q qVar5 = this.f31995u;
        int i12 = qVar5.f31936c;
        int i13 = qVar5.f31940g;
        int i14 = qVar5.f31937d;
        int i15 = qVar5.f31941h;
        boolean z12 = this.f31987m0;
        mVar.f31901c = audioTrack3;
        mVar.f31902d = i15;
        mVar.f31903e = new l(audioTrack3, mVar.f31899a);
        mVar.f31904f = audioTrack3.getSampleRate();
        boolean zH = f0.H(i13);
        mVar.f31913p = zH;
        mVar.f31905g = zH ? f0.P(mVar.f31904f, i15 / i14) : -9223372036854775807L;
        mVar.f31916s = 0L;
        mVar.f31917t = 0L;
        mVar.D = false;
        mVar.E = 0L;
        mVar.f31920w = -9223372036854775807L;
        mVar.f31921x = -9223372036854775807L;
        mVar.f31914q = 0L;
        mVar.f31912o = 0L;
        mVar.f31906h = 1.0f;
        mVar.f31909k = 0;
        mVar.f31908j = -9223372036854775807L;
        mVar.A = z12;
        if (o()) {
            this.f31997w.setVolume(this.P);
        }
        this.f31964a0.getClass();
        a5.j jVar3 = this.f31966b0;
        if (jVar3 != null) {
            this.f31997w.setPreferredDevice((AudioDeviceInfo) jVar3.f385b);
            f fVar = this.f31999y;
            if (fVar != null) {
                fVar.b((AudioDeviceInfo) this.f31966b0.f385b);
            }
        }
        f fVar2 = this.f31999y;
        if (fVar2 != null) {
            this.f32000z = new ob.m(this.f31997w, fVar2);
        }
        this.N = true;
        int audioSessionId = this.f31997w.getAudioSessionId();
        boolean z13 = audioSessionId != this.Y;
        this.Y = audioSessionId;
        b2 b2Var = this.f31993s;
        if (b2Var != null) {
            j jVarA = this.f31995u.a();
            ob.l lVar = ((a0) b2Var.f27b).f31806h1;
            Handler handler2 = (Handler) lVar.f44822b;
            if (handler2 != null) {
                handler2.post(new i(lVar, jVarA, 7));
            }
            if (z13) {
                this.Z = true;
                b2 b2Var2 = this.f31993s;
                int i16 = this.Y;
                a0 a0Var = (a0) b2Var2.f27b;
                if (i11 >= 35 && (jVar = a0Var.f31808j1) != null) {
                    jVar.d(i16);
                }
                ob.l lVar2 = a0Var.f31806h1;
                Handler handler3 = (Handler) lVar2.f44822b;
                if (handler3 != null) {
                    handler3.post(new b1.f(lVar2, i16, 3));
                }
            }
        }
        return true;
    }

    public final boolean o() {
        return this.f31997w != null;
    }

    public final void r() {
        this.W = true;
        if (o()) {
            m mVar = this.f31977h;
            if (mVar.f31920w != -9223372036854775807L) {
                mVar.F.getClass();
                mVar.f31920w = f0.K(SystemClock.elapsedRealtime());
            }
            mVar.f31908j = f0.P(mVar.f31904f, mVar.b());
            l lVar = mVar.f31903e;
            lVar.getClass();
            lVar.a(0);
            if (!this.U || p(this.f31997w)) {
                this.f31997w.play();
            }
        }
    }

    public final void s() {
        if (this.U) {
            return;
        }
        this.U = true;
        long jK = k();
        m mVar = this.f31977h;
        mVar.f31922y = mVar.b();
        mVar.F.getClass();
        mVar.f31920w = f0.K(SystemClock.elapsedRealtime());
        mVar.f31923z = jK;
        if (p(this.f31997w)) {
            this.V = false;
        }
        this.f31997w.stop();
        this.G = 0;
    }

    public final void t(long j11) throws AudioSink$WriteException {
        ByteBuffer byteBuffer;
        e(j11);
        if (this.S != null) {
            return;
        }
        if (!this.f31996v.d()) {
            ByteBuffer byteBuffer2 = this.Q;
            if (byteBuffer2 != null) {
                x(byteBuffer2);
                e(j11);
                return;
            }
            return;
        }
        while (!this.f31996v.c()) {
            do {
                z6.d dVar = this.f31996v;
                if (dVar.d()) {
                    ByteBuffer byteBuffer3 = dVar.f58936c[dVar.b()];
                    if (byteBuffer3.hasRemaining()) {
                        byteBuffer = byteBuffer3;
                    } else {
                        dVar.e(z6.f.f58943a);
                        byteBuffer = dVar.f58936c[dVar.b()];
                    }
                } else {
                    byteBuffer = z6.f.f58943a;
                }
                if (byteBuffer.hasRemaining()) {
                    x(byteBuffer);
                    e(j11);
                } else {
                    ByteBuffer byteBuffer4 = this.Q;
                    if (byteBuffer4 == null || !byteBuffer4.hasRemaining()) {
                        return;
                    }
                    z6.d dVar2 = this.f31996v;
                    ByteBuffer byteBuffer5 = this.Q;
                    if (dVar2.d() && !dVar2.f58937d) {
                        dVar2.e(byteBuffer5);
                    }
                }
            } while (this.S == null);
            return;
        }
    }

    public final void u() {
        g();
        UnmodifiableListIterator unmodifiableListIteratorListIterator = this.f31975g.listIterator(0);
        while (unmodifiableListIteratorListIterator.hasNext()) {
            ((z6.f) unmodifiableListIteratorListIterator.next()).reset();
        }
        this.f31971e.reset();
        this.f31973f.reset();
        z6.d dVar = this.f31996v;
        if (dVar != null) {
            ImmutableList immutableList = dVar.f58934a;
            for (int i11 = 0; i11 < immutableList.size(); i11++) {
                z6.f fVar = (z6.f) immutableList.get(i11);
                fVar.flush();
                fVar.reset();
            }
            dVar.f58936c = new ByteBuffer[0];
            z6.e eVar = z6.e.f58938e;
            dVar.f58937d = false;
        }
        this.W = false;
        this.f31974f0 = false;
    }

    public final void v() {
        if (o()) {
            try {
                this.f31997w.setPlaybackParams(new PlaybackParams().allowDefaults().setSpeed(this.D.f57185a).setPitch(this.D.f57186b).setAudioFallbackMode(2));
            } catch (IllegalArgumentException e8) {
                b7.a.C("Failed to set playback params", e8);
            }
            y6.e0 e0Var = new y6.e0(this.f31997w.getPlaybackParams().getSpeed(), this.f31997w.getPlaybackParams().getPitch());
            this.D = e0Var;
            float f5 = e0Var.f57185a;
            m mVar = this.f31977h;
            mVar.f31906h = f5;
            l lVar = mVar.f31903e;
            if (lVar != null) {
                lVar.a(0);
            }
            mVar.f();
        }
    }

    public final void w(int i11, int i12) {
        q qVar;
        AudioTrack audioTrack = this.f31997w;
        if (audioTrack == null || !p(audioTrack) || (qVar = this.f31995u) == null || !qVar.f31944k) {
            return;
        }
        this.f31997w.setOffloadDelayPadding(i11, i12);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0038  */
    /* JADX WARN: Code duplicated, block: B:47:0x0141  */
    /* JADX WARN: Code duplicated, block: B:49:0x0144  */
    /* JADX WARN: Code duplicated, block: B:51:0x0147 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:52:0x0149  */
    /* JADX WARN: Code duplicated, block: B:54:0x014d  */
    /* JADX WARN: Code duplicated, block: B:56:0x0151  */
    /* JADX WARN: Code duplicated, block: B:58:0x0155  */
    /* JADX WARN: Code duplicated, block: B:60:0x0159  */
    /* JADX WARN: Code duplicated, block: B:63:0x0177  */
    /* JADX WARN: Code duplicated, block: B:64:0x018a  */
    /* JADX WARN: Code duplicated, block: B:65:0x0197  */
    /* JADX WARN: Code duplicated, block: B:66:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:67:0x01c1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:68:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:69:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:70:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:71:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:81:0x0171 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:82:0x01ed A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:84:0x0057 A[SYNTHETIC] */
    public final void x(ByteBuffer byteBuffer) {
        ByteBuffer byteBufferOrder;
        int i11;
        byte b3;
        int i12;
        int i13;
        int i14;
        b7.a.j(this.S == null);
        if (byteBuffer.hasRemaining()) {
            if (this.f31995u.f31936c != 0) {
                byteBufferOrder = byteBuffer;
            } else {
                int iR = (int) f0.R(f0.K(20L), this.f31995u.f31938e, 1000000L, RoundingMode.UP);
                long jK = k();
                long j11 = iR;
                if (jK >= j11) {
                    byteBufferOrder = byteBuffer;
                } else {
                    q qVar = this.f31995u;
                    int i15 = qVar.f31940g;
                    int i16 = qVar.f31937d;
                    int i17 = (int) jK;
                    byteBufferOrder = ByteBuffer.allocateDirect(byteBuffer.remaining()).order(ByteOrder.nativeOrder());
                    int iPosition = byteBuffer.position();
                    while (byteBuffer.hasRemaining() && i17 < iR) {
                        if (i15 != 2) {
                            if (i15 == 3) {
                                i13 = (byteBuffer.get() & 255) << 24;
                            } else if (i15 == 4) {
                                float f5 = f0.f(byteBuffer.getFloat(), -1.0f, 1.0f);
                                i13 = (int) (f5 < CropImageView.DEFAULT_ASPECT_RATIO ? (-f5) * (-2.1474836E9f) : f5 * 2.1474836E9f);
                            } else if (i15 != 21) {
                                if (i15 == 22) {
                                    i11 = (byteBuffer.get() & 255) | ((byteBuffer.get() & 255) << 8) | ((byteBuffer.get() & 255) << 16);
                                    b3 = byteBuffer.get();
                                } else if (i15 == 268435456) {
                                    i11 = (byteBuffer.get() & 255) << 24;
                                    i12 = (byteBuffer.get() & 255) << 16;
                                } else if (i15 == 1342177280) {
                                    i11 = ((byteBuffer.get() & 255) << 24) | ((byteBuffer.get() & 255) << 16);
                                    i12 = (byteBuffer.get() & 255) << 8;
                                } else {
                                    if (i15 != 1610612736) {
                                        throw new IllegalStateException();
                                    }
                                    i11 = ((byteBuffer.get() & 255) << 24) | ((byteBuffer.get() & 255) << 16) | ((byteBuffer.get() & 255) << 8);
                                    i12 = byteBuffer.get() & 255;
                                }
                                i13 = i11 | i12;
                            } else {
                                i11 = ((byteBuffer.get() & 255) << 8) | ((byteBuffer.get() & 255) << 16);
                                b3 = byteBuffer.get();
                            }
                            i14 = (int) ((((long) i13) * ((long) i17)) / j11);
                            if (i15 != 2) {
                                byteBufferOrder.put((byte) (i14 >> 16));
                                byteBufferOrder.put((byte) (i14 >> 24));
                            } else if (i15 != 3) {
                                byteBufferOrder.put((byte) (i14 >> 24));
                            } else if (i15 != 4) {
                                if (i15 != 21) {
                                    byteBufferOrder.put((byte) (i14 >> 8));
                                    byteBufferOrder.put((byte) (i14 >> 16));
                                    byteBufferOrder.put((byte) (i14 >> 24));
                                } else if (i15 != 22) {
                                    byteBufferOrder.put((byte) i14);
                                    byteBufferOrder.put((byte) (i14 >> 8));
                                    byteBufferOrder.put((byte) (i14 >> 16));
                                    byteBufferOrder.put((byte) (i14 >> 24));
                                } else if (i15 != 268435456) {
                                    byteBufferOrder.put((byte) (i14 >> 24));
                                    byteBufferOrder.put((byte) (i14 >> 16));
                                } else if (i15 != 1342177280) {
                                    byteBufferOrder.put((byte) (i14 >> 24));
                                    byteBufferOrder.put((byte) (i14 >> 16));
                                    byteBufferOrder.put((byte) (i14 >> 8));
                                } else {
                                    if (i15 == 1610612736) {
                                        throw new IllegalStateException();
                                    }
                                    byteBufferOrder.put((byte) (i14 >> 24));
                                    byteBufferOrder.put((byte) (i14 >> 16));
                                    byteBufferOrder.put((byte) (i14 >> 8));
                                    byteBufferOrder.put((byte) i14);
                                }
                            } else if (i14 < 0) {
                                byteBufferOrder.putFloat((-i14) / (-2.1474836E9f));
                            } else {
                                byteBufferOrder.putFloat(i14 / 2.1474836E9f);
                            }
                            if (byteBuffer.position() == iPosition + i16) {
                                i17++;
                                iPosition = byteBuffer.position();
                            }
                        } else {
                            i11 = (byteBuffer.get() & 255) << 16;
                            b3 = byteBuffer.get();
                        }
                        i12 = (b3 & 255) << 24;
                        i13 = i11 | i12;
                        i14 = (int) ((((long) i13) * ((long) i17)) / j11);
                        if (i15 != 2) {
                            byteBufferOrder.put((byte) (i14 >> 16));
                            byteBufferOrder.put((byte) (i14 >> 24));
                        } else if (i15 != 3) {
                            byteBufferOrder.put((byte) (i14 >> 24));
                        } else if (i15 != 4) {
                            if (i15 != 21) {
                                byteBufferOrder.put((byte) (i14 >> 8));
                                byteBufferOrder.put((byte) (i14 >> 16));
                                byteBufferOrder.put((byte) (i14 >> 24));
                            } else if (i15 != 22) {
                                byteBufferOrder.put((byte) i14);
                                byteBufferOrder.put((byte) (i14 >> 8));
                                byteBufferOrder.put((byte) (i14 >> 16));
                                byteBufferOrder.put((byte) (i14 >> 24));
                            } else if (i15 != 268435456) {
                                byteBufferOrder.put((byte) (i14 >> 24));
                                byteBufferOrder.put((byte) (i14 >> 16));
                            } else if (i15 != 1342177280) {
                                byteBufferOrder.put((byte) (i14 >> 24));
                                byteBufferOrder.put((byte) (i14 >> 16));
                                byteBufferOrder.put((byte) (i14 >> 8));
                            } else {
                                if (i15 == 1610612736) {
                                    throw new IllegalStateException();
                                }
                                byteBufferOrder.put((byte) (i14 >> 24));
                                byteBufferOrder.put((byte) (i14 >> 16));
                                byteBufferOrder.put((byte) (i14 >> 8));
                                byteBufferOrder.put((byte) i14);
                            }
                        } else if (i14 < 0) {
                            byteBufferOrder.putFloat((-i14) / (-2.1474836E9f));
                        } else {
                            byteBufferOrder.putFloat(i14 / 2.1474836E9f);
                        }
                        if (byteBuffer.position() == iPosition + i16) {
                            i17++;
                            iPosition = byteBuffer.position();
                        }
                    }
                    byteBufferOrder.put(byteBuffer);
                    byteBufferOrder.flip();
                }
            }
            this.S = byteBufferOrder;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:100:0x0195  */
    /* JADX WARN: Code duplicated, block: B:101:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:102:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:103:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:105:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:108:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:112:0x01e2 A[LOOP:0: B:104:0x01c0->B:112:0x01e2, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:115:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:116:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:118:0x0201  */
    /* JADX WARN: Code duplicated, block: B:119:0x0203  */
    /* JADX WARN: Code duplicated, block: B:122:0x020b  */
    /* JADX WARN: Code duplicated, block: B:123:0x020e  */
    /* JADX WARN: Code duplicated, block: B:125:0x0221  */
    /* JADX WARN: Code duplicated, block: B:126:0x0225  */
    /* JADX WARN: Code duplicated, block: B:129:0x0238  */
    /* JADX WARN: Code duplicated, block: B:134:0x0247  */
    /* JADX WARN: Code duplicated, block: B:154:0x0275  */
    /* JADX WARN: Code duplicated, block: B:155:0x0278  */
    /* JADX WARN: Code duplicated, block: B:157:0x027e  */
    /* JADX WARN: Code duplicated, block: B:158:0x0280  */
    /* JADX WARN: Code duplicated, block: B:160:0x028e  */
    /* JADX WARN: Code duplicated, block: B:163:0x029f  */
    /* JADX WARN: Code duplicated, block: B:165:0x02b5  */
    /* JADX WARN: Code duplicated, block: B:168:0x02c2  */
    /* JADX WARN: Code duplicated, block: B:187:0x0335  */
    /* JADX WARN: Code duplicated, block: B:189:0x033c  */
    /* JADX WARN: Code duplicated, block: B:190:0x033e  */
    /* JADX WARN: Code duplicated, block: B:192:0x034a A[LOOP:1: B:191:0x0348->B:192:0x034a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:195:0x035d A[LOOP:2: B:194:0x035b->B:195:0x035d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:199:0x037e  */
    /* JADX WARN: Code duplicated, block: B:200:0x0384  */
    /* JADX WARN: Code duplicated, block: B:207:0x039b  */
    /* JADX WARN: Code duplicated, block: B:210:0x03a5  */
    /* JADX WARN: Code duplicated, block: B:211:0x03ab  */
    /* JADX WARN: Code duplicated, block: B:213:0x03c5  */
    /* JADX WARN: Code duplicated, block: B:217:0x03d6  */
    /* JADX WARN: Code duplicated, block: B:221:0x03f4  */
    /* JADX WARN: Code duplicated, block: B:224:0x03fb  */
    /* JADX WARN: Code duplicated, block: B:226:0x040c  */
    /* JADX WARN: Code duplicated, block: B:231:0x041c  */
    /* JADX WARN: Code duplicated, block: B:232:0x0427  */
    /* JADX WARN: Code duplicated, block: B:234:0x0435  */
    /* JADX WARN: Code duplicated, block: B:236:0x0440  */
    /* JADX WARN: Code duplicated, block: B:238:0x0447  */
    /* JADX WARN: Code duplicated, block: B:240:0x0451  */
    /* JADX WARN: Code duplicated, block: B:244:0x0467  */
    /* JADX WARN: Code duplicated, block: B:247:0x00af A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:249:0x01e8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:250:0x01e0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:57:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:64:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:67:0x010b  */
    /* JADX WARN: Code duplicated, block: B:68:0x010d  */
    /* JADX WARN: Code duplicated, block: B:71:0x0112  */
    /* JADX WARN: Code duplicated, block: B:73:0x0124  */
    /* JADX WARN: Code duplicated, block: B:75:0x013c  */
    /* JADX WARN: Code duplicated, block: B:76:0x014b  */
    /* JADX WARN: Code duplicated, block: B:79:0x0151  */
    /* JADX WARN: Code duplicated, block: B:81:0x0159  */
    /* JADX WARN: Code duplicated, block: B:82:0x015b  */
    /* JADX WARN: Code duplicated, block: B:86:0x0167  */
    /* JADX WARN: Code duplicated, block: B:92:0x0179  */
    /* JADX WARN: Code duplicated, block: B:94:0x017f  */
    /* JADX WARN: Code duplicated, block: B:96:0x0184  */
    /* JADX WARN: Code duplicated, block: B:98:0x0189  */
    /* JADX WARN: Code restructure failed: missing block: B:203:0x0394, code lost:
    
        if (r15 == 0) goto L204;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00b3, code lost:
    
        if (n() == false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean l(java.nio.ByteBuffer r28, long r29, int r31) throws androidx.media3.exoplayer.audio.AudioSink$WriteException, androidx.media3.exoplayer.audio.AudioSink$InitializationException {
        /*
            Method dump skipped, instruction units count: 1172
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: h7.x.l(java.nio.ByteBuffer, long, int):boolean");
    }

    public final void q() {
        boolean z11;
        String name;
        Context context;
        c cVar;
        Looper looperMyLooper = Looper.myLooper();
        if (this.f31999y != null && this.f31978h0 != looperMyLooper) {
            z11 = false;
        } else {
            z11 = true;
        }
        StringBuilder sb2 = new StringBuilder("DefaultAudioSink accessed on multiple threads: ");
        Looper looper = this.f31978h0;
        String name2 = "null";
        if (looper == null) {
            name = "null";
        } else {
            name = looper.getThread().getName();
        }
        sb2.append(name);
        sb2.append(" and ");
        if (looperMyLooper != null) {
            name2 = looperMyLooper.getThread().getName();
        }
        sb2.append(name2);
        b7.a.i(sb2.toString(), z11);
        if (this.f31999y == null && (context = this.f31963a) != null) {
            this.f31978h0 = looperMyLooper;
            f fVar = new f(context, new com.google.firebase.database.android.d(this, 29), this.A, this.f31966b0);
            this.f31999y = fVar;
            if (fVar.f31867j) {
                cVar = fVar.f31864g;
                cVar.getClass();
            } else {
                fVar.f31867j = true;
                e eVar = fVar.f31863f;
                if (eVar != null) {
                    eVar.f31849a.registerContentObserver(eVar.f31850b, false, eVar);
                }
                Handler handler = fVar.f31860c;
                Context context2 = fVar.f31858a;
                d dVar = fVar.f31861d;
                if (dVar != null) {
                    z6.c.f(context2).registerAudioDeviceCallback(dVar, handler);
                }
                c cVarB = c.b(context2, context2.registerReceiver(fVar.f31862e, new IntentFilter(ypOOxsaJG.XFk), null, handler), fVar.f31866i, fVar.f31865h);
                fVar.f31864g = cVarB;
                cVar = cVarB;
            }
            this.f31998x = cVar;
        }
        this.f31998x.getClass();
    }
}
