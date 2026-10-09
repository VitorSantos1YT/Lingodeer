package ys;

import com.lingodeer.data.model.uistate.WordSentenceCharacterSummaryType;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class a1 implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f57906a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l1.b1 f57907b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l1.b1 f57908c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ av.n f57909d;

    public /* synthetic */ a1(av.n nVar, l1.b1 b1Var, l1.b1 b1Var2, int i11) {
        this.f57906a = i11;
        this.f57909d = nVar;
        this.f57907b = b1Var;
        this.f57908c = b1Var2;
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        switch (this.f57906a) {
            case 0:
                WordSentenceCharacterSummaryType it = (WordSentenceCharacterSummaryType) obj;
                kotlin.jvm.internal.m.f(it, "it");
                l1.b1 b1Var = this.f57907b;
                b1Var.setValue(null);
                l1.b1 b1Var2 = this.f57908c;
                b1Var2.setValue(it);
                if (it instanceof WordSentenceCharacterSummaryType.SentenceType) {
                    String string = ((WordSentenceCharacterSummaryType.SentenceType) it).getSentence().getAudioUri().toString();
                    kotlin.jvm.internal.m.e(string, "toString(...)");
                    p1.b(this.f57909d, b1Var2, b1Var, string);
                }
                return qy.b0.f48488a;
            case 1:
                WordSentenceCharacterSummaryType it2 = (WordSentenceCharacterSummaryType) obj;
                kotlin.jvm.internal.m.f(it2, "it");
                l1.b1 b1Var3 = this.f57907b;
                b1Var3.setValue(null);
                l1.b1 b1Var4 = this.f57908c;
                b1Var4.setValue(it2);
                if (it2 instanceof WordSentenceCharacterSummaryType.SentenceType) {
                    p1.b(this.f57909d, b1Var3, b1Var4, ((WordSentenceCharacterSummaryType.SentenceType) it2).getSentence().getRecordPath());
                }
                return qy.b0.f48488a;
            case 2:
                String it3 = (String) obj;
                kotlin.jvm.internal.m.f(it3, "it");
                p1.b(this.f57909d, this.f57907b, this.f57908c, it3);
                break;
            case 3:
                WordSentenceCharacterSummaryType it4 = (WordSentenceCharacterSummaryType) obj;
                kotlin.jvm.internal.m.f(it4, "it");
                l1.b1 b1Var5 = this.f57907b;
                b1Var5.setValue(null);
                l1.b1 b1Var6 = this.f57908c;
                b1Var6.setValue(it4);
                if (it4 instanceof WordSentenceCharacterSummaryType.SentenceType) {
                    String string2 = ((WordSentenceCharacterSummaryType.SentenceType) it4).getSentence().getAudioUri().toString();
                    kotlin.jvm.internal.m.e(string2, "toString(...)");
                    p1.b(this.f57909d, b1Var6, b1Var5, string2);
                }
                return qy.b0.f48488a;
            case 4:
                WordSentenceCharacterSummaryType it5 = (WordSentenceCharacterSummaryType) obj;
                kotlin.jvm.internal.m.f(it5, "it");
                l1.b1 b1Var7 = this.f57907b;
                b1Var7.setValue(null);
                l1.b1 b1Var8 = this.f57908c;
                b1Var8.setValue(it5);
                if (it5 instanceof WordSentenceCharacterSummaryType.SentenceType) {
                    p1.b(this.f57909d, b1Var7, b1Var8, ((WordSentenceCharacterSummaryType.SentenceType) it5).getSentence().getRecordPath());
                }
                return qy.b0.f48488a;
            case 5:
                String it6 = (String) obj;
                kotlin.jvm.internal.m.f(it6, "it");
                p1.b(this.f57909d, this.f57907b, this.f57908c, it6);
                break;
            case 6:
                WordSentenceCharacterSummaryType it7 = (WordSentenceCharacterSummaryType) obj;
                kotlin.jvm.internal.m.f(it7, "it");
                l1.b1 b1Var9 = this.f57907b;
                b1Var9.setValue(null);
                l1.b1 b1Var10 = this.f57908c;
                b1Var10.setValue(it7);
                if (it7 instanceof WordSentenceCharacterSummaryType.SentenceType) {
                    String string3 = ((WordSentenceCharacterSummaryType.SentenceType) it7).getSentence().getAudioUri().toString();
                    kotlin.jvm.internal.m.e(string3, "toString(...)");
                    p1.b(this.f57909d, b1Var10, b1Var9, string3);
                }
                return qy.b0.f48488a;
            case 7:
                WordSentenceCharacterSummaryType it8 = (WordSentenceCharacterSummaryType) obj;
                kotlin.jvm.internal.m.f(it8, "it");
                l1.b1 b1Var11 = this.f57907b;
                b1Var11.setValue(null);
                l1.b1 b1Var12 = this.f57908c;
                b1Var12.setValue(it8);
                if (it8 instanceof WordSentenceCharacterSummaryType.SentenceType) {
                    p1.b(this.f57909d, b1Var11, b1Var12, ((WordSentenceCharacterSummaryType.SentenceType) it8).getSentence().getRecordPath());
                }
                return qy.b0.f48488a;
            default:
                String it9 = (String) obj;
                kotlin.jvm.internal.m.f(it9, "it");
                p1.b(this.f57909d, this.f57907b, this.f57908c, it9);
                break;
        }
        return qy.b0.f48488a;
    }

    public /* synthetic */ a1(l1.b1 b1Var, l1.b1 b1Var2, av.n nVar, int i11) {
        this.f57906a = i11;
        this.f57907b = b1Var;
        this.f57908c = b1Var2;
        this.f57909d = nVar;
    }
}
