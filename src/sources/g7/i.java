package g7;

import android.content.Context;
import android.media.DeniedByServerException;
import android.media.MediaCodec;
import android.media.MediaDrm;
import android.media.MediaDrmResetException;
import android.media.NotProvisionedException;
import android.media.metrics.LogSessionId;
import android.media.metrics.MediaMetricsManager;
import android.media.metrics.NetworkEvent;
import android.media.metrics.PlaybackErrorEvent;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackSession;
import android.media.metrics.PlaybackStateEvent;
import android.media.metrics.TrackChangeEvent;
import android.os.SystemClock;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.util.Pair;
import android.util.SparseArray;
import androidx.media3.common.ParserException;
import androidx.media3.common.PlaybackException;
import androidx.media3.datasource.FileDataSource$FileDataSourceException;
import androidx.media3.datasource.HttpDataSource$HttpDataSourceException;
import androidx.media3.datasource.HttpDataSource$InvalidContentTypeException;
import androidx.media3.datasource.HttpDataSource$InvalidResponseCodeException;
import androidx.media3.datasource.UdpDataSource$UdpDataSourceException;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.audio.AudioSink$InitializationException;
import androidx.media3.exoplayer.audio.AudioSink$WriteException;
import androidx.media3.exoplayer.drm.DefaultDrmSessionManager$MissingSchemeDataException;
import androidx.media3.exoplayer.drm.DrmSession$DrmSessionException;
import androidx.media3.exoplayer.drm.UnsupportedDrmException;
import androidx.media3.exoplayer.mediacodec.MediaCodecDecoderException;
import androidx.media3.exoplayer.mediacodec.MediaCodecRenderer$DecoderInitializationException;
import b7.f0;
import com.google.common.collect.UnmodifiableListIterator;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.Executor;
import ob.l;
import p7.b0;
import y6.j0;
import y6.m0;
import y6.n;
import y6.n0;
import y6.o0;
import y6.p;
import y6.u;
import y6.u0;
import y6.v0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class i implements b {
    public int A;
    public boolean B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f28827a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h f28829c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final PlaybackSession f28830d;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f28836j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public PlaybackMetrics.Builder f28837k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f28838l;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public PlaybackException f28840o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ij.d f28841p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public ij.d f28842q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public ij.d f28843r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public p f28844s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public p f28845t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public p f28846u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f28847v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f28848w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f28849x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f28850y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f28851z;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Executor f28828b = b7.a.q();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final n0 f28832f = new n0();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final m0 f28833g = new m0();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final HashMap f28835i = new HashMap();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final HashMap f28834h = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f28831e = SystemClock.elapsedRealtime();
    public int m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f28839n = 0;

    public i(Context context, PlaybackSession playbackSession) {
        this.f28827a = context.getApplicationContext();
        this.f28830d = playbackSession;
        h hVar = new h();
        this.f28829c = hVar;
        hVar.f28823d = this;
    }

    public static i g(Context context) {
        MediaMetricsManager mediaMetricsManager = (MediaMetricsManager) context.getSystemService("media_metrics");
        if (mediaMetricsManager == null) {
            return null;
        }
        return new i(context, mediaMetricsManager.createPlaybackSession());
    }

    public final boolean f(ij.d dVar) {
        String str;
        if (dVar == null) {
            return false;
        }
        String str2 = (String) dVar.f34423d;
        h hVar = this.f28829c;
        synchronized (hVar) {
            str = hVar.f28825f;
        }
        return str2.equals(str);
    }

    public final void h() {
        PlaybackMetrics.Builder builder = this.f28837k;
        if (builder != null && this.B) {
            builder.setAudioUnderrunCount(this.A);
            this.f28837k.setVideoFramesDropped(this.f28850y);
            this.f28837k.setVideoFramesPlayed(this.f28851z);
            Long l9 = (Long) this.f28834h.get(this.f28836j);
            this.f28837k.setNetworkTransferDurationMillis(l9 == null ? 0L : l9.longValue());
            Long l11 = (Long) this.f28835i.get(this.f28836j);
            this.f28837k.setNetworkBytesRead(l11 == null ? 0L : l11.longValue());
            this.f28837k.setStreamSource((l11 == null || l11.longValue() <= 0) ? 0 : 1);
            this.f28828b.execute(new b2.c(15, this, this.f28837k.build()));
        }
        this.f28837k = null;
        this.f28836j = null;
        this.A = 0;
        this.f28850y = 0;
        this.f28851z = 0;
        this.f28844s = null;
        this.f28845t = null;
        this.f28846u = null;
        this.B = false;
    }

    public final LogSessionId i() {
        return this.f28830d.getSessionId();
    }

    public final void j(o0 o0Var, b0 b0Var) {
        int iB;
        PlaybackMetrics.Builder builder = this.f28837k;
        if (b0Var == null || (iB = o0Var.b(b0Var.f46328a)) == -1) {
            return;
        }
        m0 m0Var = this.f28833g;
        int i11 = 0;
        o0Var.f(iB, m0Var, false);
        int i12 = m0Var.f57230c;
        n0 n0Var = this.f28832f;
        o0Var.n(i12, n0Var);
        u uVar = n0Var.f57240c.f57373b;
        if (uVar != null) {
            int iE = f0.E(uVar.f57358a, uVar.f57359b);
            if (iE == 0) {
                i11 = 3;
            } else if (iE != 1) {
                i11 = iE != 2 ? 1 : 4;
            } else {
                i11 = 5;
            }
        }
        builder.setStreamType(i11);
        if (n0Var.m != -9223372036854775807L && !n0Var.f57248k && !n0Var.f57246i && !n0Var.a()) {
            builder.setMediaDurationMillis(f0.V(n0Var.m));
        }
        builder.setPlaybackType(n0Var.a() ? 2 : 1);
        this.B = true;
    }

    /* JADX WARN: Code duplicated, block: B:254:0x0480  */
    /* JADX WARN: Code duplicated, block: B:387:0x0620  */
    /* JADX WARN: Code duplicated, block: B:390:0x064e  */
    /* JADX WARN: Code duplicated, block: B:394:0x0662 A[Catch: all -> 0x0671, TryCatch #0 {all -> 0x0671, blocks: (B:392:0x065e, B:394:0x0662, B:397:0x0673, B:398:0x067d, B:400:0x0683, B:402:0x0690, B:404:0x0694), top: B:411:0x065e }] */
    /* JADX WARN: Code duplicated, block: B:400:0x0683 A[Catch: all -> 0x0671, TryCatch #0 {all -> 0x0671, blocks: (B:392:0x065e, B:394:0x0662, B:397:0x0673, B:398:0x067d, B:400:0x0683, B:402:0x0690, B:404:0x0694), top: B:411:0x065e }] */
    /* JADX WARN: Code duplicated, block: B:410:0x069e A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:411:0x065e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    public final void k(j0 j0Var, l lVar) {
        int i11;
        boolean z11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        a9.e eVar;
        a9.e eVar2;
        int i18;
        int i19;
        int i21;
        int i22;
        a9.e eVar3;
        int i23;
        int i24;
        ij.d dVar;
        int i25;
        int i26;
        int i27;
        boolean z12;
        h hVar;
        String str;
        Iterator it;
        g gVar;
        i iVar;
        p pVar;
        y6.l lVar2;
        int i28;
        if (((n) lVar.f44822b).f57235a.size() == 0) {
            return;
        }
        int i29 = 0;
        int i30 = 0;
        while (true) {
            boolean z13 = true;
            if (i30 >= ((n) lVar.f44822b).f57235a.size()) {
                break;
            }
            int iA = ((n) lVar.f44822b).a(i30);
            a aVar = (a) ((SparseArray) lVar.f44823c).get(iA);
            aVar.getClass();
            if (iA == 0) {
                h hVar2 = this.f28829c;
                synchronized (hVar2) {
                    try {
                        hVar2.f28823d.getClass();
                        o0 o0Var = hVar2.f28824e;
                        hVar2.f28824e = aVar.f28785b;
                        Iterator it2 = hVar2.f28822c.values().iterator();
                        while (it2.hasNext()) {
                            g gVar2 = (g) it2.next();
                            if (!gVar2.b(o0Var, hVar2.f28824e) || gVar2.a(aVar)) {
                                it2.remove();
                                if (gVar2.f28815e) {
                                    if (gVar2.f28811a.equals(hVar2.f28825f)) {
                                        hVar2.a(gVar2);
                                    }
                                    hVar2.f28823d.m(aVar, gVar2.f28811a);
                                }
                            }
                        }
                        hVar2.d(aVar);
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            } else if (iA == 11) {
                h hVar3 = this.f28829c;
                int i31 = this.f28838l;
                synchronized (hVar3) {
                    try {
                        hVar3.f28823d.getClass();
                        if (i31 != 0) {
                            z13 = false;
                        }
                        Iterator it3 = hVar3.f28822c.values().iterator();
                        while (it3.hasNext()) {
                            g gVar3 = (g) it3.next();
                            if (gVar3.a(aVar)) {
                                it3.remove();
                                if (gVar3.f28815e) {
                                    boolean zEquals = gVar3.f28811a.equals(hVar3.f28825f);
                                    if (z13 && zEquals) {
                                        boolean z14 = gVar3.f28816f;
                                    }
                                    if (zEquals) {
                                        hVar3.a(gVar3);
                                    }
                                    hVar3.f28823d.m(aVar, gVar3.f28811a);
                                }
                            }
                        }
                        hVar3.d(aVar);
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
            } else {
                this.f28829c.e(aVar);
            }
            i30++;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (lVar.v(0)) {
            a aVar2 = (a) ((SparseArray) lVar.f44823c).get(0);
            aVar2.getClass();
            if (this.f28837k != null) {
                j(aVar2.f28785b, aVar2.f28787d);
            }
        }
        if (lVar.v(2) && this.f28837k != null) {
            UnmodifiableListIterator unmodifiableListIteratorListIterator = j0Var.v().f57370a.listIterator(0);
            loop3: while (true) {
                if (!unmodifiableListIteratorListIterator.hasNext()) {
                    lVar2 = null;
                    break;
                }
                u0 u0Var = (u0) unmodifiableListIteratorListIterator.next();
                for (int i32 = 0; i32 < u0Var.f57363a; i32++) {
                    if (u0Var.f57367e[i32] && (lVar2 = u0Var.f57364b.f57307d[i32].f57295r) != null) {
                        break loop3;
                    }
                }
            }
            if (lVar2 != null) {
                PlaybackMetrics.Builder builder = this.f28837k;
                int i33 = 0;
                while (true) {
                    if (i33 >= lVar2.f57227d) {
                        i28 = 1;
                        break;
                    }
                    UUID uuid = lVar2.f57224a[i33].f57217b;
                    if (uuid.equals(y6.f.f57191d)) {
                        i28 = 3;
                        break;
                    } else if (uuid.equals(y6.f.f57192e)) {
                        i28 = 2;
                        break;
                    } else {
                        if (uuid.equals(y6.f.f57190c)) {
                            i28 = 6;
                            break;
                        }
                        i33++;
                    }
                }
                builder.setDrmType(i28);
            }
        }
        if (lVar.v(1011)) {
            this.A++;
        }
        PlaybackException playbackException = this.f28840o;
        int i34 = 5;
        if (playbackException == null) {
            i14 = 4;
            i23 = 1;
            i24 = 2;
            i17 = 13;
            i12 = 9;
            i13 = 8;
            i15 = 7;
            i16 = 6;
        } else {
            int i35 = playbackException.f2112a;
            Context context = this.f28827a;
            boolean z15 = this.f28848w == 4;
            if (i35 == 1001) {
                eVar = new a9.e(20, i29, 2);
            } else {
                if (playbackException instanceof ExoPlaybackException) {
                    ExoPlaybackException exoPlaybackException = (ExoPlaybackException) playbackException;
                    z11 = exoPlaybackException.f2119c == 1;
                    i11 = exoPlaybackException.f2123t;
                } else {
                    i11 = 0;
                    z11 = false;
                }
                Throwable cause = playbackException.getCause();
                cause.getClass();
                int i36 = 27;
                int i37 = 23;
                if (cause instanceof IOException) {
                    if (cause instanceof HttpDataSource$InvalidResponseCodeException) {
                        eVar3 = new a9.e(i34, ((HttpDataSource$InvalidResponseCodeException) cause).f2117d, 2);
                    } else {
                        if ((cause instanceof HttpDataSource$InvalidContentTypeException) || (cause instanceof ParserException)) {
                            i18 = 6;
                            i19 = 7;
                            i21 = 4;
                            i22 = 8;
                            i12 = 9;
                            eVar = new a9.e(z15 ? 10 : 11, i29, 2);
                        } else {
                            boolean z16 = cause instanceof HttpDataSource$HttpDataSourceException;
                            if (z16 || (cause instanceof UdpDataSource$UdpDataSourceException)) {
                                i12 = 9;
                                if (b7.u.a(context).b() == 1) {
                                    eVar = new a9.e(3, i29, 2);
                                } else {
                                    Throwable cause2 = cause.getCause();
                                    if (cause2 instanceof UnknownHostException) {
                                        eVar = new a9.e(6, i29, 2);
                                        i16 = 6;
                                        i17 = 13;
                                        i13 = 8;
                                        i14 = 4;
                                        i15 = 7;
                                    } else {
                                        i18 = 6;
                                        if (cause2 instanceof SocketTimeoutException) {
                                            eVar = new a9.e(7, i29, 2);
                                            i16 = 6;
                                            i15 = 7;
                                            i17 = 13;
                                            i13 = 8;
                                            i14 = 4;
                                        } else {
                                            i19 = 7;
                                            if (z16 && ((HttpDataSource$HttpDataSourceException) cause).f2116c == 1) {
                                                eVar = new a9.e(4, i29, 2);
                                                i16 = 6;
                                                i15 = 7;
                                                i14 = 4;
                                                i17 = 13;
                                                i13 = 8;
                                            } else {
                                                i21 = 4;
                                                i22 = 8;
                                                eVar = new a9.e(i22, i29, 2);
                                            }
                                        }
                                    }
                                }
                            } else if (i35 == 1002) {
                                eVar = new a9.e(21, i29, 2);
                            } else if (cause instanceof DrmSession$DrmSessionException) {
                                Throwable cause3 = cause.getCause();
                                cause3.getClass();
                                if (cause3 instanceof MediaDrm.MediaDrmStateException) {
                                    int iT = f0.t(((MediaDrm.MediaDrmStateException) cause3).getDiagnosticInfo());
                                    switch (f0.s(iT)) {
                                        case 6002:
                                            i36 = 24;
                                            break;
                                        case 6003:
                                            i36 = 28;
                                            break;
                                        case 6004:
                                            i36 = 25;
                                            break;
                                        case 6005:
                                            i36 = 26;
                                            break;
                                    }
                                    eVar3 = new a9.e(i36, iT, 2);
                                } else if (cause3 instanceof MediaDrmResetException) {
                                    eVar = new a9.e(i36, i29, 2);
                                } else if (cause3 instanceof NotProvisionedException) {
                                    eVar = new a9.e(24, i29, 2);
                                } else if (cause3 instanceof DeniedByServerException) {
                                    eVar = new a9.e(29, i29, 2);
                                } else if (cause3 instanceof UnsupportedDrmException) {
                                    eVar = new a9.e(i37, i29, 2);
                                } else {
                                    eVar = cause3 instanceof DefaultDrmSessionManager$MissingSchemeDataException ? new a9.e(28, i29, 2) : new a9.e(30, i29, 2);
                                }
                            } else if ((cause instanceof FileDataSource$FileDataSourceException) && (cause.getCause() instanceof FileNotFoundException)) {
                                Throwable cause4 = cause.getCause();
                                cause4.getClass();
                                Throwable cause5 = cause4.getCause();
                                eVar = ((cause5 instanceof ErrnoException) && ((ErrnoException) cause5).errno == OsConstants.EACCES) ? new a9.e(32, i29, 2) : new a9.e(31, i29, 2);
                            } else {
                                i12 = 9;
                                eVar = new a9.e(i12, i29, 2);
                            }
                            i17 = 13;
                            i13 = 8;
                            i14 = 4;
                            i15 = 7;
                            i16 = 6;
                        }
                        i16 = i18;
                        i15 = i19;
                        i14 = i21;
                        i13 = i22;
                        i17 = 13;
                    }
                    eVar = eVar3;
                } else {
                    i12 = 9;
                    i13 = 8;
                    i14 = 4;
                    i15 = 7;
                    i16 = 6;
                    if (z11 && (i11 == 0 || i11 == 1)) {
                        eVar = new a9.e(35, i29, 2);
                    } else if (z11 && i11 == 3) {
                        eVar = new a9.e(15, i29, 2);
                    } else if (z11 && i11 == 2) {
                        eVar = new a9.e(i37, i29, 2);
                    } else {
                        if (cause instanceof MediaCodecRenderer$DecoderInitializationException) {
                            i17 = 13;
                            eVar2 = new a9.e(i17, f0.t(((MediaCodecRenderer$DecoderInitializationException) cause).f2143d), 2);
                        } else {
                            i17 = 13;
                            int i38 = 14;
                            if (cause instanceof MediaCodecDecoderException) {
                                eVar = new a9.e(i38, ((MediaCodecDecoderException) cause).f2139a, 2);
                            } else if (cause instanceof OutOfMemoryError) {
                                eVar = new a9.e(i38, i29, 2);
                            } else if (cause instanceof AudioSink$InitializationException) {
                                eVar2 = new a9.e(17, ((AudioSink$InitializationException) cause).f2125a, 2);
                            } else if (cause instanceof AudioSink$WriteException) {
                                eVar2 = new a9.e(18, ((AudioSink$WriteException) cause).f2127a, 2);
                            } else if (cause instanceof MediaCodec.CryptoException) {
                                int errorCode = ((MediaCodec.CryptoException) cause).getErrorCode();
                                switch (f0.s(errorCode)) {
                                    case 6002:
                                        i36 = 24;
                                        break;
                                    case 6003:
                                        i36 = 28;
                                        break;
                                    case 6004:
                                        i36 = 25;
                                        break;
                                    case 6005:
                                        i36 = 26;
                                        break;
                                }
                                eVar2 = new a9.e(i36, errorCode, 2);
                            } else {
                                eVar = new a9.e(22, i29, 2);
                            }
                        }
                        eVar = eVar2;
                    }
                    i17 = 13;
                }
                this.f28828b.execute(new b2.c(14, this, new PlaybackErrorEvent.Builder().setTimeSinceCreatedMillis(jElapsedRealtime - this.f28831e).setErrorCode(eVar.f478b).setSubErrorCode(eVar.f479c).setException(playbackException).build()));
                i23 = 1;
                this.B = true;
                this.f28840o = null;
                i24 = 2;
            }
            i17 = 13;
            i12 = 9;
            i13 = 8;
            i14 = 4;
            i15 = 7;
            i16 = 6;
            this.f28828b.execute(new b2.c(14, this, new PlaybackErrorEvent.Builder().setTimeSinceCreatedMillis(jElapsedRealtime - this.f28831e).setErrorCode(eVar.f478b).setSubErrorCode(eVar.f479c).setException(playbackException).build()));
            i23 = 1;
            this.B = true;
            this.f28840o = null;
            i24 = 2;
        }
        if (lVar.v(i24)) {
            v0 v0VarV = j0Var.v();
            boolean zA = v0VarV.a(i24);
            boolean zA2 = v0VarV.a(i23);
            boolean zA3 = v0VarV.a(3);
            if (zA || zA2 || zA3) {
                if (zA) {
                    pVar = null;
                } else {
                    pVar = null;
                    if (!Objects.equals(this.f28844s, null)) {
                        int i39 = this.f28844s == null ? 1 : 0;
                        this.f28844s = null;
                        n(1, jElapsedRealtime, null, i39);
                    }
                }
                if (!zA2 && !Objects.equals(this.f28845t, pVar)) {
                    int i40 = this.f28845t == null ? 1 : 0;
                    this.f28845t = pVar;
                    n(0, jElapsedRealtime, pVar, i40);
                }
                if (!zA3 && !Objects.equals(this.f28846u, pVar)) {
                    int i41 = this.f28846u == null ? 1 : 0;
                    this.f28846u = pVar;
                    n(2, jElapsedRealtime, pVar, i41);
                }
                dVar = pVar;
            } else {
                i14 = i14;
                dVar = 0;
            }
        } else {
            i14 = i14;
            dVar = 0;
        }
        if (f(this.f28841p)) {
            ij.d dVar2 = this.f28841p;
            p pVar2 = (p) dVar2.f34422c;
            if (pVar2.f57299v != -1) {
                int i42 = dVar2.f34421b;
                if (!Objects.equals(this.f28844s, pVar2)) {
                    int i43 = (this.f28844s == null && i42 == 0) ? 1 : i42;
                    this.f28844s = pVar2;
                    n(1, jElapsedRealtime, pVar2, i43);
                }
                this.f28841p = dVar;
            }
        }
        if (f(this.f28842q)) {
            ij.d dVar3 = this.f28842q;
            p pVar3 = (p) dVar3.f34422c;
            int i44 = dVar3.f34421b;
            if (!Objects.equals(this.f28845t, pVar3)) {
                int i45 = (this.f28845t == null && i44 == 0) ? 1 : i44;
                this.f28845t = pVar3;
                n(0, jElapsedRealtime, pVar3, i45);
            }
            this.f28842q = dVar;
        }
        if (f(this.f28843r)) {
            ij.d dVar4 = this.f28843r;
            p pVar4 = (p) dVar4.f34422c;
            int i46 = dVar4.f34421b;
            if (!Objects.equals(this.f28846u, pVar4)) {
                int i47 = (this.f28846u == null && i46 == 0) ? 1 : i46;
                this.f28846u = pVar4;
                n(2, jElapsedRealtime, pVar4, i47);
            }
            this.f28843r = dVar;
        }
        switch (b7.u.a(this.f28827a).b()) {
            case 0:
                i25 = 0;
                break;
            case 1:
                i25 = i12;
                break;
            case 2:
                i25 = 2;
                break;
            case 3:
                i25 = i14;
                break;
            case 4:
                i25 = 5;
                break;
            case 5:
                i25 = i16;
                break;
            case 6:
            case 8:
            default:
                i25 = 1;
                break;
            case 7:
                i25 = 3;
                break;
            case 9:
                i25 = i13;
                break;
            case 10:
                i25 = i15;
                break;
        }
        if (i25 != this.f28839n) {
            this.f28839n = i25;
            this.f28828b.execute(new b2.c(13, this, new NetworkEvent.Builder().setNetworkType(i25).setTimeSinceCreatedMillis(jElapsedRealtime - this.f28831e).build()));
        }
        if (j0Var.u() != 2) {
            this.f28847v = false;
        }
        if (j0Var.q() == null) {
            this.f28849x = false;
            i26 = 10;
        } else {
            i26 = 10;
            if (lVar.v(10)) {
                this.f28849x = true;
            }
        }
        int iU = j0Var.u();
        if (this.f28847v) {
            i27 = 5;
        } else if (this.f28849x) {
            i27 = i17;
        } else if (iU == i14) {
            i27 = 11;
        } else {
            i27 = 12;
            if (iU != 2) {
                if (iU != 3) {
                    z12 = true;
                    if (iU != 1 || this.m == 0) {
                        i27 = this.m;
                    }
                } else if (j0Var.g()) {
                    i27 = j0Var.C() != 0 ? i12 : 3;
                } else {
                    i27 = i14;
                }
                if (this.m != i27) {
                    this.m = i27;
                    this.B = z12;
                    this.f28828b.execute(new b2.c(16, this, new PlaybackStateEvent.Builder().setState(this.m).setTimeSinceCreatedMillis(jElapsedRealtime - this.f28831e).build()));
                }
                if (lVar.v(1028)) {
                    hVar = this.f28829c;
                    a aVar3 = (a) ((SparseArray) lVar.f44823c).get(1028);
                    aVar3.getClass();
                    synchronized (hVar) {
                        try {
                            str = hVar.f28825f;
                            if (str != null) {
                                g gVar4 = (g) hVar.f28822c.get(str);
                                gVar4.getClass();
                                hVar.a(gVar4);
                            }
                            it = hVar.f28822c.values().iterator();
                            while (it.hasNext()) {
                                gVar = (g) it.next();
                                it.remove();
                                if (!gVar.f28815e && (iVar = hVar.f28823d) != null) {
                                    iVar.m(aVar3, gVar.f28811a);
                                }
                            }
                        } catch (Throwable th4) {
                            throw th4;
                        }
                    }
                }
            }
            int i48 = this.m;
            if (i48 == 0 || i48 == 2 || i48 == 12) {
                i27 = 2;
            } else if (j0Var.g()) {
                i27 = j0Var.C() != 0 ? i26 : i16;
            } else {
                i27 = i15;
            }
        }
        z12 = true;
        if (this.m != i27) {
            this.m = i27;
            this.B = z12;
            this.f28828b.execute(new b2.c(16, this, new PlaybackStateEvent.Builder().setState(this.m).setTimeSinceCreatedMillis(jElapsedRealtime - this.f28831e).build()));
        }
        if (lVar.v(1028)) {
            hVar = this.f28829c;
            a aVar4 = (a) ((SparseArray) lVar.f44823c).get(1028);
            aVar4.getClass();
            synchronized (hVar) {
                str = hVar.f28825f;
                if (str != null) {
                    g gVar5 = (g) hVar.f28822c.get(str);
                    gVar5.getClass();
                    hVar.a(gVar5);
                }
                it = hVar.f28822c.values().iterator();
                while (it.hasNext()) {
                    gVar = (g) it.next();
                    it.remove();
                    if (!gVar.f28815e) {
                    }
                }
            }
        }
    }

    public final void l(a aVar, String str) {
        b0 b0Var = aVar.f28787d;
        if (b0Var == null || !b0Var.b()) {
            h();
            this.f28836j = str;
            this.f28837k = new PlaybackMetrics.Builder().setPlayerName("AndroidXMedia3").setPlayerVersion("1.8.0");
            j(aVar.f28785b, b0Var);
        }
    }

    public final void m(a aVar, String str) {
        b0 b0Var = aVar.f28787d;
        if ((b0Var == null || !b0Var.b()) && str.equals(this.f28836j)) {
            h();
        }
        this.f28834h.remove(str);
        this.f28835i.remove(str);
    }

    public final void n(int i11, long j11, p pVar, int i12) {
        int i13;
        TrackChangeEvent.Builder timeSinceCreatedMillis = new TrackChangeEvent.Builder(i11).setTimeSinceCreatedMillis(j11 - this.f28831e);
        if (pVar != null) {
            timeSinceCreatedMillis.setTrackState(1);
            if (i12 != 1) {
                i13 = 3;
                if (i12 != 2) {
                    i13 = i12 != 3 ? 1 : 4;
                }
            } else {
                i13 = 2;
            }
            timeSinceCreatedMillis.setTrackChangeReason(i13);
            String str = pVar.m;
            if (str != null) {
                timeSinceCreatedMillis.setContainerMimeType(str);
            }
            String str2 = pVar.f57291n;
            if (str2 != null) {
                timeSinceCreatedMillis.setSampleMimeType(str2);
            }
            String str3 = pVar.f57289k;
            if (str3 != null) {
                timeSinceCreatedMillis.setCodecName(str3);
            }
            int i14 = pVar.f57288j;
            if (i14 != -1) {
                timeSinceCreatedMillis.setBitrate(i14);
            }
            int i15 = pVar.f57298u;
            if (i15 != -1) {
                timeSinceCreatedMillis.setWidth(i15);
            }
            int i16 = pVar.f57299v;
            if (i16 != -1) {
                timeSinceCreatedMillis.setHeight(i16);
            }
            int i17 = pVar.F;
            if (i17 != -1) {
                timeSinceCreatedMillis.setChannelCount(i17);
            }
            int i18 = pVar.G;
            if (i18 != -1) {
                timeSinceCreatedMillis.setAudioSampleRate(i18);
            }
            String str4 = pVar.f57282d;
            if (str4 != null) {
                String str5 = f0.f3975a;
                String[] strArrSplit = str4.split("-", -1);
                Pair pairCreate = Pair.create(strArrSplit[0], strArrSplit.length >= 2 ? strArrSplit[1] : null);
                timeSinceCreatedMillis.setLanguage((String) pairCreate.first);
                Object obj = pairCreate.second;
                if (obj != null) {
                    timeSinceCreatedMillis.setLanguageRegion((String) obj);
                }
            }
            float f5 = pVar.f57302y;
            if (f5 != -1.0f) {
                timeSinceCreatedMillis.setVideoFrameRate(f5);
            }
        } else {
            timeSinceCreatedMillis.setTrackState(0);
        }
        this.B = true;
        this.f28828b.execute(new b2.c(12, this, timeSinceCreatedMillis.build()));
    }
}
