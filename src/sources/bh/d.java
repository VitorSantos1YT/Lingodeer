package bh;

import com.lingo.lingoskill.object.ConvertUtilsKt;
import com.lingo.lingoskill.object.Lesson;
import com.lingo.lingoskill.object.Phrase;
import com.lingo.lingoskill.object.Unit;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class d extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4181a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f4182b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f4183c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(t tVar, long j11, vy.d dVar, int i11) {
        super(2, dVar);
        this.f4181a = i11;
        this.f4182b = tVar;
        this.f4183c = j11;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f4181a) {
            case 0:
                return new d(this.f4182b, this.f4183c, dVar, 0);
            case 1:
                return new d(this.f4182b, this.f4183c, dVar, 1);
            default:
                return new d(this.f4182b, this.f4183c, dVar, 2);
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        rz.b0 b0Var = (rz.b0) obj;
        vy.d dVar = (vy.d) obj2;
        switch (this.f4181a) {
            case 0:
                break;
            case 1:
                break;
        }
        return ((d) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        int i11 = this.f4181a;
        long j11 = this.f4183c;
        t tVar = this.f4182b;
        switch (i11) {
            case 0:
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                Object objLoad = tVar.f4367c.load(new Long(j11));
                kotlin.jvm.internal.m.e(objLoad, "load(...)");
                return ConvertUtilsKt.toCourseLesson((Lesson) objLoad);
            case 1:
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                Object objLoad2 = tVar.f4370f.load(new Long(j11));
                kotlin.jvm.internal.m.e(objLoad2, "load(...)");
                return ConvertUtilsKt.toWordItem((Phrase) objLoad2);
            default:
                wy.a aVar3 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                Object objLoad3 = tVar.f4366b.load(new Long(j11));
                Unit unit = (Unit) objLoad3;
                if (((fr.o0) tVar.f4372h).f27733a.keyLanguage == 1 && j11 == 150) {
                    unit.setSortIndex(1);
                    unit.setIconResSuffix("uicon_14;ubg_14");
                }
                kotlin.jvm.internal.m.e(objLoad3, "apply(...)");
                return ConvertUtilsKt.toCourseUnit((Unit) objLoad3);
        }
    }
}
