package bh;

import com.lingo.lingoskill.object.ConvertUtilsKt;
import com.lingo.lingoskill.object.LDCharacter;
import com.lingo.lingoskill.object.Model_Sentence_020;
import com.lingo.lingoskill.object.Model_Sentence_030;
import com.lingo.lingoskill.object.Model_Sentence_050;
import com.lingo.lingoskill.object.Model_Sentence_060;
import com.lingo.lingoskill.object.Model_Sentence_080;
import com.lingo.lingoskill.object.Model_Sentence_100;
import com.lingo.lingoskill.object.Model_Word_010;
import com.lingodeer.data.model.CourseCharacter;
import com.lingodeer.data.model.CourseSentenceModel000;
import com.lingodeer.data.model.CourseWord;
import com.lingodeer.data.model.CourseWordModel010;
import com.lingodeer.data.model.characterstroke.CharacterStrokeKt;
import com.lingodeer.data.model.chinesetone.ChineseToneModelExtensionsKt;
import com.lingodeer.database.CharacterStrokeDatabase;
import com.lingodeer.database.ChineseToneDatabase;
import com.lingodeer.database.model.CharacterStrokeEntity;
import com.lingodeer.database.model.ChineseToneLessonEntity;
import com.lingodeer.database.model.ChineseToneUnitEntity;
import com.lingodeer.database.model.ChineseToneWordEntity;
import com.tbruyelle.rxpermissions3.BuildConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class b extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4152a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f4153b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f4154c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f4155d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(long j11, vy.d dVar, int i11) {
        super(2, dVar);
        this.f4152a = i11;
        this.f4155d = j11;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f4152a) {
            case 0:
                b bVar = new b(this.f4155d, dVar, 0);
                bVar.f4154c = obj;
                return bVar;
            case 1:
                b bVar2 = new b(this.f4155d, dVar, 1);
                bVar2.f4154c = obj;
                return bVar2;
            case 2:
                b bVar3 = new b(this.f4155d, dVar, 2);
                bVar3.f4154c = obj;
                return bVar3;
            case 3:
                b bVar4 = new b(this.f4155d, dVar, 3);
                bVar4.f4154c = obj;
                return bVar4;
            case 4:
                b bVar5 = new b(this.f4155d, dVar, 4);
                bVar5.f4154c = obj;
                return bVar5;
            case 5:
                b bVar6 = new b(this.f4155d, dVar, 5);
                bVar6.f4154c = obj;
                return bVar6;
            case 6:
                b bVar7 = new b(this.f4155d, dVar, 6);
                bVar7.f4154c = obj;
                return bVar7;
            case 7:
                b bVar8 = new b(this.f4155d, dVar, 7);
                bVar8.f4154c = obj;
                return bVar8;
            case 8:
                b bVar9 = new b(this.f4155d, dVar, 8);
                bVar9.f4154c = obj;
                return bVar9;
            case 9:
                b bVar10 = new b(this.f4155d, dVar, 9);
                bVar10.f4154c = obj;
                return bVar10;
            case 10:
                b bVar11 = new b(this.f4155d, dVar, 10);
                bVar11.f4154c = obj;
                return bVar11;
            case 11:
                b bVar12 = new b(this.f4155d, dVar, 11);
                bVar12.f4154c = obj;
                return bVar12;
            case 12:
                b bVar13 = new b(this.f4155d, dVar, 12);
                bVar13.f4154c = obj;
                return bVar13;
            case 13:
                b bVar14 = new b(this.f4155d, dVar, 13);
                bVar14.f4154c = obj;
                return bVar14;
            default:
                b bVar15 = new b(this.f4155d, dVar, 14);
                bVar15.f4154c = obj;
                return bVar15;
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f4152a) {
            case 0:
                return ((b) create((uz.j) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 1:
                return ((b) create((uz.j) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 2:
                return ((b) create((uz.j) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 3:
                return ((b) create((uz.j) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 4:
                return ((b) create((uz.j) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 5:
                return ((b) create((uz.j) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 6:
                return ((b) create((uz.j) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 7:
                return ((b) create((uz.j) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 8:
                return ((b) create((uz.j) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 9:
                return ((b) create((ChineseToneDatabase) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 10:
                return ((b) create((ChineseToneDatabase) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 11:
                return ((b) create((ChineseToneDatabase) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 12:
                return ((b) create((ChineseToneDatabase) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 13:
                return ((b) create((ChineseToneDatabase) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            default:
                return ((b) create((CharacterStrokeDatabase) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
        }
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        Object objM;
        Object objC;
        Object objC2;
        Object objC3;
        Object objC4;
        Object objC5;
        Object objC6;
        int i11 = this.f4152a;
        int i12 = 2;
        int i13 = 0;
        qy.b0 b0Var = qy.b0.f48488a;
        long j11 = this.f4155d;
        int i14 = 1;
        switch (i11) {
            case 0:
                uz.j jVar = (uz.j) this.f4154c;
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                int i15 = this.f4153b;
                if (i15 != 0) {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return b0Var;
                }
                com.bumptech.glide.e.F(obj);
                Boolean boolValueOf = Boolean.valueOf(Model_Sentence_020.checkSimpleObject(j11));
                this.f4154c = null;
                this.f4153b = 1;
                return jVar.emit(boolValueOf, this) == aVar ? aVar : b0Var;
            case 1:
                uz.j jVar2 = (uz.j) this.f4154c;
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                int i16 = this.f4153b;
                if (i16 != 0) {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return b0Var;
                }
                com.bumptech.glide.e.F(obj);
                Boolean boolValueOf2 = Boolean.valueOf(Model_Sentence_030.checkSimpleObject(j11));
                this.f4154c = null;
                this.f4153b = 1;
                return jVar2.emit(boolValueOf2, this) == aVar2 ? aVar2 : b0Var;
            case 2:
                uz.j jVar3 = (uz.j) this.f4154c;
                wy.a aVar3 = wy.a.COROUTINE_SUSPENDED;
                int i17 = this.f4153b;
                if (i17 != 0) {
                    if (i17 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return b0Var;
                }
                com.bumptech.glide.e.F(obj);
                Boolean boolValueOf3 = Boolean.valueOf(Model_Sentence_050.checkSimpleObject(j11));
                this.f4154c = null;
                this.f4153b = 1;
                return jVar3.emit(boolValueOf3, this) == aVar3 ? aVar3 : b0Var;
            case 3:
                uz.j jVar4 = (uz.j) this.f4154c;
                wy.a aVar4 = wy.a.COROUTINE_SUSPENDED;
                int i18 = this.f4153b;
                if (i18 != 0) {
                    if (i18 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return b0Var;
                }
                com.bumptech.glide.e.F(obj);
                Boolean boolValueOf4 = Boolean.valueOf(Model_Sentence_060.checkSimpleObject(j11));
                this.f4154c = null;
                this.f4153b = 1;
                return jVar4.emit(boolValueOf4, this) == aVar4 ? aVar4 : b0Var;
            case 4:
                uz.j jVar5 = (uz.j) this.f4154c;
                wy.a aVar5 = wy.a.COROUTINE_SUSPENDED;
                int i19 = this.f4153b;
                if (i19 != 0) {
                    if (i19 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return b0Var;
                }
                com.bumptech.glide.e.F(obj);
                Boolean boolValueOf5 = Boolean.valueOf(Model_Sentence_080.checkSimpleObject(j11));
                this.f4154c = null;
                this.f4153b = 1;
                return jVar5.emit(boolValueOf5, this) == aVar5 ? aVar5 : b0Var;
            case 5:
                uz.j jVar6 = (uz.j) this.f4154c;
                wy.a aVar6 = wy.a.COROUTINE_SUSPENDED;
                int i21 = this.f4153b;
                if (i21 != 0) {
                    if (i21 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return b0Var;
                }
                com.bumptech.glide.e.F(obj);
                Boolean boolValueOf6 = Boolean.valueOf(Model_Sentence_100.checkSimpleObject(j11));
                this.f4154c = null;
                this.f4153b = 1;
                return jVar6.emit(boolValueOf6, this) == aVar6 ? aVar6 : b0Var;
            case 6:
                uz.j jVar7 = (uz.j) this.f4154c;
                wy.a aVar7 = wy.a.COROUTINE_SUSPENDED;
                int i22 = this.f4153b;
                if (i22 != 0) {
                    if (i22 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return b0Var;
                }
                com.bumptech.glide.e.F(obj);
                Boolean boolValueOf7 = Boolean.valueOf(Model_Word_010.checkSimpleObject(j11));
                this.f4154c = null;
                this.f4153b = 1;
                return jVar7.emit(boolValueOf7, this) == aVar7 ? aVar7 : b0Var;
            case 7:
                uz.j jVar8 = (uz.j) this.f4154c;
                wy.a aVar8 = wy.a.COROUTINE_SUSPENDED;
                int i23 = this.f4153b;
                if (i23 != 0) {
                    if (i23 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return b0Var;
                }
                com.bumptech.glide.e.F(obj);
                LDCharacter lDCharacterLoadFullObject = LDCharacter.loadFullObject(j11);
                if (lDCharacterLoadFullObject == null) {
                    return b0Var;
                }
                CourseCharacter characterItem = ConvertUtilsKt.toCharacterItem(lDCharacterLoadFullObject);
                List<LDCharacter> optionList = lDCharacterLoadFullObject.getOptionList();
                kotlin.jvm.internal.m.e(optionList, "getOptionList(...)");
                ArrayList arrayList = new ArrayList(ry.n.W(optionList, 10));
                for (LDCharacter lDCharacter : optionList) {
                    kotlin.jvm.internal.m.c(lDCharacter);
                    arrayList.add(ConvertUtilsKt.toCharacterItem(lDCharacter));
                }
                CourseCharacter courseCharacterCopy = characterItem.copy((7124 & 1) != 0 ? characterItem.characterId : 0L, (7124 & 2) != 0 ? characterItem.character : null, (7124 & 4) != 0 ? characterItem.charPath : null, (7124 & 8) != 0 ? characterItem.zhuYin : null, (7124 & 16) != 0 ? characterItem.animation : 0, (7124 & 32) != 0 ? characterItem.translation : null, (7124 & 64) != 0 ? characterItem.tipsAnimation : null, (7124 & 128) != 0 ? characterItem.partStrings : null, (7124 & 256) != 0 ? characterItem.polygonStrings : null, (7124 & 512) != 0 ? characterItem.drillJson : null, (7124 & 1024) != 0 ? characterItem.audioUri : null, (7124 & 2048) != 0 ? characterItem.animationUri : null, (7124 & 4096) != 0 ? characterItem.options : arrayList);
                long characterId = courseCharacterCopy.getCharacterId();
                CourseWord wordItem = ConvertUtilsKt.toWordItem(courseCharacterCopy);
                String strValueOf = String.valueOf(courseCharacterCopy.getCharacterId());
                List<CourseCharacter> options = courseCharacterCopy.getOptions();
                ArrayList arrayList2 = new ArrayList(ry.n.W(options, 10));
                Iterator<T> it = options.iterator();
                while (it.hasNext()) {
                    arrayList2.add(ConvertUtilsKt.toWordItem((CourseCharacter) it.next()));
                }
                CourseWordModel010 courseWordModel010 = new CourseWordModel010(this.f4155d, characterId, BuildConfig.VERSION_NAME, strValueOf, wordItem, ns.o.S(arrayList2));
                this.f4154c = null;
                this.f4153b = 1;
                return jVar8.emit(courseWordModel010, this) == aVar8 ? aVar8 : b0Var;
            case 8:
                uz.j jVar9 = (uz.j) this.f4154c;
                wy.a aVar9 = wy.a.COROUTINE_SUSPENDED;
                int i24 = this.f4153b;
                if (i24 == 0) {
                    com.bumptech.glide.e.F(obj);
                    yz.f fVar = rz.o0.f50940a;
                    yz.e eVar = yz.e.f58387a;
                    h hVar = new h(j11, null);
                    this.f4154c = jVar9;
                    this.f4153b = 1;
                    objM = rz.e0.M(eVar, hVar, this);
                    if (objM != aVar9) {
                    }
                    return aVar9;
                }
                if (i24 != 1) {
                    if (i24 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return b0Var;
                }
                com.bumptech.glide.e.F(obj);
                objM = obj;
                CourseSentenceModel000 courseSentenceModel000 = (CourseSentenceModel000) objM;
                if (courseSentenceModel000 == null) {
                    return b0Var;
                }
                this.f4154c = null;
                this.f4153b = 2;
                if (jVar9.emit(courseSentenceModel000, this) != aVar9) {
                    return b0Var;
                }
                return aVar9;
            case 9:
                ChineseToneDatabase chineseToneDatabase = (ChineseToneDatabase) this.f4154c;
                wy.a aVar10 = wy.a.COROUTINE_SUSPENDED;
                int i25 = this.f4153b;
                if (i25 == 0) {
                    com.bumptech.glide.e.F(obj);
                    au.r rVarZ = chineseToneDatabase.z();
                    this.f4154c = null;
                    this.f4153b = 1;
                    objC = cf.x.C(this, rVarZ.f3064a, true, false, new au.o(j11, rVarZ, i14));
                    if (objC == aVar10) {
                        return aVar10;
                    }
                } else {
                    if (i25 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    objC = obj;
                }
                return ChineseToneModelExtensionsKt.asExercise010ExternalModelList((List) objC);
            case 10:
                ChineseToneDatabase chineseToneDatabase2 = (ChineseToneDatabase) this.f4154c;
                wy.a aVar11 = wy.a.COROUTINE_SUSPENDED;
                int i26 = this.f4153b;
                if (i26 == 0) {
                    com.bumptech.glide.e.F(obj);
                    au.s sVarA = chineseToneDatabase2.A();
                    this.f4154c = null;
                    this.f4153b = 1;
                    objC2 = cf.x.C(this, sVarA.f3067a, true, false, new au.o(j11, sVarA, i12));
                    if (objC2 == aVar11) {
                        return aVar11;
                    }
                } else {
                    if (i26 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    objC2 = obj;
                }
                return ChineseToneModelExtensionsKt.asExercise020ExternalModelList((List) objC2);
            case 11:
                ChineseToneDatabase chineseToneDatabase3 = (ChineseToneDatabase) this.f4154c;
                wy.a aVar12 = wy.a.COROUTINE_SUSPENDED;
                int i27 = this.f4153b;
                if (i27 == 0) {
                    com.bumptech.glide.e.F(obj);
                    au.u uVarB = chineseToneDatabase3.B();
                    this.f4154c = null;
                    this.f4153b = 1;
                    objC3 = cf.x.C(this, uVarB.f3074a, true, false, new au.o(j11, uVarB, 3));
                    if (objC3 == aVar12) {
                        return aVar12;
                    }
                } else {
                    if (i27 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    objC3 = obj;
                }
                ChineseToneLessonEntity chineseToneLessonEntity = (ChineseToneLessonEntity) objC3;
                if (chineseToneLessonEntity != null) {
                    return ChineseToneModelExtensionsKt.asExternalModel(chineseToneLessonEntity);
                }
                return null;
            case 12:
                ChineseToneDatabase chineseToneDatabase4 = (ChineseToneDatabase) this.f4154c;
                wy.a aVar13 = wy.a.COROUTINE_SUSPENDED;
                int i28 = this.f4153b;
                if (i28 == 0) {
                    com.bumptech.glide.e.F(obj);
                    au.w wVarD = chineseToneDatabase4.D();
                    this.f4154c = null;
                    this.f4153b = 1;
                    objC4 = cf.x.C(this, wVarD.f3080a, true, false, new au.o(j11, wVarD, 4));
                    if (objC4 == aVar13) {
                        return aVar13;
                    }
                } else {
                    if (i28 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    objC4 = obj;
                }
                ChineseToneUnitEntity chineseToneUnitEntity = (ChineseToneUnitEntity) objC4;
                if (chineseToneUnitEntity != null) {
                    return ChineseToneModelExtensionsKt.asExternalModel(chineseToneUnitEntity);
                }
                return null;
            case 13:
                ChineseToneDatabase chineseToneDatabase5 = (ChineseToneDatabase) this.f4154c;
                wy.a aVar14 = wy.a.COROUTINE_SUSPENDED;
                int i29 = this.f4153b;
                if (i29 == 0) {
                    com.bumptech.glide.e.F(obj);
                    au.x xVarE = chineseToneDatabase5.E();
                    this.f4154c = null;
                    this.f4153b = 1;
                    objC5 = cf.x.C(this, xVarE.f3083a, true, false, new au.o(j11, xVarE, 5));
                    if (objC5 == aVar14) {
                        return aVar14;
                    }
                } else {
                    if (i29 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    objC5 = obj;
                }
                ChineseToneWordEntity chineseToneWordEntity = (ChineseToneWordEntity) objC5;
                if (chineseToneWordEntity != null) {
                    return ChineseToneModelExtensionsKt.asExternalModel(chineseToneWordEntity);
                }
                return null;
            default:
                CharacterStrokeDatabase characterStrokeDatabase = (CharacterStrokeDatabase) this.f4154c;
                wy.a aVar15 = wy.a.COROUTINE_SUSPENDED;
                int i30 = this.f4153b;
                if (i30 == 0) {
                    com.bumptech.glide.e.F(obj);
                    au.p pVarZ = characterStrokeDatabase.z();
                    this.f4154c = null;
                    this.f4153b = 1;
                    objC6 = cf.x.C(this, pVarZ.f3057a, true, false, new au.o(j11, pVarZ, i13));
                    if (objC6 == aVar15) {
                        return aVar15;
                    }
                } else {
                    if (i30 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    objC6 = obj;
                }
                CharacterStrokeEntity characterStrokeEntity = (CharacterStrokeEntity) objC6;
                if (characterStrokeEntity != null) {
                    return CharacterStrokeKt.asExternalModel(characterStrokeEntity);
                }
                return null;
        }
    }
}
