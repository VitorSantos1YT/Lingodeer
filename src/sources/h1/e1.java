package h1;

import com.alibaba.sdk.android.oss.common.OSSConstants;
import com.yalantis.ucrop.view.CropImageView;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class e1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f30188a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f30189b = 20;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final float f30190c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final float f30191d;

    static {
        float f5 = 2;
        f30188a = f5;
        f30190c = f5;
        f30191d = f5;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x012a  */
    /* JADX WARN: Code duplicated, block: B:102:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x004f  */
    /* JADX WARN: Code duplicated, block: B:32:0x0054  */
    /* JADX WARN: Code duplicated, block: B:34:0x0058  */
    /* JADX WARN: Code duplicated, block: B:36:0x0060  */
    /* JADX WARN: Code duplicated, block: B:37:0x0063  */
    /* JADX WARN: Code duplicated, block: B:41:0x006a  */
    /* JADX WARN: Code duplicated, block: B:43:0x006e  */
    /* JADX WARN: Code duplicated, block: B:45:0x0076  */
    /* JADX WARN: Code duplicated, block: B:46:0x0079  */
    /* JADX WARN: Code duplicated, block: B:49:0x007f  */
    /* JADX WARN: Code duplicated, block: B:52:0x008d  */
    /* JADX WARN: Code duplicated, block: B:56:0x009c  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ba A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:66:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:67:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:76:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:78:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:81:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:83:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:84:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:88:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:91:0x0102  */
    /* JADX WARN: Code duplicated, block: B:93:0x0106  */
    /* JADX WARN: Code duplicated, block: B:96:0x0113  */
    /* JADX WARN: Instruction removed from duplicated block: B:56:0x009c, please report this as an issue */
    public static final void a(boolean z11, fz.c cVar, z1.r rVar, boolean z12, z0 z0Var, l1.n nVar, int i11, int i12) {
        int i13;
        z1.r rVar2;
        int i14;
        boolean z13;
        int i15;
        z0 z0VarV;
        int i16;
        z1.r rVar3;
        boolean z14;
        z0 z0Var2;
        z1.r rVar4;
        i3.a aVar;
        fz.a aVar2;
        z1.r rVar5;
        boolean z15;
        z0 z0Var3;
        boolean z16;
        boolean z17;
        Object objQ;
        l1.x1 x1VarT;
        int i17;
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-1406741137);
        if ((i11 & 6) == 0) {
            i13 = (sVar.g(z11) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i11 & 48) == 0) {
            i13 |= sVar.h(cVar) ? 32 : 16;
        }
        int i18 = i12 & 4;
        if (i18 == 0) {
            if ((i11 & 384) == 0) {
                rVar2 = rVar;
                i13 |= sVar.f(rVar2) ? 256 : 128;
            }
            i14 = i12 & 8;
            if (i14 != 0) {
                if ((i11 & 3072) == 0) {
                    z13 = z12;
                    if (sVar.g(z13)) {
                        i15 = 2048;
                    } else {
                        i15 = 1024;
                    }
                    i13 |= i15;
                }
                if ((i11 & 24576) == 0) {
                    if ((i12 & 16) == 0) {
                        z0VarV = z0Var;
                        if (sVar.f(z0VarV)) {
                            i17 = 16384;
                        }
                        i13 |= i17;
                    } else {
                        z0VarV = z0Var;
                    }
                    i17 = OSSConstants.DEFAULT_BUFFER_SIZE;
                    i13 |= i17;
                } else {
                    z0VarV = z0Var;
                }
                i16 = i13 | 196608;
                if ((74899 & i16) == 74898 || !sVar.F()) {
                    sVar.Y();
                    if ((i11 & 1) != 0 || sVar.C()) {
                        if (i18 != 0) {
                            rVar3 = z1.o.f58481a;
                        } else {
                            rVar3 = rVar2;
                        }
                        if (i14 != 0) {
                            z13 = true;
                        }
                        if ((i12 & 16) != 0) {
                            i16 &= -57345;
                            z0VarV = k7.v((s1) sVar.j(v1.f31180a));
                        }
                        z14 = z13;
                        z0Var2 = z0VarV;
                        rVar4 = rVar3;
                    } else {
                        sVar.W();
                        if ((i12 & 16) != 0) {
                            i16 &= -57345;
                        }
                        z14 = z13;
                        z0Var2 = z0VarV;
                        rVar4 = rVar2;
                    }
                    sVar.q();
                    if (z11) {
                        aVar = i3.a.On;
                    } else {
                        aVar = i3.a.Off;
                    }
                    i3.a aVar3 = aVar;
                    sVar.d0(1046936362);
                    if (cVar != null) {
                        if ((i16 & 112) == 32) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        z17 = z16 | ((i16 & 14) == 4);
                        objQ = sVar.Q();
                        if (z17 || objQ == l1.m.f39353a) {
                            objQ = new g.d(cVar, z11, 1);
                            sVar.o0(objQ);
                        }
                        aVar2 = (fz.a) objQ;
                    } else {
                        aVar2 = null;
                    }
                    fz.a aVar4 = aVar2;
                    sVar.p(false);
                    c(aVar3, aVar4, rVar4, z14, z0Var2, sVar, i16 & 524160, 0);
                    rVar5 = rVar4;
                    z15 = z14;
                    z0Var3 = z0Var2;
                } else {
                    sVar.W();
                    rVar5 = rVar2;
                    z15 = z13;
                    z0Var3 = z0VarV;
                }
                x1VarT = sVar.t();
                if (x1VarT != null) {
                    x1VarT.f39502d = new a1(z11, cVar, rVar5, z15, z0Var3, i11, i12, 0);
                }
            }
            i13 |= 3072;
            z13 = z12;
            if ((i11 & 24576) == 0) {
                if ((i12 & 16) == 0) {
                    z0VarV = z0Var;
                    if (sVar.f(z0VarV)) {
                        i17 = 16384;
                    }
                    i13 |= i17;
                } else {
                    z0VarV = z0Var;
                }
                i17 = OSSConstants.DEFAULT_BUFFER_SIZE;
                i13 |= i17;
            } else {
                z0VarV = z0Var;
            }
            i16 = i13 | 196608;
            if ((74899 & i16) == 74898) {
                sVar.Y();
                if ((i11 & 1) != 0) {
                    if (i18 != 0) {
                        rVar3 = z1.o.f58481a;
                    } else {
                        rVar3 = rVar2;
                    }
                    if (i14 != 0) {
                        z13 = true;
                    }
                    if ((i12 & 16) != 0) {
                        i16 &= -57345;
                        z0VarV = k7.v((s1) sVar.j(v1.f31180a));
                    }
                    z14 = z13;
                    z0Var2 = z0VarV;
                    rVar4 = rVar3;
                } else {
                    if (i18 != 0) {
                        rVar3 = z1.o.f58481a;
                    } else {
                        rVar3 = rVar2;
                    }
                    if (i14 != 0) {
                        z13 = true;
                    }
                    if ((i12 & 16) != 0) {
                        i16 &= -57345;
                        z0VarV = k7.v((s1) sVar.j(v1.f31180a));
                    }
                    z14 = z13;
                    z0Var2 = z0VarV;
                    rVar4 = rVar3;
                }
                sVar.q();
                if (z11) {
                    aVar = i3.a.On;
                } else {
                    aVar = i3.a.Off;
                }
                i3.a aVar5 = aVar;
                sVar.d0(1046936362);
                if (cVar != null) {
                    if ((i16 & 112) == 32) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    z17 = z16 | ((i16 & 14) == 4);
                    objQ = sVar.Q();
                    if (z17) {
                        objQ = new g.d(cVar, z11, 1);
                        sVar.o0(objQ);
                    } else {
                        objQ = new g.d(cVar, z11, 1);
                        sVar.o0(objQ);
                    }
                    aVar2 = (fz.a) objQ;
                } else {
                    aVar2 = null;
                }
                fz.a aVar6 = aVar2;
                sVar.p(false);
                c(aVar5, aVar6, rVar4, z14, z0Var2, sVar, i16 & 524160, 0);
                rVar5 = rVar4;
                z15 = z14;
                z0Var3 = z0Var2;
            } else {
                sVar.Y();
                if ((i11 & 1) != 0) {
                    if (i18 != 0) {
                        rVar3 = z1.o.f58481a;
                    } else {
                        rVar3 = rVar2;
                    }
                    if (i14 != 0) {
                        z13 = true;
                    }
                    if ((i12 & 16) != 0) {
                        i16 &= -57345;
                        z0VarV = k7.v((s1) sVar.j(v1.f31180a));
                    }
                    z14 = z13;
                    z0Var2 = z0VarV;
                    rVar4 = rVar3;
                } else {
                    if (i18 != 0) {
                        rVar3 = z1.o.f58481a;
                    } else {
                        rVar3 = rVar2;
                    }
                    if (i14 != 0) {
                        z13 = true;
                    }
                    if ((i12 & 16) != 0) {
                        i16 &= -57345;
                        z0VarV = k7.v((s1) sVar.j(v1.f31180a));
                    }
                    z14 = z13;
                    z0Var2 = z0VarV;
                    rVar4 = rVar3;
                }
                sVar.q();
                if (z11) {
                    aVar = i3.a.On;
                } else {
                    aVar = i3.a.Off;
                }
                i3.a aVar7 = aVar;
                sVar.d0(1046936362);
                if (cVar != null) {
                    if ((i16 & 112) == 32) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    z17 = z16 | ((i16 & 14) == 4);
                    objQ = sVar.Q();
                    if (z17) {
                        objQ = new g.d(cVar, z11, 1);
                        sVar.o0(objQ);
                    } else {
                        objQ = new g.d(cVar, z11, 1);
                        sVar.o0(objQ);
                    }
                    aVar2 = (fz.a) objQ;
                } else {
                    aVar2 = null;
                }
                fz.a aVar8 = aVar2;
                sVar.p(false);
                c(aVar7, aVar8, rVar4, z14, z0Var2, sVar, i16 & 524160, 0);
                rVar5 = rVar4;
                z15 = z14;
                z0Var3 = z0Var2;
            }
            x1VarT = sVar.t();
            if (x1VarT != null) {
                x1VarT.f39502d = new a1(z11, cVar, rVar5, z15, z0Var3, i11, i12, 0);
            }
        }
        i13 |= 384;
        rVar2 = rVar;
        i14 = i12 & 8;
        if (i14 != 0) {
            if ((i11 & 3072) == 0) {
                z13 = z12;
                if (sVar.g(z13)) {
                    i15 = 2048;
                } else {
                    i15 = 1024;
                }
                i13 |= i15;
            }
            if ((i11 & 24576) == 0) {
                if ((i12 & 16) == 0) {
                    z0VarV = z0Var;
                    if (sVar.f(z0VarV)) {
                        i17 = 16384;
                    }
                    i13 |= i17;
                } else {
                    z0VarV = z0Var;
                }
                i17 = OSSConstants.DEFAULT_BUFFER_SIZE;
                i13 |= i17;
            } else {
                z0VarV = z0Var;
            }
            i16 = i13 | 196608;
            if ((74899 & i16) == 74898) {
                sVar.Y();
                if ((i11 & 1) != 0) {
                    if (i18 != 0) {
                        rVar3 = z1.o.f58481a;
                    } else {
                        rVar3 = rVar2;
                    }
                    if (i14 != 0) {
                        z13 = true;
                    }
                    if ((i12 & 16) != 0) {
                        i16 &= -57345;
                        z0VarV = k7.v((s1) sVar.j(v1.f31180a));
                    }
                    z14 = z13;
                    z0Var2 = z0VarV;
                    rVar4 = rVar3;
                } else {
                    if (i18 != 0) {
                        rVar3 = z1.o.f58481a;
                    } else {
                        rVar3 = rVar2;
                    }
                    if (i14 != 0) {
                        z13 = true;
                    }
                    if ((i12 & 16) != 0) {
                        i16 &= -57345;
                        z0VarV = k7.v((s1) sVar.j(v1.f31180a));
                    }
                    z14 = z13;
                    z0Var2 = z0VarV;
                    rVar4 = rVar3;
                }
                sVar.q();
                if (z11) {
                    aVar = i3.a.On;
                } else {
                    aVar = i3.a.Off;
                }
                i3.a aVar9 = aVar;
                sVar.d0(1046936362);
                if (cVar != null) {
                    if ((i16 & 112) == 32) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    z17 = z16 | ((i16 & 14) == 4);
                    objQ = sVar.Q();
                    if (z17) {
                        objQ = new g.d(cVar, z11, 1);
                        sVar.o0(objQ);
                    } else {
                        objQ = new g.d(cVar, z11, 1);
                        sVar.o0(objQ);
                    }
                    aVar2 = (fz.a) objQ;
                } else {
                    aVar2 = null;
                }
                fz.a aVar10 = aVar2;
                sVar.p(false);
                c(aVar9, aVar10, rVar4, z14, z0Var2, sVar, i16 & 524160, 0);
                rVar5 = rVar4;
                z15 = z14;
                z0Var3 = z0Var2;
            } else {
                sVar.Y();
                if ((i11 & 1) != 0) {
                    if (i18 != 0) {
                        rVar3 = z1.o.f58481a;
                    } else {
                        rVar3 = rVar2;
                    }
                    if (i14 != 0) {
                        z13 = true;
                    }
                    if ((i12 & 16) != 0) {
                        i16 &= -57345;
                        z0VarV = k7.v((s1) sVar.j(v1.f31180a));
                    }
                    z14 = z13;
                    z0Var2 = z0VarV;
                    rVar4 = rVar3;
                } else {
                    if (i18 != 0) {
                        rVar3 = z1.o.f58481a;
                    } else {
                        rVar3 = rVar2;
                    }
                    if (i14 != 0) {
                        z13 = true;
                    }
                    if ((i12 & 16) != 0) {
                        i16 &= -57345;
                        z0VarV = k7.v((s1) sVar.j(v1.f31180a));
                    }
                    z14 = z13;
                    z0Var2 = z0VarV;
                    rVar4 = rVar3;
                }
                sVar.q();
                if (z11) {
                    aVar = i3.a.On;
                } else {
                    aVar = i3.a.Off;
                }
                i3.a aVar11 = aVar;
                sVar.d0(1046936362);
                if (cVar != null) {
                    if ((i16 & 112) == 32) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    z17 = z16 | ((i16 & 14) == 4);
                    objQ = sVar.Q();
                    if (z17) {
                        objQ = new g.d(cVar, z11, 1);
                        sVar.o0(objQ);
                    } else {
                        objQ = new g.d(cVar, z11, 1);
                        sVar.o0(objQ);
                    }
                    aVar2 = (fz.a) objQ;
                } else {
                    aVar2 = null;
                }
                fz.a aVar12 = aVar2;
                sVar.p(false);
                c(aVar11, aVar12, rVar4, z14, z0Var2, sVar, i16 & 524160, 0);
                rVar5 = rVar4;
                z15 = z14;
                z0Var3 = z0Var2;
            }
            x1VarT = sVar.t();
            if (x1VarT != null) {
                x1VarT.f39502d = new a1(z11, cVar, rVar5, z15, z0Var3, i11, i12, 0);
            }
        }
        i13 |= 3072;
        z13 = z12;
        if ((i11 & 24576) == 0) {
            if ((i12 & 16) == 0) {
                z0VarV = z0Var;
                if (sVar.f(z0VarV)) {
                    i17 = 16384;
                }
                i13 |= i17;
            } else {
                z0VarV = z0Var;
            }
            i17 = OSSConstants.DEFAULT_BUFFER_SIZE;
            i13 |= i17;
        } else {
            z0VarV = z0Var;
        }
        i16 = i13 | 196608;
        if ((74899 & i16) == 74898) {
            sVar.Y();
            if ((i11 & 1) != 0) {
                if (i18 != 0) {
                    rVar3 = z1.o.f58481a;
                } else {
                    rVar3 = rVar2;
                }
                if (i14 != 0) {
                    z13 = true;
                }
                if ((i12 & 16) != 0) {
                    i16 &= -57345;
                    z0VarV = k7.v((s1) sVar.j(v1.f31180a));
                }
                z14 = z13;
                z0Var2 = z0VarV;
                rVar4 = rVar3;
            } else {
                if (i18 != 0) {
                    rVar3 = z1.o.f58481a;
                } else {
                    rVar3 = rVar2;
                }
                if (i14 != 0) {
                    z13 = true;
                }
                if ((i12 & 16) != 0) {
                    i16 &= -57345;
                    z0VarV = k7.v((s1) sVar.j(v1.f31180a));
                }
                z14 = z13;
                z0Var2 = z0VarV;
                rVar4 = rVar3;
            }
            sVar.q();
            if (z11) {
                aVar = i3.a.On;
            } else {
                aVar = i3.a.Off;
            }
            i3.a aVar13 = aVar;
            sVar.d0(1046936362);
            if (cVar != null) {
                if ((i16 & 112) == 32) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                z17 = z16 | ((i16 & 14) == 4);
                objQ = sVar.Q();
                if (z17) {
                    objQ = new g.d(cVar, z11, 1);
                    sVar.o0(objQ);
                } else {
                    objQ = new g.d(cVar, z11, 1);
                    sVar.o0(objQ);
                }
                aVar2 = (fz.a) objQ;
            } else {
                aVar2 = null;
            }
            fz.a aVar14 = aVar2;
            sVar.p(false);
            c(aVar13, aVar14, rVar4, z14, z0Var2, sVar, i16 & 524160, 0);
            rVar5 = rVar4;
            z15 = z14;
            z0Var3 = z0Var2;
        } else {
            sVar.Y();
            if ((i11 & 1) != 0) {
                if (i18 != 0) {
                    rVar3 = z1.o.f58481a;
                } else {
                    rVar3 = rVar2;
                }
                if (i14 != 0) {
                    z13 = true;
                }
                if ((i12 & 16) != 0) {
                    i16 &= -57345;
                    z0VarV = k7.v((s1) sVar.j(v1.f31180a));
                }
                z14 = z13;
                z0Var2 = z0VarV;
                rVar4 = rVar3;
            } else {
                if (i18 != 0) {
                    rVar3 = z1.o.f58481a;
                } else {
                    rVar3 = rVar2;
                }
                if (i14 != 0) {
                    z13 = true;
                }
                if ((i12 & 16) != 0) {
                    i16 &= -57345;
                    z0VarV = k7.v((s1) sVar.j(v1.f31180a));
                }
                z14 = z13;
                z0Var2 = z0VarV;
                rVar4 = rVar3;
            }
            sVar.q();
            if (z11) {
                aVar = i3.a.On;
            } else {
                aVar = i3.a.Off;
            }
            i3.a aVar15 = aVar;
            sVar.d0(1046936362);
            if (cVar != null) {
                if ((i16 & 112) == 32) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                z17 = z16 | ((i16 & 14) == 4);
                objQ = sVar.Q();
                if (z17) {
                    objQ = new g.d(cVar, z11, 1);
                    sVar.o0(objQ);
                } else {
                    objQ = new g.d(cVar, z11, 1);
                    sVar.o0(objQ);
                }
                aVar2 = (fz.a) objQ;
            } else {
                aVar2 = null;
            }
            fz.a aVar16 = aVar2;
            sVar.p(false);
            c(aVar15, aVar16, rVar4, z14, z0Var2, sVar, i16 & 524160, 0);
            rVar5 = rVar4;
            z15 = z14;
            z0Var3 = z0Var2;
        }
        x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new a1(z11, cVar, rVar5, z15, z0Var3, i11, i12, 0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:111:0x0200  */
    /* JADX WARN: Code duplicated, block: B:112:0x0203  */
    /* JADX WARN: Code duplicated, block: B:114:0x020d  */
    /* JADX WARN: Code duplicated, block: B:116:0x0210  */
    /* JADX WARN: Code duplicated, block: B:118:0x0213  */
    /* JADX WARN: Code duplicated, block: B:119:0x0216  */
    /* JADX WARN: Code duplicated, block: B:121:0x021c  */
    /* JADX WARN: Code duplicated, block: B:122:0x021f  */
    /* JADX WARN: Code duplicated, block: B:124:0x0223  */
    /* JADX WARN: Code duplicated, block: B:126:0x022b  */
    /* JADX WARN: Code duplicated, block: B:128:0x0230  */
    /* JADX WARN: Code duplicated, block: B:131:0x0248  */
    /* JADX WARN: Code duplicated, block: B:133:0x025f  */
    /* JADX WARN: Code duplicated, block: B:142:0x0278  */
    /* JADX WARN: Code duplicated, block: B:143:0x027b  */
    /* JADX WARN: Code duplicated, block: B:145:0x0285  */
    /* JADX WARN: Code duplicated, block: B:147:0x0288  */
    /* JADX WARN: Code duplicated, block: B:149:0x028b  */
    /* JADX WARN: Code duplicated, block: B:150:0x028e  */
    /* JADX WARN: Code duplicated, block: B:152:0x0294  */
    /* JADX WARN: Code duplicated, block: B:153:0x0297  */
    /* JADX WARN: Code duplicated, block: B:155:0x029b  */
    /* JADX WARN: Code duplicated, block: B:157:0x02a3  */
    /* JADX WARN: Code duplicated, block: B:159:0x02a8  */
    /* JADX WARN: Code duplicated, block: B:161:0x02bd  */
    /* JADX WARN: Code duplicated, block: B:166:0x0304  */
    /* JADX WARN: Code duplicated, block: B:70:0x0134  */
    /* JADX WARN: Code duplicated, block: B:80:0x015a  */
    /* JADX WARN: Code duplicated, block: B:83:0x0173  */
    /* JADX WARN: Code duplicated, block: B:84:0x017b  */
    /* JADX WARN: Code duplicated, block: B:86:0x0181  */
    /* JADX WARN: Code duplicated, block: B:87:0x0189  */
    /* JADX WARN: Code duplicated, block: B:90:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:93:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:94:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:97:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:99:0x01ca  */
    public static final void b(boolean z11, i3.a aVar, z1.r rVar, z0 z0Var, l1.n nVar, int i11) {
        int i12;
        float f5;
        float f11;
        b0.c0 c0VarQ;
        b0.y1 y1VarC;
        int i13;
        float f12;
        int i14;
        b0.w1 w1VarF;
        int i15;
        b0.c0 c0VarR;
        int i16;
        b0.y1 y1VarC2;
        Object objQ;
        l1.g gVar;
        x0 x0Var;
        long j11;
        int i17;
        l1.b3 b3VarA;
        int i18;
        long j12;
        Object objH;
        Object obj;
        int i19;
        long j13;
        Object objH2;
        boolean zF;
        Object objQ2;
        int i21;
        int i22;
        int i23;
        int i24;
        l1.s sVar = (l1.s) nVar;
        sVar.f0(2007131616);
        if ((i11 & 6) == 0) {
            i12 = (sVar.g(z11) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar.f(aVar) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= sVar.f(rVar) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= sVar.f(z0Var) ? 2048 : 1024;
        }
        if ((i12 & 1171) == 1170 && sVar.F()) {
            sVar.W();
        } else {
            b0.c2 c2VarE = b0.g2.e(aVar, null, sVar, (i12 >> 3) & 14, 2);
            l1.k1 k1Var = c2VarE.f3461d;
            b0.h2 h2Var = c2VarE.f3458a;
            b0.j2 j2Var = b0.e.f3496j;
            i3.a aVar2 = (i3.a) h2Var.Y();
            sVar.d0(1800065638);
            int[] iArr = d1.f30125a;
            int i25 = iArr[aVar2.ordinal()];
            float f13 = 1.0f;
            if (i25 == 1) {
                f5 = 1.0f;
            } else if (i25 != 2) {
                if (i25 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                f5 = 1.0f;
            } else {
                f5 = CropImageView.DEFAULT_ASPECT_RATIO;
            }
            sVar.p(false);
            Float fValueOf = Float.valueOf(f5);
            i3.a aVar3 = (i3.a) k1Var.getValue();
            sVar.d0(1800065638);
            int i26 = iArr[aVar3.ordinal()];
            if (i26 == 1) {
                f11 = 1.0f;
            } else if (i26 != 2) {
                if (i26 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                f11 = 1.0f;
            } else {
                f11 = CropImageView.DEFAULT_ASPECT_RATIO;
            }
            sVar.p(false);
            Float fValueOf2 = Float.valueOf(f11);
            b0.w1 w1VarF2 = c2VarE.f();
            sVar.d0(1373301606);
            Object objA = w1VarF2.a();
            i3.a aVar4 = i3.a.Off;
            if (objA == aVar4) {
                c0VarQ = b0.e.r(100, 0, null, 6);
            } else {
                if (w1VarF2.c() == aVar4) {
                    c0VarQ = new b0.g1(100);
                } else {
                    c0VarQ = b0.e.q(CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, null, 7);
                }
                sVar.p(false);
                y1VarC = b0.g2.c(c2VarE, fValueOf, fValueOf2, c0VarQ, j2Var, sVar, 0);
                i3.a aVar5 = (i3.a) h2Var.Y();
                sVar.d0(-1426969489);
                i13 = iArr[aVar5.ordinal()];
                if (i13 != 1 || i13 == 2) {
                    f12 = CropImageView.DEFAULT_ASPECT_RATIO;
                } else {
                    if (i13 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    f12 = 1.0f;
                }
                sVar.p(false);
                Float fValueOf3 = Float.valueOf(f12);
                i3.a aVar6 = (i3.a) k1Var.getValue();
                sVar.d0(-1426969489);
                i14 = iArr[aVar6.ordinal()];
                if (i14 != 1 || i14 == 2) {
                    f13 = CropImageView.DEFAULT_ASPECT_RATIO;
                } else if (i14 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                sVar.p(false);
                Float fValueOf4 = Float.valueOf(f13);
                w1VarF = c2VarE.f();
                sVar.d0(-1324481169);
                if (w1VarF.a() == aVar4) {
                    c0VarR = new b0.g1(0);
                    i15 = 100;
                } else if (w1VarF.c() == aVar4) {
                    i15 = 100;
                    c0VarR = new b0.g1(100);
                } else {
                    i15 = 100;
                    c0VarR = b0.e.r(100, 0, null, 6);
                }
                sVar.p(false);
                i16 = i15;
                y1VarC2 = b0.g2.c(c2VarE, fValueOf3, fValueOf4, c0VarR, j2Var, sVar, 0);
                sVar = sVar;
                objQ = sVar.Q();
                gVar = l1.m.f39353a;
                if (objQ == gVar) {
                    objQ = new x0();
                    sVar.o0(objQ);
                }
                x0Var = (x0) objQ;
                z0Var.getClass();
                if (aVar == aVar4) {
                    j11 = z0Var.f31378b;
                } else {
                    j11 = z0Var.f31377a;
                }
                if (aVar == aVar4) {
                    i17 = i16;
                } else {
                    i17 = 50;
                }
                b3VarA = a0.t1.a(j11, b0.e.r(i17, 0, null, 6), null, sVar, 0, 12);
                if (z11) {
                    i24 = y0.f31329a[aVar.ordinal()];
                    if (i24 != 1 || i24 == 2) {
                        j12 = z0Var.f31379c;
                    } else {
                        if (i24 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        j12 = z0Var.f31380d;
                    }
                } else {
                    i18 = y0.f31329a[aVar.ordinal()];
                    if (i18 != 1) {
                        j12 = z0Var.f31381e;
                    } else if (i18 != 2) {
                        j12 = z0Var.f31383g;
                    } else {
                        if (i18 == 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        j12 = z0Var.f31382f;
                    }
                }
                if (z11) {
                    sVar.d0(-392211906);
                    if (aVar == aVar4) {
                        i23 = i16;
                    } else {
                        i23 = 50;
                    }
                    objH = a0.t1.a(j12, b0.e.r(i23, 0, null, 6), null, sVar, 0, 12);
                    sVar.p(false);
                } else {
                    sVar.d0(-392031362);
                    objH = l1.t.H(new g2.x(j12), sVar);
                    sVar.p(false);
                }
                obj = objH;
                if (z11) {
                    i22 = y0.f31329a[aVar.ordinal()];
                    if (i22 != 1 || i22 == 2) {
                        j13 = z0Var.f31384h;
                    } else {
                        if (i22 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        j13 = z0Var.f31385i;
                    }
                } else {
                    i19 = y0.f31329a[aVar.ordinal()];
                    if (i19 != 1) {
                        j13 = z0Var.f31386j;
                    } else if (i19 != 2) {
                        j13 = z0Var.f31388l;
                    } else {
                        if (i19 == 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        j13 = z0Var.f31387k;
                    }
                }
                if (z11) {
                    sVar.d0(-1725816497);
                    if (aVar == aVar4) {
                        i21 = i16;
                    } else {
                        i21 = 50;
                    }
                    objH2 = a0.t1.a(j13, b0.e.r(i21, 0, null, 6), null, sVar, 0, 12);
                    sVar.p(false);
                } else {
                    sVar.d0(-1725635953);
                    objH2 = l1.t.H(new g2.x(j13), sVar);
                    sVar.p(false);
                }
                z1.r rVarK = j0.e2.k(j0.e2.w(rVar, z1.c.f58467e, 2), f30189b);
                zF = sVar.f(obj) | sVar.f(objH2) | sVar.f(b3VarA) | sVar.f(y1VarC) | sVar.f(y1VarC2);
                objQ2 = sVar.Q();
                if (zF || objQ2 == gVar) {
                    objQ2 = new b1(obj, objH2, b3VarA, y1VarC, y1VarC2, x0Var, 0);
                    sVar.o0(objQ2);
                }
                d0.n.b(0, (fz.c) objQ2, sVar, rVarK);
            }
            sVar.p(false);
            y1VarC = b0.g2.c(c2VarE, fValueOf, fValueOf2, c0VarQ, j2Var, sVar, 0);
            i3.a aVar7 = (i3.a) h2Var.Y();
            sVar.d0(-1426969489);
            i13 = iArr[aVar7.ordinal()];
            if (i13 != 1) {
                f12 = CropImageView.DEFAULT_ASPECT_RATIO;
            } else {
                f12 = CropImageView.DEFAULT_ASPECT_RATIO;
            }
            sVar.p(false);
            Float fValueOf5 = Float.valueOf(f12);
            i3.a aVar8 = (i3.a) k1Var.getValue();
            sVar.d0(-1426969489);
            i14 = iArr[aVar8.ordinal()];
            if (i14 != 1) {
                f13 = CropImageView.DEFAULT_ASPECT_RATIO;
            } else {
                f13 = CropImageView.DEFAULT_ASPECT_RATIO;
            }
            sVar.p(false);
            Float fValueOf6 = Float.valueOf(f13);
            w1VarF = c2VarE.f();
            sVar.d0(-1324481169);
            if (w1VarF.a() == aVar4) {
                c0VarR = new b0.g1(0);
                i15 = 100;
            } else if (w1VarF.c() == aVar4) {
                i15 = 100;
                c0VarR = new b0.g1(100);
            } else {
                i15 = 100;
                c0VarR = b0.e.r(100, 0, null, 6);
            }
            sVar.p(false);
            i16 = i15;
            y1VarC2 = b0.g2.c(c2VarE, fValueOf5, fValueOf6, c0VarR, j2Var, sVar, 0);
            sVar = sVar;
            objQ = sVar.Q();
            gVar = l1.m.f39353a;
            if (objQ == gVar) {
                objQ = new x0();
                sVar.o0(objQ);
            }
            x0Var = (x0) objQ;
            z0Var.getClass();
            if (aVar == aVar4) {
                j11 = z0Var.f31378b;
            } else {
                j11 = z0Var.f31377a;
            }
            if (aVar == aVar4) {
                i17 = i16;
            } else {
                i17 = 50;
            }
            b3VarA = a0.t1.a(j11, b0.e.r(i17, 0, null, 6), null, sVar, 0, 12);
            if (z11) {
                i24 = y0.f31329a[aVar.ordinal()];
                if (i24 != 1) {
                    j12 = z0Var.f31379c;
                } else {
                    j12 = z0Var.f31379c;
                }
            } else {
                i18 = y0.f31329a[aVar.ordinal()];
                if (i18 != 1) {
                    j12 = z0Var.f31381e;
                } else if (i18 != 2) {
                    j12 = z0Var.f31383g;
                } else {
                    if (i18 == 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    j12 = z0Var.f31382f;
                }
            }
            if (z11) {
                sVar.d0(-392211906);
                if (aVar == aVar4) {
                    i23 = i16;
                } else {
                    i23 = 50;
                }
                objH = a0.t1.a(j12, b0.e.r(i23, 0, null, 6), null, sVar, 0, 12);
                sVar.p(false);
            } else {
                sVar.d0(-392031362);
                objH = l1.t.H(new g2.x(j12), sVar);
                sVar.p(false);
            }
            obj = objH;
            if (z11) {
                i22 = y0.f31329a[aVar.ordinal()];
                if (i22 != 1) {
                    j13 = z0Var.f31384h;
                } else {
                    j13 = z0Var.f31384h;
                }
            } else {
                i19 = y0.f31329a[aVar.ordinal()];
                if (i19 != 1) {
                    j13 = z0Var.f31386j;
                } else if (i19 != 2) {
                    j13 = z0Var.f31388l;
                } else {
                    if (i19 == 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    j13 = z0Var.f31387k;
                }
            }
            if (z11) {
                sVar.d0(-1725816497);
                if (aVar == aVar4) {
                    i21 = i16;
                } else {
                    i21 = 50;
                }
                objH2 = a0.t1.a(j13, b0.e.r(i21, 0, null, 6), null, sVar, 0, 12);
                sVar.p(false);
            } else {
                sVar.d0(-1725635953);
                objH2 = l1.t.H(new g2.x(j13), sVar);
                sVar.p(false);
            }
            z1.r rVarK2 = j0.e2.k(j0.e2.w(rVar, z1.c.f58467e, 2), f30189b);
            zF = sVar.f(obj) | sVar.f(objH2) | sVar.f(b3VarA) | sVar.f(y1VarC) | sVar.f(y1VarC2);
            objQ2 = sVar.Q();
            if (zF) {
                objQ2 = new b1(obj, objH2, b3VarA, y1VarC, y1VarC2, x0Var, 0);
                sVar.o0(objQ2);
            } else {
                objQ2 = new b1(obj, objH2, b3VarA, y1VarC, y1VarC2, x0Var, 0);
                sVar.o0(objQ2);
            }
            d0.n.b(0, (fz.c) objQ2, sVar, rVarK2);
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new nb(z11, aVar, rVar, z0Var, i11);
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0052  */
    /* JADX WARN: Code duplicated, block: B:32:0x0058  */
    /* JADX WARN: Code duplicated, block: B:33:0x005b  */
    /* JADX WARN: Code duplicated, block: B:37:0x0062  */
    /* JADX WARN: Code duplicated, block: B:39:0x0066  */
    /* JADX WARN: Code duplicated, block: B:41:0x006e  */
    /* JADX WARN: Code duplicated, block: B:42:0x0071  */
    /* JADX WARN: Code duplicated, block: B:45:0x0077  */
    /* JADX WARN: Code duplicated, block: B:48:0x007f  */
    /* JADX WARN: Code duplicated, block: B:49:0x0081  */
    /* JADX WARN: Code duplicated, block: B:51:0x0085  */
    /* JADX WARN: Code duplicated, block: B:53:0x008c  */
    /* JADX WARN: Code duplicated, block: B:54:0x008f  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:72:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:78:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:79:0x0104  */
    /* JADX WARN: Code duplicated, block: B:82:0x010b  */
    /* JADX WARN: Code duplicated, block: B:86:0x013a  */
    /* JADX WARN: Code duplicated, block: B:88:? A[RETURN, SYNTHETIC] */
    public static final void c(i3.a aVar, fz.a aVar2, z1.r rVar, boolean z11, z0 z0Var, l1.n nVar, int i11, int i12) {
        int i13;
        z1.r rVar2;
        z0 z0VarV;
        int i14;
        int i15;
        z1.r rVar3;
        z1.r rVarE;
        z0 z0Var2;
        z1.r rVar4;
        l1.x1 x1VarT;
        int i16;
        int i17;
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-1608358065);
        if ((i11 & 6) == 0) {
            i13 = (sVar.f(aVar) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i11 & 48) == 0) {
            i13 |= sVar.h(aVar2) ? 32 : 16;
        }
        int i18 = i12 & 4;
        if (i18 == 0) {
            if ((i11 & 384) == 0) {
                rVar2 = rVar;
                i13 |= sVar.f(rVar2) ? 256 : 128;
            }
            if ((i11 & 3072) == 0) {
                if (sVar.g(z11)) {
                    i17 = 2048;
                } else {
                    i17 = 1024;
                }
                i13 |= i17;
            }
            if ((i11 & 24576) == 0) {
                if ((i12 & 16) == 0) {
                    z0VarV = z0Var;
                    if (sVar.f(z0VarV)) {
                        i16 = 16384;
                    }
                    i13 |= i16;
                } else {
                    z0VarV = z0Var;
                }
                i16 = OSSConstants.DEFAULT_BUFFER_SIZE;
                i13 |= i16;
            } else {
                z0VarV = z0Var;
            }
            if ((i12 & 32) != 0) {
                i13 |= 196608;
            } else if ((i11 & 196608) == 0) {
                if (sVar.f(null)) {
                    i14 = OSSConstants.DEFAULT_STREAM_BUFFER_SIZE;
                } else {
                    i14 = 65536;
                }
                i13 |= i14;
            }
            if ((74899 & i13) == 74898 || !sVar.F()) {
                sVar.Y();
                i15 = i11 & 1;
                rVar3 = z1.o.f58481a;
                if (i15 != 0 || sVar.C()) {
                    if (i18 != 0) {
                        rVar2 = rVar3;
                    }
                    if ((i12 & 16) != 0) {
                        i13 &= -57345;
                        z0VarV = k7.v((s1) sVar.j(v1.f31180a));
                    }
                } else {
                    sVar.W();
                    if ((i12 & 16) != 0) {
                        i13 &= -57345;
                    }
                }
                z1.r rVar5 = rVar2;
                int i19 = i13;
                z0 z0Var3 = z0VarV;
                sVar.q();
                sVar.d0(-97239746);
                if (aVar2 != null) {
                    rVarE = q0.c.e(l7.a(false, k1.a.f37429d / 2, 0L, sVar, 54, 4), aVar2, new g3.k(1), aVar, z11);
                } else {
                    rVarE = rVar3;
                }
                sVar.p(false);
                if (aVar2 != null) {
                    l1.c3 c3Var = s4.f31053a;
                    rVar3 = c5.f30080a;
                }
                b(z11, aVar, j0.c.A(rVar5.i(rVar3).i(rVarE), f30188a), z0Var3, sVar, ((i19 >> 3) & 7168) | ((i19 >> 9) & 14) | ((i19 << 3) & 112));
                z0Var2 = z0Var3;
                rVar4 = rVar5;
            } else {
                sVar.W();
                rVar4 = rVar2;
                z0Var2 = z0VarV;
            }
            x1VarT = sVar.t();
            if (x1VarT != null) {
                x1VarT.f39502d = new c1(aVar, aVar2, rVar4, z11, z0Var2, i11, i12);
            }
        }
        i13 |= 384;
        rVar2 = rVar;
        if ((i11 & 3072) == 0) {
            if (sVar.g(z11)) {
                i17 = 2048;
            } else {
                i17 = 1024;
            }
            i13 |= i17;
        }
        if ((i11 & 24576) == 0) {
            if ((i12 & 16) == 0) {
                z0VarV = z0Var;
                if (sVar.f(z0VarV)) {
                    i16 = 16384;
                }
                i13 |= i16;
            } else {
                z0VarV = z0Var;
            }
            i16 = OSSConstants.DEFAULT_BUFFER_SIZE;
            i13 |= i16;
        } else {
            z0VarV = z0Var;
        }
        if ((i12 & 32) != 0) {
            i13 |= 196608;
        } else if ((i11 & 196608) == 0) {
            if (sVar.f(null)) {
                i14 = OSSConstants.DEFAULT_STREAM_BUFFER_SIZE;
            } else {
                i14 = 65536;
            }
            i13 |= i14;
        }
        if ((74899 & i13) == 74898) {
            sVar.Y();
            i15 = i11 & 1;
            rVar3 = z1.o.f58481a;
            if (i15 != 0) {
                if (i18 != 0) {
                    rVar2 = rVar3;
                }
                if ((i12 & 16) != 0) {
                    i13 &= -57345;
                    z0VarV = k7.v((s1) sVar.j(v1.f31180a));
                }
            } else {
                if (i18 != 0) {
                    rVar2 = rVar3;
                }
                if ((i12 & 16) != 0) {
                    i13 &= -57345;
                    z0VarV = k7.v((s1) sVar.j(v1.f31180a));
                }
            }
            z1.r rVar6 = rVar2;
            int i110 = i13;
            z0 z0Var4 = z0VarV;
            sVar.q();
            sVar.d0(-97239746);
            if (aVar2 != null) {
                rVarE = q0.c.e(l7.a(false, k1.a.f37429d / 2, 0L, sVar, 54, 4), aVar2, new g3.k(1), aVar, z11);
            } else {
                rVarE = rVar3;
            }
            sVar.p(false);
            if (aVar2 != null) {
                l1.c3 c3Var2 = s4.f31053a;
                rVar3 = c5.f30080a;
            }
            b(z11, aVar, j0.c.A(rVar6.i(rVar3).i(rVarE), f30188a), z0Var4, sVar, ((i110 >> 3) & 7168) | ((i110 >> 9) & 14) | ((i110 << 3) & 112));
            z0Var2 = z0Var4;
            rVar4 = rVar6;
        } else {
            sVar.Y();
            i15 = i11 & 1;
            rVar3 = z1.o.f58481a;
            if (i15 != 0) {
                if (i18 != 0) {
                    rVar2 = rVar3;
                }
                if ((i12 & 16) != 0) {
                    i13 &= -57345;
                    z0VarV = k7.v((s1) sVar.j(v1.f31180a));
                }
            } else {
                if (i18 != 0) {
                    rVar2 = rVar3;
                }
                if ((i12 & 16) != 0) {
                    i13 &= -57345;
                    z0VarV = k7.v((s1) sVar.j(v1.f31180a));
                }
            }
            z1.r rVar7 = rVar2;
            int i111 = i13;
            z0 z0Var5 = z0VarV;
            sVar.q();
            sVar.d0(-97239746);
            if (aVar2 != null) {
                rVarE = q0.c.e(l7.a(false, k1.a.f37429d / 2, 0L, sVar, 54, 4), aVar2, new g3.k(1), aVar, z11);
            } else {
                rVarE = rVar3;
            }
            sVar.p(false);
            if (aVar2 != null) {
                l1.c3 c3Var3 = s4.f31053a;
                rVar3 = c5.f30080a;
            }
            b(z11, aVar, j0.c.A(rVar7.i(rVar3).i(rVarE), f30188a), z0Var5, sVar, ((i111 >> 3) & 7168) | ((i111 >> 9) & 14) | ((i111 << 3) & 112));
            z0Var2 = z0Var5;
            rVar4 = rVar7;
        }
        x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new c1(aVar, aVar2, rVar4, z11, z0Var2, i11, i12);
        }
    }
}
