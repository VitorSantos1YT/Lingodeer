package rt;

import com.lingodeer.data.model.uistate.WordSentenceCharacterType;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class w8 {
    public static final String a(long j11, String languageCode, String bookmarkValue) {
        kotlin.jvm.internal.m.f(languageCode, "languageCode");
        kotlin.jvm.internal.m.f(bookmarkValue, "bookmarkValue");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(languageCode);
        defpackage.e.C(sb2, "_", bookmarkValue, "_");
        sb2.append(j11);
        return sb2.toString();
    }

    public static final Long b(String bookmarkId) {
        kotlin.jvm.internal.m.f(bookmarkId, "bookmarkId");
        return oz.x.u0(oz.q.c1(bookmarkId));
    }

    public static final Long c(WordSentenceCharacterType wordSentenceCharacterType) {
        kotlin.jvm.internal.m.f(wordSentenceCharacterType, "<this>");
        if (wordSentenceCharacterType instanceof WordSentenceCharacterType.CharacterType) {
            return Long.valueOf(((WordSentenceCharacterType.CharacterType) wordSentenceCharacterType).getCharacter().getCharacterId());
        }
        if (wordSentenceCharacterType instanceof WordSentenceCharacterType.WordType) {
            return Long.valueOf(((WordSentenceCharacterType.WordType) wordSentenceCharacterType).getWord().getWordId());
        }
        if (wordSentenceCharacterType instanceof WordSentenceCharacterType.SentenceType) {
            return Long.valueOf(((WordSentenceCharacterType.SentenceType) wordSentenceCharacterType).getSentence().getSentenceId());
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final y8 d(y8 y8Var, Set favoriteIds) {
        int i11;
        kotlin.jvm.internal.m.f(y8Var, "<this>");
        kotlin.jvm.internal.m.f(favoriteIds, "favoriteIds");
        List list = y8Var.f50700j;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (favoriteIds.contains(Long.valueOf(c(((k6) obj).f49973d).longValue()))) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        if (arrayList.isEmpty()) {
            i11 = 0;
        } else {
            int size = arrayList.size();
            i11 = 0;
            int i12 = 0;
            while (i12 < size) {
                Object obj2 = arrayList.get(i12);
                i12++;
                if (((k6) obj2).f49970a && (i11 = i11 + 1) < 0) {
                    ns.o.U();
                    throw null;
                }
            }
        }
        return y8.a(y8Var, arrayList.size(), i11, i11 == arrayList.size(), false, false, arrayList, 455);
    }
}
