package h7;

import a0.b2;
import android.media.AudioTimestamp;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import b7.f0;
import java.lang.reflect.Method;
import java.math.RoundingMode;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class m {
    public boolean A;
    public long B;
    public long C;
    public boolean D;
    public long E;
    public b7.y F;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dm.a f31899a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long[] f31900b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public AudioTrack f31901c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f31902d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public l f31903e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f31904f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f31905g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f31906h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f31907i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f31908j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f31909k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f31910l;
    public long m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Method f31911n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f31912o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f31913p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f31914q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f31915r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f31916s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f31917t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f31918u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f31919v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public long f31920w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public long f31921x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public long f31922y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public long f31923z;

    public m(dm.a aVar) {
        this.f31899a = aVar;
        try {
            this.f31911n = AudioTrack.class.getMethod("getLatency", null);
        } catch (NoSuchMethodException unused) {
        }
        this.f31900b = new long[10];
        this.C = -9223372036854775807L;
        this.B = -9223372036854775807L;
        this.F = b7.y.f4045a;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x02be  */
    /* JADX WARN: Code duplicated, block: B:102:0x02c0  */
    /* JADX WARN: Code duplicated, block: B:104:0x02c3  */
    /* JADX WARN: Code duplicated, block: B:106:0x02de  */
    /* JADX WARN: Code duplicated, block: B:109:0x02ea  */
    /* JADX WARN: Code duplicated, block: B:115:0x02f4  */
    /* JADX WARN: Code duplicated, block: B:118:0x0302  */
    /* JADX WARN: Code duplicated, block: B:133:0x0369  */
    /* JADX WARN: Code duplicated, block: B:135:0x0375  */
    /* JADX WARN: Code duplicated, block: B:137:0x0382  */
    /* JADX WARN: Code duplicated, block: B:139:0x0385  */
    /* JADX WARN: Code duplicated, block: B:33:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:36:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:37:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:39:0x0100  */
    /* JADX WARN: Code duplicated, block: B:41:0x010a  */
    /* JADX WARN: Code duplicated, block: B:43:0x010e  */
    /* JADX WARN: Code duplicated, block: B:44:0x0119  */
    /* JADX WARN: Code duplicated, block: B:45:0x0123  */
    /* JADX WARN: Code duplicated, block: B:47:0x0133  */
    /* JADX WARN: Code duplicated, block: B:49:0x0139  */
    /* JADX WARN: Code duplicated, block: B:51:0x015e  */
    /* JADX WARN: Code duplicated, block: B:52:0x019f  */
    /* JADX WARN: Code duplicated, block: B:54:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:55:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:57:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:58:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:61:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:63:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:65:0x0200  */
    /* JADX WARN: Code duplicated, block: B:67:0x0203 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:69:0x0207  */
    /* JADX WARN: Code duplicated, block: B:71:0x020d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:72:0x020f  */
    /* JADX WARN: Code duplicated, block: B:73:0x0215  */
    /* JADX WARN: Code duplicated, block: B:75:0x0218  */
    /* JADX WARN: Code duplicated, block: B:76:0x021d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:77:0x021f  */
    /* JADX WARN: Code duplicated, block: B:80:0x0228  */
    /* JADX WARN: Code duplicated, block: B:82:0x0251  */
    /* JADX WARN: Code duplicated, block: B:83:0x0256  */
    /* JADX WARN: Code duplicated, block: B:85:0x0260  */
    /* JADX WARN: Code duplicated, block: B:86:0x0265  */
    /* JADX WARN: Code duplicated, block: B:87:0x0272  */
    /* JADX WARN: Code duplicated, block: B:88:0x0277  */
    /* JADX WARN: Code duplicated, block: B:90:0x027c  */
    /* JADX WARN: Code duplicated, block: B:92:0x0286  */
    /* JADX WARN: Code duplicated, block: B:93:0x0293  */
    /* JADX WARN: Code duplicated, block: B:95:0x029a  */
    public final long a() {
        long j11;
        long j12;
        boolean z11;
        long jNanoTime;
        l lVar;
        boolean z12;
        long jC;
        long jH;
        int playState;
        long j13;
        long j14;
        long jCurrentTimeMillis;
        b2 b2Var;
        ob.l lVar2;
        Handler handler;
        long j15;
        long jU;
        long j16;
        int i11;
        long j17;
        long j18;
        l lVar3;
        int i12;
        k kVar;
        float f5;
        long jC2;
        AudioTimestamp audioTimestamp;
        boolean timestamp;
        AudioTimestamp audioTimestamp2;
        int i13;
        int i14;
        AudioTimestamp audioTimestamp3;
        long j19;
        long j21;
        long j22;
        dm.a aVar;
        long j23;
        long jU2;
        long j24;
        long j25;
        Method method;
        AudioTrack audioTrack = this.f31901c;
        audioTrack.getClass();
        long j26 = 1000;
        if (audioTrack.getPlayState() == 3) {
            this.F.getClass();
            long jNanoTime2 = System.nanoTime() / 1000;
            if (jNanoTime2 - this.m >= 30000) {
                long jP = f0.P(this.f31904f, b());
                if (jP == 0) {
                    audioTrack = audioTrack;
                    j11 = 1000;
                    j12 = 0;
                } else {
                    int i15 = this.f31918u;
                    long jX = f0.x(jP, this.f31906h) - jNanoTime2;
                    long[] jArr = this.f31900b;
                    jArr[i15] = jX;
                    this.f31918u = (this.f31918u + 1) % 10;
                    int i16 = this.f31919v;
                    if (i16 < 10) {
                        this.f31919v = i16 + 1;
                    }
                    this.m = jNanoTime2;
                    this.f31910l = 0L;
                    int i17 = 0;
                    while (true) {
                        int i18 = this.f31919v;
                        if (i17 >= i18) {
                            break;
                        }
                        this.f31910l = (jArr[i17] / ((long) i18)) + this.f31910l;
                        i17++;
                        j26 = j26;
                    }
                    j11 = j26;
                    if (this.f31913p || (method = this.f31911n) == null) {
                        j17 = 500000;
                        j18 = 5000000;
                    } else {
                        j18 = 5000000;
                        if (jNanoTime2 - this.f31914q >= 500000) {
                            try {
                                AudioTrack audioTrack2 = this.f31901c;
                                audioTrack2.getClass();
                                Integer num = (Integer) method.invoke(audioTrack2, null);
                                String str = f0.f3975a;
                                j17 = 500000;
                                try {
                                    long jIntValue = (((long) num.intValue()) * j11) - this.f31905g;
                                    this.f31912o = jIntValue;
                                    long jMax = Math.max(jIntValue, 0L);
                                    this.f31912o = jMax;
                                    if (jMax > 5000000) {
                                        b7.a.B("Ignoring impossibly large audio latency: " + jMax);
                                        this.f31912o = 0L;
                                    }
                                } catch (Exception unused) {
                                    this.f31911n = null;
                                }
                            } catch (Exception unused2) {
                                j17 = 500000;
                            }
                            this.f31914q = jNanoTime2;
                        } else {
                            j17 = 500000;
                        }
                    }
                    lVar3 = this.f31903e;
                    lVar3.getClass();
                    i12 = lVar3.f31891b;
                    kVar = lVar3.f31890a;
                    f5 = this.f31906h;
                    jC2 = c(jNanoTime2);
                    j12 = 0;
                    if (jNanoTime2 - lVar3.f31896g < lVar3.f31895f) {
                        audioTrack = audioTrack;
                    } else {
                        lVar3.f31896g = jNanoTime2;
                        AudioTrack audioTrack3 = kVar.f31883a;
                        audioTimestamp = kVar.f31884b;
                        timestamp = audioTrack3.getTimestamp(audioTimestamp);
                        if (timestamp) {
                            j24 = audioTimestamp.framePosition;
                            j25 = kVar.f31886d;
                            if (j25 <= j24) {
                                if (kVar.f31888f) {
                                    kVar.f31889g += j25;
                                    kVar.f31888f = false;
                                } else {
                                    kVar.f31885c++;
                                }
                            }
                            kVar.f31886d = j24;
                            kVar.f31887e = j24 + kVar.f31889g + (kVar.f31885c << 32);
                        } else {
                            audioTrack = audioTrack;
                        }
                        if (timestamp != 0) {
                            aVar = lVar3.f31892c;
                            j23 = audioTimestamp.nanoTime / j11;
                            jU2 = f0.u(jNanoTime2 - (kVar.f31884b.nanoTime / j11), f5) + f0.P(i12, kVar.f31887e);
                            if (Math.abs(j23 - jNanoTime2) > j18) {
                                long j27 = kVar.f31887e;
                                aVar.getClass();
                                audioTimestamp2 = audioTimestamp;
                                StringBuilder sb2 = new StringBuilder("Spurious audio timestamp (system clock mismatch): ");
                                sb2.append(j27);
                                sb2.append(", ");
                                sb2.append(j23);
                                ep.a.y(jNanoTime2, ", ", ", ", sb2);
                                sb2.append(jC2);
                                sb2.append(", ");
                                x xVar = (x) aVar.f23485b;
                                sb2.append(xVar.j());
                                sb2.append(", ");
                                sb2.append(xVar.k());
                                b7.a.B(sb2.toString());
                                i13 = 4;
                                lVar3.a(4);
                            } else {
                                audioTimestamp2 = audioTimestamp;
                                if (Math.abs(jU2 - jC2) > j18) {
                                    long j28 = kVar.f31887e;
                                    aVar.getClass();
                                    StringBuilder sb3 = new StringBuilder("Spurious audio timestamp (frame position mismatch): ");
                                    sb3.append(j28);
                                    sb3.append(", ");
                                    sb3.append(j23);
                                    ep.a.y(jNanoTime2, ", ", ", ", sb3);
                                    sb3.append(jC2);
                                    sb3.append(", ");
                                    x xVar2 = (x) aVar.f23485b;
                                    sb3.append(xVar2.j());
                                    sb3.append(", ");
                                    sb3.append(xVar2.k());
                                    b7.a.B(sb3.toString());
                                    i13 = 4;
                                    lVar3.a(4);
                                } else {
                                    i13 = 4;
                                    if (lVar3.f31893d == 4) {
                                        lVar3.a(0);
                                    }
                                }
                            }
                        } else {
                            audioTimestamp2 = audioTimestamp;
                            i13 = 4;
                        }
                        i14 = lVar3.f31893d;
                        if (i14 != 0) {
                            audioTimestamp3 = audioTimestamp2;
                            z11 = false;
                            if (timestamp != 0) {
                                j19 = audioTimestamp3.nanoTime;
                                if (j19 / j11 >= lVar3.f31894e) {
                                    lVar3.f31897h = kVar.f31887e;
                                    lVar3.f31898i = j19 / j11;
                                    lVar3.a(1);
                                }
                            } else if (jNanoTime2 - lVar3.f31894e > j17) {
                                lVar3.a(3);
                            }
                        } else if (i14 != 1) {
                            if (i14 != 2) {
                                z11 = false;
                                if (timestamp == 0) {
                                    lVar3.a(0);
                                }
                            } else if (i14 != 3) {
                                if (i14 != i13) {
                                    throw new IllegalStateException();
                                }
                            } else if (timestamp) {
                                z11 = false;
                                lVar3.a(0);
                            }
                        } else if (timestamp != 0) {
                            j21 = kVar.f31887e;
                            j22 = lVar3.f31897h;
                            if (j21 <= j22) {
                                if (Math.abs((f0.u(jNanoTime2 - (kVar.f31884b.nanoTime / j11), f5) + f0.P(i12, kVar.f31887e)) - (f0.u(jNanoTime2 - lVar3.f31898i, f5) + f0.P(i12, j22))) < j11) {
                                    lVar3.a(2);
                                } else if (jNanoTime2 - lVar3.f31894e > 2000000) {
                                    lVar3.a(3);
                                } else {
                                    lVar3.f31897h = kVar.f31887e;
                                    lVar3.f31898i = audioTimestamp2.nanoTime / j11;
                                }
                            } else if (jNanoTime2 - lVar3.f31894e > 2000000) {
                                lVar3.a(3);
                            } else {
                                lVar3.f31897h = kVar.f31887e;
                                lVar3.f31898i = audioTimestamp2.nanoTime / j11;
                            }
                        } else {
                            z11 = false;
                            lVar3.a(0);
                        }
                    }
                }
            } else {
                j11 = j26;
                if (this.f31913p) {
                    j17 = 500000;
                    j18 = 5000000;
                } else {
                    j17 = 500000;
                    j18 = 5000000;
                }
                lVar3 = this.f31903e;
                lVar3.getClass();
                i12 = lVar3.f31891b;
                kVar = lVar3.f31890a;
                f5 = this.f31906h;
                jC2 = c(jNanoTime2);
                j12 = 0;
                if (jNanoTime2 - lVar3.f31896g < lVar3.f31895f) {
                    audioTrack = audioTrack;
                } else {
                    lVar3.f31896g = jNanoTime2;
                    AudioTrack audioTrack4 = kVar.f31883a;
                    audioTimestamp = kVar.f31884b;
                    timestamp = audioTrack4.getTimestamp(audioTimestamp);
                    if (timestamp) {
                        j24 = audioTimestamp.framePosition;
                        j25 = kVar.f31886d;
                        if (j25 <= j24) {
                            if (kVar.f31888f) {
                                kVar.f31889g += j25;
                                kVar.f31888f = false;
                            } else {
                                kVar.f31885c++;
                            }
                        }
                        kVar.f31886d = j24;
                        kVar.f31887e = j24 + kVar.f31889g + (kVar.f31885c << 32);
                    } else {
                        audioTrack = audioTrack;
                    }
                    if (timestamp != 0) {
                        aVar = lVar3.f31892c;
                        j23 = audioTimestamp.nanoTime / j11;
                        jU2 = f0.u(jNanoTime2 - (kVar.f31884b.nanoTime / j11), f5) + f0.P(i12, kVar.f31887e);
                        if (Math.abs(j23 - jNanoTime2) > j18) {
                            long j29 = kVar.f31887e;
                            aVar.getClass();
                            audioTimestamp2 = audioTimestamp;
                            StringBuilder sb4 = new StringBuilder("Spurious audio timestamp (system clock mismatch): ");
                            sb4.append(j29);
                            sb4.append(", ");
                            sb4.append(j23);
                            ep.a.y(jNanoTime2, ", ", ", ", sb4);
                            sb4.append(jC2);
                            sb4.append(", ");
                            x xVar3 = (x) aVar.f23485b;
                            sb4.append(xVar3.j());
                            sb4.append(", ");
                            sb4.append(xVar3.k());
                            b7.a.B(sb4.toString());
                            i13 = 4;
                            lVar3.a(4);
                        } else {
                            audioTimestamp2 = audioTimestamp;
                            if (Math.abs(jU2 - jC2) > j18) {
                                long j210 = kVar.f31887e;
                                aVar.getClass();
                                StringBuilder sb5 = new StringBuilder("Spurious audio timestamp (frame position mismatch): ");
                                sb5.append(j210);
                                sb5.append(", ");
                                sb5.append(j23);
                                ep.a.y(jNanoTime2, ", ", ", ", sb5);
                                sb5.append(jC2);
                                sb5.append(", ");
                                x xVar4 = (x) aVar.f23485b;
                                sb5.append(xVar4.j());
                                sb5.append(", ");
                                sb5.append(xVar4.k());
                                b7.a.B(sb5.toString());
                                i13 = 4;
                                lVar3.a(4);
                            } else {
                                i13 = 4;
                                if (lVar3.f31893d == 4) {
                                    lVar3.a(0);
                                }
                            }
                        }
                    } else {
                        audioTimestamp2 = audioTimestamp;
                        i13 = 4;
                    }
                    i14 = lVar3.f31893d;
                    if (i14 != 0) {
                        audioTimestamp3 = audioTimestamp2;
                        z11 = false;
                        if (timestamp != 0) {
                            j19 = audioTimestamp3.nanoTime;
                            if (j19 / j11 >= lVar3.f31894e) {
                                lVar3.f31897h = kVar.f31887e;
                                lVar3.f31898i = j19 / j11;
                                lVar3.a(1);
                            }
                        } else if (jNanoTime2 - lVar3.f31894e > j17) {
                            lVar3.a(3);
                        }
                    } else if (i14 != 1) {
                        if (i14 != 2) {
                            z11 = false;
                            if (timestamp == 0) {
                                lVar3.a(0);
                            }
                        } else if (i14 != 3) {
                            if (i14 != i13) {
                                throw new IllegalStateException();
                            }
                        } else if (timestamp) {
                            z11 = false;
                            lVar3.a(0);
                        }
                    } else if (timestamp != 0) {
                        j21 = kVar.f31887e;
                        j22 = lVar3.f31897h;
                        if (j21 <= j22) {
                            if (Math.abs((f0.u(jNanoTime2 - (kVar.f31884b.nanoTime / j11), f5) + f0.P(i12, kVar.f31887e)) - (f0.u(jNanoTime2 - lVar3.f31898i, f5) + f0.P(i12, j22))) < j11) {
                                lVar3.a(2);
                            } else if (jNanoTime2 - lVar3.f31894e > 2000000) {
                                lVar3.a(3);
                            } else {
                                lVar3.f31897h = kVar.f31887e;
                                lVar3.f31898i = audioTimestamp2.nanoTime / j11;
                            }
                        } else if (jNanoTime2 - lVar3.f31894e > 2000000) {
                            lVar3.a(3);
                        } else {
                            lVar3.f31897h = kVar.f31887e;
                            lVar3.f31898i = audioTimestamp2.nanoTime / j11;
                        }
                    } else {
                        z11 = false;
                        lVar3.a(0);
                    }
                }
            }
            this.F.getClass();
            jNanoTime = System.nanoTime() / j11;
            lVar = this.f31903e;
            lVar.getClass();
            if (lVar.f31893d == 2) {
                z12 = true;
            } else {
                z12 = z11;
            }
            if (z12) {
                float f11 = this.f31906h;
                k kVar2 = lVar.f31890a;
                jC = f0.u(jNanoTime - (kVar2.f31884b.nanoTime / j11), f11) + f0.P(lVar.f31891b, kVar2.f31887e);
            } else {
                jC = c(jNanoTime);
            }
            jH = jC;
            playState = audioTrack.getPlayState();
            if (playState == 3) {
                if (z12 || ((i11 = lVar.f31893d) != 0 && i11 != 1)) {
                    e(jH);
                }
                j13 = this.C;
                if (j13 != -9223372036854775807L) {
                    j15 = jH - this.B;
                    jU = f0.u(jNanoTime - j13, this.f31906h);
                    j16 = this.B + jU;
                    long jAbs = Math.abs(j16 - jH);
                    if (j15 != j12 && jAbs < 1000000) {
                        long j30 = (jU * 10) / 100;
                        jH = f0.h(jH, j16 - j30, j16 + j30);
                    }
                }
                if (!this.A && !this.f31907i) {
                    j14 = this.B;
                    if (j14 != -9223372036854775807L && jH > j14) {
                        this.f31907i = true;
                        long jX2 = f0.x(f0.V(jH - j14), this.f31906h);
                        this.F.getClass();
                        jCurrentTimeMillis = System.currentTimeMillis() - f0.V(jX2);
                        b2Var = ((x) this.f31899a.f23485b).f31993s;
                        if (b2Var != null) {
                            lVar2 = ((a0) b2Var.f27b).f31806h1;
                            handler = (Handler) lVar2.f44822b;
                            if (handler != null) {
                                handler.post(new i(lVar2, jCurrentTimeMillis));
                            }
                        }
                    }
                }
                this.C = jNanoTime;
                this.B = jH;
            } else if (playState == 1) {
                e(jH);
            }
            return jH;
        }
        audioTrack = audioTrack;
        j11 = 1000;
        j12 = 0;
        z11 = false;
        this.F.getClass();
        jNanoTime = System.nanoTime() / j11;
        lVar = this.f31903e;
        lVar.getClass();
        if (lVar.f31893d == 2) {
            z12 = true;
        } else {
            z12 = z11;
        }
        if (z12) {
            float f12 = this.f31906h;
            k kVar3 = lVar.f31890a;
            jC = f0.u(jNanoTime - (kVar3.f31884b.nanoTime / j11), f12) + f0.P(lVar.f31891b, kVar3.f31887e);
        } else {
            jC = c(jNanoTime);
        }
        jH = jC;
        playState = audioTrack.getPlayState();
        if (playState == 3) {
            if (z12) {
                e(jH);
            } else {
                e(jH);
            }
            j13 = this.C;
            if (j13 != -9223372036854775807L) {
                j15 = jH - this.B;
                jU = f0.u(jNanoTime - j13, this.f31906h);
                j16 = this.B + jU;
                long jAbs2 = Math.abs(j16 - jH);
                if (j15 != j12) {
                    long j31 = (jU * 10) / 100;
                    jH = f0.h(jH, j16 - j31, j16 + j31);
                }
            }
            if (!this.A) {
                j14 = this.B;
                if (j14 != -9223372036854775807L) {
                    this.f31907i = true;
                    long jX3 = f0.x(f0.V(jH - j14), this.f31906h);
                    this.F.getClass();
                    jCurrentTimeMillis = System.currentTimeMillis() - f0.V(jX3);
                    b2Var = ((x) this.f31899a.f23485b).f31993s;
                    if (b2Var != null) {
                        lVar2 = ((a0) b2Var.f27b).f31806h1;
                        handler = (Handler) lVar2.f44822b;
                        if (handler != null) {
                            handler.post(new i(lVar2, jCurrentTimeMillis));
                        }
                    }
                }
            }
            this.C = jNanoTime;
            this.B = jH;
        } else if (playState == 1) {
            e(jH);
        }
        return jH;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0067  */
    /* JADX WARN: Code duplicated, block: B:27:0x006b  */
    /* JADX WARN: Code duplicated, block: B:28:0x0074  */
    public final long b() {
        long j11;
        if (this.f31920w != -9223372036854775807L) {
            return Math.min(this.f31923z, d());
        }
        this.F.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (jElapsedRealtime - this.f31915r >= 5) {
            AudioTrack audioTrack = this.f31901c;
            audioTrack.getClass();
            int playState = audioTrack.getPlayState();
            if (playState != 1) {
                long playbackHeadPosition = ((long) audioTrack.getPlaybackHeadPosition()) & 4294967295L;
                if (Build.VERSION.SDK_INT > 29) {
                    j11 = this.f31916s;
                    if (j11 > playbackHeadPosition) {
                        if (this.D) {
                            this.E += j11;
                            this.D = false;
                        } else {
                            this.f31917t++;
                        }
                    }
                    this.f31916s = playbackHeadPosition;
                } else if (playbackHeadPosition != 0 || this.f31916s <= 0 || playState != 3) {
                    this.f31921x = -9223372036854775807L;
                    j11 = this.f31916s;
                    if (j11 > playbackHeadPosition) {
                        if (this.D) {
                            this.E += j11;
                            this.D = false;
                        } else {
                            this.f31917t++;
                        }
                    }
                    this.f31916s = playbackHeadPosition;
                } else if (this.f31921x == -9223372036854775807L) {
                    this.f31921x = jElapsedRealtime;
                }
            }
            this.f31915r = jElapsedRealtime;
        }
        return this.f31916s + this.E + (this.f31917t << 32);
    }

    public final long c(long j11) {
        long jU;
        if (this.f31919v != 0) {
            jU = f0.u(j11 + this.f31910l, this.f31906h);
        } else if (this.f31920w != -9223372036854775807L) {
            jU = f0.P(this.f31904f, d());
        } else {
            jU = f0.P(this.f31904f, b());
        }
        long jMax = Math.max(0L, jU - this.f31912o);
        if (this.f31920w == -9223372036854775807L) {
            return jMax;
        }
        return Math.min(f0.P(this.f31904f, this.f31923z), jMax);
    }

    public final long d() {
        AudioTrack audioTrack = this.f31901c;
        audioTrack.getClass();
        if (audioTrack.getPlayState() == 2) {
            return this.f31922y;
        }
        this.F.getClass();
        return this.f31922y + f0.R(f0.u(f0.K(SystemClock.elapsedRealtime()) - this.f31920w, this.f31906h), this.f31904f, 1000000L, RoundingMode.UP);
    }

    public final void e(long j11) {
        if (this.A) {
            long j12 = this.f31908j;
            if (j12 == -9223372036854775807L || j11 < j12) {
                return;
            }
            long jX = f0.x(j11 - j12, this.f31906h);
            this.F.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis() - f0.V(jX);
            this.f31908j = -9223372036854775807L;
            b2 b2Var = ((x) this.f31899a.f23485b).f31993s;
            if (b2Var != null) {
                ob.l lVar = ((a0) b2Var.f27b).f31806h1;
                Handler handler = (Handler) lVar.f44822b;
                if (handler != null) {
                    handler.post(new i(lVar, jCurrentTimeMillis));
                }
            }
        }
    }

    public final void f() {
        this.f31910l = 0L;
        this.f31919v = 0;
        this.f31918u = 0;
        this.m = 0L;
        this.B = -9223372036854775807L;
        this.C = -9223372036854775807L;
        this.f31907i = false;
    }
}
