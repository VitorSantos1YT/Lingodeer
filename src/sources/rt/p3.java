package rt;

import com.lingodeer.data.model.CourseSentence;
import com.lingodeer.data.model.uistate.WordSentenceCharacterType;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class p3 extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ long f50230a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ rs.e f50231b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p3(rs.e eVar, vy.d dVar) {
        super(2, dVar);
        this.f50231b = eVar;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        p3 p3Var = new p3(this.f50231b, dVar);
        p3Var.f50230a = ((Number) obj).longValue();
        return p3Var;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        return ((p3) create(Long.valueOf(((Number) obj).longValue()), (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        long j11 = this.f50230a;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        com.bumptech.glide.e.F(obj);
        CourseSentence courseSentence = (CourseSentence) this.f50231b.f49402b.get(new Long(j11));
        if (courseSentence != null) {
            return new WordSentenceCharacterType.SentenceType(courseSentence);
        }
        return null;
    }
}
