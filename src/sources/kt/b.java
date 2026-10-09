package kt;

import com.lingodeer.data.model.uistate.WordSentenceCharacterSummaryType;
import com.lingodeer.data.model.uistate.WordSentenceCharacterType;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class b {
    public static final WordSentenceCharacterType a(WordSentenceCharacterSummaryType wordSentenceCharacterSummaryType) {
        if (wordSentenceCharacterSummaryType instanceof WordSentenceCharacterSummaryType.CharacterType) {
            return new WordSentenceCharacterType.CharacterType(((WordSentenceCharacterSummaryType.CharacterType) wordSentenceCharacterSummaryType).getCharacter());
        }
        if (wordSentenceCharacterSummaryType instanceof WordSentenceCharacterSummaryType.WordType) {
            return new WordSentenceCharacterType.WordType(((WordSentenceCharacterSummaryType.WordType) wordSentenceCharacterSummaryType).getWord());
        }
        if (wordSentenceCharacterSummaryType instanceof WordSentenceCharacterSummaryType.SentenceType) {
            return new WordSentenceCharacterType.SentenceType(((WordSentenceCharacterSummaryType.SentenceType) wordSentenceCharacterSummaryType).getSentence());
        }
        throw new NoWhenBranchMatchedException();
    }
}
