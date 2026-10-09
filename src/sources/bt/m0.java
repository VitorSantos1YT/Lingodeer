package bt;

import com.lingodeer.data.model.CourseSentence;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class m0 implements fz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5691a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ fz.e f5692b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ CourseSentence f5693c;

    public /* synthetic */ m0(fz.e eVar, CourseSentence courseSentence, int i11) {
        this.f5691a = i11;
        this.f5692b = eVar;
        this.f5693c = courseSentence;
    }

    @Override // fz.a
    public final Object invoke() {
        switch (this.f5691a) {
            case 0:
                CourseSentence courseSentence = this.f5693c;
                this.f5692b.invoke(jh.h.q(courseSentence), new ht.h(courseSentence.getVisemedMap()));
                break;
            case 1:
                CourseSentence courseSentence2 = this.f5693c;
                this.f5692b.invoke(jh.h.q(courseSentence2), new ht.h(courseSentence2.getVisemedMap()));
                break;
            case 2:
                CourseSentence courseSentence3 = this.f5693c;
                this.f5692b.invoke(jh.h.u(courseSentence3), new ht.i(courseSentence3.getSlowVisemedMap()));
                break;
            case 3:
                CourseSentence courseSentence4 = this.f5693c;
                this.f5692b.invoke(jh.h.q(courseSentence4), new ht.c(courseSentence4.getVisemedMap()));
                break;
            case 4:
                CourseSentence courseSentence5 = this.f5693c;
                String string = courseSentence5.getAudioUri().toString();
                kotlin.jvm.internal.m.e(string, "toString(...)");
                this.f5692b.invoke(string, new ht.h(courseSentence5.getVisemedMap()));
                break;
            case 5:
                CourseSentence courseSentence6 = this.f5693c;
                String string2 = courseSentence6.getAudioUri().toString();
                kotlin.jvm.internal.m.e(string2, "toString(...)");
                this.f5692b.invoke(string2, new ht.h(courseSentence6.getVisemedMap()));
                break;
            case 6:
                CourseSentence courseSentence7 = this.f5693c;
                this.f5692b.invoke(jh.h.q(courseSentence7), new ht.h(courseSentence7.getVisemedMap()));
                break;
            case 7:
                CourseSentence courseSentence8 = this.f5693c;
                this.f5692b.invoke(jh.h.u(courseSentence8), new ht.i(courseSentence8.getSlowVisemedMap()));
                break;
            case 8:
                CourseSentence courseSentence9 = this.f5693c;
                this.f5692b.invoke(jh.h.q(courseSentence9), new ht.c(courseSentence9.getVisemedMap()));
                break;
            case 9:
                CourseSentence courseSentence10 = this.f5693c;
                this.f5692b.invoke(jh.h.q(courseSentence10), new ht.h(courseSentence10.getVisemedMap()));
                break;
            case 10:
                CourseSentence courseSentence11 = this.f5693c;
                String string3 = courseSentence11.getAudioUri().toString();
                kotlin.jvm.internal.m.e(string3, "toString(...)");
                this.f5692b.invoke(string3, new ht.h(courseSentence11.getVisemedMap()));
                break;
            case 11:
                CourseSentence courseSentence12 = this.f5693c;
                String string4 = courseSentence12.getAudioUri().toString();
                kotlin.jvm.internal.m.e(string4, "toString(...)");
                this.f5692b.invoke(string4, new ht.h(courseSentence12.getVisemedMap()));
                break;
            case 12:
                CourseSentence courseSentence13 = this.f5693c;
                String string5 = courseSentence13.getAudioUri().toString();
                kotlin.jvm.internal.m.e(string5, "toString(...)");
                this.f5692b.invoke(string5, new ht.c(courseSentence13.getVisemedMap()));
                break;
            case 13:
                CourseSentence courseSentence14 = this.f5693c;
                String string6 = courseSentence14.getAudioUri().toString();
                kotlin.jvm.internal.m.e(string6, "toString(...)");
                this.f5692b.invoke(string6, new ht.f(courseSentence14.getVisemedMap()));
                break;
            case 14:
                CourseSentence courseSentence15 = this.f5693c;
                String string7 = courseSentence15.getAudioUri().toString();
                kotlin.jvm.internal.m.e(string7, "toString(...)");
                this.f5692b.invoke(string7, new ht.b(courseSentence15.getVisemedMap(), 0, 1.0f));
                break;
            case 15:
                String string8 = this.f5693c.getAudioUri().toString();
                kotlin.jvm.internal.m.e(string8, "toString(...)");
                this.f5692b.invoke(string8, new ju.d(25));
                break;
            default:
                this.f5692b.invoke(this.f5693c.getRecordPath(), new ju.d(25));
                break;
        }
        return qy.b0.f48488a;
    }
}
