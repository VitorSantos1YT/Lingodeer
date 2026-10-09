package bh;

import a0.w1;
import android.net.Uri;
import com.google.firebase.iid.QyE.SemtNwfPgIhi;
import com.lingo.lingoskill.LingoSkillApplication;
import com.lingo.lingoskill.object.ConvertUtilsKt;
import com.lingo.lingoskill.object.HwCharacter;
import com.lingo.lingoskill.object.JPChar;
import com.lingodeer.data.model.CourseCharacter;
import com.lingodeer.data.model.CourseSentence;
import com.lingodeer.data.model.CourseSentenceModel010;
import com.lingodeer.data.model.CourseSentenceModel020;
import com.lingodeer.data.model.CourseSentenceModel030;
import com.lingodeer.data.model.CourseSentenceModel050;
import com.lingodeer.data.model.CourseSentenceModel080;
import com.lingodeer.data.model.CourseSentenceModel090;
import com.lingodeer.data.model.CourseSentenceModel100;
import com.lingodeer.data.model.CourseSentenceModelQA;
import com.lingodeer.data.model.CourseWord;
import com.lingodeer.data.model.CourseWordModel010;
import com.tbruyelle.rxpermissions3.BuildConfig;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class c extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4167a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f4168b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f4169c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t f4170d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f4171e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(long j11, t tVar, vy.d dVar, int i11) {
        super(2, dVar);
        this.f4167a = i11;
        this.f4171e = j11;
        this.f4170d = tVar;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f4167a) {
            case 0:
                c cVar = new c(this.f4170d, this.f4171e, dVar, 0);
                cVar.f4169c = obj;
                return cVar;
            case 1:
                c cVar2 = new c(this.f4170d, this.f4171e, dVar, 1);
                cVar2.f4169c = obj;
                return cVar2;
            case 2:
                c cVar3 = new c(this.f4171e, this.f4170d, dVar, 2);
                cVar3.f4169c = obj;
                return cVar3;
            case 3:
                c cVar4 = new c(this.f4171e, this.f4170d, dVar, 3);
                cVar4.f4169c = obj;
                return cVar4;
            case 4:
                c cVar5 = new c(this.f4171e, this.f4170d, dVar, 4);
                cVar5.f4169c = obj;
                return cVar5;
            case 5:
                c cVar6 = new c(this.f4171e, this.f4170d, dVar, 5);
                cVar6.f4169c = obj;
                return cVar6;
            case 6:
                c cVar7 = new c(this.f4171e, this.f4170d, dVar, 6);
                cVar7.f4169c = obj;
                return cVar7;
            case 7:
                c cVar8 = new c(this.f4171e, this.f4170d, dVar, 7);
                cVar8.f4169c = obj;
                return cVar8;
            case 8:
                c cVar9 = new c(this.f4171e, this.f4170d, dVar, 8);
                cVar9.f4169c = obj;
                return cVar9;
            case 9:
                c cVar10 = new c(this.f4171e, this.f4170d, dVar, 9);
                cVar10.f4169c = obj;
                return cVar10;
            case 10:
                c cVar11 = new c(this.f4171e, this.f4170d, dVar, 10);
                cVar11.f4169c = obj;
                return cVar11;
            case 11:
                c cVar12 = new c(this.f4170d, this.f4171e, dVar, 11);
                cVar12.f4169c = obj;
                return cVar12;
            case 12:
                c cVar13 = new c(this.f4170d, this.f4171e, dVar, 12);
                cVar13.f4169c = obj;
                return cVar13;
            default:
                c cVar14 = new c(this.f4170d, this.f4171e, dVar, 13);
                cVar14.f4169c = obj;
                return cVar14;
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        uz.j jVar = (uz.j) obj;
        vy.d dVar = (vy.d) obj2;
        switch (this.f4167a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                break;
            case 12:
                break;
        }
        return ((c) create(jVar, dVar)).invokeSuspend(qy.b0.f48488a);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(t tVar, long j11, vy.d dVar, int i11) {
        super(2, dVar);
        this.f4167a = i11;
        this.f4170d = tVar;
        this.f4171e = j11;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:89:0x018b  */
    /* JADX WARN: Type inference failed for: r5v20, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r7v34, types: [java.lang.Object, java.util.Map] */
    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        Object objM;
        Object objM2;
        Object objM3;
        Object objM4;
        Object objM5;
        Object objM6;
        Object objM7;
        Object objM8;
        Object objM9;
        Object objM10;
        Object objM11;
        String str;
        String str2;
        Uri uri;
        char c11;
        Object objM12;
        switch (this.f4167a) {
            case 0:
                uz.j jVar = (uz.j) this.f4169c;
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                int i11 = this.f4168b;
                if (i11 == 0) {
                    com.bumptech.glide.e.F(obj);
                    Boolean boolValueOf = Boolean.valueOf(this.f4170d.f4369e.load(new Long(this.f4171e)) != null);
                    this.f4169c = null;
                    this.f4168b = 1;
                    if (jVar.emit(boolValueOf, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                return qy.b0.f48488a;
            case 1:
                uz.j jVar2 = (uz.j) this.f4169c;
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                int i12 = this.f4168b;
                if (i12 != 0) {
                    if (i12 == 1) {
                        com.bumptech.glide.e.F(obj);
                        objM = obj;
                    } else {
                        if (i12 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        com.bumptech.glide.e.F(obj);
                    }
                    return qy.b0.f48488a;
                }
                com.bumptech.glide.e.F(obj);
                t tVar = this.f4170d;
                long j11 = this.f4171e;
                this.f4169c = jVar2;
                this.f4168b = 1;
                Object obj2 = t.f4364k;
                yz.f fVar = rz.o0.f50940a;
                objM = rz.e0.M(yz.e.f58387a, new l(j11, tVar, null), this);
                if (objM == aVar2) {
                    return aVar2;
                }
                CourseCharacter courseCharacter = (CourseCharacter) objM;
                if (courseCharacter != null) {
                    this.f4169c = null;
                    this.f4168b = 2;
                    if (jVar2.emit(courseCharacter, this) == aVar2) {
                        return aVar2;
                    }
                }
                return qy.b0.f48488a;
            case 2:
                uz.j jVar3 = (uz.j) this.f4169c;
                wy.a aVar3 = wy.a.COROUTINE_SUSPENDED;
                int i13 = this.f4168b;
                vy.d dVar = null;
                if (i13 != 0) {
                    if (i13 == 1) {
                        com.bumptech.glide.e.F(obj);
                        objM2 = obj;
                    } else {
                        if (i13 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        com.bumptech.glide.e.F(obj);
                    }
                    return qy.b0.f48488a;
                }
                com.bumptech.glide.e.F(obj);
                yz.f fVar2 = rz.o0.f50940a;
                yz.e eVar = yz.e.f58387a;
                i iVar = new i(this.f4171e, this.f4170d, dVar, 0);
                this.f4169c = jVar3;
                this.f4168b = 1;
                objM2 = rz.e0.M(eVar, iVar, this);
                if (objM2 == aVar3) {
                    return aVar3;
                }
                CourseSentenceModel010 courseSentenceModel010 = (CourseSentenceModel010) objM2;
                if (courseSentenceModel010 != null) {
                    this.f4169c = null;
                    this.f4168b = 2;
                    if (jVar3.emit(courseSentenceModel010, this) == aVar3) {
                        return aVar3;
                    }
                }
                return qy.b0.f48488a;
            case 3:
                uz.j jVar4 = (uz.j) this.f4169c;
                wy.a aVar4 = wy.a.COROUTINE_SUSPENDED;
                int i14 = this.f4168b;
                vy.d dVar2 = null;
                if (i14 != 0) {
                    if (i14 == 1) {
                        com.bumptech.glide.e.F(obj);
                        objM3 = obj;
                    } else {
                        if (i14 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        com.bumptech.glide.e.F(obj);
                    }
                    return qy.b0.f48488a;
                }
                com.bumptech.glide.e.F(obj);
                yz.f fVar3 = rz.o0.f50940a;
                yz.e eVar2 = yz.e.f58387a;
                i iVar2 = new i(this.f4171e, this.f4170d, dVar2, 1);
                this.f4169c = jVar4;
                this.f4168b = 1;
                objM3 = rz.e0.M(eVar2, iVar2, this);
                if (objM3 == aVar4) {
                    return aVar4;
                }
                CourseSentenceModel020 courseSentenceModel020 = (CourseSentenceModel020) objM3;
                if (courseSentenceModel020 != null) {
                    this.f4169c = null;
                    this.f4168b = 2;
                    if (jVar4.emit(courseSentenceModel020, this) == aVar4) {
                        return aVar4;
                    }
                }
                return qy.b0.f48488a;
            case 4:
                uz.j jVar5 = (uz.j) this.f4169c;
                wy.a aVar5 = wy.a.COROUTINE_SUSPENDED;
                int i15 = this.f4168b;
                vy.d dVar3 = null;
                if (i15 != 0) {
                    if (i15 == 1) {
                        com.bumptech.glide.e.F(obj);
                        objM4 = obj;
                    } else {
                        if (i15 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        com.bumptech.glide.e.F(obj);
                    }
                    return qy.b0.f48488a;
                }
                com.bumptech.glide.e.F(obj);
                yz.f fVar4 = rz.o0.f50940a;
                yz.e eVar3 = yz.e.f58387a;
                i iVar3 = new i(this.f4171e, this.f4170d, dVar3, 2);
                this.f4169c = jVar5;
                this.f4168b = 1;
                objM4 = rz.e0.M(eVar3, iVar3, this);
                if (objM4 == aVar5) {
                    return aVar5;
                }
                CourseSentenceModel030 courseSentenceModel030 = (CourseSentenceModel030) objM4;
                if (courseSentenceModel030 != null) {
                    this.f4169c = null;
                    this.f4168b = 2;
                    if (jVar5.emit(courseSentenceModel030, this) == aVar5) {
                        return aVar5;
                    }
                }
                return qy.b0.f48488a;
            case 5:
                uz.j jVar6 = (uz.j) this.f4169c;
                wy.a aVar6 = wy.a.COROUTINE_SUSPENDED;
                int i16 = this.f4168b;
                if (i16 != 0) {
                    if (i16 == 1) {
                        com.bumptech.glide.e.F(obj);
                        objM5 = obj;
                    } else {
                        if (i16 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        com.bumptech.glide.e.F(obj);
                    }
                    return qy.b0.f48488a;
                }
                com.bumptech.glide.e.F(obj);
                yz.f fVar5 = rz.o0.f50940a;
                yz.e eVar4 = yz.e.f58387a;
                j jVar7 = new j(this.f4171e, this.f4170d, null);
                this.f4169c = jVar6;
                this.f4168b = 1;
                objM5 = rz.e0.M(eVar4, jVar7, this);
                if (objM5 == aVar6) {
                    return aVar6;
                }
                CourseSentenceModel050 courseSentenceModel050 = (CourseSentenceModel050) objM5;
                if (courseSentenceModel050 != null) {
                    this.f4169c = null;
                    this.f4168b = 2;
                    if (jVar6.emit(courseSentenceModel050, this) == aVar6) {
                        return aVar6;
                    }
                }
                return qy.b0.f48488a;
            case 6:
                uz.j jVar8 = (uz.j) this.f4169c;
                wy.a aVar7 = wy.a.COROUTINE_SUSPENDED;
                int i17 = this.f4168b;
                vy.d dVar4 = null;
                if (i17 != 0) {
                    if (i17 == 1) {
                        com.bumptech.glide.e.F(obj);
                        objM6 = obj;
                    } else {
                        if (i17 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        com.bumptech.glide.e.F(obj);
                    }
                    return qy.b0.f48488a;
                }
                com.bumptech.glide.e.F(obj);
                yz.f fVar6 = rz.o0.f50940a;
                yz.e eVar5 = yz.e.f58387a;
                k kVar = new k(this.f4171e, this.f4170d, dVar4, 0);
                this.f4169c = jVar8;
                this.f4168b = 1;
                objM6 = rz.e0.M(eVar5, kVar, this);
                if (objM6 == aVar7) {
                    return aVar7;
                }
                CourseSentenceModel080 courseSentenceModel080 = (CourseSentenceModel080) objM6;
                if (courseSentenceModel080 != null) {
                    this.f4169c = null;
                    this.f4168b = 2;
                    if (jVar8.emit(courseSentenceModel080, this) == aVar7) {
                        return aVar7;
                    }
                }
                return qy.b0.f48488a;
            case 7:
                uz.j jVar9 = (uz.j) this.f4169c;
                wy.a aVar8 = wy.a.COROUTINE_SUSPENDED;
                int i18 = this.f4168b;
                vy.d dVar5 = null;
                if (i18 != 0) {
                    if (i18 == 1) {
                        com.bumptech.glide.e.F(obj);
                        objM7 = obj;
                    } else {
                        if (i18 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        com.bumptech.glide.e.F(obj);
                    }
                    return qy.b0.f48488a;
                }
                com.bumptech.glide.e.F(obj);
                yz.f fVar7 = rz.o0.f50940a;
                yz.e eVar6 = yz.e.f58387a;
                i iVar4 = new i(this.f4171e, this.f4170d, dVar5, 3);
                this.f4169c = jVar9;
                this.f4168b = 1;
                objM7 = rz.e0.M(eVar6, iVar4, this);
                if (objM7 == aVar8) {
                    return aVar8;
                }
                CourseSentenceModel090 courseSentenceModel090 = (CourseSentenceModel090) objM7;
                if (courseSentenceModel090 != null) {
                    this.f4169c = null;
                    this.f4168b = 2;
                    if (jVar9.emit(courseSentenceModel090, this) == aVar8) {
                        return aVar8;
                    }
                }
                return qy.b0.f48488a;
            case 8:
                uz.j jVar10 = (uz.j) this.f4169c;
                wy.a aVar9 = wy.a.COROUTINE_SUSPENDED;
                int i19 = this.f4168b;
                vy.d dVar6 = null;
                if (i19 != 0) {
                    if (i19 == 1) {
                        com.bumptech.glide.e.F(obj);
                        objM8 = obj;
                    } else {
                        if (i19 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        com.bumptech.glide.e.F(obj);
                    }
                    return qy.b0.f48488a;
                }
                com.bumptech.glide.e.F(obj);
                yz.f fVar8 = rz.o0.f50940a;
                yz.e eVar7 = yz.e.f58387a;
                i iVar5 = new i(this.f4171e, this.f4170d, dVar6, 4);
                this.f4169c = jVar10;
                this.f4168b = 1;
                objM8 = rz.e0.M(eVar7, iVar5, this);
                if (objM8 == aVar9) {
                    return aVar9;
                }
                CourseSentenceModel100 courseSentenceModel100 = (CourseSentenceModel100) objM8;
                if (courseSentenceModel100 != null) {
                    this.f4169c = null;
                    this.f4168b = 2;
                    if (jVar10.emit(courseSentenceModel100, this) == aVar9) {
                        return aVar9;
                    }
                }
                return qy.b0.f48488a;
            case 9:
                uz.j jVar11 = (uz.j) this.f4169c;
                wy.a aVar10 = wy.a.COROUTINE_SUSPENDED;
                int i21 = this.f4168b;
                vy.d dVar7 = null;
                if (i21 != 0) {
                    if (i21 == 1) {
                        com.bumptech.glide.e.F(obj);
                        objM9 = obj;
                    } else {
                        if (i21 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        com.bumptech.glide.e.F(obj);
                    }
                    return qy.b0.f48488a;
                }
                com.bumptech.glide.e.F(obj);
                yz.f fVar9 = rz.o0.f50940a;
                yz.e eVar8 = yz.e.f58387a;
                k kVar2 = new k(this.f4171e, this.f4170d, dVar7, 1);
                this.f4169c = jVar11;
                this.f4168b = 1;
                objM9 = rz.e0.M(eVar8, kVar2, this);
                if (objM9 == aVar10) {
                    return aVar10;
                }
                CourseSentenceModelQA courseSentenceModelQA = (CourseSentenceModelQA) objM9;
                if (courseSentenceModelQA != null) {
                    this.f4169c = null;
                    this.f4168b = 2;
                    if (jVar11.emit(courseSentenceModelQA, this) == aVar10) {
                        return aVar10;
                    }
                }
                return qy.b0.f48488a;
            case 10:
                uz.j jVar12 = (uz.j) this.f4169c;
                wy.a aVar11 = wy.a.COROUTINE_SUSPENDED;
                int i22 = this.f4168b;
                vy.d dVar8 = null;
                if (i22 != 0) {
                    if (i22 == 1) {
                        com.bumptech.glide.e.F(obj);
                        objM10 = obj;
                    } else {
                        if (i22 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        com.bumptech.glide.e.F(obj);
                    }
                    return qy.b0.f48488a;
                }
                com.bumptech.glide.e.F(obj);
                yz.f fVar10 = rz.o0.f50940a;
                yz.e eVar9 = yz.e.f58387a;
                l lVar = new l(this.f4171e, this.f4170d, dVar8, 0);
                this.f4169c = jVar12;
                this.f4168b = 1;
                objM10 = rz.e0.M(eVar9, lVar, this);
                if (objM10 == aVar11) {
                    return aVar11;
                }
                CourseWordModel010 courseWordModel010 = (CourseWordModel010) objM10;
                if (courseWordModel010 != null) {
                    this.f4169c = null;
                    this.f4168b = 2;
                    if (jVar12.emit(courseWordModel010, this) == aVar11) {
                        return aVar11;
                    }
                }
                return qy.b0.f48488a;
            case 11:
                uz.j jVar13 = (uz.j) this.f4169c;
                wy.a aVar12 = wy.a.COROUTINE_SUSPENDED;
                int i23 = this.f4168b;
                if (i23 != 0) {
                    if (i23 == 1) {
                        com.bumptech.glide.e.F(obj);
                        objM11 = obj;
                    } else {
                        if (i23 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        com.bumptech.glide.e.F(obj);
                    }
                    return qy.b0.f48488a;
                }
                com.bumptech.glide.e.F(obj);
                yz.f fVar11 = rz.o0.f50940a;
                yz.e eVar10 = yz.e.f58387a;
                n nVar = new n(this.f4171e, this.f4170d, null);
                this.f4169c = jVar13;
                this.f4168b = 1;
                objM11 = rz.e0.M(eVar10, nVar, this);
                if (objM11 == aVar12) {
                    return aVar12;
                }
                CourseSentence courseSentence = (CourseSentence) objM11;
                if (courseSentence != null) {
                    this.f4169c = null;
                    this.f4168b = 2;
                    if (jVar13.emit(courseSentence, this) == aVar12) {
                        return aVar12;
                    }
                }
                return qy.b0.f48488a;
            case 12:
                uz.j jVar14 = (uz.j) this.f4169c;
                wy.a aVar13 = wy.a.COROUTINE_SUSPENDED;
                int i24 = this.f4168b;
                if (i24 == 0) {
                    com.bumptech.glide.e.F(obj);
                    if (ry.l.D(new Integer[]{12, 1}, Integer.valueOf(((fr.o0) this.f4170d.f4372h).f27733a.keyLanguage))) {
                        if (ij.d.f34419e == null) {
                            synchronized (ij.d.class) {
                                if (ij.d.f34419e == null) {
                                    LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                                    kotlin.jvm.internal.m.c(lingoSkillApplication);
                                    ij.d.f34419e = new ij.d(lingoSkillApplication);
                                }
                            }
                        }
                        kotlin.jvm.internal.m.c(ij.d.f34419e);
                        JPChar jPChar = (JPChar) ij.d.i().load(new Long(this.f4171e));
                        if (jPChar != null) {
                            HwCharacter hwCharacter = new HwCharacter();
                            hwCharacter.setCharId(jPChar.getCharId());
                            hwCharacter.setCharacter(jPChar.getCharacter());
                            hwCharacter.setPinyin(jPChar.getDisplayLuoMa());
                            hwCharacter.setCharPath(jPChar.getCharPath());
                            hwCharacter.setTranENG(BuildConfig.VERSION_NAME);
                            CourseCharacter characterItem = ConvertUtilsKt.toCharacterItem(hwCharacter, ((fr.o0) this.f4170d.f4372h).f27733a.keyLanguage, true);
                            this.f4169c = null;
                            this.f4168b = 1;
                            if (jVar14.emit(characterItem, this) == aVar13) {
                                return aVar13;
                            }
                        } else {
                            long j12 = this.f4171e;
                            String strValueOf = (0 > j12 || j12 >= 65536 || ((12352 > (c11 = (char) ((int) j12)) || c11 >= 12448) && ((12448 > c11 || c11 >= 12544) && (12784 > c11 || c11 >= 12800)))) ? null : String.valueOf(c11);
                            if (strValueOf != null) {
                                Object obj3 = hl.a.f33681a;
                                str = !hl.a.f33682b ? null : (String) hl.a.f33681a.get(strValueOf);
                            } else {
                                str = null;
                            }
                            if (strValueOf == null) {
                                str2 = null;
                            } else {
                                Character chValueOf = strValueOf.length() == 1 ? Character.valueOf(strValueOf.charAt(0)) : null;
                                if (chValueOf != null) {
                                    char cCharValue = chValueOf.charValue();
                                    if (12449 <= cCharValue && cCharValue < 12535) {
                                        cCharValue = (char) (cCharValue - '`');
                                    }
                                    str2 = (String) t.f4364k.get(Character.valueOf(cCharValue));
                                } else {
                                    str2 = null;
                                }
                            }
                            if (strValueOf != null && str != null) {
                                long j13 = this.f4171e;
                                String str3 = str2 == null ? SemtNwfPgIhi.MzpfiT : str2;
                                ry.r rVar = ry.r.f50854a;
                                if (str2 != null) {
                                    qy.q qVar = fv.b.f28186a;
                                    uri = Uri.parse(fv.b.c(str2, null, null));
                                    if (uri == null) {
                                        uri = Uri.parse(BuildConfig.VERSION_NAME);
                                    }
                                } else {
                                    uri = Uri.parse(BuildConfig.VERSION_NAME);
                                }
                                CourseCharacter courseCharacter2 = new CourseCharacter(j13, strValueOf, BuildConfig.VERSION_NAME, str3, 0, BuildConfig.VERSION_NAME, BuildConfig.VERSION_NAME, rVar, rVar, str, uri, null, null, 6144, null);
                                this.f4169c = null;
                                this.f4168b = 2;
                                if (jVar14.emit(courseCharacter2, this) == aVar13) {
                                    return aVar13;
                                }
                            }
                        }
                    } else if (ry.l.D(new Integer[]{13, 2}, Integer.valueOf(((fr.o0) this.f4170d.f4372h).f27733a.keyLanguage))) {
                        if (ij.d.f34419e == null) {
                            synchronized (ij.d.class) {
                                if (ij.d.f34419e == null) {
                                    LingoSkillApplication lingoSkillApplication2 = LingoSkillApplication.f21665b;
                                    kotlin.jvm.internal.m.c(lingoSkillApplication2);
                                    ij.d.f34419e = new ij.d(lingoSkillApplication2);
                                }
                            }
                        }
                        kotlin.jvm.internal.m.c(ij.d.f34419e);
                        JPChar jPChar2 = (JPChar) ij.d.i().load(new Long(this.f4171e));
                        HwCharacter hwCharacter2 = new HwCharacter();
                        hwCharacter2.setCharId(jPChar2.getCharId());
                        hwCharacter2.setCharacter(jPChar2.getCharacter());
                        hwCharacter2.setPinyin(jPChar2.getDisplayLuoMa());
                        hwCharacter2.setCharPath(jPChar2.getCharPath());
                        hwCharacter2.setTranENG(BuildConfig.VERSION_NAME);
                        CourseCharacter characterItem2 = ConvertUtilsKt.toCharacterItem(hwCharacter2, ((fr.o0) this.f4170d.f4372h).f27733a.keyLanguage, true);
                        this.f4169c = null;
                        this.f4168b = 3;
                        if (jVar14.emit(characterItem2, this) == aVar13) {
                            return aVar13;
                        }
                    }
                    break;
                } else {
                    if (i24 != 1 && i24 != 2 && i24 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                return qy.b0.f48488a;
            default:
                uz.j jVar15 = (uz.j) this.f4169c;
                wy.a aVar14 = wy.a.COROUTINE_SUSPENDED;
                int i25 = this.f4168b;
                vy.d dVar9 = null;
                if (i25 != 0) {
                    if (i25 == 1) {
                        com.bumptech.glide.e.F(obj);
                        objM12 = obj;
                    } else {
                        if (i25 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        com.bumptech.glide.e.F(obj);
                    }
                    return qy.b0.f48488a;
                }
                com.bumptech.glide.e.F(obj);
                yz.f fVar12 = rz.o0.f50940a;
                yz.e eVar11 = yz.e.f58387a;
                w1 w1Var = new w1(this.f4170d, this.f4171e, dVar9, 1);
                this.f4169c = jVar15;
                this.f4168b = 1;
                objM12 = rz.e0.M(eVar11, w1Var, this);
                if (objM12 == aVar14) {
                    return aVar14;
                }
                CourseWord courseWord = (CourseWord) objM12;
                if (courseWord != null) {
                    this.f4169c = null;
                    this.f4168b = 2;
                    if (jVar15.emit(courseWord, this) == aVar14) {
                        return aVar14;
                    }
                }
                return qy.b0.f48488a;
        }
    }
}
