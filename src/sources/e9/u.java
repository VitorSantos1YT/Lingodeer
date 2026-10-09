package e9;

import androidx.media3.common.ParserException;
import com.google.api.Service;
import com.google.common.collect.ImmutableList;
import com.google.common.math.LongMath;
import com.lingodeer.data.model.AchievementLevelType;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class u implements h {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f25402e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public x7.e0 f25403f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f25406i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f25408k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f25409l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f25410n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f25411o;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f25415s;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f25417u;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f25401d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b7.w f25398a = new b7.w(new byte[15], 2);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b7.v f25399b = new b7.v();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b7.w f25400c = new b7.w();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final v f25412p = new v();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f25413q = -2147483647;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f25414r = -1;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f25416t = -1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f25407j = true;
    public boolean m = true;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public double f25404g = -9.223372036854776E18d;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public double f25405h = -9.223372036854776E18d;

    @Override // e9.h
    public final void a() {
        this.f25401d = 0;
        this.f25409l = 0;
        this.f25398a.F(2);
        this.f25410n = 0;
        this.f25411o = 0;
        this.f25413q = -2147483647;
        this.f25414r = -1;
        this.f25415s = 0;
        this.f25416t = -1L;
        this.f25417u = false;
        this.f25406i = false;
        this.m = true;
        this.f25407j = true;
        this.f25404g = -9.223372036854776E18d;
        this.f25405h = -9.223372036854776E18d;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:155:0x02c1  */
    /* JADX WARN: Code duplicated, block: B:157:0x02c8  */
    /* JADX WARN: Code duplicated, block: B:159:0x02dc  */
    /* JADX WARN: Code duplicated, block: B:162:0x02e6  */
    /* JADX WARN: Code duplicated, block: B:189:0x03ba  */
    /* JADX WARN: Instruction removed from duplicated block: B:155:0x02c1, please report this as an issue */
    @Override // e9.h
    public final void c(b7.w wVar) throws ParserException {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        char c11;
        byte[] bArr;
        long j11;
        long j12;
        ImmutableList immutableListV;
        int i16;
        long j13;
        boolean z11;
        int i17;
        b7.a.k(this.f25403f);
        while (wVar.a() > 0) {
            int i18 = this.f25401d;
            int i19 = 8;
            int i21 = 3;
            int i22 = 1;
            if (i18 != 0) {
                b7.w wVar2 = this.f25400c;
                v vVar = this.f25412p;
                if (i18 == 1) {
                    int iA = wVar.a();
                    b7.w wVar3 = this.f25398a;
                    int iMin = Math.min(iA, wVar3.a());
                    wVar.h(wVar3.f4039a, wVar3.f4040b, iMin);
                    wVar3.J(iMin);
                    if (wVar3.a() == 0) {
                        int i23 = wVar3.f4041c;
                        byte[] bArr2 = wVar3.f4039a;
                        b7.v vVar2 = this.f25399b;
                        vVar2.p(bArr2, i23);
                        vVar2.f();
                        int iZ = ew.a.z(vVar2, 3, 8, 8);
                        vVar.f25418a = iZ;
                        if (iZ != -1) {
                            b7.a.d(Math.max(Math.max(2, 8), 32) <= 63);
                            LongMath.a(LongMath.a(3L, 255L), 4294967296L);
                            if (vVar2.b() < 2) {
                                j13 = -1;
                            } else {
                                long jK = vVar2.k(2);
                                if (jK == 3) {
                                    if (vVar2.b() >= 8) {
                                        long jK2 = vVar2.k(8);
                                        jK += jK2;
                                        if (jK2 == 255) {
                                            if (vVar2.b() >= 32) {
                                                jK = vVar2.k(32) + jK;
                                            }
                                        }
                                    }
                                    j13 = -1;
                                }
                                j13 = jK;
                            }
                            vVar.f25419b = j13;
                            if (j13 == -1) {
                                z11 = false;
                            } else {
                                if (j13 > 16) {
                                    throw ParserException.c("Contains sub-stream with an invalid packet label " + vVar.f25419b);
                                }
                                if (j13 == 0) {
                                    int i24 = vVar.f25418a;
                                    if (i24 == 1) {
                                        throw ParserException.a(null, "Mpegh3daConfig packet with invalid packet label 0");
                                    }
                                    if (i24 == 2) {
                                        throw ParserException.a(null, "Mpegh3daFrame packet with invalid packet label 0");
                                    }
                                    if (i24 == 17) {
                                        throw ParserException.a(null, "AudioTruncation packet with invalid packet label 0");
                                    }
                                }
                                int iZ2 = ew.a.z(vVar2, 11, 24, 24);
                                vVar.f25420c = iZ2;
                                if (iZ2 != -1) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                            }
                        } else {
                            z11 = false;
                        }
                        if (z11) {
                            i17 = 0;
                            this.f25410n = 0;
                            this.f25411o = vVar.f25420c + i23 + this.f25411o;
                        } else {
                            i17 = 0;
                        }
                        if (z11) {
                            wVar3.I(i17);
                            this.f25403f.a(wVar3, wVar3.f4041c, i17);
                            wVar3.F(2);
                            wVar2.F(vVar.f25420c);
                            this.m = true;
                            this.f25401d = 2;
                        } else {
                            int i25 = wVar3.f4041c;
                            if (i25 < 15) {
                                wVar3.H(i25 + 1);
                                this.m = false;
                            }
                        }
                    } else {
                        this.m = false;
                    }
                } else {
                    if (i18 != 2) {
                        throw new IllegalStateException();
                    }
                    int i26 = vVar.f25418a;
                    if (i26 == 1 || i26 == 17) {
                        int i27 = wVar.f4040b;
                        int iMin2 = Math.min(wVar.a(), wVar2.a());
                        wVar.h(wVar2.f4039a, wVar2.f4040b, iMin2);
                        wVar2.J(iMin2);
                        wVar.I(i27);
                    }
                    int iMin3 = Math.min(wVar.a(), vVar.f25420c - this.f25410n);
                    this.f25403f.a(wVar, iMin3, 0);
                    int i28 = this.f25410n + iMin3;
                    this.f25410n = i28;
                    if (i28 != vVar.f25420c) {
                        continue;
                    } else {
                        int i29 = vVar.f25418a;
                        if (i29 == 1) {
                            byte[] bArr3 = wVar2.f4039a;
                            b7.v vVar3 = new b7.v(bArr3, bArr3.length);
                            int i30 = vVar3.i(8);
                            int i31 = vVar3.i(5);
                            if (i31 != 31) {
                                switch (i31) {
                                    case 0:
                                        i14 = 96000;
                                        break;
                                    case 1:
                                        i14 = 88200;
                                        break;
                                    case 2:
                                        i14 = 64000;
                                        break;
                                    case 3:
                                        i14 = 48000;
                                        break;
                                    case 4:
                                        i14 = 44100;
                                        break;
                                    case 5:
                                        i14 = 32000;
                                        break;
                                    case 6:
                                        i14 = 24000;
                                        break;
                                    case 7:
                                        i14 = 22050;
                                        break;
                                    case 8:
                                        i14 = 16000;
                                        break;
                                    case 9:
                                        i14 = 12000;
                                        break;
                                    case 10:
                                        i14 = 11025;
                                        break;
                                    case 11:
                                        i14 = 8000;
                                        break;
                                    case 12:
                                        i14 = 7350;
                                        break;
                                    case 13:
                                    case 14:
                                    default:
                                        throw ParserException.c("Unsupported sampling rate index " + i31);
                                    case 15:
                                        i14 = 57600;
                                        break;
                                    case 16:
                                        i14 = 51200;
                                        break;
                                    case 17:
                                        i14 = 40000;
                                        break;
                                    case 18:
                                        i14 = 38400;
                                        break;
                                    case 19:
                                        i14 = 34150;
                                        break;
                                    case 20:
                                        i14 = 28800;
                                        break;
                                    case 21:
                                        i14 = 25600;
                                        break;
                                    case 22:
                                        i14 = AchievementLevelType.XP_LV_9;
                                        break;
                                    case 23:
                                        i14 = 19200;
                                        break;
                                    case Service.METRICS_FIELD_NUMBER /* 24 */:
                                        i14 = 17075;
                                        break;
                                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                                        i14 = 14400;
                                        break;
                                    case Service.BILLING_FIELD_NUMBER /* 26 */:
                                        i14 = 12800;
                                        break;
                                    case 27:
                                        i14 = 9600;
                                        break;
                                }
                            } else {
                                i14 = vVar3.i(24);
                            }
                            int i32 = vVar3.i(3);
                            if (i32 == 0) {
                                i15 = 768;
                            } else if (i32 == 1) {
                                i15 = 1024;
                            } else if (i32 == 2 || i32 == 3) {
                                i15 = 2048;
                            } else {
                                if (i32 != 4) {
                                    throw ParserException.c("Unsupported coreSbrFrameLengthIndex " + i32);
                                }
                                i15 = 4096;
                            }
                            int i33 = i15;
                            if (i32 == 0 || i32 == 1) {
                                c11 = 0;
                            } else if (i32 == 2) {
                                c11 = 2;
                            } else if (i32 == 3) {
                                c11 = 3;
                            } else {
                                if (i32 != 4) {
                                    throw ParserException.c("Unsupported coreSbrFrameLengthIndex " + i32);
                                }
                                c11 = 1;
                            }
                            vVar3.t(2);
                            ew.a.G(vVar3);
                            int i34 = vVar3.i(5);
                            int i35 = 0;
                            int iZ3 = 0;
                            while (true) {
                                int i36 = i22;
                                int i37 = 16;
                                if (i35 < i34 + 1) {
                                    int i38 = vVar3.i(3);
                                    iZ3 = ew.a.z(vVar3, 5, 8, 16) + 1 + iZ3;
                                    if ((i38 == 0 || i38 == 2) && vVar3.h()) {
                                        ew.a.G(vVar3);
                                    }
                                    i35++;
                                    i22 = i36;
                                } else {
                                    int iZ4 = ew.a.z(vVar3, 4, 8, 16) + 1;
                                    vVar3.s();
                                    int i39 = 0;
                                    while (true) {
                                        double d5 = 2.0d;
                                        if (i39 < iZ4) {
                                            int i40 = vVar3.i(2);
                                            if (i40 == 0) {
                                                vVar3.t(i21);
                                                if (vVar3.h()) {
                                                    vVar3.t(13);
                                                }
                                                if (c11 > 0) {
                                                    ew.a.F(vVar3);
                                                }
                                            } else if (i40 == i36) {
                                                vVar3.t(i21);
                                                boolean zH = vVar3.h();
                                                if (zH) {
                                                    vVar3.t(13);
                                                }
                                                if (zH) {
                                                    vVar3.s();
                                                }
                                                if (c11 > 0) {
                                                    ew.a.F(vVar3);
                                                    i16 = vVar3.i(2);
                                                } else {
                                                    i16 = 0;
                                                }
                                                if (i16 > 0) {
                                                    vVar3.t(6);
                                                    int i41 = vVar3.i(2);
                                                    vVar3.t(4);
                                                    if (vVar3.h()) {
                                                        vVar3.t(5);
                                                    }
                                                    if (i16 == 2 || i16 == i21) {
                                                        vVar3.t(6);
                                                    }
                                                    if (i41 == 2) {
                                                        vVar3.s();
                                                    }
                                                }
                                                int iFloor = ((int) Math.floor(Math.log(iZ3 - 1) / Math.log(2.0d))) + 1;
                                                int i42 = vVar3.i(2);
                                                if (i42 > 0 && vVar3.h()) {
                                                    vVar3.t(iFloor);
                                                }
                                                if (vVar3.h()) {
                                                    vVar3.t(iFloor);
                                                }
                                                if (c11 == 0 && i42 == 0) {
                                                    vVar3.s();
                                                }
                                            } else if (i40 == i21) {
                                                ew.a.z(vVar3, 4, i19, i37);
                                                int iZ5 = ew.a.z(vVar3, 4, i19, i37);
                                                if (vVar3.h()) {
                                                    ew.a.z(vVar3, i19, i37, 0);
                                                }
                                                vVar3.s();
                                                if (iZ5 > 0) {
                                                    vVar3.t(iZ5 * 8);
                                                }
                                            }
                                            i39++;
                                            i19 = 8;
                                            i21 = 3;
                                            i37 = 16;
                                            i36 = 1;
                                        } else {
                                            if (vVar3.h()) {
                                                int i43 = 8;
                                                int iZ6 = ew.a.z(vVar3, 2, 4, 8) + 1;
                                                int i44 = 0;
                                                bArr = null;
                                                while (i44 < iZ6) {
                                                    int iZ7 = ew.a.z(vVar3, 4, i43, 16);
                                                    int iZ8 = ew.a.z(vVar3, 4, i43, 16);
                                                    if (iZ7 == 7) {
                                                        int i45 = vVar3.i(4) + 1;
                                                        vVar3.t(4);
                                                        byte[] bArr4 = new byte[i45];
                                                        for (int i46 = 0; i46 < i45; i46++) {
                                                            bArr4[i46] = (byte) vVar3.i(i43);
                                                        }
                                                        bArr = bArr4;
                                                    } else {
                                                        vVar3.t(iZ8 * i43);
                                                    }
                                                    i44++;
                                                    i43 = 8;
                                                }
                                            } else {
                                                bArr = null;
                                            }
                                            switch (i14) {
                                                case 14700:
                                                case 16000:
                                                    d5 = 3.0d;
                                                    this.f25413q = (int) (((double) i14) * d5);
                                                    this.f25414r = (int) (((double) i33) * d5);
                                                    j11 = this.f25416t;
                                                    j12 = vVar.f25419b;
                                                    if (j11 != j12) {
                                                        this.f25416t = j12;
                                                        String strConcat = i30 != -1 ? "mhm1".concat(String.format(".%02X", Integer.valueOf(i30))) : "mhm1";
                                                        if (bArr != null || bArr.length <= 0) {
                                                            immutableListV = null;
                                                        } else {
                                                            immutableListV = ImmutableList.v(b7.f0.f3976b, bArr);
                                                        }
                                                        y6.o oVar = new y6.o();
                                                        oVar.f57253a = this.f25402e;
                                                        oVar.f57264l = y6.d0.o("video/mp2t");
                                                        oVar.m = y6.d0.o("audio/mhm1");
                                                        oVar.F = this.f25413q;
                                                        oVar.f57262j = strConcat;
                                                        oVar.f57267p = immutableListV;
                                                        this.f25403f.b(new y6.p(oVar));
                                                    }
                                                    i12 = 1;
                                                    this.f25417u = true;
                                                    break;
                                                case 22050:
                                                case 24000:
                                                    this.f25413q = (int) (((double) i14) * d5);
                                                    this.f25414r = (int) (((double) i33) * d5);
                                                    j11 = this.f25416t;
                                                    j12 = vVar.f25419b;
                                                    if (j11 != j12) {
                                                        this.f25416t = j12;
                                                        if (i30 != -1) {
                                                        }
                                                        if (bArr != null) {
                                                            immutableListV = null;
                                                        } else {
                                                            immutableListV = null;
                                                        }
                                                        y6.o oVar2 = new y6.o();
                                                        oVar2.f57253a = this.f25402e;
                                                        oVar2.f57264l = y6.d0.o("video/mp2t");
                                                        oVar2.m = y6.d0.o("audio/mhm1");
                                                        oVar2.F = this.f25413q;
                                                        oVar2.f57262j = strConcat;
                                                        oVar2.f57267p = immutableListV;
                                                        this.f25403f.b(new y6.p(oVar2));
                                                    }
                                                    i12 = 1;
                                                    this.f25417u = true;
                                                    break;
                                                case 29400:
                                                case 32000:
                                                case 58800:
                                                case 64000:
                                                    d5 = 1.5d;
                                                    this.f25413q = (int) (((double) i14) * d5);
                                                    this.f25414r = (int) (((double) i33) * d5);
                                                    j11 = this.f25416t;
                                                    j12 = vVar.f25419b;
                                                    if (j11 != j12) {
                                                        this.f25416t = j12;
                                                        if (i30 != -1) {
                                                        }
                                                        if (bArr != null) {
                                                            immutableListV = null;
                                                        } else {
                                                            immutableListV = null;
                                                        }
                                                        y6.o oVar3 = new y6.o();
                                                        oVar3.f57253a = this.f25402e;
                                                        oVar3.f57264l = y6.d0.o("video/mp2t");
                                                        oVar3.m = y6.d0.o("audio/mhm1");
                                                        oVar3.F = this.f25413q;
                                                        oVar3.f57262j = strConcat;
                                                        oVar3.f57267p = immutableListV;
                                                        this.f25403f.b(new y6.p(oVar3));
                                                    }
                                                    i12 = 1;
                                                    this.f25417u = true;
                                                    break;
                                                case 44100:
                                                case 48000:
                                                case 88200:
                                                case 96000:
                                                    d5 = 1.0d;
                                                    this.f25413q = (int) (((double) i14) * d5);
                                                    this.f25414r = (int) (((double) i33) * d5);
                                                    j11 = this.f25416t;
                                                    j12 = vVar.f25419b;
                                                    if (j11 != j12) {
                                                        this.f25416t = j12;
                                                        if (i30 != -1) {
                                                        }
                                                        if (bArr != null) {
                                                            immutableListV = null;
                                                        } else {
                                                            immutableListV = null;
                                                        }
                                                        y6.o oVar4 = new y6.o();
                                                        oVar4.f57253a = this.f25402e;
                                                        oVar4.f57264l = y6.d0.o("video/mp2t");
                                                        oVar4.m = y6.d0.o("audio/mhm1");
                                                        oVar4.F = this.f25413q;
                                                        oVar4.f57262j = strConcat;
                                                        oVar4.f57267p = immutableListV;
                                                        this.f25403f.b(new y6.p(oVar4));
                                                    }
                                                    i12 = 1;
                                                    this.f25417u = true;
                                                    break;
                                                default:
                                                    throw ParserException.c("Unsupported sampling rate " + i14);
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            if (i29 == 17) {
                                byte[] bArr5 = wVar2.f4039a;
                                b7.v vVar4 = new b7.v(bArr5, bArr5.length);
                                if (vVar4.h()) {
                                    vVar4.t(2);
                                    i13 = vVar4.i(13);
                                } else {
                                    i13 = 0;
                                }
                                this.f25415s = i13;
                            } else if (i29 == 2) {
                                if (this.f25417u) {
                                    this.f25407j = false;
                                    i11 = 1;
                                } else {
                                    i11 = 0;
                                }
                                double d11 = (((double) (this.f25414r - this.f25415s)) * 1000000.0d) / ((double) this.f25413q);
                                long jRound = Math.round(this.f25404g);
                                if (this.f25406i) {
                                    this.f25406i = false;
                                    this.f25404g = this.f25405h;
                                } else {
                                    this.f25404g += d11;
                                }
                                this.f25403f.d(jRound, i11, this.f25411o, 0, null);
                                this.f25417u = false;
                                this.f25415s = 0;
                                this.f25411o = 0;
                            }
                            i12 = 1;
                        }
                        this.f25401d = i12;
                    }
                }
            } else {
                int i47 = this.f25408k;
                if ((i47 & 2) == 0) {
                    wVar.I(wVar.f4041c);
                } else {
                    if ((i47 & 4) == 0) {
                        while (true) {
                            if (wVar.a() > 0) {
                                int i48 = this.f25409l << 8;
                                this.f25409l = i48;
                                int iW = i48 | wVar.w();
                                this.f25409l = iW;
                                if ((iW & 16777215) == 12583333) {
                                    wVar.I(wVar.f4040b - 3);
                                    this.f25409l = 0;
                                }
                            }
                        }
                    }
                    this.f25401d = 1;
                }
            }
        }
    }

    @Override // e9.h
    public final void d(x7.o oVar, b10.b bVar) {
        bVar.d();
        bVar.j();
        this.f25402e = (String) bVar.f3850e;
        bVar.j();
        this.f25403f = oVar.v(bVar.f3848c, 1);
    }

    @Override // e9.h
    public final void f(int i11, long j11) {
        this.f25408k = i11;
        if (!this.f25407j && (this.f25411o != 0 || !this.m)) {
            this.f25406i = true;
        }
        if (j11 != -9223372036854775807L) {
            if (this.f25406i) {
                this.f25405h = j11;
            } else {
                this.f25404g = j11;
            }
        }
    }

    @Override // e9.h
    public final void e(boolean z11) {
    }
}
