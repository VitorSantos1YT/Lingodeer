package dr;

import au.d1;
import au.f1;
import au.r0;
import au.t0;
import b7.e0;
import cf.x;
import com.google.zxing.aztec.detector.zTGP.gkbGsXmgaxRjJ;
import com.lingo.lingoskill.object.AckFav;
import com.lingo.lingoskill.object.KanjiFav;
import com.lingo.lingoskill.object.LanCustomInfo;
import com.lingo.lingoskill.object.LanguageTransVersion;
import com.lingo.lingoskill.object.ScFavNew;
import com.lingo.lingoskill.object.UnitFinishStatus;
import com.lingodeer.database.model.BookmarkEntity;
import com.lingodeer.database.model.LanguageTransVersionEntity;
import com.lingodeer.database.model.LearnProgressEntity;
import com.lingodeer.database.model.UnitFinishStatusEntity;
import com.tbruyelle.rxpermissions3.BuildConfig;
import d0.y1;
import gb.r;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import oz.q;
import rz.b0;
import rz.o0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class b extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23509a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f23510b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f f23511c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(f fVar, vy.d dVar, int i11) {
        super(2, dVar);
        this.f23509a = i11;
        this.f23511c = fVar;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f23509a) {
            case 0:
                return new b(this.f23511c, dVar, 0);
            case 1:
                return new b(this.f23511c, dVar, 1);
            case 2:
                return new b(this.f23511c, dVar, 2);
            case 3:
                return new b(this.f23511c, dVar, 3);
            case 4:
                return new b(this.f23511c, dVar, 4);
            case 5:
                return new b(this.f23511c, dVar, 5);
            case 6:
                return new b(this.f23511c, dVar, 6);
            case 7:
                return new b(this.f23511c, dVar, 7);
            case 8:
                return new b(this.f23511c, dVar, 8);
            default:
                return new b(this.f23511c, dVar, 9);
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        b0 b0Var = (b0) obj;
        vy.d dVar = (vy.d) obj2;
        switch (this.f23509a) {
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
        }
        return ((b) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        int i11 = this.f23509a;
        int i12 = 2;
        int i13 = 10;
        int i14 = 6;
        vy.d dVar = null;
        int i15 = 0;
        f fVar = this.f23511c;
        qy.b0 b0Var = qy.b0.f48488a;
        int i16 = 1;
        switch (i11) {
            case 0:
                ij.n nVar = fVar.f23535j;
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                int i17 = this.f23510b;
                if (i17 != 0) {
                    if (i17 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return b0Var;
                }
                com.bumptech.glide.e.F(obj);
                List<Object> listLoadAll = nVar.f34447g.loadAll();
                kotlin.jvm.internal.m.e(listLoadAll, "loadAll(...)");
                ArrayList arrayList = new ArrayList(ry.n.W(listLoadAll, 10));
                Iterator<T> it = listLoadAll.iterator();
                while (it.hasNext()) {
                    AckFav ackFav = (AckFav) it.next();
                    String id2 = ackFav.getId();
                    kotlin.jvm.internal.m.e(id2, "getId(...)");
                    List listW0 = q.W0(id2, new String[]{"_"}, 0, i14);
                    ArrayList arrayList2 = new ArrayList(ry.n.W(listW0, i13));
                    Iterator it2 = listW0.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(r.I((String) it2.next()));
                    }
                    ArrayList arrayListC1 = ry.m.c1(arrayList2);
                    arrayListC1.add(1, "ack");
                    arrayList.add(new BookmarkEntity(ry.m.y0(arrayListC1, "_", null, null, null, 62), (String) arrayList2.get(0), ackFav.getIsFav(), "ack", ackFav.getTime(), null, 32, null));
                    i13 = 10;
                    i14 = 6;
                }
                List<Object> listLoadAll2 = nVar.f34450j.loadAll();
                kotlin.jvm.internal.m.e(listLoadAll2, "loadAll(...)");
                ArrayList arrayList3 = new ArrayList(ry.n.W(listLoadAll2, 10));
                Iterator<T> it3 = listLoadAll2.iterator();
                while (it3.hasNext()) {
                    ScFavNew scFavNew = (ScFavNew) it3.next();
                    String id3 = scFavNew.getId();
                    kotlin.jvm.internal.m.e(id3, "getId(...)");
                    List listW1 = q.W0(id3, new String[]{"_"}, i15, 6);
                    ArrayList arrayList4 = new ArrayList(ry.n.W(listW1, 10));
                    Iterator it4 = listW1.iterator();
                    while (it4.hasNext()) {
                        arrayList4.add(r.I((String) it4.next()));
                    }
                    ArrayList arrayListC2 = ry.m.c1(arrayList4);
                    arrayListC2.add(1, "sc");
                    arrayList3.add(new BookmarkEntity(ry.m.y0(arrayListC2, "_", null, null, null, 62), (String) arrayList4.get(0), scFavNew.getIsFav(), "sc", System.currentTimeMillis(), null, 32, null));
                    i15 = 0;
                }
                ArrayList arrayListH0 = ry.m.H0(arrayList, arrayList3);
                List<Object> listLoadAll3 = nVar.f34449i.loadAll();
                kotlin.jvm.internal.m.e(listLoadAll3, "loadAll(...)");
                ArrayList arrayList5 = new ArrayList(ry.n.W(listLoadAll3, 10));
                Iterator<T> it5 = listLoadAll3.iterator();
                while (it5.hasNext()) {
                    KanjiFav kanjiFav = (KanjiFav) it5.next();
                    String id4 = kanjiFav.getId();
                    kotlin.jvm.internal.m.e(id4, "getId(...)");
                    List listW2 = q.W0(id4, new String[]{"_"}, 0, 6);
                    ArrayList arrayList6 = new ArrayList(ry.n.W(listW2, 10));
                    Iterator it6 = listW2.iterator();
                    while (it6.hasNext()) {
                        arrayList6.add(r.I((String) it6.next()));
                    }
                    ArrayList arrayListC3 = ry.m.c1(arrayList6);
                    arrayListC3.add(1, "kanji");
                    String strY0 = ry.m.y0(arrayListC3, "_", null, null, null, 62);
                    String str = (String) arrayList6.get(0);
                    Long time = kanjiFav.getTime();
                    kotlin.jvm.internal.m.e(time, "getTime(...)");
                    arrayList5.add(new BookmarkEntity(strY0, str, kanjiFav.getFav(), "kanji", time.longValue(), null, 32, null));
                }
                ArrayList arrayListH1 = ry.m.H0(arrayListH0, arrayList5);
                au.i iVar = fVar.f23533h;
                this.f23510b = 1;
                return iVar.a(arrayListH1, this) == aVar ? aVar : b0Var;
            case 1:
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                int i18 = this.f23510b;
                if (i18 != 0) {
                    if (i18 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return b0Var;
                }
                com.bumptech.glide.e.F(obj);
                List<Object> listLoadAll4 = fVar.f23535j.f34446f.loadAll();
                ArrayList arrayListR = e0.r("loadAll(...)", listLoadAll4);
                Iterator<T> it7 = listLoadAll4.iterator();
                while (it7.hasNext()) {
                    LanCustomInfo lanCustomInfo = (LanCustomInfo) it7.next();
                    String strK = xt.d.k((int) lanCustomInfo.getLan());
                    String main = lanCustomInfo.getMain();
                    kotlin.jvm.internal.m.e(main, "getMain(...)");
                    String main_tt = lanCustomInfo.getMain_tt();
                    String str2 = main_tt == null ? BuildConfig.VERSION_NAME : main_tt;
                    String lesson_exam = lanCustomInfo.getLesson_exam();
                    String str3 = lesson_exam == null ? BuildConfig.VERSION_NAME : lesson_exam;
                    String lesson_stars = lanCustomInfo.getLesson_stars();
                    String str4 = lesson_stars == null ? BuildConfig.VERSION_NAME : lesson_stars;
                    String audio_lesson = lanCustomInfo.getAudio_lesson();
                    String str5 = audio_lesson == null ? BuildConfig.VERSION_NAME : audio_lesson;
                    int pronun = lanCustomInfo.getPronun();
                    long currentEnteredUnitId = lanCustomInfo.getCurrentEnteredUnitId();
                    int i19 = xt.d.g((int) lanCustomInfo.getLan()) ? 3 : 2;
                    String flashCardFocusUnit = lanCustomInfo.getFlashCardFocusUnit();
                    kotlin.jvm.internal.m.e(flashCardFocusUnit, "getFlashCardFocusUnit(...)");
                    boolean flashCardIsLearnChar = lanCustomInfo.getFlashCardIsLearnChar();
                    boolean flashCardIsLearnWord = lanCustomInfo.getFlashCardIsLearnWord();
                    boolean flashCardIsLearnSent = lanCustomInfo.getFlashCardIsLearnSent();
                    Integer ackEnterPos = lanCustomInfo.getAckEnterPos();
                    kotlin.jvm.internal.m.e(ackEnterPos, "getAckEnterPos(...)");
                    int iIntValue = ackEnterPos.intValue();
                    Long ackUnitId = lanCustomInfo.getAckUnitId();
                    kotlin.jvm.internal.m.e(ackUnitId, "getAckUnitId(...)");
                    arrayListR.add(new LearnProgressEntity(strK, main, str2, str3, str4, str5, pronun, currentEnteredUnitId, 15, i19, flashCardFocusUnit, flashCardIsLearnChar, flashCardIsLearnWord, flashCardIsLearnSent, true, true, true, true, 0, 0, 0, 0, 0, 0, BuildConfig.VERSION_NAME, BuildConfig.VERSION_NAME, BuildConfig.VERSION_NAME, iIntValue, ackUnitId.longValue(), 0L, true));
                }
                t0 t0Var = fVar.f23528c;
                this.f23510b = 1;
                Object objC = x.C(this, t0Var.f3072a, false, true, new au.b(21, t0Var, arrayListR));
                if (objC != wy.a.COROUTINE_SUSPENDED) {
                    objC = b0Var;
                }
                return objC == aVar2 ? aVar2 : b0Var;
            case 2:
                wy.a aVar3 = wy.a.COROUTINE_SUSPENDED;
                int i21 = this.f23510b;
                if (i21 != 0) {
                    if (i21 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return b0Var;
                }
                com.bumptech.glide.e.F(obj);
                List<Object> listLoadAll5 = fVar.f23535j.f34445e.loadAll();
                ArrayList arrayListR2 = e0.r("loadAll(...)", listLoadAll5);
                Iterator<T> it8 = listLoadAll5.iterator();
                while (it8.hasNext()) {
                    LanguageTransVersion languageTransVersion = (LanguageTransVersion) it8.next();
                    String id5 = languageTransVersion.getId();
                    kotlin.jvm.internal.m.e(id5, "getId(...)");
                    int cn2 = languageTransVersion.getCn();
                    int jp2 = languageTransVersion.getJp();
                    int kr2 = languageTransVersion.getKr();
                    int en2 = languageTransVersion.getEn();
                    int es2 = languageTransVersion.getEs();
                    int fr2 = languageTransVersion.getFr();
                    int de = languageTransVersion.getDe();
                    Integer it9 = languageTransVersion.getIt();
                    kotlin.jvm.internal.m.e(it9, "getIt(...)");
                    int iIntValue2 = it9.intValue();
                    int pt2 = languageTransVersion.getPt();
                    int vi2 = languageTransVersion.getVi();
                    int ru2 = languageTransVersion.getRu();
                    int tch = languageTransVersion.getTch();
                    Integer idn = languageTransVersion.getIdn();
                    kotlin.jvm.internal.m.e(idn, "getIdn(...)");
                    int iIntValue3 = idn.intValue();
                    Integer pol = languageTransVersion.getPol();
                    kotlin.jvm.internal.m.e(pol, "getPol(...)");
                    int iIntValue4 = pol.intValue();
                    Integer tur = languageTransVersion.getTur();
                    kotlin.jvm.internal.m.e(tur, "getTur(...)");
                    arrayListR2.add(new LanguageTransVersionEntity(id5, cn2, jp2, kr2, en2, es2, de, fr2, pt2, vi2, ru2, tch, iIntValue3, iIntValue4, iIntValue2, tur.intValue()));
                }
                r0 r0Var = fVar.f23531f;
                this.f23510b = 1;
                Object objC2 = x.C(this, r0Var.f3065a, false, true, new au.b(18, r0Var, arrayListR2));
                if (objC2 != wy.a.COROUTINE_SUSPENDED) {
                    objC2 = b0Var;
                }
                return objC2 == aVar3 ? aVar3 : b0Var;
            case 3:
                wy.a aVar4 = wy.a.COROUTINE_SUSPENDED;
                int i22 = this.f23510b;
                if (i22 != 0) {
                    if (i22 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return b0Var;
                }
                com.bumptech.glide.e.F(obj);
                this.f23510b = 1;
                yz.f fVar2 = o0.f50940a;
                Object objM = rz.e0.M(yz.e.f58387a, new a(fVar, dVar, i15), this);
                if (objM != aVar4) {
                    objM = b0Var;
                }
                return objM == aVar4 ? aVar4 : b0Var;
            case 4:
                wy.a aVar5 = wy.a.COROUTINE_SUSPENDED;
                int i23 = this.f23510b;
                if (i23 != 0) {
                    if (i23 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return b0Var;
                }
                com.bumptech.glide.e.F(obj);
                this.f23510b = 1;
                yz.f fVar3 = o0.f50940a;
                Object objM2 = rz.e0.M(yz.e.f58387a, new b(fVar, dVar, i12), this);
                if (objM2 != aVar5) {
                    objM2 = b0Var;
                }
                return objM2 == aVar5 ? aVar5 : b0Var;
            case 5:
                wy.a aVar6 = wy.a.COROUTINE_SUSPENDED;
                int i24 = this.f23510b;
                if (i24 != 0) {
                    if (i24 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return b0Var;
                }
                com.bumptech.glide.e.F(obj);
                this.f23510b = 1;
                yz.f fVar4 = o0.f50940a;
                Object objM3 = rz.e0.M(yz.e.f58387a, new b(fVar, dVar, i16), this);
                if (objM3 != aVar6) {
                    objM3 = b0Var;
                }
                return objM3 == aVar6 ? aVar6 : b0Var;
            case 6:
                wy.a aVar7 = wy.a.COROUTINE_SUSPENDED;
                int i25 = this.f23510b;
                if (i25 != 0) {
                    if (i25 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return b0Var;
                }
                com.bumptech.glide.e.F(obj);
                this.f23510b = 1;
                yz.f fVar5 = o0.f50940a;
                Object objM4 = rz.e0.M(yz.e.f58387a, new d(fVar, dVar, i16), this);
                if (objM4 != aVar7) {
                    objM4 = b0Var;
                }
                return objM4 == aVar7 ? aVar7 : b0Var;
            case 7:
                wy.a aVar8 = wy.a.COROUTINE_SUSPENDED;
                int i26 = this.f23510b;
                if (i26 != 0) {
                    if (i26 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return b0Var;
                }
                com.bumptech.glide.e.F(obj);
                this.f23510b = 1;
                yz.f fVar6 = o0.f50940a;
                Object objM5 = rz.e0.M(yz.e.f58387a, new b(fVar, dVar, i15), this);
                if (objM5 != aVar8) {
                    objM5 = b0Var;
                }
                return objM5 == aVar8 ? aVar8 : b0Var;
            case 8:
                wy.a aVar9 = wy.a.COROUTINE_SUSPENDED;
                int i27 = this.f23510b;
                if (i27 != 0) {
                    if (i27 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return b0Var;
                }
                com.bumptech.glide.e.F(obj);
                this.f23510b = 1;
                yz.f fVar7 = o0.f50940a;
                Object objM6 = rz.e0.M(yz.e.f58387a, new b(fVar, dVar, 9), this);
                if (objM6 != aVar9) {
                    objM6 = b0Var;
                }
                return objM6 == aVar9 ? aVar9 : b0Var;
            default:
                wy.a aVar10 = wy.a.COROUTINE_SUSPENDED;
                int i28 = this.f23510b;
                if (i28 != 0) {
                    if (i28 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return b0Var;
                }
                com.bumptech.glide.e.F(obj);
                List<Object> listLoadAll6 = fVar.f23535j.f34460u.loadAll();
                kotlin.jvm.internal.m.e(listLoadAll6, "loadAll(...)");
                ArrayList arrayList7 = new ArrayList(ry.n.W(listLoadAll6, 10));
                Iterator<T> it10 = listLoadAll6.iterator();
                while (it10.hasNext()) {
                    UnitFinishStatus unitFinishStatus = (UnitFinishStatus) it10.next();
                    String id6 = unitFinishStatus.getId();
                    kotlin.jvm.internal.m.e(id6, "getId(...)");
                    String strY1 = ry.m.y0(q.W0(oz.x.q0(id6, "-", "_"), new String[]{"_"}, 0, 6), gkbGsXmgaxRjJ.eiBIvD, null, null, new y1(8), 30);
                    String str6 = (String) q.W0(strY1, new String[]{"_"}, 0, 6).get(0);
                    Boolean speakLesson = unitFinishStatus.getSpeakLesson();
                    kotlin.jvm.internal.m.e(speakLesson, "getSpeakLesson(...)");
                    boolean zBooleanValue = speakLesson.booleanValue();
                    Boolean dialogWarmUp = unitFinishStatus.getDialogWarmUp();
                    kotlin.jvm.internal.m.e(dialogWarmUp, "getDialogWarmUp(...)");
                    boolean zBooleanValue2 = dialogWarmUp.booleanValue();
                    Boolean dialogPractice = unitFinishStatus.getDialogPractice();
                    kotlin.jvm.internal.m.e(dialogPractice, "getDialogPractice(...)");
                    boolean zBooleanValue3 = dialogPractice.booleanValue();
                    Boolean storyReading = unitFinishStatus.getStoryReading();
                    kotlin.jvm.internal.m.e(storyReading, "getStoryReading(...)");
                    boolean zBooleanValue4 = storyReading.booleanValue();
                    Boolean storySpeaking = unitFinishStatus.getStorySpeaking();
                    kotlin.jvm.internal.m.e(storySpeaking, "getStorySpeaking(...)");
                    boolean zBooleanValue5 = storySpeaking.booleanValue();
                    Boolean tipsReading = unitFinishStatus.getTipsReading();
                    kotlin.jvm.internal.m.e(tipsReading, "getTipsReading(...)");
                    arrayList7.add(new UnitFinishStatusEntity(strY1, str6, -1, zBooleanValue4, zBooleanValue5, tipsReading.booleanValue(), zBooleanValue2, zBooleanValue3, zBooleanValue, System.currentTimeMillis(), true));
                }
                f1 f1Var = fVar.f23534i;
                this.f23510b = 1;
                Object objC3 = x.C(this, f1Var.f2991a, false, true, new d1(3, f1Var, arrayList7));
                if (objC3 != wy.a.COROUTINE_SUSPENDED) {
                    objC3 = b0Var;
                }
                return objC3 == aVar10 ? aVar10 : b0Var;
        }
    }
}
