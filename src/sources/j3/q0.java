package j3;

import fr.j3;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long f35770a = j3.A(14);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f35771b = j3.A(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final long f35772c = g2.x.f28621h;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final u3.o f35773d;

    static {
        long j11 = g2.x.f28615b;
        f35773d = j11 != 16 ? new u3.c(j11) : u3.n.f52756a;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0170 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:103:0x0172  */
    /* JADX WARN: Code duplicated, block: B:106:0x0177 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:113:0x0187  */
    /* JADX WARN: Code duplicated, block: B:115:0x018c  */
    /* JADX WARN: Code duplicated, block: B:116:0x018f  */
    /* JADX WARN: Code duplicated, block: B:118:0x0193  */
    /* JADX WARN: Code duplicated, block: B:119:0x0196  */
    /* JADX WARN: Code duplicated, block: B:121:0x019a  */
    /* JADX WARN: Code duplicated, block: B:122:0x019d  */
    /* JADX WARN: Code duplicated, block: B:124:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:126:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:129:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:131:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:133:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:134:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:137:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:138:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:141:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:142:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:145:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:146:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:148:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:149:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:152:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:154:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:80:0x0112  */
    /* JADX WARN: Code duplicated, block: B:82:0x0116  */
    /* JADX WARN: Code duplicated, block: B:84:0x0125  */
    /* JADX WARN: Code duplicated, block: B:85:0x012b  */
    /* JADX WARN: Code duplicated, block: B:86:0x012d  */
    /* JADX WARN: Code duplicated, block: B:88:0x0133  */
    /* JADX WARN: Code duplicated, block: B:89:0x013d  */
    /* JADX WARN: Code duplicated, block: B:91:0x0143  */
    /* JADX WARN: Code duplicated, block: B:93:0x0147  */
    /* JADX WARN: Code duplicated, block: B:96:0x0155  */
    public static final p0 a(p0 p0Var, long j11, g2.t tVar, float f5, long j12, n3.s sVar, n3.o oVar, n3.p pVar, n3.i iVar, String str, long j13, u3.a aVar, u3.p pVar2, q3.b bVar, long j14, u3.l lVar, g2.v0 v0Var, g0 g0Var, i2.e eVar) {
        u3.a aVar2;
        g2.v0 v0Var2;
        g0 g0Var2;
        i2.e eVar2;
        u3.n nVar;
        u3.o cVar;
        u3.o oVar2;
        boolean z11;
        long j15;
        n3.s sVar2;
        n3.o oVar3;
        u3.p pVar3;
        q3.b bVar2;
        long j16;
        u3.l lVar2;
        g2.v0 v0Var3;
        g0 g0Var3;
        long jU;
        n3.p pVar4 = pVar;
        n3.i iVar2 = iVar;
        String str2 = str;
        long j17 = j13;
        v3.p[] pVarArr = v3.o.f53500b;
        long j18 = j12 & 1095216660480L;
        if ((j18 == 0 || v3.o.a(j12, p0Var.f35755b)) && ((tVar != null || j11 == 16 || g2.x.d(j11, p0Var.f35754a.b())) && ((oVar == null || oVar.equals(p0Var.f35757d)) && ((sVar == null || sVar.equals(p0Var.f35756c)) && ((iVar2 == null || iVar2 == p0Var.f35759f) && (((j17 & 1095216660480L) == 0 || v3.o.a(j17, p0Var.f35761h)) && ((lVar == null || lVar.equals(p0Var.m)) && kotlin.jvm.internal.m.a(tVar, p0Var.f35754a.c()) && ((tVar == null || f5 == p0Var.f35754a.a()) && ((pVar4 == null || pVar4.equals(p0Var.f35758e)) && (str2 == null || str2.equals(p0Var.f35760g))))))))))) {
            if (aVar != null) {
                aVar2 = aVar;
                if (aVar2.equals(p0Var.f35762i)) {
                }
                nVar = u3.n.f52756a;
                if (tVar != null) {
                    if (tVar instanceof g2.y0) {
                        jU = se.p.U(((g2.y0) tVar).f28628a, f5);
                        if (jU != 16) {
                            cVar = new u3.c(jU);
                        } else {
                            cVar = nVar;
                        }
                    } else {
                        if (!(tVar instanceof g2.u0)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        cVar = new u3.b((g2.u0) tVar, f5);
                    }
                } else if (j11 != 16) {
                    cVar = new u3.c(j11);
                } else {
                    cVar = nVar;
                }
                oVar2 = p0Var.f35754a;
                oVar2.getClass();
                z11 = cVar instanceof u3.b;
                if (!z11 && (oVar2 instanceof u3.b)) {
                    u3.b bVar3 = (u3.b) cVar;
                    g2.u0 u0Var = bVar3.f52734a;
                    float f11 = bVar3.f52735b;
                    if (Float.isNaN(f11)) {
                        f11 = ((u3.b) oVar2).f52735b;
                    }
                    cVar = new u3.b(u0Var, f11);
                } else if ((z11 || (oVar2 instanceof u3.b)) && ((!z11 && (oVar2 instanceof u3.b)) || cVar.equals(nVar))) {
                }
                if (iVar2 == null) {
                    iVar2 = p0Var.f35759f;
                }
                if (j18 == 0) {
                    j15 = p0Var.f35755b;
                } else {
                    j15 = j12;
                }
                if (sVar == null) {
                    sVar2 = p0Var.f35756c;
                } else {
                    sVar2 = sVar;
                }
                if (oVar == null) {
                    oVar3 = p0Var.f35757d;
                } else {
                    oVar3 = oVar;
                }
                if (pVar4 == null) {
                    pVar4 = p0Var.f35758e;
                }
                if (str2 == null) {
                    str2 = p0Var.f35760g;
                }
                if ((j17 & 1095216660480L) == 0) {
                    j17 = p0Var.f35761h;
                }
                if (aVar2 == null) {
                    aVar2 = p0Var.f35762i;
                }
                if (pVar2 == null) {
                    pVar3 = p0Var.f35763j;
                } else {
                    pVar3 = pVar2;
                }
                long j19 = j15;
                if (bVar == null) {
                    bVar2 = p0Var.f35764k;
                } else {
                    bVar2 = bVar;
                }
                if (j14 != 16) {
                    j16 = j14;
                } else {
                    j16 = p0Var.f35765l;
                }
                long j21 = j16;
                if (lVar == null) {
                    lVar2 = p0Var.m;
                } else {
                    lVar2 = lVar;
                }
                if (v0Var2 == null) {
                    v0Var3 = p0Var.f35766n;
                } else {
                    v0Var3 = v0Var2;
                }
                g0Var3 = p0Var.f35767o;
                if (g0Var3 == null) {
                    g0Var3 = g0Var2;
                }
                if (eVar2 == null) {
                    eVar2 = p0Var.f35768p;
                }
                return new p0(cVar, j19, sVar2, oVar3, pVar4, iVar2, str2, j17, aVar2, pVar3, bVar2, j21, lVar2, v0Var3, g0Var3, eVar2);
            }
            aVar2 = aVar;
            if (pVar2 == null || pVar2.equals(p0Var.f35763j)) {
                if (bVar == null || bVar.equals(p0Var.f35764k)) {
                    if (j14 == 16 || g2.x.d(j14, p0Var.f35765l)) {
                        v0Var2 = v0Var;
                        if (v0Var2 == null || v0Var2.equals(p0Var.f35766n)) {
                            g0Var2 = g0Var;
                            if (g0Var2 == null || g0Var2.equals(p0Var.f35767o)) {
                                eVar2 = eVar;
                                if (eVar2 == null || eVar2.equals(p0Var.f35768p)) {
                                    return p0Var;
                                }
                            }
                        }
                        eVar2 = eVar;
                    }
                    g0Var2 = g0Var;
                    eVar2 = eVar;
                }
            }
            nVar = u3.n.f52756a;
            if (tVar != null) {
                if (tVar instanceof g2.y0) {
                    jU = se.p.U(((g2.y0) tVar).f28628a, f5);
                    if (jU != 16) {
                        cVar = new u3.c(jU);
                    } else {
                        cVar = nVar;
                    }
                } else {
                    if (!(tVar instanceof g2.u0)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    cVar = new u3.b((g2.u0) tVar, f5);
                }
            } else if (j11 != 16) {
                cVar = new u3.c(j11);
            } else {
                cVar = nVar;
            }
            oVar2 = p0Var.f35754a;
            oVar2.getClass();
            z11 = cVar instanceof u3.b;
            if (!z11) {
                cVar = z11 ? oVar2 : oVar2;
            } else if (z11) {
            }
            if (iVar2 == null) {
                iVar2 = p0Var.f35759f;
            }
            if (j18 == 0) {
                j15 = p0Var.f35755b;
            } else {
                j15 = j12;
            }
            if (sVar == null) {
                sVar2 = p0Var.f35756c;
            } else {
                sVar2 = sVar;
            }
            if (oVar == null) {
                oVar3 = p0Var.f35757d;
            } else {
                oVar3 = oVar;
            }
            if (pVar4 == null) {
                pVar4 = p0Var.f35758e;
            }
            if (str2 == null) {
                str2 = p0Var.f35760g;
            }
            if ((j17 & 1095216660480L) == 0) {
                j17 = p0Var.f35761h;
            }
            if (aVar2 == null) {
                aVar2 = p0Var.f35762i;
            }
            if (pVar2 == null) {
                pVar3 = p0Var.f35763j;
            } else {
                pVar3 = pVar2;
            }
            long j110 = j15;
            if (bVar == null) {
                bVar2 = p0Var.f35764k;
            } else {
                bVar2 = bVar;
            }
            if (j14 != 16) {
                j16 = j14;
            } else {
                j16 = p0Var.f35765l;
            }
            long j22 = j16;
            if (lVar == null) {
                lVar2 = p0Var.m;
            } else {
                lVar2 = lVar;
            }
            if (v0Var2 == null) {
                v0Var3 = p0Var.f35766n;
            } else {
                v0Var3 = v0Var2;
            }
            g0Var3 = p0Var.f35767o;
            if (g0Var3 == null) {
                g0Var3 = g0Var2;
            }
            if (eVar2 == null) {
                eVar2 = p0Var.f35768p;
            }
            return new p0(cVar, j110, sVar2, oVar3, pVar4, iVar2, str2, j17, aVar2, pVar3, bVar2, j22, lVar2, v0Var3, g0Var3, eVar2);
        }
        aVar2 = aVar;
        v0Var2 = v0Var;
        g0Var2 = g0Var;
        eVar2 = eVar;
        nVar = u3.n.f52756a;
        if (tVar != null) {
            if (tVar instanceof g2.y0) {
                jU = se.p.U(((g2.y0) tVar).f28628a, f5);
                if (jU != 16) {
                    cVar = new u3.c(jU);
                } else {
                    cVar = nVar;
                }
            } else {
                if (!(tVar instanceof g2.u0)) {
                    throw new NoWhenBranchMatchedException();
                }
                cVar = new u3.b((g2.u0) tVar, f5);
            }
        } else if (j11 != 16) {
            cVar = new u3.c(j11);
        } else {
            cVar = nVar;
        }
        oVar2 = p0Var.f35754a;
        oVar2.getClass();
        z11 = cVar instanceof u3.b;
        if (!z11) {
            if (z11) {
            }
        } else if (z11) {
        }
        if (iVar2 == null) {
            iVar2 = p0Var.f35759f;
        }
        if (j18 == 0) {
            j15 = p0Var.f35755b;
        } else {
            j15 = j12;
        }
        if (sVar == null) {
            sVar2 = p0Var.f35756c;
        } else {
            sVar2 = sVar;
        }
        if (oVar == null) {
            oVar3 = p0Var.f35757d;
        } else {
            oVar3 = oVar;
        }
        if (pVar4 == null) {
            pVar4 = p0Var.f35758e;
        }
        if (str2 == null) {
            str2 = p0Var.f35760g;
        }
        if ((j17 & 1095216660480L) == 0) {
            j17 = p0Var.f35761h;
        }
        if (aVar2 == null) {
            aVar2 = p0Var.f35762i;
        }
        if (pVar2 == null) {
            pVar3 = p0Var.f35763j;
        } else {
            pVar3 = pVar2;
        }
        long j111 = j15;
        if (bVar == null) {
            bVar2 = p0Var.f35764k;
        } else {
            bVar2 = bVar;
        }
        if (j14 != 16) {
            j16 = j14;
        } else {
            j16 = p0Var.f35765l;
        }
        long j23 = j16;
        if (lVar == null) {
            lVar2 = p0Var.m;
        } else {
            lVar2 = lVar;
        }
        if (v0Var2 == null) {
            v0Var3 = p0Var.f35766n;
        } else {
            v0Var3 = v0Var2;
        }
        g0Var3 = p0Var.f35767o;
        if (g0Var3 == null) {
            g0Var3 = g0Var2;
        }
        if (eVar2 == null) {
            eVar2 = p0Var.f35768p;
        }
        return new p0(cVar, j111, sVar2, oVar3, pVar4, iVar2, str2, j17, aVar2, pVar3, bVar2, j23, lVar2, v0Var3, g0Var3, eVar2);
    }

    public static final Object b(float f5, Object obj, Object obj2) {
        return ((double) f5) < 0.5d ? obj : obj2;
    }

    public static final long c(float f5, long j11, long j12) {
        v3.p[] pVarArr = v3.o.f53500b;
        long j13 = j11 & 1095216660480L;
        if (j13 == 0 || (1095216660480L & j12) == 0) {
            return ((v3.o) b(f5, new v3.o(j11), new v3.o(j12))).f53502a;
        }
        j3.j(j11, j12);
        return j3.L(j13, android.support.v4.media.session.a.A(v3.o.c(j11), v3.o.c(j12), f5));
    }
}
