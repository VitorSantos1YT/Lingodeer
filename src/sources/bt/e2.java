package bt;

import com.lingodeer.data.model.CourseWord;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class e2 implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5343a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ jt.m1 f5344b;

    public /* synthetic */ e2(jt.m1 m1Var, int i11) {
        this.f5343a = i11;
        this.f5344b = m1Var;
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        String str;
        String str2;
        switch (this.f5343a) {
            case 0:
                ht.l it = (ht.l) obj;
                kotlin.jvm.internal.m.f(it, "it");
                this.f5344b.f37056i.setValue(it);
                break;
            case 1:
                ht.l it2 = (ht.l) obj;
                kotlin.jvm.internal.m.f(it2, "it");
                this.f5344b.f37056i.setValue(it2);
                break;
            case 2:
                String it3 = (String) obj;
                kotlin.jvm.internal.m.f(it3, "it");
                this.f5344b.d(it3);
                break;
            case 3:
                ht.l it4 = (ht.l) obj;
                kotlin.jvm.internal.m.f(it4, "it");
                this.f5344b.f37056i.setValue(it4);
                break;
            case 4:
                CourseWord courseWord = (CourseWord) obj;
                if (this.f5344b.A) {
                    String luoMa = courseWord.getLuoMa();
                    if (luoMa.length() <= 0) {
                        luoMa = null;
                    }
                    if (luoMa != null) {
                        return luoMa;
                    }
                    String word = courseWord.getWord();
                    str = word.length() > 0 ? word : null;
                    if (str == null) {
                        return courseWord.getZhuYin();
                    }
                } else {
                    String word2 = courseWord.getWord();
                    str = word2.length() > 0 ? word2 : null;
                    if (str == null) {
                        return courseWord.getZhuYin();
                    }
                }
                return str;
            default:
                CourseWord courseWord2 = (CourseWord) obj;
                if (this.f5344b.A) {
                    String realLuoMa = courseWord2.getRealLuoMa();
                    if (realLuoMa.length() <= 0) {
                        realLuoMa = null;
                    }
                    if (realLuoMa != null) {
                        return realLuoMa;
                    }
                    String luoMa2 = courseWord2.getLuoMa();
                    if (luoMa2.length() <= 0) {
                        luoMa2 = null;
                    }
                    if (luoMa2 != null) {
                        return luoMa2;
                    }
                    String realWord = courseWord2.getRealWord();
                    str2 = realWord.length() > 0 ? realWord : null;
                    if (str2 == null) {
                        return courseWord2.getRealZhuYin();
                    }
                } else {
                    String realWord2 = courseWord2.getRealWord();
                    str2 = realWord2.length() > 0 ? realWord2 : null;
                    if (str2 == null) {
                        return courseWord2.getRealZhuYin();
                    }
                }
                return str2;
        }
        return qy.b0.f48488a;
    }
}
