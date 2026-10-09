package e6;

import android.appwidget.AppWidgetProviderInfo;
import android.content.Context;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class f1 extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24906a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f24907b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f24908c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f1(Context context, vy.d dVar, int i11) {
        super(2, dVar);
        this.f24906a = i11;
        this.f24908c = context;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f24906a) {
            case 0:
                return new f1(this.f24908c, dVar, 0);
            default:
                return new f1(this.f24908c, dVar, 1);
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        rz.b0 b0Var = (rz.b0) obj;
        vy.d dVar = (vy.d) obj2;
        switch (this.f24906a) {
            case 0:
                break;
        }
        return ((f1) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f24906a) {
            case 0:
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                int i11 = this.f24907b;
                qy.b0 b0Var = qy.b0.f48488a;
                if (i11 == 0) {
                    com.bumptech.glide.e.F(obj);
                    Context context = this.f24908c;
                    o0 o0Var = new o0(context);
                    this.f24907b = 1;
                    String packageName = context.getPackageName();
                    List<AppWidgetProviderInfo> installedProviders = o0Var.f25006b.getInstalledProviders();
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : installedProviders) {
                        if (kotlin.jvm.internal.m.a(((AppWidgetProviderInfo) obj2).provider.getPackageName(), packageName)) {
                            arrayList.add(obj2);
                        }
                    }
                    ArrayList arrayList2 = new ArrayList(ry.n.W(arrayList, 10));
                    int size = arrayList.size();
                    int i12 = 0;
                    while (i12 < size) {
                        Object obj3 = arrayList.get(i12);
                        i12++;
                        arrayList2.add(((AppWidgetProviderInfo) obj3).provider.getClassName());
                    }
                    Object objA = ((n5.f) o0Var.f25007c.getValue()).a(new l0(ry.m.f1(arrayList2), null, 0), this);
                    if (objA != wy.a.COROUTINE_SUSPENDED) {
                        objA = b0Var;
                    }
                    if (objA == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                return b0Var;
            default:
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                int i13 = this.f24907b;
                try {
                    if (i13 == 0) {
                        com.bumptech.glide.e.F(obj);
                        this.f24907b = 1;
                        if (rz.e0.m(5000L, this) == aVar2) {
                            return aVar2;
                        }
                    } else {
                        if (i13 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        com.bumptech.glide.e.F(obj);
                    }
                    er.c.f25748a.c(this.f24908c);
                    break;
                } catch (Exception unused) {
                }
                return qy.b0.f48488a;
        }
    }
}
