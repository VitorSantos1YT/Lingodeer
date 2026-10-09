package av;

import com.stkouyu.SkEgnManager;
import com.stkouyu.setting.RecordSetting;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class x extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3210a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f3211b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ y f3212c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ RecordSetting f3213d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x(y yVar, RecordSetting recordSetting, vy.d dVar, int i11) {
        super(2, dVar);
        this.f3210a = i11;
        this.f3212c = yVar;
        this.f3213d = recordSetting;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f3210a) {
            case 0:
                return new x(this.f3212c, this.f3213d, dVar, 0);
            default:
                return new x(this.f3212c, this.f3213d, dVar, 1);
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        rz.b0 b0Var = (rz.b0) obj;
        vy.d dVar = (vy.d) obj2;
        switch (this.f3210a) {
            case 0:
                break;
        }
        return ((x) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, qy.h] */
    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        int i11 = this.f3210a;
        vy.d dVar = null;
        RecordSetting recordSetting = this.f3213d;
        y yVar = this.f3212c;
        int i12 = 0;
        switch (i11) {
            case 0:
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                int i13 = this.f3211b;
                if (i13 != 0) {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return obj;
                }
                com.bumptech.glide.e.F(obj);
                this.f3211b = 1;
                a00.e eVar = y.f3214d;
                yVar.getClass();
                rz.m mVar = new rz.m(1, ue.f.x(this));
                mVar.s();
                AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                mVar.u(new r(i12, atomicBoolean, yVar));
                try {
                    ((SkEgnManager) yVar.f3218c.getValue()).existsAudioTrans(recordSetting, new s(atomicBoolean, mVar));
                    break;
                } catch (CancellationException e8) {
                    throw e8;
                } catch (Exception unused) {
                    if (atomicBoolean.compareAndSet(false, true)) {
                        mVar.resumeWith(null);
                    }
                }
                Object objR = mVar.r();
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                return objR == aVar ? aVar : objR;
            default:
                wy.a aVar3 = wy.a.COROUTINE_SUSPENDED;
                int i14 = this.f3211b;
                if (i14 != 0) {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return obj;
                }
                com.bumptech.glide.e.F(obj);
                int i15 = pz.a.f47220d;
                long jQ = pz.f.q(60000L, pz.c.MILLISECONDS);
                x xVar = new x(yVar, recordSetting, dVar, i12);
                this.f3211b = 1;
                Object objO = rz.e0.O(rz.e0.J(jQ), xVar, this);
                return objO == aVar3 ? aVar3 : objO;
        }
    }
}
