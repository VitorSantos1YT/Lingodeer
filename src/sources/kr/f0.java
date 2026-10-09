package kr;

import com.lingodeer.data.model.CourseSentence;
import com.lingodeer.data.model.CourseWord;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class f0 extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f38457a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f38458b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g0 f38459c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f0(g0 g0Var, vy.d dVar, int i11) {
        super(2, dVar);
        this.f38457a = i11;
        this.f38459c = g0Var;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f38457a) {
            case 0:
                return new f0(this.f38459c, dVar, 0);
            case 1:
                return new f0(this.f38459c, dVar, 1);
            default:
                return new f0(this.f38459c, dVar, 2);
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        rz.b0 b0Var = (rz.b0) obj;
        vy.d dVar = (vy.d) obj2;
        switch (this.f38457a) {
            case 0:
                break;
            case 1:
                break;
        }
        return ((f0) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        Object objU;
        List<CourseWord> displayCourseWords;
        int i11;
        Object value;
        Object objA;
        Object value2;
        Object objA2;
        CourseSentence courseSentence;
        switch (this.f38457a) {
            case 0:
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                int i12 = this.f38458b;
                if (i12 == 0) {
                    com.bumptech.glide.e.F(obj);
                    g0 g0Var = this.f38459c;
                    uz.i1 i1Var = ((vt.d) g0Var.f38464b).f54200j;
                    km.s0 s0Var = new km.s0(g0Var, null, 1);
                    this.f38458b = 1;
                    if (uz.x0.i(i1Var, s0Var, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                return qy.b0.f48488a;
            case 1:
                g0 g0Var2 = this.f38459c;
                vt.n0 n0Var = g0Var2.f38463a;
                int i13 = g0Var2.f38466d;
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                int i14 = this.f38458b;
                try {
                    if (i14 == 0) {
                        com.bumptech.glide.e.F(obj);
                        gp.r rVar = new gp.r(new bh.z0(((fr.o0) n0Var).f27733a.keyLanguage, i13, (vy.d) null));
                        this.f38458b = 1;
                        objU = uz.x0.u(rVar, this);
                        if (objU == aVar2) {
                            return aVar2;
                        }
                    } else {
                        if (i14 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        com.bumptech.glide.e.F(obj);
                        objU = obj;
                    }
                    List list = (List) objU;
                    String[] strArrL = jh.h.l(i13, list.size());
                    List listK0 = strArrL != null ? ry.l.k0(strArrL) : ry.r.f50854a;
                    uz.i1 i1Var2 = g0Var2.f38467e;
                    d0 d0Var = new d0(list, listK0, 0, -1, false, 0L, 0L, ((fr.o0) n0Var).f27733a.showStoryTrans, ((fr.o0) n0Var).f27733a.audioSpeed, null, false, false, list.size() > 1, false);
                    i1Var2.getClass();
                    i1Var2.l(null, d0Var);
                    break;
                } catch (Exception unused) {
                }
                return qy.b0.f48488a;
            default:
                wy.a aVar3 = wy.a.COROUTINE_SUSPENDED;
                int i15 = this.f38458b;
                g0 g0Var3 = this.f38459c;
                if (i15 == 0) {
                    com.bumptech.glide.e.F(obj);
                } else {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    try {
                        com.bumptech.glide.e.F(obj);
                    } catch (Throwable th2) {
                        g0Var3.f38465c.f();
                        throw th2;
                    }
                }
                do {
                    av.n nVar = g0Var3.f38465c;
                    uz.i1 i1Var3 = g0Var3.f38467e;
                    av.n nVar2 = g0Var3.f38465c;
                    if (!nVar.f()) {
                        nVar2.f();
                        return qy.b0.f48488a;
                    }
                    long jC = nVar2.c();
                    long jD = nVar2.d();
                    e0 e0Var = (e0) g0Var3.f38468f.f53391a.getValue();
                    if ((e0Var instanceof d0) && jC > 0 && jD > 0) {
                        ir.b bVar = (ir.b) ry.m.t0(((d0) e0Var).f38442c, ((d0) e0Var).f38440a);
                        if (bVar == null || (courseSentence = bVar.f34557a) == null || (displayCourseWords = courseSentence.getDisplayCourseWords()) == null) {
                            displayCourseWords = ry.r.f50854a;
                        }
                        int size = displayCourseWords.size() - 1;
                        if (size >= 0) {
                            while (true) {
                                int i16 = size - 1;
                                if (jD * (size / displayCourseWords.size()) <= jC) {
                                    i11 = size;
                                } else if (i16 < 0) {
                                    i11 = -1;
                                } else {
                                    size = i16;
                                }
                            }
                        } else {
                            i11 = -1;
                        }
                        if (i11 != -1 && ((d0) e0Var).f38443d != i11) {
                            do {
                                value2 = i1Var3.getValue();
                                objA2 = (e0) value2;
                                if (objA2 instanceof d0) {
                                    objA2 = d0.a((d0) objA2, 0, i11, false, jC, jD, false, 0, null, false, false, false, false, 16279);
                                }
                            } while (!i1Var3.j(value2, objA2));
                        } else if (((d0) e0Var).f38443d != -1 && i11 == -1) {
                            do {
                                value = i1Var3.getValue();
                                objA = (e0) value;
                                if (objA instanceof d0) {
                                    objA = d0.a((d0) objA, 0, -1, false, 0L, 0L, false, 0, null, false, false, false, false, 16375);
                                }
                            } while (!i1Var3.j(value, objA));
                        }
                    }
                    this.f38458b = 1;
                } while (rz.e0.m(100L, this) != aVar3);
                return aVar3;
        }
    }
}
