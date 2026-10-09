package g;

import android.content.Context;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import ie.o;
import l1.b1;
import rz.b0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class m extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28313a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ boolean f28314b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f28315c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(int i11, Object obj, vy.d dVar, boolean z11) {
        super(2, dVar);
        this.f28313a = i11;
        this.f28314b = z11;
        this.f28315c = obj;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f28313a) {
            case 0:
                return new m((l) this.f28315c, this.f28314b, dVar);
            case 1:
                m mVar = new m((Context) this.f28315c, dVar);
                mVar.f28314b = ((Boolean) obj).booleanValue();
                return mVar;
            case 2:
                return new m(2, (b1) this.f28315c, dVar, this.f28314b);
            default:
                return new m(3, (fz.a) this.f28315c, dVar, this.f28314b);
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f28313a) {
            case 0:
                m mVar = (m) create((b0) obj, (vy.d) obj2);
                qy.b0 b0Var = qy.b0.f48488a;
                mVar.invokeSuspend(b0Var);
                return b0Var;
            case 1:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                m mVar2 = (m) create(bool, (vy.d) obj2);
                qy.b0 b0Var2 = qy.b0.f48488a;
                mVar2.invokeSuspend(b0Var2);
                return b0Var2;
            case 2:
                m mVar3 = (m) create((b0) obj, (vy.d) obj2);
                qy.b0 b0Var3 = qy.b0.f48488a;
                mVar3.invokeSuspend(b0Var3);
                return b0Var3;
            default:
                m mVar4 = (m) create((b0) obj, (vy.d) obj2);
                qy.b0 b0Var4 = qy.b0.f48488a;
                mVar4.invokeSuspend(b0Var4);
                return b0Var4;
        }
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [fz.a, kotlin.jvm.internal.j] */
    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        o oVar;
        int i11 = this.f28313a;
        qy.b0 b0Var = qy.b0.f48488a;
        Object obj2 = this.f28315c;
        switch (i11) {
            case 0:
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                l lVar = (l) obj2;
                boolean z11 = this.f28314b;
                if (!z11 && !lVar.f28312g && lVar.f26172a && (oVar = lVar.f28311f) != null) {
                    oVar.b();
                }
                lVar.f26172a = z11;
                ?? r9 = lVar.f26174c;
                if (r9 != 0) {
                    r9.invoke();
                }
                break;
            case 1:
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                pb.h.a((Context) obj2, RescheduleReceiver.class, this.f28314b);
                break;
            case 2:
                wy.a aVar3 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                if (this.f28314b) {
                    ((b1) obj2).setValue(Boolean.FALSE);
                }
                break;
            default:
                wy.a aVar4 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                if (this.f28314b) {
                    ((fz.a) obj2).invoke();
                }
                break;
        }
        return b0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(Context context, vy.d dVar) {
        super(2, dVar);
        this.f28313a = 1;
        this.f28315c = context;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(l lVar, boolean z11, vy.d dVar) {
        super(2, dVar);
        this.f28313a = 0;
        this.f28315c = lVar;
        this.f28314b = z11;
    }
}
