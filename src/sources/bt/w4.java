package bt;

import com.lingodeer.data.model.CourseWord;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class w4 implements fz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6151a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x1.p f6152b;

    public /* synthetic */ w4(x1.p pVar, int i11) {
        this.f6151a = i11;
        this.f6152b = pVar;
    }

    @Override // fz.a
    public final Object invoke() {
        switch (this.f6151a) {
            case 0:
                x1.p pVar = this.f6152b;
                Integer numValueOf = Integer.valueOf(pVar.size());
                CourseWord courseWord = (CourseWord) ry.m.A0(pVar);
                return new qy.l(numValueOf, courseWord != null ? Integer.valueOf(courseWord.getRandomId()) : null);
            case 1:
                x1.p pVar2 = this.f6152b;
                if (!pVar2.isEmpty()) {
                    pVar2.remove(0);
                }
                return qy.b0.f48488a;
            case 2:
                x1.p pVar3 = this.f6152b;
                if (!pVar3.isEmpty()) {
                    pVar3.remove(0);
                }
                return qy.b0.f48488a;
            default:
                x1.p pVar4 = this.f6152b;
                if (!pVar4.isEmpty()) {
                    pVar4.remove(0);
                }
                return qy.b0.f48488a;
        }
    }
}
