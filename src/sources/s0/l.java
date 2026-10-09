package s0;

import com.alibaba.sdk.android.oss.common.OSSConstants;
import l1.x1;
import qp.n2;
import rt.v7;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f51086a = 0;

    static {
        float f5 = 40;
        ef.e.a(f5, f5);
    }

    public static final void a(final String str, final fz.c cVar, final z1.r rVar, final boolean z11, final j3.y0 y0Var, final r0 r0Var, final q0 q0Var, final boolean z12, final int i11, final int i12, final o3.f0 f0Var, fz.c cVar2, final h0.i iVar, final g2.y0 y0Var2, final t1.d dVar, l1.n nVar, final int i13) {
        l1.s sVar;
        final fz.c cVar3;
        fz.c cVar4;
        long j11;
        l1.s sVar2 = (l1.s) nVar;
        sVar2.f0(2026950908);
        int i14 = i13 | (sVar2.f(str) ? 4 : 2) | (sVar2.h(cVar) ? 32 : 16) | (sVar2.f(rVar) ? 256 : 128) | (sVar2.g(z11) ? 2048 : 1024);
        boolean zG = sVar2.g(false);
        int i15 = OSSConstants.DEFAULT_BUFFER_SIZE;
        int i16 = i14 | (zG ? 16384 : 8192) | (sVar2.f(y0Var) ? OSSConstants.DEFAULT_STREAM_BUFFER_SIZE : 65536) | (sVar2.f(r0Var) ? 1048576 : 524288) | (sVar2.f(q0Var) ? 8388608 : 4194304) | (sVar2.g(z12) ? 67108864 : 33554432) | (sVar2.d(i11) ? 536870912 : 268435456);
        int i17 = 196608 | (sVar2.d(i12) ? 4 : 2) | (sVar2.f(f0Var) ? 32 : 16) | 384 | (sVar2.f(iVar) ? 2048 : 1024);
        if (sVar2.f(y0Var2)) {
            i15 = 16384;
        }
        int i18 = i17 | i15;
        if (sVar2.T(i16 & 1, ((i16 & 306783379) == 306783378 && (74899 & i18) == 74898) ? false : true)) {
            sVar2.Y();
            int i19 = i13 & 1;
            l1.g gVar = l1.m.f39353a;
            if (i19 == 0 || sVar2.C()) {
                Object objQ = sVar2.Q();
                if (objQ == gVar) {
                    objQ = new v7(15);
                    sVar2.o0(objQ);
                }
                cVar4 = (fz.c) objQ;
            } else {
                sVar2.W();
                cVar4 = cVar2;
            }
            sVar2.q();
            Object objQ2 = sVar2.Q();
            if (objQ2 == gVar) {
                j11 = 0;
                objQ2 = l1.t.B(new o3.w(str, 0L, 6));
                sVar2.o0(objQ2);
            } else {
                j11 = 0;
            }
            l1.b1 b1Var = (l1.b1) objQ2;
            fz.c cVar5 = cVar4;
            o3.w wVarB = o3.w.b((o3.w) b1Var.getValue(), str, j11, 6);
            boolean zF = sVar2.f(wVarB);
            Object objQ3 = sVar2.Q();
            if (zF || objQ3 == gVar) {
                objQ3 = new pv.c(11, wVarB, b1Var);
                sVar2.o0(objQ3);
            }
            l1.t.j((fz.a) objQ3, sVar2);
            boolean z13 = (i16 & 14) == 4;
            Object objQ4 = sVar2.Q();
            if (z13 || objQ4 == gVar) {
                objQ4 = l1.t.B(str);
                sVar2.o0(objQ4);
            }
            l1.b1 b1Var2 = (l1.b1) objQ4;
            o3.j jVarA = r0Var.a(z12);
            boolean z14 = !z12;
            int i21 = z12 ? 1 : i12;
            int i22 = z12 ? 1 : i11;
            boolean zF2 = sVar2.f(b1Var2) | ((i16 & 112) == 32);
            Object objQ5 = sVar2.Q();
            if (zF2 || objQ5 == gVar) {
                objQ5 = new pr.a0(cVar, b1Var, b1Var2, 16);
                sVar2.o0(objQ5);
            }
            int i23 = i18 << 9;
            sVar = sVar2;
            o0.g(wVarB, (fz.c) objQ5, rVar, y0Var, f0Var, cVar5, iVar, y0Var2, z14, i22, i21, jVarA, q0Var, z11, false, dVar, sVar, (i16 & 896) | ((i16 >> 6) & 7168) | (i23 & 57344) | 196608 | (3670016 & i23) | (i23 & 29360128), ((i16 >> 15) & 896) | (i16 & 7168) | (i16 & 57344) | 196608);
            cVar3 = cVar5;
        } else {
            sVar = sVar2;
            sVar.W();
            cVar3 = cVar2;
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new fz.e(str, cVar, rVar, z11, y0Var, r0Var, q0Var, z12, i11, i12, f0Var, cVar3, iVar, y0Var2, dVar, i13) { // from class: s0.j
                public final /* synthetic */ boolean H;
                public final /* synthetic */ int K;
                public final /* synthetic */ int L;
                public final /* synthetic */ o3.f0 M;
                public final /* synthetic */ fz.c N;
                public final /* synthetic */ h0.i O;
                public final /* synthetic */ g2.y0 P;
                public final /* synthetic */ t1.d Q;

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ String f51061a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ fz.c f51062b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ z1.r f51063c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ boolean f51064d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final /* synthetic */ j3.y0 f51065e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public final /* synthetic */ r0 f51066f;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                public final /* synthetic */ q0 f51067t;

                @Override // fz.e
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM = l1.t.M(1);
                    l.a(this.f51061a, this.f51062b, this.f51063c, this.f51064d, this.f51065e, this.f51066f, this.f51067t, this.H, this.K, this.L, this.M, this.N, this.O, this.P, this.Q, (l1.n) obj, iM);
                    return qy.b0.f48488a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0128  */
    /* JADX WARN: Code duplicated, block: B:103:0x0132  */
    /* JADX WARN: Code duplicated, block: B:104:0x0135  */
    /* JADX WARN: Code duplicated, block: B:108:0x0144  */
    /* JADX WARN: Code duplicated, block: B:109:0x0147  */
    /* JADX WARN: Code duplicated, block: B:111:0x014f  */
    /* JADX WARN: Code duplicated, block: B:112:0x0152  */
    /* JADX WARN: Code duplicated, block: B:116:0x015e  */
    /* JADX WARN: Code duplicated, block: B:117:0x0165  */
    /* JADX WARN: Code duplicated, block: B:119:0x016f  */
    /* JADX WARN: Code duplicated, block: B:127:0x0191  */
    /* JADX WARN: Code duplicated, block: B:130:0x019b  */
    /* JADX WARN: Code duplicated, block: B:140:0x01d6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:141:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:143:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:145:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:148:0x01e7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:149:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:150:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:152:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:154:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:155:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:157:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:158:0x0202  */
    /* JADX WARN: Code duplicated, block: B:161:0x020a  */
    /* JADX WARN: Code duplicated, block: B:162:0x0217  */
    /* JADX WARN: Code duplicated, block: B:165:0x021e  */
    /* JADX WARN: Code duplicated, block: B:166:0x0220  */
    /* JADX WARN: Code duplicated, block: B:169:0x0226  */
    /* JADX WARN: Code duplicated, block: B:170:0x0232  */
    /* JADX WARN: Code duplicated, block: B:174:0x0255  */
    /* JADX WARN: Code duplicated, block: B:175:0x0258  */
    /* JADX WARN: Code duplicated, block: B:177:0x025c  */
    /* JADX WARN: Code duplicated, block: B:178:0x025f  */
    /* JADX WARN: Code duplicated, block: B:181:0x0268  */
    /* JADX WARN: Code duplicated, block: B:182:0x026b  */
    /* JADX WARN: Code duplicated, block: B:185:0x0275  */
    /* JADX WARN: Code duplicated, block: B:189:0x0281  */
    /* JADX WARN: Code duplicated, block: B:191:0x02dc  */
    /* JADX WARN: Code duplicated, block: B:194:0x02f6  */
    /* JADX WARN: Code duplicated, block: B:196:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:0x0086  */
    /* JADX WARN: Code duplicated, block: B:48:0x008c  */
    /* JADX WARN: Code duplicated, block: B:49:0x008f  */
    /* JADX WARN: Code duplicated, block: B:53:0x0099  */
    /* JADX WARN: Code duplicated, block: B:55:0x009f  */
    /* JADX WARN: Code duplicated, block: B:56:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:60:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:61:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:65:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:66:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:70:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:71:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:75:0x00db  */
    /* JADX WARN: Code duplicated, block: B:76:0x00de  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:88:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:91:0x0104  */
    /* JADX WARN: Code duplicated, block: B:92:0x010c  */
    /* JADX WARN: Code duplicated, block: B:94:0x0116  */
    /* JADX WARN: Code duplicated, block: B:95:0x0119  */
    /* JADX WARN: Code duplicated, block: B:99:0x0121  */
    public static final void b(o3.w wVar, fz.c cVar, z1.r rVar, boolean z11, boolean z12, j3.y0 y0Var, r0 r0Var, q0 q0Var, boolean z13, int i11, int i12, o3.f0 f0Var, fz.c cVar2, h0.i iVar, g2.t tVar, t1.d dVar, l1.n nVar, int i13, int i14) {
        int i15;
        boolean z14;
        int i16;
        q0 q0Var2;
        int i17;
        int i18;
        boolean z15;
        int i19;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        int i31;
        int i32;
        int i33;
        int i34;
        boolean z16;
        l1.s sVar;
        int i35;
        int i36;
        o3.f0 f0Var2;
        fz.c cVar3;
        g2.t tVar2;
        boolean z17;
        boolean z18;
        q0 q0Var3;
        h0.i iVar2;
        x1 x1VarT;
        int i37;
        l1.g gVar;
        int i38;
        int i39;
        o3.f0 f0Var3;
        Object objQ;
        g2.t y0Var2;
        fz.c cVar4;
        g2.t tVar3;
        int i40;
        boolean z19;
        int i41;
        int i42;
        boolean z20;
        boolean z21;
        Object objQ2;
        int i43;
        int i44;
        l1.s sVar2 = (l1.s) nVar;
        sVar2.f0(-971111025);
        if ((i13 & 6) == 0) {
            i15 = (sVar2.f(wVar) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= sVar2.h(cVar) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= sVar2.f(rVar) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i15 |= sVar2.g(z11) ? 2048 : 1024;
        }
        int i45 = i14 & 16;
        int i46 = OSSConstants.DEFAULT_BUFFER_SIZE;
        if (i45 == 0) {
            if ((i13 & 24576) == 0) {
                z14 = z12;
                i15 |= sVar2.g(z14) ? 16384 : 8192;
            }
            if ((i13 & 196608) == 0) {
                if (sVar2.f(y0Var)) {
                    i44 = OSSConstants.DEFAULT_STREAM_BUFFER_SIZE;
                } else {
                    i44 = 65536;
                }
                i15 |= i44;
            }
            if ((i13 & 1572864) == 0) {
                if (sVar2.f(r0Var)) {
                    i43 = 1048576;
                } else {
                    i43 = 524288;
                }
                i15 |= i43;
            }
            i16 = i14 & 128;
            if (i16 != 0) {
                i15 |= 12582912;
                q0Var2 = q0Var;
            } else {
                q0Var2 = q0Var;
                if ((i13 & 12582912) == 0) {
                    if (sVar2.f(q0Var2)) {
                        i17 = 8388608;
                    } else {
                        i17 = 4194304;
                    }
                    i15 |= i17;
                }
            }
            i18 = i14 & 256;
            if (i18 != 0) {
                i15 |= 100663296;
                z15 = z13;
            } else {
                z15 = z13;
                if ((i13 & 100663296) == 0) {
                    if (sVar2.g(z15)) {
                        i19 = 67108864;
                    } else {
                        i19 = 33554432;
                    }
                    i15 |= i19;
                }
            }
            if ((i13 & 805306368) != 0) {
                i15 |= ((i14 & 512) == 0 || !sVar2.d(i11)) ? 268435456 : 536870912;
            }
            i21 = i14 & 1024;
            if (i21 != 0) {
                i23 = 196614;
            } else {
                if (sVar2.d(i12)) {
                    i22 = 4;
                } else {
                    i22 = 2;
                }
                i23 = 196608 | i22;
            }
            i24 = i14 & 2048;
            if (i24 != 0) {
                i26 = i23 | 48;
            } else {
                if (sVar2.f(f0Var)) {
                    i25 = 32;
                } else {
                    i25 = 16;
                }
                i26 = i23 | i25;
            }
            i27 = i26;
            i28 = i15;
            i29 = i27 | 384;
            i30 = i14 & OSSConstants.DEFAULT_BUFFER_SIZE;
            if (i30 != 0) {
                i32 = i27 | 3456;
            } else {
                if (sVar2.f(iVar)) {
                    i31 = 2048;
                } else {
                    i31 = 1024;
                }
                i32 = i29 | i31;
            }
            i33 = i14 & 16384;
            if (i33 != 0) {
                i34 = i32 | 24576;
            } else {
                int i47 = i32;
                if (sVar2.f(tVar)) {
                    i46 = 16384;
                }
                i34 = i47 | i46;
            }
            if ((i28 & 306783379) == 306783378 || (i34 & 74899) != 74898) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (sVar2.T(i28 & 1, z16)) {
                sVar2.Y();
                i37 = i13 & 1;
                gVar = l1.m.f39353a;
                if (i37 != 0 || sVar2.C()) {
                    if (i45 != 0) {
                        z14 = false;
                    }
                    if (i16 != 0) {
                        q0Var2 = q0.f51140c;
                    }
                    if (i18 != 0) {
                        z15 = false;
                    }
                    if ((i14 & 512) != 0) {
                        if (z15) {
                            i38 = 1;
                        } else {
                            i38 = Integer.MAX_VALUE;
                        }
                        i28 &= -1879048193;
                    } else {
                        i38 = i11;
                    }
                    if (i21 != 0) {
                        i39 = 1;
                    } else {
                        i39 = i12;
                    }
                    if (i24 != 0) {
                        f0Var3 = o3.e0.f44674a;
                    } else {
                        f0Var3 = f0Var;
                    }
                    objQ = sVar2.Q();
                    if (objQ == gVar) {
                        objQ = new v7(15);
                        sVar2.o0(objQ);
                    }
                    fz.c cVar5 = (fz.c) objQ;
                    if (i30 != 0) {
                        iVar = null;
                    } else {
                        iVar = iVar;
                    }
                    if (i33 != 0) {
                        y0Var2 = new g2.y0(g2.x.f28615b);
                    } else {
                        y0Var2 = tVar;
                    }
                    cVar4 = cVar5;
                    tVar3 = y0Var2;
                    i12 = i39;
                    f0Var = f0Var3;
                    q0Var2 = q0Var2;
                    i40 = i28;
                    i11 = i38;
                    z15 = z15;
                    z19 = z14;
                } else {
                    sVar2.W();
                    i40 = (i14 & 512) != 0 ? i28 & (-1879048193) : i28;
                    tVar3 = tVar;
                    z19 = z14;
                    cVar4 = cVar2;
                }
                sVar2.q();
                o3.j jVarA = r0Var.a(z15);
                fz.c cVar6 = cVar4;
                g2.t tVar4 = tVar3;
                boolean z22 = !z15;
                if (z15) {
                    i41 = 1;
                } else {
                    i41 = i12;
                }
                if (z15) {
                    i42 = 1;
                } else {
                    i42 = i11;
                }
                boolean z23 = z15;
                if ((i40 & 14) == 4) {
                    z20 = true;
                } else {
                    z20 = false;
                }
                z21 = z20 | ((i40 & 112) == 32);
                objQ2 = sVar2.Q();
                if (z21 || objQ2 == gVar) {
                    objQ2 = new n2(11, wVar, cVar);
                    sVar2.o0(objQ2);
                }
                int i48 = i34 << 9;
                sVar = sVar2;
                h0.i iVar3 = iVar;
                o0.g(wVar, (fz.c) objQ2, rVar, y0Var, f0Var, cVar6, iVar3, tVar4, z22, i42, i41, jVarA, q0Var2, z11, z19, dVar, sVar, (i40 & 910) | ((i40 >> 6) & 7168) | (i48 & 57344) | 196608 | (i48 & 3670016) | (i48 & 29360128), (i40 & 7168) | ((i40 >> 15) & 896) | (i40 & 57344) | 196608);
                tVar2 = tVar4;
                q0Var3 = q0Var2;
                z17 = z19;
                cVar3 = cVar6;
                i35 = i11;
                i36 = i12;
                z18 = z23;
                f0Var2 = f0Var;
                iVar2 = iVar3;
            } else {
                sVar = sVar2;
                sVar.W();
                i35 = i11;
                i36 = i12;
                f0Var2 = f0Var;
                cVar3 = cVar2;
                tVar2 = tVar;
                z17 = z14;
                z18 = z15;
                q0Var3 = q0Var2;
                iVar2 = iVar;
            }
            x1VarT = sVar.t();
            if (x1VarT != null) {
                x1VarT.f39502d = new k(wVar, cVar, rVar, z11, z17, y0Var, r0Var, q0Var3, z18, i35, i36, f0Var2, cVar3, iVar2, tVar2, dVar, i13, i14);
            }
        }
        i15 |= 24576;
        z14 = z12;
        if ((i13 & 196608) == 0) {
            if (sVar2.f(y0Var)) {
                i44 = OSSConstants.DEFAULT_STREAM_BUFFER_SIZE;
            } else {
                i44 = 65536;
            }
            i15 |= i44;
        }
        if ((i13 & 1572864) == 0) {
            if (sVar2.f(r0Var)) {
                i43 = 1048576;
            } else {
                i43 = 524288;
            }
            i15 |= i43;
        }
        i16 = i14 & 128;
        if (i16 != 0) {
            i15 |= 12582912;
            q0Var2 = q0Var;
        } else {
            q0Var2 = q0Var;
            if ((i13 & 12582912) == 0) {
                if (sVar2.f(q0Var2)) {
                    i17 = 8388608;
                } else {
                    i17 = 4194304;
                }
                i15 |= i17;
            }
        }
        i18 = i14 & 256;
        if (i18 != 0) {
            i15 |= 100663296;
            z15 = z13;
        } else {
            z15 = z13;
            if ((i13 & 100663296) == 0) {
                if (sVar2.g(z15)) {
                    i19 = 67108864;
                } else {
                    i19 = 33554432;
                }
                i15 |= i19;
            }
        }
        if ((i13 & 805306368) != 0) {
            i15 |= ((i14 & 512) == 0 || !sVar2.d(i11)) ? 268435456 : 536870912;
        }
        i21 = i14 & 1024;
        if (i21 != 0) {
            i23 = 196614;
        } else {
            if (sVar2.d(i12)) {
                i22 = 4;
            } else {
                i22 = 2;
            }
            i23 = 196608 | i22;
        }
        i24 = i14 & 2048;
        if (i24 != 0) {
            i26 = i23 | 48;
        } else {
            if (sVar2.f(f0Var)) {
                i25 = 32;
            } else {
                i25 = 16;
            }
            i26 = i23 | i25;
        }
        i27 = i26;
        i28 = i15;
        i29 = i27 | 384;
        i30 = i14 & OSSConstants.DEFAULT_BUFFER_SIZE;
        if (i30 != 0) {
            i32 = i27 | 3456;
        } else {
            if (sVar2.f(iVar)) {
                i31 = 2048;
            } else {
                i31 = 1024;
            }
            i32 = i29 | i31;
        }
        i33 = i14 & 16384;
        if (i33 != 0) {
            i34 = i32 | 24576;
        } else {
            int i49 = i32;
            if (sVar2.f(tVar)) {
                i46 = 16384;
            }
            i34 = i49 | i46;
        }
        if ((i28 & 306783379) == 306783378) {
            z16 = true;
        } else {
            z16 = true;
        }
        if (sVar2.T(i28 & 1, z16)) {
            sVar2.Y();
            i37 = i13 & 1;
            gVar = l1.m.f39353a;
            if (i37 != 0) {
                if (i45 != 0) {
                    z14 = false;
                }
                if (i16 != 0) {
                    q0Var2 = q0.f51140c;
                }
                if (i18 != 0) {
                    z15 = false;
                }
                if ((i14 & 512) != 0) {
                    if (z15) {
                        i38 = 1;
                    } else {
                        i38 = Integer.MAX_VALUE;
                    }
                    i28 &= -1879048193;
                } else {
                    i38 = i11;
                }
                if (i21 != 0) {
                    i39 = 1;
                } else {
                    i39 = i12;
                }
                if (i24 != 0) {
                    f0Var3 = o3.e0.f44674a;
                } else {
                    f0Var3 = f0Var;
                }
                objQ = sVar2.Q();
                if (objQ == gVar) {
                    objQ = new v7(15);
                    sVar2.o0(objQ);
                }
                fz.c cVar7 = (fz.c) objQ;
                if (i30 != 0) {
                    iVar = null;
                } else {
                    iVar = iVar;
                }
                if (i33 != 0) {
                    y0Var2 = new g2.y0(g2.x.f28615b);
                } else {
                    y0Var2 = tVar;
                }
                cVar4 = cVar7;
                tVar3 = y0Var2;
                i12 = i39;
                f0Var = f0Var3;
                q0Var2 = q0Var2;
                i40 = i28;
                i11 = i38;
                z15 = z15;
                z19 = z14;
            } else {
                if (i45 != 0) {
                    z14 = false;
                }
                if (i16 != 0) {
                    q0Var2 = q0.f51140c;
                }
                if (i18 != 0) {
                    z15 = false;
                }
                if ((i14 & 512) != 0) {
                    if (z15) {
                        i38 = 1;
                    } else {
                        i38 = Integer.MAX_VALUE;
                    }
                    i28 &= -1879048193;
                } else {
                    i38 = i11;
                }
                if (i21 != 0) {
                    i39 = 1;
                } else {
                    i39 = i12;
                }
                if (i24 != 0) {
                    f0Var3 = o3.e0.f44674a;
                } else {
                    f0Var3 = f0Var;
                }
                objQ = sVar2.Q();
                if (objQ == gVar) {
                    objQ = new v7(15);
                    sVar2.o0(objQ);
                }
                fz.c cVar8 = (fz.c) objQ;
                if (i30 != 0) {
                    iVar = null;
                } else {
                    iVar = iVar;
                }
                if (i33 != 0) {
                    y0Var2 = new g2.y0(g2.x.f28615b);
                } else {
                    y0Var2 = tVar;
                }
                cVar4 = cVar8;
                tVar3 = y0Var2;
                i12 = i39;
                f0Var = f0Var3;
                q0Var2 = q0Var2;
                i40 = i28;
                i11 = i38;
                z15 = z15;
                z19 = z14;
            }
            sVar2.q();
            o3.j jVarA2 = r0Var.a(z15);
            fz.c cVar9 = cVar4;
            g2.t tVar5 = tVar3;
            boolean z24 = !z15;
            if (z15) {
                i41 = 1;
            } else {
                i41 = i12;
            }
            if (z15) {
                i42 = 1;
            } else {
                i42 = i11;
            }
            boolean z25 = z15;
            if ((i40 & 14) == 4) {
                z20 = true;
            } else {
                z20 = false;
            }
            z21 = z20 | ((i40 & 112) == 32);
            objQ2 = sVar2.Q();
            if (z21) {
                objQ2 = new n2(11, wVar, cVar);
                sVar2.o0(objQ2);
            } else {
                objQ2 = new n2(11, wVar, cVar);
                sVar2.o0(objQ2);
            }
            int i410 = i34 << 9;
            sVar = sVar2;
            h0.i iVar4 = iVar;
            o0.g(wVar, (fz.c) objQ2, rVar, y0Var, f0Var, cVar9, iVar4, tVar5, z24, i42, i41, jVarA2, q0Var2, z11, z19, dVar, sVar, (i40 & 910) | ((i40 >> 6) & 7168) | (i410 & 57344) | 196608 | (i410 & 3670016) | (i410 & 29360128), (i40 & 7168) | ((i40 >> 15) & 896) | (i40 & 57344) | 196608);
            tVar2 = tVar5;
            q0Var3 = q0Var2;
            z17 = z19;
            cVar3 = cVar9;
            i35 = i11;
            i36 = i12;
            z18 = z25;
            f0Var2 = f0Var;
            iVar2 = iVar4;
        } else {
            sVar = sVar2;
            sVar.W();
            i35 = i11;
            i36 = i12;
            f0Var2 = f0Var;
            cVar3 = cVar2;
            tVar2 = tVar;
            z17 = z14;
            z18 = z15;
            q0Var3 = q0Var2;
            iVar2 = iVar;
        }
        x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new k(wVar, cVar, rVar, z11, z17, y0Var, r0Var, q0Var3, z18, i35, i36, f0Var2, cVar3, iVar2, tVar2, dVar, i13, i14);
        }
    }
}
