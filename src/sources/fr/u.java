package fr;

import com.lingodeer.data.model.CourseQuestionPreference;
import com.lingodeer.data.model.CourseQuestionPreferencePayload;
import com.lingodeer.database.model.SubLearnProgressEntity;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class u implements uz.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27873a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f27874b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f27875c;

    public /* synthetic */ u(Object obj, int i11, int i12) {
        this.f27873a = i12;
        this.f27874b = obj;
        this.f27875c = i11;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0071  */
    /* JADX WARN: Code duplicated, block: B:48:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:65:0x011e  */
    /* JADX WARN: Code duplicated, block: B:9:0x0018  */
    @Override // uz.j
    public final Object emit(Object obj, vy.d dVar) {
        t tVar;
        n9.m0 m0Var;
        wt.p pVar;
        vz.j jVar;
        switch (this.f27873a) {
            case 0:
                if (dVar instanceof t) {
                    tVar = (t) dVar;
                    int i11 = tVar.f27843b;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        tVar.f27843b = i11 - Integer.MIN_VALUE;
                    } else {
                        tVar = new t(this, dVar);
                    }
                } else {
                    tVar = new t(this, dVar);
                }
                Object obj2 = tVar.f27842a;
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                int i12 = tVar.f27843b;
                if (i12 == 0) {
                    com.bumptech.glide.e.F(obj2);
                    uz.j jVar2 = (uz.j) this.f27874b;
                    SubLearnProgressEntity subLearnProgressEntity = (SubLearnProgressEntity) obj;
                    List<CourseQuestionPreference> preferences = CourseQuestionPreferencePayload.Companion.parse(subLearnProgressEntity != null ? subLearnProgressEntity.getProgress() : null).toPreferences(this.f27875c);
                    tVar.f27843b = 1;
                    if (jVar2.emit(preferences, tVar) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj2);
                }
                return qy.b0.f48488a;
            case 1:
                if (dVar instanceof n9.m0) {
                    m0Var = (n9.m0) dVar;
                    int i13 = m0Var.f43641b;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        m0Var.f43641b = i13 - Integer.MIN_VALUE;
                    } else {
                        m0Var = new n9.m0(this, dVar);
                    }
                } else {
                    m0Var = new n9.m0(this, dVar);
                }
                Object obj3 = m0Var.f43640a;
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                int i14 = m0Var.f43641b;
                if (i14 == 0) {
                    com.bumptech.glide.e.F(obj3);
                    uz.j jVar3 = (uz.j) this.f27874b;
                    n9.n nVar = new n9.n(this.f27875c, (n9.i2) obj);
                    m0Var.f43641b = 1;
                    if (jVar3.emit(nVar, m0Var) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj3);
                }
                return qy.b0.f48488a;
            case 2:
                if (dVar instanceof wt.p) {
                    pVar = (wt.p) dVar;
                    int i15 = pVar.f55342b;
                    if ((i15 & Integer.MIN_VALUE) != 0) {
                        pVar.f55342b = i15 - Integer.MIN_VALUE;
                    } else {
                        pVar = new wt.p(this, dVar);
                    }
                } else {
                    pVar = new wt.p(this, dVar);
                }
                Object obj4 = pVar.f55341a;
                wy.a aVar3 = wy.a.COROUTINE_SUSPENDED;
                int i16 = pVar.f55342b;
                if (i16 == 0) {
                    com.bumptech.glide.e.F(obj4);
                    uz.j jVar4 = (uz.j) this.f27874b;
                    List listU0 = ry.m.U0(ry.m.S0(ry.m.S0(ns.o.S((List) obj), new ua.e(3)), new ua.e(4)), this.f27875c);
                    pVar.f55342b = 1;
                    if (jVar4.emit(listU0, pVar) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj4);
                }
                return qy.b0.f48488a;
            default:
                if (dVar instanceof vz.j) {
                    jVar = (vz.j) dVar;
                    int i17 = jVar.f54349c;
                    if ((i17 & Integer.MIN_VALUE) != 0) {
                        jVar.f54349c = i17 - Integer.MIN_VALUE;
                    } else {
                        jVar = new vz.j(this, dVar);
                    }
                } else {
                    jVar = new vz.j(this, dVar);
                }
                Object obj5 = jVar.f54347a;
                wy.a aVar4 = wy.a.COROUTINE_SUSPENDED;
                int i18 = jVar.f54349c;
                if (i18 != 0) {
                    if (i18 == 1) {
                        com.bumptech.glide.e.F(obj5);
                    } else {
                        if (i18 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        com.bumptech.glide.e.F(obj5);
                    }
                    return qy.b0.f48488a;
                }
                com.bumptech.glide.e.F(obj5);
                tz.h hVar = (tz.h) this.f27874b;
                ry.v vVar = new ry.v(this.f27875c, obj);
                jVar.f54349c = 1;
                if (hVar.f(vVar, jVar) == aVar4) {
                    return aVar4;
                }
                jVar.f54349c = 2;
                if (rz.e0.P(jVar) == aVar4) {
                    return aVar4;
                }
                return qy.b0.f48488a;
        }
    }
}
