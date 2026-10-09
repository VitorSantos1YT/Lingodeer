package cb;

import android.app.Activity;
import android.content.Context;
import android.os.IBinder;
import android.view.Window;
import android.view.WindowManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.locks.ReentrantLock;
import ry.r;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class m implements ab.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile m f6821c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ReentrantLock f6822d = new ReentrantLock();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f6823a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList f6824b = new CopyOnWriteArrayList();

    public m(k kVar) {
        this.f6823a = kVar;
        if (kVar != null) {
            kVar.d(new a5.j(this, 5));
        }
    }

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
    @Override // ab.a
    public final void a(Context context, s.a aVar, za.h hVar) {
        Object next;
        WindowManager.LayoutParams attributes;
        iBinder = null;
        IBinder iBinder = null;
        Activity activity = context instanceof Activity ? (Activity) context : null;
        r rVar = r.f50854a;
        if (activity == null) {
            hVar.accept(new za.j(rVar));
            return;
        }
        ReentrantLock reentrantLock = f6822d;
        reentrantLock.lock();
        try {
            a aVar2 = this.f6823a;
            if (aVar2 == null) {
                hVar.accept(new za.j(rVar));
                return;
            }
            CopyOnWriteArrayList copyOnWriteArrayList = this.f6824b;
            boolean z11 = false;
            if (copyOnWriteArrayList == null || !copyOnWriteArrayList.isEmpty()) {
                Iterator it = copyOnWriteArrayList.iterator();
                while (it.hasNext()) {
                    if (((l) it.next()).f6818a.equals(activity)) {
                        z11 = true;
                        break;
                    }
                }
            }
            l lVar = new l(activity, aVar, hVar);
            copyOnWriteArrayList.add(lVar);
            if (z11) {
                Iterator it2 = copyOnWriteArrayList.iterator();
                do {
                    if (!it2.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it2.next();
                } while (!activity.equals(((l) next).f6818a));
                l lVar2 = (l) next;
                za.j jVar = lVar2 != null ? lVar2.f6820c : null;
                if (jVar != null) {
                    lVar.f6820c = jVar;
                    lVar.f6819b.accept(jVar);
                }
            } else {
                k kVar = (k) aVar2;
                Window window = activity.getWindow();
                if (window != null && (attributes = window.getAttributes()) != null) {
                    iBinder = attributes.token;
                }
                if (iBinder != null) {
                    kVar.c(iBinder, activity);
                } else {
                    activity.getWindow().getDecorView().addOnAttachStateChangeListener(new j(kVar, activity));
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // ab.a
    public final void b(za.h hVar) {
        synchronized (f6822d) {
            try {
                if (this.f6823a == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList();
                Iterator it = this.f6824b.iterator();
                kotlin.jvm.internal.m.e(it, "iterator(...)");
                while (it.hasNext()) {
                    l lVar = (l) it.next();
                    if (lVar.f6819b == hVar) {
                        arrayList.add(lVar);
                    }
                }
                this.f6824b.removeAll(arrayList);
                int size = arrayList.size();
                int i11 = 0;
                while (i11 < size) {
                    Object obj = arrayList.get(i11);
                    i11++;
                    Activity activity = ((l) obj).f6818a;
                    CopyOnWriteArrayList copyOnWriteArrayList = this.f6824b;
                    if (copyOnWriteArrayList == null || !copyOnWriteArrayList.isEmpty()) {
                        Iterator it2 = copyOnWriteArrayList.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                if (((l) it2.next()).f6818a.equals(activity)) {
                                }
                            }
                        }
                    }
                    a aVar = this.f6823a;
                    if (aVar != null) {
                        ((k) aVar).b(activity);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
