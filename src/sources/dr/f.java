package dr;

import au.f0;
import au.f1;
import au.j1;
import au.l0;
import au.r0;
import au.t0;
import au.z0;
import com.lingo.lingoskill.LingoSkillApplication;
import fr.g0;
import fr.o0;
import qy.b0;
import rz.e0;
import vt.n0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n0 f23526a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j1 f23527b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t0 f23528c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final f0 f23529d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final l0 f23530e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final r0 f23531f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final z0 f23532g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final au.i f23533h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final f1 f23534i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ij.n f23535j;

    public f(n0 n0Var, j1 j1Var, t0 t0Var, f0 f0Var, l0 l0Var, r0 r0Var, z0 z0Var, au.i iVar, f1 f1Var) {
        this.f23526a = n0Var;
        this.f23527b = j1Var;
        this.f23528c = t0Var;
        this.f23529d = f0Var;
        this.f23530e = l0Var;
        this.f23531f = r0Var;
        this.f23532g = z0Var;
        this.f23533h = iVar;
        this.f23534i = f1Var;
        if (ij.n.f34440v == null) {
            synchronized (ij.n.class) {
                if (ij.n.f34440v == null) {
                    LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                    kotlin.jvm.internal.m.c(lingoSkillApplication);
                    ij.n.f34440v = new ij.n(lingoSkillApplication);
                }
            }
        }
        ij.n nVar = ij.n.f34440v;
        kotlin.jvm.internal.m.c(nVar);
        this.f23535j = nVar;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x007b  */
    /* JADX WARN: Code duplicated, block: B:30:0x0080  */
    /* JADX WARN: Code duplicated, block: B:32:0x0089  */
    /* JADX WARN: Code duplicated, block: B:35:0x009c  */
    /* JADX WARN: Code duplicated, block: B:38:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:41:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:44:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:46:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:49:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:52:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:55:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(xy.c cVar) {
        e eVar;
        Object objM;
        Object objM2;
        Object objM3;
        Object objM4;
        Object objM5;
        if (cVar instanceof e) {
            eVar = (e) cVar;
            int i11 = eVar.f23525c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                eVar.f23525c = i11 - Integer.MIN_VALUE;
            } else {
                eVar = new e(this, cVar);
            }
        } else {
            eVar = new e(this, cVar);
        }
        Object obj = eVar.f23523a;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i12 = eVar.f23525c;
        int i13 = 2;
        vy.d dVar = null;
        n0 n0Var = this.f23526a;
        b0 b0Var = b0.f48488a;
        switch (i12) {
            case 0:
                com.bumptech.glide.e.F(obj);
                if (!((o0) n0Var).f27733a.hasMergedGreenDao) {
                    d dVar2 = new d(this, dVar, i13);
                    eVar.f23525c = 1;
                    if (e0.l(dVar2, eVar) != aVar) {
                        eVar.f23525c = 2;
                        yz.f fVar = rz.o0.f50940a;
                        objM = e0.M(yz.e.f58387a, new g0(7, (o0) n0Var, dVar), eVar);
                        if (objM != aVar) {
                            objM = b0Var;
                        }
                        if (objM != aVar) {
                            if (!((o0) n0Var).f27733a.hasMergedMedal) {
                                if (!((o0) n0Var).f27733a.hasMergedOthers) {
                                    eVar.f23525c = 5;
                                    yz.f fVar2 = rz.o0.f50940a;
                                    objM4 = e0.M(yz.e.f58387a, new d(this, dVar, 0), eVar);
                                    if (objM4 != aVar) {
                                        objM4 = b0Var;
                                    }
                                    if (objM4 != aVar) {
                                        eVar.f23525c = 6;
                                        yz.f fVar3 = rz.o0.f50940a;
                                        objM5 = e0.M(yz.e.f58387a, new g0(9, (o0) n0Var, dVar), eVar);
                                        if (objM5 != aVar) {
                                            objM5 = b0Var;
                                        }
                                        if (objM5 == aVar) {
                                        }
                                    }
                                }
                            }
                            eVar.f23525c = 3;
                            yz.f fVar4 = rz.o0.f50940a;
                            objM2 = e0.M(yz.e.f58387a, new c(this, null), eVar);
                            if (objM2 != aVar) {
                                objM2 = b0Var;
                            }
                            if (objM2 != aVar) {
                                eVar.f23525c = 4;
                                yz.f fVar5 = rz.o0.f50940a;
                                objM3 = e0.M(yz.e.f58387a, new g0(8, (o0) n0Var, dVar), eVar);
                                if (objM3 != aVar) {
                                    objM3 = b0Var;
                                }
                                if (objM3 != aVar) {
                                    if (!((o0) n0Var).f27733a.hasMergedOthers) {
                                        eVar.f23525c = 5;
                                        yz.f fVar6 = rz.o0.f50940a;
                                        objM4 = e0.M(yz.e.f58387a, new d(this, dVar, 0), eVar);
                                        if (objM4 != aVar) {
                                            objM4 = b0Var;
                                        }
                                        if (objM4 != aVar) {
                                            eVar.f23525c = 6;
                                            yz.f fVar7 = rz.o0.f50940a;
                                            objM5 = e0.M(yz.e.f58387a, new g0(9, (o0) n0Var, dVar), eVar);
                                            if (objM5 != aVar) {
                                                objM5 = b0Var;
                                            }
                                            if (objM5 == aVar) {
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    if (!((o0) n0Var).f27733a.hasMergedMedal) {
                        if (!((o0) n0Var).f27733a.hasMergedOthers) {
                            eVar.f23525c = 5;
                            yz.f fVar8 = rz.o0.f50940a;
                            objM4 = e0.M(yz.e.f58387a, new d(this, dVar, 0), eVar);
                            if (objM4 != aVar) {
                                objM4 = b0Var;
                            }
                            if (objM4 != aVar) {
                                eVar.f23525c = 6;
                                yz.f fVar9 = rz.o0.f50940a;
                                objM5 = e0.M(yz.e.f58387a, new g0(9, (o0) n0Var, dVar), eVar);
                                if (objM5 != aVar) {
                                    objM5 = b0Var;
                                }
                                if (objM5 == aVar) {
                                }
                            }
                        }
                    }
                    eVar.f23525c = 3;
                    yz.f fVar10 = rz.o0.f50940a;
                    objM2 = e0.M(yz.e.f58387a, new c(this, null), eVar);
                    if (objM2 != aVar) {
                        objM2 = b0Var;
                    }
                    if (objM2 != aVar) {
                        eVar.f23525c = 4;
                        yz.f fVar11 = rz.o0.f50940a;
                        objM3 = e0.M(yz.e.f58387a, new g0(8, (o0) n0Var, dVar), eVar);
                        if (objM3 != aVar) {
                            objM3 = b0Var;
                        }
                        if (objM3 != aVar) {
                            if (!((o0) n0Var).f27733a.hasMergedOthers) {
                                eVar.f23525c = 5;
                                yz.f fVar12 = rz.o0.f50940a;
                                objM4 = e0.M(yz.e.f58387a, new d(this, dVar, 0), eVar);
                                if (objM4 != aVar) {
                                    objM4 = b0Var;
                                }
                                if (objM4 != aVar) {
                                    eVar.f23525c = 6;
                                    yz.f fVar13 = rz.o0.f50940a;
                                    objM5 = e0.M(yz.e.f58387a, new g0(9, (o0) n0Var, dVar), eVar);
                                    if (objM5 != aVar) {
                                        objM5 = b0Var;
                                    }
                                    if (objM5 == aVar) {
                                    }
                                }
                            }
                        }
                    }
                }
            case 1:
                com.bumptech.glide.e.F(obj);
                eVar.f23525c = 2;
                yz.f fVar14 = rz.o0.f50940a;
                objM = e0.M(yz.e.f58387a, new g0(7, (o0) n0Var, dVar), eVar);
                if (objM != aVar) {
                    objM = b0Var;
                }
                if (objM != aVar) {
                    if (!((o0) n0Var).f27733a.hasMergedMedal) {
                        if (!((o0) n0Var).f27733a.hasMergedOthers) {
                            eVar.f23525c = 5;
                            yz.f fVar15 = rz.o0.f50940a;
                            objM4 = e0.M(yz.e.f58387a, new d(this, dVar, 0), eVar);
                            if (objM4 != aVar) {
                                objM4 = b0Var;
                            }
                            if (objM4 != aVar) {
                                eVar.f23525c = 6;
                                yz.f fVar16 = rz.o0.f50940a;
                                objM5 = e0.M(yz.e.f58387a, new g0(9, (o0) n0Var, dVar), eVar);
                                if (objM5 != aVar) {
                                    objM5 = b0Var;
                                }
                                if (objM5 == aVar) {
                                }
                            }
                        }
                    }
                    eVar.f23525c = 3;
                    yz.f fVar17 = rz.o0.f50940a;
                    objM2 = e0.M(yz.e.f58387a, new c(this, null), eVar);
                    if (objM2 != aVar) {
                        objM2 = b0Var;
                    }
                    if (objM2 != aVar) {
                        eVar.f23525c = 4;
                        yz.f fVar18 = rz.o0.f50940a;
                        objM3 = e0.M(yz.e.f58387a, new g0(8, (o0) n0Var, dVar), eVar);
                        if (objM3 != aVar) {
                            objM3 = b0Var;
                        }
                        if (objM3 != aVar) {
                            if (!((o0) n0Var).f27733a.hasMergedOthers) {
                                eVar.f23525c = 5;
                                yz.f fVar19 = rz.o0.f50940a;
                                objM4 = e0.M(yz.e.f58387a, new d(this, dVar, 0), eVar);
                                if (objM4 != aVar) {
                                    objM4 = b0Var;
                                }
                                if (objM4 != aVar) {
                                    eVar.f23525c = 6;
                                    yz.f fVar110 = rz.o0.f50940a;
                                    objM5 = e0.M(yz.e.f58387a, new g0(9, (o0) n0Var, dVar), eVar);
                                    if (objM5 != aVar) {
                                        objM5 = b0Var;
                                    }
                                    if (objM5 == aVar) {
                                    }
                                }
                            }
                        }
                    }
                }
            case 2:
                com.bumptech.glide.e.F(obj);
                if (!((o0) n0Var).f27733a.hasMergedMedal) {
                    if (!((o0) n0Var).f27733a.hasMergedOthers) {
                        eVar.f23525c = 5;
                        yz.f fVar111 = rz.o0.f50940a;
                        objM4 = e0.M(yz.e.f58387a, new d(this, dVar, 0), eVar);
                        if (objM4 != aVar) {
                            objM4 = b0Var;
                        }
                        if (objM4 != aVar) {
                            eVar.f23525c = 6;
                            yz.f fVar112 = rz.o0.f50940a;
                            objM5 = e0.M(yz.e.f58387a, new g0(9, (o0) n0Var, dVar), eVar);
                            if (objM5 != aVar) {
                                objM5 = b0Var;
                            }
                            if (objM5 == aVar) {
                            }
                        }
                    }
                }
                eVar.f23525c = 3;
                yz.f fVar113 = rz.o0.f50940a;
                objM2 = e0.M(yz.e.f58387a, new c(this, null), eVar);
                if (objM2 != aVar) {
                    objM2 = b0Var;
                }
                if (objM2 != aVar) {
                    eVar.f23525c = 4;
                    yz.f fVar114 = rz.o0.f50940a;
                    objM3 = e0.M(yz.e.f58387a, new g0(8, (o0) n0Var, dVar), eVar);
                    if (objM3 != aVar) {
                        objM3 = b0Var;
                    }
                    if (objM3 != aVar) {
                        if (!((o0) n0Var).f27733a.hasMergedOthers) {
                            eVar.f23525c = 5;
                            yz.f fVar115 = rz.o0.f50940a;
                            objM4 = e0.M(yz.e.f58387a, new d(this, dVar, 0), eVar);
                            if (objM4 != aVar) {
                                objM4 = b0Var;
                            }
                            if (objM4 != aVar) {
                                eVar.f23525c = 6;
                                yz.f fVar116 = rz.o0.f50940a;
                                objM5 = e0.M(yz.e.f58387a, new g0(9, (o0) n0Var, dVar), eVar);
                                if (objM5 != aVar) {
                                    objM5 = b0Var;
                                }
                                if (objM5 == aVar) {
                                }
                            }
                        }
                    }
                }
            case 3:
                com.bumptech.glide.e.F(obj);
                eVar.f23525c = 4;
                yz.f fVar117 = rz.o0.f50940a;
                objM3 = e0.M(yz.e.f58387a, new g0(8, (o0) n0Var, dVar), eVar);
                if (objM3 != aVar) {
                    objM3 = b0Var;
                }
                if (objM3 != aVar) {
                    if (!((o0) n0Var).f27733a.hasMergedOthers) {
                        eVar.f23525c = 5;
                        yz.f fVar118 = rz.o0.f50940a;
                        objM4 = e0.M(yz.e.f58387a, new d(this, dVar, 0), eVar);
                        if (objM4 != aVar) {
                            objM4 = b0Var;
                        }
                        if (objM4 != aVar) {
                            eVar.f23525c = 6;
                            yz.f fVar119 = rz.o0.f50940a;
                            objM5 = e0.M(yz.e.f58387a, new g0(9, (o0) n0Var, dVar), eVar);
                            if (objM5 != aVar) {
                                objM5 = b0Var;
                            }
                            if (objM5 == aVar) {
                            }
                        }
                    }
                }
            case 4:
                com.bumptech.glide.e.F(obj);
                if (!((o0) n0Var).f27733a.hasMergedOthers) {
                    eVar.f23525c = 5;
                    yz.f fVar1110 = rz.o0.f50940a;
                    objM4 = e0.M(yz.e.f58387a, new d(this, dVar, 0), eVar);
                    if (objM4 != aVar) {
                        objM4 = b0Var;
                    }
                    if (objM4 != aVar) {
                        eVar.f23525c = 6;
                        yz.f fVar1111 = rz.o0.f50940a;
                        objM5 = e0.M(yz.e.f58387a, new g0(9, (o0) n0Var, dVar), eVar);
                        if (objM5 != aVar) {
                            objM5 = b0Var;
                        }
                        if (objM5 == aVar) {
                        }
                    }
                }
            case 5:
                com.bumptech.glide.e.F(obj);
                eVar.f23525c = 6;
                yz.f fVar1112 = rz.o0.f50940a;
                objM5 = e0.M(yz.e.f58387a, new g0(9, (o0) n0Var, dVar), eVar);
                if (objM5 != aVar) {
                    objM5 = b0Var;
                }
                return objM5 == aVar ? aVar : b0Var;
            case 6:
                com.bumptech.glide.e.F(obj);
                return b0Var;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
