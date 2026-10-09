package p5;

import android.content.Context;
import android.content.SharedPreferences;
import e6.c1;
import e6.l0;
import fr.f4;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.m;
import qy.q;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l0 f46303a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f4 f46304b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f46305c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f46306d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final q f46307e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Set f46308f;

    public c(Context context, String sharedPreferencesName, Set keysToMigrate, l0 l0Var, f4 f4Var) {
        m.f(context, "context");
        m.f(sharedPreferencesName, "sharedPreferencesName");
        m.f(keysToMigrate, "keysToMigrate");
        c1 c1Var = new c1(2, context, sharedPreferencesName);
        this.f46303a = l0Var;
        this.f46304b = f4Var;
        this.f46305c = context;
        this.f46306d = sharedPreferencesName;
        this.f46307e = com.bumptech.glide.d.v(c1Var);
        this.f46308f = keysToMigrate == d.f46309a ? null : ry.m.e1(keysToMigrate);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x006a  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(Object obj, xy.c cVar) {
        b bVar;
        c cVar2;
        if (cVar instanceof b) {
            bVar = (b) cVar;
            int i11 = bVar.f46302d;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                bVar.f46302d = i11 - Integer.MIN_VALUE;
            } else {
                bVar = new b(this, cVar);
            }
        } else {
            bVar = new b(this, cVar);
        }
        Object objInvoke = bVar.f46300b;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i12 = bVar.f46302d;
        boolean z11 = true;
        if (i12 == 0) {
            com.bumptech.glide.e.F(objInvoke);
            bVar.f46299a = this;
            bVar.f46302d = 1;
            objInvoke = this.f46303a.invoke(obj, bVar);
            if (objInvoke == aVar) {
                return aVar;
            }
            cVar2 = this;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            cVar2 = bVar.f46299a;
            com.bumptech.glide.e.F(objInvoke);
        }
        if (!((Boolean) objInvoke).booleanValue()) {
            return Boolean.FALSE;
        }
        Set set = cVar2.f46308f;
        q qVar = cVar2.f46307e;
        if (set == null) {
            Map<String, ?> all = ((SharedPreferences) qVar.getValue()).getAll();
            m.e(all, "sharedPrefs.all");
            if (all.isEmpty()) {
                z11 = false;
            }
        } else {
            Set set2 = set;
            SharedPreferences sharedPreferences = (SharedPreferences) qVar.getValue();
            if ((set2 instanceof Collection) && set2.isEmpty()) {
                z11 = false;
            } else {
                Iterator it = set2.iterator();
                while (it.hasNext()) {
                    if (sharedPreferences.contains((String) it.next())) {
                    }
                }
                z11 = false;
            }
        }
        return Boolean.valueOf(z11);
    }
}
