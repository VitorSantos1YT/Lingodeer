package rt;

import com.lingodeer.data.model.uistate.WordSentenceCharacterType;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class p4 {
    public static final String a(t4 t4Var) {
        WordSentenceCharacterType wordSentenceCharacterType = t4Var.f50424d;
        if (wordSentenceCharacterType instanceof WordSentenceCharacterType.CharacterType) {
            return ((WordSentenceCharacterType.CharacterType) wordSentenceCharacterType).getCharacter().getTranslation();
        }
        if (wordSentenceCharacterType instanceof WordSentenceCharacterType.SentenceType) {
            return ((WordSentenceCharacterType.SentenceType) wordSentenceCharacterType).getSentence().getTranslation();
        }
        if (wordSentenceCharacterType instanceof WordSentenceCharacterType.WordType) {
            return ((WordSentenceCharacterType.WordType) wordSentenceCharacterType).getWord().getTranslation();
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final String b(t4 t4Var) {
        WordSentenceCharacterType wordSentenceCharacterType = t4Var.f50424d;
        if (wordSentenceCharacterType instanceof WordSentenceCharacterType.CharacterType) {
            return ((WordSentenceCharacterType.CharacterType) wordSentenceCharacterType).getCharacter().getCharacter();
        }
        if (wordSentenceCharacterType instanceof WordSentenceCharacterType.SentenceType) {
            return ((WordSentenceCharacterType.SentenceType) wordSentenceCharacterType).getSentence().getSentence();
        }
        if (wordSentenceCharacterType instanceof WordSentenceCharacterType.WordType) {
            return ((WordSentenceCharacterType.WordType) wordSentenceCharacterType).getWord().getWord();
        }
        throw new NoWhenBranchMatchedException();
    }
}
