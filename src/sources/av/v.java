package av;

import com.stkouyu.SkEgnManager;
import com.stkouyu.setting.EngineSetting;
import java.io.File;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class v extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3199a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f3200b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ y f3201c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ SkEgnManager f3202d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v(y yVar, SkEgnManager skEgnManager, vy.d dVar, int i11) {
        super(2, dVar);
        this.f3199a = i11;
        this.f3201c = yVar;
        this.f3202d = skEgnManager;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f3199a) {
            case 0:
                return new v(this.f3201c, this.f3202d, dVar, 0);
            default:
                return new v(this.f3201c, this.f3202d, dVar, 1);
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        rz.b0 b0Var = (rz.b0) obj;
        vy.d dVar = (vy.d) obj2;
        switch (this.f3199a) {
            case 0:
                break;
        }
        return ((v) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        vy.d dVar = null;
        int i11 = 1;
        boolean zBooleanValue = false;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        switch (this.f3199a) {
            case 0:
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                int i12 = this.f3200b;
                if (i12 != 0) {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return obj;
                }
                com.bumptech.glide.e.F(obj);
                y yVar = this.f3201c;
                SkEgnManager skEgnManager = this.f3202d;
                this.f3200b = 1;
                a00.e eVar = y.f3214d;
                rz.m mVar = new rz.m(1, ue.f.x(this));
                mVar.s();
                AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                mVar.u(new t(atomicBoolean, objArr == true ? 1 : 0));
                File file = yVar.f3216a.f3185b;
                if (!q.d(file)) {
                    file = null;
                }
                if (file != null) {
                    EngineSetting defaultNativeInstance = EngineSetting.getDefaultNativeInstance(yVar.f3217b);
                    defaultNativeInstance.setEngineType("native");
                    defaultNativeInstance.setNativeCNResourcePath(file.getAbsolutePath());
                    defaultNativeInstance.setSDKLogEnabled(false);
                    defaultNativeInstance.setOnInitEngineListener(new ob.c(i11, atomicBoolean, mVar));
                    try {
                        skEgnManager.initNativeEngine("17295688480003bc", "f280e1df258112fef6894df59b7b1c38", null, defaultNativeInstance);
                    } catch (CancellationException e8) {
                        throw e8;
                    } catch (Exception unused) {
                        y.f3215e = true;
                        y.a(atomicBoolean, mVar, false);
                    }
                    break;
                } else {
                    y.a(atomicBoolean, mVar, false);
                }
                Object objR = mVar.r();
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                return objR == aVar ? aVar : objR;
            default:
                wy.a aVar3 = wy.a.COROUTINE_SUSPENDED;
                int i13 = this.f3200b;
                if (i13 == 0) {
                    com.bumptech.glide.e.F(obj);
                    int i14 = pz.a.f47220d;
                    long jQ = pz.f.q(45000L, pz.c.MILLISECONDS);
                    v vVar = new v(this.f3201c, this.f3202d, dVar, objArr2 == true ? 1 : 0);
                    this.f3200b = 1;
                    obj = rz.e0.O(rz.e0.J(jQ), vVar, this);
                    if (obj == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                Boolean bool = (Boolean) obj;
                if (bool == null) {
                    a00.e eVar2 = y.f3214d;
                    y.f3215e = true;
                } else {
                    zBooleanValue = bool.booleanValue();
                }
                return Boolean.valueOf(zBooleanValue);
        }
    }
}
