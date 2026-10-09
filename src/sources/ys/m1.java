package ys;

import com.lingodeer.data.model.uistate.WordSentenceCharacterSummaryType;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class m1 implements fz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ WordSentenceCharacterSummaryType f58154a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ fz.c f58155b;

    public m1(WordSentenceCharacterSummaryType wordSentenceCharacterSummaryType, fz.c cVar) {
        this.f58154a = wordSentenceCharacterSummaryType;
        this.f58155b = cVar;
    }

    @Override // fz.a
    public final Object invoke() {
        WordSentenceCharacterSummaryType wordSentenceCharacterSummaryType = this.f58154a;
        boolean z11 = wordSentenceCharacterSummaryType instanceof WordSentenceCharacterSummaryType.SentenceType;
        fz.c cVar = this.f58155b;
        if (z11) {
            WordSentenceCharacterSummaryType.SentenceType sentenceType = (WordSentenceCharacterSummaryType.SentenceType) wordSentenceCharacterSummaryType;
            String string = sentenceType.getSentence().getAudioUri().toString();
            kotlin.jvm.internal.m.e(string, "toString(...)");
            cVar.invoke(p1.g(sentenceType.getSentence().getSentenceId(), string, "sentence"));
        } else if (wordSentenceCharacterSummaryType instanceof WordSentenceCharacterSummaryType.WordType) {
            WordSentenceCharacterSummaryType.WordType wordType = (WordSentenceCharacterSummaryType.WordType) wordSentenceCharacterSummaryType;
            String string2 = wordType.getWord().getAudioUri().toString();
            kotlin.jvm.internal.m.e(string2, "toString(...)");
            cVar.invoke(p1.g(wordType.getWord().getWordId(), string2, "word"));
        } else {
            if (!(wordSentenceCharacterSummaryType instanceof WordSentenceCharacterSummaryType.CharacterType)) {
                throw new NoWhenBranchMatchedException();
            }
            String string3 = ((WordSentenceCharacterSummaryType.CharacterType) wordSentenceCharacterSummaryType).getCharacter().getAudioUri().toString();
            kotlin.jvm.internal.m.e(string3, "toString(...)");
            cVar.invoke(string3);
        }
        return qy.b0.f48488a;
    }
}
