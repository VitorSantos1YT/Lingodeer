package dt;

import com.lingodeer.data.model.CourseCharacter;
import com.lingodeer.data.model.CourseWord;
import com.lingodeer.data.model.SyllableWriteCharacter;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class m4 implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24017a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ fz.c f24018b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l1.b1 f24019c;

    public /* synthetic */ m4(fz.c cVar, l1.b1 b1Var, int i11) {
        this.f24017a = i11;
        this.f24018b = cVar;
        this.f24019c = b1Var;
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        switch (this.f24017a) {
            case 0:
                CourseWord clickedWord = (CourseWord) obj;
                kotlin.jvm.internal.m.f(clickedWord, "clickedWord");
                String string = clickedWord.getAudioUri().toString();
                kotlin.jvm.internal.m.e(string, "toString(...)");
                if (string.length() > 0) {
                    this.f24019c.setValue(Long.valueOf(clickedWord.getWordId()));
                }
                this.f24018b.invoke(clickedWord);
                break;
            case 1:
                CourseCharacter courseCharacter = (CourseCharacter) obj;
                this.f24019c.setValue(courseCharacter);
                if (courseCharacter != null) {
                    this.f24018b.invoke(courseCharacter);
                }
                break;
            default:
                SyllableWriteCharacter syllableWriteCharacter = (SyllableWriteCharacter) obj;
                this.f24019c.setValue(syllableWriteCharacter);
                if (syllableWriteCharacter != null) {
                    this.f24018b.invoke(syllableWriteCharacter.getAudioUri());
                }
                break;
        }
        return qy.b0.f48488a;
    }

    public m4(l1.b1 b1Var, fz.c cVar) {
        this.f24017a = 2;
        this.f24019c = b1Var;
        this.f24018b = cVar;
    }
}
