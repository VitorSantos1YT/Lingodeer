package com.android.billingclient.api;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.SparseArray;
import androidx.media3.exoplayer.dash.DashMediaSource$Factory;
import com.google.common.base.Supplier;
import g00.d1;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class h implements j00.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f7508a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f7509b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f7510c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f7511d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f7512e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f7513f;

    public h(Context context, r rVar, ob.c cVar) {
        this.f7509b = context;
        this.f7510c = rVar;
        this.f7511d = cVar;
        this.f7512e = new l0(this, true);
        this.f7513f = new l0(this, false);
    }

    public static void k(h hVar, mz.c forClass, j00.c cVar) {
        HashMap map = (HashMap) hVar.f7509b;
        kotlin.jvm.internal.m.f(forClass, "forClass");
        j00.c cVar2 = (j00.c) map.get(forClass);
        if (cVar2 != null && !cVar2.equals(cVar)) {
            throw new j00.d("Contextual serializer or serializer provider for " + forClass + " already registered in this module", 0);
        }
        map.put(forClass, cVar);
        if (d1.i(forClass)) {
            hVar.f7508a = true;
        }
    }

    @Override // j00.e
    public void a(mz.c cVar, c00.a aVar) {
        k(this, cVar, new j00.a(aVar));
    }

    @Override // j00.e
    public void b(mz.c cVar, mz.c cVar2, c00.a aVar) {
        Object next;
        mz.c cVar3;
        String strA = aVar.getDescriptor().a();
        HashMap map = (HashMap) this.f7510c;
        Object map2 = map.get(cVar);
        if (map2 == null) {
            map2 = new HashMap();
            map.put(cVar, map2);
        }
        Map map3 = (Map) map2;
        HashMap map4 = (HashMap) this.f7512e;
        Object map5 = map4.get(cVar);
        if (map5 == null) {
            map5 = new HashMap();
            map4.put(cVar, map5);
        }
        Map map6 = (Map) map5;
        c00.a aVar2 = (c00.a) map3.get(cVar2);
        if (aVar2 != null && !aVar2.equals(aVar)) {
            throw new j00.d("Serializer for " + cVar2 + " already registered in the scope of " + cVar, 0);
        }
        c00.a aVar3 = (c00.a) map6.get(strA);
        if (aVar3 == null || aVar3.equals(aVar)) {
            map3.put(cVar2, aVar);
            map6.put(strA, aVar);
            return;
        }
        Iterator it = ((Iterable) ry.x.T(map3).f44339b).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((Map.Entry) next).getValue() != aVar3);
        Map.Entry entry = (Map.Entry) next;
        if (entry == null || (cVar3 = (mz.c) entry.getKey()) == null) {
            throw new IllegalStateException(("Name " + strA + " is registered in the module but no Kotlin class is associated with it.").toString());
        }
        throw new IllegalArgumentException("Multiple polymorphic serializers in a scope of '" + cVar + "' have the same serial name '" + strA + "': " + aVar + " for '" + cVar2 + "' and " + aVar3 + " for '" + cVar3 + '\'');
    }

    @Override // j00.e
    public void c(mz.c kClass, fz.c cVar) {
        kotlin.jvm.internal.m.f(kClass, "kClass");
        k(this, kClass, new j00.b(cVar));
    }

    @Override // j00.e
    public void d(mz.c cVar, fz.c cVar2) {
        HashMap map = (HashMap) this.f7511d;
        fz.c cVar3 = (fz.c) map.get(cVar);
        if (cVar3 == null || cVar3.equals(cVar2)) {
            map.put(cVar, cVar2);
            return;
        }
        throw new IllegalArgumentException("Default serializers provider for " + cVar + " is already registered: " + cVar3);
    }

    @Override // j00.e
    public void e(mz.c cVar, fz.c cVar2) {
        HashMap map = (HashMap) this.f7513f;
        fz.c cVar3 = (fz.c) map.get(cVar);
        if (cVar3 == null || cVar3.equals(cVar2)) {
            map.put(cVar, cVar2);
            return;
        }
        throw new IllegalArgumentException("Default deserializers provider for " + cVar + " is already registered: " + cVar3);
    }

    public h f() {
        return new h((HashMap) this.f7509b, (HashMap) this.f7510c, (HashMap) this.f7511d, (HashMap) this.f7512e, (HashMap) this.f7513f, this.f7508a);
    }

    public boolean g(Method method, Class cls) {
        StringBuilder sb2 = (StringBuilder) this.f7511d;
        sb2.setLength(0);
        sb2.append(method.getName());
        sb2.append('>');
        sb2.append(cls.getName());
        String string = sb2.toString();
        Class<?> declaringClass = method.getDeclaringClass();
        HashMap map = (HashMap) this.f7510c;
        Class cls2 = (Class) map.put(string, declaringClass);
        if (cls2 == null || cls2.isAssignableFrom(declaringClass)) {
            return true;
        }
        map.put(string, cls2);
        return false;
    }

    public void h(j00.e eVar) {
        for (Map.Entry entry : ((Map) this.f7509b).entrySet()) {
            mz.c cVar = (mz.c) entry.getKey();
            j00.c cVar2 = (j00.c) entry.getValue();
            if (cVar2 instanceof j00.a) {
                kotlin.jvm.internal.m.d(cVar, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
                eVar.a(cVar, ((j00.a) cVar2).f35449a);
            } else {
                if (!(cVar2 instanceof j00.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                eVar.c(cVar, ((j00.b) cVar2).f35450a);
            }
        }
        for (Map.Entry entry2 : ((Map) this.f7510c).entrySet()) {
            mz.c cVar3 = (mz.c) entry2.getKey();
            for (Map.Entry entry3 : ((Map) entry2.getValue()).entrySet()) {
                mz.c cVar4 = (mz.c) entry3.getKey();
                c00.a aVar = (c00.a) entry3.getValue();
                kotlin.jvm.internal.m.d(cVar3, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
                kotlin.jvm.internal.m.d(cVar4, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
                kotlin.jvm.internal.m.d(aVar, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
                eVar.b(cVar3, cVar4, aVar);
            }
        }
        for (Map.Entry entry4 : ((Map) this.f7511d).entrySet()) {
            mz.c cVar5 = (mz.c) entry4.getKey();
            fz.c cVar6 = (fz.c) entry4.getValue();
            kotlin.jvm.internal.m.d(cVar5, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
            kotlin.jvm.internal.m.d(cVar6, "null cannot be cast to non-null type kotlin.Function1<@[ParameterName(name = \"value\")] kotlin.Any, kotlinx.serialization.SerializationStrategy<kotlin.Any>?>");
            kotlin.jvm.internal.c0.d(1, cVar6);
            eVar.d(cVar5, cVar6);
        }
        for (Map.Entry entry5 : ((Map) this.f7513f).entrySet()) {
            mz.c cVar7 = (mz.c) entry5.getKey();
            fz.c cVar8 = (fz.c) entry5.getValue();
            kotlin.jvm.internal.m.d(cVar7, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
            kotlin.jvm.internal.m.d(cVar8, "null cannot be cast to non-null type kotlin.Function1<@[ParameterName(name = \"className\")] kotlin.String?, kotlinx.serialization.DeserializationStrategy<kotlin.Any>?>");
            kotlin.jvm.internal.c0.d(1, cVar8);
            eVar.e(cVar7, cVar8);
        }
    }

    public c00.a i(mz.c cVar, List list) {
        j00.c cVar2 = (j00.c) ((Map) this.f7509b).get(cVar);
        c00.a aVarA = cVar2 != null ? cVar2.a(list) : null;
        if (aVarA instanceof c00.a) {
            return aVarA;
        }
        return null;
    }

    public Supplier j(int i11) {
        Supplier mVar;
        Supplier supplier;
        HashMap map = (HashMap) this.f7510c;
        Supplier supplier2 = (Supplier) map.get(Integer.valueOf(i11));
        if (supplier2 != null) {
            return supplier2;
        }
        final ob.e eVar = (ob.e) this.f7512e;
        eVar.getClass();
        if (i11 != 0) {
            final int i12 = 1;
            if (i11 != 1) {
                final int i13 = 2;
                if (i11 != 2) {
                    final int i14 = 3;
                    if (i11 == 3) {
                        mVar = new f7.m(Class.forName("androidx.media3.exoplayer.rtsp.RtspMediaSource$Factory").asSubclass(p7.a0.class), i13);
                    } else {
                        if (i11 != 4) {
                            throw new IllegalArgumentException(nv.p.j(i11, "Unrecognized contentType: "));
                        }
                        mVar = new Supplier() { // from class: p7.n
                            @Override // com.google.common.base.Supplier
                            public final Object get() {
                                switch (i14) {
                                    case 0:
                                        return o.e((Class) this, eVar);
                                    case 1:
                                        return o.e((Class) this, eVar);
                                    case 2:
                                        return o.e((Class) this, eVar);
                                    default:
                                        return new u0(eVar, (x7.k) ((com.android.billingclient.api.h) this).f7509b);
                                }
                            }
                        };
                    }
                } else {
                    final GenericDeclaration genericDeclarationAsSubclass = Class.forName("androidx.media3.exoplayer.hls.HlsMediaSource$Factory").asSubclass(p7.a0.class);
                    supplier = new Supplier() { // from class: p7.n
                        @Override // com.google.common.base.Supplier
                        public final Object get() {
                            switch (i13) {
                                case 0:
                                    return o.e((Class) genericDeclarationAsSubclass, eVar);
                                case 1:
                                    return o.e((Class) genericDeclarationAsSubclass, eVar);
                                case 2:
                                    return o.e((Class) genericDeclarationAsSubclass, eVar);
                                default:
                                    return new u0(eVar, (x7.k) ((com.android.billingclient.api.h) genericDeclarationAsSubclass).f7509b);
                            }
                        }
                    };
                }
            } else {
                final GenericDeclaration genericDeclarationAsSubclass2 = Class.forName("androidx.media3.exoplayer.smoothstreaming.SsMediaSource$Factory").asSubclass(p7.a0.class);
                supplier = new Supplier() { // from class: p7.n
                    @Override // com.google.common.base.Supplier
                    public final Object get() {
                        switch (i12) {
                            case 0:
                                return o.e((Class) genericDeclarationAsSubclass2, eVar);
                            case 1:
                                return o.e((Class) genericDeclarationAsSubclass2, eVar);
                            case 2:
                                return o.e((Class) genericDeclarationAsSubclass2, eVar);
                            default:
                                return new u0(eVar, (x7.k) ((com.android.billingclient.api.h) genericDeclarationAsSubclass2).f7509b);
                        }
                    }
                };
            }
            mVar = supplier;
        } else {
            final Class clsAsSubclass = DashMediaSource$Factory.class.asSubclass(p7.a0.class);
            final int i15 = 0;
            mVar = new Supplier() { // from class: p7.n
                @Override // com.google.common.base.Supplier
                public final Object get() {
                    switch (i15) {
                        case 0:
                            return o.e((Class) clsAsSubclass, eVar);
                        case 1:
                            return o.e((Class) clsAsSubclass, eVar);
                        case 2:
                            return o.e((Class) clsAsSubclass, eVar);
                        default:
                            return new u0(eVar, (x7.k) ((com.android.billingclient.api.h) clsAsSubclass).f7509b);
                    }
                }
            };
        }
        map.put(Integer.valueOf(i11), mVar);
        return mVar;
    }

    public void l() {
        int i11 = 0;
        for (uv.b bVar : (uv.b[]) this.f7513f) {
            bVar.f53187h = (a5.j) this.f7509b;
            Integer num = (Integer) this.f7510c;
            if (num != null) {
                bVar.f53189j = num.intValue();
            }
            Integer num2 = (Integer) this.f7512e;
            if (num2 != null) {
                bVar.f53191l = num2.intValue();
            }
            Boolean bool = (Boolean) this.f7511d;
            if (bool != null) {
                bVar.f53190k = bool.booleanValue();
            }
            bVar.f53193o = true;
            bVar.a();
            uv.f.f53206a.c(bVar);
        }
        uv.r rVar = uv.q.f53227a;
        a5.j jVar = (a5.j) this.f7509b;
        boolean z11 = this.f7508a;
        if (jVar == null) {
            o00.a.P(rVar, "Tasks with the listener can't start, because the listener provided is null: [null, %B]", Boolean.valueOf(z11));
            return;
        }
        if (!z11) {
            rVar.e().getClass();
            ArrayList arrayListD = uv.f.f53206a.d(jVar.hashCode(), jVar);
            if (arrayListD.isEmpty()) {
                o00.a.P(uv.r.class, "Tasks with the listener can't start, because can't find any task with the provided listener, maybe tasks instance has been started in the past, so they are all are inUsing, if in this case, you can use [BaseDownloadTask#reuse] to reuse theme first then start again: [%s, %B]", jVar, Boolean.FALSE);
                return;
            }
            int size = arrayListD.size();
            while (i11 < size) {
                Object obj = arrayListD.get(i11);
                i11++;
                ((uv.b) obj).f();
            }
            return;
        }
        t7.d dVarE = rVar.e();
        dVarE.getClass();
        uv.w wVar = new uv.w(dVarE);
        int iHashCode = wVar.hashCode();
        ArrayList arrayListD2 = uv.f.f53206a.d(iHashCode, jVar);
        if (arrayListD2.isEmpty()) {
            o00.a.P(uv.r.class, "Tasks with the listener can't start, because can't find any task with the provided listener, maybe tasks instance has been started in the past, so they are all are inUsing, if in this case, you can use [BaseDownloadTask#reuse] to reuse theme first then start again: [%s, %B]", jVar, Boolean.TRUE);
            return;
        }
        int i12 = ew.f.f25949a;
        Locale locale = Locale.ENGLISH;
        HandlerThread handlerThread = new HandlerThread("filedownloader serial thread " + jVar + "-" + iHashCode);
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper(), wVar);
        wVar.f53239a = handler;
        wVar.f53240b = arrayListD2;
        wVar.a(0);
        synchronized (((SparseArray) dVarE.f52059b)) {
            ((SparseArray) dVarE.f52059b).put(iHashCode, handler);
        }
    }

    public h(Map class2ContextualFactory, Map polyBase2Serializers, Map polyBase2DefaultSerializerProvider, Map polyBase2NamedSerializers, Map polyBase2DefaultDeserializerProvider, boolean z11) {
        kotlin.jvm.internal.m.f(class2ContextualFactory, "class2ContextualFactory");
        kotlin.jvm.internal.m.f(polyBase2Serializers, "polyBase2Serializers");
        kotlin.jvm.internal.m.f(polyBase2DefaultSerializerProvider, "polyBase2DefaultSerializerProvider");
        kotlin.jvm.internal.m.f(polyBase2NamedSerializers, "polyBase2NamedSerializers");
        kotlin.jvm.internal.m.f(polyBase2DefaultDeserializerProvider, "polyBase2DefaultDeserializerProvider");
        this.f7509b = class2ContextualFactory;
        this.f7510c = polyBase2Serializers;
        this.f7511d = polyBase2DefaultSerializerProvider;
        this.f7512e = polyBase2NamedSerializers;
        this.f7513f = polyBase2DefaultDeserializerProvider;
        this.f7508a = z11;
    }

    public h(int i11) {
        switch (i11) {
            case 4:
                this.f7509b = new HashMap();
                this.f7510c = new HashMap();
                this.f7511d = new HashMap();
                this.f7512e = new HashMap();
                this.f7513f = new HashMap();
                break;
            default:
                this.f7513f = new ArrayList();
                this.f7509b = new HashMap();
                this.f7510c = new HashMap();
                this.f7511d = new StringBuilder(128);
                break;
        }
    }
}
