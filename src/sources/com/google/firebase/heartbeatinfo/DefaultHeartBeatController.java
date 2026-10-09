package com.google.firebase.heartbeatinfo;

import android.content.Context;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.components.Lazy;
import com.google.firebase.inject.Provider;
import com.tbruyelle.rxpermissions3.BuildConfig;
import java.util.Set;
import java.util.concurrent.Executor;
import ns.o;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class DefaultHeartBeatController implements HeartBeatController, HeartBeatInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Lazy f19672a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f19673b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Provider f19674c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Set f19675d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Executor f19676e;

    public DefaultHeartBeatController(final Context context, final String str, Set set, Provider provider, Executor executor) {
        this.f19672a = new Lazy(new Provider() { // from class: com.google.firebase.heartbeatinfo.c
            @Override // com.google.firebase.inject.Provider
            public final Object get() {
                return new HeartBeatInfoStorage(context, str);
            }
        });
        this.f19675d = set;
        this.f19676e = executor;
        this.f19674c = provider;
        this.f19673b = context;
    }

    @Override // com.google.firebase.heartbeatinfo.HeartBeatController
    public final Task a() {
        if (!o.H(this.f19673b)) {
            return Tasks.forResult(BuildConfig.VERSION_NAME);
        }
        return Tasks.call(this.f19676e, new a(this, 0));
    }

    @Override // com.google.firebase.heartbeatinfo.HeartBeatInfo
    public final synchronized HeartBeatInfo.HeartBeat b() {
        boolean zE;
        long jCurrentTimeMillis = System.currentTimeMillis();
        final HeartBeatInfoStorage heartBeatInfoStorage = (HeartBeatInfoStorage) this.f19672a.get();
        synchronized (heartBeatInfoStorage) {
            zE = heartBeatInfoStorage.e(HeartBeatInfoStorage.f19677b, jCurrentTimeMillis);
        }
        if (!zE) {
            return HeartBeatInfo.HeartBeat.NONE;
        }
        synchronized (heartBeatInfoStorage) {
            final String strB = heartBeatInfoStorage.b(System.currentTimeMillis());
            heartBeatInfoStorage.f19680a.a(new fz.c() { // from class: com.google.firebase.heartbeatinfo.d
                /* JADX WARN: Type inference fix 'apply assigned field type' failed
                java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                 */
                @Override // fz.c
                public final Object invoke(Object obj) {
                    r5.b bVar = (r5.b) obj;
                    r5.d dVar = HeartBeatInfoStorage.f19677b;
                    HeartBeatInfoStorage heartBeatInfoStorage2 = heartBeatInfoStorage;
                    heartBeatInfoStorage2.getClass();
                    r5.d dVar2 = HeartBeatInfoStorage.f19679d;
                    String str = strB;
                    bVar.e(dVar2, str);
                    heartBeatInfoStorage2.d(bVar, str);
                    return null;
                }
            });
        }
        return HeartBeatInfo.HeartBeat.GLOBAL;
    }

    public final void c() {
        if (this.f19675d.size() <= 0) {
            Tasks.forResult(null);
        } else if (!o.H(this.f19673b)) {
            Tasks.forResult(null);
        } else {
            Tasks.call(this.f19676e, new a(this, 1));
        }
    }
}
