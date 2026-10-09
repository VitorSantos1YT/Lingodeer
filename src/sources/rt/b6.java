package rt;

import com.lingodeer.data.model.uistate.WordSentenceCharacterType;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class b6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vt.n0 f49518a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final av.n f49519b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final fv.c f49520c;

    public b6(vt.n0 n0Var, av.n nVar, fv.c cVar) {
        this.f49518a = n0Var;
        this.f49519b = nVar;
        this.f49520c = cVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object a(WordSentenceCharacterType wordSentenceCharacterType, xy.c cVar) {
        a6 a6Var;
        String strY;
        Object objM;
        fv.a aVar;
        fv.a aVar2;
        WordSentenceCharacterType wordSentenceCharacterType2 = wordSentenceCharacterType;
        if (cVar instanceof a6) {
            a6Var = (a6) cVar;
            int i11 = a6Var.f49444e;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                a6Var.f49444e = i11 - Integer.MIN_VALUE;
            } else {
                a6Var = new a6(this, cVar);
            }
        } else {
            a6Var = new a6(this, cVar);
        }
        Object obj = a6Var.f49442c;
        wy.a aVar3 = wy.a.COROUTINE_SUSPENDED;
        int i12 = a6Var.f49444e;
        vy.d dVar = null;
        if (i12 == 0) {
            com.bumptech.glide.e.F(obj);
            if (wordSentenceCharacterType2 instanceof WordSentenceCharacterType.CharacterType) {
                qy.q qVar = fv.b.f28186a;
                strY = fv.b.l0(((WordSentenceCharacterType.CharacterType) wordSentenceCharacterType2).getCharacter().getZhuYin());
            } else if (wordSentenceCharacterType2 instanceof WordSentenceCharacterType.SentenceType) {
                qy.q qVar2 = fv.b.f28186a;
                WordSentenceCharacterType.SentenceType sentenceType = (WordSentenceCharacterType.SentenceType) wordSentenceCharacterType2;
                strY = fv.b.G(sentenceType.getSentence().getSentenceId(), new Long(sentenceType.getSentence().getSentenceId()), null);
            } else {
                if (!(wordSentenceCharacterType2 instanceof WordSentenceCharacterType.WordType)) {
                    throw new NoWhenBranchMatchedException();
                }
                qy.q qVar3 = fv.b.f28186a;
                WordSentenceCharacterType.WordType wordType = (WordSentenceCharacterType.WordType) wordSentenceCharacterType2;
                strY = fv.b.Y(wordType.getWord().getWordId(), new Long(wordType.getWord().getWordId()), null);
            }
            yz.f fVar = rz.o0.f50940a;
            yz.e eVar = yz.e.f58387a;
            aq.a aVar4 = new aq.a(strY, dVar, 10);
            a6Var.f49440a = wordSentenceCharacterType2;
            a6Var.f49441b = strY;
            a6Var.f49444e = 1;
            objM = rz.e0.M(eVar, aVar4, a6Var);
            if (objM == aVar3) {
                return aVar3;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            String str = a6Var.f49441b;
            WordSentenceCharacterType wordSentenceCharacterType3 = a6Var.f49440a;
            com.bumptech.glide.e.F(obj);
            strY = str;
            wordSentenceCharacterType2 = wordSentenceCharacterType3;
            objM = obj;
        }
        if (((Boolean) objM).booleanValue()) {
            this.f49519b.h(strY);
        } else {
            int iX = ((fr.o0) this.f49518a).x();
            xt.a aVarA = xt.b.a();
            boolean z11 = wordSentenceCharacterType2 instanceof WordSentenceCharacterType.CharacterType;
            int i13 = 7;
            fv.c cVar2 = this.f49520c;
            if (z11) {
                qy.q qVar4 = fv.b.f28186a;
                WordSentenceCharacterType.CharacterType characterType = (WordSentenceCharacterType.CharacterType) wordSentenceCharacterType2;
                cVar2.d(new fv.a(1L, fv.b.k0(characterType.getCharacter().getZhuYin()), fv.b.j0(characterType.getCharacter().getZhuYin())), new fj.a(i13, this, strY));
            } else if (wordSentenceCharacterType2 instanceof WordSentenceCharacterType.SentenceType) {
                long sentenceId = ((WordSentenceCharacterType.SentenceType) wordSentenceCharacterType2).getSentence().getSentenceId();
                if (iX != -1) {
                    if (xt.b.e().d(Long.valueOf(sentenceId), null)) {
                        qy.q qVar5 = fv.b.f28186a;
                        aVar2 = new fv.a(fv.g.b(sentenceId, "m"), defpackage.e.m(aVarA.j(), fv.g.r(sentenceId, "m")), fv.g.r(sentenceId, "m"));
                    } else {
                        qy.q qVar6 = fv.b.f28186a;
                        aVar2 = new fv.a(fv.g.b(sentenceId, "f"), defpackage.e.m(aVarA.i(), fv.g.r(sentenceId, "f")), fv.g.r(sentenceId, "f"));
                    }
                    cVar2.d(aVar2, new fj.a(i13, this, strY));
                } else {
                    cVar2.d(new fv.a(2L, fv.b.H(sentenceId), fv.b.F(sentenceId)), new fj.a(i13, this, strY));
                }
            } else {
                if (!(wordSentenceCharacterType2 instanceof WordSentenceCharacterType.WordType)) {
                    throw new NoWhenBranchMatchedException();
                }
                long wordId = ((WordSentenceCharacterType.WordType) wordSentenceCharacterType2).getWord().getWordId();
                if (iX != -1) {
                    if (xt.b.e().d(Long.valueOf(wordId), null)) {
                        qy.q qVar7 = fv.b.f28186a;
                        aVar = new fv.a(fv.g.c(wordId, "m"), defpackage.e.m(aVarA.j(), fv.g.z(wordId, "m")), fv.g.z(wordId, "m"));
                    } else {
                        qy.q qVar8 = fv.b.f28186a;
                        aVar = new fv.a(fv.g.c(wordId, "f"), defpackage.e.m(aVarA.i(), fv.g.z(wordId, "f")), fv.g.z(wordId, "f"));
                    }
                    cVar2.d(aVar, new fj.a(i13, this, strY));
                } else {
                    cVar2.d(new fv.a(2L, fv.b.Z(wordId), fv.b.V(wordId)), new fj.a(i13, this, strY));
                }
            }
        }
        return qy.b0.f48488a;
    }
}
