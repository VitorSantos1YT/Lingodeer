package no;

import cf.x;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseReference;
import com.lingo.lingoskill.LingoSkillApplication;
import com.lingo.lingoskill.speak.object.PodUser;
import java.util.ArrayList;
import java.util.Objects;
import qy.b0;
import rz.e0;
import uz.x0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class m implements uz.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f43898a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ uz.j f43899b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ s f43900c;

    public /* synthetic */ m(uz.j jVar, s sVar, int i11) {
        this.f43898a = i11;
        this.f43899b = jVar;
        this.f43900c = sVar;
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:79:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:81:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:9:0x0027  */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.util.ArrayList, uz.j] */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.ArrayList, uz.j] */
    @Override // uz.j
    public final Object emit(Object obj, vy.d dVar) throws Throwable {
        l lVar;
        ArrayList arrayList;
        Object objV;
        uz.j jVar;
        int i11;
        ?? r9;
        Object obj2;
        PodUser podUser;
        p pVar;
        ArrayList arrayList2;
        Object objV2;
        uz.j jVar2;
        int i12;
        ?? r11;
        Object obj3;
        PodUser podUser2;
        int i13 = this.f43898a;
        b0 b0Var = b0.f48488a;
        uz.j jVar3 = this.f43899b;
        int i14 = 0;
        switch (i13) {
            case 0:
                if (dVar instanceof l) {
                    lVar = (l) dVar;
                    int i15 = lVar.f43893b;
                    if ((i15 & Integer.MIN_VALUE) != 0) {
                        lVar.f43893b = i15 - Integer.MIN_VALUE;
                    } else {
                        lVar = new l(this, dVar);
                    }
                } else {
                    lVar = new l(this, dVar);
                }
                Object obj4 = lVar.f43892a;
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                int i16 = lVar.f43893b;
                vy.d dVar2 = null;
                if (i16 == 0) {
                    com.bumptech.glide.e.F(obj4);
                    DataSnapshot dataSnapshot = (DataSnapshot) obj;
                    Objects.toString(dataSnapshot);
                    arrayList = new ArrayList();
                    s sVar = this.f43900c;
                    Object obj5 = null;
                    e0.F(vy.j.f54321a, new k(dataSnapshot, arrayList, sVar, dVar2, 0));
                    if (arrayList.size() > 1) {
                        ry.p.Z(arrayList, new gu.g(9));
                    }
                    LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                    r9 = obj5;
                    if (x.n().isUnloginUser()) {
                        lVar.f43895d = r9;
                        lVar.f43896e = r9;
                        lVar.f43897f = i14;
                        lVar.f43893b = 2;
                        if (jVar3.emit(arrayList, lVar) != aVar) {
                            return b0Var;
                        }
                    } else {
                        DatabaseReference databaseReference = sVar.f43916a;
                        if (databaseReference == null) {
                            kotlin.jvm.internal.m.n("mUserDb");
                            throw null;
                        }
                        uz.c cVarH = qx.p.h(databaseReference.e(x.n().uid));
                        lVar.f43895d = jVar3;
                        lVar.f43896e = arrayList;
                        lVar.f43897f = 0;
                        lVar.f43893b = 1;
                        objV = x0.v(cVarH, lVar);
                        if (objV != aVar) {
                            jVar = jVar3;
                            i11 = 0;
                            obj2 = obj5;
                        }
                    }
                    return aVar;
                }
                if (i16 != 1) {
                    if (i16 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj4);
                    return b0Var;
                }
                int i17 = lVar.f43897f;
                ArrayList arrayList3 = lVar.f43896e;
                jVar = lVar.f43895d;
                com.bumptech.glide.e.F(obj4);
                arrayList = arrayList3;
                i11 = i17;
                objV = obj4;
                obj2 = null;
                DataSnapshot dataSnapshot2 = (DataSnapshot) objV;
                if (dataSnapshot2 != null && (podUser = (PodUser) dataSnapshot2.b()) != null) {
                    arrayList.add(0, podUser);
                }
                i14 = i11;
                jVar3 = jVar;
                r9 = obj2;
                lVar.f43895d = r9;
                lVar.f43896e = r9;
                lVar.f43897f = i14;
                lVar.f43893b = 2;
                if (jVar3.emit(arrayList, lVar) != aVar) {
                    return b0Var;
                }
                return aVar;
            default:
                if (dVar instanceof p) {
                    pVar = (p) dVar;
                    int i18 = pVar.f43908b;
                    if ((i18 & Integer.MIN_VALUE) != 0) {
                        pVar.f43908b = i18 - Integer.MIN_VALUE;
                    } else {
                        pVar = new p(this, dVar);
                    }
                } else {
                    pVar = new p(this, dVar);
                }
                Object obj6 = pVar.f43907a;
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                int i19 = pVar.f43908b;
                vy.d dVar3 = null;
                if (i19 == 0) {
                    com.bumptech.glide.e.F(obj6);
                    DataSnapshot dataSnapshot3 = (DataSnapshot) obj;
                    Objects.toString(dataSnapshot3);
                    arrayList2 = new ArrayList();
                    s sVar2 = this.f43900c;
                    Object obj7 = null;
                    e0.F(vy.j.f54321a, new ad.x(dataSnapshot3, arrayList2, sVar2, dVar3, 25));
                    if (arrayList2.size() > 1) {
                        ry.p.Z(arrayList2, new gu.g(10));
                    }
                    LingoSkillApplication lingoSkillApplication2 = LingoSkillApplication.f21665b;
                    r11 = obj7;
                    if (x.n().isUnloginUser()) {
                        pVar.f43910d = r11;
                        pVar.f43911e = r11;
                        pVar.f43912f = i14;
                        pVar.f43908b = 2;
                        if (jVar3.emit(arrayList2, pVar) != aVar2) {
                            return b0Var;
                        }
                    } else {
                        DatabaseReference databaseReference2 = sVar2.f43916a;
                        if (databaseReference2 == null) {
                            kotlin.jvm.internal.m.n("mUserDb");
                            throw null;
                        }
                        uz.c cVarH2 = qx.p.h(databaseReference2.e(x.n().uid));
                        pVar.f43910d = jVar3;
                        pVar.f43911e = arrayList2;
                        pVar.f43912f = 0;
                        pVar.f43908b = 1;
                        objV2 = x0.v(cVarH2, pVar);
                        if (objV2 != aVar2) {
                            jVar2 = jVar3;
                            i12 = 0;
                            obj3 = obj7;
                        }
                    }
                    return aVar2;
                }
                if (i19 != 1) {
                    if (i19 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj6);
                    return b0Var;
                }
                int i21 = pVar.f43912f;
                ArrayList arrayList4 = pVar.f43911e;
                jVar2 = pVar.f43910d;
                com.bumptech.glide.e.F(obj6);
                arrayList2 = arrayList4;
                i12 = i21;
                objV2 = obj6;
                obj3 = null;
                DataSnapshot dataSnapshot4 = (DataSnapshot) objV2;
                if (dataSnapshot4 != null && (podUser2 = (PodUser) dataSnapshot4.b()) != null) {
                    arrayList2.add(0, podUser2);
                }
                i14 = i12;
                jVar3 = jVar2;
                r11 = obj3;
                pVar.f43910d = r11;
                pVar.f43911e = r11;
                pVar.f43912f = i14;
                pVar.f43908b = 2;
                if (jVar3.emit(arrayList2, pVar) != aVar2) {
                    return b0Var;
                }
                return aVar2;
        }
    }
}
