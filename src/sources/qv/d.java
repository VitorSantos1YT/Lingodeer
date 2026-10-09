package qv;

import fr.o0;
import kotlin.jvm.internal.m;
import rz.b0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class d extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f48428a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f48429b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(e eVar, vy.d dVar, int i11) {
        super(2, dVar);
        this.f48428a = i11;
        this.f48429b = eVar;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f48428a) {
            case 0:
                return new d(this.f48429b, dVar, 0);
            default:
                return new d(this.f48429b, dVar, 1);
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        b0 b0Var = (b0) obj;
        vy.d dVar = (vy.d) obj2;
        switch (this.f48428a) {
            case 0:
                break;
        }
        return ((d) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        int i11 = this.f48428a;
        e eVar = this.f48429b;
        switch (i11) {
            case 0:
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                String krSyllableWritingFinishedLessons = ((o0) eVar.f48430a).f27733a.krSyllableWritingFinishedLessons;
                m.e(krSyllableWritingFinishedLessons, "krSyllableWritingFinishedLessons");
                return krSyllableWritingFinishedLessons;
            default:
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                String currentEnteredKOSyllableLessonKey = ((o0) eVar.f48430a).f27733a.currentEnteredKOSyllableLessonKey;
                m.e(currentEnteredKOSyllableLessonKey, "currentEnteredKOSyllableLessonKey");
                return currentEnteredKOSyllableLessonKey;
        }
    }
}
