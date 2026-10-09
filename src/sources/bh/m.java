package bh;

import com.lingodeer.data.model.CourseUnit;
import com.lingodeer.data.model.CourseWord;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class m extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4284a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f4285b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f4286c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f4287d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ t f4288e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f4289f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(t tVar, long j11, vy.d dVar, int i11) {
        super(2, dVar);
        this.f4284a = i11;
        this.f4288e = tVar;
        this.f4289f = j11;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f4284a) {
            case 0:
                m mVar = new m(this.f4288e, this.f4289f, dVar, 0);
                mVar.f4287d = obj;
                return mVar;
            default:
                m mVar2 = new m(this.f4288e, this.f4289f, dVar, 1);
                mVar2.f4287d = obj;
                return mVar2;
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        uz.j jVar = (uz.j) obj;
        vy.d dVar = (vy.d) obj2;
        switch (this.f4284a) {
            case 0:
                break;
        }
        return ((m) create(jVar, dVar)).invokeSuspend(qy.b0.f48488a);
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        int i11 = this.f4284a;
        qy.b0 b0Var = qy.b0.f48488a;
        switch (i11) {
            case 0:
                uz.j jVar = (uz.j) this.f4287d;
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                int i12 = this.f4286c;
                vy.d dVar = null;
                if (i12 == 0) {
                    com.bumptech.glide.e.F(obj);
                    yz.f fVar = rz.o0.f50940a;
                    yz.e eVar = yz.e.f58387a;
                    d dVar2 = new d(this.f4288e, this.f4289f, dVar, 1);
                    this.f4287d = jVar;
                    this.f4286c = 1;
                    obj = rz.e0.M(eVar, dVar2, this);
                    if (obj != aVar) {
                    }
                    return aVar;
                }
                if (i12 != 1) {
                    if (i12 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return b0Var;
                }
                com.bumptech.glide.e.F(obj);
                this.f4287d = null;
                this.f4285b = obj;
                this.f4286c = 2;
                if (jVar.emit((CourseWord) obj, this) != aVar) {
                    return b0Var;
                }
                return aVar;
            default:
                uz.j jVar2 = (uz.j) this.f4287d;
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                int i13 = this.f4286c;
                vy.d dVar3 = null;
                if (i13 == 0) {
                    com.bumptech.glide.e.F(obj);
                    yz.f fVar2 = rz.o0.f50940a;
                    yz.e eVar2 = yz.e.f58387a;
                    d dVar4 = new d(this.f4288e, this.f4289f, dVar3, 2);
                    this.f4287d = jVar2;
                    this.f4286c = 1;
                    obj = rz.e0.M(eVar2, dVar4, this);
                    if (obj != aVar2) {
                    }
                    return aVar2;
                }
                if (i13 != 1) {
                    if (i13 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return b0Var;
                }
                com.bumptech.glide.e.F(obj);
                this.f4287d = null;
                this.f4285b = obj;
                this.f4286c = 2;
                if (jVar2.emit((CourseUnit) obj, this) != aVar2) {
                    return b0Var;
                }
                return aVar2;
        }
    }
}
