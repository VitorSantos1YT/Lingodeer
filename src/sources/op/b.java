package op;

import com.lingo.lingoskill.object.Word;
import java.util.regex.Pattern;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class b extends Word {
    public abstract String getBegin();

    @Override // com.lingo.lingoskill.object.Word
    public int getWordType() {
        String str = getWord().trim();
        m.f(str, "str");
        return Pattern.matches("\\p{Punct}", str) || str.equals("...") || str.equals(" ") || str.equals("～") ? 1 : 2;
    }
}
