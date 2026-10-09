package rt;

import com.lingodeer.data.model.CourseWord;
import com.lingodeer.data.model.uistate.WordSentenceCharacterType;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class o3 extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ long f50181a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ rs.e f50182b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o3(rs.e eVar, vy.d dVar) {
        super(2, dVar);
        this.f50182b = eVar;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        o3 o3Var = new o3(this.f50182b, dVar);
        o3Var.f50181a = ((Number) obj).longValue();
        return o3Var;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        return ((o3) create(Long.valueOf(((Number) obj).longValue()), (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        long j11 = this.f50181a;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        com.bumptech.glide.e.F(obj);
        CourseWord courseWord = (CourseWord) this.f50182b.f49401a.get(new Long(j11));
        if (courseWord != null) {
            return new WordSentenceCharacterType.WordType(courseWord);
        }
        return null;
    }
}
