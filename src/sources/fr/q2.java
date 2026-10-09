package fr;

import android.content.Context;
import android.content.SharedPreferences;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class q2 extends xy.i implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27795a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f27796b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f27797c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q2(Object obj, vy.d dVar, int i11) {
        super(1, dVar);
        this.f27795a = i11;
        this.f27797c = obj;
    }

    @Override // xy.a
    public final vy.d create(vy.d dVar) {
        switch (this.f27795a) {
            case 0:
                return new q2((i3) this.f27797c, dVar, 0);
            case 1:
                return new q2((p5.c) this.f27797c, dVar, 1);
            default:
                return new q2((jt.t1) this.f27797c, dVar, 2);
        }
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        vy.d dVar = (vy.d) obj;
        switch (this.f27795a) {
            case 0:
                break;
            case 1:
                break;
        }
        return ((q2) create(dVar)).invokeSuspend(qy.b0.f48488a);
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) throws IOException {
        boolean zBooleanValue;
        Context context;
        String str;
        switch (this.f27795a) {
            case 0:
                i3 i3Var = (i3) this.f27797c;
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                int i11 = this.f27796b;
                if (i11 != 0) {
                    if (i11 == 1) {
                        com.bumptech.glide.e.F(obj);
                    } else {
                        if (i11 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        com.bumptech.glide.e.F(obj);
                    }
                    zBooleanValue = ((Boolean) obj).booleanValue();
                    return Boolean.valueOf(zBooleanValue);
                }
                com.bumptech.glide.e.F(obj);
                if (!((Boolean) i3Var.m.f55231b.f53391a.getValue()).booleanValue()) {
                    return Boolean.FALSE;
                }
                this.f27796b = 1;
                obj = i3.a(i3Var, this);
                if (obj == aVar) {
                    return aVar;
                }
                if (((Boolean) obj).booleanValue()) {
                    this.f27796b = 2;
                    obj = i3Var.b(this);
                    if (obj == aVar) {
                        return aVar;
                    }
                    zBooleanValue = ((Boolean) obj).booleanValue();
                } else {
                    zBooleanValue = false;
                }
                return Boolean.valueOf(zBooleanValue);
            case 1:
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                int i12 = this.f27796b;
                qy.b0 b0Var = qy.b0.f48488a;
                if (i12 == 0) {
                    com.bumptech.glide.e.F(obj);
                    p5.c cVar = (p5.c) this.f27797c;
                    this.f27796b = 1;
                    SharedPreferences.Editor editorEdit = ((SharedPreferences) cVar.f46307e.getValue()).edit();
                    Set set = cVar.f46308f;
                    if (set == null) {
                        editorEdit.clear();
                    } else {
                        Iterator it = set.iterator();
                        while (it.hasNext()) {
                            editorEdit.remove((String) it.next());
                        }
                    }
                    if (!editorEdit.commit()) {
                        throw new IOException("Unable to delete migrated keys from SharedPreferences.");
                    }
                    if (((SharedPreferences) cVar.f46307e.getValue()).getAll().isEmpty() && (context = cVar.f46305c) != null && (str = cVar.f46306d) != null) {
                        p5.a.a(context, str);
                    }
                    if (set != null) {
                        set.clear();
                    }
                    if (b0Var == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                return b0Var;
            default:
                wy.a aVar3 = wy.a.COROUTINE_SUSPENDED;
                int i13 = this.f27796b;
                if (i13 != 0) {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return obj;
                }
                com.bumptech.glide.e.F(obj);
                jt.t1 t1Var = (jt.t1) this.f27797c;
                this.f27796b = 1;
                Object objInvoke = t1Var.invoke(this);
                return objInvoke == aVar3 ? aVar3 : objInvoke;
        }
    }
}
