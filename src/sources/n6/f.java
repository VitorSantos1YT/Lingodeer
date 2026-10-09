package n6;

import android.content.Context;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.m;
import qy.b0;
import uz.i;
import uz.x0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f43456a = new f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a00.e f43457b = new a00.e();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final LinkedHashMap f43458c = new LinkedHashMap();

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(Context context, g gVar, String str, xy.c cVar) {
        b bVar;
        a00.e eVar;
        if (cVar instanceof b) {
            bVar = (b) cVar;
            int i11 = bVar.f43441t;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                bVar.f43441t = i11 - Integer.MIN_VALUE;
            } else {
                bVar = new b(this, cVar);
            }
        } else {
            bVar = new b(this, cVar);
        }
        Object obj = bVar.f43439e;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i12 = bVar.f43441t;
        if (i12 == 0) {
            com.bumptech.glide.e.F(obj);
            bVar.f43435a = context;
            bVar.f43436b = gVar;
            bVar.f43437c = str;
            eVar = f43457b;
            bVar.f43438d = eVar;
            bVar.f43441t = 1;
            if (eVar.b(bVar) == aVar) {
                return aVar;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a00.e eVar2 = bVar.f43438d;
            str = bVar.f43437c;
            gVar = bVar.f43436b;
            Context context2 = bVar.f43435a;
            com.bumptech.glide.e.F(obj);
            eVar = eVar2;
            context = context2;
        }
        try {
            f43458c.remove(str);
            gVar.a(context, str).delete();
            return b0.f48488a;
        } finally {
            eVar.a(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(Context context, g gVar, String str, xy.c cVar) throws Throwable {
        c cVar2;
        a00.e eVar;
        a00.a aVar;
        Object obj;
        Map map;
        if (cVar instanceof c) {
            cVar2 = (c) cVar;
            int i11 = cVar2.f43448t;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                cVar2.f43448t = i11 - Integer.MIN_VALUE;
            } else {
                cVar2 = new c(this, cVar);
            }
        } else {
            cVar2 = new c(this, cVar);
        }
        Object obj2 = cVar2.f43446e;
        wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
        int i12 = cVar2.f43448t;
        try {
            if (i12 == 0) {
                com.bumptech.glide.e.F(obj2);
                cVar2.f43442a = context;
                cVar2.f43443b = gVar;
                cVar2.f43444c = str;
                eVar = f43457b;
                cVar2.f43445d = eVar;
                cVar2.f43448t = 1;
                if (eVar.b(cVar2) != aVar2) {
                }
                return aVar2;
            }
            if (i12 != 1) {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                map = (Map) cVar2.f43444c;
                aVar = (a00.a) cVar2.f43443b;
                str = (String) cVar2.f43442a;
                try {
                    com.bumptech.glide.e.F(obj2);
                    obj = (n5.f) obj2;
                    map.put(str, obj);
                    m.d(obj, "null cannot be cast to non-null type androidx.datastore.core.DataStore<T of androidx.glance.state.GlanceState.getDataStore$lambda$2>");
                    n5.f fVar = (n5.f) obj;
                    aVar.a(null);
                    return fVar;
                } catch (Throwable th2) {
                    th = th2;
                    aVar.a(null);
                    throw th;
                }
            }
            a00.e eVar2 = cVar2.f43445d;
            str = (String) cVar2.f43444c;
            gVar = (g) cVar2.f43443b;
            Context context2 = (Context) cVar2.f43442a;
            com.bumptech.glide.e.F(obj2);
            eVar = eVar2;
            context = context2;
            LinkedHashMap linkedHashMap = f43458c;
            obj = linkedHashMap.get(str);
            if (obj == null) {
                cVar2.f43442a = str;
                cVar2.f43443b = eVar;
                cVar2.f43444c = linkedHashMap;
                cVar2.f43445d = null;
                cVar2.f43448t = 2;
                Object objB = gVar.b(context, str);
                if (objB != aVar2) {
                    aVar = eVar;
                    obj2 = objB;
                    map = linkedHashMap;
                    obj = (n5.f) obj2;
                    map.put(str, obj);
                }
                return aVar2;
            }
            aVar = eVar;
            m.d(obj, "null cannot be cast to non-null type androidx.datastore.core.DataStore<T of androidx.glance.state.GlanceState.getDataStore$lambda$2>");
            n5.f fVar2 = (n5.f) obj;
            aVar.a(null);
            return fVar2;
        } catch (Throwable th3) {
            th = th3;
            aVar = eVar;
            aVar.a(null);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(Context context, g gVar, String str, xy.c cVar) throws Throwable {
        d dVar;
        if (cVar instanceof d) {
            dVar = (d) cVar;
            int i11 = dVar.f43451c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                dVar.f43451c = i11 - Integer.MIN_VALUE;
            } else {
                dVar = new d(this, cVar);
            }
        } else {
            dVar = new d(this, cVar);
        }
        Object objB = dVar.f43449a;
        Object obj = wy.a.COROUTINE_SUSPENDED;
        int i12 = dVar.f43451c;
        if (i12 == 0) {
            com.bumptech.glide.e.F(objB);
            dVar.f43451c = 1;
            objB = b(context, gVar, str, dVar);
            if (objB != obj) {
            }
        }
        if (i12 != 1) {
            if (i12 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.e.F(objB);
            return objB;
        }
        com.bumptech.glide.e.F(objB);
        i data = ((n5.f) objB).getData();
        dVar.f43451c = 2;
        Object objU = x0.u(data, dVar);
        return objU == obj ? obj : objU;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object d(Context context, g gVar, String str, fz.e eVar, xy.c cVar) {
        e eVar2;
        fz.e eVar3;
        if (cVar instanceof e) {
            eVar2 = (e) cVar;
            int i11 = eVar2.f43455d;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                eVar2.f43455d = i11 - Integer.MIN_VALUE;
            } else {
                eVar2 = new e(this, cVar);
            }
        } else {
            eVar2 = new e(this, cVar);
        }
        Object objB = eVar2.f43453b;
        Object obj = wy.a.COROUTINE_SUSPENDED;
        int i12 = eVar2.f43455d;
        if (i12 == 0) {
            com.bumptech.glide.e.F(objB);
            eVar2.f43452a = (xy.i) eVar;
            eVar2.f43455d = 1;
            objB = b(context, gVar, str, eVar2);
            if (objB != obj) {
            }
            eVar3 = eVar;
            return obj;
        }
        if (i12 != 1) {
            if (i12 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.e.F(objB);
            return objB;
        }
        fz.e eVar4 = (fz.e) eVar2.f43452a;
        com.bumptech.glide.e.F(objB);
        eVar3 = eVar4;
        eVar3 = eVar;
        eVar2.f43452a = null;
        eVar2.f43455d = 2;
        Object objA = ((n5.f) objB).a(eVar3, eVar2);
        if (objA != obj) {
            return objA;
        }
        eVar3 = eVar;
        return obj;
    }
}
