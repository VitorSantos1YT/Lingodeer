package h1;

import com.alibaba.sdk.android.oss.common.OSSConstants;
import com.yalantis.ucrop.view.CropImageView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class x9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f31317a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f31318b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final float f31319c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final float f31320d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final long f31321e;

    static {
        k1.c cVar = k1.y.f37828a;
        f31317a = k1.y.f37831d;
        f31318b = 16;
        f31319c = 14;
        f31320d = 6;
        f31321e = fr.j3.A(20);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0116  */
    /* JADX WARN: Code duplicated, block: B:104:0x0127  */
    /* JADX WARN: Code duplicated, block: B:109:0x017b  */
    /* JADX WARN: Code duplicated, block: B:111:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x004f  */
    /* JADX WARN: Code duplicated, block: B:32:0x0054  */
    /* JADX WARN: Code duplicated, block: B:34:0x0058  */
    /* JADX WARN: Code duplicated, block: B:36:0x0060  */
    /* JADX WARN: Code duplicated, block: B:37:0x0063  */
    /* JADX WARN: Code duplicated, block: B:41:0x006a  */
    /* JADX WARN: Code duplicated, block: B:43:0x0070  */
    /* JADX WARN: Code duplicated, block: B:46:0x0079  */
    /* JADX WARN: Code duplicated, block: B:48:0x007d  */
    /* JADX WARN: Code duplicated, block: B:51:0x0084  */
    /* JADX WARN: Code duplicated, block: B:53:0x008a  */
    /* JADX WARN: Code duplicated, block: B:56:0x0093  */
    /* JADX WARN: Code duplicated, block: B:58:0x0097  */
    /* JADX WARN: Code duplicated, block: B:61:0x009f  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:64:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:66:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:67:0x00af  */
    /* JADX WARN: Code duplicated, block: B:71:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:73:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:74:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:78:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:82:0x00df  */
    /* JADX WARN: Code duplicated, block: B:84:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:94:0x0108 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:95:0x010a  */
    /* JADX WARN: Code duplicated, block: B:96:0x010d  */
    /* JADX WARN: Code duplicated, block: B:98:0x0110  */
    public static final void a(boolean z11, fz.a aVar, z1.r rVar, boolean z12, long j11, long j12, t1.d dVar, l1.n nVar, int i11, int i12) {
        int i13;
        z1.r rVar2;
        int i14;
        boolean z13;
        int i15;
        long j13;
        long j14;
        int i16;
        z1.r rVar3;
        int i17;
        boolean z14;
        z1.r rVar4;
        long j15;
        long j16;
        long j17;
        l1.s sVar;
        boolean z15;
        long j18;
        z1.r rVar5;
        l1.x1 x1VarT;
        int i18;
        int i19;
        int i21;
        l1.s sVar2 = (l1.s) nVar;
        sVar2.f0(-202735880);
        if ((i11 & 6) == 0) {
            i13 = (sVar2.g(z11) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i11 & 48) == 0) {
            i13 |= sVar2.h(aVar) ? 32 : 16;
        }
        int i22 = i12 & 4;
        if (i22 == 0) {
            if ((i11 & 384) == 0) {
                rVar2 = rVar;
                i13 |= sVar2.f(rVar2) ? 256 : 128;
            }
            i14 = i12 & 8;
            if (i14 != 0) {
                if ((i11 & 3072) == 0) {
                    z13 = z12;
                    if (sVar2.g(z13)) {
                        i15 = 2048;
                    } else {
                        i15 = 1024;
                    }
                    i13 |= i15;
                }
                if ((i11 & 24576) == 0) {
                    j13 = j11;
                    if ((i12 & 16) == 0 || !sVar2.e(j13)) {
                        i21 = OSSConstants.DEFAULT_BUFFER_SIZE;
                    } else {
                        i21 = 16384;
                    }
                    i13 |= i21;
                } else {
                    j13 = j11;
                }
                if ((196608 & i11) == 0) {
                    j14 = j12;
                    if ((i12 & 32) == 0 || !sVar2.e(j14)) {
                        i19 = 65536;
                    } else {
                        i19 = OSSConstants.DEFAULT_STREAM_BUFFER_SIZE;
                    }
                    i13 |= i19;
                } else {
                    j14 = j12;
                }
                if ((i12 & 64) != 0) {
                    i13 |= 1572864;
                } else if ((i11 & 1572864) == 0) {
                    if (sVar2.f(null)) {
                        i16 = 1048576;
                    } else {
                        i16 = 524288;
                    }
                    i13 |= i16;
                }
                if ((12582912 & i11) == 0) {
                    if (sVar2.h(dVar)) {
                        i18 = 8388608;
                    } else {
                        i18 = 4194304;
                    }
                    i13 |= i18;
                }
                if ((4793491 & i13) == 4793490 || !sVar2.F()) {
                    sVar2.Y();
                    if ((i11 & 1) != 0 || sVar2.C()) {
                        if (i22 != 0) {
                            rVar3 = z1.o.f58481a;
                        } else {
                            rVar3 = rVar2;
                        }
                        if (i14 != 0) {
                            z13 = true;
                        }
                        if ((i12 & 16) != 0) {
                            i13 &= -57345;
                            j13 = ((g2.x) sVar2.j(h2.f30320a)).f28624a;
                        }
                        if ((i12 & 32) != 0) {
                            i13 &= -458753;
                            j14 = j13;
                        }
                        i17 = i13;
                        z14 = z13;
                        rVar4 = rVar3;
                        j15 = j13;
                        j16 = j14;
                    } else {
                        sVar2.W();
                        if ((i12 & 16) != 0) {
                            i13 &= -57345;
                        }
                        if ((i12 & 32) != 0) {
                            i13 &= -458753;
                        }
                        i17 = i13;
                        z14 = z13;
                        j15 = j13;
                        j16 = j14;
                        rVar4 = rVar2;
                    }
                    sVar2.q();
                    long j19 = j15;
                    int i23 = i17 >> 12;
                    long j21 = j16;
                    c(j19, j21, z11, t1.e.d(-551896140, new t9(rVar4, z11, l7.a(true, CropImageView.DEFAULT_ASPECT_RATIO, j19, sVar2, ((i17 >> 6) & 896) | 6, 2), z14, aVar, dVar), sVar2), sVar2, (i23 & 112) | (i23 & 14) | 3072 | ((i17 << 6) & 896));
                    j17 = j21;
                    sVar = sVar2;
                    z15 = z14;
                    j18 = j19;
                    rVar5 = rVar4;
                } else {
                    sVar2.W();
                    rVar5 = rVar2;
                    sVar = sVar2;
                    z15 = z13;
                    j18 = j13;
                    j17 = j14;
                }
                x1VarT = sVar.t();
                if (x1VarT != null) {
                    x1VarT.f39502d = new s9(z11, aVar, rVar5, z15, j18, j17, dVar, i11, i12);
                }
            }
            i13 |= 3072;
            z13 = z12;
            if ((i11 & 24576) == 0) {
                j13 = j11;
                if ((i12 & 16) == 0) {
                    i21 = OSSConstants.DEFAULT_BUFFER_SIZE;
                } else {
                    i21 = OSSConstants.DEFAULT_BUFFER_SIZE;
                }
                i13 |= i21;
            } else {
                j13 = j11;
            }
            if ((196608 & i11) == 0) {
                j14 = j12;
                if ((i12 & 32) == 0) {
                    i19 = 65536;
                } else {
                    i19 = 65536;
                }
                i13 |= i19;
            } else {
                j14 = j12;
            }
            if ((i12 & 64) != 0) {
                i13 |= 1572864;
            } else if ((i11 & 1572864) == 0) {
                if (sVar2.f(null)) {
                    i16 = 1048576;
                } else {
                    i16 = 524288;
                }
                i13 |= i16;
            }
            if ((12582912 & i11) == 0) {
                if (sVar2.h(dVar)) {
                    i18 = 8388608;
                } else {
                    i18 = 4194304;
                }
                i13 |= i18;
            }
            if ((4793491 & i13) == 4793490) {
                sVar2.Y();
                if ((i11 & 1) != 0) {
                    if (i22 != 0) {
                        rVar3 = z1.o.f58481a;
                    } else {
                        rVar3 = rVar2;
                    }
                    if (i14 != 0) {
                        z13 = true;
                    }
                    if ((i12 & 16) != 0) {
                        i13 &= -57345;
                        j13 = ((g2.x) sVar2.j(h2.f30320a)).f28624a;
                    }
                    if ((i12 & 32) != 0) {
                        i13 &= -458753;
                        j14 = j13;
                    }
                    i17 = i13;
                    z14 = z13;
                    rVar4 = rVar3;
                    j15 = j13;
                    j16 = j14;
                } else {
                    if (i22 != 0) {
                        rVar3 = z1.o.f58481a;
                    } else {
                        rVar3 = rVar2;
                    }
                    if (i14 != 0) {
                        z13 = true;
                    }
                    if ((i12 & 16) != 0) {
                        i13 &= -57345;
                        j13 = ((g2.x) sVar2.j(h2.f30320a)).f28624a;
                    }
                    if ((i12 & 32) != 0) {
                        i13 &= -458753;
                        j14 = j13;
                    }
                    i17 = i13;
                    z14 = z13;
                    rVar4 = rVar3;
                    j15 = j13;
                    j16 = j14;
                }
                sVar2.q();
                long j110 = j15;
                int i24 = i17 >> 12;
                long j22 = j16;
                c(j110, j22, z11, t1.e.d(-551896140, new t9(rVar4, z11, l7.a(true, CropImageView.DEFAULT_ASPECT_RATIO, j110, sVar2, ((i17 >> 6) & 896) | 6, 2), z14, aVar, dVar), sVar2), sVar2, (i24 & 112) | (i24 & 14) | 3072 | ((i17 << 6) & 896));
                j17 = j22;
                sVar = sVar2;
                z15 = z14;
                j18 = j110;
                rVar5 = rVar4;
            } else {
                sVar2.Y();
                if ((i11 & 1) != 0) {
                    if (i22 != 0) {
                        rVar3 = z1.o.f58481a;
                    } else {
                        rVar3 = rVar2;
                    }
                    if (i14 != 0) {
                        z13 = true;
                    }
                    if ((i12 & 16) != 0) {
                        i13 &= -57345;
                        j13 = ((g2.x) sVar2.j(h2.f30320a)).f28624a;
                    }
                    if ((i12 & 32) != 0) {
                        i13 &= -458753;
                        j14 = j13;
                    }
                    i17 = i13;
                    z14 = z13;
                    rVar4 = rVar3;
                    j15 = j13;
                    j16 = j14;
                } else {
                    if (i22 != 0) {
                        rVar3 = z1.o.f58481a;
                    } else {
                        rVar3 = rVar2;
                    }
                    if (i14 != 0) {
                        z13 = true;
                    }
                    if ((i12 & 16) != 0) {
                        i13 &= -57345;
                        j13 = ((g2.x) sVar2.j(h2.f30320a)).f28624a;
                    }
                    if ((i12 & 32) != 0) {
                        i13 &= -458753;
                        j14 = j13;
                    }
                    i17 = i13;
                    z14 = z13;
                    rVar4 = rVar3;
                    j15 = j13;
                    j16 = j14;
                }
                sVar2.q();
                long j111 = j15;
                int i25 = i17 >> 12;
                long j23 = j16;
                c(j111, j23, z11, t1.e.d(-551896140, new t9(rVar4, z11, l7.a(true, CropImageView.DEFAULT_ASPECT_RATIO, j111, sVar2, ((i17 >> 6) & 896) | 6, 2), z14, aVar, dVar), sVar2), sVar2, (i25 & 112) | (i25 & 14) | 3072 | ((i17 << 6) & 896));
                j17 = j23;
                sVar = sVar2;
                z15 = z14;
                j18 = j111;
                rVar5 = rVar4;
            }
            x1VarT = sVar.t();
            if (x1VarT != null) {
                x1VarT.f39502d = new s9(z11, aVar, rVar5, z15, j18, j17, dVar, i11, i12);
            }
        }
        i13 |= 384;
        rVar2 = rVar;
        i14 = i12 & 8;
        if (i14 != 0) {
            if ((i11 & 3072) == 0) {
                z13 = z12;
                if (sVar2.g(z13)) {
                    i15 = 2048;
                } else {
                    i15 = 1024;
                }
                i13 |= i15;
            }
            if ((i11 & 24576) == 0) {
                j13 = j11;
                if ((i12 & 16) == 0) {
                    i21 = OSSConstants.DEFAULT_BUFFER_SIZE;
                } else {
                    i21 = OSSConstants.DEFAULT_BUFFER_SIZE;
                }
                i13 |= i21;
            } else {
                j13 = j11;
            }
            if ((196608 & i11) == 0) {
                j14 = j12;
                if ((i12 & 32) == 0) {
                    i19 = 65536;
                } else {
                    i19 = 65536;
                }
                i13 |= i19;
            } else {
                j14 = j12;
            }
            if ((i12 & 64) != 0) {
                i13 |= 1572864;
            } else if ((i11 & 1572864) == 0) {
                if (sVar2.f(null)) {
                    i16 = 1048576;
                } else {
                    i16 = 524288;
                }
                i13 |= i16;
            }
            if ((12582912 & i11) == 0) {
                if (sVar2.h(dVar)) {
                    i18 = 8388608;
                } else {
                    i18 = 4194304;
                }
                i13 |= i18;
            }
            if ((4793491 & i13) == 4793490) {
                sVar2.Y();
                if ((i11 & 1) != 0) {
                    if (i22 != 0) {
                        rVar3 = z1.o.f58481a;
                    } else {
                        rVar3 = rVar2;
                    }
                    if (i14 != 0) {
                        z13 = true;
                    }
                    if ((i12 & 16) != 0) {
                        i13 &= -57345;
                        j13 = ((g2.x) sVar2.j(h2.f30320a)).f28624a;
                    }
                    if ((i12 & 32) != 0) {
                        i13 &= -458753;
                        j14 = j13;
                    }
                    i17 = i13;
                    z14 = z13;
                    rVar4 = rVar3;
                    j15 = j13;
                    j16 = j14;
                } else {
                    if (i22 != 0) {
                        rVar3 = z1.o.f58481a;
                    } else {
                        rVar3 = rVar2;
                    }
                    if (i14 != 0) {
                        z13 = true;
                    }
                    if ((i12 & 16) != 0) {
                        i13 &= -57345;
                        j13 = ((g2.x) sVar2.j(h2.f30320a)).f28624a;
                    }
                    if ((i12 & 32) != 0) {
                        i13 &= -458753;
                        j14 = j13;
                    }
                    i17 = i13;
                    z14 = z13;
                    rVar4 = rVar3;
                    j15 = j13;
                    j16 = j14;
                }
                sVar2.q();
                long j112 = j15;
                int i26 = i17 >> 12;
                long j24 = j16;
                c(j112, j24, z11, t1.e.d(-551896140, new t9(rVar4, z11, l7.a(true, CropImageView.DEFAULT_ASPECT_RATIO, j112, sVar2, ((i17 >> 6) & 896) | 6, 2), z14, aVar, dVar), sVar2), sVar2, (i26 & 112) | (i26 & 14) | 3072 | ((i17 << 6) & 896));
                j17 = j24;
                sVar = sVar2;
                z15 = z14;
                j18 = j112;
                rVar5 = rVar4;
            } else {
                sVar2.Y();
                if ((i11 & 1) != 0) {
                    if (i22 != 0) {
                        rVar3 = z1.o.f58481a;
                    } else {
                        rVar3 = rVar2;
                    }
                    if (i14 != 0) {
                        z13 = true;
                    }
                    if ((i12 & 16) != 0) {
                        i13 &= -57345;
                        j13 = ((g2.x) sVar2.j(h2.f30320a)).f28624a;
                    }
                    if ((i12 & 32) != 0) {
                        i13 &= -458753;
                        j14 = j13;
                    }
                    i17 = i13;
                    z14 = z13;
                    rVar4 = rVar3;
                    j15 = j13;
                    j16 = j14;
                } else {
                    if (i22 != 0) {
                        rVar3 = z1.o.f58481a;
                    } else {
                        rVar3 = rVar2;
                    }
                    if (i14 != 0) {
                        z13 = true;
                    }
                    if ((i12 & 16) != 0) {
                        i13 &= -57345;
                        j13 = ((g2.x) sVar2.j(h2.f30320a)).f28624a;
                    }
                    if ((i12 & 32) != 0) {
                        i13 &= -458753;
                        j14 = j13;
                    }
                    i17 = i13;
                    z14 = z13;
                    rVar4 = rVar3;
                    j15 = j13;
                    j16 = j14;
                }
                sVar2.q();
                long j113 = j15;
                int i27 = i17 >> 12;
                long j25 = j16;
                c(j113, j25, z11, t1.e.d(-551896140, new t9(rVar4, z11, l7.a(true, CropImageView.DEFAULT_ASPECT_RATIO, j113, sVar2, ((i17 >> 6) & 896) | 6, 2), z14, aVar, dVar), sVar2), sVar2, (i27 & 112) | (i27 & 14) | 3072 | ((i17 << 6) & 896));
                j17 = j25;
                sVar = sVar2;
                z15 = z14;
                j18 = j113;
                rVar5 = rVar4;
            }
            x1VarT = sVar.t();
            if (x1VarT != null) {
                x1VarT.f39502d = new s9(z11, aVar, rVar5, z15, j18, j17, dVar, i11, i12);
            }
        }
        i13 |= 3072;
        z13 = z12;
        if ((i11 & 24576) == 0) {
            j13 = j11;
            if ((i12 & 16) == 0) {
                i21 = OSSConstants.DEFAULT_BUFFER_SIZE;
            } else {
                i21 = OSSConstants.DEFAULT_BUFFER_SIZE;
            }
            i13 |= i21;
        } else {
            j13 = j11;
        }
        if ((196608 & i11) == 0) {
            j14 = j12;
            if ((i12 & 32) == 0) {
                i19 = 65536;
            } else {
                i19 = 65536;
            }
            i13 |= i19;
        } else {
            j14 = j12;
        }
        if ((i12 & 64) != 0) {
            i13 |= 1572864;
        } else if ((i11 & 1572864) == 0) {
            if (sVar2.f(null)) {
                i16 = 1048576;
            } else {
                i16 = 524288;
            }
            i13 |= i16;
        }
        if ((12582912 & i11) == 0) {
            if (sVar2.h(dVar)) {
                i18 = 8388608;
            } else {
                i18 = 4194304;
            }
            i13 |= i18;
        }
        if ((4793491 & i13) == 4793490) {
            sVar2.Y();
            if ((i11 & 1) != 0) {
                if (i22 != 0) {
                    rVar3 = z1.o.f58481a;
                } else {
                    rVar3 = rVar2;
                }
                if (i14 != 0) {
                    z13 = true;
                }
                if ((i12 & 16) != 0) {
                    i13 &= -57345;
                    j13 = ((g2.x) sVar2.j(h2.f30320a)).f28624a;
                }
                if ((i12 & 32) != 0) {
                    i13 &= -458753;
                    j14 = j13;
                }
                i17 = i13;
                z14 = z13;
                rVar4 = rVar3;
                j15 = j13;
                j16 = j14;
            } else {
                if (i22 != 0) {
                    rVar3 = z1.o.f58481a;
                } else {
                    rVar3 = rVar2;
                }
                if (i14 != 0) {
                    z13 = true;
                }
                if ((i12 & 16) != 0) {
                    i13 &= -57345;
                    j13 = ((g2.x) sVar2.j(h2.f30320a)).f28624a;
                }
                if ((i12 & 32) != 0) {
                    i13 &= -458753;
                    j14 = j13;
                }
                i17 = i13;
                z14 = z13;
                rVar4 = rVar3;
                j15 = j13;
                j16 = j14;
            }
            sVar2.q();
            long j114 = j15;
            int i28 = i17 >> 12;
            long j26 = j16;
            c(j114, j26, z11, t1.e.d(-551896140, new t9(rVar4, z11, l7.a(true, CropImageView.DEFAULT_ASPECT_RATIO, j114, sVar2, ((i17 >> 6) & 896) | 6, 2), z14, aVar, dVar), sVar2), sVar2, (i28 & 112) | (i28 & 14) | 3072 | ((i17 << 6) & 896));
            j17 = j26;
            sVar = sVar2;
            z15 = z14;
            j18 = j114;
            rVar5 = rVar4;
        } else {
            sVar2.Y();
            if ((i11 & 1) != 0) {
                if (i22 != 0) {
                    rVar3 = z1.o.f58481a;
                } else {
                    rVar3 = rVar2;
                }
                if (i14 != 0) {
                    z13 = true;
                }
                if ((i12 & 16) != 0) {
                    i13 &= -57345;
                    j13 = ((g2.x) sVar2.j(h2.f30320a)).f28624a;
                }
                if ((i12 & 32) != 0) {
                    i13 &= -458753;
                    j14 = j13;
                }
                i17 = i13;
                z14 = z13;
                rVar4 = rVar3;
                j15 = j13;
                j16 = j14;
            } else {
                if (i22 != 0) {
                    rVar3 = z1.o.f58481a;
                } else {
                    rVar3 = rVar2;
                }
                if (i14 != 0) {
                    z13 = true;
                }
                if ((i12 & 16) != 0) {
                    i13 &= -57345;
                    j13 = ((g2.x) sVar2.j(h2.f30320a)).f28624a;
                }
                if ((i12 & 32) != 0) {
                    i13 &= -458753;
                    j14 = j13;
                }
                i17 = i13;
                z14 = z13;
                rVar4 = rVar3;
                j15 = j13;
                j16 = j14;
            }
            sVar2.q();
            long j115 = j15;
            int i29 = i17 >> 12;
            long j27 = j16;
            c(j115, j27, z11, t1.e.d(-551896140, new t9(rVar4, z11, l7.a(true, CropImageView.DEFAULT_ASPECT_RATIO, j115, sVar2, ((i17 >> 6) & 896) | 6, 2), z14, aVar, dVar), sVar2), sVar2, (i29 & 112) | (i29 & 14) | 3072 | ((i17 << 6) & 896));
            j17 = j27;
            sVar = sVar2;
            z15 = z14;
            j18 = j115;
            rVar5 = rVar4;
        }
        x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new s9(z11, aVar, rVar5, z15, j18, j17, dVar, i11, i12);
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0066  */
    /* JADX WARN: Code duplicated, block: B:28:0x0073  */
    /* JADX WARN: Code duplicated, block: B:35:0x008e  */
    /* JADX WARN: Code duplicated, block: B:37:0x009e  */
    /* JADX WARN: Code duplicated, block: B:41:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:42:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:46:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:48:? A[RETURN, SYNTHETIC] */
    public static final void b(boolean z11, fz.a aVar, z1.r rVar, boolean z12, fz.e eVar, long j11, long j12, l1.n nVar, int i11, int i12) {
        long j13;
        int i13;
        long j14;
        int i14;
        boolean z13;
        long j15;
        z1.r rVar2;
        long j16;
        t1.d dVarD;
        l1.s sVar;
        z1.r rVar3;
        boolean z14;
        long j17;
        long j18;
        l1.x1 x1VarT;
        l1.s sVar2 = (l1.s) nVar;
        sVar2.f0(-350627181);
        int i15 = i11 | (sVar2.g(z11) ? 4 : 2);
        if ((i11 & 48) == 0) {
            i15 |= sVar2.h(aVar) ? 32 : 16;
        }
        int i16 = i15 | 724352;
        if ((i12 & 128) == 0) {
            j13 = j12;
            int i17 = sVar2.e(j13) ? 8388608 : 4194304;
            i13 = i16 | i17 | 100663296;
            if ((38347923 & i13) == 38347922 || !sVar2.F()) {
                sVar2.Y();
                if ((i11 & 1) != 0 || sVar2.C()) {
                    j14 = ((g2.x) sVar2.j(h2.f30320a)).f28624a;
                    i14 = i13 & (-3670017);
                    if ((i12 & 128) != 0) {
                        i14 = i13 & (-33030145);
                        j13 = j14;
                    }
                    z13 = true;
                    j15 = j13;
                    rVar2 = z1.o.f58481a;
                    j16 = j14;
                } else {
                    sVar2.W();
                    i14 = i13 & (-3670017);
                    if ((i12 & 128) != 0) {
                        i14 = i13 & (-33030145);
                    }
                    rVar2 = rVar;
                    z13 = z12;
                    j16 = j11;
                    j15 = j13;
                }
                sVar2.q();
                sVar2.d0(79583089);
                if (eVar == null) {
                    dVarD = null;
                } else {
                    dVarD = t1.e.d(708874428, new b(4, eVar), sVar2);
                }
                sVar2.p(false);
                sVar = sVar2;
                a(z11, aVar, rVar2, z13, j16, j15, t1.e.d(1540996038, new a0.f(dVarD, 2), sVar2), sVar, (i14 & 14) | 12582912 | (i14 & 112) | 3456 | ((i14 >> 6) & 458752) | 1572864, 0);
                rVar3 = rVar2;
                z14 = z13;
                j17 = j16;
                j18 = j15;
            } else {
                sVar2.W();
                z14 = z12;
                j17 = j11;
                sVar = sVar2;
                j18 = j13;
                rVar3 = rVar;
            }
            x1VarT = sVar.t();
            if (x1VarT != null) {
                x1VarT.f39502d = new s9(z11, aVar, rVar3, z14, eVar, j17, j18, i11, i12);
            }
        }
        j13 = j12;
        i13 = i16 | i17 | 100663296;
        if ((38347923 & i13) == 38347922) {
            sVar2.Y();
            if ((i11 & 1) != 0) {
                j14 = ((g2.x) sVar2.j(h2.f30320a)).f28624a;
                i14 = i13 & (-3670017);
                if ((i12 & 128) != 0) {
                    i14 = i13 & (-33030145);
                    j13 = j14;
                }
                z13 = true;
                j15 = j13;
                rVar2 = z1.o.f58481a;
                j16 = j14;
            } else {
                j14 = ((g2.x) sVar2.j(h2.f30320a)).f28624a;
                i14 = i13 & (-3670017);
                if ((i12 & 128) != 0) {
                    i14 = i13 & (-33030145);
                    j13 = j14;
                }
                z13 = true;
                j15 = j13;
                rVar2 = z1.o.f58481a;
                j16 = j14;
            }
            sVar2.q();
            sVar2.d0(79583089);
            if (eVar == null) {
                dVarD = null;
            } else {
                dVarD = t1.e.d(708874428, new b(4, eVar), sVar2);
            }
            sVar2.p(false);
            sVar = sVar2;
            a(z11, aVar, rVar2, z13, j16, j15, t1.e.d(1540996038, new a0.f(dVarD, 2), sVar2), sVar, (i14 & 14) | 12582912 | (i14 & 112) | 3456 | ((i14 >> 6) & 458752) | 1572864, 0);
            rVar3 = rVar2;
            z14 = z13;
            j17 = j16;
            j18 = j15;
        } else {
            sVar2.Y();
            if ((i11 & 1) != 0) {
                j14 = ((g2.x) sVar2.j(h2.f30320a)).f28624a;
                i14 = i13 & (-3670017);
                if ((i12 & 128) != 0) {
                    i14 = i13 & (-33030145);
                    j13 = j14;
                }
                z13 = true;
                j15 = j13;
                rVar2 = z1.o.f58481a;
                j16 = j14;
            } else {
                j14 = ((g2.x) sVar2.j(h2.f30320a)).f28624a;
                i14 = i13 & (-3670017);
                if ((i12 & 128) != 0) {
                    i14 = i13 & (-33030145);
                    j13 = j14;
                }
                z13 = true;
                j15 = j13;
                rVar2 = z1.o.f58481a;
                j16 = j14;
            }
            sVar2.q();
            sVar2.d0(79583089);
            if (eVar == null) {
                dVarD = null;
            } else {
                dVarD = t1.e.d(708874428, new b(4, eVar), sVar2);
            }
            sVar2.p(false);
            sVar = sVar2;
            a(z11, aVar, rVar2, z13, j16, j15, t1.e.d(1540996038, new a0.f(dVarD, 2), sVar2), sVar, (i14 & 14) | 12582912 | (i14 & 112) | 3456 | ((i14 >> 6) & 458752) | 1572864, 0);
            rVar3 = rVar2;
            z14 = z13;
            j17 = j16;
            j18 = j15;
        }
        x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new s9(z11, aVar, rVar3, z14, eVar, j17, j18, i11, i12);
        }
    }

    public static final void c(long j11, long j12, boolean z11, t1.d dVar, l1.n nVar, int i11) {
        int i12;
        long j13;
        boolean z12;
        b0.i2 i2VarR;
        l1.s sVar = (l1.s) nVar;
        sVar.f0(735731848);
        if ((i11 & 6) == 0) {
            i12 = (sVar.e(j11) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            j13 = j12;
            i12 |= sVar.e(j13) ? 32 : 16;
        } else {
            j13 = j12;
        }
        if ((i11 & 384) == 0) {
            i12 |= sVar.g(z11) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= sVar.h(dVar) ? 2048 : 1024;
        }
        if ((i12 & 1171) == 1170 && sVar.F()) {
            sVar.W();
        } else {
            int i13 = i12 >> 6;
            b0.c2 c2VarE = b0.g2.e(Boolean.valueOf(z11), null, sVar, i13 & 14, 2);
            l1.k1 k1Var = c2VarE.f3461d;
            boolean zBooleanValue = ((Boolean) k1Var.getValue()).booleanValue();
            sVar.d0(-1997025499);
            long j14 = zBooleanValue ? j11 : j13;
            sVar.p(false);
            h2.c cVarG = g2.x.g(j14);
            boolean zF = sVar.f(cVarG);
            Object objQ = sVar.Q();
            if (zF || objQ == l1.m.f39353a) {
                b0.j2 j2Var = new b0.j2(a0.c.f33t, new a0.o0(cVarG, 0));
                sVar.o0(j2Var);
                objQ = j2Var;
            }
            b0.j2 j2Var2 = (b0.j2) objQ;
            boolean zBooleanValue2 = ((Boolean) c2VarE.f3458a.Y()).booleanValue();
            sVar.d0(-1997025499);
            long j15 = zBooleanValue2 ? j11 : j13;
            sVar.p(false);
            g2.x xVar = new g2.x(j15);
            boolean zBooleanValue3 = ((Boolean) k1Var.getValue()).booleanValue();
            sVar.d0(-1997025499);
            long j16 = zBooleanValue3 ? j11 : j13;
            sVar.p(false);
            g2.x xVar2 = new g2.x(j16);
            b0.w1 w1VarF = c2VarE.f();
            sVar.d0(-899623535);
            if (w1VarF.b(Boolean.FALSE, Boolean.TRUE)) {
                i2VarR = new b0.i2(150, 100, b0.b0.f3441d);
                z12 = false;
            } else {
                z12 = false;
                i2VarR = b0.e.r(100, 0, b0.b0.f3441d, 2);
            }
            sVar.p(z12);
            l1.t.a(h2.f30320a.a(new g2.x(((g2.x) b0.g2.c(c2VarE, xVar, xVar2, i2VarR, j2Var2, sVar, 0).L.getValue()).f28624a)), dVar, sVar, (i13 & 112) | 8);
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new w9(j11, j13, z11, dVar, i11);
        }
    }

    public static final void d(fz.e eVar, l1.n nVar, int i11) {
        int i12;
        boolean z11;
        z1.j jVar = z1.c.f58463a;
        l1.s sVar = (l1.s) nVar;
        sVar.f0(514131524);
        if ((i11 & 6) == 0) {
            i12 = (sVar.h(eVar) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar.h(null) ? 32 : 16;
        }
        if ((i12 & 19) == 18 && sVar.F()) {
            sVar.W();
        } else {
            int i13 = i12 & 14;
            boolean z12 = ((i12 & 112) == 32) | (i13 == 4);
            Object objQ = sVar.Q();
            if (z12 || objQ == l1.m.f39353a) {
                objQ = new n8(eVar, 1);
                sVar.o0(objQ);
            }
            w2.q0 q0Var = (w2.q0) objQ;
            int iHashCode = Long.hashCode(sVar.T);
            l1.q1 q1VarL = sVar.l();
            z1.o oVar = z1.o.f58481a;
            z1.r rVarC = z1.a.c(sVar, oVar);
            y2.k.J.getClass();
            y2.i iVar = y2.j.f56913b;
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            y2.h hVar = y2.j.f56917f;
            l1.t.J(hVar, q0Var, sVar);
            y2.h hVar2 = y2.j.f56916e;
            l1.t.J(hVar2, q1VarL, sVar);
            y2.h hVar3 = y2.j.f56918g;
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                defpackage.e.A(iHashCode, sVar, iHashCode, hVar3);
            }
            y2.h hVar4 = y2.j.f56915d;
            l1.t.J(hVar4, rVarC, sVar);
            sVar.d0(871566271);
            if (eVar != null) {
                z1.r rVarC2 = j0.c.C(w2.a0.l(oVar, "text"), f31318b, CropImageView.DEFAULT_ASPECT_RATIO, 2);
                w2.q0 q0VarD = j0.o.d(jVar, false);
                int iHashCode2 = Long.hashCode(sVar.T);
                l1.q1 q1VarL2 = sVar.l();
                z1.r rVarC3 = z1.a.c(sVar, rVarC2);
                sVar.h0();
                if (sVar.S) {
                    sVar.k(iVar);
                } else {
                    sVar.r0();
                }
                l1.t.J(hVar, q0VarD, sVar);
                l1.t.J(hVar2, q1VarL2, sVar);
                if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode2))) {
                    defpackage.e.A(iHashCode2, sVar, iHashCode2, hVar3);
                }
                l1.t.J(hVar4, rVarC3, sVar);
                z11 = true;
                ep.a.w(i13, eVar, sVar, true);
            } else {
                z11 = true;
            }
            sVar.p(false);
            sVar.d0(871570579);
            sVar.p(false);
            sVar.p(z11);
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new v9(eVar, i11, 0);
        }
    }
}
