package qa;

import android.view.ViewGroup;
import com.lingodeer.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f47691a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ThreadLocal f47692b = new ThreadLocal();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ArrayList f47693c = new ArrayList();

    public static void a(ViewGroup viewGroup, v vVar) {
        ArrayList arrayList = f47693c;
        if (arrayList.contains(viewGroup) || !viewGroup.isLaidOut()) {
            return;
        }
        arrayList.add(viewGroup);
        if (vVar == null) {
            vVar = f47691a;
        }
        v vVarClone = vVar.clone();
        c(viewGroup, vVarClone);
        viewGroup.setTag(R.id.transition_current_scene, null);
        y yVar = new y();
        yVar.f47689a = vVarClone;
        yVar.f47690b = viewGroup;
        viewGroup.addOnAttachStateChangeListener(yVar);
        viewGroup.getViewTreeObserver().addOnPreDrawListener(yVar);
    }

    public static y.e b() {
        y.e eVar;
        ThreadLocal threadLocal = f47692b;
        WeakReference weakReference = (WeakReference) threadLocal.get();
        if (weakReference != null && (eVar = (y.e) weakReference.get()) != null) {
            return eVar;
        }
        y.e eVar2 = new y.e(0);
        threadLocal.set(new WeakReference(eVar2));
        return eVar2;
    }

    public static void c(ViewGroup viewGroup, v vVar) {
        ArrayList arrayList = (ArrayList) b().get(viewGroup);
        if (arrayList != null && arrayList.size() > 0) {
            int size = arrayList.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList.get(i11);
                i11++;
                ((v) obj).C(viewGroup);
            }
        }
        if (vVar != null) {
            vVar.j(viewGroup, true);
        }
        if (viewGroup.getTag(R.id.transition_current_scene) != null) {
            throw new ClassCastException();
        }
    }
}
