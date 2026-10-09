package z4;

import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import com.lingodeer.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class r0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ArrayList f58888d = new ArrayList();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public WeakHashMap f58889a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public SparseArray f58890b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public WeakReference f58891c;

    public final View a(View view) {
        int size;
        WeakHashMap weakHashMap = this.f58889a;
        if (weakHashMap == null || !weakHashMap.containsKey(view)) {
            return null;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View viewA = a(viewGroup.getChildAt(childCount));
                if (viewA != null) {
                    return viewA;
                }
            }
        }
        ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_unhandled_key_listeners);
        if (arrayList == null || (size = arrayList.size() - 1) < 0) {
            return null;
        }
        throw hh.p0.e(size, arrayList);
    }
}
