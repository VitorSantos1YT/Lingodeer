package rt;

import com.lingodeer.data.env.Env;
import com.lingodeer.data.model.CourseWord;
import com.lingodeer.data.model.uistate.WordSentenceCharacterType;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class j3 extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f49911a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b4 f49912b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ArrayList f49913c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j3(b4 b4Var, ArrayList arrayList, vy.d dVar) {
        super(2, dVar);
        this.f49912b = b4Var;
        this.f49913c = arrayList;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        return new j3(this.f49912b, this.f49913c, dVar);
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        return ((j3) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        vt.n0 n0Var;
        int i11;
        xt.a aVar;
        Object objValueOf;
        long j11;
        b4 b4Var = this.f49912b;
        vt.n0 n0Var2 = b4Var.f49491d;
        wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
        int i12 = this.f49911a;
        Object obj3 = qy.b0.f48488a;
        if (i12 != 0) {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.e.F(obj);
            return obj3;
        }
        ArrayList arrayListO = ep.a.o(obj);
        int iX = ((fr.o0) n0Var2).x();
        xt.a aVarA = xt.b.a();
        ArrayList arrayList = this.f49913c;
        ArrayList arrayList2 = new ArrayList(ry.n.W(arrayList, 10));
        int size = arrayList.size();
        int i13 = 0;
        while (i13 < size) {
            Object obj4 = arrayList.get(i13);
            int i14 = i13 + 1;
            WordSentenceCharacterType wordSentenceCharacterType = ((n0) obj4).f50110c;
            if (wordSentenceCharacterType instanceof WordSentenceCharacterType.CharacterType) {
                qy.q qVar = fv.b.f28186a;
                objValueOf = Boolean.valueOf(arrayListO.add(new fv.a(1L, fv.b.k0(((WordSentenceCharacterType.CharacterType) wordSentenceCharacterType).getCharacter().getZhuYin()), fv.b.j0(((WordSentenceCharacterType.CharacterType) wordSentenceCharacterType).getCharacter().getZhuYin()))));
                n0Var = n0Var2;
                obj2 = obj3;
                size = size;
                arrayList = arrayList;
                i14 = i14;
                i11 = iX;
                aVar = aVarA;
            } else {
                int i15 = iX;
                obj2 = obj3;
                if (wordSentenceCharacterType instanceof WordSentenceCharacterType.SentenceType) {
                    long sentenceId = ((WordSentenceCharacterType.SentenceType) wordSentenceCharacterType).getSentence().getSentenceId();
                    n0Var = n0Var2;
                    i11 = i15;
                    aVar = aVarA;
                    if (i11 != -1) {
                        qy.q qVar2 = fv.b.f28186a;
                        arrayListO.add(new fv.a(fv.g.b(sentenceId, "m"), defpackage.e.m(aVar.j(), fv.g.r(sentenceId, "m")), fv.g.r(sentenceId, "m")));
                        arrayListO.add(new fv.a(fv.g.b(sentenceId, "f"), defpackage.e.m(aVar.i(), fv.g.r(sentenceId, "f")), fv.g.r(sentenceId, "f")));
                        List<CourseWord> courseWords = ((WordSentenceCharacterType.SentenceType) wordSentenceCharacterType).getSentence().getCourseWords();
                        ArrayList arrayList3 = new ArrayList();
                        for (Object obj5 : courseWords) {
                            if (((CourseWord) obj5).getWordType() != 1) {
                                arrayList3.add(obj5);
                            }
                        }
                        int size2 = arrayList3.size();
                        int i16 = 0;
                        while (i16 < size2) {
                            CourseWord courseWord = (CourseWord) arrayList3.get(i16);
                            qy.q qVar3 = fv.b.f28186a;
                            arrayListO.add(new fv.a(fv.g.c(courseWord.getWordId(), "m"), defpackage.e.m(aVar.j(), fv.g.z(courseWord.getWordId(), "m")), fv.g.z(courseWord.getWordId(), "m")));
                            arrayListO.add(new fv.a(fv.g.c(courseWord.getWordId(), "f"), defpackage.e.m(aVar.i(), fv.g.z(courseWord.getWordId(), "f")), fv.g.z(courseWord.getWordId(), "f")));
                            arrayList3 = arrayList3;
                            i16++;
                            sentenceId = sentenceId;
                        }
                        j11 = sentenceId;
                    } else {
                        j11 = sentenceId;
                        arrayListO.add(new fv.a(2L, fv.b.H(j11), fv.b.F(j11)));
                        List<CourseWord> courseWords2 = ((WordSentenceCharacterType.SentenceType) wordSentenceCharacterType).getSentence().getCourseWords();
                        ArrayList arrayList4 = new ArrayList();
                        for (Object obj6 : courseWords2) {
                            if (((CourseWord) obj6).getWordType() != 1) {
                                arrayList4.add(obj6);
                            }
                        }
                        int size3 = arrayList4.size();
                        int i17 = 0;
                        while (i17 < size3) {
                            Object obj7 = arrayList4.get(i17);
                            i17++;
                            CourseWord courseWord2 = (CourseWord) obj7;
                            qy.q qVar4 = fv.b.f28186a;
                            arrayListO.add(new fv.a(2L, fv.b.Z(courseWord2.getWordId()), fv.b.V(courseWord2.getWordId())));
                        }
                    }
                    Env env = ((fr.o0) n0Var).f27733a;
                    if (env.enableNativeSpeakerVideos && xt.d.g(env.keyLanguage)) {
                        qy.q qVar5 = fv.b.f28186a;
                        arrayListO.add(new fv.a(12L, fv.b.I(j11), fv.g.s(j11)));
                    }
                } else {
                    n0Var = n0Var2;
                    size = size;
                    arrayList = arrayList;
                    i14 = i14;
                    i11 = i15;
                    aVar = aVarA;
                    if (!(wordSentenceCharacterType instanceof WordSentenceCharacterType.WordType)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    long wordId = ((WordSentenceCharacterType.WordType) wordSentenceCharacterType).getWord().getWordId();
                    if (i11 != -1) {
                        qy.q qVar6 = fv.b.f28186a;
                        arrayListO.add(new fv.a(fv.g.c(wordId, "m"), defpackage.e.m(aVar.j(), fv.g.z(wordId, "m")), fv.g.z(wordId, "m")));
                        arrayListO.add(new fv.a(fv.g.c(wordId, "f"), defpackage.e.m(aVar.i(), fv.g.z(wordId, "f")), fv.g.z(wordId, "f")));
                    } else {
                        arrayListO.add(new fv.a(2L, fv.b.Z(wordId), fv.b.V(wordId)));
                    }
                    Env env2 = ((fr.o0) n0Var).f27733a;
                    if (env2.enableNativeSpeakerVideos && xt.d.g(env2.keyLanguage)) {
                        qy.q qVar7 = fv.b.f28186a;
                        arrayListO.add(new fv.a(12L, fv.b.d0(wordId), fv.g.A(wordId)));
                    }
                }
                objValueOf = obj2;
            }
            arrayList2.add(objValueOf);
            iX = i11;
            obj3 = obj2;
            aVarA = aVar;
            n0Var2 = n0Var;
            size = size;
            arrayList = arrayList;
            i13 = i14;
        }
        Object obj8 = obj3;
        ArrayList arrayList5 = new ArrayList();
        int size4 = arrayListO.size();
        int i18 = 0;
        while (i18 < size4) {
            Object obj9 = arrayListO.get(i18);
            i18++;
            if (!new File(((fv.a) obj9).f28184c).exists()) {
                arrayList5.add(obj9);
            }
        }
        fv.c cVar = b4Var.K;
        mt.w2 w2Var = new mt.w2(b4Var, 1);
        this.f49911a = 1;
        return ia.a(cVar, arrayList5, w2Var, this) == aVar2 ? aVar2 : obj8;
    }
}
