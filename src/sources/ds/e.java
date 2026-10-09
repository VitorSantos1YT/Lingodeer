package ds;

import au.p;
import au.q;
import au.v;
import cf.x;
import com.lingodeer.data.model.characterstroke.CharacterStrokeGroupKt;
import com.lingodeer.data.model.characterstroke.CharacterStrokeKt;
import com.lingodeer.data.model.chinesetone.ChineseToneModelExtensionsKt;
import com.lingodeer.database.CharacterStrokeDatabase;
import com.lingodeer.database.ChineseToneDatabase;
import com.lingodeer.database.model.CharacterStrokeEntity;
import com.lingodeer.database.model.CharacterStrokeGroupEntity;
import com.lingodeer.database.model.ChineseToneLevelEntity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import l1.t;
import n9.x1;
import qy.b0;
import ry.n;
import ry.r;
import rz.e0;
import uz.j;
import xy.i;
import zu.o0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class e extends i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23607a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f23608b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f23609c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(int i11, int i12, vy.d dVar) {
        super(i11, dVar);
        this.f23607a = i12;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f23607a) {
            case 0:
                e eVar = new e(2, 0, dVar);
                eVar.f23609c = obj;
                return eVar;
            case 1:
                e eVar2 = new e(2, 1, dVar);
                eVar2.f23609c = obj;
                return eVar2;
            case 2:
                e eVar3 = new e(2, 2, dVar);
                eVar3.f23609c = obj;
                return eVar3;
            case 3:
                e eVar4 = new e(2, 3, dVar);
                eVar4.f23609c = obj;
                return eVar4;
            case 4:
                e eVar5 = new e(2, 4, dVar);
                eVar5.f23609c = obj;
                return eVar5;
            case 5:
                e eVar6 = new e(2, 5, dVar);
                eVar6.f23609c = obj;
                return eVar6;
            case 6:
                e eVar7 = new e(2, 6, dVar);
                eVar7.f23609c = obj;
                return eVar7;
            case 7:
                e eVar8 = new e(2, 7, dVar);
                eVar8.f23609c = obj;
                return eVar8;
            case 8:
                e eVar9 = new e(2, 8, dVar);
                eVar9.f23609c = obj;
                return eVar9;
            case 9:
                e eVar10 = new e(2, 9, dVar);
                eVar10.f23609c = obj;
                return eVar10;
            case 10:
                e eVar11 = new e(2, 10, dVar);
                eVar11.f23609c = obj;
                return eVar11;
            case 11:
                e eVar12 = new e(2, 11, dVar);
                eVar12.f23609c = obj;
                return eVar12;
            case 12:
                e eVar13 = new e(2, 12, dVar);
                eVar13.f23609c = obj;
                return eVar13;
            default:
                e eVar14 = new e(2, 13, dVar);
                eVar14.f23609c = obj;
                return eVar14;
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f23607a) {
            case 0:
                return ((e) create((ChineseToneDatabase) obj, (vy.d) obj2)).invokeSuspend(b0.f48488a);
            case 1:
                return ((e) create((ChineseToneDatabase) obj, (vy.d) obj2)).invokeSuspend(b0.f48488a);
            case 2:
                return ((e) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(b0.f48488a);
            case 3:
                return ((e) create((j) obj, (vy.d) obj2)).invokeSuspend(b0.f48488a);
            case 4:
                return ((e) create((j) obj, (vy.d) obj2)).invokeSuspend(b0.f48488a);
            case 5:
                return ((e) create((j) obj, (vy.d) obj2)).invokeSuspend(b0.f48488a);
            case 6:
                return ((e) create((j) obj, (vy.d) obj2)).invokeSuspend(b0.f48488a);
            case 7:
                return ((e) create((j) obj, (vy.d) obj2)).invokeSuspend(b0.f48488a);
            case 8:
                return ((e) create((j) obj, (vy.d) obj2)).invokeSuspend(b0.f48488a);
            case 9:
                return ((e) create((j) obj, (vy.d) obj2)).invokeSuspend(b0.f48488a);
            case 10:
                return ((e) create((CharacterStrokeDatabase) obj, (vy.d) obj2)).invokeSuspend(b0.f48488a);
            case 11:
                return ((e) create((CharacterStrokeDatabase) obj, (vy.d) obj2)).invokeSuspend(b0.f48488a);
            case 12:
                return ((e) create((CharacterStrokeDatabase) obj, (vy.d) obj2)).invokeSuspend(b0.f48488a);
            default:
                return ((e) create((j) obj, (vy.d) obj2)).invokeSuspend(b0.f48488a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [wy.a] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v30, types: [wy.a] */
    /* JADX WARN: Type inference failed for: r1v32, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v33, types: [wy.a] */
    /* JADX WARN: Type inference failed for: r1v35, types: [java.util.ArrayList] */
    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        rz.b0 b0Var;
        j jVar;
        x1 x1Var;
        switch (this.f23607a) {
            case 0:
                ChineseToneDatabase chineseToneDatabase = (ChineseToneDatabase) this.f23609c;
                Object arrayList = wy.a.COROUTINE_SUSPENDED;
                int i11 = this.f23608b;
                if (i11 == 0) {
                    com.bumptech.glide.e.F(obj);
                    v vVarC = chineseToneDatabase.C();
                    this.f23609c = null;
                    this.f23608b = 1;
                    obj = x.C(this, vVarC.f3077a, true, false, new au.a(vVarC, 6));
                    if (obj != arrayList) {
                    }
                    return arrayList;
                }
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.bumptech.glide.e.F(obj);
                Iterable iterable = (Iterable) obj;
                arrayList = new ArrayList(n.W(iterable, 10));
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(ChineseToneModelExtensionsKt.asExternalModel((ChineseToneLevelEntity) it.next()));
                }
                return arrayList;
            case 1:
                ChineseToneDatabase chineseToneDatabase2 = (ChineseToneDatabase) this.f23609c;
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                int i12 = this.f23608b;
                if (i12 == 0) {
                    com.bumptech.glide.e.F(obj);
                    v vVarC2 = chineseToneDatabase2.C();
                    this.f23609c = null;
                    this.f23608b = 1;
                    obj = x.C(this, vVarC2.f3077a, true, false, new au.a(7));
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                return Boolean.valueOf(((Number) obj).intValue() > 0);
            case 2:
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                int i13 = this.f23608b;
                if (i13 == 0) {
                    com.bumptech.glide.e.F(obj);
                    b0Var = (rz.b0) this.f23609c;
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    b0Var = (rz.b0) this.f23609c;
                    com.bumptech.glide.e.F(obj);
                }
                while (e0.x(b0Var.getCoroutineContext())) {
                    com.lingo.lingoskill.object.a aVar3 = new com.lingo.lingoskill.object.a(28);
                    this.f23609c = b0Var;
                    this.f23608b = 1;
                    if (t.x(getContext()).p(aVar3, this) == aVar2) {
                        return aVar2;
                    }
                }
                return b0.f48488a;
            case 3:
                j jVar2 = (j) this.f23609c;
                wy.a aVar4 = wy.a.COROUTINE_SUSPENDED;
                int i14 = this.f23608b;
                if (i14 == 0) {
                    com.bumptech.glide.e.F(obj);
                    this.f23609c = null;
                    this.f23608b = 1;
                    if (jVar2.emit(r.f50854a, this) == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                return b0.f48488a;
            case 4:
                j jVar3 = (j) this.f23609c;
                wy.a aVar5 = wy.a.COROUTINE_SUSPENDED;
                int i15 = this.f23608b;
                if (i15 == 0) {
                    com.bumptech.glide.e.F(obj);
                    Boolean bool = Boolean.TRUE;
                    this.f23609c = null;
                    this.f23608b = 1;
                    if (jVar3.emit(bool, this) == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                return b0.f48488a;
            case 5:
                j jVar4 = (j) this.f23609c;
                wy.a aVar6 = wy.a.COROUTINE_SUSPENDED;
                int i16 = this.f23608b;
                if (i16 == 0) {
                    com.bumptech.glide.e.F(obj);
                    this.f23609c = null;
                    this.f23608b = 1;
                    if (jVar4.emit(r.f50854a, this) == aVar6) {
                        return aVar6;
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                return b0.f48488a;
            case 6:
                wy.a aVar7 = wy.a.COROUTINE_SUSPENDED;
                int i17 = this.f23608b;
                if (i17 != 0) {
                    if (i17 == 1) {
                        jVar = (j) this.f23609c;
                        com.bumptech.glide.e.F(obj);
                        x1Var = (x1) obj;
                    } else {
                        if (i17 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        com.bumptech.glide.e.F(obj);
                    }
                    return b0.f48488a;
                }
                com.bumptech.glide.e.F(obj);
                jVar = (j) this.f23609c;
                x1Var = null;
                Boolean boolValueOf = Boolean.valueOf(x1Var == x1.LAUNCH_INITIAL_REFRESH);
                this.f23609c = null;
                this.f23608b = 2;
                if (jVar.emit(boolValueOf, this) == aVar7) {
                    return aVar7;
                }
                return b0.f48488a;
            case 7:
                j jVar5 = (j) this.f23609c;
                wy.a aVar8 = wy.a.COROUTINE_SUSPENDED;
                int i18 = this.f23608b;
                if (i18 == 0) {
                    com.bumptech.glide.e.F(obj);
                    List listC = ij.c.c(-1L);
                    this.f23609c = null;
                    this.f23608b = 1;
                    if (jVar5.emit(listC, this) == aVar8) {
                        return aVar8;
                    }
                } else {
                    if (i18 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                return b0.f48488a;
            case 8:
                j jVar6 = (j) this.f23609c;
                wy.a aVar9 = wy.a.COROUTINE_SUSPENDED;
                int i19 = this.f23608b;
                if (i19 == 0) {
                    com.bumptech.glide.e.F(obj);
                    this.f23609c = null;
                    this.f23608b = 1;
                    if (jVar6.emit(r.f50854a, this) == aVar9) {
                        return aVar9;
                    }
                } else {
                    if (i19 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                return b0.f48488a;
            case 9:
                j jVar7 = (j) this.f23609c;
                wy.a aVar10 = wy.a.COROUTINE_SUSPENDED;
                int i21 = this.f23608b;
                if (i21 == 0) {
                    com.bumptech.glide.e.F(obj);
                    this.f23609c = null;
                    this.f23608b = 1;
                    if (jVar7.emit(null, this) == aVar10) {
                        return aVar10;
                    }
                } else {
                    if (i21 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                return b0.f48488a;
            case 10:
                CharacterStrokeDatabase characterStrokeDatabase = (CharacterStrokeDatabase) this.f23609c;
                wy.a aVar11 = wy.a.COROUTINE_SUSPENDED;
                int i22 = this.f23608b;
                if (i22 == 0) {
                    com.bumptech.glide.e.F(obj);
                    p pVarZ = characterStrokeDatabase.z();
                    this.f23609c = null;
                    this.f23608b = 1;
                    obj = x.C(this, pVarZ.f3057a, true, false, new au.a(3));
                    if (obj == aVar11) {
                        return aVar11;
                    }
                } else {
                    if (i22 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                return Boolean.valueOf(((Number) obj).intValue() > 0);
            case 11:
                CharacterStrokeDatabase characterStrokeDatabase2 = (CharacterStrokeDatabase) this.f23609c;
                Object arrayList2 = wy.a.COROUTINE_SUSPENDED;
                int i23 = this.f23608b;
                if (i23 == 0) {
                    com.bumptech.glide.e.F(obj);
                    q qVarA = characterStrokeDatabase2.A();
                    this.f23609c = null;
                    this.f23608b = 1;
                    obj = x.C(this, qVarA.f3061a, true, false, new au.a(qVarA, 4));
                    if (obj != arrayList2) {
                    }
                    return arrayList2;
                }
                if (i23 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.bumptech.glide.e.F(obj);
                Iterable<CharacterStrokeGroupEntity> iterable2 = (Iterable) obj;
                arrayList2 = new ArrayList(n.W(iterable2, 10));
                for (CharacterStrokeGroupEntity characterStrokeGroupEntity : iterable2) {
                    Objects.toString(characterStrokeGroupEntity);
                    arrayList2.add(CharacterStrokeGroupKt.asExternalModel(characterStrokeGroupEntity));
                }
                return arrayList2;
            case 12:
                CharacterStrokeDatabase characterStrokeDatabase3 = (CharacterStrokeDatabase) this.f23609c;
                Object arrayList3 = wy.a.COROUTINE_SUSPENDED;
                int i24 = this.f23608b;
                if (i24 == 0) {
                    com.bumptech.glide.e.F(obj);
                    p pVarZ2 = characterStrokeDatabase3.z();
                    this.f23609c = null;
                    this.f23608b = 1;
                    obj = x.C(this, pVarZ2.f3057a, true, false, new au.a(pVarZ2, 2));
                    if (obj != arrayList3) {
                    }
                    return arrayList3;
                }
                if (i24 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.bumptech.glide.e.F(obj);
                Iterable iterable3 = (Iterable) obj;
                arrayList3 = new ArrayList(n.W(iterable3, 10));
                Iterator it2 = iterable3.iterator();
                while (it2.hasNext()) {
                    arrayList3.add(CharacterStrokeKt.asExternalModel((CharacterStrokeEntity) it2.next()));
                }
                return arrayList3;
            default:
                j jVar8 = (j) this.f23609c;
                wy.a aVar12 = wy.a.COROUTINE_SUSPENDED;
                int i25 = this.f23608b;
                if (i25 == 0) {
                    com.bumptech.glide.e.F(obj);
                    this.f23609c = null;
                    this.f23608b = 1;
                    if (jVar8.emit(o0.f59509a, this) == aVar12) {
                        return aVar12;
                    }
                } else {
                    if (i25 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                return b0.f48488a;
        }
    }
}
