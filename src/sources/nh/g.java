package nh;

import com.lingo.lingoskill.object.PdLesson;
import com.lingodeer.R;
import j0.t;
import j0.u;
import j0.v;
import km.x0;
import kotlin.jvm.internal.m;
import l1.n;
import l1.q1;
import l1.s;
import qy.b0;
import y2.j;
import y2.k;
import z1.o;
import z1.r;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class g implements fz.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f43792a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f43793b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ PdLesson f43794c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fz.c f43795d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fz.c f43796e;

    public /* synthetic */ g(fz.c cVar, boolean z11, PdLesson pdLesson, fz.c cVar2) {
        this.f43795d = cVar;
        this.f43793b = z11;
        this.f43794c = pdLesson;
        this.f43796e = cVar2;
    }

    @Override // fz.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f43792a) {
            case 0:
                v Card = (v) obj;
                n nVar = (n) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                m.f(Card, "$this$Card");
                s sVar = (s) nVar;
                if (sVar.T(iIntValue & 1, (iIntValue & 17) != 16)) {
                    u uVarA = t.a(j0.i.f35305c, z1.c.O, sVar, 0);
                    int iHashCode = Long.hashCode(sVar.T);
                    q1 q1VarL = sVar.l();
                    r rVarC = z1.a.c(sVar, o.f58481a);
                    k.J.getClass();
                    y2.i iVar = j.f56913b;
                    sVar.h0();
                    if (sVar.S) {
                        sVar.k(iVar);
                    } else {
                        sVar.r0();
                    }
                    l1.t.J(j.f56917f, uVarA, sVar);
                    l1.t.J(j.f56916e, q1VarL, sVar);
                    y2.h hVar = j.f56918g;
                    if (sVar.S || !m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                        defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                    }
                    l1.t.J(j.f56915d, rVarC, sVar);
                    String strE0 = ub.a.e0(sVar, R.string.listen_up);
                    final fz.c cVar = this.f43795d;
                    boolean zF = sVar.f(cVar);
                    Object objQ = sVar.Q();
                    l1.g gVar = l1.m.f39353a;
                    if (zF || objQ == gVar) {
                        objQ = new x0(cVar, 14);
                        sVar.o0(objQ);
                    }
                    i.a(R.drawable.pd_learn_index_listen, 3456, (fz.a) objQ, strE0, sVar, true, true);
                    String strE1 = ub.a.e0(sVar, R.string.speak_fluently);
                    final boolean z11 = this.f43793b;
                    final PdLesson pdLesson = this.f43794c;
                    boolean z12 = z11 || i.c(pdLesson);
                    boolean zG = sVar.g(z11) | sVar.h(pdLesson) | sVar.f(cVar);
                    final fz.c cVar2 = this.f43796e;
                    boolean zF2 = zG | sVar.f(cVar2);
                    Object objQ2 = sVar.Q();
                    if (zF2 || objQ2 == gVar) {
                        final int i11 = 1;
                        fz.a aVar = new fz.a() { // from class: nh.h
                            @Override // fz.a
                            public final Object invoke() {
                                switch (i11) {
                                    case 0:
                                        if (z11 || i.c(pdLesson)) {
                                            cVar.invoke(4);
                                        } else {
                                            cVar2.invoke("fl_keypoint");
                                        }
                                        break;
                                    case 1:
                                        if (z11 || i.c(pdLesson)) {
                                            cVar.invoke(0);
                                        } else {
                                            cVar2.invoke("fl_speaking");
                                        }
                                        break;
                                    default:
                                        if (z11 || i.c(pdLesson)) {
                                            cVar.invoke(3);
                                        } else {
                                            cVar2.invoke("fl_writing");
                                        }
                                        break;
                                }
                                return b0.f48488a;
                            }
                        };
                        sVar.o0(aVar);
                        objQ2 = aVar;
                    }
                    i.a(R.drawable.pd_learn_index_speak, 3072, (fz.a) objQ2, strE1, sVar, z12, true);
                    String strE2 = ub.a.e0(sVar, R.string.practice_on_key_points);
                    boolean z13 = z11 != 0 || i.c(pdLesson);
                    boolean zG2 = sVar.g(z11) | sVar.h(pdLesson) | sVar.f(cVar) | sVar.f(cVar2);
                    Object objQ3 = sVar.Q();
                    if (zG2 || objQ3 == gVar) {
                        final int i12 = 2;
                        fz.a aVar2 = new fz.a() { // from class: nh.h
                            @Override // fz.a
                            public final Object invoke() {
                                switch (i12) {
                                    case 0:
                                        if (z11 || i.c(pdLesson)) {
                                            cVar.invoke(4);
                                        } else {
                                            cVar2.invoke("fl_keypoint");
                                        }
                                        break;
                                    case 1:
                                        if (z11 || i.c(pdLesson)) {
                                            cVar.invoke(0);
                                        } else {
                                            cVar2.invoke("fl_speaking");
                                        }
                                        break;
                                    default:
                                        if (z11 || i.c(pdLesson)) {
                                            cVar.invoke(3);
                                        } else {
                                            cVar2.invoke("fl_writing");
                                        }
                                        break;
                                }
                                return b0.f48488a;
                            }
                        };
                        sVar.o0(aVar2);
                        objQ3 = aVar2;
                    }
                    i.a(R.drawable.pd_learn_index_dictation, 3072, (fz.a) objQ3, strE2, sVar, z13, false);
                    sVar.p(true);
                } else {
                    sVar.W();
                }
                break;
            default:
                v Card2 = (v) obj;
                n nVar2 = (n) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                m.f(Card2, "$this$Card");
                s sVar2 = (s) nVar2;
                if (sVar2.T(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    String strE3 = ub.a.e0(sVar2, R.string.grammar_ncards);
                    final boolean z14 = this.f43793b;
                    final PdLesson pdLesson2 = this.f43794c;
                    boolean z15 = z14 || i.c(pdLesson2);
                    boolean zG3 = sVar2.g(z14) | sVar2.h(pdLesson2);
                    final fz.c cVar3 = this.f43795d;
                    boolean zF3 = zG3 | sVar2.f(cVar3);
                    final fz.c cVar4 = this.f43796e;
                    boolean zF4 = zF3 | sVar2.f(cVar4);
                    Object objQ4 = sVar2.Q();
                    if (zF4 || objQ4 == l1.m.f39353a) {
                        final int i13 = 0;
                        fz.a aVar3 = new fz.a() { // from class: nh.h
                            @Override // fz.a
                            public final Object invoke() {
                                switch (i13) {
                                    case 0:
                                        if (z14 || i.c(pdLesson2)) {
                                            cVar3.invoke(4);
                                        } else {
                                            cVar4.invoke("fl_keypoint");
                                        }
                                        break;
                                    case 1:
                                        if (z14 || i.c(pdLesson2)) {
                                            cVar3.invoke(0);
                                        } else {
                                            cVar4.invoke("fl_speaking");
                                        }
                                        break;
                                    default:
                                        if (z14 || i.c(pdLesson2)) {
                                            cVar3.invoke(3);
                                        } else {
                                            cVar4.invoke("fl_writing");
                                        }
                                        break;
                                }
                                return b0.f48488a;
                            }
                        };
                        sVar2.o0(aVar3);
                        objQ4 = aVar3;
                    }
                    i.a(R.drawable.pd_learn_index_tips, 3072, (fz.a) objQ4, strE3, sVar2, z15, false);
                } else {
                    sVar2.W();
                }
                break;
        }
        return b0.f48488a;
    }

    public /* synthetic */ g(boolean z11, PdLesson pdLesson, fz.c cVar, fz.c cVar2) {
        this.f43793b = z11;
        this.f43794c = pdLesson;
        this.f43795d = cVar;
        this.f43796e = cVar2;
    }
}
